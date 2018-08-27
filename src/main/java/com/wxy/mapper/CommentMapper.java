package com.wxy.mapper;

import com.wxy.model.Comment;
import com.wxy.model.CommentExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface CommentMapper {
    @SelectProvider(type=CommentSqlProvider.class, method="countByExample")
    int countByExample(CommentExample example);

    @DeleteProvider(type=CommentSqlProvider.class, method="deleteByExample")
    int deleteByExample(CommentExample example);

    @Delete({
        "delete from comment",
        "where mid = #{mid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer mid);

    @Insert({
        "insert into comment (mid, mcontent, ",
        "cid, uid, username)",
        "values (#{mid,jdbcType=INTEGER}, #{mcontent,jdbcType=VARCHAR}, ",
        "#{cid,jdbcType=INTEGER}, #{uid,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR})"
    })
    int insert(Comment record);

    @InsertProvider(type=CommentSqlProvider.class, method="insertSelective")
    int insertSelective(Comment record);

    @SelectProvider(type=CommentSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="mid", property="mid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="mcontent", property="mcontent", jdbcType=JdbcType.VARCHAR),
        @Result(column="cid", property="cid", jdbcType=JdbcType.INTEGER),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR)
    })
    List<Comment> selectByExample(CommentExample example);

    @Select({
        "select",
        "mid, mcontent, cid, uid, username",
        "from comment",
        "where mid = #{mid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="mid", property="mid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="mcontent", property="mcontent", jdbcType=JdbcType.VARCHAR),
        @Result(column="cid", property="cid", jdbcType=JdbcType.INTEGER),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR)
    })
    Comment selectByPrimaryKey(Integer mid);

    @UpdateProvider(type=CommentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    @UpdateProvider(type=CommentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    @UpdateProvider(type=CommentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Comment record);

    @Update({
        "update comment",
        "set mcontent = #{mcontent,jdbcType=VARCHAR},",
          "cid = #{cid,jdbcType=INTEGER},",
          "uid = #{uid,jdbcType=INTEGER},",
          "username = #{username,jdbcType=VARCHAR}",
        "where mid = #{mid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Comment record);
}
package com.wxy.mapper;

import com.wxy.model.Peopleintension;
import com.wxy.model.PeopleintensionExample;
import com.wxy.model.PeopleintensionExample.Criteria;
import com.wxy.model.PeopleintensionExample.Criterion;

import java.util.List;
import java.util.Map;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class PeopleintensionSqlProvider {

    public String countByExample(PeopleintensionExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("peopleintension");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(PeopleintensionExample example) {
        BEGIN();
        DELETE_FROM("peopleintension");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Peopleintension record) {
        BEGIN();
        INSERT_INTO("peopleintension");
        
        if (record.getPid() != null) {
            VALUES("pid", "#{pid,jdbcType=INTEGER}");
        }
        
        if (record.getXueliweight() != null) {
            VALUES("xueliWeight", "#{xueliweight,jdbcType=INTEGER}");
        }
        
        if (record.getWorkexpweight() != null) {
            VALUES("workexpWeight", "#{workexpweight,jdbcType=INTEGER}");
        }
        
        if (record.getAid() != null) {
            VALUES("aid", "#{aid,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(PeopleintensionExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("pid");
        } else {
            SELECT("pid");
        }
        SELECT("xueliWeight");
        SELECT("workexpWeight");
        SELECT("aid");
        SELECT("username");
        FROM("peopleintension");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Peopleintension record = (Peopleintension) parameter.get("record");
        PeopleintensionExample example = (PeopleintensionExample) parameter.get("example");
        
        BEGIN();
        UPDATE("peopleintension");
        
        if (record.getPid() != null) {
            SET("pid = #{record.pid,jdbcType=INTEGER}");
        }
        
        if (record.getXueliweight() != null) {
            SET("xueliWeight = #{record.xueliweight,jdbcType=INTEGER}");
        }
        
        if (record.getWorkexpweight() != null) {
            SET("workexpWeight = #{record.workexpweight,jdbcType=INTEGER}");
        }
        
        if (record.getAid() != null) {
            SET("aid = #{record.aid,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            SET("username = #{record.username,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("peopleintension");
        
        SET("pid = #{record.pid,jdbcType=INTEGER}");
        SET("xueliWeight = #{record.xueliweight,jdbcType=INTEGER}");
        SET("workexpWeight = #{record.workexpweight,jdbcType=INTEGER}");
        SET("aid = #{record.aid,jdbcType=INTEGER}");
        SET("username = #{record.username,jdbcType=VARCHAR}");
        
        PeopleintensionExample example = (PeopleintensionExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Peopleintension record) {
        BEGIN();
        UPDATE("peopleintension");
        
        if (record.getXueliweight() != null) {
            SET("xueliWeight = #{xueliweight,jdbcType=INTEGER}");
        }
        
        if (record.getWorkexpweight() != null) {
            SET("workexpWeight = #{workexpweight,jdbcType=INTEGER}");
        }
        
        if (record.getAid() != null) {
            SET("aid = #{aid,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        WHERE("pid = #{pid,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(PeopleintensionExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}
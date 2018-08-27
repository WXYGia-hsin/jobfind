package com.wxy.service;

import com.wxy.mapper.JobintensionMapper;
import com.wxy.mapper.PlacejobintensionMapper;
import com.wxy.mapper.TypeJobintensionMapper;
import com.wxy.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JobFindServiceImp {
    @Autowired
    JobintensionMapper jobintensionMapper;
    @Autowired
    PlacejobintensionMapper placejobintensionMapper;
    @Autowired
    TypeJobintensionMapper typeJobintensionMapper;
    public Jobintension updateJobIntension(Jobintension jobintension){
        if(jobintension.getJid()==null){
            jobintensionMapper.insert(jobintension);
        }else{
            jobintensionMapper.updateByPrimaryKey(jobintension);
        }
        return jobintension;
    }
    public Jobintension findJobIntensionByAid(int aid){
       return jobintensionMapper.selectByAid(aid);//此处uid建表时写错成了aid;
    }
    public void addPlaceJobIntension(Placejobintension placejobintension){
            placejobintensionMapper.insert(placejobintension);
    }
    public List<Placejobintension> findPlaceJobIntensionByJid(int jid){
        PlacejobintensionExample placejobintensionExample=new PlacejobintensionExample();
        placejobintensionExample.createCriteria().andJidEqualTo(jid);
        return placejobintensionMapper.selectByExample(placejobintensionExample);
    }
    public void deletePlaceJobIntensionByJid(int jid){
        PlacejobintensionExample placejobintensionExample=new PlacejobintensionExample();
        placejobintensionExample.createCriteria().andJidEqualTo(jid);
         placejobintensionMapper.deleteByExample(placejobintensionExample);
    }

    public void addTypeJobIntension(TypeJobintension typeJobintension){
        typeJobintensionMapper.insert(typeJobintension);
    }
    public List<TypeJobintension> findTypeJobIntensionByJid(int jid){
        TypeJobintensionExample typeJobintensionExample=new TypeJobintensionExample();
        typeJobintensionExample.createCriteria().andJidEqualTo(jid);
        return typeJobintensionMapper.selectByExample(typeJobintensionExample);
    }
    public void deleteTypeJobIntensionByJid(int jid){
        TypeJobintensionExample typeJobintensionExample=new TypeJobintensionExample();
        typeJobintensionExample.createCriteria().andJidEqualTo(jid);
       typeJobintensionMapper.deleteByExample(typeJobintensionExample);
    }
}

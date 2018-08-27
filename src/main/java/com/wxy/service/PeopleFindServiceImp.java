package com.wxy.service;

import com.wxy.mapper.PeopleintensionMapper;
import com.wxy.mapper.WorkexppeopleintensionMapper;
import com.wxy.mapper.XuelipeopleintensionMapper;
import com.wxy.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PeopleFindServiceImp {
    @Autowired
    PeopleintensionMapper peopleintensionMapper;
    @Autowired
    WorkexppeopleintensionMapper workexppeopleintensionMapper;
    @Autowired
    XuelipeopleintensionMapper xuelipeopleintensionMapper;

    public Peopleintension updatePeopleIntension(Peopleintension peopleintension){
        if(peopleintension.getPid()==null){
            peopleintensionMapper.insert(peopleintension);
        }else{
            peopleintensionMapper.updateByPrimaryKey(peopleintension);
        }
        return peopleintension;
    }
    public Peopleintension findPeopleIntensionByAid(int uid){
        return peopleintensionMapper.selectByAid(uid);
    }
    public void addXueliPeopleIntension(Xuelipeopleintension xuelipeopleintension){
        xuelipeopleintensionMapper.insert(xuelipeopleintension);
    }
    public List<Xuelipeopleintension> findXuelipeopleIntensionByPid(int pid){
        XuelipeopleintensionExample xuelipeopleintensionExample=new XuelipeopleintensionExample();
        xuelipeopleintensionExample.createCriteria().andPidEqualTo(pid);
        return xuelipeopleintensionMapper.selectByExample(xuelipeopleintensionExample);
    }
    public void deleteXueliPeopleIntensionByPid(int pid){
        XuelipeopleintensionExample xuelipeopleintensionExample=new XuelipeopleintensionExample();
        xuelipeopleintensionExample.createCriteria().andPidEqualTo(pid);
        xuelipeopleintensionMapper.deleteByExample(xuelipeopleintensionExample);
    }

    public void addWorkexpPeopleIntension(Workexppeopleintension workexppeopleintension){
        workexppeopleintensionMapper.insert(workexppeopleintension);
    }
    public List<Workexppeopleintension> findWorkexppeopleIntensionByPid(int pid){
      WorkexppeopleintensionExample workexppeopleintensionExample=new WorkexppeopleintensionExample();
        workexppeopleintensionExample.createCriteria().andPidEqualTo(pid);
        return workexppeopleintensionMapper.selectByExample(workexppeopleintensionExample);
    }
    public void deleteWorkexpPeopleIntensionByPid(int pid){
        WorkexppeopleintensionExample workexppeopleintensionExample=new WorkexppeopleintensionExample();
        workexppeopleintensionExample.createCriteria().andPidEqualTo(pid);
        workexppeopleintensionMapper.deleteByExample(workexppeopleintensionExample);
    }
}

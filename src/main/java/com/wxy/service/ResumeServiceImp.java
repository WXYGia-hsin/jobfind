package com.wxy.service;

import com.wxy.mapper.ResumeMapper;
import com.wxy.model.Resume;
import com.wxy.model.ResumeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ResumeServiceImp {
    @Autowired
    ResumeMapper resumeMapper;
    public Resume updateResume(Resume resume){
        if(resume.getRid()==null){
            resumeMapper.insert(resume);
        }else{
            resumeMapper.updateByPrimaryKey(resume);
        }
        return resume;
    }
    public Resume findResumeByUid(int uid){
       return resumeMapper.selectByUid(uid);
    }
    public Resume findResumeByRid(int rid){
        return resumeMapper.selectByPrimaryKey(rid);
    }
    public List<Resume> getAllResumes(){
        ResumeExample resumeExample=new ResumeExample();
        resumeExample.createCriteria().andRidIsNotNull();
        return resumeMapper.selectByExample(resumeExample);
    }
}

package com.wxy.service;


import com.wxy.mapper.CompanyMapper;
import com.wxy.model.Company;
import com.wxy.model.CompanyExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@SuppressWarnings("ALL")
@Service
public class CompanyServiceImp {
    @Autowired
    CompanyMapper companyMapper;
    public Company updateCompany(Company company){
        if(company.getCid()==null){
            companyMapper.insert(company);
        }else{
            companyMapper.updateByPrimaryKey(company);
        }
        return company;
    }
    public Company findCompanyByCid(int cid){
        return companyMapper.selectByCid(cid);
    }
    public Company findCompanyByUid(int uid){
        return companyMapper.selectByUid(uid);
    }
    public List<Company> getAllCompanys(){
        CompanyExample companyExample=new CompanyExample();
        companyExample.createCriteria().andCidIsNotNull();
        return companyMapper.selectByExample(companyExample);
    }
}

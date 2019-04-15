package com.service.impl;

import com.mapper.SubjectMapper;
import com.model.Subject;
import com.model.SubjectExample;
import com.service.SubjectServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectServcie {
    @Autowired
    private SubjectMapper subjectMapper;

    //查询科目列表
    @Override
    public List<Subject> findAllSubject() {
        SubjectExample subjectExample = new SubjectExample();
        subjectExample.createCriteria();
        return subjectMapper.selectByExample(subjectExample);
    }
}

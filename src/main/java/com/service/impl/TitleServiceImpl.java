package com.service.impl;

import com.mapper.TitleMapper;
import com.model.Title;
import com.model.TitleExample;
import com.service.TitleService;
import com.vo.TitleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitleServiceImpl implements TitleService {
    @Autowired
    private TitleMapper titleMapper;

    //查询所有单选题
    @Override
    public List<TitleVo> findAllTitle(String titleType) {
        return titleMapper.findTitleSubject(titleType);
    }

    //根据问题模糊查询单选题
    @Override
    public List<Title> findByQuestion(String question) {
        TitleExample titleExample=new TitleExample();
        titleExample.createCriteria().andQuestionLike("question");
        return titleMapper.selectByExample(titleExample);
    }

    @Override
    public Title findById(int titleId) {
        return titleMapper.selectByPrimaryKey(titleId);
    }

    //插入题
    @Override
    public boolean insertTitle(Title title) {
        int result=titleMapper.insertSelective(title);
        if (result>0){
            return true;
        }else {
            return false;
        }
    }

    //根据id删除题
    @Override
    public boolean deleteTitle(int titleId) {
        int result=titleMapper.deleteByPrimaryKey(titleId);
        if (result>0){
            return true;
        }else {
            return false;
        }
    }

    //更新单选题
    @Override
    public boolean updateTitle(Title title) {
        int result=titleMapper.updateByPrimaryKeySelective(title);
        if (result>0){
            return true;
        }else {
            return false;
        }
    }
}

package com.service;

import com.model.Title;
import com.vo.TitleVo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SingleService {
    public List<TitleVo> findAllSingle(String titleType);
    public List<Title> findSingleByQuestion(String question);
    public Title findById(int titleId);
    public boolean insertSingle(Title title);
    public boolean deleteSingle(int titleId);
    public boolean updateSingle(Title title);
}

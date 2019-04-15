package com.service;

import com.model.Title;
import com.vo.TitleVo;

import java.util.List;

public interface TitleService {
    public List<TitleVo> findAllTitle(String titleType);
    public List<Title> findByQuestion(String question);
    public Title findById(int titleId);
    public boolean insertTitle(Title title);
    public boolean deleteTitle(int titleId);
    public boolean updateTitle(Title title);
}

package com.mapper;

import com.model.PaperDetail;
import com.model.PaperDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PaperDetailMapper {
    long countByExample(PaperDetailExample example);

    int deleteByExample(PaperDetailExample example);

    int deleteByPrimaryKey(Integer paperDetailId);

    int insert(PaperDetail record);

    int insertSelective(PaperDetail record);

    List<PaperDetail> selectByExample(PaperDetailExample example);

    PaperDetail selectByPrimaryKey(Integer paperDetailId);

    int updateByExampleSelective(@Param("record") PaperDetail record, @Param("example") PaperDetailExample example);

    int updateByExample(@Param("record") PaperDetail record, @Param("example") PaperDetailExample example);

    int updateByPrimaryKeySelective(PaperDetail record);

    int updateByPrimaryKey(PaperDetail record);
}
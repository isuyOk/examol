package com.mapper;

import com.model.Error;
import com.model.ErrorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ErrorMapper {
    long countByExample(ErrorExample example);

    int deleteByExample(ErrorExample example);

    int deleteByPrimaryKey(Integer errorId);

    int insert(Error record);

    int insertSelective(Error record);

    List<Error> selectByExample(ErrorExample example);

    Error selectByPrimaryKey(Integer errorId);

    int updateByExampleSelective(@Param("record") Error record, @Param("example") ErrorExample example);

    int updateByExample(@Param("record") Error record, @Param("example") ErrorExample example);

    int updateByPrimaryKeySelective(Error record);

    int updateByPrimaryKey(Error record);
}
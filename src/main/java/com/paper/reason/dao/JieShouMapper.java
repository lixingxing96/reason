package com.paper.reason.dao;

import com.paper.reason.model.JieShou;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JieShouMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JieShou record);

    int insertSelective(JieShou record);

    JieShou selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JieShou record);

    int updateByPrimaryKey(JieShou record);

    List<JieShou> findAll();

}
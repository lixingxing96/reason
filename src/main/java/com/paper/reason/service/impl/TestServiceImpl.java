package com.paper.reason.service.impl;

import com.paper.reason.dao.JieShouMapper;
import com.paper.reason.model.JieShou;
import com.paper.reason.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The document was created in 2019/5/12
 *
 * @author Lixingxing
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private JieShouMapper jieShouMapper;

    @Override
    public List<JieShou> getAll() {

        //JieShou jieShou = jieShouMapper.selectByPrimaryKey(1);
        //List<JieShou> all = jieShouMapper.findAll();
        return jieShouMapper.findAll();
    }

    @Override
    public JieShou getJieshou() {
        return jieShouMapper.selectByPrimaryKey(1);
    }
}

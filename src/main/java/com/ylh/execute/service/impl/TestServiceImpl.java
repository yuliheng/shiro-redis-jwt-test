package com.ylh.execute.service.impl;

import com.ylh.execute.dao.TestMapper;
import com.ylh.execute.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ylh
 * @version 1.0
 * @date 2021/5/8 14:34
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public String quertTest() {
        return testMapper.queryTest();
    }
}

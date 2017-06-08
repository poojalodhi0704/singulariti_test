package com.singulariti.service;

import com.singulariti.dao.TestDao;
import com.singulariti.domain.Test;
import com.singulariti.mapper.TestMapper;
import com.singulariti.mapper.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Mario on 6/7/17.
 */
@Component("testService")
public class TestServiceImpl implements TestService{

    @Autowired
    private TestMapper testMapper;
    @Autowired
    private TestDao testDao;

    @Override
    @Transactional
    public TestVO addTest(TestVO testVO) {
        if(testVO == null){
            throw new IllegalArgumentException("Parameters are missing");
        }
        Test test = testMapper.mapVOToEntity(testVO);
        testDao.saveOrUpdate(test);
        testVO = testMapper.mapEntityToVO(test);
        return testVO;
    }

    @Override
    @Transactional(readOnly = true)
    public List<TestVO> getTests() {
        List<Test> tests = testDao.getAll();
        List<TestVO> testVOList = new LinkedList<>();
        for(Test test:tests){
            testVOList.add(testMapper.mapEntityToVO(test));
        }

        return testVOList;
    }
}

package com.singulariti.mapper;

import com.singulariti.dao.TestDao;
import com.singulariti.domain.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Mario on 6/7/17.
 */
@Component("testMapper")
public class TestMapper {
    @Autowired
    private TestDao testDao;

    public TestVO mapEntityToVO(Test test){
        TestVO testVO = new TestVO();
        testVO.setCountry(test.getCountry());
        testVO.setPlayer(test.getPlayer());
        testVO.setId(test.getId());
        return testVO;
    }

    public Test mapVOToEntity(TestVO testVO){
        Test test = new Test();
        test.setCountry(testVO.getCountry());
        test.setPlayer(testVO.getPlayer());
        return test;
    }



}

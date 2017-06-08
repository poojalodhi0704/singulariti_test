package com.singulariti.service;

import com.singulariti.mapper.TestVO;

import java.util.List;

/**
 * Created by Mario on 6/7/17.
 */
public interface TestService {
    TestVO addTest(TestVO testVO);
    List<TestVO> getTests();
}

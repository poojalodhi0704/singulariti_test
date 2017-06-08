package com.singulariti.dao;

import com.singulariti.domain.Test;
import com.singulariti.domain.TestResult;

import java.util.List;

/**
 * Created by Mario on 6/7/17.
 */
public interface TestDao {
    Test saveOrUpdate(Test test);
    List<Test> getAll();
    List<TestResult> getResult();
}

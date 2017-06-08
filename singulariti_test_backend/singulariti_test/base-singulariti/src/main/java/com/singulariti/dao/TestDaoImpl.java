package com.singulariti.dao;

import com.singulariti.domain.Test;
import com.singulariti.domain.TestResult;
import org.hibernate.*;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.type.StringType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mario on 6/7/17.
 */
@Repository("/testDao")
public class TestDaoImpl implements TestDao{
    @Autowired private SessionFactory sessionFactory;

    protected Session session(){
        return sessionFactory.getCurrentSession();
    }
    @Override
    public Test saveOrUpdate(Test test) {
        session().saveOrUpdate(test);
        return test;
    }

    @Override
    public List<Test> getAll() {
        Criteria criteria = session().createCriteria(Test.class);
        List<Test> tests = criteria.list();
        return tests;
    }
    @Override
    @Transactional(readOnly = true)
    public List<TestResult> getResult(){
        /*Criteria criteria = session().createCriteria(Test.class);
        criteria.setProjection(Projections.groupProperty("country"));
        criteria.setProjection(Projections.property("player"));
        List result = criteria.list();
        System.out.println("Here");*/
        SQLQuery query = session().createSQLQuery("select country,GROUP_CONCAT(player) from singulariti_test group by country");
        //query.addScalar("player", StringType.INSTANCE);
        List<?> res = query.list();
        List<TestResult> testResults = convertToTestREsult(res);
        return testResults;
    }

    private List<TestResult> convertToTestREsult(List<?> result){
        List<TestResult> testResults = new ArrayList<>();
        for(Object item : result){
            Object[] obArr = (Object[]) item;
            String country = (String) obArr[0];
            String player = (String ) obArr[1];
            TestResult testResult = new TestResult();
            testResult.setCountry(country);
            testResult.setPlayerList(player);
            testResults.add(testResult);

        }
        return testResults;
    }
}

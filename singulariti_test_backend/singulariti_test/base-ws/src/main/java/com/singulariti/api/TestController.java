package com.singulariti.api;

import com.singulariti.dao.TestDao;
import com.singulariti.dao.TestDaoImpl;
import com.singulariti.domain.Test;
import com.singulariti.domain.TestResult;
import com.singulariti.mapper.TestVO;
import com.singulariti.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Mario on 6/7/17.
 */
@Path("/test")
public class TestController {

    @Autowired
    private TestService testService;
    @Autowired
    private TestDao testDao;
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createTest(TestVO obj){
        TestVO vo = testService.addTest(obj);
        return Response.ok().entity(vo).header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
                .allow("POST").build();

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
        List<TestResult> testResult = testDao.getResult();
      return Response.ok().entity(testResult)

        .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
                .allow("GET").build();
    }


}

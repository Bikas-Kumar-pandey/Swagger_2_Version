package com.swagger.controller;

import com.swagger.service.SwaggerSevice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "Swagger implementation ", description = "@Api -> Apiclass level annotation. This REST Api related to Welcome Message!!!!")
@RestController
public class SwaggerController {

    private final SwaggerSevice swaggerSevice;

    public SwaggerController(SwaggerSevice swaggerSevice) {
        this.swaggerSevice = swaggerSevice;
    }

    @ApiOperation(value = " @ApiOperation -> Http method level. Get Welcome Message For The Given Name ", response = String.class, tags = "getWelcomeNote")
    @GetMapping("/test/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String swaggerTest(@PathVariable("id")String id){
       return swaggerSevice.swaggerTest(id);
    }

}

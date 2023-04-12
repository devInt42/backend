package com.example.backend.service;

import com.example.backend.mapper.ExampleMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ExampleServiceImpl implements ExampleService{

    @Autowired
    private SqlSessionTemplate sqlSesssion;

    @Override
    public List<Object> getAllExample() {

        return sqlSesssion.getMapper(ExampleMapper.class).getExample();
    }
}

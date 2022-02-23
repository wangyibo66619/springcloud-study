package com.wang.springcloud.service;

import com.wang.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept queryById(Long deptno);

    public List<Dept> queryAll();
}

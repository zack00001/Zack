package com.jnshu.SpringAndMybatis.DAO;

import com.jnshu.SpringAndMybatis.Model.Student;

import java.util.List;

public interface StudentMapper {
    public void insert(Student student) throws Exception;//增加记录
    public int delete(int id) throws Exception;//删除记录
    public int update(Student student) throws Exception;//更新记录
    public Student queryById(int id) throws Exception;//根据id查找记录
    public List<Student> queryAll() throws Exception;//查询所有记录
}

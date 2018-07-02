package com.ty.service;

import com.ty.po.AppointExectuion;
import com.ty.po.Appointment;
import com.ty.po.Student;

import java.util.List;

/**
 * @author pc
 * @create 2018-07-02 上午10:08
 * @desc bookservice
 **/


public interface BookService {
    /**
     * 查询一本图书
     *
     * @Param bookId
     * @return
     */

    com.ty.po.Book getById(long bookId);

    /**
     * 查询所有图书
     * @return
     */
    List<com.ty.po.Book> getList();

    /**
     * 查询登录时数据库是否有该学生记录
     */
    Student validateStu(Long studentId, Long password);

    /**
     * 按照图书名称查询
     * 按条件搜索图书
     */

    List<com.ty.po.Book> getSomeList(String name);

    /**
     * 查看某学生预约的所有图书
     */
    List<Appointment> getAppointByStu(long studentId);


    /**
     * 预约图书
     * @Param bookId
     * @Param studentId
     * @return
     */

    AppointExectuion appoint(long bookId, long studentId);//返回预约成功实体

}

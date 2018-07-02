package com.ty.dao;

import com.ty.po.Appointment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author pc
 * @create 2018-07-02 下午2:17
 * @desc
 **/

public interface AppointmentMapper {

    //通过图书ID和学生ID预约书籍,并插入
    int insertAppointment(@Param("bookId") long bookId,@Param("studentId") long studentId);

    //通过一个学生Id查询已经预约那些书
    List<Appointment> queryAndReturn(long studentId);


}

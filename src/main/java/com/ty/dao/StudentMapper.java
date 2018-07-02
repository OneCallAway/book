package com.ty.dao;

import com.ty.po.Student;
import org.apache.ibatis.annotations.Param;

/**
 * @author pc
 * @create 2018-07-02 下午2:32
 * @desc
 **/

public interface StudentMapper {
    /**
     * 向数据库验证输入的密码是否正确
     */

    Student queryStudent(@Param("studentId") long studentId,@Param("password") long password);

}

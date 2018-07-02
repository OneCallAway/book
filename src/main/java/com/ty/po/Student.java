package com.ty.po;

/**
 * @author pc
 * @create 2018-07-02 下午1:53
 * @desc
 **/

public class Student {
    private Long studentId;
    private Long password;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getPassword() {
        return password;
    }

    public void setPassword(Long password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", password=" + password +
                '}';
    }
}

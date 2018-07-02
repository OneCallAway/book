package com.ty.po;

import java.util.Date;

/**
 * @author pc
 * @create 2018-07-02 下午1:52
 * @desc
 **/

public class Appointment {
    private long bookId;
    private long studentId;
    private Date appointTime;

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }


}

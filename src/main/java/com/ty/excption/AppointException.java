package com.ty.excption;

/**
 * @author pc
 * @create 2018-07-02 下午3:23
 * @desc
 **/

//预约义务异常
public class AppointException extends RuntimeException {
    public AppointException(String message){
        super(message);
    }

    public AppointException(String message,Throwable cause){
        super(message,cause);
    }
}

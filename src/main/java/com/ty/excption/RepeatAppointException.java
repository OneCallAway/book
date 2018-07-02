package com.ty.excption;

/**
 * @author pc
 * @create 2018-07-02 下午3:28
 * @desc
 **/

public class RepeatAppointException extends RuntimeException{
    public RepeatAppointException(String message){
        super(message);
    }

    public RepeatAppointException(String message,Throwable cause){
        super(message, cause);
    }
}

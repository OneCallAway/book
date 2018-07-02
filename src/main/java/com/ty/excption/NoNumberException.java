package com.ty.excption;

/**
 * @author pc
 * @create 2018-07-02 下午3:25
 * @desc
 **/
//库存不足异常
public class NoNumberException extends RuntimeException{
    public NoNumberException(String message){
        super(message);
    }

    public NoNumberException(String message,Throwable cause){
        super(message, cause);
    }
}

package com.ty.po;

/**
 * @author pc
 * @create 2018-07-02 下午3:19
 * @desc
 **/

public class AppointExectuion {
    //图书id
    private long bookId;

    //预约结果状态
    private int state;

    //状态标识
    private String stateInfo;

    public AppointExectuion(){

    }

    //预约失败构造器
    public AppointExectuion(long bookId,AppointStateEnum stateEnum){
        this.bookId = bookId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    @Override
    public String toString() {
        return "AppointExectuion{" +
                "bookId=" + bookId +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                '}';
    }
}

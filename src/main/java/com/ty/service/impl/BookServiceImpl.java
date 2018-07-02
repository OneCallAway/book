package com.ty.service.impl;

import com.ty.dao.AppointmentMapper;
import com.ty.dao.BookMapper;
import com.ty.dao.StudentMapper;
import com.ty.excption.AppointException;
import com.ty.excption.NoNumberException;
import com.ty.excption.RepeatAppointException;
import com.ty.po.*;
import com.ty.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author pc
 * @create 2018-07-02 上午10:34
 * @desc impl
 **/
@Service("bookService")
public class BookServiceImpl implements BookService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private AppointmentMapper appointmentMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Book getById(long bookId) {
        return bookMapper.queryById(bookId);
    }

    @Override
    public List<Book> getList() {
        return bookMapper.queryAll(0,1000);
    }

    @Override
    public Student validateStu(Long studentId,Long password){
        return studentMapper.queryStudent(studentId,password);
    }

    @Override
    public List<Book> getSomeList(String name){
        return bookMapper.querySome(name);
    }

    @Override
    public List<Appointment> getAppointByStu(long studentId){
        return appointmentMapper.queryAndReturn(studentId);
    }

    @Override
    @Transactional
    public AppointExectuion appoint(long bookId, long studentId){
        try{													  //返回成功预约的类型。
            int update=bookMapper.reduceNumber(bookId);//减库存
            if(update<=0){//已经无库存！
                throw new NoNumberException("no number");
            }else{
                //执行预约操作
                int insert=appointmentMapper.insertAppointment(bookId, studentId);
                if(insert<=0){//重复预约
                    throw new RepeatAppointException("repeat appoint");
                }else{//预约成功
                    return new AppointExectuion(bookId,AppointStateEnum.SUCCESS);
                }

            }
        } catch (NoNumberException e1) {
            throw e1;
        } catch (RepeatAppointException e2) {
            throw e2;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            // 所有编译期异常转换为运行期异常
            throw new AppointException("appoint inner error:" + e.getMessage());
        }
    }



}

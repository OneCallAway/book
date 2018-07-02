package com.ty.dao;

import com.ty.po.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author pc
 * @create 2018-07-02 上午10:05
 * @desc 实体
 **/


public interface BookMapper {
    /**
     * 根据id查询图书
     * @Param offset limit
     */

    Book queryById(long id);
    List<Book> querySome(String name);
    List<Book> queryAll(@Param("offset") int offset,@Param("limit") int limit);

    /**
     * 减少馆藏数量
     * 用返回值可判断当前库存是否还有书
     */
    int reduceNumber(long bookId);

}

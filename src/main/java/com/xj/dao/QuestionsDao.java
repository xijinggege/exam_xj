package com.xj.dao;

import com.xj.entity.dto.QuestionDto;
import com.xj.entity.po.Question;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface QuestionsDao {


    //显示所有问题
    //我来修改了
    //改了不只一行
    //真的不只一样
    List<QuestionDto> list();
}

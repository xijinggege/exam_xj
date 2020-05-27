package com.xj.dao;

import com.xj.entity.dto.QuestionDto;
import com.xj.entity.po.Question;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface QuestionsDao {


    List<QuestionDto> list();
}

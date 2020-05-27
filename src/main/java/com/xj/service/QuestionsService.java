package com.xj.service;

import com.xj.entity.dto.QuestionDto;
import com.xj.entity.po.Question;

import java.util.List;

public interface QuestionsService {


    List<QuestionDto> list();
}

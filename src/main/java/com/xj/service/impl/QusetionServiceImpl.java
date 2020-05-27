package com.xj.service.impl;

import com.xj.dao.QuestionsDao;
import com.xj.entity.dto.QuestionDto;
import com.xj.entity.po.Question;
import com.xj.service.QuestionsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QusetionServiceImpl implements QuestionsService {

    @Resource
    private QuestionsDao questionsDao;

    @Override
    public List<QuestionDto> list() {
        return questionsDao.list();
    }
}

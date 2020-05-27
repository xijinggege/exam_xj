package com.xj.controller;

import com.xj.entity.dto.QuestionDto;
import com.xj.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("question")
//@CrossOrigin(origins = {"*"})跨域请求
public class QuestionsController {

    @Autowired
    private QuestionsService questionsService;



    @GetMapping("/list")
    @ResponseBody
    public Map<String, List<QuestionDto>> list(){
        Map<String ,List<QuestionDto>> map= new HashMap<>();
        List<QuestionDto> list=questionsService.list();
        map.put("questions",list);
        return map;
    }
}

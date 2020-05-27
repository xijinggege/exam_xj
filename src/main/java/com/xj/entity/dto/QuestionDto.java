package com.xj.entity.dto;

import lombok.Data;

@Data
public class QuestionDto {

    private String question;

    private int correctAnswer;

    private String[] answers;
}

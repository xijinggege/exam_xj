package com.xj.entity.po;

import lombok.Data;

@Data
public class Question {

    private int id;

    private String question;

    private int correctAnswer;

    private int sortnum;

    private int status;

    private String[] answers;
}

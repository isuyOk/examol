package com.model;

import java.util.Date;

public class Exam {
    private Integer examId;

    private String examName;

    private Integer subjectId;

    private Date startTime;

    private Date endTime;

    private Integer startCode;

    private Integer examStatu;

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName == null ? null : examName.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getStartCode() {
        return startCode;
    }

    public void setStartCode(Integer startCode) {
        this.startCode = startCode;
    }

    public Integer getExamStatu() {
        return examStatu;
    }

    public void setExamStatu(Integer examStatu) {
        this.examStatu = examStatu;
    }
}
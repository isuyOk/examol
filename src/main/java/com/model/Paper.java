package com.model;

public class Paper {
    private Integer paperId;

    private String paperName;

    private Integer subjectId;

    private String paperInfo;

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName == null ? null : paperName.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getPaperInfo() {
        return paperInfo;
    }

    public void setPaperInfo(String paperInfo) {
        this.paperInfo = paperInfo == null ? null : paperInfo.trim();
    }
}
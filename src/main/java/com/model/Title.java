package com.model;

public class Title {
    private Integer titleId;

    private String question;

    private String ansa;

    private String ansb;

    private String ansc;

    private String ansd;

    private String anse;

    private String ansf;

    private String anst;

    private Integer subjectId;

    private String titleType;

    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnsa() {
        return ansa;
    }

    public void setAnsa(String ansa) {
        this.ansa = ansa == null ? null : ansa.trim();
    }

    public String getAnsb() {
        return ansb;
    }

    public void setAnsb(String ansb) {
        this.ansb = ansb == null ? null : ansb.trim();
    }

    public String getAnsc() {
        return ansc;
    }

    public void setAnsc(String ansc) {
        this.ansc = ansc == null ? null : ansc.trim();
    }

    public String getAnsd() {
        return ansd;
    }

    public void setAnsd(String ansd) {
        this.ansd = ansd == null ? null : ansd.trim();
    }

    public String getAnse() {
        return anse;
    }

    public void setAnse(String anse) {
        this.anse = anse == null ? null : anse.trim();
    }

    public String getAnsf() {
        return ansf;
    }

    public void setAnsf(String ansf) {
        this.ansf = ansf == null ? null : ansf.trim();
    }

    public String getAnst() {
        return anst;
    }

    public void setAnst(String anst) {
        this.anst = anst == null ? null : anst.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getTitleType() {
        return titleType;
    }

    public void setTitleType(String titleType) {
        this.titleType = titleType == null ? null : titleType.trim();
    }
}
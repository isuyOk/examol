package com.model;

import java.util.ArrayList;
import java.util.List;

public class TitleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TitleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTitleIdIsNull() {
            addCriterion("title_id is null");
            return (Criteria) this;
        }

        public Criteria andTitleIdIsNotNull() {
            addCriterion("title_id is not null");
            return (Criteria) this;
        }

        public Criteria andTitleIdEqualTo(Integer value) {
            addCriterion("title_id =", value, "titleId");
            return (Criteria) this;
        }

        public Criteria andTitleIdNotEqualTo(Integer value) {
            addCriterion("title_id <>", value, "titleId");
            return (Criteria) this;
        }

        public Criteria andTitleIdGreaterThan(Integer value) {
            addCriterion("title_id >", value, "titleId");
            return (Criteria) this;
        }

        public Criteria andTitleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("title_id >=", value, "titleId");
            return (Criteria) this;
        }

        public Criteria andTitleIdLessThan(Integer value) {
            addCriterion("title_id <", value, "titleId");
            return (Criteria) this;
        }

        public Criteria andTitleIdLessThanOrEqualTo(Integer value) {
            addCriterion("title_id <=", value, "titleId");
            return (Criteria) this;
        }

        public Criteria andTitleIdIn(List<Integer> values) {
            addCriterion("title_id in", values, "titleId");
            return (Criteria) this;
        }

        public Criteria andTitleIdNotIn(List<Integer> values) {
            addCriterion("title_id not in", values, "titleId");
            return (Criteria) this;
        }

        public Criteria andTitleIdBetween(Integer value1, Integer value2) {
            addCriterion("title_id between", value1, value2, "titleId");
            return (Criteria) this;
        }

        public Criteria andTitleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("title_id not between", value1, value2, "titleId");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNull() {
            addCriterion("question is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNotNull() {
            addCriterion("question is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionEqualTo(String value) {
            addCriterion("question =", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotEqualTo(String value) {
            addCriterion("question <>", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThan(String value) {
            addCriterion("question >", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("question >=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThan(String value) {
            addCriterion("question <", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThanOrEqualTo(String value) {
            addCriterion("question <=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLike(String value) {
            addCriterion("question like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotLike(String value) {
            addCriterion("question not like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionIn(List<String> values) {
            addCriterion("question in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotIn(List<String> values) {
            addCriterion("question not in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionBetween(String value1, String value2) {
            addCriterion("question between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotBetween(String value1, String value2) {
            addCriterion("question not between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andAnsaIsNull() {
            addCriterion("ansa is null");
            return (Criteria) this;
        }

        public Criteria andAnsaIsNotNull() {
            addCriterion("ansa is not null");
            return (Criteria) this;
        }

        public Criteria andAnsaEqualTo(String value) {
            addCriterion("ansa =", value, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaNotEqualTo(String value) {
            addCriterion("ansa <>", value, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaGreaterThan(String value) {
            addCriterion("ansa >", value, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaGreaterThanOrEqualTo(String value) {
            addCriterion("ansa >=", value, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaLessThan(String value) {
            addCriterion("ansa <", value, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaLessThanOrEqualTo(String value) {
            addCriterion("ansa <=", value, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaLike(String value) {
            addCriterion("ansa like", value, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaNotLike(String value) {
            addCriterion("ansa not like", value, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaIn(List<String> values) {
            addCriterion("ansa in", values, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaNotIn(List<String> values) {
            addCriterion("ansa not in", values, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaBetween(String value1, String value2) {
            addCriterion("ansa between", value1, value2, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaNotBetween(String value1, String value2) {
            addCriterion("ansa not between", value1, value2, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsbIsNull() {
            addCriterion("ansb is null");
            return (Criteria) this;
        }

        public Criteria andAnsbIsNotNull() {
            addCriterion("ansb is not null");
            return (Criteria) this;
        }

        public Criteria andAnsbEqualTo(String value) {
            addCriterion("ansb =", value, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbNotEqualTo(String value) {
            addCriterion("ansb <>", value, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbGreaterThan(String value) {
            addCriterion("ansb >", value, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbGreaterThanOrEqualTo(String value) {
            addCriterion("ansb >=", value, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbLessThan(String value) {
            addCriterion("ansb <", value, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbLessThanOrEqualTo(String value) {
            addCriterion("ansb <=", value, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbLike(String value) {
            addCriterion("ansb like", value, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbNotLike(String value) {
            addCriterion("ansb not like", value, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbIn(List<String> values) {
            addCriterion("ansb in", values, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbNotIn(List<String> values) {
            addCriterion("ansb not in", values, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbBetween(String value1, String value2) {
            addCriterion("ansb between", value1, value2, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbNotBetween(String value1, String value2) {
            addCriterion("ansb not between", value1, value2, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnscIsNull() {
            addCriterion("ansc is null");
            return (Criteria) this;
        }

        public Criteria andAnscIsNotNull() {
            addCriterion("ansc is not null");
            return (Criteria) this;
        }

        public Criteria andAnscEqualTo(String value) {
            addCriterion("ansc =", value, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscNotEqualTo(String value) {
            addCriterion("ansc <>", value, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscGreaterThan(String value) {
            addCriterion("ansc >", value, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscGreaterThanOrEqualTo(String value) {
            addCriterion("ansc >=", value, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscLessThan(String value) {
            addCriterion("ansc <", value, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscLessThanOrEqualTo(String value) {
            addCriterion("ansc <=", value, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscLike(String value) {
            addCriterion("ansc like", value, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscNotLike(String value) {
            addCriterion("ansc not like", value, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscIn(List<String> values) {
            addCriterion("ansc in", values, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscNotIn(List<String> values) {
            addCriterion("ansc not in", values, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscBetween(String value1, String value2) {
            addCriterion("ansc between", value1, value2, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscNotBetween(String value1, String value2) {
            addCriterion("ansc not between", value1, value2, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnsdIsNull() {
            addCriterion("ansd is null");
            return (Criteria) this;
        }

        public Criteria andAnsdIsNotNull() {
            addCriterion("ansd is not null");
            return (Criteria) this;
        }

        public Criteria andAnsdEqualTo(String value) {
            addCriterion("ansd =", value, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdNotEqualTo(String value) {
            addCriterion("ansd <>", value, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdGreaterThan(String value) {
            addCriterion("ansd >", value, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdGreaterThanOrEqualTo(String value) {
            addCriterion("ansd >=", value, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdLessThan(String value) {
            addCriterion("ansd <", value, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdLessThanOrEqualTo(String value) {
            addCriterion("ansd <=", value, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdLike(String value) {
            addCriterion("ansd like", value, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdNotLike(String value) {
            addCriterion("ansd not like", value, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdIn(List<String> values) {
            addCriterion("ansd in", values, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdNotIn(List<String> values) {
            addCriterion("ansd not in", values, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdBetween(String value1, String value2) {
            addCriterion("ansd between", value1, value2, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdNotBetween(String value1, String value2) {
            addCriterion("ansd not between", value1, value2, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnseIsNull() {
            addCriterion("anse is null");
            return (Criteria) this;
        }

        public Criteria andAnseIsNotNull() {
            addCriterion("anse is not null");
            return (Criteria) this;
        }

        public Criteria andAnseEqualTo(String value) {
            addCriterion("anse =", value, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseNotEqualTo(String value) {
            addCriterion("anse <>", value, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseGreaterThan(String value) {
            addCriterion("anse >", value, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseGreaterThanOrEqualTo(String value) {
            addCriterion("anse >=", value, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseLessThan(String value) {
            addCriterion("anse <", value, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseLessThanOrEqualTo(String value) {
            addCriterion("anse <=", value, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseLike(String value) {
            addCriterion("anse like", value, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseNotLike(String value) {
            addCriterion("anse not like", value, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseIn(List<String> values) {
            addCriterion("anse in", values, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseNotIn(List<String> values) {
            addCriterion("anse not in", values, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseBetween(String value1, String value2) {
            addCriterion("anse between", value1, value2, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseNotBetween(String value1, String value2) {
            addCriterion("anse not between", value1, value2, "anse");
            return (Criteria) this;
        }

        public Criteria andAnsfIsNull() {
            addCriterion("ansf is null");
            return (Criteria) this;
        }

        public Criteria andAnsfIsNotNull() {
            addCriterion("ansf is not null");
            return (Criteria) this;
        }

        public Criteria andAnsfEqualTo(String value) {
            addCriterion("ansf =", value, "ansf");
            return (Criteria) this;
        }

        public Criteria andAnsfNotEqualTo(String value) {
            addCriterion("ansf <>", value, "ansf");
            return (Criteria) this;
        }

        public Criteria andAnsfGreaterThan(String value) {
            addCriterion("ansf >", value, "ansf");
            return (Criteria) this;
        }

        public Criteria andAnsfGreaterThanOrEqualTo(String value) {
            addCriterion("ansf >=", value, "ansf");
            return (Criteria) this;
        }

        public Criteria andAnsfLessThan(String value) {
            addCriterion("ansf <", value, "ansf");
            return (Criteria) this;
        }

        public Criteria andAnsfLessThanOrEqualTo(String value) {
            addCriterion("ansf <=", value, "ansf");
            return (Criteria) this;
        }

        public Criteria andAnsfLike(String value) {
            addCriterion("ansf like", value, "ansf");
            return (Criteria) this;
        }

        public Criteria andAnsfNotLike(String value) {
            addCriterion("ansf not like", value, "ansf");
            return (Criteria) this;
        }

        public Criteria andAnsfIn(List<String> values) {
            addCriterion("ansf in", values, "ansf");
            return (Criteria) this;
        }

        public Criteria andAnsfNotIn(List<String> values) {
            addCriterion("ansf not in", values, "ansf");
            return (Criteria) this;
        }

        public Criteria andAnsfBetween(String value1, String value2) {
            addCriterion("ansf between", value1, value2, "ansf");
            return (Criteria) this;
        }

        public Criteria andAnsfNotBetween(String value1, String value2) {
            addCriterion("ansf not between", value1, value2, "ansf");
            return (Criteria) this;
        }

        public Criteria andAnstIsNull() {
            addCriterion("anst is null");
            return (Criteria) this;
        }

        public Criteria andAnstIsNotNull() {
            addCriterion("anst is not null");
            return (Criteria) this;
        }

        public Criteria andAnstEqualTo(String value) {
            addCriterion("anst =", value, "anst");
            return (Criteria) this;
        }

        public Criteria andAnstNotEqualTo(String value) {
            addCriterion("anst <>", value, "anst");
            return (Criteria) this;
        }

        public Criteria andAnstGreaterThan(String value) {
            addCriterion("anst >", value, "anst");
            return (Criteria) this;
        }

        public Criteria andAnstGreaterThanOrEqualTo(String value) {
            addCriterion("anst >=", value, "anst");
            return (Criteria) this;
        }

        public Criteria andAnstLessThan(String value) {
            addCriterion("anst <", value, "anst");
            return (Criteria) this;
        }

        public Criteria andAnstLessThanOrEqualTo(String value) {
            addCriterion("anst <=", value, "anst");
            return (Criteria) this;
        }

        public Criteria andAnstLike(String value) {
            addCriterion("anst like", value, "anst");
            return (Criteria) this;
        }

        public Criteria andAnstNotLike(String value) {
            addCriterion("anst not like", value, "anst");
            return (Criteria) this;
        }

        public Criteria andAnstIn(List<String> values) {
            addCriterion("anst in", values, "anst");
            return (Criteria) this;
        }

        public Criteria andAnstNotIn(List<String> values) {
            addCriterion("anst not in", values, "anst");
            return (Criteria) this;
        }

        public Criteria andAnstBetween(String value1, String value2) {
            addCriterion("anst between", value1, value2, "anst");
            return (Criteria) this;
        }

        public Criteria andAnstNotBetween(String value1, String value2) {
            addCriterion("anst not between", value1, value2, "anst");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Integer value) {
            addCriterion("subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Integer value) {
            addCriterion("subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Integer value) {
            addCriterion("subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Integer value) {
            addCriterion("subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Integer> values) {
            addCriterion("subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Integer> values) {
            addCriterion("subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIsNull() {
            addCriterion("title_type is null");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIsNotNull() {
            addCriterion("title_type is not null");
            return (Criteria) this;
        }

        public Criteria andTitleTypeEqualTo(String value) {
            addCriterion("title_type =", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeNotEqualTo(String value) {
            addCriterion("title_type <>", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeGreaterThan(String value) {
            addCriterion("title_type >", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("title_type >=", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeLessThan(String value) {
            addCriterion("title_type <", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeLessThanOrEqualTo(String value) {
            addCriterion("title_type <=", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeLike(String value) {
            addCriterion("title_type like", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeNotLike(String value) {
            addCriterion("title_type not like", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIn(List<String> values) {
            addCriterion("title_type in", values, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeNotIn(List<String> values) {
            addCriterion("title_type not in", values, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeBetween(String value1, String value2) {
            addCriterion("title_type between", value1, value2, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeNotBetween(String value1, String value2) {
            addCriterion("title_type not between", value1, value2, "titleType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
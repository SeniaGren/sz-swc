package com.xm.swc.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class AboutpageExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public AboutpageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
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

        public Criteria andAboutidIsNull() {
            addCriterion("aboutId is null");
            return (Criteria) this;
        }

        public Criteria andAboutidIsNotNull() {
            addCriterion("aboutId is not null");
            return (Criteria) this;
        }

        public Criteria andAboutidEqualTo(String value) {
            addCriterion("aboutId =", value, "aboutid");
            return (Criteria) this;
        }

        public Criteria andAboutidNotEqualTo(String value) {
            addCriterion("aboutId <>", value, "aboutid");
            return (Criteria) this;
        }

        public Criteria andAboutidGreaterThan(String value) {
            addCriterion("aboutId >", value, "aboutid");
            return (Criteria) this;
        }

        public Criteria andAboutidGreaterThanOrEqualTo(String value) {
            addCriterion("aboutId >=", value, "aboutid");
            return (Criteria) this;
        }

        public Criteria andAboutidLessThan(String value) {
            addCriterion("aboutId <", value, "aboutid");
            return (Criteria) this;
        }

        public Criteria andAboutidLessThanOrEqualTo(String value) {
            addCriterion("aboutId <=", value, "aboutid");
            return (Criteria) this;
        }

        public Criteria andAboutidLike(String value) {
            addCriterion("aboutId like", value, "aboutid");
            return (Criteria) this;
        }

        public Criteria andAboutidNotLike(String value) {
            addCriterion("aboutId not like", value, "aboutid");
            return (Criteria) this;
        }

        public Criteria andAboutidIn(List<String> values) {
            addCriterion("aboutId in", values, "aboutid");
            return (Criteria) this;
        }

        public Criteria andAboutidNotIn(List<String> values) {
            addCriterion("aboutId not in", values, "aboutid");
            return (Criteria) this;
        }

        public Criteria andAboutidBetween(String value1, String value2) {
            addCriterion("aboutId between", value1, value2, "aboutid");
            return (Criteria) this;
        }

        public Criteria andAboutidNotBetween(String value1, String value2) {
            addCriterion("aboutId not between", value1, value2, "aboutid");
            return (Criteria) this;
        }

        public Criteria andAboutnameIsNull() {
            addCriterion("aboutName is null");
            return (Criteria) this;
        }

        public Criteria andAboutnameIsNotNull() {
            addCriterion("aboutName is not null");
            return (Criteria) this;
        }

        public Criteria andAboutnameEqualTo(String value) {
            addCriterion("aboutName =", value, "aboutname");
            return (Criteria) this;
        }

        public Criteria andAboutnameNotEqualTo(String value) {
            addCriterion("aboutName <>", value, "aboutname");
            return (Criteria) this;
        }

        public Criteria andAboutnameGreaterThan(String value) {
            addCriterion("aboutName >", value, "aboutname");
            return (Criteria) this;
        }

        public Criteria andAboutnameGreaterThanOrEqualTo(String value) {
            addCriterion("aboutName >=", value, "aboutname");
            return (Criteria) this;
        }

        public Criteria andAboutnameLessThan(String value) {
            addCriterion("aboutName <", value, "aboutname");
            return (Criteria) this;
        }

        public Criteria andAboutnameLessThanOrEqualTo(String value) {
            addCriterion("aboutName <=", value, "aboutname");
            return (Criteria) this;
        }

        public Criteria andAboutnameLike(String value) {
            addCriterion("aboutName like", value, "aboutname");
            return (Criteria) this;
        }

        public Criteria andAboutnameNotLike(String value) {
            addCriterion("aboutName not like", value, "aboutname");
            return (Criteria) this;
        }

        public Criteria andAboutnameIn(List<String> values) {
            addCriterion("aboutName in", values, "aboutname");
            return (Criteria) this;
        }

        public Criteria andAboutnameNotIn(List<String> values) {
            addCriterion("aboutName not in", values, "aboutname");
            return (Criteria) this;
        }

        public Criteria andAboutnameBetween(String value1, String value2) {
            addCriterion("aboutName between", value1, value2, "aboutname");
            return (Criteria) this;
        }

        public Criteria andAboutnameNotBetween(String value1, String value2) {
            addCriterion("aboutName not between", value1, value2, "aboutname");
            return (Criteria) this;
        }

        public Criteria andAboutcontentIsNull() {
            addCriterion("aboutContent is null");
            return (Criteria) this;
        }

        public Criteria andAboutcontentIsNotNull() {
            addCriterion("aboutContent is not null");
            return (Criteria) this;
        }

        public Criteria andAboutcontentEqualTo(String value) {
            addCriterion("aboutContent =", value, "aboutcontent");
            return (Criteria) this;
        }

        public Criteria andAboutcontentNotEqualTo(String value) {
            addCriterion("aboutContent <>", value, "aboutcontent");
            return (Criteria) this;
        }

        public Criteria andAboutcontentGreaterThan(String value) {
            addCriterion("aboutContent >", value, "aboutcontent");
            return (Criteria) this;
        }

        public Criteria andAboutcontentGreaterThanOrEqualTo(String value) {
            addCriterion("aboutContent >=", value, "aboutcontent");
            return (Criteria) this;
        }

        public Criteria andAboutcontentLessThan(String value) {
            addCriterion("aboutContent <", value, "aboutcontent");
            return (Criteria) this;
        }

        public Criteria andAboutcontentLessThanOrEqualTo(String value) {
            addCriterion("aboutContent <=", value, "aboutcontent");
            return (Criteria) this;
        }

        public Criteria andAboutcontentLike(String value) {
            addCriterion("aboutContent like", value, "aboutcontent");
            return (Criteria) this;
        }

        public Criteria andAboutcontentNotLike(String value) {
            addCriterion("aboutContent not like", value, "aboutcontent");
            return (Criteria) this;
        }

        public Criteria andAboutcontentIn(List<String> values) {
            addCriterion("aboutContent in", values, "aboutcontent");
            return (Criteria) this;
        }

        public Criteria andAboutcontentNotIn(List<String> values) {
            addCriterion("aboutContent not in", values, "aboutcontent");
            return (Criteria) this;
        }

        public Criteria andAboutcontentBetween(String value1, String value2) {
            addCriterion("aboutContent between", value1, value2, "aboutcontent");
            return (Criteria) this;
        }

        public Criteria andAboutcontentNotBetween(String value1, String value2) {
            addCriterion("aboutContent not between", value1, value2, "aboutcontent");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table aboutpage
     *
     * @mbggenerated do_not_delete_during_merge Mon Oct 08 12:35:29 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
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
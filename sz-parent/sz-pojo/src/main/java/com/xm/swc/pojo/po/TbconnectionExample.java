package com.xm.swc.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class TbconnectionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbconnection
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbconnection
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbconnection
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbconnection
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public TbconnectionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbconnection
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbconnection
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbconnection
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbconnection
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbconnection
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbconnection
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbconnection
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
     * This method corresponds to the database table tbconnection
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
     * This method corresponds to the database table tbconnection
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbconnection
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
     * This class corresponds to the database table tbconnection
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

        public Criteria andQqnumberIsNull() {
            addCriterion("qqNumber is null");
            return (Criteria) this;
        }

        public Criteria andQqnumberIsNotNull() {
            addCriterion("qqNumber is not null");
            return (Criteria) this;
        }

        public Criteria andQqnumberEqualTo(String value) {
            addCriterion("qqNumber =", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberNotEqualTo(String value) {
            addCriterion("qqNumber <>", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberGreaterThan(String value) {
            addCriterion("qqNumber >", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberGreaterThanOrEqualTo(String value) {
            addCriterion("qqNumber >=", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberLessThan(String value) {
            addCriterion("qqNumber <", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberLessThanOrEqualTo(String value) {
            addCriterion("qqNumber <=", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberLike(String value) {
            addCriterion("qqNumber like", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberNotLike(String value) {
            addCriterion("qqNumber not like", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberIn(List<String> values) {
            addCriterion("qqNumber in", values, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberNotIn(List<String> values) {
            addCriterion("qqNumber not in", values, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberBetween(String value1, String value2) {
            addCriterion("qqNumber between", value1, value2, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberNotBetween(String value1, String value2) {
            addCriterion("qqNumber not between", value1, value2, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberIsNull() {
            addCriterion("wechatNumber is null");
            return (Criteria) this;
        }

        public Criteria andWechatnumberIsNotNull() {
            addCriterion("wechatNumber is not null");
            return (Criteria) this;
        }

        public Criteria andWechatnumberEqualTo(String value) {
            addCriterion("wechatNumber =", value, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberNotEqualTo(String value) {
            addCriterion("wechatNumber <>", value, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberGreaterThan(String value) {
            addCriterion("wechatNumber >", value, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberGreaterThanOrEqualTo(String value) {
            addCriterion("wechatNumber >=", value, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberLessThan(String value) {
            addCriterion("wechatNumber <", value, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberLessThanOrEqualTo(String value) {
            addCriterion("wechatNumber <=", value, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberLike(String value) {
            addCriterion("wechatNumber like", value, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberNotLike(String value) {
            addCriterion("wechatNumber not like", value, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberIn(List<String> values) {
            addCriterion("wechatNumber in", values, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberNotIn(List<String> values) {
            addCriterion("wechatNumber not in", values, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberBetween(String value1, String value2) {
            addCriterion("wechatNumber between", value1, value2, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWechatnumberNotBetween(String value1, String value2) {
            addCriterion("wechatNumber not between", value1, value2, "wechatnumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberIsNull() {
            addCriterion("weiBoNumber is null");
            return (Criteria) this;
        }

        public Criteria andWeibonumberIsNotNull() {
            addCriterion("weiBoNumber is not null");
            return (Criteria) this;
        }

        public Criteria andWeibonumberEqualTo(String value) {
            addCriterion("weiBoNumber =", value, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberNotEqualTo(String value) {
            addCriterion("weiBoNumber <>", value, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberGreaterThan(String value) {
            addCriterion("weiBoNumber >", value, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberGreaterThanOrEqualTo(String value) {
            addCriterion("weiBoNumber >=", value, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberLessThan(String value) {
            addCriterion("weiBoNumber <", value, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberLessThanOrEqualTo(String value) {
            addCriterion("weiBoNumber <=", value, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberLike(String value) {
            addCriterion("weiBoNumber like", value, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberNotLike(String value) {
            addCriterion("weiBoNumber not like", value, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberIn(List<String> values) {
            addCriterion("weiBoNumber in", values, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberNotIn(List<String> values) {
            addCriterion("weiBoNumber not in", values, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberBetween(String value1, String value2) {
            addCriterion("weiBoNumber between", value1, value2, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberNotBetween(String value1, String value2) {
            addCriterion("weiBoNumber not between", value1, value2, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andMailnumberIsNull() {
            addCriterion("mailNumber is null");
            return (Criteria) this;
        }

        public Criteria andMailnumberIsNotNull() {
            addCriterion("mailNumber is not null");
            return (Criteria) this;
        }

        public Criteria andMailnumberEqualTo(String value) {
            addCriterion("mailNumber =", value, "mailnumber");
            return (Criteria) this;
        }

        public Criteria andMailnumberNotEqualTo(String value) {
            addCriterion("mailNumber <>", value, "mailnumber");
            return (Criteria) this;
        }

        public Criteria andMailnumberGreaterThan(String value) {
            addCriterion("mailNumber >", value, "mailnumber");
            return (Criteria) this;
        }

        public Criteria andMailnumberGreaterThanOrEqualTo(String value) {
            addCriterion("mailNumber >=", value, "mailnumber");
            return (Criteria) this;
        }

        public Criteria andMailnumberLessThan(String value) {
            addCriterion("mailNumber <", value, "mailnumber");
            return (Criteria) this;
        }

        public Criteria andMailnumberLessThanOrEqualTo(String value) {
            addCriterion("mailNumber <=", value, "mailnumber");
            return (Criteria) this;
        }

        public Criteria andMailnumberLike(String value) {
            addCriterion("mailNumber like", value, "mailnumber");
            return (Criteria) this;
        }

        public Criteria andMailnumberNotLike(String value) {
            addCriterion("mailNumber not like", value, "mailnumber");
            return (Criteria) this;
        }

        public Criteria andMailnumberIn(List<String> values) {
            addCriterion("mailNumber in", values, "mailnumber");
            return (Criteria) this;
        }

        public Criteria andMailnumberNotIn(List<String> values) {
            addCriterion("mailNumber not in", values, "mailnumber");
            return (Criteria) this;
        }

        public Criteria andMailnumberBetween(String value1, String value2) {
            addCriterion("mailNumber between", value1, value2, "mailnumber");
            return (Criteria) this;
        }

        public Criteria andMailnumberNotBetween(String value1, String value2) {
            addCriterion("mailNumber not between", value1, value2, "mailnumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andConnectidIsNull() {
            addCriterion("connectId is null");
            return (Criteria) this;
        }

        public Criteria andConnectidIsNotNull() {
            addCriterion("connectId is not null");
            return (Criteria) this;
        }

        public Criteria andConnectidEqualTo(String value) {
            addCriterion("connectId =", value, "connectid");
            return (Criteria) this;
        }

        public Criteria andConnectidNotEqualTo(String value) {
            addCriterion("connectId <>", value, "connectid");
            return (Criteria) this;
        }

        public Criteria andConnectidGreaterThan(String value) {
            addCriterion("connectId >", value, "connectid");
            return (Criteria) this;
        }

        public Criteria andConnectidGreaterThanOrEqualTo(String value) {
            addCriterion("connectId >=", value, "connectid");
            return (Criteria) this;
        }

        public Criteria andConnectidLessThan(String value) {
            addCriterion("connectId <", value, "connectid");
            return (Criteria) this;
        }

        public Criteria andConnectidLessThanOrEqualTo(String value) {
            addCriterion("connectId <=", value, "connectid");
            return (Criteria) this;
        }

        public Criteria andConnectidLike(String value) {
            addCriterion("connectId like", value, "connectid");
            return (Criteria) this;
        }

        public Criteria andConnectidNotLike(String value) {
            addCriterion("connectId not like", value, "connectid");
            return (Criteria) this;
        }

        public Criteria andConnectidIn(List<String> values) {
            addCriterion("connectId in", values, "connectid");
            return (Criteria) this;
        }

        public Criteria andConnectidNotIn(List<String> values) {
            addCriterion("connectId not in", values, "connectid");
            return (Criteria) this;
        }

        public Criteria andConnectidBetween(String value1, String value2) {
            addCriterion("connectId between", value1, value2, "connectid");
            return (Criteria) this;
        }

        public Criteria andConnectidNotBetween(String value1, String value2) {
            addCriterion("connectId not between", value1, value2, "connectid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbconnection
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
     * This class corresponds to the database table tbconnection
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
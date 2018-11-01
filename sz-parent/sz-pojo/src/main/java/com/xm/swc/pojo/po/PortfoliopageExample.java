package com.xm.swc.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class PortfoliopageExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table portfoliopage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table portfoliopage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table portfoliopage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portfoliopage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public PortfoliopageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portfoliopage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portfoliopage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portfoliopage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portfoliopage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portfoliopage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portfoliopage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portfoliopage
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
     * This method corresponds to the database table portfoliopage
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
     * This method corresponds to the database table portfoliopage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portfoliopage
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
     * This class corresponds to the database table portfoliopage
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

        public Criteria andPortfolioidIsNull() {
            addCriterion("portfolioId is null");
            return (Criteria) this;
        }

        public Criteria andPortfolioidIsNotNull() {
            addCriterion("portfolioId is not null");
            return (Criteria) this;
        }

        public Criteria andPortfolioidEqualTo(String value) {
            addCriterion("portfolioId =", value, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidNotEqualTo(String value) {
            addCriterion("portfolioId <>", value, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidGreaterThan(String value) {
            addCriterion("portfolioId >", value, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidGreaterThanOrEqualTo(String value) {
            addCriterion("portfolioId >=", value, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidLessThan(String value) {
            addCriterion("portfolioId <", value, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidLessThanOrEqualTo(String value) {
            addCriterion("portfolioId <=", value, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidLike(String value) {
            addCriterion("portfolioId like", value, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidNotLike(String value) {
            addCriterion("portfolioId not like", value, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidIn(List<String> values) {
            addCriterion("portfolioId in", values, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidNotIn(List<String> values) {
            addCriterion("portfolioId not in", values, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidBetween(String value1, String value2) {
            addCriterion("portfolioId between", value1, value2, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidNotBetween(String value1, String value2) {
            addCriterion("portfolioId not between", value1, value2, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolionameIsNull() {
            addCriterion("portfolioName is null");
            return (Criteria) this;
        }

        public Criteria andPortfolionameIsNotNull() {
            addCriterion("portfolioName is not null");
            return (Criteria) this;
        }

        public Criteria andPortfolionameEqualTo(String value) {
            addCriterion("portfolioName =", value, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameNotEqualTo(String value) {
            addCriterion("portfolioName <>", value, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameGreaterThan(String value) {
            addCriterion("portfolioName >", value, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameGreaterThanOrEqualTo(String value) {
            addCriterion("portfolioName >=", value, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameLessThan(String value) {
            addCriterion("portfolioName <", value, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameLessThanOrEqualTo(String value) {
            addCriterion("portfolioName <=", value, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameLike(String value) {
            addCriterion("portfolioName like", value, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameNotLike(String value) {
            addCriterion("portfolioName not like", value, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameIn(List<String> values) {
            addCriterion("portfolioName in", values, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameNotIn(List<String> values) {
            addCriterion("portfolioName not in", values, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameBetween(String value1, String value2) {
            addCriterion("portfolioName between", value1, value2, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameNotBetween(String value1, String value2) {
            addCriterion("portfolioName not between", value1, value2, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolioimgsIsNull() {
            addCriterion("portfolioimgs is null");
            return (Criteria) this;
        }

        public Criteria andPortfolioimgsIsNotNull() {
            addCriterion("portfolioimgs is not null");
            return (Criteria) this;
        }

        public Criteria andPortfolioimgsEqualTo(String value) {
            addCriterion("portfolioimgs =", value, "portfolioimgs");
            return (Criteria) this;
        }

        public Criteria andPortfolioimgsNotEqualTo(String value) {
            addCriterion("portfolioimgs <>", value, "portfolioimgs");
            return (Criteria) this;
        }

        public Criteria andPortfolioimgsGreaterThan(String value) {
            addCriterion("portfolioimgs >", value, "portfolioimgs");
            return (Criteria) this;
        }

        public Criteria andPortfolioimgsGreaterThanOrEqualTo(String value) {
            addCriterion("portfolioimgs >=", value, "portfolioimgs");
            return (Criteria) this;
        }

        public Criteria andPortfolioimgsLessThan(String value) {
            addCriterion("portfolioimgs <", value, "portfolioimgs");
            return (Criteria) this;
        }

        public Criteria andPortfolioimgsLessThanOrEqualTo(String value) {
            addCriterion("portfolioimgs <=", value, "portfolioimgs");
            return (Criteria) this;
        }

        public Criteria andPortfolioimgsLike(String value) {
            addCriterion("portfolioimgs like", value, "portfolioimgs");
            return (Criteria) this;
        }

        public Criteria andPortfolioimgsNotLike(String value) {
            addCriterion("portfolioimgs not like", value, "portfolioimgs");
            return (Criteria) this;
        }

        public Criteria andPortfolioimgsIn(List<String> values) {
            addCriterion("portfolioimgs in", values, "portfolioimgs");
            return (Criteria) this;
        }

        public Criteria andPortfolioimgsNotIn(List<String> values) {
            addCriterion("portfolioimgs not in", values, "portfolioimgs");
            return (Criteria) this;
        }

        public Criteria andPortfolioimgsBetween(String value1, String value2) {
            addCriterion("portfolioimgs between", value1, value2, "portfolioimgs");
            return (Criteria) this;
        }

        public Criteria andPortfolioimgsNotBetween(String value1, String value2) {
            addCriterion("portfolioimgs not between", value1, value2, "portfolioimgs");
            return (Criteria) this;
        }

        public Criteria andPortfoliooccupationIsNull() {
            addCriterion("portfolioOccupation is null");
            return (Criteria) this;
        }

        public Criteria andPortfoliooccupationIsNotNull() {
            addCriterion("portfolioOccupation is not null");
            return (Criteria) this;
        }

        public Criteria andPortfoliooccupationEqualTo(String value) {
            addCriterion("portfolioOccupation =", value, "portfoliooccupation");
            return (Criteria) this;
        }

        public Criteria andPortfoliooccupationNotEqualTo(String value) {
            addCriterion("portfolioOccupation <>", value, "portfoliooccupation");
            return (Criteria) this;
        }

        public Criteria andPortfoliooccupationGreaterThan(String value) {
            addCriterion("portfolioOccupation >", value, "portfoliooccupation");
            return (Criteria) this;
        }

        public Criteria andPortfoliooccupationGreaterThanOrEqualTo(String value) {
            addCriterion("portfolioOccupation >=", value, "portfoliooccupation");
            return (Criteria) this;
        }

        public Criteria andPortfoliooccupationLessThan(String value) {
            addCriterion("portfolioOccupation <", value, "portfoliooccupation");
            return (Criteria) this;
        }

        public Criteria andPortfoliooccupationLessThanOrEqualTo(String value) {
            addCriterion("portfolioOccupation <=", value, "portfoliooccupation");
            return (Criteria) this;
        }

        public Criteria andPortfoliooccupationLike(String value) {
            addCriterion("portfolioOccupation like", value, "portfoliooccupation");
            return (Criteria) this;
        }

        public Criteria andPortfoliooccupationNotLike(String value) {
            addCriterion("portfolioOccupation not like", value, "portfoliooccupation");
            return (Criteria) this;
        }

        public Criteria andPortfoliooccupationIn(List<String> values) {
            addCriterion("portfolioOccupation in", values, "portfoliooccupation");
            return (Criteria) this;
        }

        public Criteria andPortfoliooccupationNotIn(List<String> values) {
            addCriterion("portfolioOccupation not in", values, "portfoliooccupation");
            return (Criteria) this;
        }

        public Criteria andPortfoliooccupationBetween(String value1, String value2) {
            addCriterion("portfolioOccupation between", value1, value2, "portfoliooccupation");
            return (Criteria) this;
        }

        public Criteria andPortfoliooccupationNotBetween(String value1, String value2) {
            addCriterion("portfolioOccupation not between", value1, value2, "portfoliooccupation");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table portfoliopage
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
     * This class corresponds to the database table portfoliopage
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
package com.ai.cloud.skywalking.sample.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class Sampletable1Example {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PUBLIC.SAMPLETABLE1
     *
     * @mbggenerated Sun Jul 24 09:19:30 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PUBLIC.SAMPLETABLE1
     *
     * @mbggenerated Sun Jul 24 09:19:30 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PUBLIC.SAMPLETABLE1
     *
     * @mbggenerated Sun Jul 24 09:19:30 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SAMPLETABLE1
     *
     * @mbggenerated Sun Jul 24 09:19:30 CST 2016
     */
    public Sampletable1Example() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SAMPLETABLE1
     *
     * @mbggenerated Sun Jul 24 09:19:30 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SAMPLETABLE1
     *
     * @mbggenerated Sun Jul 24 09:19:30 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SAMPLETABLE1
     *
     * @mbggenerated Sun Jul 24 09:19:30 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SAMPLETABLE1
     *
     * @mbggenerated Sun Jul 24 09:19:30 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SAMPLETABLE1
     *
     * @mbggenerated Sun Jul 24 09:19:30 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SAMPLETABLE1
     *
     * @mbggenerated Sun Jul 24 09:19:30 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SAMPLETABLE1
     *
     * @mbggenerated Sun Jul 24 09:19:30 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SAMPLETABLE1
     *
     * @mbggenerated Sun Jul 24 09:19:30 CST 2016
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
     * This method corresponds to the database table PUBLIC.SAMPLETABLE1
     *
     * @mbggenerated Sun Jul 24 09:19:30 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SAMPLETABLE1
     *
     * @mbggenerated Sun Jul 24 09:19:30 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PUBLIC.SAMPLETABLE1
     *
     * @mbggenerated Sun Jul 24 09:19:30 CST 2016
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

        public Criteria andKey1IsNull() {
            addCriterion("KEY1 is null");
            return (Criteria) this;
        }

        public Criteria andKey1IsNotNull() {
            addCriterion("KEY1 is not null");
            return (Criteria) this;
        }

        public Criteria andKey1EqualTo(String value) {
            addCriterion("KEY1 =", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1NotEqualTo(String value) {
            addCriterion("KEY1 <>", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1GreaterThan(String value) {
            addCriterion("KEY1 >", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1GreaterThanOrEqualTo(String value) {
            addCriterion("KEY1 >=", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1LessThan(String value) {
            addCriterion("KEY1 <", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1LessThanOrEqualTo(String value) {
            addCriterion("KEY1 <=", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1Like(String value) {
            addCriterion("KEY1 like", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1NotLike(String value) {
            addCriterion("KEY1 not like", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1In(List<String> values) {
            addCriterion("KEY1 in", values, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1NotIn(List<String> values) {
            addCriterion("KEY1 not in", values, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1Between(String value1, String value2) {
            addCriterion("KEY1 between", value1, value2, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1NotBetween(String value1, String value2) {
            addCriterion("KEY1 not between", value1, value2, "key1");
            return (Criteria) this;
        }

        public Criteria andValue1IsNull() {
            addCriterion("VALUE1 is null");
            return (Criteria) this;
        }

        public Criteria andValue1IsNotNull() {
            addCriterion("VALUE1 is not null");
            return (Criteria) this;
        }

        public Criteria andValue1EqualTo(String value) {
            addCriterion("VALUE1 =", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotEqualTo(String value) {
            addCriterion("VALUE1 <>", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1GreaterThan(String value) {
            addCriterion("VALUE1 >", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1GreaterThanOrEqualTo(String value) {
            addCriterion("VALUE1 >=", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1LessThan(String value) {
            addCriterion("VALUE1 <", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1LessThanOrEqualTo(String value) {
            addCriterion("VALUE1 <=", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1Like(String value) {
            addCriterion("VALUE1 like", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotLike(String value) {
            addCriterion("VALUE1 not like", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1In(List<String> values) {
            addCriterion("VALUE1 in", values, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotIn(List<String> values) {
            addCriterion("VALUE1 not in", values, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1Between(String value1, String value2) {
            addCriterion("VALUE1 between", value1, value2, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotBetween(String value1, String value2) {
            addCriterion("VALUE1 not between", value1, value2, "value1");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PUBLIC.SAMPLETABLE1
     *
     * @mbggenerated do_not_delete_during_merge Sun Jul 24 09:19:30 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PUBLIC.SAMPLETABLE1
     *
     * @mbggenerated Sun Jul 24 09:19:30 CST 2016
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
package com.njust.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemInfoExample() {
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

        public Criteria andTrainOnlyidIsNull() {
            addCriterion("train_onlyid is null");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidIsNotNull() {
            addCriterion("train_onlyid is not null");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidEqualTo(Long value) {
            addCriterion("train_onlyid =", value, "trainOnlyid");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidNotEqualTo(Long value) {
            addCriterion("train_onlyid <>", value, "trainOnlyid");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidGreaterThan(Long value) {
            addCriterion("train_onlyid >", value, "trainOnlyid");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidGreaterThanOrEqualTo(Long value) {
            addCriterion("train_onlyid >=", value, "trainOnlyid");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidLessThan(Long value) {
            addCriterion("train_onlyid <", value, "trainOnlyid");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidLessThanOrEqualTo(Long value) {
            addCriterion("train_onlyid <=", value, "trainOnlyid");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidIn(List<Long> values) {
            addCriterion("train_onlyid in", values, "trainOnlyid");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidNotIn(List<Long> values) {
            addCriterion("train_onlyid not in", values, "trainOnlyid");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidBetween(Long value1, Long value2) {
            addCriterion("train_onlyid between", value1, value2, "trainOnlyid");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidNotBetween(Long value1, Long value2) {
            addCriterion("train_onlyid not between", value1, value2, "trainOnlyid");
            return (Criteria) this;
        }

        public Criteria andPlcStateIsNull() {
            addCriterion("plc_state is null");
            return (Criteria) this;
        }

        public Criteria andPlcStateIsNotNull() {
            addCriterion("plc_state is not null");
            return (Criteria) this;
        }

        public Criteria andPlcStateEqualTo(Integer value) {
            addCriterion("plc_state =", value, "plcState");
            return (Criteria) this;
        }

        public Criteria andPlcStateNotEqualTo(Integer value) {
            addCriterion("plc_state <>", value, "plcState");
            return (Criteria) this;
        }

        public Criteria andPlcStateGreaterThan(Integer value) {
            addCriterion("plc_state >", value, "plcState");
            return (Criteria) this;
        }

        public Criteria andPlcStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("plc_state >=", value, "plcState");
            return (Criteria) this;
        }

        public Criteria andPlcStateLessThan(Integer value) {
            addCriterion("plc_state <", value, "plcState");
            return (Criteria) this;
        }

        public Criteria andPlcStateLessThanOrEqualTo(Integer value) {
            addCriterion("plc_state <=", value, "plcState");
            return (Criteria) this;
        }

        public Criteria andPlcStateIn(List<Integer> values) {
            addCriterion("plc_state in", values, "plcState");
            return (Criteria) this;
        }

        public Criteria andPlcStateNotIn(List<Integer> values) {
            addCriterion("plc_state not in", values, "plcState");
            return (Criteria) this;
        }

        public Criteria andPlcStateBetween(Integer value1, Integer value2) {
            addCriterion("plc_state between", value1, value2, "plcState");
            return (Criteria) this;
        }

        public Criteria andPlcStateNotBetween(Integer value1, Integer value2) {
            addCriterion("plc_state not between", value1, value2, "plcState");
            return (Criteria) this;
        }

        public Criteria andLlaserStateIsNull() {
            addCriterion("llaser_state is null");
            return (Criteria) this;
        }

        public Criteria andLlaserStateIsNotNull() {
            addCriterion("llaser_state is not null");
            return (Criteria) this;
        }

        public Criteria andLlaserStateEqualTo(Integer value) {
            addCriterion("llaser_state =", value, "llaserState");
            return (Criteria) this;
        }

        public Criteria andLlaserStateNotEqualTo(Integer value) {
            addCriterion("llaser_state <>", value, "llaserState");
            return (Criteria) this;
        }

        public Criteria andLlaserStateGreaterThan(Integer value) {
            addCriterion("llaser_state >", value, "llaserState");
            return (Criteria) this;
        }

        public Criteria andLlaserStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("llaser_state >=", value, "llaserState");
            return (Criteria) this;
        }

        public Criteria andLlaserStateLessThan(Integer value) {
            addCriterion("llaser_state <", value, "llaserState");
            return (Criteria) this;
        }

        public Criteria andLlaserStateLessThanOrEqualTo(Integer value) {
            addCriterion("llaser_state <=", value, "llaserState");
            return (Criteria) this;
        }

        public Criteria andLlaserStateIn(List<Integer> values) {
            addCriterion("llaser_state in", values, "llaserState");
            return (Criteria) this;
        }

        public Criteria andLlaserStateNotIn(List<Integer> values) {
            addCriterion("llaser_state not in", values, "llaserState");
            return (Criteria) this;
        }

        public Criteria andLlaserStateBetween(Integer value1, Integer value2) {
            addCriterion("llaser_state between", value1, value2, "llaserState");
            return (Criteria) this;
        }

        public Criteria andLlaserStateNotBetween(Integer value1, Integer value2) {
            addCriterion("llaser_state not between", value1, value2, "llaserState");
            return (Criteria) this;
        }

        public Criteria andRlaserStateIsNull() {
            addCriterion("rlaser_state is null");
            return (Criteria) this;
        }

        public Criteria andRlaserStateIsNotNull() {
            addCriterion("rlaser_state is not null");
            return (Criteria) this;
        }

        public Criteria andRlaserStateEqualTo(Integer value) {
            addCriterion("rlaser_state =", value, "rlaserState");
            return (Criteria) this;
        }

        public Criteria andRlaserStateNotEqualTo(Integer value) {
            addCriterion("rlaser_state <>", value, "rlaserState");
            return (Criteria) this;
        }

        public Criteria andRlaserStateGreaterThan(Integer value) {
            addCriterion("rlaser_state >", value, "rlaserState");
            return (Criteria) this;
        }

        public Criteria andRlaserStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("rlaser_state >=", value, "rlaserState");
            return (Criteria) this;
        }

        public Criteria andRlaserStateLessThan(Integer value) {
            addCriterion("rlaser_state <", value, "rlaserState");
            return (Criteria) this;
        }

        public Criteria andRlaserStateLessThanOrEqualTo(Integer value) {
            addCriterion("rlaser_state <=", value, "rlaserState");
            return (Criteria) this;
        }

        public Criteria andRlaserStateIn(List<Integer> values) {
            addCriterion("rlaser_state in", values, "rlaserState");
            return (Criteria) this;
        }

        public Criteria andRlaserStateNotIn(List<Integer> values) {
            addCriterion("rlaser_state not in", values, "rlaserState");
            return (Criteria) this;
        }

        public Criteria andRlaserStateBetween(Integer value1, Integer value2) {
            addCriterion("rlaser_state between", value1, value2, "rlaserState");
            return (Criteria) this;
        }

        public Criteria andRlaserStateNotBetween(Integer value1, Integer value2) {
            addCriterion("rlaser_state not between", value1, value2, "rlaserState");
            return (Criteria) this;
        }

        public Criteria andTempStateIsNull() {
            addCriterion("temp_state is null");
            return (Criteria) this;
        }

        public Criteria andTempStateIsNotNull() {
            addCriterion("temp_state is not null");
            return (Criteria) this;
        }

        public Criteria andTempStateEqualTo(Integer value) {
            addCriterion("temp_state =", value, "tempState");
            return (Criteria) this;
        }

        public Criteria andTempStateNotEqualTo(Integer value) {
            addCriterion("temp_state <>", value, "tempState");
            return (Criteria) this;
        }

        public Criteria andTempStateGreaterThan(Integer value) {
            addCriterion("temp_state >", value, "tempState");
            return (Criteria) this;
        }

        public Criteria andTempStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_state >=", value, "tempState");
            return (Criteria) this;
        }

        public Criteria andTempStateLessThan(Integer value) {
            addCriterion("temp_state <", value, "tempState");
            return (Criteria) this;
        }

        public Criteria andTempStateLessThanOrEqualTo(Integer value) {
            addCriterion("temp_state <=", value, "tempState");
            return (Criteria) this;
        }

        public Criteria andTempStateIn(List<Integer> values) {
            addCriterion("temp_state in", values, "tempState");
            return (Criteria) this;
        }

        public Criteria andTempStateNotIn(List<Integer> values) {
            addCriterion("temp_state not in", values, "tempState");
            return (Criteria) this;
        }

        public Criteria andTempStateBetween(Integer value1, Integer value2) {
            addCriterion("temp_state between", value1, value2, "tempState");
            return (Criteria) this;
        }

        public Criteria andTempStateNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_state not between", value1, value2, "tempState");
            return (Criteria) this;
        }

        public Criteria andUdFlagIsNull() {
            addCriterion("ud_flag is null");
            return (Criteria) this;
        }

        public Criteria andUdFlagIsNotNull() {
            addCriterion("ud_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUdFlagEqualTo(Integer value) {
            addCriterion("ud_flag =", value, "udFlag");
            return (Criteria) this;
        }

        public Criteria andUdFlagNotEqualTo(Integer value) {
            addCriterion("ud_flag <>", value, "udFlag");
            return (Criteria) this;
        }

        public Criteria andUdFlagGreaterThan(Integer value) {
            addCriterion("ud_flag >", value, "udFlag");
            return (Criteria) this;
        }

        public Criteria andUdFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("ud_flag >=", value, "udFlag");
            return (Criteria) this;
        }

        public Criteria andUdFlagLessThan(Integer value) {
            addCriterion("ud_flag <", value, "udFlag");
            return (Criteria) this;
        }

        public Criteria andUdFlagLessThanOrEqualTo(Integer value) {
            addCriterion("ud_flag <=", value, "udFlag");
            return (Criteria) this;
        }

        public Criteria andUdFlagIn(List<Integer> values) {
            addCriterion("ud_flag in", values, "udFlag");
            return (Criteria) this;
        }

        public Criteria andUdFlagNotIn(List<Integer> values) {
            addCriterion("ud_flag not in", values, "udFlag");
            return (Criteria) this;
        }

        public Criteria andUdFlagBetween(Integer value1, Integer value2) {
            addCriterion("ud_flag between", value1, value2, "udFlag");
            return (Criteria) this;
        }

        public Criteria andUdFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("ud_flag not between", value1, value2, "udFlag");
            return (Criteria) this;
        }

        public Criteria andTrainDateIsNull() {
            addCriterion("train_date is null");
            return (Criteria) this;
        }

        public Criteria andTrainDateIsNotNull() {
            addCriterion("train_date is not null");
            return (Criteria) this;
        }

        public Criteria andTrainDateEqualTo(Date value) {
            addCriterion("train_date =", value, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateNotEqualTo(Date value) {
            addCriterion("train_date <>", value, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateGreaterThan(Date value) {
            addCriterion("train_date >", value, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateGreaterThanOrEqualTo(Date value) {
            addCriterion("train_date >=", value, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateLessThan(Date value) {
            addCriterion("train_date <", value, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateLessThanOrEqualTo(Date value) {
            addCriterion("train_date <=", value, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateIn(List<Date> values) {
            addCriterion("train_date in", values, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateNotIn(List<Date> values) {
            addCriterion("train_date not in", values, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateBetween(Date value1, Date value2) {
            addCriterion("train_date between", value1, value2, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateNotBetween(Date value1, Date value2) {
            addCriterion("train_date not between", value1, value2, "trainDate");
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
package com.wxy.model;

import java.util.ArrayList;
import java.util.List;

public class PeopleintensionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PeopleintensionExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andXueliweightIsNull() {
            addCriterion("xueliWeight is null");
            return (Criteria) this;
        }

        public Criteria andXueliweightIsNotNull() {
            addCriterion("xueliWeight is not null");
            return (Criteria) this;
        }

        public Criteria andXueliweightEqualTo(Integer value) {
            addCriterion("xueliWeight =", value, "xueliweight");
            return (Criteria) this;
        }

        public Criteria andXueliweightNotEqualTo(Integer value) {
            addCriterion("xueliWeight <>", value, "xueliweight");
            return (Criteria) this;
        }

        public Criteria andXueliweightGreaterThan(Integer value) {
            addCriterion("xueliWeight >", value, "xueliweight");
            return (Criteria) this;
        }

        public Criteria andXueliweightGreaterThanOrEqualTo(Integer value) {
            addCriterion("xueliWeight >=", value, "xueliweight");
            return (Criteria) this;
        }

        public Criteria andXueliweightLessThan(Integer value) {
            addCriterion("xueliWeight <", value, "xueliweight");
            return (Criteria) this;
        }

        public Criteria andXueliweightLessThanOrEqualTo(Integer value) {
            addCriterion("xueliWeight <=", value, "xueliweight");
            return (Criteria) this;
        }

        public Criteria andXueliweightIn(List<Integer> values) {
            addCriterion("xueliWeight in", values, "xueliweight");
            return (Criteria) this;
        }

        public Criteria andXueliweightNotIn(List<Integer> values) {
            addCriterion("xueliWeight not in", values, "xueliweight");
            return (Criteria) this;
        }

        public Criteria andXueliweightBetween(Integer value1, Integer value2) {
            addCriterion("xueliWeight between", value1, value2, "xueliweight");
            return (Criteria) this;
        }

        public Criteria andXueliweightNotBetween(Integer value1, Integer value2) {
            addCriterion("xueliWeight not between", value1, value2, "xueliweight");
            return (Criteria) this;
        }

        public Criteria andWorkexpweightIsNull() {
            addCriterion("workexpWeight is null");
            return (Criteria) this;
        }

        public Criteria andWorkexpweightIsNotNull() {
            addCriterion("workexpWeight is not null");
            return (Criteria) this;
        }

        public Criteria andWorkexpweightEqualTo(Integer value) {
            addCriterion("workexpWeight =", value, "workexpweight");
            return (Criteria) this;
        }

        public Criteria andWorkexpweightNotEqualTo(Integer value) {
            addCriterion("workexpWeight <>", value, "workexpweight");
            return (Criteria) this;
        }

        public Criteria andWorkexpweightGreaterThan(Integer value) {
            addCriterion("workexpWeight >", value, "workexpweight");
            return (Criteria) this;
        }

        public Criteria andWorkexpweightGreaterThanOrEqualTo(Integer value) {
            addCriterion("workexpWeight >=", value, "workexpweight");
            return (Criteria) this;
        }

        public Criteria andWorkexpweightLessThan(Integer value) {
            addCriterion("workexpWeight <", value, "workexpweight");
            return (Criteria) this;
        }

        public Criteria andWorkexpweightLessThanOrEqualTo(Integer value) {
            addCriterion("workexpWeight <=", value, "workexpweight");
            return (Criteria) this;
        }

        public Criteria andWorkexpweightIn(List<Integer> values) {
            addCriterion("workexpWeight in", values, "workexpweight");
            return (Criteria) this;
        }

        public Criteria andWorkexpweightNotIn(List<Integer> values) {
            addCriterion("workexpWeight not in", values, "workexpweight");
            return (Criteria) this;
        }

        public Criteria andWorkexpweightBetween(Integer value1, Integer value2) {
            addCriterion("workexpWeight between", value1, value2, "workexpweight");
            return (Criteria) this;
        }

        public Criteria andWorkexpweightNotBetween(Integer value1, Integer value2) {
            addCriterion("workexpWeight not between", value1, value2, "workexpweight");
            return (Criteria) this;
        }

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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
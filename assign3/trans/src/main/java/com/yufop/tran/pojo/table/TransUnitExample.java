package com.yufop.tran.pojo.table;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransUnitExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table transunit
     *
     * @mbggenerated Sun Jun 18 19:39:34 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table transunit
     *
     * @mbggenerated Sun Jun 18 19:39:34 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table transunit
     *
     * @mbggenerated Sun Jun 18 19:39:34 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Sun Jun 18 19:39:34 CST 2023
     */
    public TransUnitExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Sun Jun 18 19:39:34 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Sun Jun 18 19:39:34 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Sun Jun 18 19:39:34 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Sun Jun 18 19:39:34 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Sun Jun 18 19:39:34 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Sun Jun 18 19:39:34 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Sun Jun 18 19:39:34 CST 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Sun Jun 18 19:39:34 CST 2023
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
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Sun Jun 18 19:39:34 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Sun Jun 18 19:39:34 CST 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table transunit
     *
     * @mbggenerated Sun Jun 18 19:39:34 CST 2023
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

        public Criteria andTransunitidIsNull() {
            addCriterion("transunitId is null");
            return (Criteria) this;
        }

        public Criteria andTransunitidIsNotNull() {
            addCriterion("transunitId is not null");
            return (Criteria) this;
        }

        public Criteria andTransunitidEqualTo(Integer value) {
            addCriterion("transunitId =", value, "transunitid");
            return (Criteria) this;
        }

        public Criteria andTransunitidNotEqualTo(Integer value) {
            addCriterion("transunitId <>", value, "transunitid");
            return (Criteria) this;
        }

        public Criteria andTransunitidGreaterThan(Integer value) {
            addCriterion("transunitId >", value, "transunitid");
            return (Criteria) this;
        }

        public Criteria andTransunitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("transunitId >=", value, "transunitid");
            return (Criteria) this;
        }

        public Criteria andTransunitidLessThan(Integer value) {
            addCriterion("transunitId <", value, "transunitid");
            return (Criteria) this;
        }

        public Criteria andTransunitidLessThanOrEqualTo(Integer value) {
            addCriterion("transunitId <=", value, "transunitid");
            return (Criteria) this;
        }

        public Criteria andTransunitidIn(List<Integer> values) {
            addCriterion("transunitId in", values, "transunitid");
            return (Criteria) this;
        }

        public Criteria andTransunitidNotIn(List<Integer> values) {
            addCriterion("transunitId not in", values, "transunitid");
            return (Criteria) this;
        }

        public Criteria andTransunitidBetween(Integer value1, Integer value2) {
            addCriterion("transunitId between", value1, value2, "transunitid");
            return (Criteria) this;
        }

        public Criteria andTransunitidNotBetween(Integer value1, Integer value2) {
            addCriterion("transunitId not between", value1, value2, "transunitid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andContactemailIsNull() {
            addCriterion("contactemail is null");
            return (Criteria) this;
        }

        public Criteria andContactemailIsNotNull() {
            addCriterion("contactemail is not null");
            return (Criteria) this;
        }

        public Criteria andContactemailEqualTo(String value) {
            addCriterion("contactemail =", value, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailNotEqualTo(String value) {
            addCriterion("contactemail <>", value, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailGreaterThan(String value) {
            addCriterion("contactemail >", value, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailGreaterThanOrEqualTo(String value) {
            addCriterion("contactemail >=", value, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailLessThan(String value) {
            addCriterion("contactemail <", value, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailLessThanOrEqualTo(String value) {
            addCriterion("contactemail <=", value, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailLike(String value) {
            addCriterion("contactemail like", value, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailNotLike(String value) {
            addCriterion("contactemail not like", value, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailIn(List<String> values) {
            addCriterion("contactemail in", values, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailNotIn(List<String> values) {
            addCriterion("contactemail not in", values, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailBetween(String value1, String value2) {
            addCriterion("contactemail between", value1, value2, "contactemail");
            return (Criteria) this;
        }

        public Criteria andContactemailNotBetween(String value1, String value2) {
            addCriterion("contactemail not between", value1, value2, "contactemail");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeIsNull() {
            addCriterion("Registrationtime is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeIsNotNull() {
            addCriterion("Registrationtime is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeEqualTo(Date value) {
            addCriterion("Registrationtime =", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeNotEqualTo(Date value) {
            addCriterion("Registrationtime <>", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeGreaterThan(Date value) {
            addCriterion("Registrationtime >", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Registrationtime >=", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeLessThan(Date value) {
            addCriterion("Registrationtime <", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeLessThanOrEqualTo(Date value) {
            addCriterion("Registrationtime <=", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeIn(List<Date> values) {
            addCriterion("Registrationtime in", values, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeNotIn(List<Date> values) {
            addCriterion("Registrationtime not in", values, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeBetween(Date value1, Date value2) {
            addCriterion("Registrationtime between", value1, value2, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeNotBetween(Date value1, Date value2) {
            addCriterion("Registrationtime not between", value1, value2, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andTransittypeIsNull() {
            addCriterion("transittype is null");
            return (Criteria) this;
        }

        public Criteria andTransittypeIsNotNull() {
            addCriterion("transittype is not null");
            return (Criteria) this;
        }

        public Criteria andTransittypeEqualTo(Integer value) {
            addCriterion("transittype =", value, "transittype");
            return (Criteria) this;
        }

        public Criteria andTransittypeNotEqualTo(Integer value) {
            addCriterion("transittype <>", value, "transittype");
            return (Criteria) this;
        }

        public Criteria andTransittypeGreaterThan(Integer value) {
            addCriterion("transittype >", value, "transittype");
            return (Criteria) this;
        }

        public Criteria andTransittypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("transittype >=", value, "transittype");
            return (Criteria) this;
        }

        public Criteria andTransittypeLessThan(Integer value) {
            addCriterion("transittype <", value, "transittype");
            return (Criteria) this;
        }

        public Criteria andTransittypeLessThanOrEqualTo(Integer value) {
            addCriterion("transittype <=", value, "transittype");
            return (Criteria) this;
        }

        public Criteria andTransittypeIn(List<Integer> values) {
            addCriterion("transittype in", values, "transittype");
            return (Criteria) this;
        }

        public Criteria andTransittypeNotIn(List<Integer> values) {
            addCriterion("transittype not in", values, "transittype");
            return (Criteria) this;
        }

        public Criteria andTransittypeBetween(Integer value1, Integer value2) {
            addCriterion("transittype between", value1, value2, "transittype");
            return (Criteria) this;
        }

        public Criteria andTransittypeNotBetween(Integer value1, Integer value2) {
            addCriterion("transittype not between", value1, value2, "transittype");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table transunit
     *
     * @mbggenerated do_not_delete_during_merge Sun Jun 18 19:39:34 CST 2023
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table transunit
     *
     * @mbggenerated Sun Jun 18 19:39:34 CST 2023
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}
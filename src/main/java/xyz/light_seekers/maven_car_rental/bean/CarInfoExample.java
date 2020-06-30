package xyz.light_seekers.maven_car_rental.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CarInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
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

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andMotorNumberIsNull() {
            addCriterion("motor_number is null");
            return (Criteria) this;
        }

        public Criteria andMotorNumberIsNotNull() {
            addCriterion("motor_number is not null");
            return (Criteria) this;
        }

        public Criteria andMotorNumberEqualTo(String value) {
            addCriterion("motor_number =", value, "motorNumber");
            return (Criteria) this;
        }

        public Criteria andMotorNumberNotEqualTo(String value) {
            addCriterion("motor_number <>", value, "motorNumber");
            return (Criteria) this;
        }

        public Criteria andMotorNumberGreaterThan(String value) {
            addCriterion("motor_number >", value, "motorNumber");
            return (Criteria) this;
        }

        public Criteria andMotorNumberGreaterThanOrEqualTo(String value) {
            addCriterion("motor_number >=", value, "motorNumber");
            return (Criteria) this;
        }

        public Criteria andMotorNumberLessThan(String value) {
            addCriterion("motor_number <", value, "motorNumber");
            return (Criteria) this;
        }

        public Criteria andMotorNumberLessThanOrEqualTo(String value) {
            addCriterion("motor_number <=", value, "motorNumber");
            return (Criteria) this;
        }

        public Criteria andMotorNumberLike(String value) {
            addCriterion("motor_number like", value, "motorNumber");
            return (Criteria) this;
        }

        public Criteria andMotorNumberNotLike(String value) {
            addCriterion("motor_number not like", value, "motorNumber");
            return (Criteria) this;
        }

        public Criteria andMotorNumberIn(List<String> values) {
            addCriterion("motor_number in", values, "motorNumber");
            return (Criteria) this;
        }

        public Criteria andMotorNumberNotIn(List<String> values) {
            addCriterion("motor_number not in", values, "motorNumber");
            return (Criteria) this;
        }

        public Criteria andMotorNumberBetween(String value1, String value2) {
            addCriterion("motor_number between", value1, value2, "motorNumber");
            return (Criteria) this;
        }

        public Criteria andMotorNumberNotBetween(String value1, String value2) {
            addCriterion("motor_number not between", value1, value2, "motorNumber");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberIsNull() {
            addCriterion("carriage_number is null");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberIsNotNull() {
            addCriterion("carriage_number is not null");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberEqualTo(String value) {
            addCriterion("carriage_number =", value, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberNotEqualTo(String value) {
            addCriterion("carriage_number <>", value, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberGreaterThan(String value) {
            addCriterion("carriage_number >", value, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberGreaterThanOrEqualTo(String value) {
            addCriterion("carriage_number >=", value, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberLessThan(String value) {
            addCriterion("carriage_number <", value, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberLessThanOrEqualTo(String value) {
            addCriterion("carriage_number <=", value, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberLike(String value) {
            addCriterion("carriage_number like", value, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberNotLike(String value) {
            addCriterion("carriage_number not like", value, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberIn(List<String> values) {
            addCriterion("carriage_number in", values, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberNotIn(List<String> values) {
            addCriterion("carriage_number not in", values, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberBetween(String value1, String value2) {
            addCriterion("carriage_number between", value1, value2, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberNotBetween(String value1, String value2) {
            addCriterion("carriage_number not between", value1, value2, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIsNull() {
            addCriterion("purchase_date is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIsNotNull() {
            addCriterion("purchase_date is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_date =", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_date <>", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("purchase_date >", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_date >=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThan(Date value) {
            addCriterionForJDBCDate("purchase_date <", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_date <=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIn(List<Date> values) {
            addCriterionForJDBCDate("purchase_date in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("purchase_date not in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("purchase_date between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("purchase_date not between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberIsNull() {
            addCriterion("policy_number is null");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberIsNotNull() {
            addCriterion("policy_number is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberEqualTo(String value) {
            addCriterion("policy_number =", value, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberNotEqualTo(String value) {
            addCriterion("policy_number <>", value, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberGreaterThan(String value) {
            addCriterion("policy_number >", value, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberGreaterThanOrEqualTo(String value) {
            addCriterion("policy_number >=", value, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberLessThan(String value) {
            addCriterion("policy_number <", value, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberLessThanOrEqualTo(String value) {
            addCriterion("policy_number <=", value, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberLike(String value) {
            addCriterion("policy_number like", value, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberNotLike(String value) {
            addCriterion("policy_number not like", value, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberIn(List<String> values) {
            addCriterion("policy_number in", values, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberNotIn(List<String> values) {
            addCriterion("policy_number not in", values, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberBetween(String value1, String value2) {
            addCriterion("policy_number between", value1, value2, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberNotBetween(String value1, String value2) {
            addCriterion("policy_number not between", value1, value2, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompaniesIdIsNull() {
            addCriterion("insurance_companies_id is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompaniesIdIsNotNull() {
            addCriterion("insurance_companies_id is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompaniesIdEqualTo(Integer value) {
            addCriterion("insurance_companies_id =", value, "insuranceCompaniesId");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompaniesIdNotEqualTo(Integer value) {
            addCriterion("insurance_companies_id <>", value, "insuranceCompaniesId");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompaniesIdGreaterThan(Integer value) {
            addCriterion("insurance_companies_id >", value, "insuranceCompaniesId");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompaniesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("insurance_companies_id >=", value, "insuranceCompaniesId");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompaniesIdLessThan(Integer value) {
            addCriterion("insurance_companies_id <", value, "insuranceCompaniesId");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompaniesIdLessThanOrEqualTo(Integer value) {
            addCriterion("insurance_companies_id <=", value, "insuranceCompaniesId");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompaniesIdIn(List<Integer> values) {
            addCriterion("insurance_companies_id in", values, "insuranceCompaniesId");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompaniesIdNotIn(List<Integer> values) {
            addCriterion("insurance_companies_id not in", values, "insuranceCompaniesId");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompaniesIdBetween(Integer value1, Integer value2) {
            addCriterion("insurance_companies_id between", value1, value2, "insuranceCompaniesId");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompaniesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("insurance_companies_id not between", value1, value2, "insuranceCompaniesId");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryIsNull() {
            addCriterion("insurance_category is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryIsNotNull() {
            addCriterion("insurance_category is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryEqualTo(Integer value) {
            addCriterion("insurance_category =", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryNotEqualTo(Integer value) {
            addCriterion("insurance_category <>", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryGreaterThan(Integer value) {
            addCriterion("insurance_category >", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("insurance_category >=", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryLessThan(Integer value) {
            addCriterion("insurance_category <", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("insurance_category <=", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryIn(List<Integer> values) {
            addCriterion("insurance_category in", values, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryNotIn(List<Integer> values) {
            addCriterion("insurance_category not in", values, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryBetween(Integer value1, Integer value2) {
            addCriterion("insurance_category between", value1, value2, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("insurance_category not between", value1, value2, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andCommencementDateIsNull() {
            addCriterion("commencement_date is null");
            return (Criteria) this;
        }

        public Criteria andCommencementDateIsNotNull() {
            addCriterion("commencement_date is not null");
            return (Criteria) this;
        }

        public Criteria andCommencementDateEqualTo(Date value) {
            addCriterionForJDBCDate("commencement_date =", value, "commencementDate");
            return (Criteria) this;
        }

        public Criteria andCommencementDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("commencement_date <>", value, "commencementDate");
            return (Criteria) this;
        }

        public Criteria andCommencementDateGreaterThan(Date value) {
            addCriterionForJDBCDate("commencement_date >", value, "commencementDate");
            return (Criteria) this;
        }

        public Criteria andCommencementDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commencement_date >=", value, "commencementDate");
            return (Criteria) this;
        }

        public Criteria andCommencementDateLessThan(Date value) {
            addCriterionForJDBCDate("commencement_date <", value, "commencementDate");
            return (Criteria) this;
        }

        public Criteria andCommencementDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commencement_date <=", value, "commencementDate");
            return (Criteria) this;
        }

        public Criteria andCommencementDateIn(List<Date> values) {
            addCriterionForJDBCDate("commencement_date in", values, "commencementDate");
            return (Criteria) this;
        }

        public Criteria andCommencementDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("commencement_date not in", values, "commencementDate");
            return (Criteria) this;
        }

        public Criteria andCommencementDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commencement_date between", value1, value2, "commencementDate");
            return (Criteria) this;
        }

        public Criteria andCommencementDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commencement_date not between", value1, value2, "commencementDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(Double value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(Double value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(Double value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(Double value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(Double value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(Double value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<Double> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<Double> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(Double value1, Double value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(Double value1, Double value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDailyRentalIsNull() {
            addCriterion("daily_rental is null");
            return (Criteria) this;
        }

        public Criteria andDailyRentalIsNotNull() {
            addCriterion("daily_rental is not null");
            return (Criteria) this;
        }

        public Criteria andDailyRentalEqualTo(Double value) {
            addCriterion("daily_rental =", value, "dailyRental");
            return (Criteria) this;
        }

        public Criteria andDailyRentalNotEqualTo(Double value) {
            addCriterion("daily_rental <>", value, "dailyRental");
            return (Criteria) this;
        }

        public Criteria andDailyRentalGreaterThan(Double value) {
            addCriterion("daily_rental >", value, "dailyRental");
            return (Criteria) this;
        }

        public Criteria andDailyRentalGreaterThanOrEqualTo(Double value) {
            addCriterion("daily_rental >=", value, "dailyRental");
            return (Criteria) this;
        }

        public Criteria andDailyRentalLessThan(Double value) {
            addCriterion("daily_rental <", value, "dailyRental");
            return (Criteria) this;
        }

        public Criteria andDailyRentalLessThanOrEqualTo(Double value) {
            addCriterion("daily_rental <=", value, "dailyRental");
            return (Criteria) this;
        }

        public Criteria andDailyRentalIn(List<Double> values) {
            addCriterion("daily_rental in", values, "dailyRental");
            return (Criteria) this;
        }

        public Criteria andDailyRentalNotIn(List<Double> values) {
            addCriterion("daily_rental not in", values, "dailyRental");
            return (Criteria) this;
        }

        public Criteria andDailyRentalBetween(Double value1, Double value2) {
            addCriterion("daily_rental between", value1, value2, "dailyRental");
            return (Criteria) this;
        }

        public Criteria andDailyRentalNotBetween(Double value1, Double value2) {
            addCriterion("daily_rental not between", value1, value2, "dailyRental");
            return (Criteria) this;
        }

        public Criteria andWeeklyRentalIsNull() {
            addCriterion("weekly_rental is null");
            return (Criteria) this;
        }

        public Criteria andWeeklyRentalIsNotNull() {
            addCriterion("weekly_rental is not null");
            return (Criteria) this;
        }

        public Criteria andWeeklyRentalEqualTo(Double value) {
            addCriterion("weekly_rental =", value, "weeklyRental");
            return (Criteria) this;
        }

        public Criteria andWeeklyRentalNotEqualTo(Double value) {
            addCriterion("weekly_rental <>", value, "weeklyRental");
            return (Criteria) this;
        }

        public Criteria andWeeklyRentalGreaterThan(Double value) {
            addCriterion("weekly_rental >", value, "weeklyRental");
            return (Criteria) this;
        }

        public Criteria andWeeklyRentalGreaterThanOrEqualTo(Double value) {
            addCriterion("weekly_rental >=", value, "weeklyRental");
            return (Criteria) this;
        }

        public Criteria andWeeklyRentalLessThan(Double value) {
            addCriterion("weekly_rental <", value, "weeklyRental");
            return (Criteria) this;
        }

        public Criteria andWeeklyRentalLessThanOrEqualTo(Double value) {
            addCriterion("weekly_rental <=", value, "weeklyRental");
            return (Criteria) this;
        }

        public Criteria andWeeklyRentalIn(List<Double> values) {
            addCriterion("weekly_rental in", values, "weeklyRental");
            return (Criteria) this;
        }

        public Criteria andWeeklyRentalNotIn(List<Double> values) {
            addCriterion("weekly_rental not in", values, "weeklyRental");
            return (Criteria) this;
        }

        public Criteria andWeeklyRentalBetween(Double value1, Double value2) {
            addCriterion("weekly_rental between", value1, value2, "weeklyRental");
            return (Criteria) this;
        }

        public Criteria andWeeklyRentalNotBetween(Double value1, Double value2) {
            addCriterion("weekly_rental not between", value1, value2, "weeklyRental");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentalIsNull() {
            addCriterion("monthly_rental is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentalIsNotNull() {
            addCriterion("monthly_rental is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentalEqualTo(Double value) {
            addCriterion("monthly_rental =", value, "monthlyRental");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentalNotEqualTo(Double value) {
            addCriterion("monthly_rental <>", value, "monthlyRental");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentalGreaterThan(Double value) {
            addCriterion("monthly_rental >", value, "monthlyRental");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentalGreaterThanOrEqualTo(Double value) {
            addCriterion("monthly_rental >=", value, "monthlyRental");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentalLessThan(Double value) {
            addCriterion("monthly_rental <", value, "monthlyRental");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentalLessThanOrEqualTo(Double value) {
            addCriterion("monthly_rental <=", value, "monthlyRental");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentalIn(List<Double> values) {
            addCriterion("monthly_rental in", values, "monthlyRental");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentalNotIn(List<Double> values) {
            addCriterion("monthly_rental not in", values, "monthlyRental");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentalBetween(Double value1, Double value2) {
            addCriterion("monthly_rental between", value1, value2, "monthlyRental");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentalNotBetween(Double value1, Double value2) {
            addCriterion("monthly_rental not between", value1, value2, "monthlyRental");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalIsNull() {
            addCriterion("weekend_rental is null");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalIsNotNull() {
            addCriterion("weekend_rental is not null");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalEqualTo(Double value) {
            addCriterion("weekend_rental =", value, "weekendRental");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalNotEqualTo(Double value) {
            addCriterion("weekend_rental <>", value, "weekendRental");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalGreaterThan(Double value) {
            addCriterion("weekend_rental >", value, "weekendRental");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalGreaterThanOrEqualTo(Double value) {
            addCriterion("weekend_rental >=", value, "weekendRental");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalLessThan(Double value) {
            addCriterion("weekend_rental <", value, "weekendRental");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalLessThanOrEqualTo(Double value) {
            addCriterion("weekend_rental <=", value, "weekendRental");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalIn(List<Double> values) {
            addCriterion("weekend_rental in", values, "weekendRental");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalNotIn(List<Double> values) {
            addCriterion("weekend_rental not in", values, "weekendRental");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalBetween(Double value1, Double value2) {
            addCriterion("weekend_rental between", value1, value2, "weekendRental");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalNotBetween(Double value1, Double value2) {
            addCriterion("weekend_rental not between", value1, value2, "weekendRental");
            return (Criteria) this;
        }

        public Criteria andLimitedKilometersIsNull() {
            addCriterion("limited_kilometers is null");
            return (Criteria) this;
        }

        public Criteria andLimitedKilometersIsNotNull() {
            addCriterion("limited_kilometers is not null");
            return (Criteria) this;
        }

        public Criteria andLimitedKilometersEqualTo(Double value) {
            addCriterion("limited_kilometers =", value, "limitedKilometers");
            return (Criteria) this;
        }

        public Criteria andLimitedKilometersNotEqualTo(Double value) {
            addCriterion("limited_kilometers <>", value, "limitedKilometers");
            return (Criteria) this;
        }

        public Criteria andLimitedKilometersGreaterThan(Double value) {
            addCriterion("limited_kilometers >", value, "limitedKilometers");
            return (Criteria) this;
        }

        public Criteria andLimitedKilometersGreaterThanOrEqualTo(Double value) {
            addCriterion("limited_kilometers >=", value, "limitedKilometers");
            return (Criteria) this;
        }

        public Criteria andLimitedKilometersLessThan(Double value) {
            addCriterion("limited_kilometers <", value, "limitedKilometers");
            return (Criteria) this;
        }

        public Criteria andLimitedKilometersLessThanOrEqualTo(Double value) {
            addCriterion("limited_kilometers <=", value, "limitedKilometers");
            return (Criteria) this;
        }

        public Criteria andLimitedKilometersIn(List<Double> values) {
            addCriterion("limited_kilometers in", values, "limitedKilometers");
            return (Criteria) this;
        }

        public Criteria andLimitedKilometersNotIn(List<Double> values) {
            addCriterion("limited_kilometers not in", values, "limitedKilometers");
            return (Criteria) this;
        }

        public Criteria andLimitedKilometersBetween(Double value1, Double value2) {
            addCriterion("limited_kilometers between", value1, value2, "limitedKilometers");
            return (Criteria) this;
        }

        public Criteria andLimitedKilometersNotBetween(Double value1, Double value2) {
            addCriterion("limited_kilometers not between", value1, value2, "limitedKilometers");
            return (Criteria) this;
        }

        public Criteria andTimeoutRentalIsNull() {
            addCriterion("timeout_rental is null");
            return (Criteria) this;
        }

        public Criteria andTimeoutRentalIsNotNull() {
            addCriterion("timeout_rental is not null");
            return (Criteria) this;
        }

        public Criteria andTimeoutRentalEqualTo(Double value) {
            addCriterion("timeout_rental =", value, "timeoutRental");
            return (Criteria) this;
        }

        public Criteria andTimeoutRentalNotEqualTo(Double value) {
            addCriterion("timeout_rental <>", value, "timeoutRental");
            return (Criteria) this;
        }

        public Criteria andTimeoutRentalGreaterThan(Double value) {
            addCriterion("timeout_rental >", value, "timeoutRental");
            return (Criteria) this;
        }

        public Criteria andTimeoutRentalGreaterThanOrEqualTo(Double value) {
            addCriterion("timeout_rental >=", value, "timeoutRental");
            return (Criteria) this;
        }

        public Criteria andTimeoutRentalLessThan(Double value) {
            addCriterion("timeout_rental <", value, "timeoutRental");
            return (Criteria) this;
        }

        public Criteria andTimeoutRentalLessThanOrEqualTo(Double value) {
            addCriterion("timeout_rental <=", value, "timeoutRental");
            return (Criteria) this;
        }

        public Criteria andTimeoutRentalIn(List<Double> values) {
            addCriterion("timeout_rental in", values, "timeoutRental");
            return (Criteria) this;
        }

        public Criteria andTimeoutRentalNotIn(List<Double> values) {
            addCriterion("timeout_rental not in", values, "timeoutRental");
            return (Criteria) this;
        }

        public Criteria andTimeoutRentalBetween(Double value1, Double value2) {
            addCriterion("timeout_rental between", value1, value2, "timeoutRental");
            return (Criteria) this;
        }

        public Criteria andTimeoutRentalNotBetween(Double value1, Double value2) {
            addCriterion("timeout_rental not between", value1, value2, "timeoutRental");
            return (Criteria) this;
        }

        public Criteria andOverKmRentalIsNull() {
            addCriterion("over_km_rental is null");
            return (Criteria) this;
        }

        public Criteria andOverKmRentalIsNotNull() {
            addCriterion("over_km_rental is not null");
            return (Criteria) this;
        }

        public Criteria andOverKmRentalEqualTo(Double value) {
            addCriterion("over_km_rental =", value, "overKmRental");
            return (Criteria) this;
        }

        public Criteria andOverKmRentalNotEqualTo(Double value) {
            addCriterion("over_km_rental <>", value, "overKmRental");
            return (Criteria) this;
        }

        public Criteria andOverKmRentalGreaterThan(Double value) {
            addCriterion("over_km_rental >", value, "overKmRental");
            return (Criteria) this;
        }

        public Criteria andOverKmRentalGreaterThanOrEqualTo(Double value) {
            addCriterion("over_km_rental >=", value, "overKmRental");
            return (Criteria) this;
        }

        public Criteria andOverKmRentalLessThan(Double value) {
            addCriterion("over_km_rental <", value, "overKmRental");
            return (Criteria) this;
        }

        public Criteria andOverKmRentalLessThanOrEqualTo(Double value) {
            addCriterion("over_km_rental <=", value, "overKmRental");
            return (Criteria) this;
        }

        public Criteria andOverKmRentalIn(List<Double> values) {
            addCriterion("over_km_rental in", values, "overKmRental");
            return (Criteria) this;
        }

        public Criteria andOverKmRentalNotIn(List<Double> values) {
            addCriterion("over_km_rental not in", values, "overKmRental");
            return (Criteria) this;
        }

        public Criteria andOverKmRentalBetween(Double value1, Double value2) {
            addCriterion("over_km_rental between", value1, value2, "overKmRental");
            return (Criteria) this;
        }

        public Criteria andOverKmRentalNotBetween(Double value1, Double value2) {
            addCriterion("over_km_rental not between", value1, value2, "overKmRental");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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
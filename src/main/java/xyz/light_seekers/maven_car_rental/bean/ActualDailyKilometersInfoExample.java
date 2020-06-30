package xyz.light_seekers.maven_car_rental.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ActualDailyKilometersInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActualDailyKilometersInfoExample() {
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

        public Criteria andRentalIdIsNull() {
            addCriterion("rental_id is null");
            return (Criteria) this;
        }

        public Criteria andRentalIdIsNotNull() {
            addCriterion("rental_id is not null");
            return (Criteria) this;
        }

        public Criteria andRentalIdEqualTo(String value) {
            addCriterion("rental_id =", value, "rentalId");
            return (Criteria) this;
        }

        public Criteria andRentalIdNotEqualTo(String value) {
            addCriterion("rental_id <>", value, "rentalId");
            return (Criteria) this;
        }

        public Criteria andRentalIdGreaterThan(String value) {
            addCriterion("rental_id >", value, "rentalId");
            return (Criteria) this;
        }

        public Criteria andRentalIdGreaterThanOrEqualTo(String value) {
            addCriterion("rental_id >=", value, "rentalId");
            return (Criteria) this;
        }

        public Criteria andRentalIdLessThan(String value) {
            addCriterion("rental_id <", value, "rentalId");
            return (Criteria) this;
        }

        public Criteria andRentalIdLessThanOrEqualTo(String value) {
            addCriterion("rental_id <=", value, "rentalId");
            return (Criteria) this;
        }

        public Criteria andRentalIdLike(String value) {
            addCriterion("rental_id like", value, "rentalId");
            return (Criteria) this;
        }

        public Criteria andRentalIdNotLike(String value) {
            addCriterion("rental_id not like", value, "rentalId");
            return (Criteria) this;
        }

        public Criteria andRentalIdIn(List<String> values) {
            addCriterion("rental_id in", values, "rentalId");
            return (Criteria) this;
        }

        public Criteria andRentalIdNotIn(List<String> values) {
            addCriterion("rental_id not in", values, "rentalId");
            return (Criteria) this;
        }

        public Criteria andRentalIdBetween(String value1, String value2) {
            addCriterion("rental_id between", value1, value2, "rentalId");
            return (Criteria) this;
        }

        public Criteria andRentalIdNotBetween(String value1, String value2) {
            addCriterion("rental_id not between", value1, value2, "rentalId");
            return (Criteria) this;
        }

        public Criteria andDailyKilometersIsNull() {
            addCriterion("daily_kilometers is null");
            return (Criteria) this;
        }

        public Criteria andDailyKilometersIsNotNull() {
            addCriterion("daily_kilometers is not null");
            return (Criteria) this;
        }

        public Criteria andDailyKilometersEqualTo(Double value) {
            addCriterion("daily_kilometers =", value, "dailyKilometers");
            return (Criteria) this;
        }

        public Criteria andDailyKilometersNotEqualTo(Double value) {
            addCriterion("daily_kilometers <>", value, "dailyKilometers");
            return (Criteria) this;
        }

        public Criteria andDailyKilometersGreaterThan(Double value) {
            addCriterion("daily_kilometers >", value, "dailyKilometers");
            return (Criteria) this;
        }

        public Criteria andDailyKilometersGreaterThanOrEqualTo(Double value) {
            addCriterion("daily_kilometers >=", value, "dailyKilometers");
            return (Criteria) this;
        }

        public Criteria andDailyKilometersLessThan(Double value) {
            addCriterion("daily_kilometers <", value, "dailyKilometers");
            return (Criteria) this;
        }

        public Criteria andDailyKilometersLessThanOrEqualTo(Double value) {
            addCriterion("daily_kilometers <=", value, "dailyKilometers");
            return (Criteria) this;
        }

        public Criteria andDailyKilometersIn(List<Double> values) {
            addCriterion("daily_kilometers in", values, "dailyKilometers");
            return (Criteria) this;
        }

        public Criteria andDailyKilometersNotIn(List<Double> values) {
            addCriterion("daily_kilometers not in", values, "dailyKilometers");
            return (Criteria) this;
        }

        public Criteria andDailyKilometersBetween(Double value1, Double value2) {
            addCriterion("daily_kilometers between", value1, value2, "dailyKilometers");
            return (Criteria) this;
        }

        public Criteria andDailyKilometersNotBetween(Double value1, Double value2) {
            addCriterion("daily_kilometers not between", value1, value2, "dailyKilometers");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterionForJDBCDate("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterionForJDBCDate("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterionForJDBCDate("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time not between", value1, value2, "time");
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
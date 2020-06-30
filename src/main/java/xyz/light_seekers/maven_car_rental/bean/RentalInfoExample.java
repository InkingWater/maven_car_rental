package xyz.light_seekers.maven_car_rental.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RentalInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RentalInfoExample() {
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

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(String value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(String value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(String value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(String value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(String value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(String value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLike(String value) {
            addCriterion("car_id like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotLike(String value) {
            addCriterion("car_id not like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<String> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<String> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(String value1, String value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(String value1, String value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(String value) {
            addCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(String value) {
            addCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(String value) {
            addCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(String value) {
            addCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLike(String value) {
            addCriterion("employee_id like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotLike(String value) {
            addCriterion("employee_id not like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<String> values) {
            addCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<String> values) {
            addCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(String value1, String value2) {
            addCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andRentalDateIsNull() {
            addCriterion("rental_date is null");
            return (Criteria) this;
        }

        public Criteria andRentalDateIsNotNull() {
            addCriterion("rental_date is not null");
            return (Criteria) this;
        }

        public Criteria andRentalDateEqualTo(Date value) {
            addCriterionForJDBCDate("rental_date =", value, "rentalDate");
            return (Criteria) this;
        }

        public Criteria andRentalDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("rental_date <>", value, "rentalDate");
            return (Criteria) this;
        }

        public Criteria andRentalDateGreaterThan(Date value) {
            addCriterionForJDBCDate("rental_date >", value, "rentalDate");
            return (Criteria) this;
        }

        public Criteria andRentalDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rental_date >=", value, "rentalDate");
            return (Criteria) this;
        }

        public Criteria andRentalDateLessThan(Date value) {
            addCriterionForJDBCDate("rental_date <", value, "rentalDate");
            return (Criteria) this;
        }

        public Criteria andRentalDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rental_date <=", value, "rentalDate");
            return (Criteria) this;
        }

        public Criteria andRentalDateIn(List<Date> values) {
            addCriterionForJDBCDate("rental_date in", values, "rentalDate");
            return (Criteria) this;
        }

        public Criteria andRentalDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("rental_date not in", values, "rentalDate");
            return (Criteria) this;
        }

        public Criteria andRentalDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rental_date between", value1, value2, "rentalDate");
            return (Criteria) this;
        }

        public Criteria andRentalDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rental_date not between", value1, value2, "rentalDate");
            return (Criteria) this;
        }

        public Criteria andRentalModeIsNull() {
            addCriterion("rental_mode is null");
            return (Criteria) this;
        }

        public Criteria andRentalModeIsNotNull() {
            addCriterion("rental_mode is not null");
            return (Criteria) this;
        }

        public Criteria andRentalModeEqualTo(Integer value) {
            addCriterion("rental_mode =", value, "rentalMode");
            return (Criteria) this;
        }

        public Criteria andRentalModeNotEqualTo(Integer value) {
            addCriterion("rental_mode <>", value, "rentalMode");
            return (Criteria) this;
        }

        public Criteria andRentalModeGreaterThan(Integer value) {
            addCriterion("rental_mode >", value, "rentalMode");
            return (Criteria) this;
        }

        public Criteria andRentalModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rental_mode >=", value, "rentalMode");
            return (Criteria) this;
        }

        public Criteria andRentalModeLessThan(Integer value) {
            addCriterion("rental_mode <", value, "rentalMode");
            return (Criteria) this;
        }

        public Criteria andRentalModeLessThanOrEqualTo(Integer value) {
            addCriterion("rental_mode <=", value, "rentalMode");
            return (Criteria) this;
        }

        public Criteria andRentalModeIn(List<Integer> values) {
            addCriterion("rental_mode in", values, "rentalMode");
            return (Criteria) this;
        }

        public Criteria andRentalModeNotIn(List<Integer> values) {
            addCriterion("rental_mode not in", values, "rentalMode");
            return (Criteria) this;
        }

        public Criteria andRentalModeBetween(Integer value1, Integer value2) {
            addCriterion("rental_mode between", value1, value2, "rentalMode");
            return (Criteria) this;
        }

        public Criteria andRentalModeNotBetween(Integer value1, Integer value2) {
            addCriterion("rental_mode not between", value1, value2, "rentalMode");
            return (Criteria) this;
        }

        public Criteria andRentalPriceIsNull() {
            addCriterion("rental_price is null");
            return (Criteria) this;
        }

        public Criteria andRentalPriceIsNotNull() {
            addCriterion("rental_price is not null");
            return (Criteria) this;
        }

        public Criteria andRentalPriceEqualTo(Double value) {
            addCriterion("rental_price =", value, "rentalPrice");
            return (Criteria) this;
        }

        public Criteria andRentalPriceNotEqualTo(Double value) {
            addCriterion("rental_price <>", value, "rentalPrice");
            return (Criteria) this;
        }

        public Criteria andRentalPriceGreaterThan(Double value) {
            addCriterion("rental_price >", value, "rentalPrice");
            return (Criteria) this;
        }

        public Criteria andRentalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("rental_price >=", value, "rentalPrice");
            return (Criteria) this;
        }

        public Criteria andRentalPriceLessThan(Double value) {
            addCriterion("rental_price <", value, "rentalPrice");
            return (Criteria) this;
        }

        public Criteria andRentalPriceLessThanOrEqualTo(Double value) {
            addCriterion("rental_price <=", value, "rentalPrice");
            return (Criteria) this;
        }

        public Criteria andRentalPriceIn(List<Double> values) {
            addCriterion("rental_price in", values, "rentalPrice");
            return (Criteria) this;
        }

        public Criteria andRentalPriceNotIn(List<Double> values) {
            addCriterion("rental_price not in", values, "rentalPrice");
            return (Criteria) this;
        }

        public Criteria andRentalPriceBetween(Double value1, Double value2) {
            addCriterion("rental_price between", value1, value2, "rentalPrice");
            return (Criteria) this;
        }

        public Criteria andRentalPriceNotBetween(Double value1, Double value2) {
            addCriterion("rental_price not between", value1, value2, "rentalPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalPriceIsNull() {
            addCriterion("weekend_rental_price is null");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalPriceIsNotNull() {
            addCriterion("weekend_rental_price is not null");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalPriceEqualTo(Double value) {
            addCriterion("weekend_rental_price =", value, "weekendRentalPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalPriceNotEqualTo(Double value) {
            addCriterion("weekend_rental_price <>", value, "weekendRentalPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalPriceGreaterThan(Double value) {
            addCriterion("weekend_rental_price >", value, "weekendRentalPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("weekend_rental_price >=", value, "weekendRentalPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalPriceLessThan(Double value) {
            addCriterion("weekend_rental_price <", value, "weekendRentalPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalPriceLessThanOrEqualTo(Double value) {
            addCriterion("weekend_rental_price <=", value, "weekendRentalPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalPriceIn(List<Double> values) {
            addCriterion("weekend_rental_price in", values, "weekendRentalPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalPriceNotIn(List<Double> values) {
            addCriterion("weekend_rental_price not in", values, "weekendRentalPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalPriceBetween(Double value1, Double value2) {
            addCriterion("weekend_rental_price between", value1, value2, "weekendRentalPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendRentalPriceNotBetween(Double value1, Double value2) {
            addCriterion("weekend_rental_price not between", value1, value2, "weekendRentalPrice");
            return (Criteria) this;
        }

        public Criteria andCalculateNumberIsNull() {
            addCriterion("calculate_number is null");
            return (Criteria) this;
        }

        public Criteria andCalculateNumberIsNotNull() {
            addCriterion("calculate_number is not null");
            return (Criteria) this;
        }

        public Criteria andCalculateNumberEqualTo(Integer value) {
            addCriterion("calculate_number =", value, "calculateNumber");
            return (Criteria) this;
        }

        public Criteria andCalculateNumberNotEqualTo(Integer value) {
            addCriterion("calculate_number <>", value, "calculateNumber");
            return (Criteria) this;
        }

        public Criteria andCalculateNumberGreaterThan(Integer value) {
            addCriterion("calculate_number >", value, "calculateNumber");
            return (Criteria) this;
        }

        public Criteria andCalculateNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("calculate_number >=", value, "calculateNumber");
            return (Criteria) this;
        }

        public Criteria andCalculateNumberLessThan(Integer value) {
            addCriterion("calculate_number <", value, "calculateNumber");
            return (Criteria) this;
        }

        public Criteria andCalculateNumberLessThanOrEqualTo(Integer value) {
            addCriterion("calculate_number <=", value, "calculateNumber");
            return (Criteria) this;
        }

        public Criteria andCalculateNumberIn(List<Integer> values) {
            addCriterion("calculate_number in", values, "calculateNumber");
            return (Criteria) this;
        }

        public Criteria andCalculateNumberNotIn(List<Integer> values) {
            addCriterion("calculate_number not in", values, "calculateNumber");
            return (Criteria) this;
        }

        public Criteria andCalculateNumberBetween(Integer value1, Integer value2) {
            addCriterion("calculate_number between", value1, value2, "calculateNumber");
            return (Criteria) this;
        }

        public Criteria andCalculateNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("calculate_number not between", value1, value2, "calculateNumber");
            return (Criteria) this;
        }

        public Criteria andWeekendNumberIsNull() {
            addCriterion("weekend_number is null");
            return (Criteria) this;
        }

        public Criteria andWeekendNumberIsNotNull() {
            addCriterion("weekend_number is not null");
            return (Criteria) this;
        }

        public Criteria andWeekendNumberEqualTo(Integer value) {
            addCriterion("weekend_number =", value, "weekendNumber");
            return (Criteria) this;
        }

        public Criteria andWeekendNumberNotEqualTo(Integer value) {
            addCriterion("weekend_number <>", value, "weekendNumber");
            return (Criteria) this;
        }

        public Criteria andWeekendNumberGreaterThan(Integer value) {
            addCriterion("weekend_number >", value, "weekendNumber");
            return (Criteria) this;
        }

        public Criteria andWeekendNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("weekend_number >=", value, "weekendNumber");
            return (Criteria) this;
        }

        public Criteria andWeekendNumberLessThan(Integer value) {
            addCriterion("weekend_number <", value, "weekendNumber");
            return (Criteria) this;
        }

        public Criteria andWeekendNumberLessThanOrEqualTo(Integer value) {
            addCriterion("weekend_number <=", value, "weekendNumber");
            return (Criteria) this;
        }

        public Criteria andWeekendNumberIn(List<Integer> values) {
            addCriterion("weekend_number in", values, "weekendNumber");
            return (Criteria) this;
        }

        public Criteria andWeekendNumberNotIn(List<Integer> values) {
            addCriterion("weekend_number not in", values, "weekendNumber");
            return (Criteria) this;
        }

        public Criteria andWeekendNumberBetween(Integer value1, Integer value2) {
            addCriterion("weekend_number between", value1, value2, "weekendNumber");
            return (Criteria) this;
        }

        public Criteria andWeekendNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("weekend_number not between", value1, value2, "weekendNumber");
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

        public Criteria andDispatchKilometersIsNull() {
            addCriterion("dispatch_kilometers is null");
            return (Criteria) this;
        }

        public Criteria andDispatchKilometersIsNotNull() {
            addCriterion("dispatch_kilometers is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchKilometersEqualTo(Double value) {
            addCriterion("dispatch_kilometers =", value, "dispatchKilometers");
            return (Criteria) this;
        }

        public Criteria andDispatchKilometersNotEqualTo(Double value) {
            addCriterion("dispatch_kilometers <>", value, "dispatchKilometers");
            return (Criteria) this;
        }

        public Criteria andDispatchKilometersGreaterThan(Double value) {
            addCriterion("dispatch_kilometers >", value, "dispatchKilometers");
            return (Criteria) this;
        }

        public Criteria andDispatchKilometersGreaterThanOrEqualTo(Double value) {
            addCriterion("dispatch_kilometers >=", value, "dispatchKilometers");
            return (Criteria) this;
        }

        public Criteria andDispatchKilometersLessThan(Double value) {
            addCriterion("dispatch_kilometers <", value, "dispatchKilometers");
            return (Criteria) this;
        }

        public Criteria andDispatchKilometersLessThanOrEqualTo(Double value) {
            addCriterion("dispatch_kilometers <=", value, "dispatchKilometers");
            return (Criteria) this;
        }

        public Criteria andDispatchKilometersIn(List<Double> values) {
            addCriterion("dispatch_kilometers in", values, "dispatchKilometers");
            return (Criteria) this;
        }

        public Criteria andDispatchKilometersNotIn(List<Double> values) {
            addCriterion("dispatch_kilometers not in", values, "dispatchKilometers");
            return (Criteria) this;
        }

        public Criteria andDispatchKilometersBetween(Double value1, Double value2) {
            addCriterion("dispatch_kilometers between", value1, value2, "dispatchKilometers");
            return (Criteria) this;
        }

        public Criteria andDispatchKilometersNotBetween(Double value1, Double value2) {
            addCriterion("dispatch_kilometers not between", value1, value2, "dispatchKilometers");
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

        public Criteria andReturnDateIsNull() {
            addCriterion("return_date is null");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNotNull() {
            addCriterion("return_date is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDateEqualTo(Date value) {
            addCriterionForJDBCDate("return_date =", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("return_date <>", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThan(Date value) {
            addCriterionForJDBCDate("return_date >", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("return_date >=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThan(Date value) {
            addCriterionForJDBCDate("return_date <", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("return_date <=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateIn(List<Date> values) {
            addCriterionForJDBCDate("return_date in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("return_date not in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("return_date between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("return_date not between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnKilometersIsNull() {
            addCriterion("return_kilometers is null");
            return (Criteria) this;
        }

        public Criteria andReturnKilometersIsNotNull() {
            addCriterion("return_kilometers is not null");
            return (Criteria) this;
        }

        public Criteria andReturnKilometersEqualTo(Double value) {
            addCriterion("return_kilometers =", value, "returnKilometers");
            return (Criteria) this;
        }

        public Criteria andReturnKilometersNotEqualTo(Double value) {
            addCriterion("return_kilometers <>", value, "returnKilometers");
            return (Criteria) this;
        }

        public Criteria andReturnKilometersGreaterThan(Double value) {
            addCriterion("return_kilometers >", value, "returnKilometers");
            return (Criteria) this;
        }

        public Criteria andReturnKilometersGreaterThanOrEqualTo(Double value) {
            addCriterion("return_kilometers >=", value, "returnKilometers");
            return (Criteria) this;
        }

        public Criteria andReturnKilometersLessThan(Double value) {
            addCriterion("return_kilometers <", value, "returnKilometers");
            return (Criteria) this;
        }

        public Criteria andReturnKilometersLessThanOrEqualTo(Double value) {
            addCriterion("return_kilometers <=", value, "returnKilometers");
            return (Criteria) this;
        }

        public Criteria andReturnKilometersIn(List<Double> values) {
            addCriterion("return_kilometers in", values, "returnKilometers");
            return (Criteria) this;
        }

        public Criteria andReturnKilometersNotIn(List<Double> values) {
            addCriterion("return_kilometers not in", values, "returnKilometers");
            return (Criteria) this;
        }

        public Criteria andReturnKilometersBetween(Double value1, Double value2) {
            addCriterion("return_kilometers between", value1, value2, "returnKilometers");
            return (Criteria) this;
        }

        public Criteria andReturnKilometersNotBetween(Double value1, Double value2) {
            addCriterion("return_kilometers not between", value1, value2, "returnKilometers");
            return (Criteria) this;
        }

        public Criteria andOtherFeeIsNull() {
            addCriterion("other_fee is null");
            return (Criteria) this;
        }

        public Criteria andOtherFeeIsNotNull() {
            addCriterion("other_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOtherFeeEqualTo(Double value) {
            addCriterion("other_fee =", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeNotEqualTo(Double value) {
            addCriterion("other_fee <>", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeGreaterThan(Double value) {
            addCriterion("other_fee >", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("other_fee >=", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeLessThan(Double value) {
            addCriterion("other_fee <", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeLessThanOrEqualTo(Double value) {
            addCriterion("other_fee <=", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeIn(List<Double> values) {
            addCriterion("other_fee in", values, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeNotIn(List<Double> values) {
            addCriterion("other_fee not in", values, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeBetween(Double value1, Double value2) {
            addCriterion("other_fee between", value1, value2, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeNotBetween(Double value1, Double value2) {
            addCriterion("other_fee not between", value1, value2, "otherFee");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Double value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Double value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Double value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Double value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Double value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Double> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Double> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Double value1, Double value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Double value1, Double value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andActualCostIsNull() {
            addCriterion("actual_cost is null");
            return (Criteria) this;
        }

        public Criteria andActualCostIsNotNull() {
            addCriterion("actual_cost is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostEqualTo(Double value) {
            addCriterion("actual_cost =", value, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostNotEqualTo(Double value) {
            addCriterion("actual_cost <>", value, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostGreaterThan(Double value) {
            addCriterion("actual_cost >", value, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostGreaterThanOrEqualTo(Double value) {
            addCriterion("actual_cost >=", value, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostLessThan(Double value) {
            addCriterion("actual_cost <", value, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostLessThanOrEqualTo(Double value) {
            addCriterion("actual_cost <=", value, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostIn(List<Double> values) {
            addCriterion("actual_cost in", values, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostNotIn(List<Double> values) {
            addCriterion("actual_cost not in", values, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostBetween(Double value1, Double value2) {
            addCriterion("actual_cost between", value1, value2, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostNotBetween(Double value1, Double value2) {
            addCriterion("actual_cost not between", value1, value2, "actualCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNull() {
            addCriterion("total_cost is null");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNotNull() {
            addCriterion("total_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCostEqualTo(Double value) {
            addCriterion("total_cost =", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotEqualTo(Double value) {
            addCriterion("total_cost <>", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThan(Double value) {
            addCriterion("total_cost >", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThanOrEqualTo(Double value) {
            addCriterion("total_cost >=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThan(Double value) {
            addCriterion("total_cost <", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThanOrEqualTo(Double value) {
            addCriterion("total_cost <=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostIn(List<Double> values) {
            addCriterion("total_cost in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotIn(List<Double> values) {
            addCriterion("total_cost not in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostBetween(Double value1, Double value2) {
            addCriterion("total_cost between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotBetween(Double value1, Double value2) {
            addCriterion("total_cost not between", value1, value2, "totalCost");
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

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIsNull() {
            addCriterion("create_person is null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIsNotNull() {
            addCriterion("create_person is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonEqualTo(String value) {
            addCriterion("create_person =", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotEqualTo(String value) {
            addCriterion("create_person <>", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonGreaterThan(String value) {
            addCriterion("create_person >", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonGreaterThanOrEqualTo(String value) {
            addCriterion("create_person >=", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonLessThan(String value) {
            addCriterion("create_person <", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonLessThanOrEqualTo(String value) {
            addCriterion("create_person <=", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonLike(String value) {
            addCriterion("create_person like", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotLike(String value) {
            addCriterion("create_person not like", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIn(List<String> values) {
            addCriterion("create_person in", values, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotIn(List<String> values) {
            addCriterion("create_person not in", values, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonBetween(String value1, String value2) {
            addCriterion("create_person between", value1, value2, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotBetween(String value1, String value2) {
            addCriterion("create_person not between", value1, value2, "createPerson");
            return (Criteria) this;
        }

        public Criteria andActualReturnDateIsNull() {
            addCriterion("actual_return_date is null");
            return (Criteria) this;
        }

        public Criteria andActualReturnDateIsNotNull() {
            addCriterion("actual_return_date is not null");
            return (Criteria) this;
        }

        public Criteria andActualReturnDateEqualTo(Date value) {
            addCriterionForJDBCDate("actual_return_date =", value, "actualReturnDate");
            return (Criteria) this;
        }

        public Criteria andActualReturnDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("actual_return_date <>", value, "actualReturnDate");
            return (Criteria) this;
        }

        public Criteria andActualReturnDateGreaterThan(Date value) {
            addCriterionForJDBCDate("actual_return_date >", value, "actualReturnDate");
            return (Criteria) this;
        }

        public Criteria andActualReturnDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("actual_return_date >=", value, "actualReturnDate");
            return (Criteria) this;
        }

        public Criteria andActualReturnDateLessThan(Date value) {
            addCriterionForJDBCDate("actual_return_date <", value, "actualReturnDate");
            return (Criteria) this;
        }

        public Criteria andActualReturnDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("actual_return_date <=", value, "actualReturnDate");
            return (Criteria) this;
        }

        public Criteria andActualReturnDateIn(List<Date> values) {
            addCriterionForJDBCDate("actual_return_date in", values, "actualReturnDate");
            return (Criteria) this;
        }

        public Criteria andActualReturnDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("actual_return_date not in", values, "actualReturnDate");
            return (Criteria) this;
        }

        public Criteria andActualReturnDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("actual_return_date between", value1, value2, "actualReturnDate");
            return (Criteria) this;
        }

        public Criteria andActualReturnDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("actual_return_date not between", value1, value2, "actualReturnDate");
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
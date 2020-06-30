package xyz.light_seekers.maven_car_rental.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ClientInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientInfoExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andWorkAddressIsNull() {
            addCriterion("work_address is null");
            return (Criteria) this;
        }

        public Criteria andWorkAddressIsNotNull() {
            addCriterion("work_address is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAddressEqualTo(String value) {
            addCriterion("work_address =", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotEqualTo(String value) {
            addCriterion("work_address <>", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressGreaterThan(String value) {
            addCriterion("work_address >", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressGreaterThanOrEqualTo(String value) {
            addCriterion("work_address >=", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressLessThan(String value) {
            addCriterion("work_address <", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressLessThanOrEqualTo(String value) {
            addCriterion("work_address <=", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressLike(String value) {
            addCriterion("work_address like", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotLike(String value) {
            addCriterion("work_address not like", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressIn(List<String> values) {
            addCriterion("work_address in", values, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotIn(List<String> values) {
            addCriterion("work_address not in", values, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressBetween(String value1, String value2) {
            addCriterion("work_address between", value1, value2, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotBetween(String value1, String value2) {
            addCriterion("work_address not between", value1, value2, "workAddress");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPostalCardIsNull() {
            addCriterion("postal_card is null");
            return (Criteria) this;
        }

        public Criteria andPostalCardIsNotNull() {
            addCriterion("postal_card is not null");
            return (Criteria) this;
        }

        public Criteria andPostalCardEqualTo(String value) {
            addCriterion("postal_card =", value, "postalCard");
            return (Criteria) this;
        }

        public Criteria andPostalCardNotEqualTo(String value) {
            addCriterion("postal_card <>", value, "postalCard");
            return (Criteria) this;
        }

        public Criteria andPostalCardGreaterThan(String value) {
            addCriterion("postal_card >", value, "postalCard");
            return (Criteria) this;
        }

        public Criteria andPostalCardGreaterThanOrEqualTo(String value) {
            addCriterion("postal_card >=", value, "postalCard");
            return (Criteria) this;
        }

        public Criteria andPostalCardLessThan(String value) {
            addCriterion("postal_card <", value, "postalCard");
            return (Criteria) this;
        }

        public Criteria andPostalCardLessThanOrEqualTo(String value) {
            addCriterion("postal_card <=", value, "postalCard");
            return (Criteria) this;
        }

        public Criteria andPostalCardLike(String value) {
            addCriterion("postal_card like", value, "postalCard");
            return (Criteria) this;
        }

        public Criteria andPostalCardNotLike(String value) {
            addCriterion("postal_card not like", value, "postalCard");
            return (Criteria) this;
        }

        public Criteria andPostalCardIn(List<String> values) {
            addCriterion("postal_card in", values, "postalCard");
            return (Criteria) this;
        }

        public Criteria andPostalCardNotIn(List<String> values) {
            addCriterion("postal_card not in", values, "postalCard");
            return (Criteria) this;
        }

        public Criteria andPostalCardBetween(String value1, String value2) {
            addCriterion("postal_card between", value1, value2, "postalCard");
            return (Criteria) this;
        }

        public Criteria andPostalCardNotBetween(String value1, String value2) {
            addCriterion("postal_card not between", value1, value2, "postalCard");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPassPostNumberIsNull() {
            addCriterion("pass_post_number is null");
            return (Criteria) this;
        }

        public Criteria andPassPostNumberIsNotNull() {
            addCriterion("pass_post_number is not null");
            return (Criteria) this;
        }

        public Criteria andPassPostNumberEqualTo(String value) {
            addCriterion("pass_post_number =", value, "passPostNumber");
            return (Criteria) this;
        }

        public Criteria andPassPostNumberNotEqualTo(String value) {
            addCriterion("pass_post_number <>", value, "passPostNumber");
            return (Criteria) this;
        }

        public Criteria andPassPostNumberGreaterThan(String value) {
            addCriterion("pass_post_number >", value, "passPostNumber");
            return (Criteria) this;
        }

        public Criteria andPassPostNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pass_post_number >=", value, "passPostNumber");
            return (Criteria) this;
        }

        public Criteria andPassPostNumberLessThan(String value) {
            addCriterion("pass_post_number <", value, "passPostNumber");
            return (Criteria) this;
        }

        public Criteria andPassPostNumberLessThanOrEqualTo(String value) {
            addCriterion("pass_post_number <=", value, "passPostNumber");
            return (Criteria) this;
        }

        public Criteria andPassPostNumberLike(String value) {
            addCriterion("pass_post_number like", value, "passPostNumber");
            return (Criteria) this;
        }

        public Criteria andPassPostNumberNotLike(String value) {
            addCriterion("pass_post_number not like", value, "passPostNumber");
            return (Criteria) this;
        }

        public Criteria andPassPostNumberIn(List<String> values) {
            addCriterion("pass_post_number in", values, "passPostNumber");
            return (Criteria) this;
        }

        public Criteria andPassPostNumberNotIn(List<String> values) {
            addCriterion("pass_post_number not in", values, "passPostNumber");
            return (Criteria) this;
        }

        public Criteria andPassPostNumberBetween(String value1, String value2) {
            addCriterion("pass_post_number between", value1, value2, "passPostNumber");
            return (Criteria) this;
        }

        public Criteria andPassPostNumberNotBetween(String value1, String value2) {
            addCriterion("pass_post_number not between", value1, value2, "passPostNumber");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeIsNull() {
            addCriterion("driver_license_type is null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeIsNotNull() {
            addCriterion("driver_license_type is not null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeEqualTo(String value) {
            addCriterion("driver_license_type =", value, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeNotEqualTo(String value) {
            addCriterion("driver_license_type <>", value, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeGreaterThan(String value) {
            addCriterion("driver_license_type >", value, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("driver_license_type >=", value, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeLessThan(String value) {
            addCriterion("driver_license_type <", value, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeLessThanOrEqualTo(String value) {
            addCriterion("driver_license_type <=", value, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeLike(String value) {
            addCriterion("driver_license_type like", value, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeNotLike(String value) {
            addCriterion("driver_license_type not like", value, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeIn(List<String> values) {
            addCriterion("driver_license_type in", values, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeNotIn(List<String> values) {
            addCriterion("driver_license_type not in", values, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeBetween(String value1, String value2) {
            addCriterion("driver_license_type between", value1, value2, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeNotBetween(String value1, String value2) {
            addCriterion("driver_license_type not between", value1, value2, "driverLicenseType");
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

        public Criteria andDriverAgeIsNull() {
            addCriterion("driver_age is null");
            return (Criteria) this;
        }

        public Criteria andDriverAgeIsNotNull() {
            addCriterion("driver_age is not null");
            return (Criteria) this;
        }

        public Criteria andDriverAgeEqualTo(Integer value) {
            addCriterion("driver_age =", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeNotEqualTo(Integer value) {
            addCriterion("driver_age <>", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeGreaterThan(Integer value) {
            addCriterion("driver_age >", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("driver_age >=", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeLessThan(Integer value) {
            addCriterion("driver_age <", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeLessThanOrEqualTo(Integer value) {
            addCriterion("driver_age <=", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeIn(List<Integer> values) {
            addCriterion("driver_age in", values, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeNotIn(List<Integer> values) {
            addCriterion("driver_age not in", values, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeBetween(Integer value1, Integer value2) {
            addCriterion("driver_age between", value1, value2, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("driver_age not between", value1, value2, "driverAge");
            return (Criteria) this;
        }

        public Criteria andVipIsNull() {
            addCriterion("vip is null");
            return (Criteria) this;
        }

        public Criteria andVipIsNotNull() {
            addCriterion("vip is not null");
            return (Criteria) this;
        }

        public Criteria andVipEqualTo(Integer value) {
            addCriterion("vip =", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotEqualTo(Integer value) {
            addCriterion("vip <>", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipGreaterThan(Integer value) {
            addCriterion("vip >", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip >=", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLessThan(Integer value) {
            addCriterion("vip <", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLessThanOrEqualTo(Integer value) {
            addCriterion("vip <=", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipIn(List<Integer> values) {
            addCriterion("vip in", values, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotIn(List<Integer> values) {
            addCriterion("vip not in", values, "vip");
            return (Criteria) this;
        }

        public Criteria andVipBetween(Integer value1, Integer value2) {
            addCriterion("vip between", value1, value2, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotBetween(Integer value1, Integer value2) {
            addCriterion("vip not between", value1, value2, "vip");
            return (Criteria) this;
        }

        public Criteria andVipCategoryIsNull() {
            addCriterion("vip_category is null");
            return (Criteria) this;
        }

        public Criteria andVipCategoryIsNotNull() {
            addCriterion("vip_category is not null");
            return (Criteria) this;
        }

        public Criteria andVipCategoryEqualTo(Integer value) {
            addCriterion("vip_category =", value, "vipCategory");
            return (Criteria) this;
        }

        public Criteria andVipCategoryNotEqualTo(Integer value) {
            addCriterion("vip_category <>", value, "vipCategory");
            return (Criteria) this;
        }

        public Criteria andVipCategoryGreaterThan(Integer value) {
            addCriterion("vip_category >", value, "vipCategory");
            return (Criteria) this;
        }

        public Criteria andVipCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_category >=", value, "vipCategory");
            return (Criteria) this;
        }

        public Criteria andVipCategoryLessThan(Integer value) {
            addCriterion("vip_category <", value, "vipCategory");
            return (Criteria) this;
        }

        public Criteria andVipCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("vip_category <=", value, "vipCategory");
            return (Criteria) this;
        }

        public Criteria andVipCategoryIn(List<Integer> values) {
            addCriterion("vip_category in", values, "vipCategory");
            return (Criteria) this;
        }

        public Criteria andVipCategoryNotIn(List<Integer> values) {
            addCriterion("vip_category not in", values, "vipCategory");
            return (Criteria) this;
        }

        public Criteria andVipCategoryBetween(Integer value1, Integer value2) {
            addCriterion("vip_category between", value1, value2, "vipCategory");
            return (Criteria) this;
        }

        public Criteria andVipCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_category not between", value1, value2, "vipCategory");
            return (Criteria) this;
        }

        public Criteria andMortgageCategoryIsNull() {
            addCriterion("mortgage_category is null");
            return (Criteria) this;
        }

        public Criteria andMortgageCategoryIsNotNull() {
            addCriterion("mortgage_category is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageCategoryEqualTo(String value) {
            addCriterion("mortgage_category =", value, "mortgageCategory");
            return (Criteria) this;
        }

        public Criteria andMortgageCategoryNotEqualTo(String value) {
            addCriterion("mortgage_category <>", value, "mortgageCategory");
            return (Criteria) this;
        }

        public Criteria andMortgageCategoryGreaterThan(String value) {
            addCriterion("mortgage_category >", value, "mortgageCategory");
            return (Criteria) this;
        }

        public Criteria andMortgageCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("mortgage_category >=", value, "mortgageCategory");
            return (Criteria) this;
        }

        public Criteria andMortgageCategoryLessThan(String value) {
            addCriterion("mortgage_category <", value, "mortgageCategory");
            return (Criteria) this;
        }

        public Criteria andMortgageCategoryLessThanOrEqualTo(String value) {
            addCriterion("mortgage_category <=", value, "mortgageCategory");
            return (Criteria) this;
        }

        public Criteria andMortgageCategoryLike(String value) {
            addCriterion("mortgage_category like", value, "mortgageCategory");
            return (Criteria) this;
        }

        public Criteria andMortgageCategoryNotLike(String value) {
            addCriterion("mortgage_category not like", value, "mortgageCategory");
            return (Criteria) this;
        }

        public Criteria andMortgageCategoryIn(List<String> values) {
            addCriterion("mortgage_category in", values, "mortgageCategory");
            return (Criteria) this;
        }

        public Criteria andMortgageCategoryNotIn(List<String> values) {
            addCriterion("mortgage_category not in", values, "mortgageCategory");
            return (Criteria) this;
        }

        public Criteria andMortgageCategoryBetween(String value1, String value2) {
            addCriterion("mortgage_category between", value1, value2, "mortgageCategory");
            return (Criteria) this;
        }

        public Criteria andMortgageCategoryNotBetween(String value1, String value2) {
            addCriterion("mortgage_category not between", value1, value2, "mortgageCategory");
            return (Criteria) this;
        }

        public Criteria andGuarantorIsNull() {
            addCriterion("guarantor is null");
            return (Criteria) this;
        }

        public Criteria andGuarantorIsNotNull() {
            addCriterion("guarantor is not null");
            return (Criteria) this;
        }

        public Criteria andGuarantorEqualTo(String value) {
            addCriterion("guarantor =", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorNotEqualTo(String value) {
            addCriterion("guarantor <>", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorGreaterThan(String value) {
            addCriterion("guarantor >", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorGreaterThanOrEqualTo(String value) {
            addCriterion("guarantor >=", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorLessThan(String value) {
            addCriterion("guarantor <", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorLessThanOrEqualTo(String value) {
            addCriterion("guarantor <=", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorLike(String value) {
            addCriterion("guarantor like", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorNotLike(String value) {
            addCriterion("guarantor not like", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorIn(List<String> values) {
            addCriterion("guarantor in", values, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorNotIn(List<String> values) {
            addCriterion("guarantor not in", values, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorBetween(String value1, String value2) {
            addCriterion("guarantor between", value1, value2, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorNotBetween(String value1, String value2) {
            addCriterion("guarantor not between", value1, value2, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorIdCardIsNull() {
            addCriterion("guarantor_id_card is null");
            return (Criteria) this;
        }

        public Criteria andGuarantorIdCardIsNotNull() {
            addCriterion("guarantor_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andGuarantorIdCardEqualTo(String value) {
            addCriterion("guarantor_id_card =", value, "guarantorIdCard");
            return (Criteria) this;
        }

        public Criteria andGuarantorIdCardNotEqualTo(String value) {
            addCriterion("guarantor_id_card <>", value, "guarantorIdCard");
            return (Criteria) this;
        }

        public Criteria andGuarantorIdCardGreaterThan(String value) {
            addCriterion("guarantor_id_card >", value, "guarantorIdCard");
            return (Criteria) this;
        }

        public Criteria andGuarantorIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("guarantor_id_card >=", value, "guarantorIdCard");
            return (Criteria) this;
        }

        public Criteria andGuarantorIdCardLessThan(String value) {
            addCriterion("guarantor_id_card <", value, "guarantorIdCard");
            return (Criteria) this;
        }

        public Criteria andGuarantorIdCardLessThanOrEqualTo(String value) {
            addCriterion("guarantor_id_card <=", value, "guarantorIdCard");
            return (Criteria) this;
        }

        public Criteria andGuarantorIdCardLike(String value) {
            addCriterion("guarantor_id_card like", value, "guarantorIdCard");
            return (Criteria) this;
        }

        public Criteria andGuarantorIdCardNotLike(String value) {
            addCriterion("guarantor_id_card not like", value, "guarantorIdCard");
            return (Criteria) this;
        }

        public Criteria andGuarantorIdCardIn(List<String> values) {
            addCriterion("guarantor_id_card in", values, "guarantorIdCard");
            return (Criteria) this;
        }

        public Criteria andGuarantorIdCardNotIn(List<String> values) {
            addCriterion("guarantor_id_card not in", values, "guarantorIdCard");
            return (Criteria) this;
        }

        public Criteria andGuarantorIdCardBetween(String value1, String value2) {
            addCriterion("guarantor_id_card between", value1, value2, "guarantorIdCard");
            return (Criteria) this;
        }

        public Criteria andGuarantorIdCardNotBetween(String value1, String value2) {
            addCriterion("guarantor_id_card not between", value1, value2, "guarantorIdCard");
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
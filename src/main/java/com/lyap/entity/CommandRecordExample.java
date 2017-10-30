package com.lyap.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommandRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommandRecordExample() {
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

        public Criteria andCommandFunctionIsNull() {
            addCriterion("command_function is null");
            return (Criteria) this;
        }

        public Criteria andCommandFunctionIsNotNull() {
            addCriterion("command_function is not null");
            return (Criteria) this;
        }

        public Criteria andCommandFunctionEqualTo(Byte value) {
            addCriterion("command_function =", value, "commandFunction");
            return (Criteria) this;
        }

        public Criteria andCommandFunctionNotEqualTo(Byte value) {
            addCriterion("command_function <>", value, "commandFunction");
            return (Criteria) this;
        }

        public Criteria andCommandFunctionGreaterThan(Byte value) {
            addCriterion("command_function >", value, "commandFunction");
            return (Criteria) this;
        }

        public Criteria andCommandFunctionGreaterThanOrEqualTo(Byte value) {
            addCriterion("command_function >=", value, "commandFunction");
            return (Criteria) this;
        }

        public Criteria andCommandFunctionLessThan(Byte value) {
            addCriterion("command_function <", value, "commandFunction");
            return (Criteria) this;
        }

        public Criteria andCommandFunctionLessThanOrEqualTo(Byte value) {
            addCriterion("command_function <=", value, "commandFunction");
            return (Criteria) this;
        }

        public Criteria andCommandFunctionIn(List<Byte> values) {
            addCriterion("command_function in", values, "commandFunction");
            return (Criteria) this;
        }

        public Criteria andCommandFunctionNotIn(List<Byte> values) {
            addCriterion("command_function not in", values, "commandFunction");
            return (Criteria) this;
        }

        public Criteria andCommandFunctionBetween(Byte value1, Byte value2) {
            addCriterion("command_function between", value1, value2, "commandFunction");
            return (Criteria) this;
        }

        public Criteria andCommandFunctionNotBetween(Byte value1, Byte value2) {
            addCriterion("command_function not between", value1, value2, "commandFunction");
            return (Criteria) this;
        }

        public Criteria andReturnDataIsNull() {
            addCriterion("return_data is null");
            return (Criteria) this;
        }

        public Criteria andReturnDataIsNotNull() {
            addCriterion("return_data is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDataEqualTo(String value) {
            addCriterion("return_data =", value, "returnData");
            return (Criteria) this;
        }

        public Criteria andReturnDataNotEqualTo(String value) {
            addCriterion("return_data <>", value, "returnData");
            return (Criteria) this;
        }

        public Criteria andReturnDataGreaterThan(String value) {
            addCriterion("return_data >", value, "returnData");
            return (Criteria) this;
        }

        public Criteria andReturnDataGreaterThanOrEqualTo(String value) {
            addCriterion("return_data >=", value, "returnData");
            return (Criteria) this;
        }

        public Criteria andReturnDataLessThan(String value) {
            addCriterion("return_data <", value, "returnData");
            return (Criteria) this;
        }

        public Criteria andReturnDataLessThanOrEqualTo(String value) {
            addCriterion("return_data <=", value, "returnData");
            return (Criteria) this;
        }

        public Criteria andReturnDataLike(String value) {
            addCriterion("return_data like", value, "returnData");
            return (Criteria) this;
        }

        public Criteria andReturnDataNotLike(String value) {
            addCriterion("return_data not like", value, "returnData");
            return (Criteria) this;
        }

        public Criteria andReturnDataIn(List<String> values) {
            addCriterion("return_data in", values, "returnData");
            return (Criteria) this;
        }

        public Criteria andReturnDataNotIn(List<String> values) {
            addCriterion("return_data not in", values, "returnData");
            return (Criteria) this;
        }

        public Criteria andReturnDataBetween(String value1, String value2) {
            addCriterion("return_data between", value1, value2, "returnData");
            return (Criteria) this;
        }

        public Criteria andReturnDataNotBetween(String value1, String value2) {
            addCriterion("return_data not between", value1, value2, "returnData");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIsNull() {
            addCriterion("return_status is null");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIsNotNull() {
            addCriterion("return_status is not null");
            return (Criteria) this;
        }

        public Criteria andReturnStatusEqualTo(Boolean value) {
            addCriterion("return_status =", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotEqualTo(Boolean value) {
            addCriterion("return_status <>", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusGreaterThan(Boolean value) {
            addCriterion("return_status >", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("return_status >=", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusLessThan(Boolean value) {
            addCriterion("return_status <", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("return_status <=", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIn(List<Boolean> values) {
            addCriterion("return_status in", values, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotIn(List<Boolean> values) {
            addCriterion("return_status not in", values, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("return_status between", value1, value2, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("return_status not between", value1, value2, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordIsNull() {
            addCriterion("manager_password is null");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordIsNotNull() {
            addCriterion("manager_password is not null");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordEqualTo(String value) {
            addCriterion("manager_password =", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordNotEqualTo(String value) {
            addCriterion("manager_password <>", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordGreaterThan(String value) {
            addCriterion("manager_password >", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("manager_password >=", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordLessThan(String value) {
            addCriterion("manager_password <", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordLessThanOrEqualTo(String value) {
            addCriterion("manager_password <=", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordLike(String value) {
            addCriterion("manager_password like", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordNotLike(String value) {
            addCriterion("manager_password not like", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordIn(List<String> values) {
            addCriterion("manager_password in", values, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordNotIn(List<String> values) {
            addCriterion("manager_password not in", values, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordBetween(String value1, String value2) {
            addCriterion("manager_password between", value1, value2, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordNotBetween(String value1, String value2) {
            addCriterion("manager_password not between", value1, value2, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andGuestPasswordIsNull() {
            addCriterion("guest_password is null");
            return (Criteria) this;
        }

        public Criteria andGuestPasswordIsNotNull() {
            addCriterion("guest_password is not null");
            return (Criteria) this;
        }

        public Criteria andGuestPasswordEqualTo(String value) {
            addCriterion("guest_password =", value, "guestPassword");
            return (Criteria) this;
        }

        public Criteria andGuestPasswordNotEqualTo(String value) {
            addCriterion("guest_password <>", value, "guestPassword");
            return (Criteria) this;
        }

        public Criteria andGuestPasswordGreaterThan(String value) {
            addCriterion("guest_password >", value, "guestPassword");
            return (Criteria) this;
        }

        public Criteria andGuestPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("guest_password >=", value, "guestPassword");
            return (Criteria) this;
        }

        public Criteria andGuestPasswordLessThan(String value) {
            addCriterion("guest_password <", value, "guestPassword");
            return (Criteria) this;
        }

        public Criteria andGuestPasswordLessThanOrEqualTo(String value) {
            addCriterion("guest_password <=", value, "guestPassword");
            return (Criteria) this;
        }

        public Criteria andGuestPasswordLike(String value) {
            addCriterion("guest_password like", value, "guestPassword");
            return (Criteria) this;
        }

        public Criteria andGuestPasswordNotLike(String value) {
            addCriterion("guest_password not like", value, "guestPassword");
            return (Criteria) this;
        }

        public Criteria andGuestPasswordIn(List<String> values) {
            addCriterion("guest_password in", values, "guestPassword");
            return (Criteria) this;
        }

        public Criteria andGuestPasswordNotIn(List<String> values) {
            addCriterion("guest_password not in", values, "guestPassword");
            return (Criteria) this;
        }

        public Criteria andGuestPasswordBetween(String value1, String value2) {
            addCriterion("guest_password between", value1, value2, "guestPassword");
            return (Criteria) this;
        }

        public Criteria andGuestPasswordNotBetween(String value1, String value2) {
            addCriterion("guest_password not between", value1, value2, "guestPassword");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNull() {
            addCriterion("cardno is null");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNotNull() {
            addCriterion("cardno is not null");
            return (Criteria) this;
        }

        public Criteria andCardnoEqualTo(String value) {
            addCriterion("cardno =", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotEqualTo(String value) {
            addCriterion("cardno <>", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThan(String value) {
            addCriterion("cardno >", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("cardno >=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThan(String value) {
            addCriterion("cardno <", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThanOrEqualTo(String value) {
            addCriterion("cardno <=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLike(String value) {
            addCriterion("cardno like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotLike(String value) {
            addCriterion("cardno not like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoIn(List<String> values) {
            addCriterion("cardno in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotIn(List<String> values) {
            addCriterion("cardno not in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoBetween(String value1, String value2) {
            addCriterion("cardno between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotBetween(String value1, String value2) {
            addCriterion("cardno not between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andLockStatusIsNull() {
            addCriterion("lock_status is null");
            return (Criteria) this;
        }

        public Criteria andLockStatusIsNotNull() {
            addCriterion("lock_status is not null");
            return (Criteria) this;
        }

        public Criteria andLockStatusEqualTo(Boolean value) {
            addCriterion("lock_status =", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotEqualTo(Boolean value) {
            addCriterion("lock_status <>", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusGreaterThan(Boolean value) {
            addCriterion("lock_status >", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lock_status >=", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLessThan(Boolean value) {
            addCriterion("lock_status <", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("lock_status <=", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusIn(List<Boolean> values) {
            addCriterion("lock_status in", values, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotIn(List<Boolean> values) {
            addCriterion("lock_status not in", values, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("lock_status between", value1, value2, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lock_status not between", value1, value2, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andGatewayboxCommunicationcodeIsNull() {
            addCriterion("gatewaybox_communicationcode is null");
            return (Criteria) this;
        }

        public Criteria andGatewayboxCommunicationcodeIsNotNull() {
            addCriterion("gatewaybox_communicationcode is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayboxCommunicationcodeEqualTo(String value) {
            addCriterion("gatewaybox_communicationcode =", value, "gatewayboxCommunicationcode");
            return (Criteria) this;
        }

        public Criteria andGatewayboxCommunicationcodeNotEqualTo(String value) {
            addCriterion("gatewaybox_communicationcode <>", value, "gatewayboxCommunicationcode");
            return (Criteria) this;
        }

        public Criteria andGatewayboxCommunicationcodeGreaterThan(String value) {
            addCriterion("gatewaybox_communicationcode >", value, "gatewayboxCommunicationcode");
            return (Criteria) this;
        }

        public Criteria andGatewayboxCommunicationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("gatewaybox_communicationcode >=", value, "gatewayboxCommunicationcode");
            return (Criteria) this;
        }

        public Criteria andGatewayboxCommunicationcodeLessThan(String value) {
            addCriterion("gatewaybox_communicationcode <", value, "gatewayboxCommunicationcode");
            return (Criteria) this;
        }

        public Criteria andGatewayboxCommunicationcodeLessThanOrEqualTo(String value) {
            addCriterion("gatewaybox_communicationcode <=", value, "gatewayboxCommunicationcode");
            return (Criteria) this;
        }

        public Criteria andGatewayboxCommunicationcodeLike(String value) {
            addCriterion("gatewaybox_communicationcode like", value, "gatewayboxCommunicationcode");
            return (Criteria) this;
        }

        public Criteria andGatewayboxCommunicationcodeNotLike(String value) {
            addCriterion("gatewaybox_communicationcode not like", value, "gatewayboxCommunicationcode");
            return (Criteria) this;
        }

        public Criteria andGatewayboxCommunicationcodeIn(List<String> values) {
            addCriterion("gatewaybox_communicationcode in", values, "gatewayboxCommunicationcode");
            return (Criteria) this;
        }

        public Criteria andGatewayboxCommunicationcodeNotIn(List<String> values) {
            addCriterion("gatewaybox_communicationcode not in", values, "gatewayboxCommunicationcode");
            return (Criteria) this;
        }

        public Criteria andGatewayboxCommunicationcodeBetween(String value1, String value2) {
            addCriterion("gatewaybox_communicationcode between", value1, value2, "gatewayboxCommunicationcode");
            return (Criteria) this;
        }

        public Criteria andGatewayboxCommunicationcodeNotBetween(String value1, String value2) {
            addCriterion("gatewaybox_communicationcode not between", value1, value2, "gatewayboxCommunicationcode");
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
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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
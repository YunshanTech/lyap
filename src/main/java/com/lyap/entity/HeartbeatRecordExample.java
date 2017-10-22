package com.lyap.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HeartbeatRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HeartbeatRecordExample() {
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

        public Criteria andGatewayboxIdIsNull() {
            addCriterion("gatewaybox_id is null");
            return (Criteria) this;
        }

        public Criteria andGatewayboxIdIsNotNull() {
            addCriterion("gatewaybox_id is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayboxIdEqualTo(String value) {
            addCriterion("gatewaybox_id =", value, "gatewayboxId");
            return (Criteria) this;
        }

        public Criteria andGatewayboxIdNotEqualTo(String value) {
            addCriterion("gatewaybox_id <>", value, "gatewayboxId");
            return (Criteria) this;
        }

        public Criteria andGatewayboxIdGreaterThan(String value) {
            addCriterion("gatewaybox_id >", value, "gatewayboxId");
            return (Criteria) this;
        }

        public Criteria andGatewayboxIdGreaterThanOrEqualTo(String value) {
            addCriterion("gatewaybox_id >=", value, "gatewayboxId");
            return (Criteria) this;
        }

        public Criteria andGatewayboxIdLessThan(String value) {
            addCriterion("gatewaybox_id <", value, "gatewayboxId");
            return (Criteria) this;
        }

        public Criteria andGatewayboxIdLessThanOrEqualTo(String value) {
            addCriterion("gatewaybox_id <=", value, "gatewayboxId");
            return (Criteria) this;
        }

        public Criteria andGatewayboxIdLike(String value) {
            addCriterion("gatewaybox_id like", value, "gatewayboxId");
            return (Criteria) this;
        }

        public Criteria andGatewayboxIdNotLike(String value) {
            addCriterion("gatewaybox_id not like", value, "gatewayboxId");
            return (Criteria) this;
        }

        public Criteria andGatewayboxIdIn(List<String> values) {
            addCriterion("gatewaybox_id in", values, "gatewayboxId");
            return (Criteria) this;
        }

        public Criteria andGatewayboxIdNotIn(List<String> values) {
            addCriterion("gatewaybox_id not in", values, "gatewayboxId");
            return (Criteria) this;
        }

        public Criteria andGatewayboxIdBetween(String value1, String value2) {
            addCriterion("gatewaybox_id between", value1, value2, "gatewayboxId");
            return (Criteria) this;
        }

        public Criteria andGatewayboxIdNotBetween(String value1, String value2) {
            addCriterion("gatewaybox_id not between", value1, value2, "gatewayboxId");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeIsNull() {
            addCriterion("heartbeat_time is null");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeIsNotNull() {
            addCriterion("heartbeat_time is not null");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeEqualTo(Date value) {
            addCriterion("heartbeat_time =", value, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeNotEqualTo(Date value) {
            addCriterion("heartbeat_time <>", value, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeGreaterThan(Date value) {
            addCriterion("heartbeat_time >", value, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("heartbeat_time >=", value, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeLessThan(Date value) {
            addCriterion("heartbeat_time <", value, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeLessThanOrEqualTo(Date value) {
            addCriterion("heartbeat_time <=", value, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeIn(List<Date> values) {
            addCriterion("heartbeat_time in", values, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeNotIn(List<Date> values) {
            addCriterion("heartbeat_time not in", values, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeBetween(Date value1, Date value2) {
            addCriterion("heartbeat_time between", value1, value2, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeNotBetween(Date value1, Date value2) {
            addCriterion("heartbeat_time not between", value1, value2, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andDooroperationRecordIdIsNull() {
            addCriterion("dooroperation_record_id is null");
            return (Criteria) this;
        }

        public Criteria andDooroperationRecordIdIsNotNull() {
            addCriterion("dooroperation_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andDooroperationRecordIdEqualTo(Integer value) {
            addCriterion("dooroperation_record_id =", value, "dooroperationRecordId");
            return (Criteria) this;
        }

        public Criteria andDooroperationRecordIdNotEqualTo(Integer value) {
            addCriterion("dooroperation_record_id <>", value, "dooroperationRecordId");
            return (Criteria) this;
        }

        public Criteria andDooroperationRecordIdGreaterThan(Integer value) {
            addCriterion("dooroperation_record_id >", value, "dooroperationRecordId");
            return (Criteria) this;
        }

        public Criteria andDooroperationRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dooroperation_record_id >=", value, "dooroperationRecordId");
            return (Criteria) this;
        }

        public Criteria andDooroperationRecordIdLessThan(Integer value) {
            addCriterion("dooroperation_record_id <", value, "dooroperationRecordId");
            return (Criteria) this;
        }

        public Criteria andDooroperationRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("dooroperation_record_id <=", value, "dooroperationRecordId");
            return (Criteria) this;
        }

        public Criteria andDooroperationRecordIdIn(List<Integer> values) {
            addCriterion("dooroperation_record_id in", values, "dooroperationRecordId");
            return (Criteria) this;
        }

        public Criteria andDooroperationRecordIdNotIn(List<Integer> values) {
            addCriterion("dooroperation_record_id not in", values, "dooroperationRecordId");
            return (Criteria) this;
        }

        public Criteria andDooroperationRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("dooroperation_record_id between", value1, value2, "dooroperationRecordId");
            return (Criteria) this;
        }

        public Criteria andDooroperationRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dooroperation_record_id not between", value1, value2, "dooroperationRecordId");
            return (Criteria) this;
        }

        public Criteria andPowerdownWarningIsNull() {
            addCriterion("powerdown_warning is null");
            return (Criteria) this;
        }

        public Criteria andPowerdownWarningIsNotNull() {
            addCriterion("powerdown_warning is not null");
            return (Criteria) this;
        }

        public Criteria andPowerdownWarningEqualTo(Boolean value) {
            addCriterion("powerdown_warning =", value, "powerdownWarning");
            return (Criteria) this;
        }

        public Criteria andPowerdownWarningNotEqualTo(Boolean value) {
            addCriterion("powerdown_warning <>", value, "powerdownWarning");
            return (Criteria) this;
        }

        public Criteria andPowerdownWarningGreaterThan(Boolean value) {
            addCriterion("powerdown_warning >", value, "powerdownWarning");
            return (Criteria) this;
        }

        public Criteria andPowerdownWarningGreaterThanOrEqualTo(Boolean value) {
            addCriterion("powerdown_warning >=", value, "powerdownWarning");
            return (Criteria) this;
        }

        public Criteria andPowerdownWarningLessThan(Boolean value) {
            addCriterion("powerdown_warning <", value, "powerdownWarning");
            return (Criteria) this;
        }

        public Criteria andPowerdownWarningLessThanOrEqualTo(Boolean value) {
            addCriterion("powerdown_warning <=", value, "powerdownWarning");
            return (Criteria) this;
        }

        public Criteria andPowerdownWarningIn(List<Boolean> values) {
            addCriterion("powerdown_warning in", values, "powerdownWarning");
            return (Criteria) this;
        }

        public Criteria andPowerdownWarningNotIn(List<Boolean> values) {
            addCriterion("powerdown_warning not in", values, "powerdownWarning");
            return (Criteria) this;
        }

        public Criteria andPowerdownWarningBetween(Boolean value1, Boolean value2) {
            addCriterion("powerdown_warning between", value1, value2, "powerdownWarning");
            return (Criteria) this;
        }

        public Criteria andPowerdownWarningNotBetween(Boolean value1, Boolean value2) {
            addCriterion("powerdown_warning not between", value1, value2, "powerdownWarning");
            return (Criteria) this;
        }

        public Criteria andReturnFunctionIsNull() {
            addCriterion("return_function is null");
            return (Criteria) this;
        }

        public Criteria andReturnFunctionIsNotNull() {
            addCriterion("return_function is not null");
            return (Criteria) this;
        }

        public Criteria andReturnFunctionEqualTo(Byte value) {
            addCriterion("return_function =", value, "returnFunction");
            return (Criteria) this;
        }

        public Criteria andReturnFunctionNotEqualTo(Byte value) {
            addCriterion("return_function <>", value, "returnFunction");
            return (Criteria) this;
        }

        public Criteria andReturnFunctionGreaterThan(Byte value) {
            addCriterion("return_function >", value, "returnFunction");
            return (Criteria) this;
        }

        public Criteria andReturnFunctionGreaterThanOrEqualTo(Byte value) {
            addCriterion("return_function >=", value, "returnFunction");
            return (Criteria) this;
        }

        public Criteria andReturnFunctionLessThan(Byte value) {
            addCriterion("return_function <", value, "returnFunction");
            return (Criteria) this;
        }

        public Criteria andReturnFunctionLessThanOrEqualTo(Byte value) {
            addCriterion("return_function <=", value, "returnFunction");
            return (Criteria) this;
        }

        public Criteria andReturnFunctionIn(List<Byte> values) {
            addCriterion("return_function in", values, "returnFunction");
            return (Criteria) this;
        }

        public Criteria andReturnFunctionNotIn(List<Byte> values) {
            addCriterion("return_function not in", values, "returnFunction");
            return (Criteria) this;
        }

        public Criteria andReturnFunctionBetween(Byte value1, Byte value2) {
            addCriterion("return_function between", value1, value2, "returnFunction");
            return (Criteria) this;
        }

        public Criteria andReturnFunctionNotBetween(Byte value1, Byte value2) {
            addCriterion("return_function not between", value1, value2, "returnFunction");
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
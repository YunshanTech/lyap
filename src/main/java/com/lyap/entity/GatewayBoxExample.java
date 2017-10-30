package com.lyap.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GatewayBoxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GatewayBoxExample() {
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

        public Criteria andProductCodeIsNull() {
            addCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("product_code like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("product_code not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionIsNull() {
            addCriterion("hardware_version is null");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionIsNotNull() {
            addCriterion("hardware_version is not null");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionEqualTo(String value) {
            addCriterion("hardware_version =", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionNotEqualTo(String value) {
            addCriterion("hardware_version <>", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionGreaterThan(String value) {
            addCriterion("hardware_version >", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionGreaterThanOrEqualTo(String value) {
            addCriterion("hardware_version >=", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionLessThan(String value) {
            addCriterion("hardware_version <", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionLessThanOrEqualTo(String value) {
            addCriterion("hardware_version <=", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionLike(String value) {
            addCriterion("hardware_version like", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionNotLike(String value) {
            addCriterion("hardware_version not like", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionIn(List<String> values) {
            addCriterion("hardware_version in", values, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionNotIn(List<String> values) {
            addCriterion("hardware_version not in", values, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionBetween(String value1, String value2) {
            addCriterion("hardware_version between", value1, value2, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionNotBetween(String value1, String value2) {
            addCriterion("hardware_version not between", value1, value2, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionIsNull() {
            addCriterion("software_version is null");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionIsNotNull() {
            addCriterion("software_version is not null");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionEqualTo(String value) {
            addCriterion("software_version =", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotEqualTo(String value) {
            addCriterion("software_version <>", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionGreaterThan(String value) {
            addCriterion("software_version >", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionGreaterThanOrEqualTo(String value) {
            addCriterion("software_version >=", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionLessThan(String value) {
            addCriterion("software_version <", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionLessThanOrEqualTo(String value) {
            addCriterion("software_version <=", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionLike(String value) {
            addCriterion("software_version like", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotLike(String value) {
            addCriterion("software_version not like", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionIn(List<String> values) {
            addCriterion("software_version in", values, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotIn(List<String> values) {
            addCriterion("software_version not in", values, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionBetween(String value1, String value2) {
            addCriterion("software_version between", value1, value2, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotBetween(String value1, String value2) {
            addCriterion("software_version not between", value1, value2, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andRelatedLockIdIsNull() {
            addCriterion("related_lock_id is null");
            return (Criteria) this;
        }

        public Criteria andRelatedLockIdIsNotNull() {
            addCriterion("related_lock_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedLockIdEqualTo(String value) {
            addCriterion("related_lock_id =", value, "relatedLockId");
            return (Criteria) this;
        }

        public Criteria andRelatedLockIdNotEqualTo(String value) {
            addCriterion("related_lock_id <>", value, "relatedLockId");
            return (Criteria) this;
        }

        public Criteria andRelatedLockIdGreaterThan(String value) {
            addCriterion("related_lock_id >", value, "relatedLockId");
            return (Criteria) this;
        }

        public Criteria andRelatedLockIdGreaterThanOrEqualTo(String value) {
            addCriterion("related_lock_id >=", value, "relatedLockId");
            return (Criteria) this;
        }

        public Criteria andRelatedLockIdLessThan(String value) {
            addCriterion("related_lock_id <", value, "relatedLockId");
            return (Criteria) this;
        }

        public Criteria andRelatedLockIdLessThanOrEqualTo(String value) {
            addCriterion("related_lock_id <=", value, "relatedLockId");
            return (Criteria) this;
        }

        public Criteria andRelatedLockIdLike(String value) {
            addCriterion("related_lock_id like", value, "relatedLockId");
            return (Criteria) this;
        }

        public Criteria andRelatedLockIdNotLike(String value) {
            addCriterion("related_lock_id not like", value, "relatedLockId");
            return (Criteria) this;
        }

        public Criteria andRelatedLockIdIn(List<String> values) {
            addCriterion("related_lock_id in", values, "relatedLockId");
            return (Criteria) this;
        }

        public Criteria andRelatedLockIdNotIn(List<String> values) {
            addCriterion("related_lock_id not in", values, "relatedLockId");
            return (Criteria) this;
        }

        public Criteria andRelatedLockIdBetween(String value1, String value2) {
            addCriterion("related_lock_id between", value1, value2, "relatedLockId");
            return (Criteria) this;
        }

        public Criteria andRelatedLockIdNotBetween(String value1, String value2) {
            addCriterion("related_lock_id not between", value1, value2, "relatedLockId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeIsNull() {
            addCriterion("last_mod_time is null");
            return (Criteria) this;
        }

        public Criteria andLastModTimeIsNotNull() {
            addCriterion("last_mod_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastModTimeEqualTo(Date value) {
            addCriterion("last_mod_time =", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeNotEqualTo(Date value) {
            addCriterion("last_mod_time <>", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeGreaterThan(Date value) {
            addCriterion("last_mod_time >", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_mod_time >=", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeLessThan(Date value) {
            addCriterion("last_mod_time <", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_mod_time <=", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeIn(List<Date> values) {
            addCriterion("last_mod_time in", values, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeNotIn(List<Date> values) {
            addCriterion("last_mod_time not in", values, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeBetween(Date value1, Date value2) {
            addCriterion("last_mod_time between", value1, value2, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_mod_time not between", value1, value2, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andModUserIdIsNull() {
            addCriterion("mod_user_id is null");
            return (Criteria) this;
        }

        public Criteria andModUserIdIsNotNull() {
            addCriterion("mod_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andModUserIdEqualTo(String value) {
            addCriterion("mod_user_id =", value, "modUserId");
            return (Criteria) this;
        }

        public Criteria andModUserIdNotEqualTo(String value) {
            addCriterion("mod_user_id <>", value, "modUserId");
            return (Criteria) this;
        }

        public Criteria andModUserIdGreaterThan(String value) {
            addCriterion("mod_user_id >", value, "modUserId");
            return (Criteria) this;
        }

        public Criteria andModUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("mod_user_id >=", value, "modUserId");
            return (Criteria) this;
        }

        public Criteria andModUserIdLessThan(String value) {
            addCriterion("mod_user_id <", value, "modUserId");
            return (Criteria) this;
        }

        public Criteria andModUserIdLessThanOrEqualTo(String value) {
            addCriterion("mod_user_id <=", value, "modUserId");
            return (Criteria) this;
        }

        public Criteria andModUserIdLike(String value) {
            addCriterion("mod_user_id like", value, "modUserId");
            return (Criteria) this;
        }

        public Criteria andModUserIdNotLike(String value) {
            addCriterion("mod_user_id not like", value, "modUserId");
            return (Criteria) this;
        }

        public Criteria andModUserIdIn(List<String> values) {
            addCriterion("mod_user_id in", values, "modUserId");
            return (Criteria) this;
        }

        public Criteria andModUserIdNotIn(List<String> values) {
            addCriterion("mod_user_id not in", values, "modUserId");
            return (Criteria) this;
        }

        public Criteria andModUserIdBetween(String value1, String value2) {
            addCriterion("mod_user_id between", value1, value2, "modUserId");
            return (Criteria) this;
        }

        public Criteria andModUserIdNotBetween(String value1, String value2) {
            addCriterion("mod_user_id not between", value1, value2, "modUserId");
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
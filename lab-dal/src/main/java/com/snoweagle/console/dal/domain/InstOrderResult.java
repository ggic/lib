package com.snoweagle.console.dal.domain;

import java.math.BigDecimal;
import java.util.Date;

public class InstOrderResult {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.RESULT_ID
     *
     * @mbggenerated
     */
    private Long resultId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.inst_order_id
     *
     * @mbggenerated
     */
    private Long instOrderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.batch_result_id
     *
     * @mbggenerated
     */
    private Long batchResultId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.inst_order_no
     *
     * @mbggenerated
     */
    private String instOrderNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.fund_channel_code
     *
     * @mbggenerated
     */
    private String fundChannelCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.inst_seq_no
     *
     * @mbggenerated
     */
    private String instSeqNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.real_amount
     *
     * @mbggenerated
     */
    private BigDecimal realAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.orgi_inst_order_no
     *
     * @mbggenerated
     */
    private String orgiInstOrderNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.inst_status
     *
     * @mbggenerated
     */
    private String instStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.glide_status
     *
     * @mbggenerated
     */
    private String glideStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.operate_status
     *
     * @mbggenerated
     */
    private String operateStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.inst_result_code
     *
     * @mbggenerated
     */
    private String instResultCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.gmt_modified
     *
     * @mbggenerated
     */
    private String gmtModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.gmt_create
     *
     * @mbggenerated
     */
    private String gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.api_result_code
     *
     * @mbggenerated
     */
    private String apiResultCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.api_result_sub_code
     *
     * @mbggenerated
     */
    private String apiResultSubCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.api_type
     *
     * @mbggenerated
     */
    private String apiType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.extension
     *
     * @mbggenerated
     */
    private String extension;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.real_currency
     *
     * @mbggenerated
     */
    private String realCurrency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.real_portion
     *
     * @mbggenerated
     */
    private BigDecimal realPortion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_inst_order_result.inst_process_date
     *
     * @mbggenerated
     */
    private Date instProcessDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.RESULT_ID
     *
     * @return the value of tt_inst_order_result.RESULT_ID
     *
     * @mbggenerated
     */
    public Long getResultId() {
        return resultId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.RESULT_ID
     *
     * @param resultId the value for tt_inst_order_result.RESULT_ID
     *
     * @mbggenerated
     */
    public void setResultId(Long resultId) {
        this.resultId = resultId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.inst_order_id
     *
     * @return the value of tt_inst_order_result.inst_order_id
     *
     * @mbggenerated
     */
    public Long getInstOrderId() {
        return instOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.inst_order_id
     *
     * @param instOrderId the value for tt_inst_order_result.inst_order_id
     *
     * @mbggenerated
     */
    public void setInstOrderId(Long instOrderId) {
        this.instOrderId = instOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.batch_result_id
     *
     * @return the value of tt_inst_order_result.batch_result_id
     *
     * @mbggenerated
     */
    public Long getBatchResultId() {
        return batchResultId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.batch_result_id
     *
     * @param batchResultId the value for tt_inst_order_result.batch_result_id
     *
     * @mbggenerated
     */
    public void setBatchResultId(Long batchResultId) {
        this.batchResultId = batchResultId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.inst_order_no
     *
     * @return the value of tt_inst_order_result.inst_order_no
     *
     * @mbggenerated
     */
    public String getInstOrderNo() {
        return instOrderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.inst_order_no
     *
     * @param instOrderNo the value for tt_inst_order_result.inst_order_no
     *
     * @mbggenerated
     */
    public void setInstOrderNo(String instOrderNo) {
        this.instOrderNo = instOrderNo == null ? null : instOrderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.fund_channel_code
     *
     * @return the value of tt_inst_order_result.fund_channel_code
     *
     * @mbggenerated
     */
    public String getFundChannelCode() {
        return fundChannelCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.fund_channel_code
     *
     * @param fundChannelCode the value for tt_inst_order_result.fund_channel_code
     *
     * @mbggenerated
     */
    public void setFundChannelCode(String fundChannelCode) {
        this.fundChannelCode = fundChannelCode == null ? null : fundChannelCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.inst_seq_no
     *
     * @return the value of tt_inst_order_result.inst_seq_no
     *
     * @mbggenerated
     */
    public String getInstSeqNo() {
        return instSeqNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.inst_seq_no
     *
     * @param instSeqNo the value for tt_inst_order_result.inst_seq_no
     *
     * @mbggenerated
     */
    public void setInstSeqNo(String instSeqNo) {
        this.instSeqNo = instSeqNo == null ? null : instSeqNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.real_amount
     *
     * @return the value of tt_inst_order_result.real_amount
     *
     * @mbggenerated
     */
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.real_amount
     *
     * @param realAmount the value for tt_inst_order_result.real_amount
     *
     * @mbggenerated
     */
    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.orgi_inst_order_no
     *
     * @return the value of tt_inst_order_result.orgi_inst_order_no
     *
     * @mbggenerated
     */
    public String getOrgiInstOrderNo() {
        return orgiInstOrderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.orgi_inst_order_no
     *
     * @param orgiInstOrderNo the value for tt_inst_order_result.orgi_inst_order_no
     *
     * @mbggenerated
     */
    public void setOrgiInstOrderNo(String orgiInstOrderNo) {
        this.orgiInstOrderNo = orgiInstOrderNo == null ? null : orgiInstOrderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.inst_status
     *
     * @return the value of tt_inst_order_result.inst_status
     *
     * @mbggenerated
     */
    public String getInstStatus() {
        return instStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.inst_status
     *
     * @param instStatus the value for tt_inst_order_result.inst_status
     *
     * @mbggenerated
     */
    public void setInstStatus(String instStatus) {
        this.instStatus = instStatus == null ? null : instStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.glide_status
     *
     * @return the value of tt_inst_order_result.glide_status
     *
     * @mbggenerated
     */
    public String getGlideStatus() {
        return glideStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.glide_status
     *
     * @param glideStatus the value for tt_inst_order_result.glide_status
     *
     * @mbggenerated
     */
    public void setGlideStatus(String glideStatus) {
        this.glideStatus = glideStatus == null ? null : glideStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.operate_status
     *
     * @return the value of tt_inst_order_result.operate_status
     *
     * @mbggenerated
     */
    public String getOperateStatus() {
        return operateStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.operate_status
     *
     * @param operateStatus the value for tt_inst_order_result.operate_status
     *
     * @mbggenerated
     */
    public void setOperateStatus(String operateStatus) {
        this.operateStatus = operateStatus == null ? null : operateStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.inst_result_code
     *
     * @return the value of tt_inst_order_result.inst_result_code
     *
     * @mbggenerated
     */
    public String getInstResultCode() {
        return instResultCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.inst_result_code
     *
     * @param instResultCode the value for tt_inst_order_result.inst_result_code
     *
     * @mbggenerated
     */
    public void setInstResultCode(String instResultCode) {
        this.instResultCode = instResultCode == null ? null : instResultCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.gmt_modified
     *
     * @return the value of tt_inst_order_result.gmt_modified
     *
     * @mbggenerated
     */
    public String getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.gmt_modified
     *
     * @param gmtModified the value for tt_inst_order_result.gmt_modified
     *
     * @mbggenerated
     */
    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.gmt_create
     *
     * @return the value of tt_inst_order_result.gmt_create
     *
     * @mbggenerated
     */
    public String getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.gmt_create
     *
     * @param gmtCreate the value for tt_inst_order_result.gmt_create
     *
     * @mbggenerated
     */
    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.memo
     *
     * @return the value of tt_inst_order_result.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.memo
     *
     * @param memo the value for tt_inst_order_result.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.api_result_code
     *
     * @return the value of tt_inst_order_result.api_result_code
     *
     * @mbggenerated
     */
    public String getApiResultCode() {
        return apiResultCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.api_result_code
     *
     * @param apiResultCode the value for tt_inst_order_result.api_result_code
     *
     * @mbggenerated
     */
    public void setApiResultCode(String apiResultCode) {
        this.apiResultCode = apiResultCode == null ? null : apiResultCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.api_result_sub_code
     *
     * @return the value of tt_inst_order_result.api_result_sub_code
     *
     * @mbggenerated
     */
    public String getApiResultSubCode() {
        return apiResultSubCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.api_result_sub_code
     *
     * @param apiResultSubCode the value for tt_inst_order_result.api_result_sub_code
     *
     * @mbggenerated
     */
    public void setApiResultSubCode(String apiResultSubCode) {
        this.apiResultSubCode = apiResultSubCode == null ? null : apiResultSubCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.api_type
     *
     * @return the value of tt_inst_order_result.api_type
     *
     * @mbggenerated
     */
    public String getApiType() {
        return apiType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.api_type
     *
     * @param apiType the value for tt_inst_order_result.api_type
     *
     * @mbggenerated
     */
    public void setApiType(String apiType) {
        this.apiType = apiType == null ? null : apiType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.extension
     *
     * @return the value of tt_inst_order_result.extension
     *
     * @mbggenerated
     */
    public String getExtension() {
        return extension;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.extension
     *
     * @param extension the value for tt_inst_order_result.extension
     *
     * @mbggenerated
     */
    public void setExtension(String extension) {
        this.extension = extension == null ? null : extension.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.real_currency
     *
     * @return the value of tt_inst_order_result.real_currency
     *
     * @mbggenerated
     */
    public String getRealCurrency() {
        return realCurrency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.real_currency
     *
     * @param realCurrency the value for tt_inst_order_result.real_currency
     *
     * @mbggenerated
     */
    public void setRealCurrency(String realCurrency) {
        this.realCurrency = realCurrency == null ? null : realCurrency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.real_portion
     *
     * @return the value of tt_inst_order_result.real_portion
     *
     * @mbggenerated
     */
    public BigDecimal getRealPortion() {
        return realPortion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.real_portion
     *
     * @param realPortion the value for tt_inst_order_result.real_portion
     *
     * @mbggenerated
     */
    public void setRealPortion(BigDecimal realPortion) {
        this.realPortion = realPortion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_inst_order_result.inst_process_date
     *
     * @return the value of tt_inst_order_result.inst_process_date
     *
     * @mbggenerated
     */
    public Date getInstProcessDate() {
        return instProcessDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_inst_order_result.inst_process_date
     *
     * @param instProcessDate the value for tt_inst_order_result.inst_process_date
     *
     * @mbggenerated
     */
    public void setInstProcessDate(Date instProcessDate) {
        this.instProcessDate = instProcessDate;
    }
}
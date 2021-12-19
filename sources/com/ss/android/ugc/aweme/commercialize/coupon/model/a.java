package com.ss.android.ugc.aweme.commercialize.coupon.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class a extends BaseResponse implements Serializable {
    @c(a = "abbr_condition")
    private String abbrCondition;
    @c(a = "activity_id")
    private int activityId;
    @c(a = "can_rate")
    public int canRate;
    @c(a = "codabar_image_url")
    private String codabarImageUrl;
    @c(a = "code")
    private String code;
    @c(a = "code_id")
    private String codeId;
    @c(a = "condition")
    private String condition;
    @c(a = "coupon_id")
    private int couponId;
    @c(a = "coupon_source")
    private int couponSource;
    @c(a = "coupon_type")
    private int couponType;
    @c(a = "create_time")
    private String createTime;
    @c(a = "desc")
    private String desc;
    @c(a = "detail_url")
    private String detailUrl;
    @c(a = "group")
    private String group;
    @c(a = "head_image_url")
    private UrlModel headImageUrl;
    @c(a = "hint_text")
    public String hintText;
    @c(a = "is_default_head_image")
    private boolean isDefaultHeadImage;
    @c(a = "logo_image_url")
    private UrlModel logoImageUrl;
    @c(a = "sec_uid")
    private String mSecUid;
    @c(a = "merchant_name")
    private String merchantName;
    @c(a = "notification")
    private String notification;
    @c(a = "object_type")
    public int objectType;
    @c(a = "pay_type")
    private int payType;
    @c(a = "qrcode_url")
    private UrlModel qrCodeUrl;
    @c(a = "service_tel")
    private String serviceTel;
    @c(a = "status")
    private int status;
    @c(a = "store_page_link")
    private String storePageLink;
    @c(a = "title")
    private String title;
    @c(a = "use_page_link")
    private String usePageLink;
    @c(a = "user_id")
    private Long userId;
    @c(a = "valid_date_text")
    public String validDateText;
    @c(a = "valid_end")
    private String validEnd;
    @c(a = "valid_start")
    private String validStart;

    static {
        Covode.recordClassIndex(45377);
    }

    public String getAbbrCondition() {
        return this.abbrCondition;
    }

    public int getActivityId() {
        return this.activityId;
    }

    public String getCodabarImageUrl() {
        return this.codabarImageUrl;
    }

    public String getCode() {
        return this.code;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getCondition() {
        return this.condition;
    }

    public int getCouponId() {
        return this.couponId;
    }

    public int getCouponSource() {
        return this.couponSource;
    }

    public int getCouponType() {
        return this.couponType;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDetailUrl() {
        return this.detailUrl;
    }

    public String getGroup() {
        return this.group;
    }

    public UrlModel getHeadImageUrl() {
        return this.headImageUrl;
    }

    public UrlModel getLogoImageUrl() {
        return this.logoImageUrl;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getNotification() {
        return this.notification;
    }

    public int getPayType() {
        return this.payType;
    }

    public UrlModel getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    public String getSecUid() {
        return this.mSecUid;
    }

    public String getServiceTel() {
        return this.serviceTel;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStorePageLink() {
        return this.storePageLink;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUsePageLink() {
        return this.usePageLink;
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getValidEnd() {
        return this.validEnd;
    }

    public String getValidStart() {
        return this.validStart;
    }

    public boolean isDefaultHeadImage() {
        return this.isDefaultHeadImage;
    }

    public void setAbbrCondition(String str) {
        this.abbrCondition = str;
    }

    public void setActivityId(int i2) {
        this.activityId = i2;
    }

    public void setCodabarImageUrl(String str) {
        this.codabarImageUrl = str;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setCondition(String str) {
        this.condition = str;
    }

    public void setCouponId(int i2) {
        this.couponId = i2;
    }

    public void setCouponSource(int i2) {
        this.couponSource = i2;
    }

    public void setCouponType(int i2) {
        this.couponType = i2;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setDefaultHeadImage(boolean z) {
        this.isDefaultHeadImage = z;
    }

    public void setDetailUrl(String str) {
        this.detailUrl = str;
    }

    public void setGroup(String str) {
        this.group = str;
    }

    public void setHeadImageUrl(UrlModel urlModel) {
        this.headImageUrl = urlModel;
    }

    public void setLogoImageUrl(UrlModel urlModel) {
        this.logoImageUrl = urlModel;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public void setNotification(String str) {
        this.notification = str;
    }

    public void setQrCodeUrl(UrlModel urlModel) {
        this.qrCodeUrl = urlModel;
    }

    public void setSecUid(String str) {
        this.mSecUid = str;
    }

    public void setServiceTel(String str) {
        this.serviceTel = str;
    }

    public void setStatus(int i2) {
        this.status = i2;
    }

    public void setStorePageLink(String str) {
        this.storePageLink = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUsePageLink(String str) {
        this.usePageLink = str;
    }

    public void setUserId(Long l2) {
        this.userId = l2;
    }

    public void setValidEnd(String str) {
        this.validEnd = str;
    }

    public void setValidStart(String str) {
        this.validStart = str;
    }
}

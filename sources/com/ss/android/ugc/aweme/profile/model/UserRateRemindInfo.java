package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class UserRateRemindInfo implements Serializable {
    @c(a = "detail_link")
    String detailLink;
    @c(a = "rate_record_id")
    long rateRecordId;
    @c(a = "remind_text")
    String remindText;
    @c(a = "show_day_limit")
    int showDayLimit;
    @c(a = "show_detail_count_limit")
    int showDetailCountLimit;

    static {
        Covode.recordClassIndex(75289);
    }

    public String getDetailLink() {
        return this.detailLink;
    }

    public long getRateRecordId() {
        return this.rateRecordId;
    }

    public String getRemindText() {
        return this.remindText;
    }

    public int getShowDayLimit() {
        return this.showDayLimit;
    }

    public int getShowDetailCountLimit() {
        return this.showDetailCountLimit;
    }

    public void setDetailLink(String str) {
        this.detailLink = str;
    }

    public void setRateRecordId(long j2) {
        this.rateRecordId = j2;
    }

    public void setRemindText(String str) {
        this.remindText = str;
    }

    public void setShowDayLimit(int i2) {
        this.showDayLimit = i2;
    }

    public void setShowDetailCountLimit(int i2) {
        this.showDetailCountLimit = i2;
    }
}

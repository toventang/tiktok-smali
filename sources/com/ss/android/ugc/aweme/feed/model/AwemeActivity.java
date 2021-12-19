package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class AwemeActivity implements Serializable {
    @c(a = "activity_id")
    public String activityId;
    @c(a = "content")
    public AwemeActivityContent content;
    @c(a = "primary_btn")
    public AwemeActivityButton primaryBtn;
    @c(a = "schema_url")
    public String schemaUrl;
    @c(a = "show_delay_time")
    public Long showDelayTime;

    static {
        Covode.recordClassIndex(59312);
    }

    public AwemeActivity() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ AwemeActivity copy$default(AwemeActivity awemeActivity, String str, Long l2, String str2, AwemeActivityContent awemeActivityContent, AwemeActivityButton awemeActivityButton, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = awemeActivity.activityId;
        }
        if ((i2 & 2) != 0) {
            l2 = awemeActivity.showDelayTime;
        }
        if ((i2 & 4) != 0) {
            str2 = awemeActivity.schemaUrl;
        }
        if ((i2 & 8) != 0) {
            awemeActivityContent = awemeActivity.content;
        }
        if ((i2 & 16) != 0) {
            awemeActivityButton = awemeActivity.primaryBtn;
        }
        return awemeActivity.copy(str, l2, str2, awemeActivityContent, awemeActivityButton);
    }

    public final String component1() {
        return this.activityId;
    }

    public final Long component2() {
        return this.showDelayTime;
    }

    public final String component3() {
        return this.schemaUrl;
    }

    public final AwemeActivityContent component4() {
        return this.content;
    }

    public final AwemeActivityButton component5() {
        return this.primaryBtn;
    }

    public final AwemeActivity copy(String str, Long l2, String str2, AwemeActivityContent awemeActivityContent, AwemeActivityButton awemeActivityButton) {
        return new AwemeActivity(str, l2, str2, awemeActivityContent, awemeActivityButton);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeActivity)) {
            return false;
        }
        AwemeActivity awemeActivity = (AwemeActivity) obj;
        return l.a(this.activityId, awemeActivity.activityId) && l.a(this.showDelayTime, awemeActivity.showDelayTime) && l.a(this.schemaUrl, awemeActivity.schemaUrl) && l.a(this.content, awemeActivity.content) && l.a(this.primaryBtn, awemeActivity.primaryBtn);
    }

    public final int hashCode() {
        String str = this.activityId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l2 = this.showDelayTime;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str2 = this.schemaUrl;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        AwemeActivityContent awemeActivityContent = this.content;
        int hashCode4 = (hashCode3 + (awemeActivityContent != null ? awemeActivityContent.hashCode() : 0)) * 31;
        AwemeActivityButton awemeActivityButton = this.primaryBtn;
        if (awemeActivityButton != null) {
            i2 = awemeActivityButton.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "AwemeActivity(activityId=" + this.activityId + ", showDelayTime=" + this.showDelayTime + ", schemaUrl=" + this.schemaUrl + ", content=" + this.content + ", primaryBtn=" + this.primaryBtn + ")";
    }

    public final String getActivityId() {
        return this.activityId;
    }

    public final AwemeActivityContent getContent() {
        return this.content;
    }

    public final AwemeActivityButton getPrimaryBtn() {
        return this.primaryBtn;
    }

    public final String getSchemaUrl() {
        return this.schemaUrl;
    }

    public final Long getShowDelayTime() {
        return this.showDelayTime;
    }

    public AwemeActivity(String str, Long l2, String str2, AwemeActivityContent awemeActivityContent, AwemeActivityButton awemeActivityButton) {
        this.activityId = str;
        this.showDelayTime = l2;
        this.schemaUrl = str2;
        this.content = awemeActivityContent;
        this.primaryBtn = awemeActivityButton;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AwemeActivity(String str, Long l2, String str2, AwemeActivityContent awemeActivityContent, AwemeActivityButton awemeActivityButton, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : l2, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : awemeActivityContent, (i2 & 16) == 0 ? awemeActivityButton : null);
    }
}

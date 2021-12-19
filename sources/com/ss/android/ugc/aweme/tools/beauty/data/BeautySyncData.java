package com.ss.android.ugc.aweme.tools.beauty.data;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class BeautySyncData {
    private String categoryId;
    private String effectId;
    private String parentId;
    private String resourceId;

    static {
        Covode.recordClassIndex(90832);
    }

    public static /* synthetic */ BeautySyncData copy$default(BeautySyncData beautySyncData, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = beautySyncData.effectId;
        }
        if ((i2 & 2) != 0) {
            str2 = beautySyncData.resourceId;
        }
        if ((i2 & 4) != 0) {
            str3 = beautySyncData.categoryId;
        }
        if ((i2 & 8) != 0) {
            str4 = beautySyncData.parentId;
        }
        return beautySyncData.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.effectId;
    }

    public final String component2() {
        return this.resourceId;
    }

    public final String component3() {
        return this.categoryId;
    }

    public final String component4() {
        return this.parentId;
    }

    public final BeautySyncData copy(String str, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        return new BeautySyncData(str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeautySyncData)) {
            return false;
        }
        BeautySyncData beautySyncData = (BeautySyncData) obj;
        return l.a(this.effectId, beautySyncData.effectId) && l.a(this.resourceId, beautySyncData.resourceId) && l.a(this.categoryId, beautySyncData.categoryId) && l.a(this.parentId, beautySyncData.parentId);
    }

    public final int hashCode() {
        String str = this.effectId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.resourceId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.categoryId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.parentId;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "BeautySyncData(effectId=" + this.effectId + ", resourceId=" + this.resourceId + ", categoryId=" + this.categoryId + ", parentId=" + this.parentId + ")";
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getResourceId() {
        return this.resourceId;
    }

    public final void setCategoryId(String str) {
        this.categoryId = str;
    }

    public final void setParentId(String str) {
        this.parentId = str;
    }

    public final void setEffectId(String str) {
        l.d(str, "");
        this.effectId = str;
    }

    public final void setResourceId(String str) {
        l.d(str, "");
        this.resourceId = str;
    }

    public BeautySyncData(String str, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        this.effectId = str;
        this.resourceId = str2;
        this.categoryId = str3;
        this.parentId = str4;
    }
}

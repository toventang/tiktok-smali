package com.ss.android.ugc.aweme.setting.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.io.Serializable;

public final class h extends BaseResponse implements Serializable {
    @c(a = "appeal_url")
    private final String appealUrl;
    @c(a = "default_birthdate")
    private final String defaultDoB;
    @c(a = "desc_type")
    private final Integer descType;
    @c(a = "notification_msg")
    private final String msg;
    @c(a = "edibility_birthdate_type")
    private final Integer type;
    @c(a = "upper_bound_date")
    private final String upperBoundDate;

    static {
        Covode.recordClassIndex(80212);
    }

    public h() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ h copy$default(h hVar, Integer num, String str, String str2, String str3, String str4, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = hVar.type;
        }
        if ((i2 & 2) != 0) {
            str = hVar.defaultDoB;
        }
        if ((i2 & 4) != 0) {
            str2 = hVar.msg;
        }
        if ((i2 & 8) != 0) {
            str3 = hVar.appealUrl;
        }
        if ((i2 & 16) != 0) {
            str4 = hVar.upperBoundDate;
        }
        if ((i2 & 32) != 0) {
            num2 = hVar.descType;
        }
        return hVar.copy(num, str, str2, str3, str4, num2);
    }

    public final Integer component1() {
        return this.type;
    }

    public final String component2() {
        return this.defaultDoB;
    }

    public final String component3() {
        return this.msg;
    }

    public final String component4() {
        return this.appealUrl;
    }

    public final String component5() {
        return this.upperBoundDate;
    }

    public final Integer component6() {
        return this.descType;
    }

    public final h copy(Integer num, String str, String str2, String str3, String str4, Integer num2) {
        return new h(num, str, str2, str3, str4, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.type, hVar.type) && l.a(this.defaultDoB, hVar.defaultDoB) && l.a(this.msg, hVar.msg) && l.a(this.appealUrl, hVar.appealUrl) && l.a(this.upperBoundDate, hVar.upperBoundDate) && l.a(this.descType, hVar.descType);
    }

    public final int hashCode() {
        Integer num = this.type;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.defaultDoB;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.msg;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.appealUrl;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.upperBoundDate;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num2 = this.descType;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode5 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "DoBStatus(type=" + this.type + ", defaultDoB=" + this.defaultDoB + ", msg=" + this.msg + ", appealUrl=" + this.appealUrl + ", upperBoundDate=" + this.upperBoundDate + ", descType=" + this.descType + ")";
    }

    public final String getAppealUrl() {
        return this.appealUrl;
    }

    public final String getDefaultDoB() {
        return this.defaultDoB;
    }

    public final Integer getDescType() {
        return this.descType;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final Integer getType() {
        return this.type;
    }

    public final String getUpperBoundDate() {
        return this.upperBoundDate;
    }

    public h(Integer num, String str, String str2, String str3, String str4, Integer num2) {
        this.type = num;
        this.defaultDoB = str;
        this.msg = str2;
        this.appealUrl = str3;
        this.upperBoundDate = str4;
        this.descType = num2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ h(java.lang.Integer r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.Integer r14, int r15, h.f.b.g r16) {
        /*
            r8 = this;
            r5 = r12
            r3 = r10
            r4 = r11
            r2 = r9
            r1 = r15 & 1
            r0 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L_0x000e
            r2 = r7
        L_0x000e:
            r0 = r15 & 2
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x0015
            r3 = r6
        L_0x0015:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x001a
            r4 = r6
        L_0x001a:
            r0 = r15 & 8
            if (r0 == 0) goto L_0x001f
            r5 = r6
        L_0x001f:
            r0 = r15 & 16
            if (r0 == 0) goto L_0x002e
        L_0x0023:
            r0 = r15 & 32
            if (r0 == 0) goto L_0x002c
        L_0x0027:
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        L_0x002c:
            r7 = r14
            goto L_0x0027
        L_0x002e:
            r6 = r13
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.model.h.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, h.f.b.g):void");
    }
}

package com.ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;

public final class BeautyMobParam implements Parcelable, Serializable {
    public static final Parcelable.Creator<BeautyMobParam> CREATOR = new Creator();
    private final String beautifyChildIdListStr;
    private final String beautifyChildNameListStr;
    private final String beautifyChildValueListStr;
    private final String beautifyParentIdListStr;
    private final String beautifyParentNameListStr;
    private final String beautifyParentValueListStr;

    public static class Creator implements Parcelable.Creator<BeautyMobParam> {
        static {
            Covode.recordClassIndex(84413);
        }

        @Override // android.os.Parcelable.Creator
        public final BeautyMobParam createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new BeautyMobParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeautyMobParam[] newArray(int i2) {
            return new BeautyMobParam[i2];
        }
    }

    static {
        Covode.recordClassIndex(84412);
    }

    public BeautyMobParam() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ BeautyMobParam copy$default(BeautyMobParam beautyMobParam, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = beautyMobParam.beautifyChildIdListStr;
        }
        if ((i2 & 2) != 0) {
            str2 = beautyMobParam.beautifyChildNameListStr;
        }
        if ((i2 & 4) != 0) {
            str3 = beautyMobParam.beautifyChildValueListStr;
        }
        if ((i2 & 8) != 0) {
            str4 = beautyMobParam.beautifyParentIdListStr;
        }
        if ((i2 & 16) != 0) {
            str5 = beautyMobParam.beautifyParentNameListStr;
        }
        if ((i2 & 32) != 0) {
            str6 = beautyMobParam.beautifyParentValueListStr;
        }
        return beautyMobParam.copy(str, str2, str3, str4, str5, str6);
    }

    public final String component1() {
        return this.beautifyChildIdListStr;
    }

    public final String component2() {
        return this.beautifyChildNameListStr;
    }

    public final String component3() {
        return this.beautifyChildValueListStr;
    }

    public final String component4() {
        return this.beautifyParentIdListStr;
    }

    public final String component5() {
        return this.beautifyParentNameListStr;
    }

    public final String component6() {
        return this.beautifyParentValueListStr;
    }

    public final BeautyMobParam copy(String str, String str2, String str3, String str4, String str5, String str6) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        return new BeautyMobParam(str, str2, str3, str4, str5, str6);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeautyMobParam)) {
            return false;
        }
        BeautyMobParam beautyMobParam = (BeautyMobParam) obj;
        return l.a(this.beautifyChildIdListStr, beautyMobParam.beautifyChildIdListStr) && l.a(this.beautifyChildNameListStr, beautyMobParam.beautifyChildNameListStr) && l.a(this.beautifyChildValueListStr, beautyMobParam.beautifyChildValueListStr) && l.a(this.beautifyParentIdListStr, beautyMobParam.beautifyParentIdListStr) && l.a(this.beautifyParentNameListStr, beautyMobParam.beautifyParentNameListStr) && l.a(this.beautifyParentValueListStr, beautyMobParam.beautifyParentValueListStr);
    }

    public final int hashCode() {
        String str = this.beautifyChildIdListStr;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.beautifyChildNameListStr;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.beautifyChildValueListStr;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.beautifyParentIdListStr;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.beautifyParentNameListStr;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.beautifyParentValueListStr;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "BeautyMobParam(beautifyChildIdListStr=" + this.beautifyChildIdListStr + ", beautifyChildNameListStr=" + this.beautifyChildNameListStr + ", beautifyChildValueListStr=" + this.beautifyChildValueListStr + ", beautifyParentIdListStr=" + this.beautifyParentIdListStr + ", beautifyParentNameListStr=" + this.beautifyParentNameListStr + ", beautifyParentValueListStr=" + this.beautifyParentValueListStr + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.beautifyChildIdListStr);
        parcel.writeString(this.beautifyChildNameListStr);
        parcel.writeString(this.beautifyChildValueListStr);
        parcel.writeString(this.beautifyParentIdListStr);
        parcel.writeString(this.beautifyParentNameListStr);
        parcel.writeString(this.beautifyParentValueListStr);
    }

    public final String getBeautifyChildIdListStr() {
        return this.beautifyChildIdListStr;
    }

    public final String getBeautifyChildNameListStr() {
        return this.beautifyChildNameListStr;
    }

    public final String getBeautifyChildValueListStr() {
        return this.beautifyChildValueListStr;
    }

    public final String getBeautifyParentIdListStr() {
        return this.beautifyParentIdListStr;
    }

    public final String getBeautifyParentNameListStr() {
        return this.beautifyParentNameListStr;
    }

    public final String getBeautifyParentValueListStr() {
        return this.beautifyParentValueListStr;
    }

    public BeautyMobParam(String str, String str2, String str3, String str4, String str5, String str6) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        this.beautifyChildIdListStr = str;
        this.beautifyChildNameListStr = str2;
        this.beautifyChildValueListStr = str3;
        this.beautifyParentIdListStr = str4;
        this.beautifyParentNameListStr = str5;
        this.beautifyParentValueListStr = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BeautyMobParam(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, h.f.b.g r15) {
        /*
            r7 = this;
            r5 = r12
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0 = r14 & 1
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x000c
            r1 = r6
        L_0x000c:
            r0 = r14 & 2
            if (r0 == 0) goto L_0x0011
            r2 = r6
        L_0x0011:
            r0 = r14 & 4
            if (r0 == 0) goto L_0x0016
            r3 = r6
        L_0x0016:
            r0 = r14 & 8
            if (r0 == 0) goto L_0x001b
            r4 = r6
        L_0x001b:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0020
            r5 = r6
        L_0x0020:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x0029
        L_0x0024:
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0029:
            r6 = r13
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.model.BeautyMobParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}

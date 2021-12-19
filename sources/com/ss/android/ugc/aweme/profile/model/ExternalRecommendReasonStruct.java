package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import h.m.p;
import java.io.Serializable;

public final class ExternalRecommendReasonStruct implements Serializable {
    @c(a = "external_username")
    public String externalUsername;
    @c(a = "hashed_phone_number")
    public String hashedPhoneNumber;
    @c(a = "reason")
    public String reason;

    static {
        Covode.recordClassIndex(75219);
    }

    public ExternalRecommendReasonStruct() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ExternalRecommendReasonStruct copy$default(ExternalRecommendReasonStruct externalRecommendReasonStruct, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = externalRecommendReasonStruct.reason;
        }
        if ((i2 & 2) != 0) {
            str2 = externalRecommendReasonStruct.hashedPhoneNumber;
        }
        if ((i2 & 4) != 0) {
            str3 = externalRecommendReasonStruct.externalUsername;
        }
        return externalRecommendReasonStruct.copy(str, str2, str3);
    }

    public final String component1() {
        return this.reason;
    }

    public final String component2() {
        return this.hashedPhoneNumber;
    }

    public final String component3() {
        return this.externalUsername;
    }

    public final ExternalRecommendReasonStruct copy(String str, String str2, String str3) {
        return new ExternalRecommendReasonStruct(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalRecommendReasonStruct)) {
            return false;
        }
        ExternalRecommendReasonStruct externalRecommendReasonStruct = (ExternalRecommendReasonStruct) obj;
        return l.a(this.reason, externalRecommendReasonStruct.reason) && l.a(this.hashedPhoneNumber, externalRecommendReasonStruct.hashedPhoneNumber) && l.a(this.externalUsername, externalRecommendReasonStruct.externalUsername);
    }

    public final int hashCode() {
        String str = this.reason;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.hashedPhoneNumber;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.externalUsername;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ExternalRecommendReasonStruct(reason=" + this.reason + ", hashedPhoneNumber=" + this.hashedPhoneNumber + ", externalUsername=" + this.externalUsername + ")";
    }

    public final String getExternalUsername() {
        return this.externalUsername;
    }

    public final String getHashedPhoneNumber() {
        return this.hashedPhoneNumber;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getFormatReason() {
        String str = this.reason;
        if (str != null) {
            return p.a(str, "{0}", "%s", false);
        }
        return null;
    }

    public final boolean isValid() {
        String str = this.reason;
        if (str == null || str.length() == 0 || formatArgInvalid()) {
            return false;
        }
        return true;
    }

    public final boolean formatArgInvalid() {
        String str;
        String str2;
        String str3 = this.reason;
        if (str3 != null && p.a((CharSequence) str3, (CharSequence) "{0}", false) && (((str = this.hashedPhoneNumber) == null || str.length() == 0) && ((str2 = this.externalUsername) == null || str2.length() == 0))) {
            return true;
        }
        return false;
    }

    public final void setExternalUsername(String str) {
        this.externalUsername = str;
    }

    public final void setHashedPhoneNumber(String str) {
        this.hashedPhoneNumber = str;
    }

    public final void setReason(String str) {
        this.reason = str;
    }

    public ExternalRecommendReasonStruct(String str, String str2, String str3) {
        this.reason = str;
        this.hashedPhoneNumber = str2;
        this.externalUsername = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExternalRecommendReasonStruct(String str, String str2, String str3, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3);
    }
}

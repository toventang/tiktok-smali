package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.g;
import h.f.b.l;

public final class AgeGateOption {
    @c(a = "content")
    public final String content;
    @c(a = StringSet.type)
    public final String type;
    @c(a = "url")
    public final String url;

    static {
        Covode.recordClassIndex(75201);
    }

    public AgeGateOption() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AgeGateOption copy$default(AgeGateOption ageGateOption, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ageGateOption.content;
        }
        if ((i2 & 2) != 0) {
            str2 = ageGateOption.url;
        }
        if ((i2 & 4) != 0) {
            str3 = ageGateOption.type;
        }
        return ageGateOption.copy(str, str2, str3);
    }

    public final AgeGateOption copy(String str, String str2, String str3) {
        l.d(str, "");
        return new AgeGateOption(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgeGateOption)) {
            return false;
        }
        AgeGateOption ageGateOption = (AgeGateOption) obj;
        return l.a(this.content, ageGateOption.content) && l.a(this.url, ageGateOption.url) && l.a(this.type, ageGateOption.type);
    }

    public final int hashCode() {
        String str = this.content;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.type;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "AgeGateOption(content=" + this.content + ", url=" + this.url + ", type=" + this.type + ")";
    }

    public AgeGateOption(String str, String str2, String str3) {
        l.d(str, "");
        this.content = str;
        this.url = str2;
        this.type = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AgeGateOption(String str, String str2, String str3, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? "" : str3);
    }
}

package com.ss.android.ugc.aweme.account.login.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class PhoneCountryData {
    private final int code;
    private final String displayname;
    private final String en;
    private final String key;

    static {
        Covode.recordClassIndex(39140);
    }

    public static int com_ss_android_ugc_aweme_account_login_model_PhoneCountryData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ PhoneCountryData copy$default(PhoneCountryData phoneCountryData, String str, String str2, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = phoneCountryData.key;
        }
        if ((i3 & 2) != 0) {
            str2 = phoneCountryData.en;
        }
        if ((i3 & 4) != 0) {
            i2 = phoneCountryData.code;
        }
        if ((i3 & 8) != 0) {
            str3 = phoneCountryData.displayname;
        }
        return phoneCountryData.copy(str, str2, i2, str3);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.en;
    }

    public final int component3() {
        return this.code;
    }

    public final String component4() {
        return this.displayname;
    }

    public final PhoneCountryData copy(String str, String str2, int i2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return new PhoneCountryData(str, str2, i2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneCountryData)) {
            return false;
        }
        PhoneCountryData phoneCountryData = (PhoneCountryData) obj;
        return l.a(this.key, phoneCountryData.key) && l.a(this.en, phoneCountryData.en) && this.code == phoneCountryData.code && l.a(this.displayname, phoneCountryData.displayname);
    }

    public final int hashCode() {
        String str = this.key;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.en;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_account_login_model_PhoneCountryData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.code)) * 31;
        String str3 = this.displayname;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "PhoneCountryData(key=" + this.key + ", en=" + this.en + ", code=" + this.code + ", displayname=" + this.displayname + ")";
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDisplayname() {
        return this.displayname;
    }

    public final String getEn() {
        return this.en;
    }

    public final String getKey() {
        return this.key;
    }

    public PhoneCountryData(String str, String str2, int i2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.key = str;
        this.en = str2;
        this.code = i2;
        this.displayname = str3;
    }
}

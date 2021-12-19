package com.ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class u implements Serializable {
    @c(a = "avatar_url")
    private final String avatar_url;
    @c(a = "email")
    private final String email;
    @c(a = "error_code")
    private final Integer errorCode;
    @c(a = "has_email")
    private Boolean has_email;
    @c(a = "has_mobile")
    private Boolean has_mobile;
    @c(a = "has_oauth")
    private Boolean has_oauth;
    @c(a = "has_pwd")
    private Boolean has_pwd;
    @c(a = "is_login")
    private final Boolean is_login;
    @c(a = "is_most_device")
    private final Boolean is_most_device;
    @c(a = "mobile")
    private final String mobile;
    @c(a = "nickname")
    private final String nickname;
    @c(a = "token")
    private final String token;

    static {
        Covode.recordClassIndex(39482);
    }

    public static /* synthetic */ u copy$default(u uVar, String str, String str2, String str3, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str4, String str5, Boolean bool6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = uVar.avatar_url;
        }
        if ((i2 & 2) != 0) {
            str2 = uVar.nickname;
        }
        if ((i2 & 4) != 0) {
            str3 = uVar.email;
        }
        if ((i2 & 8) != 0) {
            num = uVar.errorCode;
        }
        if ((i2 & 16) != 0) {
            bool = uVar.has_email;
        }
        if ((i2 & 32) != 0) {
            bool2 = uVar.has_mobile;
        }
        if ((i2 & 64) != 0) {
            bool3 = uVar.has_oauth;
        }
        if ((i2 & 128) != 0) {
            bool4 = uVar.has_pwd;
        }
        if ((i2 & 256) != 0) {
            bool5 = uVar.is_most_device;
        }
        if ((i2 & 512) != 0) {
            str4 = uVar.mobile;
        }
        if ((i2 & 1024) != 0) {
            str5 = uVar.token;
        }
        if ((i2 & 2048) != 0) {
            bool6 = uVar.is_login;
        }
        return uVar.copy(str, str2, str3, num, bool, bool2, bool3, bool4, bool5, str4, str5, bool6);
    }

    public final String component1() {
        return this.avatar_url;
    }

    public final String component10() {
        return this.mobile;
    }

    public final String component11() {
        return this.token;
    }

    public final Boolean component12() {
        return this.is_login;
    }

    public final String component2() {
        return this.nickname;
    }

    public final String component3() {
        return this.email;
    }

    public final Integer component4() {
        return this.errorCode;
    }

    public final Boolean component5() {
        return this.has_email;
    }

    public final Boolean component6() {
        return this.has_mobile;
    }

    public final Boolean component7() {
        return this.has_oauth;
    }

    public final Boolean component8() {
        return this.has_pwd;
    }

    public final Boolean component9() {
        return this.is_most_device;
    }

    public final u copy(String str, String str2, String str3, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str4, String str5, Boolean bool6) {
        return new u(str, str2, str3, num, bool, bool2, bool3, bool4, bool5, str4, str5, bool6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return l.a(this.avatar_url, uVar.avatar_url) && l.a(this.nickname, uVar.nickname) && l.a(this.email, uVar.email) && l.a(this.errorCode, uVar.errorCode) && l.a(this.has_email, uVar.has_email) && l.a(this.has_mobile, uVar.has_mobile) && l.a(this.has_oauth, uVar.has_oauth) && l.a(this.has_pwd, uVar.has_pwd) && l.a(this.is_most_device, uVar.is_most_device) && l.a(this.mobile, uVar.mobile) && l.a(this.token, uVar.token) && l.a(this.is_login, uVar.is_login);
    }

    public final int hashCode() {
        String str = this.avatar_url;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.nickname;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.email;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.errorCode;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.has_email;
        int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.has_mobile;
        int hashCode6 = (hashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.has_oauth;
        int hashCode7 = (hashCode6 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.has_pwd;
        int hashCode8 = (hashCode7 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Boolean bool5 = this.is_most_device;
        int hashCode9 = (hashCode8 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        String str4 = this.mobile;
        int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.token;
        int hashCode11 = (hashCode10 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Boolean bool6 = this.is_login;
        if (bool6 != null) {
            i2 = bool6.hashCode();
        }
        return hashCode11 + i2;
    }

    public final String toString() {
        return "TwoSvUserData(avatar_url=" + this.avatar_url + ", nickname=" + this.nickname + ", email=" + this.email + ", errorCode=" + this.errorCode + ", has_email=" + this.has_email + ", has_mobile=" + this.has_mobile + ", has_oauth=" + this.has_oauth + ", has_pwd=" + this.has_pwd + ", is_most_device=" + this.is_most_device + ", mobile=" + this.mobile + ", token=" + this.token + ", is_login=" + this.is_login + ")";
    }

    public final String getAvatar_url() {
        return this.avatar_url;
    }

    public final String getEmail() {
        return this.email;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final Boolean getHas_email() {
        return this.has_email;
    }

    public final Boolean getHas_mobile() {
        return this.has_mobile;
    }

    public final Boolean getHas_oauth() {
        return this.has_oauth;
    }

    public final Boolean getHas_pwd() {
        return this.has_pwd;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getToken() {
        return this.token;
    }

    public final Boolean is_login() {
        return this.is_login;
    }

    public final Boolean is_most_device() {
        return this.is_most_device;
    }

    public final void setHas_email(Boolean bool) {
        this.has_email = bool;
    }

    public final void setHas_mobile(Boolean bool) {
        this.has_mobile = bool;
    }

    public final void setHas_oauth(Boolean bool) {
        this.has_oauth = bool;
    }

    public final void setHas_pwd(Boolean bool) {
        this.has_pwd = bool;
    }

    public u(String str, String str2, String str3, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str4, String str5, Boolean bool6) {
        this.avatar_url = str;
        this.nickname = str2;
        this.email = str3;
        this.errorCode = num;
        this.has_email = bool;
        this.has_mobile = bool2;
        this.has_oauth = bool3;
        this.has_pwd = bool4;
        this.is_most_device = bool5;
        this.mobile = str4;
        this.token = str5;
        this.is_login = bool6;
    }
}

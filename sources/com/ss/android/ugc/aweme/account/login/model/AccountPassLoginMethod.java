package com.ss.android.ugc.aweme.account.login.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import h.f.b.g;
import h.f.b.l;

public final class AccountPassLoginMethod extends BaseLoginMethod {
    private String name;

    static {
        Covode.recordClassIndex(39134);
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2) {
        this(str, loginMethodName, str2, null, null, null, null, 120, null);
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo) {
        this(str, loginMethodName, str2, commonUserInfo, null, null, null, 112, null);
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo, Long l2) {
        this(str, loginMethodName, str2, commonUserInfo, l2, null, null, 96, null);
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo, Long l2, Long l3) {
        this(str, loginMethodName, str2, commonUserInfo, l2, l3, null, 64, null);
    }

    public AccountPassLoginMethod(String str, String str2) {
        this(str, null, str2, null, null, null, null, 122, null);
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        l.d(str, "");
        this.name = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo, Long l2, Long l3, Boolean bool) {
        super(str, loginMethodName, commonUserInfo, null, l2, l3, bool, null, null, 392, null);
        l.d(str, "");
        l.d(loginMethodName, "");
        l.d(str2, "");
        l.d(commonUserInfo, "");
        this.name = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo, Long l2, Long l3, Boolean bool, int i2, g gVar) {
        this(str, (i2 & 2) != 0 ? LoginMethodName.EMAIL_PASS : loginMethodName, str2, (i2 & 8) != 0 ? CommonUserInfo.a.a() : commonUserInfo, (i2 & 16) != 0 ? -1L : l2, (i2 & 32) != 0 ? -1L : l3, (i2 & 64) != 0 ? false : bool);
    }
}

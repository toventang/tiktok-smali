package com.ss.android.ugc.aweme.account.login.rememberaccount;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f63638a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(39234);
    }

    public static String a(BaseLoginMethod baseLoginMethod) {
        l.d(baseLoginMethod, "");
        LoginMethodName loginMethodName = baseLoginMethod.getLoginMethodName();
        if (loginMethodName == LoginMethodName.EMAIL_PASS) {
            return "email";
        }
        if (loginMethodName == LoginMethodName.USER_NAME_PASS) {
            return "handle";
        }
        if (loginMethodName == LoginMethodName.PHONE_NUMBER_PASS) {
            return "phone";
        }
        if (loginMethodName == LoginMethodName.PHONE_SMS) {
            return "sms_verification";
        }
        if (loginMethodName == LoginMethodName.THIRD_PARTY) {
            return ((TPLoginMethod) baseLoginMethod).getPlatform();
        }
        return "";
    }
}

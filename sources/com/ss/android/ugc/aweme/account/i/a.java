package com.ss.android.ugc.aweme.account.i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f63058a = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final String f63059c = "Login";

    /* renamed from: com.ss.android.ugc.aweme.account.i.a$a  reason: collision with other inner class name */
    public enum EnumC1395a {
        GET_THIRD_PARTY_AUTH_INFO,
        SSO_WITH_THIRD_PARTY,
        HIT_VERIFY_STRATEGY,
        HIT_NO_TRUST_DEVICE,
        REFRESH_AWEME_USER,
        USER_OPERATOR_AFTER_LOGIN,
        CHECK_PRIVACY_ACCEPT,
        ONE_LOGIN_GET_TOKEN,
        ONE_LOGIN_BY_TOKEN,
        LOGIN_BY_PASS,
        LOGIN_BY_PHONE_SMS,
        THIRD_MATCH_SETTING_BEFORE_LOGIN,
        THIRD_MATCH_SETTING_AFTER_LOGIN,
        THIRD_MATCH_SETTING_CLICK,
        THIRD_LOGIN_AGE_GATE,
        PHONE_NUMBER_INVALID,
        NEED_INTERCEPTE;

        static {
            Covode.recordClassIndex(38846);
        }
    }

    private a() {
    }

    @Override // com.ss.android.ugc.aweme.account.i.c
    public final String a() {
        return f63059c;
    }

    static {
        Covode.recordClassIndex(38845);
    }

    public static final void a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on update user info result check");
        hashMap.put("errorMsg", str);
        a aVar = f63058a;
        String hashMap2 = hashMap.toString();
        l.b(hashMap2, "");
        aVar.b(hashMap2);
    }

    public static final void a(EnumC1395a aVar, String str) {
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "login part success");
        if (aVar == null || (str2 = aVar.name()) == null) {
            str2 = "";
        }
        hashMap.put("part", str2);
        hashMap.put("loginMethod", "");
        if (str == null) {
            str = "";
        }
        hashMap.put("extra", str);
        a aVar2 = f63058a;
        String hashMap2 = hashMap.toString();
        l.b(hashMap2, "");
        aVar2.b(hashMap2);
    }

    public static final void a(String str, String str2, EnumC1395a aVar, String str3) {
        String str4;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "login part fail");
        if (str == null) {
            str = "";
        }
        hashMap.put("errorCode", str);
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("errorMsg", str2);
        if (aVar == null || (str4 = aVar.name()) == null) {
            str4 = "";
        }
        hashMap.put("part", str4);
        hashMap.put("loginMethod", "");
        hashMap.put("extra", str3);
        a aVar2 = f63058a;
        String hashMap2 = hashMap.toString();
        l.b(hashMap2, "");
        aVar2.b(hashMap2);
    }

    public static final void b(boolean z, String str, boolean z2, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "Auto fill SMS verification code");
        hashMap.put("success", String.valueOf(z));
        hashMap.put("hasSimCard", String.valueOf(z2));
        hashMap.put("googleAvailability", String.valueOf(i2));
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                str = "";
            }
            hashMap.put("errorMsg", str);
        }
        a aVar = f63058a;
        String hashMap2 = hashMap.toString();
        l.b(hashMap2, "");
        aVar.b(hashMap2);
    }

    public static final void a(boolean z, String str, boolean z2, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "Auto fill user's phone number");
        hashMap.put("success", String.valueOf(z));
        hashMap.put("hasSimCard", String.valueOf(z2));
        hashMap.put("googleAvailability", String.valueOf(i2));
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                str = "";
            }
            hashMap.put("errorMsg", str);
        }
        a aVar = f63058a;
        String hashMap2 = hashMap.toString();
        l.b(hashMap2, "");
        aVar.b(hashMap2);
    }
}

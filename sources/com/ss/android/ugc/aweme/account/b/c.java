package com.ss.android.ugc.aweme.account.b;

import com.bytedance.covode.number.Covode;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.a.b.a;
import com.ss.android.ugc.aweme.common.r;

public final class c {
    static {
        Covode.recordClassIndex(38738);
    }

    public static void a(String str) {
        r.a("uc_bind_click_exit", new a().a("enter_from", str).a("params_for_special", "uc_login").f62575a);
    }

    public static void a(String str, String str2) {
        r.a("uc_bind_notify", new a().a("enter_from", str).a("bind_type", str2).a("params_for_special", "uc_login").f62575a);
    }

    public static void b(String str, String str2) {
        r.a("uc_bind_submit", new a().a("enter_from", str).a("bind_type", str2).a("params_for_special", "uc_login").f62575a);
    }

    public static void a(String str, String str2, String str3, int i2) {
        int i3;
        a a2 = new a().a("enter_from", str).a("enter_method", str2).a("platform", str3);
        if (i2 == 0) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        r.a("bind_status", a2.a("status", i3).f62575a);
    }

    public static void a(String str, String str2, int i2, String str3, String str4) {
        String str5;
        a a2 = new a().a("enter_from", str).a("bind_type", str2);
        if (i2 == 0) {
            str5 = "success";
        } else {
            str5 = "fail";
        }
        a a3 = a2.a("status", str5).a("error_code", i2).a("fail_info", str3).a("params_for_special", "uc_login");
        if (str4 != null) {
            try {
                a3.a("phone_country", PhoneNumberUtil.getInstance().parse(str4, null).getCountryCode());
            } catch (NumberParseException e2) {
                e2.printStackTrace();
            }
        }
        r.a("uc_bind_result", a3.f62575a);
    }
}

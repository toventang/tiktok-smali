package com.ss.android.ugc.aweme.account.login.twostep;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.account.login.twostep.a;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import java.util.List;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f64030a = new q();

    private q() {
    }

    public static void a(String str, boolean z) {
        l.d(str, "");
        r.a("authorized_logins_result", a().a("enter_from", str).a("result", z ? "success" : "fail").f66730a);
    }

    static {
        Covode.recordClassIndex(39448);
    }

    public static d a() {
        d a2 = new d().a("aid", com.bytedance.ies.ugc.appcontext.d.n).a("user_id", cj.b()).a("params_for_special", "uc_login");
        l.b(a2, "");
        return a2;
    }

    public static void b(String str) {
        l.d(str, "");
        r.a("two_step_verification_turn_on_notify", a().a("enter_from", str).f66730a);
    }

    public static void c(String str) {
        l.d(str, "");
        r.a("two_step_verification_manage_notify", a().a("enter_from", str).f66730a);
    }

    private static void d(String str) {
        r.a("twosv_setup_show", a().a("enter_from", "settings_security").a("page_type", str).f66730a);
    }

    public static String a(String str) {
        l.d(str, "");
        switch (str.hashCode()) {
            case -797498437:
                if (str.equals("pwd_verify")) {
                    return "password";
                }
                break;
            case 300626556:
                if (str.equals("email_verify")) {
                    return "email_code";
                }
                break;
            case 312290780:
                if (str.equals("mobile_sms_verify")) {
                    return "sms";
                }
                break;
            case 961294113:
                if (str.equals("oauth_verify")) {
                    return "oauth";
                }
                break;
        }
        return "";
    }

    public static String a(List<String> list) {
        String str = "";
        l.d(list, str);
        for (String str2 : list) {
            StringBuilder append = new StringBuilder().append(str);
            if (str.length() > 0) {
                str2 = ",".concat(String.valueOf(str2));
            }
            str = append.append(str2).toString();
        }
        return str;
    }

    public static void a(a aVar) {
        String str;
        l.d(aVar, "");
        a.C1430a data = aVar.getData();
        if (data != null) {
            str = data.getDefault_verify_way();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            d("off");
        } else {
            d("on");
        }
    }

    public static void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        r.a("two_step_verification_manage_click", a().a("click_button", str).a("enter_from", str2).f66730a);
    }

    public static void b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        r.a("twosv_setup_popup_show", a().a("popup_type", str).a("enter_from", str2).f66730a);
    }

    public static void c(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        r.a("login_two_step_verification_notify", a().a("platform", str).a("verification_method", str2).f66730a);
    }

    public static void b(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        r.a("twosv_setup_popup_click", a().a("popup_type", str2).a("click_button", str).a("enter_from", str3).f66730a);
    }

    public static void a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        r.a("twosv_setup_verification_result", a().a("verify_method", str).a("status", str2).a("enter_from", str3).f66730a);
    }

    public static void a(String str, String str2, boolean z) {
        String str3;
        l.d(str, "");
        l.d(str2, "");
        d a2 = a().a("platform", str).a("verification_method", str2);
        if (z) {
            str3 = "success";
        } else {
            str3 = "fail";
        }
        r.a("login_two_step_verification_result", a2.a("status", str3).f66730a);
    }

    public static void a(String str, int i2, int i3, int i4, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        r.a("twosv_setup_method_remove_success", a().a("is_sms_removed", i2).a("is_email_removed", i3).a("is_pw_removed", i4).a(StringSet.type, str).a("enter_from", str2).a("verify_method", str3).f66730a);
    }
}

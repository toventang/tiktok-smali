package com.ss.android.ugc.aweme.account.login;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.h.a.p;
import com.ss.android.ugc.aweme.account.a.b.a;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;

public final class u {
    static {
        Covode.recordClassIndex(39496);
    }

    public static void a(boolean z) {
        r.a("tap_show_password", new a().a("is_show", z ? 1 : 0).f62575a);
    }

    public static void a(boolean z, String str, String str2) {
        String str3;
        a a2 = new a().a("is_success", z ? 1 : 0);
        if (cj.d()) {
            str = "pop_up";
        }
        a a3 = a2.a("enter_method", str);
        if (cj.d()) {
            str3 = "existing";
        } else {
            str3 = "new";
        }
        a a4 = a3.a("user_type", str3);
        if (!z && str2 != null) {
            a4.a("error_desc", str2);
        }
        r.a("create_password_next", a4.f62575a);
    }

    public static void a(boolean z, String str, d<p> dVar, String str2) {
        a a2 = new a().a("is_success", z ? 1 : 0);
        if (cj.d()) {
            str = "pop_up";
        }
        a a3 = a2.a("enter_method", str);
        if (dVar != null) {
            a3.a("request_id", dVar.f43070a);
            if (!z) {
                if (dVar.f43081j == null) {
                    a3.a("message", "obj null");
                } else if (((p) dVar.f43081j).f43318c == null) {
                    a3.a("message", "info null");
                }
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            a3.a("error_desc", str2);
        }
        r.a("create_password_next", a3.f62575a);
    }

    public static void a(boolean z, String str, String str2, boolean z2) {
        a a2 = new a().a("is_success", z ? 1 : 0).a("suggest_flag", z2 ? 1 : 0).a("enter_method", str2);
        if (cj.d()) {
            str = "pop_up";
        }
        r.a("create_account_next", a2.a("enter_from", str).f62575a);
    }
}

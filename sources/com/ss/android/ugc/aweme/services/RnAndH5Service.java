package com.ss.android.ugc.aweme.services;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.ss.android.ugc.aweme.account.e.a;
import com.ss.android.ugc.aweme.account.p.a.b;
import com.ss.android.ugc.aweme.account.p.a.e;
import com.ss.android.ugc.aweme.account.p.a.f;
import com.ss.android.ugc.aweme.account.p.a.g;
import com.ss.android.ugc.aweme.account.p.a.h;
import com.ss.android.ugc.aweme.bv;
import com.ss.android.ugc.aweme.c;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import h.a.ag;
import h.f.b.l;
import h.p;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public final class RnAndH5Service implements bv {
    static {
        Covode.recordClassIndex(79559);
    }

    public static int com_ss_android_ugc_aweme_services_RnAndH5Service_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.bv
    public final void notifyFromRnAndH5(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (TextUtils.equals("find_account_back", jSONObject.getString("eventName"))) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    cj.a(new a(jSONObject2.getString("platform"), new JSONObject(jSONObject2.getString("user_info"))).f62962a);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("block_bind_phone", true);
                    c.a(bundle);
                    r.a("login_submit", new com.ss.android.ugc.aweme.account.a.b.a().a("platform", "sms_verification").a("enter_method", "").f62575a);
                    r.a("login_success", new com.ss.android.ugc.aweme.account.a.b.a().a("platform", "sms_verification").a("enter_method", "").a("status", 1).f62575a);
                    com.ss.android.ugc.aweme.account.f.a.a(4);
                } else if (TextUtils.equals("rebindPhone_certify_success", jSONObject.getString("eventName"))) {
                    com.ss.android.ugc.aweme.account.f.a.a(8);
                }
                if (TextUtils.equals(jSONObject.getString("eventName"), "account_recover_done")) {
                    com.ss.android.ugc.aweme.account.f.a.a(12);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.bv
    public final Map<String, d> getJavaMethods(WeakReference<Context> weakReference, com.bytedance.ies.web.a.a aVar) {
        l.d(weakReference, "");
        l.d(aVar, "");
        return ag.c(new p("sendVerifyCode", new f(weakReference, aVar)), new p("validateVerifyCode", new h(weakReference, aVar)), new p("localPhoneNo", new com.ss.android.ugc.aweme.account.p.a.a(weakReference, aVar)), new p("recentLoginUsersInfo", new e(aVar)), new p("open_2sv", new com.ss.android.ugc.aweme.account.p.a.d(weakReference, aVar)), new p("loginH5Failed", new com.ss.android.ugc.aweme.account.p.a.c(weakReference, aVar)), new p("loginFromH5", new b(weakReference, aVar)), new p("update_account_info", new g(weakReference, aVar)));
    }
}

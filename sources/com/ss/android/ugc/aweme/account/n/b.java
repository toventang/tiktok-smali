package com.ss.android.ugc.aweme.account.n;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.util.a;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import h.m.p;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f65162a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(40060);
    }

    public static void a(int i2) {
        String str;
        try {
            StringBuilder sb = new StringBuilder();
            if (a.a()) {
                str = "https://";
            } else {
                str = "";
            }
            String cookie = CookieManager.getInstance().getCookie(sb.append(str).append("tiktokv.com").toString());
            boolean z = true;
            if (!TextUtils.isEmpty(cookie)) {
                l.b(cookie, "");
                if (p.e((CharSequence) cookie, (CharSequence) "sessionid")) {
                    return;
                }
            }
            if (d.a(com.bytedance.ttnet.a.a.a(com.bytedance.ies.ugc.appcontext.d.a()).d(".tiktokv.com"))) {
                z = false;
            }
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("cookie1", cookie);
            int i3 = 2;
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("empty", 2);
            if (!z) {
                i3 = 3;
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("in_share_cookie", i3);
            if (!z) {
                a4.a("share_cookie", com.ss.android.ugc.aweme.bf.d.a(com.bytedance.ies.ugc.appcontext.d.a(), "ss_app_config", 0).getString("share_cookie_host_list", ""));
            }
            a4.a("enter_from", i2);
            r.a("cookie_status", a4.f66730a);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}

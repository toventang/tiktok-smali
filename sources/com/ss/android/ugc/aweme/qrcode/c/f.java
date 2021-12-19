package com.ss.android.ugc.aweme.qrcode.c;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ck.v;
import h.f.b.l;
import h.m.p;

public final class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f119724a = new a((byte) 0);

    static {
        Covode.recordClassIndex(77776);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.c.d
    public final String a() {
        return "schema";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77777);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.qrcode.c.d
    public final boolean a(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str == null) {
            l.b();
        }
        if (p.b(str, "aweme://authorize", false)) {
            Context a2 = d.a();
            Bundle bundle = new Bundle();
            if (!(v.b(str, "client_key") == null || v.b(str, "scope") == null || (v.b(str, "token") == null && v.b(str, "bc_params") == null))) {
                if (v.b(str, "authType") != null) {
                    String b2 = v.b(str, "authType");
                    l.b(b2, "");
                    bundle.putInt("authType", Integer.parseInt(b2));
                }
                SmartRouter.buildRoute(a2, str).withParam("_bytedance_params_client_key", v.b(str, "client_key")).withParam("_bytedance_params_client_secret", v.b(str, "client_secret")).withParam("_bytedance_params_next_url", v.b(str, "next_url")).withParam("_bytedance_params_scope", v.b(str, "scope")).withParam("key_qrcode_auth", true).withParam("key_qrcode_token", v.b(str, "token")).withParam("key_qrcode_bc_params", v.b(str, "bc_params")).withParam("key_qrcode_redirect_uri", v.b(str, "redirect_url")).withParam("_bytedance_params_extra", bundle).open();
                return true;
            }
        }
        return false;
    }
}

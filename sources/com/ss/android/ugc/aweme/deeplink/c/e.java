package com.ss.android.ugc.aweme.deeplink.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.deeplink.AppLinkHandlerV2;
import com.ss.android.ugc.aweme.deeplink.RequireLoginActivity;
import com.ss.android.ugc.aweme.deeplink.d;
import com.ss.android.ugc.aweme.deeplink.d.c;
import com.ss.android.ugc.aweme.deeplink.m;
import com.ss.android.ugc.aweme.deeplink.u;
import h.f.b.l;

public final class e extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f79454a = new a((byte) 0);

    static {
        Covode.recordClassIndex(49365);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49366);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public e() {
        super(true);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.c.b
    public final boolean b(d dVar) {
        l.d(dVar, "");
        return RequireLoginActivity.a.a(dVar.f79465e);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.c.b
    public final boolean a(d dVar) {
        String str;
        l.d(dVar, "");
        c.c("LoginNode");
        u.a("LoginNode");
        if (dVar.f79464d instanceof AppLinkHandlerV2) {
            str = "from_app_link";
        } else {
            str = "from_deep_link";
        }
        m.f79501a.b(dVar.f79464d, str, true);
        return true;
    }
}

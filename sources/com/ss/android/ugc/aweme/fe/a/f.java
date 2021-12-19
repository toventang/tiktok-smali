package com.ss.android.ugc.aweme.fe.a;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lancet.p;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f91019a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(57238);
    }

    public static void a(Exception exc) {
        c cVar = new c();
        if (!TextUtils.isEmpty("error")) {
            cVar.a("msg_type", "error");
        }
        cVar.a("error_desc", Log.getStackTraceString(exc));
        if (!TextUtils.isEmpty(null)) {
            cVar.a("tag", (String) null);
        }
        if (!TextUtils.isEmpty(null)) {
            cVar.a("channel_name", (String) null);
        }
        if (!TextUtils.isEmpty(null)) {
            cVar.a("module_name", (String) null);
        }
        l.b(cVar, "");
        if (!cVar.f66728a.isEmpty()) {
            n.a("aweme_rn_log", cVar.a());
            if (TextUtils.equals("error", "error")) {
                a.a((Throwable) new p(exc));
                b.a(exc, "aweme_rn_log");
            }
        }
    }
}

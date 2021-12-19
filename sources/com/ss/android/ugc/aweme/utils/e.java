package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.df.c;
import com.ss.android.ugc.tools.f.b;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f142842a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(93458);
    }

    public static String a() {
        c cVar = c.C1870c.f80046a;
        l.b(cVar, "");
        if (cVar.a()) {
            return "background";
        }
        Activity c2 = c.c();
        if (c2 != null) {
            return c2.toString();
        }
        return null;
    }

    public static void a(String str) {
        l.d(str, "");
        q.d("AVSecurityMobHelper onOpenMic creationId: " + str + " currentPage " + a());
        r.a("tool_mic_open", new b().a("creation_id", str).a("page", a()).f149193a);
    }

    public static void b(String str) {
        l.d(str, "");
        q.d("AVSecurityMobHelper onOpenMicSuccess creationId: " + str + " currentPage " + a());
        r.a("tool_mic_open_success", new b().a("creation_id", str).a("page", a()).f149193a);
    }

    public static void c(String str) {
        l.d(str, "");
        q.d("AVSecurityMobHelper onReleaseMic creationId: " + str + " currentPage " + a());
        r.a("tool_mic_release", new b().a("creation_id", str).a("page", a()).f149193a);
    }

    public static void a(String str, int i2, String str2) {
        l.d(str, "");
        l.d(str2, "");
        q.d("AVSecurityMobHelper onOpenMicFailed creationId: " + str + " errCode: " + i2 + " msg: " + str2 + " currentPage " + a());
        r.a("tool_mic_open_fail", new b().a("creation_id", str).a("error_code", i2).a("msg", str2).a("page", a()).f149193a);
    }
}

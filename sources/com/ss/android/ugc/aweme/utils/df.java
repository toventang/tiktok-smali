package com.ss.android.ugc.aweme.utils;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.platform.godzilla.a;
import com.bytedance.platform.godzilla.c.d;
import com.ss.android.ugc.aweme.lego.b;

public final class df {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f142819a;

    static {
        Covode.recordClassIndex(93431);
    }

    public static void a(Application application) {
        boolean b2 = b.b();
        a.C1028a aVar = new a.C1028a(application);
        aVar.a(new com.bytedance.platform.godzilla.b.c.a());
        if (!b2) {
            aVar.a(new com.bytedance.platform.godzilla.b.b());
        }
        aVar.a(new com.bytedance.platform.godzilla.b.c.b());
        aVar.a(new ab());
        aVar.a(new com.bytedance.platform.godzilla.sysopt.b());
        aVar.a(new g());
        aVar.a(new fm());
        aVar.a(new gx());
        aVar.a(new h());
        aVar.a(new er());
        if (Keva.getRepo("ab_repo_cold_boot").getBoolean("thread_stack_opt", true) && (Build.VERSION.SDK_INT < 23 || !Process.is64Bit())) {
            aVar.a(new com.bytedance.platform.godzilla.sysopt.a());
        }
        a.a(aVar.a()).a(d.IMMEDIATE);
        f142819a = true;
    }
}

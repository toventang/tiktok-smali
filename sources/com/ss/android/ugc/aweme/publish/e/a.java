package com.ss.android.ugc.aweme.publish.e;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import h.m.p;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f118715a = SettingsManager.a().a("studio_publish_log_max_length", 1000);

    /* renamed from: b  reason: collision with root package name */
    public static final a f118716b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(77130);
    }

    public static void a(String str, Throwable th) {
        l.d(str, "");
        l.d(th, "");
        if (com.ss.android.ugc.aweme.settings.l.a()) {
            StringBuilder append = new StringBuilder("[stage-").append(str).append("][thread-");
            Thread currentThread = Thread.currentThread();
            l.b(currentThread, "");
            q.a("Tiktok-Publish", p.c(append.append(currentThread.getName()).append("] ").append(Log.getStackTraceString(th)).toString(), f118715a));
        }
    }
}

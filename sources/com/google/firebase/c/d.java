package com.google.firebase.c;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f54303a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f54304b;

    static {
        Covode.recordClassIndex(33714);
    }

    private d(Context context) {
        this.f54304b = com.ss.android.ugc.aweme.bf.d.a(context, "FirebaseAppHeartBeat", 0);
    }

    static synchronized d a(Context context) {
        d dVar;
        synchronized (d.class) {
            MethodCollector.i(7416);
            if (f54303a == null) {
                f54303a = new d(context);
            }
            dVar = f54303a;
            MethodCollector.o(7416);
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean a(long j2) {
        boolean a2;
        MethodCollector.i(7427);
        a2 = a("fire-global", j2);
        MethodCollector.o(7427);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean a(String str, long j2) {
        MethodCollector.i(7424);
        if (!this.f54304b.contains(str)) {
            this.f54304b.edit().putLong(str, j2).apply();
            MethodCollector.o(7424);
            return true;
        } else if (j2 - this.f54304b.getLong(str, -1) >= 86400000) {
            this.f54304b.edit().putLong(str, j2).apply();
            MethodCollector.o(7424);
            return true;
        } else {
            MethodCollector.o(7424);
            return false;
        }
    }
}

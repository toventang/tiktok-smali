package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf.d;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private static WeakReference<u> f54636a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f54637b;

    /* renamed from: c  reason: collision with root package name */
    private r f54638c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f54639d;

    static {
        Covode.recordClassIndex(33901);
    }

    private final synchronized void b() {
        MethodCollector.i(5538);
        this.f54638c = r.a(this.f54637b, "topic_operation_queue", ",", this.f54639d);
        MethodCollector.o(5538);
    }

    /* access modifiers changed from: package-private */
    public final synchronized t a() {
        MethodCollector.i(5545);
        String a2 = this.f54638c.a();
        if (TextUtils.isEmpty(a2)) {
            MethodCollector.o(5545);
            return null;
        }
        String[] split = a2.split("!", -1);
        if (split.length != 2) {
            MethodCollector.o(5545);
            return null;
        }
        t tVar = new t(split[0], split[1]);
        MethodCollector.o(5545);
        return tVar;
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean a(t tVar) {
        boolean a2;
        MethodCollector.i(5547);
        a2 = this.f54638c.a(tVar.f54635c);
        MethodCollector.o(5547);
        return a2;
    }

    private u(SharedPreferences sharedPreferences, Executor executor) {
        this.f54639d = executor;
        this.f54637b = sharedPreferences;
    }

    public static synchronized u a(Context context, Executor executor) {
        u uVar;
        synchronized (u.class) {
            MethodCollector.i(5540);
            WeakReference<u> weakReference = f54636a;
            if (weakReference == null || (uVar = weakReference.get()) == null) {
                uVar = new u(d.a(context, "com.google.android.gms.appid", 0), executor);
                uVar.b();
                f54636a = new WeakReference<>(uVar);
            }
            MethodCollector.o(5540);
        }
        return uVar;
    }
}

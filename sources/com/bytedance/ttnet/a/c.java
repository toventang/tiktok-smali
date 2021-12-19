package com.bytedance.ttnet.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.j;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static volatile c f44450a;

    /* renamed from: f  reason: collision with root package name */
    private static final Object f44451f = new Object();

    /* renamed from: h  reason: collision with root package name */
    private static volatile SharedPreferences f44452h;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f44453b;

    /* renamed from: c  reason: collision with root package name */
    volatile long f44454c;

    /* renamed from: d  reason: collision with root package name */
    public volatile int f44455d;

    /* renamed from: e  reason: collision with root package name */
    public volatile int f44456e;

    /* renamed from: g  reason: collision with root package name */
    private volatile Context f44457g;

    static {
        Covode.recordClassIndex(27233);
    }

    /* access modifiers changed from: package-private */
    public final SharedPreferences a() {
        if (f44452h == null) {
            f44452h = d.a(this.f44457g, "image_opt_table", 0);
        }
        return f44452h;
    }

    public final l.a b() {
        Context context = this.f44457g;
        if (j.f107224c == l.a.UNKNOWN || !j.b() || j.c()) {
            j.f107224c = l.d(context);
        }
        return j.f107224c;
    }

    private c(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (a.f107168c && applicationContext == null) {
                applicationContext = a.f107166a;
            }
            this.f44457g = applicationContext;
        }
        try {
            SharedPreferences a2 = a();
            this.f44453b = a2.getInt("image_opt_switch", 0);
            this.f44454c = a2.getLong("image_opt_black_interval", 0);
            this.f44455d = a2.getInt("image_opt_failed_times", 0);
            this.f44456e = a2.getInt("image_opt_limit_count", 0);
        } catch (Throwable unused) {
        }
    }

    public static c a(Context context) {
        MethodCollector.i(6406);
        if (f44450a == null) {
            synchronized (f44451f) {
                try {
                    if (f44450a == null) {
                        f44450a = new c(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6406);
                    throw th;
                }
            }
        }
        c cVar = f44450a;
        MethodCollector.o(6406);
        return cVar;
    }
}

package com.bytedance.push.a;

import android.content.Context;
import android.os.Looper;
import com.bytedance.common.utility.b.e;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.message.d;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f42043c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f42044a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakHandler f42045b;

    static {
        Covode.recordClassIndex(25700);
    }

    public final void a() {
        AnonymousClass1 r2 = new Runnable() {
            /* class com.bytedance.push.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(25701);
            }

            public final void run() {
                a.this.b();
            }
        };
        if (Looper.getMainLooper() == Looper.myLooper()) {
            e.a(r2);
        } else {
            r2.run();
        }
    }

    public final synchronized b b() {
        b bVar;
        MethodCollector.i(8542);
        try {
            Class<?> cls = Class.forName("com.a.b.AKeeperImpl");
            bVar = (b) cls.getMethod("inst", new Class[0]).invoke(cls, new Object[0]);
            MethodCollector.o(8542);
        } catch (Throwable unused) {
            MethodCollector.o(8542);
            return null;
        }
        return bVar;
    }

    private a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f42044a = applicationContext;
        this.f42045b = d.a().f59828a;
    }

    public static a a(Context context) {
        MethodCollector.i(8376);
        if (f42043c == null) {
            synchronized (a.class) {
                try {
                    if (f42043c == null) {
                        f42043c = new a(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8376);
                    throw th;
                }
            }
        }
        a aVar = f42043c;
        MethodCollector.o(8376);
        return aVar;
    }
}

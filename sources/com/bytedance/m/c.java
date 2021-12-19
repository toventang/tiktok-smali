package com.bytedance.m;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.m.a.b;
import com.bytedance.m.b.a;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static b f41336a;

    /* renamed from: b  reason: collision with root package name */
    public static Context f41337b;

    /* renamed from: c  reason: collision with root package name */
    public static a f41338c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f41339d;

    static {
        Covode.recordClassIndex(25324);
    }

    public static Map<String, a> a() {
        return f41336a.a();
    }

    public static a a(String str) {
        return f41336a.b(str);
    }

    public static synchronized void a(a aVar) {
        synchronized (c.class) {
            MethodCollector.i(7867);
            if (f41339d) {
                MethodCollector.o(7867);
                return;
            }
            f41338c = aVar;
            f41337b = aVar.a();
            f41336a = b.b();
            f41339d = true;
            MethodCollector.o(7867);
        }
    }
}

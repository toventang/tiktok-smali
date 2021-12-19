package com.bytedance.bdturing.twiceverify;

import com.bytedance.bdturing.twiceverify.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class c {

    /* renamed from: e  reason: collision with root package name */
    private static volatile c f26559e;

    /* renamed from: a  reason: collision with root package name */
    public b f26560a;

    /* renamed from: b  reason: collision with root package name */
    public a f26561b;

    /* renamed from: c  reason: collision with root package name */
    public a f26562c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.bdturing.verify.a.a f26563d;

    /* renamed from: f  reason: collision with root package name */
    private b.a f26564f = new b.a() {
        /* class com.bytedance.bdturing.twiceverify.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(15605);
        }
    };

    public interface a {
        static {
            Covode.recordClassIndex(15606);
        }

        void a();

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(15604);
    }

    public static c a() {
        MethodCollector.i(760);
        if (f26559e == null) {
            synchronized (c.class) {
                try {
                    f26559e = new c();
                } catch (Throwable th) {
                    MethodCollector.o(760);
                    throw th;
                }
            }
        }
        c cVar = f26559e;
        MethodCollector.o(760);
        return cVar;
    }
}

package com.bytedance.globalpayment.a.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.globalpayment.a.a.a.e.b.b;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f30141a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile com.bytedance.globalpayment.a.a.a.e.b.a f30142b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f30143c;

    static {
        Covode.recordClassIndex(17513);
    }

    private a() {
    }

    public static b a() {
        MethodCollector.i(12225);
        if (f30141a == null) {
            synchronized (a.class) {
                try {
                    if (f30141a == null) {
                        f30141a = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12225);
                    throw th;
                }
            }
        }
        b bVar = f30141a;
        MethodCollector.o(12225);
        return bVar;
    }

    @Override // com.bytedance.globalpayment.a.a.a.b
    public final com.bytedance.globalpayment.a.a.a.e.b.a b() {
        MethodCollector.i(12374);
        if (f30142b == null) {
            synchronized (this) {
                try {
                    if (f30142b == null) {
                        f30142b = new com.bytedance.globalpayment.a.a.a.e.a.a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12374);
                    throw th;
                }
            }
        }
        com.bytedance.globalpayment.a.a.a.e.b.a aVar = f30142b;
        MethodCollector.o(12374);
        return aVar;
    }

    @Override // com.bytedance.globalpayment.a.a.a.b
    public final b c() {
        MethodCollector.i(12375);
        if (f30143c == null) {
            synchronized (this) {
                try {
                    if (f30143c == null) {
                        f30143c = new com.bytedance.globalpayment.a.a.a.e.a.b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12375);
                    throw th;
                }
            }
        }
        b bVar = f30143c;
        MethodCollector.o(12375);
        return bVar;
    }
}

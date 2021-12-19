package com.lynx.tasm.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f56600b;

    /* renamed from: a  reason: collision with root package name */
    public b f56601a;

    static {
        Covode.recordClassIndex(35295);
    }

    public static a a() {
        MethodCollector.i(12351);
        if (f56600b == null) {
            synchronized (a.class) {
                try {
                    if (f56600b == null) {
                        f56600b = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12351);
                    throw th;
                }
            }
        }
        a aVar = f56600b;
        MethodCollector.o(12351);
        return aVar;
    }
}

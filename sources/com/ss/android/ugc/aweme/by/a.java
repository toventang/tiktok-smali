package com.ss.android.ugc.aweme.by;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f69572b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f69573a = true;

    static {
        Covode.recordClassIndex(42919);
    }

    public static a a() {
        MethodCollector.i(1879);
        if (f69572b == null) {
            synchronized (a.class) {
                try {
                    if (f69572b == null) {
                        f69572b = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1879);
                    throw th;
                }
            }
        }
        a aVar = f69572b;
        MethodCollector.o(1879);
        return aVar;
    }
}

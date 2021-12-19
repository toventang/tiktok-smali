package com.ss.android.ml;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f59854a;

    /* renamed from: c  reason: collision with root package name */
    private static i f59855c;

    /* renamed from: b  reason: collision with root package name */
    public j f59856b;

    static {
        Covode.recordClassIndex(36995);
    }

    public static i a() {
        MethodCollector.i(9507);
        if (f59855c == null) {
            synchronized (i.class) {
                try {
                    if (f59855c == null) {
                        f59855c = new i();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9507);
                    throw th;
                }
            }
        }
        i iVar = f59855c;
        MethodCollector.o(9507);
        return iVar;
    }
}

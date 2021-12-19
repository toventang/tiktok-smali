package com.ss.android.ugc.aweme.app;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class j {

    /* renamed from: c  reason: collision with root package name */
    private static j f66807c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f66808a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f66809b = true;

    static {
        Covode.recordClassIndex(41127);
    }

    public static j a() {
        MethodCollector.i(8462);
        if (f66807c == null) {
            synchronized (j.class) {
                try {
                    if (f66807c == null) {
                        f66807c = new j();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8462);
                    throw th;
                }
            }
        }
        j jVar = f66807c;
        MethodCollector.o(8462);
        return jVar;
    }
}

package com.bytedance.platform.a.b;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class b {

    /* renamed from: d  reason: collision with root package name */
    private static b f41856d;

    /* renamed from: a  reason: collision with root package name */
    public Application f41857a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f41858b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f41859c;

    static {
        Covode.recordClassIndex(25581);
    }

    private b(Application application) {
        this.f41857a = application;
    }

    public static b a(Application application) {
        MethodCollector.i(3930);
        if (f41856d == null) {
            synchronized (b.class) {
                try {
                    if (f41856d == null) {
                        f41856d = new b(application);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3930);
                    throw th;
                }
            }
        }
        b bVar = f41856d;
        MethodCollector.o(3930);
        return bVar;
    }
}

package com.ss.android.ugc.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicBoolean;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f148523c;

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.i.a.a f148524a;

    /* renamed from: b  reason: collision with root package name */
    public AtomicBoolean f148525b = new AtomicBoolean(true);

    static {
        Covode.recordClassIndex(97902);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(3604);
        if (f148523c == null) {
            synchronized (a.class) {
                try {
                    if (f148523c == null) {
                        f148523c = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3604);
                    throw th;
                }
            }
        }
        a aVar = f148523c;
        MethodCollector.o(3604);
        return aVar;
    }

    public final void a(int i2) {
        if (!this.f148525b.get()) {
            this.f148524a.a(i2);
        }
    }
}

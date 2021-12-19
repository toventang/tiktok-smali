package com.bytedance.android.monitor.j;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f23521a;

    /* renamed from: b  reason: collision with root package name */
    private d f23522b;

    /* renamed from: c  reason: collision with root package name */
    private c f23523c;

    static {
        Covode.recordClassIndex(13968);
    }

    @Override // com.bytedance.android.monitor.j.b
    public final d b() {
        if (this.f23522b == null) {
            this.f23522b = new d();
        }
        return this.f23522b;
    }

    @Override // com.bytedance.android.monitor.j.b
    public final c c() {
        if (this.f23523c == null) {
            this.f23523c = new c();
        }
        return this.f23523c;
    }

    public static a a() {
        MethodCollector.i(2930);
        if (f23521a == null) {
            synchronized (a.class) {
                try {
                    if (f23521a == null) {
                        f23521a = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2930);
                    throw th;
                }
            }
        }
        a aVar = f23521a;
        MethodCollector.o(2930);
        return aVar;
    }
}

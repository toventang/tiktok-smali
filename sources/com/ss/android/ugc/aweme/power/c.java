package com.ss.android.ugc.aweme.power;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class c implements b {

    /* renamed from: b  reason: collision with root package name */
    private static c f115705b;

    /* renamed from: a  reason: collision with root package name */
    public int f115706a;

    static {
        Covode.recordClassIndex(74653);
    }

    public final boolean b() {
        if (this.f115706a != 0) {
            return true;
        }
        return false;
    }

    public static c a() {
        MethodCollector.i(6764);
        if (f115705b == null) {
            synchronized (c.class) {
                try {
                    if (f115705b == null) {
                        f115705b = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6764);
                    throw th;
                }
            }
        }
        c cVar = f115705b;
        MethodCollector.o(6764);
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.power.b
    public final void a(int i2) {
        this.f115706a = i2;
    }
}

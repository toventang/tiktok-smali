package com.ss.ugc.effectplatform.algorithm;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ugc.effectplatform.algorithm.g;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static g f153449a = g.a.f153468a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f153450b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f153451c;

    private b() {
    }

    static {
        Covode.recordClassIndex(102321);
    }

    public final void a() {
        MethodCollector.i(9409);
        if (f153451c) {
            MethodCollector.o(9409);
            return;
        }
        synchronized (this) {
            try {
                if (!f153451c) {
                    f153449a.loadLibrary("newep");
                    f153451c = true;
                }
            } finally {
                MethodCollector.o(9409);
            }
        }
    }
}

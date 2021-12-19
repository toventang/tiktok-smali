package com.ss.android.medialib;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class h {

    /* renamed from: b  reason: collision with root package name */
    private static final String f59723b = h.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private static volatile h f59724c = null;

    /* renamed from: a  reason: collision with root package name */
    public RecordInvoker f59725a;

    static {
        Covode.recordClassIndex(36883);
    }

    public static h a() {
        MethodCollector.i(4442);
        synchronized (h.class) {
            try {
                if (f59724c == null) {
                    synchronized (h.class) {
                        try {
                            if (f59724c == null) {
                                f59724c = new h();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } finally {
                MethodCollector.o(4442);
            }
        }
        h hVar = f59724c;
        MethodCollector.o(4442);
        return hVar;
    }

    public final void a(float f2) {
        RecordInvoker recordInvoker = this.f59725a;
        if (recordInvoker != null) {
            recordInvoker.updateReactionBGAlpha(f2);
        }
    }
}

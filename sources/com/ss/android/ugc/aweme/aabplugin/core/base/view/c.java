package com.ss.android.ugc.aweme.aabplugin.core.base.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class c {

    /* renamed from: c  reason: collision with root package name */
    private static volatile c f62555c;

    /* renamed from: a  reason: collision with root package name */
    public volatile b f62556a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f62557b;

    static {
        Covode.recordClassIndex(38484);
    }

    private c() {
    }

    public final void b() {
        if (!(this.f62556a == null || this.f62556a.f62550b == null || this.f62556a.f62550b.isFinishing())) {
            this.f62556a.dismiss();
        }
        this.f62556a = null;
        this.f62557b = false;
    }

    public static c a() {
        MethodCollector.i(11162);
        if (f62555c == null) {
            synchronized (c.class) {
                try {
                    if (f62555c == null) {
                        f62555c = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11162);
                    throw th;
                }
            }
        }
        c cVar = f62555c;
        MethodCollector.o(11162);
        return cVar;
    }

    public final void a(long j2, long j3) {
        int b2;
        if (this.f62556a != null && this.f62556a.f62550b != null && (b2 = b(j2, j3)) > this.f62556a.getProgress()) {
            this.f62556a.setProgress(b2);
        }
    }

    private static int b(long j2, long j3) {
        int i2;
        if (j2 <= 0 || j3 <= 0) {
            i2 = 0;
        } else {
            i2 = (int) Math.ceil((double) ((((float) j2) * 100.0f) / ((float) j3)));
        }
        return Math.max(0, Math.min(i2, 100));
    }
}

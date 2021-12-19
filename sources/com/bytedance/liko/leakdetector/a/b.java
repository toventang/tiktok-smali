package com.bytedance.liko.leakdetector.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f40097a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(24713);
    }

    public static float a() {
        long maxMemory = Runtime.getRuntime().maxMemory();
        long j2 = Runtime.getRuntime().totalMemory();
        long freeMemory = j2 - Runtime.getRuntime().freeMemory();
        float f2 = ((float) freeMemory) / ((float) maxMemory);
        l.c("javaMax:" + maxMemory + " javaTotal:" + j2 + " javaUsed:" + freeMemory + " proportion:" + f2, "");
        return f2;
    }
}

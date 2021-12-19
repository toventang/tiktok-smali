package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class bc {

    /* renamed from: a  reason: collision with root package name */
    public static float[] f151061a = {0.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: f  reason: collision with root package name */
    private static volatile bc f151062f;

    /* renamed from: g  reason: collision with root package name */
    private static float[] f151063g = {-2.0f, -2.0f};

    /* renamed from: b  reason: collision with root package name */
    public double f151064b;

    /* renamed from: c  reason: collision with root package name */
    public float[] f151065c = f151061a;

    /* renamed from: d  reason: collision with root package name */
    public float[] f151066d = f151063g;

    /* renamed from: e  reason: collision with root package name */
    public boolean f151067e;

    private bc() {
    }

    static {
        Covode.recordClassIndex(99346);
    }

    public static bc a() {
        MethodCollector.i(2500);
        if (f151062f == null) {
            synchronized (bc.class) {
                try {
                    if (f151062f == null) {
                        f151062f = new bc();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2500);
                    throw th;
                }
            }
        }
        bc bcVar = f151062f;
        MethodCollector.o(2500);
        return bcVar;
    }
}

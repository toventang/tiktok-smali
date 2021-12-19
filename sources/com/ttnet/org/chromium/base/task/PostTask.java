package com.ttnet.org.chromium.base.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

public class PostTask {

    /* renamed from: a  reason: collision with root package name */
    static final Object f155286a = new Object();

    /* renamed from: b  reason: collision with root package name */
    static Set<n> f155287b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c  reason: collision with root package name */
    static final m[] f155288c;

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ boolean f155289d = true;

    /* renamed from: e  reason: collision with root package name */
    private static final Executor f155290e = new f();

    /* renamed from: f  reason: collision with root package name */
    private static Executor f155291f;

    static native void nativePostDelayedTask(boolean z, int i2, boolean z2, boolean z3, byte b2, byte[] bArr, Runnable runnable, long j2);

    static Executor a() {
        MethodCollector.i(11382);
        synchronized (f155286a) {
            try {
                Executor executor = f155291f;
                if (executor != null) {
                    return executor;
                }
                Executor executor2 = f155290e;
                MethodCollector.o(11382);
                return executor2;
            } finally {
                MethodCollector.o(11382);
            }
        }
    }

    private static void onNativeSchedulerShutdown() {
        MethodCollector.i(11721);
        synchronized (f155286a) {
            try {
                f155287b = Collections.newSetFromMap(new WeakHashMap());
            } finally {
                MethodCollector.o(11721);
            }
        }
    }

    static {
        Covode.recordClassIndex(103335);
        m[] mVarArr = new m[5];
        mVarArr[0] = new h();
        f155288c = mVarArr;
    }

    private static void onNativeSchedulerReady() {
        MethodCollector.i(11558);
        synchronized (f155286a) {
            try {
                Set<n> set = f155287b;
                f155287b = null;
                for (n nVar : set) {
                    nVar.c();
                }
            } finally {
                MethodCollector.o(11558);
            }
        }
    }
}

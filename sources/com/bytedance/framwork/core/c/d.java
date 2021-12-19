package com.bytedance.framwork.core.c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d {

    /* renamed from: c  reason: collision with root package name */
    private static d f29491c;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, a> f29492a;

    /* renamed from: b  reason: collision with root package name */
    final AtomicBoolean f29493b;

    /* renamed from: d  reason: collision with root package name */
    private final Context f29494d;

    /* renamed from: e  reason: collision with root package name */
    private final f f29495e;

    /* renamed from: f  reason: collision with root package name */
    private final LinkedList<b> f29496f;

    static {
        Covode.recordClassIndex(17180);
    }

    /* access modifiers changed from: package-private */
    public final a a(String str) {
        return this.f29492a.get(str);
    }

    private d(Context context) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f29493b = atomicBoolean;
        LinkedList<b> linkedList = new LinkedList<>();
        this.f29496f = linkedList;
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f29494d = applicationContext;
        this.f29492a = new ConcurrentHashMap();
        f fVar = new f(applicationContext, this, linkedList, atomicBoolean);
        this.f29495e = fVar;
        fVar.start();
    }

    public static d a(Context context) {
        MethodCollector.i(11746);
        if (f29491c == null) {
            synchronized (d.class) {
                try {
                    if (f29491c == null) {
                        f29491c = new d(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11746);
                    throw th;
                }
            }
        }
        d dVar = f29491c;
        MethodCollector.o(11746);
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, byte[] bArr) {
        MethodCollector.i(11748);
        if (this.f29493b.get() || bArr == null || bArr.length <= 0) {
            MethodCollector.o(11748);
            return false;
        } else if (a(str) == null) {
            MethodCollector.o(11748);
            return false;
        } else {
            synchronized (this.f29496f) {
                try {
                    if (this.f29493b.get()) {
                        return false;
                    }
                    if (this.f29496f.size() >= 2000) {
                        this.f29496f.poll();
                    }
                    boolean add = this.f29496f.add(new b(str, bArr));
                    f fVar = this.f29495e;
                    synchronized (fVar.f29500a) {
                        try {
                            fVar.f29500a.notify();
                        } finally {
                            MethodCollector.o(11748);
                        }
                    }
                    return add;
                } finally {
                    MethodCollector.o(11748);
                }
            }
        }
    }
}

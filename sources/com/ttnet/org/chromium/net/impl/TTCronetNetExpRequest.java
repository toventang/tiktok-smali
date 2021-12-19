package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.base.f;
import com.ttnet.org.chromium.net.w;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class TTCronetNetExpRequest extends w {

    /* renamed from: a  reason: collision with root package name */
    public static final String f155646a = TTCronetNetExpRequest.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public final w.b f155647b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f155648c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private CronetUrlRequestContext f155649d;

    /* renamed from: e  reason: collision with root package name */
    private int f155650e;

    /* renamed from: f  reason: collision with root package name */
    private List<String> f155651f;

    /* renamed from: g  reason: collision with root package name */
    private int f155652g;

    /* renamed from: h  reason: collision with root package name */
    private int f155653h;

    /* renamed from: i  reason: collision with root package name */
    private Executor f155654i;

    /* renamed from: j  reason: collision with root package name */
    private long f155655j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f155656k;

    private native long nativeCreateRequestAdapter(long j2, int i2, String[] strArr, int i3, int i4);

    private native void nativeDestroy(long j2);

    private native void nativeDoExtraCommand(long j2, String str, String str2);

    private native void nativeStart(long j2);

    static {
        Covode.recordClassIndex(103477);
    }

    public final boolean d() {
        if (!this.f155656k || this.f155655j != 0) {
            return false;
        }
        return true;
    }

    public final void c() {
        MethodCollector.i(12338);
        long j2 = this.f155655j;
        if (j2 == 0) {
            MethodCollector.o(12338);
            return;
        }
        nativeDestroy(j2);
        this.f155655j = 0;
        MethodCollector.o(12338);
    }

    @Override // com.ttnet.org.chromium.net.w
    public final void b() {
        MethodCollector.i(12336);
        synchronized (this.f155648c) {
            try {
                if (!d() && this.f155656k) {
                    c();
                    MethodCollector.o(12336);
                }
            } finally {
                MethodCollector.o(12336);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.w
    public final void a() {
        MethodCollector.i(12335);
        synchronized (this.f155648c) {
            try {
                if (!this.f155656k) {
                    long j2 = this.f155649d.j();
                    int i2 = this.f155650e;
                    List<String> list = this.f155651f;
                    long nativeCreateRequestAdapter = nativeCreateRequestAdapter(j2, i2, (String[]) list.toArray(new String[list.size()]), this.f155652g, this.f155653h);
                    this.f155655j = nativeCreateRequestAdapter;
                    if (nativeCreateRequestAdapter != 0) {
                        this.f155656k = true;
                        nativeStart(nativeCreateRequestAdapter);
                        MethodCollector.o(12335);
                        return;
                    }
                    NullPointerException nullPointerException = new NullPointerException("Create native net exp request adapter failed.");
                    MethodCollector.o(12335);
                    throw nullPointerException;
                }
            } finally {
                MethodCollector.o(12335);
            }
        }
    }

    private void onNetExpRequestComplete(final String str, final boolean z) {
        AnonymousClass1 r2 = new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.TTCronetNetExpRequest.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103478);
            }

            public final void run() {
                MethodCollector.i(12191);
                if (!z) {
                    synchronized (TTCronetNetExpRequest.this.f155648c) {
                        try {
                            if (!TTCronetNetExpRequest.this.d()) {
                                TTCronetNetExpRequest.this.c();
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(12191);
                            throw th;
                        }
                    }
                }
                try {
                    TTCronetNetExpRequest.this.f155647b.a(str);
                    MethodCollector.o(12191);
                } catch (Exception e2) {
                    f.c(TTCronetNetExpRequest.f155646a, "Exception in callback: ", e2);
                    MethodCollector.o(12191);
                }
            }
        };
        try {
            Executor executor = this.f155654i;
            if (executor != null) {
                executor.execute(r2);
            } else {
                new Thread(r2, "NetExpCallback").start();
            }
        } catch (RejectedExecutionException e2) {
            f.c(f155646a, "Exception posting task to executor", e2);
        }
    }

    @Override // com.ttnet.org.chromium.net.w
    public final void a(String str, String str2) {
        MethodCollector.i(12337);
        synchronized (this.f155648c) {
            try {
                if (!d() && this.f155656k) {
                    nativeDoExtraCommand(this.f155655j, str, str2);
                    MethodCollector.o(12337);
                }
            } finally {
                MethodCollector.o(12337);
            }
        }
    }

    public TTCronetNetExpRequest(CronetUrlRequestContext cronetUrlRequestContext, w.b bVar, Executor executor, int i2, List<String> list, int i3, int i4) {
        this.f155649d = cronetUrlRequestContext;
        this.f155647b = bVar;
        this.f155654i = executor;
        this.f155650e = i2;
        this.f155651f = list;
        this.f155652g = i3;
        this.f155653h = i4;
    }
}

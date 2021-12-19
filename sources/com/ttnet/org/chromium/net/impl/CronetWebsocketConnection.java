package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.base.f;
import com.ttnet.org.chromium.net.x;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

public final class CronetWebsocketConnection extends x {

    /* renamed from: b  reason: collision with root package name */
    public static final String f155610b = CronetWebsocketConnection.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final x.b f155611a;

    /* renamed from: c  reason: collision with root package name */
    private long f155612c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f155613d;

    /* renamed from: e  reason: collision with root package name */
    private List<String> f155614e;

    /* renamed from: f  reason: collision with root package name */
    private int f155615f;

    /* renamed from: g  reason: collision with root package name */
    private String f155616g;

    /* renamed from: h  reason: collision with root package name */
    private long f155617h;

    /* renamed from: i  reason: collision with root package name */
    private int f155618i;

    /* renamed from: j  reason: collision with root package name */
    private long f155619j;

    /* renamed from: k  reason: collision with root package name */
    private String f155620k;

    /* renamed from: l  reason: collision with root package name */
    private int f155621l;

    /* renamed from: m  reason: collision with root package name */
    private String f155622m;
    private Map<String, String> n;
    private Map<String, String> o;
    private boolean p;
    private boolean q = true;
    private final CronetUrlRequestContext r;
    private final Object s = new Object();
    private AtomicInteger t = new AtomicInteger(-1);

    private native void nativeAddGetParam(long j2, String str, String str2);

    private native void nativeAddHeader(long j2, String str, String str2);

    private native void nativeAddUrl(long j2, String str);

    private native long nativeCreateWebsocketConnectionAdapter(long j2);

    private native void nativeDestroy(long j2);

    private native void nativeSendBinary(long j2, ByteBuffer byteBuffer);

    private native void nativeSendText(long j2, String str);

    private native void nativeStartWithFrontier(long j2, int i2, String str, long j3, int i3, long j4, String str2, int i4, String str3, boolean z);

    private native void nativeStartWithWSChannel(long j2, boolean z);

    private native void nativeStop(long j2);

    static {
        Covode.recordClassIndex(103466);
    }

    @Override // com.ttnet.org.chromium.net.x
    public final boolean c() {
        if (this.t.get() == 4) {
            return true;
        }
        return false;
    }

    @Override // com.ttnet.org.chromium.net.x
    public final void b() {
        MethodCollector.i(13146);
        synchronized (this.s) {
            try {
                long j2 = this.f155612c;
                if (j2 != 0) {
                    nativeStop(j2);
                    MethodCollector.o(13146);
                }
            } finally {
                MethodCollector.o(13146);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.x
    public final void d() {
        MethodCollector.i(13225);
        synchronized (this.s) {
            try {
                long j2 = this.f155612c;
                if (j2 != 0) {
                    nativeDestroy(j2);
                    this.f155612c = 0;
                    MethodCollector.o(13225);
                }
            } finally {
                MethodCollector.o(13225);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.x
    public final void a() {
        Throwable th;
        MethodCollector.i(13145);
        synchronized (this.s) {
            try {
                if (this.f155612c == 0) {
                    this.f155612c = nativeCreateWebsocketConnectionAdapter(this.r.j());
                }
                for (String str : this.f155614e) {
                    nativeAddUrl(this.f155612c, str);
                }
                Map<String, String> map = this.n;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        nativeAddGetParam(this.f155612c, entry.getKey(), entry.getValue());
                    }
                }
                Map<String, String> map2 = this.o;
                if (map2 != null) {
                    for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                        nativeAddHeader(this.f155612c, entry2.getKey(), entry2.getValue());
                    }
                }
                if (this.q) {
                    try {
                        nativeStartWithFrontier(this.f155612c, this.f155615f, this.f155616g, this.f155617h, this.f155618i, this.f155619j, this.f155620k, this.f155621l, this.f155622m, this.p);
                    } catch (Throwable th2) {
                        th = th2;
                        MethodCollector.o(13145);
                        throw th;
                    }
                } else {
                    nativeStartWithWSChannel(this.f155612c, this.p);
                }
                MethodCollector.o(13145);
            } catch (Throwable th3) {
                th = th3;
                MethodCollector.o(13145);
                throw th;
            }
        }
    }

    private void onFeedbackLog(final String str) {
        a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetWebsocketConnection.AnonymousClass4 */

            static {
                Covode.recordClassIndex(103470);
            }

            public final void run() {
                try {
                    CronetWebsocketConnection.this.f155611a.a(str);
                } catch (Exception e2) {
                    f.c(CronetWebsocketConnection.f155610b, "Exception in callback: ", e2);
                }
            }
        });
    }

    private void a(Runnable runnable) {
        try {
            this.f155613d.execute(runnable);
        } catch (RejectedExecutionException e2) {
            f.c(f155610b, "Exception posting task to executor", e2);
        }
    }

    @Override // com.ttnet.org.chromium.net.x
    public final void a(String str) {
        MethodCollector.i(13147);
        synchronized (this.s) {
            try {
                long j2 = this.f155612c;
                if (j2 != 0) {
                    nativeSendText(j2, str);
                    MethodCollector.o(13147);
                }
            } finally {
                MethodCollector.o(13147);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.x
    public final void a(ByteBuffer byteBuffer) {
        MethodCollector.i(13148);
        synchronized (this.s) {
            try {
                long j2 = this.f155612c;
                if (j2 != 0) {
                    nativeSendBinary(j2, byteBuffer);
                    MethodCollector.o(13148);
                }
            } finally {
                MethodCollector.o(13148);
            }
        }
    }

    private void onConnectionStateChanged(final int i2, final String str) {
        this.t.set(i2);
        a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetWebsocketConnection.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103467);
            }

            public final void run() {
                try {
                    CronetWebsocketConnection.this.f155611a.a(i2, str);
                } catch (Exception e2) {
                    f.c(CronetWebsocketConnection.f155610b, "Exception in callback: ", e2);
                }
            }
        });
    }

    private void onMessageReceived(ByteBuffer byteBuffer, final int i2) {
        final ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
        byteBuffer.rewind();
        allocate.put(byteBuffer);
        allocate.flip();
        a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetWebsocketConnection.AnonymousClass3 */

            static {
                Covode.recordClassIndex(103469);
            }

            public final void run() {
                try {
                    CronetWebsocketConnection.this.f155611a.a(allocate, i2);
                } catch (Exception e2) {
                    f.c(CronetWebsocketConnection.f155610b, "Exception in callback: ", e2);
                }
            }
        });
    }

    private void onConnectionError(final int i2, final String str, final String str2) {
        f.c(f155610b, "onConnectionError: ".concat(String.valueOf(str2)), new Object[0]);
        this.t.set(i2);
        a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetWebsocketConnection.AnonymousClass2 */

            static {
                Covode.recordClassIndex(103468);
            }

            public final void run() {
                try {
                    CronetWebsocketConnection.this.f155611a.a(i2, str, str2);
                } catch (Exception e2) {
                    f.c(CronetWebsocketConnection.f155610b, "Exception in callback: ", e2);
                }
            }
        });
    }

    private void onTrafficChanged(final String str, final long j2, final long j3, final boolean z) {
        a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetWebsocketConnection.AnonymousClass5 */

            static {
                Covode.recordClassIndex(103471);
            }

            public final void run() {
                try {
                    CronetWebsocketConnection.this.f155611a.a(str, j2, j3, z);
                } catch (Exception e2) {
                    f.c(CronetWebsocketConnection.f155610b, "Exception in callback: ", e2);
                }
            }
        });
    }

    CronetWebsocketConnection(CronetUrlRequestContext cronetUrlRequestContext, x.b bVar, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z) {
        this.r = cronetUrlRequestContext;
        this.f155611a = bVar;
        this.f155613d = executor;
        this.f155614e = list;
        this.n = map;
        this.o = map2;
        this.p = z;
        this.q = false;
    }

    CronetWebsocketConnection(CronetUrlRequestContext cronetUrlRequestContext, x.b bVar, Executor executor, List<String> list, int i2, String str, long j2, int i3, long j3, String str2, int i4, String str3, Map<String, String> map, Map<String, String> map2, boolean z) {
        this.r = cronetUrlRequestContext;
        this.f155611a = bVar;
        this.f155613d = executor;
        this.f155614e = list;
        this.f155615f = i2;
        this.f155616g = str;
        this.f155617h = j2;
        this.f155618i = i3;
        this.f155619j = j3;
        this.f155620k = str2;
        this.f155621l = i4;
        this.f155622m = str3;
        this.n = map;
        this.o = map2;
        this.p = z;
    }
}

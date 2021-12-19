package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ttnet.org.chromium.base.f;
import com.ttnet.org.chromium.net.ab;
import com.ttnet.org.chromium.net.d;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks;
import com.ttnet.org.chromium.net.j;
import com.ttnet.org.chromium.net.t;
import com.ttnet.org.chromium.net.z;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class CronetUrlRequest extends p {

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ boolean f155546i = true;
    private final int A;
    private int B;
    private int C;
    private d D;
    private e E;
    private String F;
    private int G;
    private int H;
    private int I;
    private int J;
    private long K;
    private a L;
    private Runnable M;

    /* renamed from: a  reason: collision with root package name */
    public long f155547a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f155548b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f155549c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f155550d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final VersionSafeCallbacks.f f155551e;

    /* renamed from: f  reason: collision with root package name */
    public final VersionSafeCallbacks.d f155552f;

    /* renamed from: g  reason: collision with root package name */
    public CronetUploadDataStream f155553g;

    /* renamed from: h  reason: collision with root package name */
    public r f155554h;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f155555j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f155556k;

    /* renamed from: l  reason: collision with root package name */
    private final CronetUrlRequestContext f155557l;

    /* renamed from: m  reason: collision with root package name */
    private final Executor f155558m;
    private final List<String> n;
    private final String o;
    private final int p;
    private String q;
    private final HeadersList r;
    private String t;
    private final Collection<Object> u;
    private final boolean v;
    private final boolean w;
    private final boolean x;
    private final int y;
    private final boolean z;

    private native void nativeAbortWhenUploadException(long j2);

    private native void nativeAddRequestCookieHeader(long j2, String str, String str2);

    private native boolean nativeAddRequestHeader(long j2, String str, String str2);

    private native void nativeAppTimeout(long j2);

    private native long nativeCreateRequestAdapter(long j2, String str, int i2, int i3, boolean z2, boolean z3, boolean z4, boolean z5, int i4, boolean z6, int i5);

    private native void nativeDestroy(long j2, boolean z2);

    private native void nativeFollowDeferredRedirect(long j2);

    private native void nativeGetStatus(long j2, VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener);

    private native boolean nativeReadData(long j2, ByteBuffer byteBuffer, int i2, int i3);

    private native void nativeRemoveRequestCookieHeader(long j2);

    private native boolean nativeSetHttpMethod(long j2, String str);

    private native void nativeSetRequestTimeout(long j2, int i2);

    private native void nativeSetSocketTimeout(long j2, int i2, int i3, int i4);

    private native void nativeSetThrottleNetSpeed(long j2, long j3);

    private native void nativeStart(long j2);

    private native void nativeStopRedirect(long j2);

    /* access modifiers changed from: package-private */
    public static final class HeadersList extends ArrayList<Map.Entry<String, String>> {
        static {
            Covode.recordClassIndex(103457);
        }

        private HeadersList() {
        }

        /* synthetic */ HeadersList(byte b2) {
            this();
        }
    }

    @Override // com.ttnet.org.chromium.net.ab
    public final String e() {
        return this.F;
    }

    @Override // com.ttnet.org.chromium.net.ab
    public final void a(ByteBuffer byteBuffer) {
        MethodCollector.i(14218);
        k.b(byteBuffer);
        k.a(byteBuffer);
        synchronized (this.f155550d) {
            try {
                if (this.f155549c) {
                    this.f155549c = false;
                    if (!h()) {
                        if (nativeReadData(this.f155547a, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                            MethodCollector.o(14218);
                            return;
                        }
                        this.f155549c = true;
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to call native read");
                        MethodCollector.o(14218);
                        throw illegalArgumentException;
                    }
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Unexpected read attempt.");
                MethodCollector.o(14218);
                throw illegalStateException;
            } finally {
                MethodCollector.o(14218);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.ab
    public final void a(String str, String str2) {
        MethodCollector.i(14247);
        synchronized (this.f155550d) {
            try {
                long j2 = this.f155547a;
                if (j2 != 0) {
                    nativeAddRequestCookieHeader(j2, str, str2);
                    MethodCollector.o(14247);
                }
            } finally {
                MethodCollector.o(14247);
            }
        }
    }

    public final void a(Exception exc) {
        b bVar = new b("Exception received from UrlRequest.Callback", exc);
        f.c(CronetUrlRequestContext.f155580b, "Exception in CalledByNative method", exc);
        a((d) bVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(Throwable th) {
        MethodCollector.i(14313);
        f.c(CronetUrlRequestContext.f155580b, "Exception in upload method", th);
        synchronized (this.f155550d) {
            try {
                long j2 = this.f155547a;
                if (j2 != 0) {
                    nativeAbortWhenUploadException(j2);
                    MethodCollector.o(14313);
                }
            } finally {
                MethodCollector.o(14313);
            }
        }
    }

    static {
        Covode.recordClassIndex(103446);
    }

    private void onCanceled() {
        f.a(this.t);
        a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.AnonymousClass8 */

            static {
                Covode.recordClassIndex(103455);
            }

            public final void run() {
                try {
                    VersionSafeCallbacks.f fVar = CronetUrlRequest.this.f155551e;
                    CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                    fVar.b(cronetUrlRequest, cronetUrlRequest.f155554h);
                    CronetUrlRequest.this.j();
                } catch (Exception e2) {
                    f.c(CronetUrlRequestContext.f155580b, "Exception in onCanceled method", e2);
                }
            }
        });
    }

    public final boolean h() {
        if (!this.f155556k || this.f155547a != 0) {
            return false;
        }
        return true;
    }

    private t l() {
        return new m(this.o, this.u, this.E, this.C, this.f155554h, this.D);
    }

    public final void g() {
        MethodCollector.i(14189);
        String str = this.t;
        if (str != null) {
            f.a(str, this);
        }
        nativeStart(this.f155547a);
        MethodCollector.o(14189);
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        if (!this.f155555j && this.f155557l.a(Thread.currentThread())) {
            throw new j();
        }
    }

    private void k() {
        MethodCollector.i(14277);
        synchronized (this.f155550d) {
            try {
                if (this.f155556k || h()) {
                    IllegalStateException illegalStateException = new IllegalStateException("Request is already started.");
                    MethodCollector.o(14277);
                    throw illegalStateException;
                }
            } finally {
                MethodCollector.o(14277);
            }
        }
    }

    private void onNativeAdapterDestroyed() {
        MethodCollector.i(14370);
        synchronized (this.f155550d) {
            try {
                Runnable runnable = this.M;
                if (runnable != null) {
                    runnable.run();
                }
                if (this.D != null) {
                    MethodCollector.o(14370);
                }
            } finally {
                MethodCollector.o(14370);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.ab
    public final void b() {
        MethodCollector.i(14190);
        synchronized (this.f155550d) {
            try {
                if (this.f155548b) {
                    this.f155548b = false;
                    if (!h()) {
                        nativeFollowDeferredRedirect(this.f155547a);
                        MethodCollector.o(14190);
                        return;
                    }
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException("No redirect to follow.");
                MethodCollector.o(14190);
                throw illegalStateException;
            } finally {
                MethodCollector.o(14190);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.ab
    public final void c() {
        MethodCollector.i(14219);
        synchronized (this.f155550d) {
            try {
                if (!h() && this.f155556k) {
                    f(2);
                    MethodCollector.o(14219);
                }
            } finally {
                MethodCollector.o(14219);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.ab
    public final void d() {
        MethodCollector.i(14249);
        f.a(this.t);
        synchronized (this.f155550d) {
            try {
                long j2 = this.f155547a;
                if (j2 != 0) {
                    nativeAppTimeout(j2);
                    MethodCollector.o(14249);
                }
            } finally {
                MethodCollector.o(14249);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.ab
    public final void f() {
        MethodCollector.i(14248);
        synchronized (this.f155550d) {
            try {
                long j2 = this.f155547a;
                if (j2 != 0) {
                    nativeRemoveRequestCookieHeader(j2);
                    MethodCollector.o(14248);
                }
            } finally {
                MethodCollector.o(14248);
            }
        }
    }

    public final void j() {
        if (this.E != null) {
            final m mVar = new m(this.o, this.u, this.E, this.C, this.f155554h, this.D);
            this.f155557l.a(mVar);
            VersionSafeCallbacks.d dVar = this.f155552f;
            if (dVar != null) {
                try {
                    dVar.getExecutor().execute(new Runnable() {
                        /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(103449);
                        }

                        public final void run() {
                            CronetUrlRequest.this.f155552f.onRequestFinished(mVar);
                        }
                    });
                } catch (RejectedExecutionException e2) {
                    f.c(CronetUrlRequestContext.f155580b, "Exception posting task to executor", e2);
                }
            }
        }
    }

    final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        ByteBuffer f155578a;

        static {
            Covode.recordClassIndex(103458);
        }

        public final void run() {
            MethodCollector.i(12855);
            CronetUrlRequest.this.i();
            ByteBuffer byteBuffer = this.f155578a;
            this.f155578a = null;
            try {
                synchronized (CronetUrlRequest.this.f155550d) {
                    try {
                        if (!CronetUrlRequest.this.h()) {
                            CronetUrlRequest.this.f155549c = true;
                            VersionSafeCallbacks.f fVar = CronetUrlRequest.this.f155551e;
                            CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                            fVar.a(cronetUrlRequest, cronetUrlRequest.f155554h, byteBuffer);
                            MethodCollector.o(12855);
                        }
                    } finally {
                        MethodCollector.o(12855);
                    }
                }
            } catch (Exception e2) {
                CronetUrlRequest.this.a(e2);
                MethodCollector.o(12855);
            }
        }

        private a() {
        }

        /* synthetic */ a(CronetUrlRequest cronetUrlRequest, byte b2) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c A[Catch:{ RuntimeException -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010e A[Catch:{ RuntimeException -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0117 A[Catch:{ RuntimeException -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0137  */
    @Override // com.ttnet.org.chromium.net.ab
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 367
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetUrlRequest.a():void");
    }

    @Override // com.ttnet.org.chromium.net.ab
    public final void a(int i2) {
        this.B = i2;
    }

    @Override // com.ttnet.org.chromium.net.impl.p
    public final void b(int i2) {
        this.G = i2;
    }

    @Override // com.ttnet.org.chromium.net.impl.p
    public final void c(int i2) {
        this.H = i2;
    }

    @Override // com.ttnet.org.chromium.net.impl.p
    public final void d(int i2) {
        this.I = i2;
    }

    @Override // com.ttnet.org.chromium.net.impl.p
    public final void e(int i2) {
        this.J = i2;
    }

    @Override // com.ttnet.org.chromium.net.impl.p
    public final void a(String str) {
        k();
        Objects.requireNonNull(str, "Method is required.");
        this.q = str;
    }

    private void a(Runnable runnable) {
        try {
            this.f155558m.execute(runnable);
        } catch (RejectedExecutionException e2) {
            f.c(CronetUrlRequestContext.f155580b, "Exception posting task to executor", e2);
            a((d) new d("Exception posting task to executor", e2));
        }
    }

    private void onSucceeded(long j2) {
        this.f155554h.a(j2);
        f.a(this.t);
        a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.AnonymousClass7 */

            static {
                Covode.recordClassIndex(103454);
            }

            public final void run() {
                MethodCollector.i(12854);
                synchronized (CronetUrlRequest.this.f155550d) {
                    try {
                        if (!CronetUrlRequest.this.h()) {
                            CronetUrlRequest.this.f(0);
                            try {
                                VersionSafeCallbacks.f fVar = CronetUrlRequest.this.f155551e;
                                CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                                fVar.a(cronetUrlRequest, cronetUrlRequest.f155554h);
                                CronetUrlRequest.this.j();
                                MethodCollector.o(12854);
                            } catch (Exception e2) {
                                f.c(CronetUrlRequestContext.f155580b, "Exception in onSucceeded method", e2);
                                MethodCollector.o(12854);
                            }
                        }
                    } finally {
                        MethodCollector.o(12854);
                    }
                }
            }
        });
    }

    private void a(final d dVar) {
        MethodCollector.i(14314);
        synchronized (this.f155550d) {
            try {
                if (!h()) {
                    if (f155546i || this.D == null) {
                        this.D = dVar;
                        f(1);
                        try {
                            this.f155558m.execute(new Runnable() {
                                /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.AnonymousClass4 */

                                static {
                                    Covode.recordClassIndex(103451);
                                }

                                public final void run() {
                                    try {
                                        VersionSafeCallbacks.f fVar = CronetUrlRequest.this.f155551e;
                                        CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                                        fVar.a(cronetUrlRequest, cronetUrlRequest.f155554h, dVar);
                                        CronetUrlRequest.this.j();
                                    } catch (Exception e2) {
                                        f.c(CronetUrlRequestContext.f155580b, "Exception in onFailed method", e2);
                                    }
                                }
                            });
                            MethodCollector.o(14314);
                        } catch (RejectedExecutionException e2) {
                            f.c(CronetUrlRequestContext.f155580b, "Exception posting task to executor", e2);
                            MethodCollector.o(14314);
                        }
                    } else {
                        AssertionError assertionError = new AssertionError();
                        MethodCollector.o(14314);
                        throw assertionError;
                    }
                }
            } finally {
                MethodCollector.o(14314);
            }
        }
    }

    public final void f(int i2) {
        MethodCollector.i(14312);
        boolean z2 = true;
        if (f155546i || this.D == null || i2 == 1) {
            this.C = i2;
            if (this.f155547a == 0) {
                MethodCollector.o(14312);
                return;
            }
            this.f155557l.i();
            long j2 = this.f155547a;
            if (i2 != 2) {
                z2 = false;
            }
            nativeDestroy(j2, z2);
            this.f155547a = 0;
            MethodCollector.o(14312);
            return;
        }
        AssertionError assertionError = new AssertionError();
        MethodCollector.o(14312);
        throw assertionError;
    }

    @Override // com.ttnet.org.chromium.net.ab
    public final void a(long j2) {
        MethodCollector.i(14186);
        synchronized (this.f155550d) {
            try {
                this.K = j2;
                long j3 = this.f155547a;
                if (j3 != 0) {
                    nativeSetThrottleNetSpeed(j3, j2);
                }
            } finally {
                MethodCollector.o(14186);
            }
        }
    }

    public final void a(ab.c cVar) {
        MethodCollector.i(14246);
        final VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener = new VersionSafeCallbacks.UrlRequestStatusListener(cVar);
        synchronized (this.f155550d) {
            try {
                long j2 = this.f155547a;
                if (j2 != 0) {
                    nativeGetStatus(j2, urlRequestStatusListener);
                    return;
                }
                a(new Runnable() {
                    /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(103450);
                    }

                    public final void run() {
                        urlRequestStatusListener.onStatus(-1);
                    }
                });
                MethodCollector.o(14246);
            } finally {
                MethodCollector.o(14246);
            }
        }
    }

    private void onStatus(final VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener, final int i2) {
        a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.AnonymousClass9 */

            static {
                Covode.recordClassIndex(103456);
            }

            public final void run() {
                int i2;
                VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener = urlRequestStatusListener;
                int i3 = i2;
                if (p.s || (i3 >= 0 && i3 <= 15)) {
                    switch (i3) {
                        case 0:
                            i2 = 0;
                            break;
                        case 1:
                            i2 = 1;
                            break;
                        case 2:
                            i2 = 2;
                            break;
                        case 3:
                            i2 = 3;
                            break;
                        case 4:
                            i2 = 4;
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        default:
                            throw new IllegalArgumentException("No request status found.");
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            i2 = 5;
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            i2 = 6;
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            i2 = 7;
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            i2 = 8;
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            i2 = 9;
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            i2 = 10;
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            i2 = 11;
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            i2 = 12;
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            i2 = 13;
                            break;
                        case 15:
                            i2 = 14;
                            break;
                    }
                    urlRequestStatusListener.onStatus(i2);
                    return;
                }
                throw new AssertionError();
            }
        });
    }

    @Override // com.ttnet.org.chromium.net.impl.p
    public final void b(String str, String str2) {
        k();
        Objects.requireNonNull(str, "Invalid header name.");
        Objects.requireNonNull(str2, "Invalid header value.");
        this.r.add(new AbstractMap.SimpleImmutableEntry(str, str2));
    }

    private String[] addSecurityFactor(String str, String[] strArr) {
        Map<String, String> a2;
        HashMap hashMap = new HashMap();
        int i2 = 0;
        for (int i3 = 0; i3 < strArr.length; i3 += 2) {
            hashMap.put(strArr[i3].toLowerCase(Locale.US), strArr[i3 + 1]);
        }
        CronetUrlRequestContext cronetUrlRequestContext = this.f155557l;
        if (cronetUrlRequestContext.f155585g == null || (a2 = cronetUrlRequestContext.f155585g.a(str, hashMap)) == null) {
            return null;
        }
        String[] strArr2 = new String[(a2.size() * 2)];
        for (Map.Entry<String, String> entry : a2.entrySet()) {
            strArr2[i2] = entry.getKey();
            strArr2[i2 + 1] = entry.getValue();
            i2 += 2;
        }
        return strArr2;
    }

    @Override // com.ttnet.org.chromium.net.impl.p
    public final void a(z zVar, Executor executor) {
        Objects.requireNonNull(zVar, "Invalid UploadDataProvider.");
        if (this.q == null) {
            this.q = "POST";
        }
        this.f155553g = new CronetUploadDataStream(zVar, executor, this);
    }

    private void onReadCompleted(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2) {
        this.f155554h.a(j2);
        if (byteBuffer.position() == i3 && byteBuffer.limit() == i4) {
            if (this.L == null) {
                this.L = new a(this, (byte) 0);
            }
            byteBuffer.position(i3 + i2);
            this.L.f155578a = byteBuffer;
            a(this.L);
            return;
        }
        a((d) new d("ByteBuffer modified externally during read", null));
    }

    private void onError(int i2, int i3, int i4, String str, long j2) {
        r rVar = this.f155554h;
        if (rVar != null) {
            rVar.a(j2);
        }
        f.a(this.t);
        if (i2 == 10 || i2 == 3) {
            a((d) new l("Exception in CronetUrlRequest: ".concat(String.valueOf(str)), i2, i3, i4));
            return;
        }
        switch (i2) {
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                i2 = 5;
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                i2 = 6;
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                i2 = 7;
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                i2 = 8;
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                i2 = 9;
                break;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                i2 = 10;
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                i2 = 11;
                break;
            default:
                f.c(CronetUrlRequestContext.f155580b, "Unknown error code: ".concat(String.valueOf(i2)), new Object[0]);
                break;
        }
        a((d) new NetworkExceptionImpl("Exception in CronetUrlRequest: ".concat(String.valueOf(str)), i2, i3));
    }

    private r a(int i2, String str, String[] strArr, boolean z2, String str2, String str3, long j2) {
        HeadersList headersList = new HeadersList((byte) 0);
        for (int i3 = 0; i3 < strArr.length; i3 += 2) {
            headersList.add(new AbstractMap.SimpleImmutableEntry(strArr[i3], strArr[i3 + 1]));
        }
        return new r(new ArrayList(this.n), i2, str, headersList, z2, str2, str3, j2);
    }

    private void onResponseStarted(int i2, String str, String[] strArr, boolean z2, String str2, String str3, long j2, final String str4) {
        this.f155554h = a(i2, str, strArr, z2, str2, str3, j2);
        a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.AnonymousClass6 */

            static {
                Covode.recordClassIndex(103453);
            }

            public final void run() {
                MethodCollector.i(12953);
                CronetUrlRequest.this.i();
                synchronized (CronetUrlRequest.this.f155550d) {
                    try {
                        if (!CronetUrlRequest.this.h()) {
                            CronetUrlRequest.this.f155549c = true;
                            try {
                                VersionSafeCallbacks.f fVar = CronetUrlRequest.this.f155551e;
                                CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                                fVar.b(cronetUrlRequest, cronetUrlRequest.f155554h, str4);
                                MethodCollector.o(12953);
                            } catch (Exception e2) {
                                CronetUrlRequest.this.a(e2);
                                MethodCollector.o(12953);
                            }
                        }
                    } finally {
                        MethodCollector.o(12953);
                    }
                }
            }
        });
    }

    private void onRedirectReceived(final String str, int i2, String str2, String[] strArr, boolean z2, String str3, String str4, long j2) {
        final r a2 = a(i2, str2, strArr, z2, str3, str4, j2);
        this.n.add(str);
        a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.AnonymousClass5 */

            static {
                Covode.recordClassIndex(103452);
            }

            public final void run() {
                MethodCollector.i(11723);
                CronetUrlRequest.this.i();
                synchronized (CronetUrlRequest.this.f155550d) {
                    try {
                        if (!CronetUrlRequest.this.h()) {
                            CronetUrlRequest.this.f155548b = true;
                            try {
                                CronetUrlRequest.this.f155551e.a(CronetUrlRequest.this, a2, str);
                                MethodCollector.o(11723);
                            } catch (Exception e2) {
                                CronetUrlRequest.this.a(e2);
                                MethodCollector.o(11723);
                            }
                        }
                    } finally {
                        MethodCollector.o(11723);
                    }
                }
            }
        });
    }

    CronetUrlRequest(CronetUrlRequestContext cronetUrlRequestContext, String str, int i2, ab.b bVar, Executor executor, Collection<Object> collection, boolean z2, boolean z3, boolean z4, boolean z5, int i3, boolean z6, int i4, t.a aVar) {
        VersionSafeCallbacks.d dVar;
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        this.r = new HeadersList((byte) 0);
        Objects.requireNonNull(str, "URL is required");
        Objects.requireNonNull(bVar, "Listener is required");
        Objects.requireNonNull(executor, "Executor is required");
        this.f155555j = z4;
        this.f155557l = cronetUrlRequestContext;
        this.o = str;
        arrayList.add(str);
        int i5 = 3;
        if (i2 == 0) {
            i5 = 1;
        } else if (i2 == 1) {
            i5 = 2;
        } else if (i2 != 2) {
            if (i2 == 3 || i2 != 4) {
                i5 = 4;
            } else {
                i5 = 5;
            }
        }
        this.p = i5;
        this.f155551e = new VersionSafeCallbacks.f(bVar);
        this.f155558m = executor;
        this.u = collection;
        this.v = z2;
        this.w = z3;
        this.x = z5;
        this.y = i3;
        this.z = z6;
        this.A = i4;
        if (aVar != null) {
            dVar = new VersionSafeCallbacks.d(aVar);
        } else {
            dVar = null;
        }
        this.f155552f = dVar;
    }

    private void onMetricsCollected(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, boolean z2, long j15, long j16, long j17, String str, long j18, long j19, String str2, String str3, String str4) {
        MethodCollector.i(14347);
        synchronized (this.f155550d) {
            try {
                if (this.E == null) {
                    this.E = new e(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, z2, j15, j16, j17, str, j18, j19, str2, str3);
                    this.F = str4;
                    this.f155551e.a(str4, l());
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Metrics collection should only happen once.");
                    MethodCollector.o(14347);
                    throw illegalStateException;
                }
            } catch (Throwable th) {
                MethodCollector.o(14347);
                throw th;
            }
        }
        final t l2 = l();
        a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.AnonymousClass10 */

            static {
                Covode.recordClassIndex(103448);
            }

            public final void run() {
                try {
                    CronetUrlRequest.this.f155551e.a(CronetUrlRequest.this, l2);
                } catch (Exception e2) {
                    f.c(CronetUrlRequestContext.f155580b, "Exception in onMetricsCollected method", e2);
                }
            }
        });
        this.f155557l.a(l2);
        MethodCollector.o(14347);
    }
}

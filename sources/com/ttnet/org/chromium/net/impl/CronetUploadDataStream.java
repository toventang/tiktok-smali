package com.ttnet.org.chromium.net.impl;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.base.f;
import com.ttnet.org.chromium.net.aa;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks;
import com.ttnet.org.chromium.net.z;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

public final class CronetUploadDataStream extends aa {

    /* renamed from: a  reason: collision with root package name */
    public static final String f155529a = CronetUploadDataStream.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public final VersionSafeCallbacks.e f155530b;

    /* renamed from: c  reason: collision with root package name */
    final CronetUrlRequest f155531c;

    /* renamed from: d  reason: collision with root package name */
    long f155532d;

    /* renamed from: e  reason: collision with root package name */
    long f155533e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f155534f;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f155535g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f155536h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public long f155537i;

    /* renamed from: j  reason: collision with root package name */
    public int f155538j = 3;

    /* renamed from: k  reason: collision with root package name */
    public Runnable f155539k;

    /* renamed from: l  reason: collision with root package name */
    private final Executor f155540l;

    /* renamed from: m  reason: collision with root package name */
    private long f155541m;
    private final Runnable n = new Runnable() {
        /* class com.ttnet.org.chromium.net.impl.CronetUploadDataStream.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ boolean f155542a = true;

        static {
            Covode.recordClassIndex(103443);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            r7.f155543b.f155531c.i();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
            if (com.ttnet.org.chromium.net.impl.CronetUploadDataStream.AnonymousClass1.f155542a != false) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
            if (r7.f155543b.f155535g.position() != 0) goto L_0x004f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
            r2 = r7.f155543b.f155530b;
            r1 = r7.f155543b;
            r2.a(r1, r1.f155535g);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(13143);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
            r0 = new java.lang.AssertionError();
            com.bytedance.frameworks.apm.trace.MethodCollector.o(13143);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
            r7.f155543b.a((java.lang.Throwable) r1);
            com.bytedance.frameworks.apm.trace.MethodCollector.o(13143);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 115
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetUploadDataStream.AnonymousClass1.run():void");
        }
    };
    private boolean o;

    private native long nativeCreateAdapterForTesting();

    private native long nativeCreateUploadDataStreamForTesting(long j2, long j3);

    private static native void nativeDestroy(long j2);

    private native void nativeOnReadSucceeded(long j2, int i2, boolean z);

    private native void nativeOnRewindSucceeded(long j2);

    /* access modifiers changed from: package-private */
    public final native long nativeAttachUploadDataToRequest(long j2, long j3);

    /* access modifiers changed from: package-private */
    public final void onUploadDataStreamDestroyed() {
        b();
    }

    static {
        Covode.recordClassIndex(103442);
    }

    /* access modifiers changed from: package-private */
    public final void rewind() {
        a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUploadDataStream.AnonymousClass2 */

            static {
                Covode.recordClassIndex(103444);
            }

            public final void run() {
                MethodCollector.i(12038);
                synchronized (CronetUploadDataStream.this.f155536h) {
                    try {
                        if (CronetUploadDataStream.this.f155537i != 0) {
                            CronetUploadDataStream.this.a(3);
                            CronetUploadDataStream.this.f155538j = 1;
                            try {
                                CronetUploadDataStream.this.f155531c.i();
                                CronetUploadDataStream.this.f155530b.a(CronetUploadDataStream.this);
                                MethodCollector.o(12038);
                            } catch (Exception e2) {
                                CronetUploadDataStream.this.a((Throwable) e2);
                                MethodCollector.o(12038);
                            }
                        }
                    } finally {
                        MethodCollector.o(12038);
                    }
                }
            }
        });
    }

    private void b() {
        MethodCollector.i(13046);
        synchronized (this.f155536h) {
            try {
                if (this.f155538j == 0) {
                    this.o = true;
                    return;
                }
                long j2 = this.f155537i;
                if (j2 == 0) {
                    MethodCollector.o(13046);
                    return;
                }
                nativeDestroy(j2);
                this.f155537i = 0;
                Runnable runnable = this.f155539k;
                if (runnable != null) {
                    runnable.run();
                }
                a(new Runnable() {
                    /* class com.ttnet.org.chromium.net.impl.CronetUploadDataStream.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(103445);
                    }

                    public final void run() {
                        try {
                            CronetUploadDataStream.this.f155531c.i();
                            if (!CronetUploadDataStream.this.f155534f) {
                                CronetUploadDataStream.this.f155530b.close();
                            }
                        } catch (Exception e2) {
                            f.c(CronetUploadDataStream.f155529a, "Exception thrown when closing", e2);
                        }
                    }
                });
                MethodCollector.o(13046);
            } finally {
                MethodCollector.o(13046);
            }
        }
    }

    private void c() {
        MethodCollector.i(13137);
        synchronized (this.f155536h) {
            try {
                if (this.f155538j == 0) {
                    IllegalStateException illegalStateException = new IllegalStateException("Method should not be called when read has not completed.");
                    MethodCollector.o(13137);
                    throw illegalStateException;
                } else if (this.o) {
                    b();
                }
            } finally {
                MethodCollector.o(13137);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.aa
    public final void a() {
        MethodCollector.i(13042);
        synchronized (this.f155536h) {
            try {
                a(1);
                this.f155538j = 3;
                this.f155533e = this.f155532d;
                long j2 = this.f155537i;
                if (j2 != 0) {
                    nativeOnRewindSucceeded(j2);
                    MethodCollector.o(13042);
                }
            } finally {
                MethodCollector.o(13042);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void readData(ByteBuffer byteBuffer) {
        this.f155535g = byteBuffer;
        this.f155541m = (long) byteBuffer.limit();
        a(this.n);
    }

    @Override // com.ttnet.org.chromium.net.aa
    public final void a(Exception exc) {
        MethodCollector.i(13044);
        synchronized (this.f155536h) {
            try {
                a(1);
                a((Throwable) exc);
            } finally {
                MethodCollector.o(13044);
            }
        }
    }

    public final void a(int i2) {
        if (this.f155538j != i2) {
            throw new IllegalStateException("Expected " + i2 + ", but was " + this.f155538j);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Runnable runnable) {
        try {
            this.f155540l.execute(runnable);
        } catch (Throwable th) {
            CronetUrlRequest cronetUrlRequest = this.f155531c;
            if (cronetUrlRequest != null) {
                cronetUrlRequest.a(th);
                return;
            }
            throw new IllegalStateException("Unexpected request usage, caught in CronetUploadDataStream, caused by ".concat(String.valueOf(th)));
        }
    }

    public final void a(Throwable th) {
        boolean z;
        MethodCollector.i(12847);
        synchronized (this.f155536h) {
            try {
                int i2 = this.f155538j;
                if (i2 != 3) {
                    if (i2 == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f155538j = 3;
                    this.f155535g = null;
                    c();
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("There is no read or rewind or length check in progress.");
                    MethodCollector.o(12847);
                    throw illegalStateException;
                }
            } catch (Throwable th2) {
                MethodCollector.o(12847);
                throw th2;
            }
        }
        if (z) {
            try {
                this.f155530b.close();
                this.f155534f = true;
            } catch (Exception e2) {
                f.c(f155529a, "Failure closing data provider", e2);
            }
        }
        this.f155531c.a(th);
        MethodCollector.o(12847);
    }

    @Override // com.ttnet.org.chromium.net.aa
    public final void a(boolean z) {
        MethodCollector.i(12946);
        synchronized (this.f155536h) {
            try {
                a(0);
                if (this.f155541m != ((long) this.f155535g.limit())) {
                    IllegalStateException illegalStateException = new IllegalStateException("ByteBuffer limit changed");
                    MethodCollector.o(12946);
                    throw illegalStateException;
                } else if (!z || this.f155532d < 0) {
                    int position = this.f155535g.position();
                    long j2 = this.f155533e - ((long) position);
                    this.f155533e = j2;
                    if (j2 >= 0 || this.f155532d < 0) {
                        this.f155535g.position(0);
                        this.f155535g = null;
                        this.f155538j = 3;
                        c();
                        long j3 = this.f155537i;
                        if (j3 != 0) {
                            nativeOnReadSucceeded(j3, position, z);
                            MethodCollector.o(12946);
                            return;
                        }
                        return;
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a.a("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(this.f155532d - this.f155533e), Long.valueOf(this.f155532d)}));
                    MethodCollector.o(12946);
                    throw illegalArgumentException;
                } else {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Non-chunked upload can't have last chunk");
                    MethodCollector.o(12946);
                    throw illegalArgumentException2;
                }
            } finally {
                MethodCollector.o(12946);
            }
        }
    }

    public CronetUploadDataStream(z zVar, Executor executor, CronetUrlRequest cronetUrlRequest) {
        this.f155540l = executor;
        this.f155530b = new VersionSafeCallbacks.e(zVar);
        this.f155531c = cronetUrlRequest;
        this.f155534f = false;
    }
}

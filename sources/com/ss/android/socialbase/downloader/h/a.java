package com.ss.android.socialbase.downloader.h;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.k.g;
import com.ss.android.socialbase.downloader.segment.StreamClosedException;
import java.io.InputStream;
import java.util.concurrent.Future;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f60557a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f60558b = new Object();

    /* renamed from: c  reason: collision with root package name */
    com.ss.android.socialbase.downloader.segment.a f60559c;

    /* renamed from: d  reason: collision with root package name */
    com.ss.android.socialbase.downloader.segment.a f60560d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f60561e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Throwable f60562f;

    /* renamed from: g  reason: collision with root package name */
    private final int f60563g;

    /* renamed from: h  reason: collision with root package name */
    private final int f60564h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f60565i = new Object();

    /* renamed from: j  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.segment.a f60566j;

    /* renamed from: k  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.segment.a f60567k;

    /* renamed from: l  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.segment.a f60568l;

    /* renamed from: m  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.segment.a f60569m;
    private volatile boolean n;
    private volatile Future o;
    private int p;
    private final Runnable q;

    static {
        Covode.recordClassIndex(37416);
    }

    @Override // com.ss.android.socialbase.downloader.h.b
    public final com.ss.android.socialbase.downloader.segment.a a() {
        return d();
    }

    @Override // com.ss.android.socialbase.downloader.h.b
    public final void b() {
        MethodCollector.i(12696);
        synchronized (this.f60565i) {
            try {
                this.n = true;
                this.f60565i.notify();
            } finally {
                MethodCollector.o(12696);
            }
        }
        Future future = this.o;
        if (future != null) {
            try {
                future.cancel(true);
            } catch (Throwable unused) {
            }
            this.o = null;
        }
    }

    private com.ss.android.socialbase.downloader.segment.a d() {
        com.ss.android.socialbase.downloader.segment.a aVar;
        MethodCollector.i(12824);
        com.ss.android.socialbase.downloader.segment.a aVar2 = this.f60569m;
        if (aVar2 != null) {
            this.f60569m = aVar2.f60900d;
            aVar2.f60900d = null;
            MethodCollector.o(12824);
            return aVar2;
        }
        synchronized (this.f60558b) {
            try {
                aVar = this.f60559c;
                if (aVar == null) {
                    while (!this.f60561e) {
                        this.f60558b.wait();
                        aVar = this.f60559c;
                        if (aVar != null) {
                        }
                    }
                    Throwable th = this.f60562f;
                    if (th != null) {
                        if (th instanceof StreamClosedException) {
                            BaseException baseException = new BaseException(1068, "async reader closed!");
                            MethodCollector.o(12824);
                            throw baseException;
                        }
                        g.a(th, "async_read");
                    }
                    BaseException baseException2 = new BaseException(1069, "async reader terminated!");
                    MethodCollector.o(12824);
                    throw baseException2;
                }
                this.f60569m = aVar.f60900d;
                this.f60560d = null;
                this.f60559c = null;
                aVar.f60900d = null;
            } finally {
                MethodCollector.o(12824);
            }
        }
        return aVar;
    }

    public final com.ss.android.socialbase.downloader.segment.a c() {
        MethodCollector.i(12697);
        com.ss.android.socialbase.downloader.segment.a aVar = this.f60568l;
        if (aVar == null) {
            synchronized (this.f60565i) {
                try {
                    if (!this.n) {
                        com.ss.android.socialbase.downloader.segment.a aVar2 = this.f60566j;
                        if (aVar2 != null) {
                            this.f60568l = aVar2.f60900d;
                            this.f60567k = null;
                            this.f60566j = null;
                            aVar2.f60900d = null;
                        } else {
                            int i2 = this.p;
                            if (i2 < this.f60564h) {
                                this.p = i2 + 1;
                                return new com.ss.android.socialbase.downloader.segment.a(this.f60563g);
                            }
                            do {
                                this.f60565i.wait();
                                if (!this.n) {
                                    aVar2 = this.f60566j;
                                } else {
                                    StreamClosedException streamClosedException = new StreamClosedException("");
                                    MethodCollector.o(12697);
                                    throw streamClosedException;
                                }
                            } while (aVar2 == null);
                        }
                        this.f60568l = aVar2.f60900d;
                        this.f60567k = null;
                        this.f60566j = null;
                        aVar2.f60900d = null;
                        MethodCollector.o(12697);
                        return aVar2;
                    }
                    StreamClosedException streamClosedException2 = new StreamClosedException("");
                    MethodCollector.o(12697);
                    throw streamClosedException2;
                } finally {
                    MethodCollector.o(12697);
                }
            }
        } else if (!this.n) {
            this.f60568l = aVar.f60900d;
            aVar.f60900d = null;
            MethodCollector.o(12697);
            return aVar;
        } else {
            StreamClosedException streamClosedException3 = new StreamClosedException("");
            MethodCollector.o(12697);
            throw streamClosedException3;
        }
    }

    @Override // com.ss.android.socialbase.downloader.h.b
    public final void a(com.ss.android.socialbase.downloader.segment.a aVar) {
        MethodCollector.i(12695);
        synchronized (this.f60565i) {
            try {
                com.ss.android.socialbase.downloader.segment.a aVar2 = this.f60567k;
                if (aVar2 == null) {
                    this.f60567k = aVar;
                    this.f60566j = aVar;
                    this.f60565i.notify();
                } else {
                    aVar2.f60900d = aVar;
                    this.f60567k = aVar;
                }
            } finally {
                MethodCollector.o(12695);
            }
        }
    }

    public a(InputStream inputStream, int i2, int i3) {
        AnonymousClass1 r1 = new Runnable() {
            /* class com.ss.android.socialbase.downloader.h.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(37417);
            }

            public final void run() {
                com.ss.android.socialbase.downloader.segment.a c2;
                MethodCollector.i(12891);
                Process.setThreadPriority(10);
                do {
                    try {
                        c2 = a.this.c();
                        c2.f60899c = a.this.f60557a.read(c2.f60897a);
                        a aVar = a.this;
                        synchronized (aVar.f60558b) {
                            try {
                                com.ss.android.socialbase.downloader.segment.a aVar2 = aVar.f60560d;
                                if (aVar2 == null) {
                                    aVar.f60560d = c2;
                                    aVar.f60559c = c2;
                                    aVar.f60558b.notify();
                                } else {
                                    aVar2.f60900d = c2;
                                    aVar.f60560d = c2;
                                }
                            } finally {
                                MethodCollector.o(12891);
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(12891);
                        throw th;
                    }
                } while (c2.f60899c != -1);
                synchronized (a.this.f60558b) {
                    try {
                        a.this.f60561e = true;
                        a.this.f60558b.notify();
                    } finally {
                        MethodCollector.o(12891);
                    }
                }
                g.a(a.this.f60557a);
            }
        };
        this.q = r1;
        this.f60557a = inputStream;
        this.f60563g = i2;
        if (i3 <= 0) {
            i3 = 1;
        } else if (i3 > 64) {
            i3 = 64;
        }
        this.f60564h = i3;
        this.o = c.k().submit(r1);
    }
}

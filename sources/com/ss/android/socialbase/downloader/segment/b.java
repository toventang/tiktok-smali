package com.ss.android.socialbase.downloader.segment;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* access modifiers changed from: package-private */
public final class b implements c, d, e {

    /* renamed from: a  reason: collision with root package name */
    private final int f60901a;

    /* renamed from: b  reason: collision with root package name */
    private final int f60902b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f60903c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Object f60904d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private a f60905e;

    /* renamed from: f  reason: collision with root package name */
    private a f60906f;

    /* renamed from: g  reason: collision with root package name */
    private a f60907g;

    /* renamed from: h  reason: collision with root package name */
    private a f60908h;

    /* renamed from: i  reason: collision with root package name */
    private a f60909i;

    /* renamed from: j  reason: collision with root package name */
    private volatile boolean f60910j;

    /* renamed from: k  reason: collision with root package name */
    private int f60911k;

    static {
        Covode.recordClassIndex(37556);
    }

    public final void c() {
        MethodCollector.i(13077);
        this.f60910j = true;
        synchronized (this.f60903c) {
            try {
                this.f60903c.notifyAll();
            } finally {
                MethodCollector.o(13077);
            }
        }
        synchronized (this.f60904d) {
            try {
                this.f60904d.notifyAll();
            } finally {
                MethodCollector.o(13077);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.d
    public final a a() {
        a aVar;
        MethodCollector.i(12893);
        a aVar2 = this.f60909i;
        if (aVar2 != null) {
            this.f60909i = aVar2.f60900d;
            aVar2.f60900d = null;
            MethodCollector.o(12893);
            return aVar2;
        }
        synchronized (this.f60904d) {
            try {
                aVar = this.f60907g;
                while (aVar == null) {
                    if (!this.f60910j) {
                        this.f60904d.wait();
                        aVar = this.f60907g;
                    } else {
                        StreamClosedException streamClosedException = new StreamClosedException("read");
                        MethodCollector.o(12893);
                        throw streamClosedException;
                    }
                }
                this.f60909i = aVar.f60900d;
                this.f60908h = null;
                this.f60907g = null;
                aVar.f60900d = null;
            } finally {
                MethodCollector.o(12893);
            }
        }
        return aVar;
    }

    @Override // com.ss.android.socialbase.downloader.segment.c
    public final a b() {
        MethodCollector.i(12991);
        synchronized (this.f60903c) {
            try {
                if (!this.f60910j) {
                    a aVar = this.f60905e;
                    if (aVar != null) {
                        this.f60905e = aVar.f60900d;
                    } else {
                        int i2 = this.f60911k;
                        if (i2 < this.f60901a) {
                            this.f60911k = i2 + 1;
                            return new a(this.f60902b);
                        }
                        do {
                            this.f60903c.wait();
                            if (!this.f60910j) {
                                aVar = this.f60905e;
                            } else {
                                StreamClosedException streamClosedException = new StreamClosedException("obtain");
                                MethodCollector.o(12991);
                                throw streamClosedException;
                            }
                        } while (aVar == null);
                    }
                    this.f60905e = aVar.f60900d;
                    if (aVar == this.f60906f) {
                        this.f60906f = null;
                    }
                    aVar.f60900d = null;
                    MethodCollector.o(12991);
                    return aVar;
                }
                StreamClosedException streamClosedException2 = new StreamClosedException("obtain");
                MethodCollector.o(12991);
                throw streamClosedException2;
            } finally {
                MethodCollector.o(12991);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.c
    public final void a(a aVar) {
        MethodCollector.i(12990);
        synchronized (this.f60903c) {
            try {
                a aVar2 = this.f60906f;
                if (aVar2 == null) {
                    this.f60906f = aVar;
                    this.f60905e = aVar;
                } else {
                    aVar2.f60900d = aVar;
                    this.f60906f = aVar;
                }
                this.f60903c.notify();
            } finally {
                MethodCollector.o(12990);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.e
    public final void b(a aVar) {
        MethodCollector.i(13076);
        synchronized (this.f60904d) {
            try {
                a aVar2 = this.f60908h;
                if (aVar2 == null) {
                    this.f60908h = aVar;
                    this.f60907g = aVar;
                    this.f60904d.notify();
                } else {
                    aVar2.f60900d = aVar;
                    this.f60908h = aVar;
                }
            } finally {
                MethodCollector.o(13076);
            }
        }
    }

    b(int i2, int i3) {
        i2 = i2 < 64 ? 64 : i2;
        i3 = i3 < 8192 ? 8192 : i3;
        this.f60901a = i2;
        this.f60902b = i3;
    }
}

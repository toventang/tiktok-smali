package com.ss.android.ugc.h;

import android.os.SystemClock;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.h.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* access modifiers changed from: package-private */
public final class h implements c {

    /* renamed from: f  reason: collision with root package name */
    private static final Lock f148509f = new ReentrantLock();

    /* renamed from: a  reason: collision with root package name */
    public i f148510a;

    /* renamed from: b  reason: collision with root package name */
    private double f148511b = -1.0d;

    /* renamed from: c  reason: collision with root package name */
    private double f148512c = -1.0d;

    /* renamed from: d  reason: collision with root package name */
    private Queue<i> f148513d = new ArrayBlockingQueue(g.f148505a);

    /* renamed from: e  reason: collision with root package name */
    private i[] f148514e = new i[g.f148505a];

    /* renamed from: g  reason: collision with root package name */
    private final List<Object> f148515g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private g.a f148516h;

    /* renamed from: i  reason: collision with root package name */
    private g.a f148517i;

    static {
        Covode.recordClassIndex(97900);
    }

    public h() {
        b bVar = new b();
        this.f148517i = bVar;
        this.f148516h = bVar;
    }

    @Override // com.ss.android.ugc.h.c
    public final void c() {
        MethodCollector.i(3301);
        this.f148511b = -1.0d;
        synchronized (this.f148515g) {
            try {
                Iterator<Object> it = this.f148515g.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } finally {
                MethodCollector.o(3301);
            }
        }
    }

    @Override // com.ss.android.ugc.h.c
    public final double a() {
        double d2;
        Throwable th;
        f148509f.lock();
        try {
            d2 = this.f148516h.a(this.f148513d, this.f148514e);
            if (-1.0d == d2) {
                try {
                    g.a aVar = this.f148517i;
                    if (aVar != this.f148516h) {
                        d2 = aVar.a(this.f148513d, this.f148514e);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        Log.getStackTraceString(th);
                        f148509f.unlock();
                        return d2;
                    } catch (Throwable th3) {
                        f148509f.unlock();
                        throw th3;
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            d2 = -1.0d;
        }
        f148509f.unlock();
        return d2;
    }

    @Override // com.ss.android.ugc.h.c
    public final i[] b() {
        Lock lock = f148509f;
        lock.lock();
        try {
            Queue<i> queue = this.f148513d;
            if (queue != null) {
                i[] iVarArr = new i[queue.size()];
                int i2 = 0;
                for (i iVar : this.f148513d) {
                    iVarArr[i2] = new i(iVar.f148519b, iVar.f148520c, iVar.f148521d, iVar.f148522e);
                    i2++;
                }
                return iVarArr;
            }
            lock.unlock();
            return null;
        } finally {
            f148509f.unlock();
        }
    }

    @Override // com.ss.android.ugc.h.d
    public final double d() {
        g.a aVar;
        double d2 = this.f148511b;
        if (d2 == -1.0d) {
            Lock lock = f148509f;
            lock.lock();
            try {
                d2 = this.f148511b;
                if (d2 == -1.0d) {
                    d2 = this.f148516h.b(this.f148513d, this.f148514e);
                    if (d2 == -1.0d && (aVar = this.f148517i) != this.f148516h) {
                        d2 = aVar.b(this.f148513d, this.f148514e);
                    }
                    this.f148511b = d2;
                }
                lock.unlock();
            } catch (Throwable th) {
                f148509f.unlock();
                throw th;
            }
        }
        if (d2 > 0.001d) {
            return d2;
        }
        double d3 = this.f148512c;
        return d3 > 0.001d ? d3 : d2;
    }

    @Override // com.ss.android.ugc.h.c
    public final void a(double d2) {
        this.f148512c = d2;
    }

    @Override // com.ss.android.ugc.h.c
    public final void a(g.a aVar) {
        this.f148516h = aVar;
    }

    @Override // com.ss.android.ugc.h.c
    public final void a(int i2) {
        if (i2 > 0 && i2 != this.f148513d.size()) {
            Lock lock = f148509f;
            lock.lock();
            try {
                ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i2);
                arrayBlockingQueue.addAll(this.f148513d);
                this.f148514e = new i[i2];
                this.f148513d = arrayBlockingQueue;
                lock.unlock();
            } catch (Exception e2) {
                e2.printStackTrace();
                f148509f.unlock();
            } catch (Throwable th) {
                f148509f.unlock();
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.h.c
    public final void a(double d2, double d3, long j2) {
        Lock lock = f148509f;
        lock.lock();
        try {
            i iVar = this.f148510a;
            if (iVar != null) {
                iVar.f148519b = d2;
                iVar.f148520c = d3;
                iVar.f148521d = j2;
                iVar.f148522e = SystemClock.elapsedRealtime();
            } else {
                iVar = new i(d2, d3, j2, SystemClock.elapsedRealtime());
            }
            if (!this.f148513d.offer(iVar)) {
                this.f148510a = this.f148513d.poll();
                this.f148513d.offer(iVar);
            }
            c();
            lock.unlock();
        } catch (Throwable th) {
            c();
            f148509f.unlock();
            throw th;
        }
    }
}

package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* access modifiers changed from: package-private */
public final class fd<V> extends FutureTask<V> implements Comparable<fd<V>> {

    /* renamed from: a  reason: collision with root package name */
    final boolean f51590a;

    /* renamed from: b  reason: collision with root package name */
    private final long f51591b;

    /* renamed from: c  reason: collision with root package name */
    private final String f51592c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ ex f51593d;

    static {
        Covode.recordClassIndex(32225);
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f51593d.q().f51468c.a(this.f51592c, th);
        if (th instanceof fa) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        fd fdVar = (fd) obj;
        boolean z = this.f51590a;
        if (z == fdVar.f51590a) {
            long j2 = this.f51591b;
            long j3 = fdVar.f51591b;
            if (j2 < j3) {
                return -1;
            }
            if (j2 > j3) {
                return 1;
            }
            this.f51593d.q().f51469d.a("Two tasks share the same index. index", Long.valueOf(this.f51591b));
            return 0;
        } else if (z) {
            return -1;
        } else {
            return 1;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    fd(ex exVar, Runnable runnable, String str) {
        super(runnable, null);
        this.f51593d = exVar;
        r.a((Object) str);
        long andIncrement = ex.f51564f.getAndIncrement();
        this.f51591b = andIncrement;
        this.f51592c = str;
        this.f51590a = false;
        if (andIncrement == Long.MAX_VALUE) {
            exVar.q().f51468c.a("Tasks index overflow");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    fd(ex exVar, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.f51593d = exVar;
        r.a((Object) str);
        long andIncrement = ex.f51564f.getAndIncrement();
        this.f51591b = andIncrement;
        this.f51592c = str;
        this.f51590a = z;
        if (andIncrement == Long.MAX_VALUE) {
            exVar.q().f51468c.a("Tasks index overflow");
        }
    }
}

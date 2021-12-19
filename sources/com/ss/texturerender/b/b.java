package com.ss.texturerender.b;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.texturerender.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private long f151818a;

    /* renamed from: b  reason: collision with root package name */
    private long f151819b;

    /* renamed from: c  reason: collision with root package name */
    private int f151820c = 3;

    /* renamed from: d  reason: collision with root package name */
    private boolean f151821d;

    static {
        Covode.recordClassIndex(101246);
    }

    public final synchronized void a() {
        MethodCollector.i(9696);
        this.f151820c = 1;
        MethodCollector.o(9696);
    }

    public final synchronized void b() {
        MethodCollector.i(9865);
        this.f151820c = 2;
        this.f151819b = 0;
        MethodCollector.o(9865);
    }

    public final synchronized void c() {
        MethodCollector.i(10036);
        this.f151820c = 3;
        this.f151819b = 0;
        this.f151821d = false;
        this.f151818a = 0;
        MethodCollector.o(10036);
    }

    public final synchronized long d() {
        long j2;
        MethodCollector.i(10200);
        long j3 = this.f151818a;
        long j4 = 0;
        if (this.f151819b > 0 && this.f151820c == 1) {
            j4 = SystemClock.elapsedRealtime() - this.f151819b;
        }
        j2 = j3 + j4;
        MethodCollector.o(10200);
        return j2;
    }

    public final synchronized void a(long j2) {
        MethodCollector.i(10038);
        l.a("NormalClock", "updateClock masetr:" + j2 + " mIsUpdated:" + this.f151821d + " mStatus:" + this.f151820c);
        if (!this.f151821d) {
            this.f151821d = true;
            this.f151820c = 1;
        }
        if (this.f151820c == 1) {
            this.f151818a = j2;
            this.f151819b = SystemClock.elapsedRealtime();
        }
        MethodCollector.o(10038);
    }
}

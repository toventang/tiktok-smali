package com.bytedance.sdk.bdlynx.a.f;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.a.a.d;
import java.util.concurrent.atomic.AtomicLong;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private AtomicLong f43669a = new AtomicLong(0);

    /* renamed from: b  reason: collision with root package name */
    private AtomicLong f43670b;

    /* renamed from: c  reason: collision with root package name */
    private volatile long f43671c;

    static {
        Covode.recordClassIndex(26724);
    }

    public static long b() {
        return SystemClock.uptimeMillis();
    }

    public b() {
        AtomicLong atomicLong = new AtomicLong(-1);
        this.f43670b = atomicLong;
        this.f43671c = atomicLong.get();
    }

    public static b a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        b bVar = new b();
        if (bVar.f43670b.compareAndSet(-1, uptimeMillis)) {
            bVar.f43669a.set(0);
            bVar.f43671c = bVar.f43670b.get();
            d.b("TimeMeter", "start: success " + bVar.f43670b);
        } else {
            d.b("TimeMeter", "start: fail " + bVar.f43670b);
        }
        bVar.f43670b.get();
        return bVar;
    }

    public static long a(long j2) {
        return SystemClock.uptimeMillis() - j2;
    }

    public static long a(b bVar) {
        long j2;
        if (bVar == null) {
            return 0;
        }
        long j3 = bVar.f43670b.get();
        if (-1 != j3) {
            j2 = SystemClock.uptimeMillis() - j3;
        } else {
            j2 = 0;
        }
        if (bVar.f43669a.compareAndSet(0, j2)) {
            bVar.f43670b.set(-1);
            d.b("TimeMeter", "stop: success " + bVar.f43669a);
        } else {
            d.b("TimeMeter", "stop: fail " + bVar.f43669a);
        }
        return bVar.f43669a.get();
    }
}

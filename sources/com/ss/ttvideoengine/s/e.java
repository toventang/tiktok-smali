package com.ss.ttvideoengine.s;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private int f153265a = 2;

    /* renamed from: b  reason: collision with root package name */
    private int f153266b;

    /* renamed from: c  reason: collision with root package name */
    private long f153267c;

    static {
        Covode.recordClassIndex(101779);
    }

    public final void a() {
        if (this.f153265a == 2) {
            this.f153265a = 1;
            this.f153267c = SystemClock.elapsedRealtime();
        }
    }

    public final void d() {
        this.f153266b = 0;
        if (this.f153265a == 1) {
            this.f153267c = SystemClock.elapsedRealtime();
        }
    }

    public final void e() {
        this.f153265a = 2;
        this.f153266b = 0;
        this.f153267c = 0;
    }

    public final void b() {
        if (this.f153265a == 1) {
            this.f153265a = 2;
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f153267c);
            if (elapsedRealtime >= 0) {
                this.f153266b += elapsedRealtime;
            }
        }
    }

    public final int c() {
        if (this.f153265a == 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i2 = (int) (elapsedRealtime - this.f153267c);
            if (i2 >= 0) {
                this.f153266b += i2;
            }
            this.f153267c = elapsedRealtime;
        }
        return this.f153266b;
    }
}

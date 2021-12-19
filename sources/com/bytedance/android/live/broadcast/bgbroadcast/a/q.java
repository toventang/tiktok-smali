package com.bytedance.android.live.broadcast.bgbroadcast.a;

import com.bytedance.covode.number.Covode;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    long f7707a;

    /* renamed from: b  reason: collision with root package name */
    public long f7708b;

    /* renamed from: c  reason: collision with root package name */
    public long f7709c;

    /* renamed from: d  reason: collision with root package name */
    private m f7710d = m.RESET;

    static {
        Covode.recordClassIndex(3805);
    }

    public final void c() {
        this.f7710d = m.RESET;
        this.f7707a = 0;
        this.f7708b = 0;
        this.f7709c = 0;
    }

    public final void a() {
        if (this.f7710d != m.STARTED) {
            this.f7710d = m.STARTED;
            this.f7708b = System.currentTimeMillis();
        }
    }

    public final void b() {
        if (this.f7710d != m.PAUSED) {
            this.f7710d = m.PAUSED;
            long currentTimeMillis = System.currentTimeMillis();
            this.f7709c = currentTimeMillis;
            long j2 = this.f7708b;
            if (1 <= j2 && currentTimeMillis > j2) {
                this.f7707a += currentTimeMillis - j2;
            }
        }
    }
}

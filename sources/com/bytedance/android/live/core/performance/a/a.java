package com.bytedance.android.live.core.performance.a;

import com.bytedance.android.livesdk.livesetting.performance.LiveMtEnableInstantCpuRateSetting;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    long f9234a = 1000;

    /* renamed from: b  reason: collision with root package name */
    long f9235b = 300;

    /* renamed from: c  reason: collision with root package name */
    long f9236c = 60;

    /* renamed from: d  reason: collision with root package name */
    public int f9237d = LiveMtEnableInstantCpuRateSetting.INSTANCE.getValue();

    /* renamed from: e  reason: collision with root package name */
    public double f9238e = -1.0d;

    /* renamed from: f  reason: collision with root package name */
    public long f9239f = -1;

    /* renamed from: g  reason: collision with root package name */
    public long f9240g = -1;

    /* renamed from: h  reason: collision with root package name */
    public long f9241h = -1;

    /* renamed from: i  reason: collision with root package name */
    public double f9242i = -1.0d;

    /* renamed from: j  reason: collision with root package name */
    public boolean f9243j = com.bytedance.android.live.core.performance.a.b();

    /* renamed from: k  reason: collision with root package name */
    private b f9244k;

    /* renamed from: l  reason: collision with root package name */
    private long f9245l = 300;

    static {
        Covode.recordClassIndex(4725);
    }

    private void a() {
        double d2 = this.f9244k.f9249d;
        double d3 = (double) this.f9244k.f9247b;
        Double.isNaN(d3);
        float f2 = (float) (d2 / d3);
        float f3 = (float) this.f9244k.f9248c;
        double d4 = this.f9244k.f9251f;
        double d5 = (double) this.f9244k.f9247b;
        Double.isNaN(d5);
        a(f2, f3, (float) (d4 / d5), (float) this.f9244k.f9250e);
    }

    private void a(float f2, float f3, float f4, float f5) {
        if (f2 > -1.0f && f3 > -1.0f && this.f9243j && Logger.debug()) {
            com.bytedance.android.live.core.c.a.a(3, "MonitorCpu", "app_usage_rate=".concat(String.valueOf(f2)));
            com.bytedance.android.live.core.c.a.a(3, "MonitorCpu", "app_max_usage_rate=".concat(String.valueOf(f3)));
        }
        if (Logger.debug()) {
            com.bytedance.android.live.core.c.a.a(3, "MonitorCpu", "app_stat_speed=".concat(String.valueOf(f4)));
            com.bytedance.android.live.core.c.a.a(3, "MonitorCpu", "app_max_stat_speed=".concat(String.valueOf(f5)));
        }
    }

    public final void a(long j2, double d2, double d3, long j3, long j4) {
        if (this.f9241h > -1) {
            b bVar = this.f9244k;
            if (bVar == null) {
                this.f9244k = new b(j2, d2, d2, d3, d3);
            } else {
                if (bVar.f9246a == 0) {
                    this.f9244k.f9246a = j2;
                }
                this.f9244k.f9247b++;
                this.f9244k.f9249d += d2;
                if (this.f9244k.f9248c < d2) {
                    this.f9244k.f9248c = d2;
                }
                this.f9244k.f9251f += d3;
                if (this.f9244k.f9250e < d3) {
                    this.f9244k.f9250e = d3;
                }
            }
            if (j2 - this.f9244k.f9246a > this.f9245l * this.f9234a) {
                a();
                this.f9244k.a();
            }
        }
        this.f9239f = j4;
        this.f9240g = j3;
        this.f9238e = d2;
        this.f9241h = j2;
        this.f9242i = d3;
    }
}

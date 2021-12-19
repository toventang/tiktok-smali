package com.ss.android.ugc.aweme.player.sdk.a;

import com.bytedance.covode.number.Covode;
import com.ss.ttm.player.LoadControl;

public final class c extends LoadControl {

    /* renamed from: a  reason: collision with root package name */
    public int f115107a = 200;

    /* renamed from: b  reason: collision with root package name */
    public int f115108b = 1000;

    /* renamed from: c  reason: collision with root package name */
    public int f115109c = 5000;

    /* renamed from: d  reason: collision with root package name */
    public float f115110d = 9.0f;

    /* renamed from: e  reason: collision with root package name */
    public int f115111e = 200;

    /* renamed from: f  reason: collision with root package name */
    boolean f115112f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f115113g;

    /* renamed from: h  reason: collision with root package name */
    public int f115114h;

    /* renamed from: i  reason: collision with root package name */
    public int f115115i;

    /* renamed from: j  reason: collision with root package name */
    public int f115116j;

    /* renamed from: k  reason: collision with root package name */
    public int f115117k;

    /* renamed from: m  reason: collision with root package name */
    private int f115118m;
    private boolean n;
    private boolean o;
    private long p = -1;
    private int q;

    static {
        Covode.recordClassIndex(73987);
    }

    public final void a() {
        this.f115118m = 0;
        this.f115112f = false;
        this.n = false;
        this.o = false;
        this.p = -1;
        this.f115114h = 0;
        this.f115113g = false;
    }

    @Override // com.ss.ttm.player.LoadControl
    public final int onFilterStackSelected(int i2) {
        if (i2 != 2) {
            return 0;
        }
        return this.f115117k;
    }

    public final void a(int i2) {
        if (i2 == 1) {
            this.q = 1;
        } else {
            this.q = 0;
        }
    }

    @Override // com.ss.ttm.player.LoadControl
    public final int onCodecStackSelected(int i2) {
        if (i2 == 1) {
            return this.f115115i;
        }
        if (i2 != 2) {
            return 0;
        }
        return this.f115116j;
    }

    @Override // com.ss.ttm.player.LoadControl
    public final int onTrackSelected(int i2) {
        if (this.f115113g) {
            return this.f115114h;
        }
        return 0;
    }

    @Override // com.ss.ttm.player.LoadControl
    public final boolean shouldStartPlayback(long j2, float f2, boolean z) {
        int i2;
        if (z) {
            if (this.p == -1) {
                if (this.q == 0) {
                    int i3 = this.f115111e;
                    this.p = (long) Math.min(((float) i3) + (((float) this.f115118m) * this.f115110d * ((float) i3)), (float) this.f115109c);
                } else {
                    double d2 = (double) this.f115111e;
                    double pow = Math.pow((double) (this.f115118m + 1), (double) this.f115110d);
                    Double.isNaN(d2);
                    this.p = (long) Math.min(d2 * pow, (double) this.f115109c);
                }
            }
            if (j2 > this.p) {
                this.n = false;
                this.p = -1;
            } else {
                if (!this.n) {
                    this.f115118m++;
                }
                this.n = true;
                return false;
            }
        } else {
            if (this.f115112f) {
                i2 = this.f115107a;
            } else {
                i2 = this.f115108b;
            }
            if (j2 > ((long) i2)) {
                this.o = false;
            } else if (this.o) {
                return false;
            } else {
                this.o = true;
                return false;
            }
        }
        return true;
    }
}

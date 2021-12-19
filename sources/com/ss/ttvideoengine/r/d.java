package com.ss.ttvideoengine.r;

import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f153229a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f153230b;

    /* renamed from: c  reason: collision with root package name */
    public Long f153231c;

    /* renamed from: d  reason: collision with root package name */
    public Long f153232d;

    /* renamed from: e  reason: collision with root package name */
    public Integer f153233e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f153234f;

    /* renamed from: g  reason: collision with root package name */
    public Boolean f153235g;

    /* renamed from: h  reason: collision with root package name */
    public Integer f153236h;

    /* renamed from: i  reason: collision with root package name */
    public Integer f153237i;

    /* renamed from: j  reason: collision with root package name */
    public Integer f153238j;

    /* renamed from: k  reason: collision with root package name */
    public Float f153239k;

    /* renamed from: l  reason: collision with root package name */
    public Boolean f153240l;

    /* renamed from: m  reason: collision with root package name */
    public Integer f153241m;
    public Integer n;
    public Integer o;
    public Boolean p;
    public Integer q;
    public Boolean r;
    public Integer s;
    public Integer t;
    public Float u;
    public Boolean v;
    public String w;
    public a x;

    static {
        Covode.recordClassIndex(101772);
    }

    public d() {
        b();
    }

    public final void a() {
        this.f153239k = null;
        this.f153241m = null;
        this.n = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
    }

    public final void b() {
        this.f153229a = null;
        this.f153230b = null;
        this.f153231c = null;
        this.f153232d = null;
        this.f153233e = null;
        this.f153234f = null;
        this.f153235g = null;
        this.f153236h = null;
        this.f153237i = null;
        this.f153238j = null;
        this.f153239k = null;
        this.f153240l = null;
        this.f153241m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
    }

    public final String toString() {
        String str = "SRStrategyConfig{";
        if (this.f153229a != null) {
            str = str + ", mEnableSR=" + this.f153229a;
        }
        if (this.f153230b != null) {
            str = str + ", mVideoFormatType=" + this.f153230b;
        }
        if (this.f153231c != null) {
            str = str + ", mMinDuration=" + this.f153231c;
        }
        if (this.f153232d != null) {
            str = str + ", mMaxDuration=" + this.f153232d;
        }
        if (this.f153233e != null) {
            str = str + ", mMinPower=" + this.f153233e;
        }
        if (this.f153234f != null) {
            str = str + ", mSupportScene=" + this.f153234f;
        }
        if (this.f153235g != null) {
            str = str + ", mEnableSpeed=" + this.f153235g;
        }
        if (this.f153236h != null) {
            str = str + ", mSRPercent=" + this.f153236h;
        }
        if (this.f153237i != null) {
            str = str + ", mMaxWidth=" + this.f153237i;
        }
        if (this.f153238j != null) {
            str = str + ", mMaxHeight=" + this.f153238j;
        }
        if (this.f153239k != null) {
            str = str + ", mMaxFps=" + this.f153239k;
        }
        if (this.f153240l != null) {
            str = str + ", mEnableHdr=" + this.f153240l;
        }
        if (this.f153241m != null) {
            str = str + ", mCurrentVideoFormatType=" + this.f153241m;
        }
        if (this.n != null) {
            str = str + ", mCurrentDuration=" + this.n;
        }
        if (this.o != null) {
            str = str + ", mCurrentPower=" + this.o;
        }
        if (this.p != null) {
            str = str + ", mIsCharging=" + this.p;
        }
        if (this.q != null) {
            str = str + ", mCurrentScene=" + this.q;
        }
        if (this.r != null) {
            str = str + ", mIsSpeed=" + this.r;
        }
        if (this.s != null) {
            str = str + ", mCurrentWidth=" + this.s;
        }
        if (this.t != null) {
            str = str + ", mCurrentHeight=" + this.t;
        }
        if (this.u != null) {
            str = str + ", mCurrentFps=" + this.u;
        }
        if (this.v != null) {
            str = str + ", mIsHdr=" + this.v;
        }
        if (this.x != null) {
            str = str + ", mStatusListener=" + this.x;
        }
        if (this.w != null) {
            str = str + ", mExtraConfig='" + this.x + "'";
        }
        return str + '}';
    }

    public final d a(int i2) {
        this.f153237i = Integer.valueOf(i2);
        return this;
    }

    public final d b(int i2) {
        this.f153238j = Integer.valueOf(i2);
        return this;
    }

    public final void c(int i2) {
        this.f153241m = Integer.valueOf(i2);
    }

    public final void d(int i2) {
        this.n = Integer.valueOf(i2);
    }

    public final d a(boolean z) {
        this.v = Boolean.valueOf(z);
        return this;
    }

    public final d b(boolean z) {
        this.r = Boolean.valueOf(z);
        return this;
    }

    public final void a(d dVar) {
        if (dVar != null) {
            Boolean bool = dVar.f153229a;
            if (bool != null) {
                this.f153229a = bool;
            }
            Integer num = dVar.f153230b;
            if (num != null) {
                this.f153230b = num;
            }
            Long l2 = dVar.f153231c;
            if (l2 != null) {
                this.f153231c = l2;
            }
            Long l3 = dVar.f153232d;
            if (l3 != null) {
                this.f153232d = l3;
            }
            Integer num2 = dVar.f153233e;
            if (num2 != null) {
                this.f153233e = num2;
            }
            Integer num3 = dVar.f153234f;
            if (num3 != null) {
                this.f153234f = num3;
            }
            Boolean bool2 = dVar.f153235g;
            if (bool2 != null) {
                this.f153235g = bool2;
            }
            Integer num4 = dVar.f153236h;
            if (num4 != null) {
                this.f153236h = num4;
            }
            Integer num5 = dVar.f153237i;
            if (num5 != null) {
                this.f153237i = num5;
            }
            Integer num6 = dVar.f153238j;
            if (num6 != null) {
                this.f153238j = num6;
            }
            Float f2 = dVar.f153239k;
            if (f2 != null) {
                this.f153239k = f2;
            }
            Boolean bool3 = dVar.f153240l;
            if (bool3 != null) {
                this.f153240l = bool3;
            }
            Integer num7 = dVar.f153241m;
            if (num7 != null) {
                this.f153241m = num7;
            }
            Integer num8 = dVar.n;
            if (num8 != null) {
                this.n = num8;
            }
            Integer num9 = dVar.o;
            if (num9 != null) {
                this.o = num9;
            }
            Boolean bool4 = dVar.p;
            if (bool4 != null) {
                this.p = bool4;
            }
            Integer num10 = dVar.q;
            if (num10 != null) {
                this.q = num10;
            }
            Boolean bool5 = dVar.r;
            if (bool5 != null) {
                this.r = bool5;
            }
            Integer num11 = dVar.s;
            if (num11 != null) {
                this.s = num11;
            }
            Integer num12 = dVar.t;
            if (num12 != null) {
                this.t = num12;
            }
            Float f3 = dVar.u;
            if (f3 != null) {
                this.u = f3;
            }
            Boolean bool6 = dVar.v;
            if (bool6 != null) {
                this.v = bool6;
            }
            a aVar = dVar.x;
            if (aVar != null) {
                this.x = aVar;
            }
        }
    }
}

package com.ss.android.ugc.aweme.simkit.model.bitrateselect;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.f.a.a.a.a.a;

public class b implements a {
    @c(a = "param_a")

    /* renamed from: a  reason: collision with root package name */
    public double f133601a;
    @c(a = "param_b")

    /* renamed from: b  reason: collision with root package name */
    public double f133602b;
    @c(a = "param_c")

    /* renamed from: c  reason: collision with root package name */
    public double f133603c;
    @c(a = "param_d")

    /* renamed from: d  reason: collision with root package name */
    public double f133604d;
    @c(a = "min_bitrate")

    /* renamed from: e  reason: collision with root package name */
    public double f133605e;

    static {
        Covode.recordClassIndex(87394);
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.a
    public final double a() {
        return this.f133601a;
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.a
    public final double b() {
        return this.f133602b;
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.a
    public final double c() {
        return this.f133603c;
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.a
    public final double d() {
        return this.f133604d;
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.a
    public final double e() {
        return this.f133605e;
    }

    public String toString() {
        return "AutoBitrateSet{firstParam=" + this.f133601a + ", secondParam=" + this.f133602b + ", thirdParam=" + this.f133603c + ", fourthParam=" + this.f133604d + ", minBitrate=" + this.f133605e + '}';
    }
}

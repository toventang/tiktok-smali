package com.ss.android.ugc.aweme.speedpredictor.api;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

public final class e implements Comparable<e> {

    /* renamed from: a  reason: collision with root package name */
    public double f134667a;

    /* renamed from: b  reason: collision with root package name */
    public double f134668b;

    /* renamed from: c  reason: collision with root package name */
    public double f134669c;

    /* renamed from: d  reason: collision with root package name */
    public long f134670d;

    static {
        Covode.recordClassIndex(87993);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(e eVar) {
        double d2;
        e eVar2 = eVar;
        double d3 = this.f134669c;
        if (eVar2 == null) {
            d2 = 0.0d;
        } else {
            d2 = eVar2.f134669c;
        }
        return Double.compare(d3, d2);
    }

    public e(double d2, double d3) {
        this.f134667a = d2 < 0.0d ? 0.0d : d2;
        this.f134668b = d3 < 0.0d ? 0.0d : d3;
        this.f134670d = SystemClock.elapsedRealtime();
        this.f134669c = this.f134667a / (this.f134668b / 1000.0d);
    }
}

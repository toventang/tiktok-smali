package com.ss.android.ugc.h;

import com.bytedance.covode.number.Covode;

public final class i implements Comparable<i> {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f148518a = true;

    /* renamed from: b  reason: collision with root package name */
    public double f148519b;

    /* renamed from: c  reason: collision with root package name */
    public double f148520c;

    /* renamed from: d  reason: collision with root package name */
    public long f148521d;

    /* renamed from: e  reason: collision with root package name */
    public long f148522e;

    static {
        Covode.recordClassIndex(97901);
    }

    public final String toString() {
        return "SpeedRecord{mSpeed=" + this.f148519b + ", mWeight=" + this.f148520c + ", mCostTime=" + this.f148521d + ", currentTime=" + this.f148522e + '}';
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(i iVar) {
        double d2 = this.f148519b;
        double d3 = iVar.f148519b;
        if (d2 == d3) {
            return 0;
        }
        if (d2 < d3) {
            return -1;
        }
        return 1;
    }

    public i(double d2, double d3, long j2, long j3) {
        this.f148519b = d2;
        this.f148520c = d3;
        this.f148521d = j2;
        this.f148522e = j3;
        if (!f148518a) {
            return;
        }
        if (d2 < 0.0d || d3 < 0.0d) {
            throw new IllegalArgumentException(toString());
        }
    }
}

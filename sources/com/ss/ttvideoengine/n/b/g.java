package com.ss.ttvideoengine.n.b;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* access modifiers changed from: package-private */
public final class g implements Serializable, Comparable<g> {
    private static final long serialVersionUID = 7003130400674500845L;
    public final double mDownThreshold;
    public final double mRate;
    public final double mUpThreshold;

    static {
        Covode.recordClassIndex(101729);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.mRate);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.mDownThreshold);
        int i3 = (i2 * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.mUpThreshold);
        return (i3 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
    }

    public final String toString() {
        return "Shift{mRate=" + this.mRate + ", mDownThreshold=" + this.mDownThreshold + ", mUpThreshold=" + this.mUpThreshold + '}';
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(g gVar) {
        return Double.compare(this.mRate, gVar.mRate);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (Double.compare(gVar.mRate, this.mRate) == 0 && Double.compare(gVar.mDownThreshold, this.mDownThreshold) == 0 && Double.compare(gVar.mUpThreshold, this.mUpThreshold) == 0) {
            return true;
        }
        return false;
    }

    public g(double d2, double d3, double d4) {
        this.mRate = d2;
        this.mDownThreshold = d3;
        this.mUpThreshold = d4;
    }
}

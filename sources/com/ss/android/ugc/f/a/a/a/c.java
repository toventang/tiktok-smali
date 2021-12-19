package com.ss.android.ugc.f.a.a.a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public class c implements Serializable, Comparable<c> {
    private static final long serialVersionUID = 7003130400674500845L;
    public final double mDownThreshold;
    public final double mRate;
    public final double mUpThreshold;

    static {
        Covode.recordClassIndex(95620);
    }

    public double getMedianThreshold() {
        return (this.mDownThreshold + this.mUpThreshold) / 2.0d;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.mRate);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.mDownThreshold);
        int i3 = (i2 * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.mUpThreshold);
        return (i3 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
    }

    public String toString() {
        return "Shift{mRate=" + this.mRate + ", mDownThreshold=" + this.mDownThreshold + ", mUpThreshold=" + this.mUpThreshold + '}';
    }

    public int compareTo(c cVar) {
        return Double.compare(this.mRate, cVar.mRate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Double.compare(cVar.mRate, this.mRate) == 0 && Double.compare(cVar.mDownThreshold, this.mDownThreshold) == 0 && Double.compare(cVar.mUpThreshold, this.mUpThreshold) == 0) {
            return true;
        }
        return false;
    }

    public c(double d2, double d3, double d4) {
        this.mRate = d2;
        this.mDownThreshold = d3;
        this.mUpThreshold = d4;
    }
}

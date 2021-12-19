package com.bytedance.ies.android.base.runtime.depend;

import com.bytedance.covode.number.Covode;

public final class PointModel {
    private final double px;
    private final double py;

    static {
        Covode.recordClassIndex(18668);
    }

    public static /* synthetic */ PointModel copy$default(PointModel pointModel, double d2, double d3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d2 = pointModel.px;
        }
        if ((i2 & 2) != 0) {
            d3 = pointModel.py;
        }
        return pointModel.copy(d2, d3);
    }

    public final double component1() {
        return this.px;
    }

    public final double component2() {
        return this.py;
    }

    public final PointModel copy(double d2, double d3) {
        return new PointModel(d2, d3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointModel)) {
            return false;
        }
        PointModel pointModel = (PointModel) obj;
        return Double.compare(this.px, pointModel.px) == 0 && Double.compare(this.py, pointModel.py) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.px);
        int i2 = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.py);
        return i2 + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "PointModel(px=" + this.px + ", py=" + this.py + ")";
    }

    public final double getPx() {
        return this.px;
    }

    public final double getPy() {
        return this.py;
    }

    public PointModel(double d2, double d3) {
        this.px = d2;
        this.py = d3;
    }
}

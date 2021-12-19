package com.ss.android.ugc.aweme.poi;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;

public final class GuitarBundle {
    @c(a = "latitude")
    private double latitude;
    @c(a = "longitude")
    private double longitude;

    static {
        Covode.recordClassIndex(74158);
    }

    public GuitarBundle() {
        this(0.0d, 0.0d, 3, null);
    }

    public static /* synthetic */ GuitarBundle copy$default(GuitarBundle guitarBundle, double d2, double d3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d2 = guitarBundle.latitude;
        }
        if ((i2 & 2) != 0) {
            d3 = guitarBundle.longitude;
        }
        return guitarBundle.copy(d2, d3);
    }

    public final double component1() {
        return this.latitude;
    }

    public final double component2() {
        return this.longitude;
    }

    public final GuitarBundle copy(double d2, double d3) {
        return new GuitarBundle(d2, d3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuitarBundle)) {
            return false;
        }
        GuitarBundle guitarBundle = (GuitarBundle) obj;
        return Double.compare(this.latitude, guitarBundle.latitude) == 0 && Double.compare(this.longitude, guitarBundle.longitude) == 0;
    }

    public final int hashCode() {
        return (com_ss_android_ugc_aweme_poi_GuitarBundle_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.latitude) * 31) + com_ss_android_ugc_aweme_poi_GuitarBundle_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.longitude);
    }

    public final String toString() {
        return "GuitarBundle(latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final void setLatitude(double d2) {
        this.latitude = d2;
    }

    public final void setLongitude(double d2) {
        this.longitude = d2;
    }

    public static int com_ss_android_ugc_aweme_poi_GuitarBundle_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(double d2) {
        long doubleToLongBits = Double.doubleToLongBits(d2);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public GuitarBundle(double d2, double d3) {
        this.latitude = d2;
        this.longitude = d3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GuitarBundle(double d2, double d3, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0.0d : d2, (i2 & 2) != 0 ? 0.0d : d3);
    }
}

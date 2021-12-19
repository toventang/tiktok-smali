package com.ss.android.ugc.aweme.shortvideo.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class LoudnessBalanceParam implements Parcelable, Serializable {
    public static final Parcelable.Creator<LoudnessBalanceParam> CREATOR = new a();
    @c(a = "avg_loudness")
    private double avgLoudness;
    @c(a = "bgm_loudness")
    private double bgmLoudness;
    @c(a = "peak_loudness")
    private double peakLoudness;

    static {
        Covode.recordClassIndex(83102);
    }

    public LoudnessBalanceParam() {
        this(0.0d, 0.0d, 0.0d, 7, null);
    }

    public static /* synthetic */ LoudnessBalanceParam copy$default(LoudnessBalanceParam loudnessBalanceParam, double d2, double d3, double d4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d2 = loudnessBalanceParam.bgmLoudness;
        }
        if ((i2 & 2) != 0) {
            d3 = loudnessBalanceParam.peakLoudness;
        }
        if ((i2 & 4) != 0) {
            d4 = loudnessBalanceParam.avgLoudness;
        }
        return loudnessBalanceParam.copy(d2, d3, d4);
    }

    public final double component1() {
        return this.bgmLoudness;
    }

    public final double component2() {
        return this.peakLoudness;
    }

    public final double component3() {
        return this.avgLoudness;
    }

    public final LoudnessBalanceParam copy(double d2, double d3, double d4) {
        return new LoudnessBalanceParam(d2, d3, d4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoudnessBalanceParam)) {
            return false;
        }
        LoudnessBalanceParam loudnessBalanceParam = (LoudnessBalanceParam) obj;
        return Double.compare(this.bgmLoudness, loudnessBalanceParam.bgmLoudness) == 0 && Double.compare(this.peakLoudness, loudnessBalanceParam.peakLoudness) == 0 && Double.compare(this.avgLoudness, loudnessBalanceParam.avgLoudness) == 0;
    }

    public final int hashCode() {
        return (((com_ss_android_ugc_aweme_shortvideo_edit_LoudnessBalanceParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.bgmLoudness) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_LoudnessBalanceParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.peakLoudness)) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_LoudnessBalanceParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.avgLoudness);
    }

    public final String toString() {
        return "LoudnessBalanceParam(bgmLoudness=" + this.bgmLoudness + ", peakLoudness=" + this.peakLoudness + ", avgLoudness=" + this.avgLoudness + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeDouble(this.bgmLoudness);
        parcel.writeDouble(this.peakLoudness);
        parcel.writeDouble(this.avgLoudness);
    }

    public final double getAvgLoudness() {
        return this.avgLoudness;
    }

    public final double getBgmLoudness() {
        return this.bgmLoudness;
    }

    public final double getPeakLoudness() {
        return this.peakLoudness;
    }

    public static class a implements Parcelable.Creator<LoudnessBalanceParam> {
        static {
            Covode.recordClassIndex(83103);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LoudnessBalanceParam[] newArray(int i2) {
            return new LoudnessBalanceParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LoudnessBalanceParam createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new LoudnessBalanceParam(parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }
    }

    public final void setAvgLoudness(double d2) {
        this.avgLoudness = d2;
    }

    public final void setBgmLoudness(double d2) {
        this.bgmLoudness = d2;
    }

    public final void setPeakLoudness(double d2) {
        this.peakLoudness = d2;
    }

    public static int com_ss_android_ugc_aweme_shortvideo_edit_LoudnessBalanceParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(double d2) {
        long doubleToLongBits = Double.doubleToLongBits(d2);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public LoudnessBalanceParam(double d2, double d3, double d4) {
        this.bgmLoudness = d2;
        this.peakLoudness = d3;
        this.avgLoudness = d4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoudnessBalanceParam(double d2, double d3, double d4, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0.0d : d2, (i2 & 2) != 0 ? 0.0d : d3, (i2 & 4) != 0 ? 0.0d : d4);
    }
}

package com.ss.android.ugc.aweme.shortvideo.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class OptBitrateFromVE implements Parcelable, Serializable {
    public static final Parcelable.Creator<OptBitrateFromVE> CREATOR = new a();
    private final float minOptBitrate;
    private final float minOptBitrateHD;
    private final float optBitrate;
    private final float optBitrateHD;

    static {
        Covode.recordClassIndex(83105);
    }

    public OptBitrateFromVE() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ OptBitrateFromVE copy$default(OptBitrateFromVE optBitrateFromVE, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = optBitrateFromVE.minOptBitrate;
        }
        if ((i2 & 2) != 0) {
            f3 = optBitrateFromVE.optBitrate;
        }
        if ((i2 & 4) != 0) {
            f4 = optBitrateFromVE.minOptBitrateHD;
        }
        if ((i2 & 8) != 0) {
            f5 = optBitrateFromVE.optBitrateHD;
        }
        return optBitrateFromVE.copy(f2, f3, f4, f5);
    }

    public final float component1() {
        return this.minOptBitrate;
    }

    public final float component2() {
        return this.optBitrate;
    }

    public final float component3() {
        return this.minOptBitrateHD;
    }

    public final float component4() {
        return this.optBitrateHD;
    }

    public final OptBitrateFromVE copy(float f2, float f3, float f4, float f5) {
        return new OptBitrateFromVE(f2, f3, f4, f5);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptBitrateFromVE)) {
            return false;
        }
        OptBitrateFromVE optBitrateFromVE = (OptBitrateFromVE) obj;
        return Float.compare(this.minOptBitrate, optBitrateFromVE.minOptBitrate) == 0 && Float.compare(this.optBitrate, optBitrateFromVE.optBitrate) == 0 && Float.compare(this.minOptBitrateHD, optBitrateFromVE.minOptBitrateHD) == 0 && Float.compare(this.optBitrateHD, optBitrateFromVE.optBitrateHD) == 0;
    }

    public final int hashCode() {
        return (((((com_ss_android_ugc_aweme_shortvideo_edit_OptBitrateFromVE_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.minOptBitrate) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_OptBitrateFromVE_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.optBitrate)) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_OptBitrateFromVE_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.minOptBitrateHD)) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_OptBitrateFromVE_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.optBitrateHD);
    }

    public final String toString() {
        return "OptBitrateFromVE(minOptBitrate=" + this.minOptBitrate + ", optBitrate=" + this.optBitrate + ", minOptBitrateHD=" + this.minOptBitrateHD + ", optBitrateHD=" + this.optBitrateHD + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeFloat(this.minOptBitrate);
        parcel.writeFloat(this.optBitrate);
        parcel.writeFloat(this.minOptBitrateHD);
        parcel.writeFloat(this.optBitrateHD);
    }

    public final float getMinOptBitrate() {
        return this.minOptBitrate;
    }

    public final float getMinOptBitrateHD() {
        return this.minOptBitrateHD;
    }

    public final float getOptBitrate() {
        return this.optBitrate;
    }

    public final float getOptBitrateHD() {
        return this.optBitrateHD;
    }

    public static class a implements Parcelable.Creator<OptBitrateFromVE> {
        static {
            Covode.recordClassIndex(83106);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OptBitrateFromVE[] newArray(int i2) {
            return new OptBitrateFromVE[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OptBitrateFromVE createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new OptBitrateFromVE(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }
    }

    public static int com_ss_android_ugc_aweme_shortvideo_edit_OptBitrateFromVE_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public OptBitrateFromVE(float f2, float f3, float f4, float f5) {
        this.minOptBitrate = f2;
        this.optBitrate = f3;
        this.minOptBitrateHD = f4;
        this.optBitrateHD = f5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OptBitrateFromVE(float f2, float f3, float f4, float f5, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0.0f : f2, (i2 & 2) != 0 ? 0.0f : f3, (i2 & 4) != 0 ? 0.0f : f4, (i2 & 8) != 0 ? 0.0f : f5);
    }
}

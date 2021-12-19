package com.ss.android.ugc.aweme.shortvideo.publish;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.bz;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class HardcodeAdaptiveResult implements Parcelable, Serializable {
    public static final Parcelable.Creator<HardcodeAdaptiveResult> CREATOR = new a();
    private float hwOptBitrate;
    private boolean needSetHwOptBitrate;
    private float preBitrateStatus;

    static {
        Covode.recordClassIndex(85114);
    }

    public HardcodeAdaptiveResult() {
        this(0.0f, 0.0f, false, 7, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeFloat(this.hwOptBitrate);
        parcel.writeFloat(this.preBitrateStatus);
        parcel.writeInt(this.needSetHwOptBitrate ? 1 : 0);
    }

    public final float getHwOptBitrate() {
        return this.hwOptBitrate;
    }

    public final boolean getNeedSetHwOptBitrate() {
        return this.needSetHwOptBitrate;
    }

    public final float getPreBitrateStatus() {
        return this.preBitrateStatus;
    }

    public static class a implements Parcelable.Creator<HardcodeAdaptiveResult> {
        static {
            Covode.recordClassIndex(85115);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ HardcodeAdaptiveResult[] newArray(int i2) {
            return new HardcodeAdaptiveResult[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ HardcodeAdaptiveResult createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new HardcodeAdaptiveResult(parcel.readFloat(), parcel.readFloat(), parcel.readInt() != 0);
        }
    }

    public final void setHwOptBitrate(float f2) {
        this.hwOptBitrate = f2;
    }

    public final void setNeedSetHwOptBitrate(boolean z) {
        this.needSetHwOptBitrate = z;
    }

    public final void setPreBitrateStatus(float f2) {
        this.preBitrateStatus = f2;
    }

    public HardcodeAdaptiveResult(float f2, float f3, boolean z) {
        this.hwOptBitrate = f2;
        this.preBitrateStatus = f3;
        this.needSetHwOptBitrate = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HardcodeAdaptiveResult(float f2, float f3, boolean z, int i2, g gVar) {
        this((i2 & 1) != 0 ? -1.0f : f2, (i2 & 2) != 0 ? 0.0f : f3, (i2 & 4) != 0 ? bz.a() : z);
    }
}

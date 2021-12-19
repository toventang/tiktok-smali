package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VEAudioNoiseFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioNoiseFilterParam> CREATOR = new Parcelable.Creator<VEAudioNoiseFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEAudioNoiseFilterParam.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99459);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEAudioNoiseFilterParam[] newArray(int i2) {
            return new VEAudioNoiseFilterParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEAudioNoiseFilterParam createFromParcel(Parcel parcel) {
            return new VEAudioNoiseFilterParam(parcel);
        }
    };
    public boolean enable;
    public String modelPath;
    public float noiseMode;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public int describeContents() {
        return 0;
    }

    public VEAudioNoiseFilterParam() {
        this.filterName = "audio noise";
    }

    static {
        Covode.recordClassIndex(99458);
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public String toString() {
        return "VEAudioNoiseFilterParam{filterType=" + this.filterType + ", filterName='" + this.filterName + ", filterDurationType=" + this.filterDurationType + ", noiseMode=" + this.noiseMode + ", modelPath=" + this.modelPath + '}';
    }

    protected VEAudioNoiseFilterParam(Parcel parcel) {
        super(parcel);
        this.noiseMode = parcel.readFloat();
        this.modelPath = parcel.readString();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeFloat(this.noiseMode);
        parcel.writeString(this.modelPath);
    }
}

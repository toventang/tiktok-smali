package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VEAudioVolumeFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioVolumeFilterParam> CREATOR = new Parcelable.Creator<VEAudioVolumeFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEAudioVolumeFilterParam.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99463);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEAudioVolumeFilterParam[] newArray(int i2) {
            return new VEAudioVolumeFilterParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEAudioVolumeFilterParam createFromParcel(Parcel parcel) {
            return new VEAudioVolumeFilterParam(parcel);
        }
    };
    public float volume;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public int describeContents() {
        return 0;
    }

    public VEAudioVolumeFilterParam() {
        this.filterName = "audio volume filter";
    }

    static {
        Covode.recordClassIndex(99462);
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public String toString() {
        return "VEAudioVolumeFilterParam{volume=" + this.volume + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEAudioVolumeFilterParam(Parcel parcel) {
        super(parcel);
        this.volume = parcel.readFloat();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeFloat(this.volume);
    }
}

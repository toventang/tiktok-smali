package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VEAudioFadeFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioFadeFilterParam> CREATOR = new Parcelable.Creator<VEAudioFadeFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEAudioFadeFilterParam.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99455);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEAudioFadeFilterParam[] newArray(int i2) {
            return new VEAudioFadeFilterParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEAudioFadeFilterParam createFromParcel(Parcel parcel) {
            return new VEAudioFadeFilterParam(parcel);
        }
    };
    public int fadeInLength;
    public int fadeOutLength;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public int describeContents() {
        return 0;
    }

    public VEAudioFadeFilterParam() {
        this.filterName = "audio fading";
    }

    static {
        Covode.recordClassIndex(99454);
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public String toString() {
        return "VEAudioFadeFilterParam{fadeInLength=" + this.fadeInLength + ", fadeOutLength=" + this.fadeOutLength + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEAudioFadeFilterParam(Parcel parcel) {
        super(parcel);
        this.fadeInLength = parcel.readInt();
        this.fadeOutLength = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.fadeInLength);
        parcel.writeInt(this.fadeOutLength);
    }
}

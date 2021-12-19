package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VEAudioDspFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioDspFilterParam> CREATOR = new Parcelable.Creator<VEAudioDspFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEAudioDspFilterParam.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99451);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEAudioDspFilterParam[] newArray(int i2) {
            return new VEAudioDspFilterParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEAudioDspFilterParam createFromParcel(Parcel parcel) {
            return new VEAudioDspFilterParam(parcel);
        }
    };
    public String jsonDir;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public int describeContents() {
        return super.describeContents();
    }

    static {
        Covode.recordClassIndex(99450);
    }

    public VEAudioDspFilterParam() {
        this.filterName = "audio dsp filter";
        this.jsonDir = "audio dsp use inbuilt json";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public String toString() {
        return "VEAudioDspFilterParam{jsonPath='" + this.jsonDir + '\'' + '}';
    }

    protected VEAudioDspFilterParam(Parcel parcel) {
        super(parcel);
        this.jsonDir = parcel.readString();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.jsonDir);
    }
}

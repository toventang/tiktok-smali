package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEAudioEffectBean;

public class VEAudioEffectFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioEffectFilterParam> CREATOR = new Parcelable.Creator<VEAudioEffectFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEAudioEffectFilterParam.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99453);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEAudioEffectFilterParam[] newArray(int i2) {
            return new VEAudioEffectFilterParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEAudioEffectFilterParam createFromParcel(Parcel parcel) {
            return new VEAudioEffectFilterParam(parcel);
        }
    };
    public VEAudioEffectBean audioEffectBean;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public int describeContents() {
        return 0;
    }

    public VEAudioEffectFilterParam() {
        this.filterName = "audio effect";
    }

    static {
        Covode.recordClassIndex(99452);
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public String toString() {
        return "VEAudioEffectFilterParam{audioEffectBean=" + this.audioEffectBean + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEAudioEffectFilterParam(Parcel parcel) {
        this.audioEffectBean = (VEAudioEffectBean) parcel.readParcelable(VEAudioEffectBean.class.getClassLoader());
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.audioEffectBean, i2);
    }
}

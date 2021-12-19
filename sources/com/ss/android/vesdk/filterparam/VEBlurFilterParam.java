package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VEBlurFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEBlurFilterParam> CREATOR = new Parcelable.Creator<VEBlurFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEBlurFilterParam.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99470);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEBlurFilterParam[] newArray(int i2) {
            return new VEBlurFilterParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEBlurFilterParam createFromParcel(Parcel parcel) {
            return new VEBlurFilterParam(parcel);
        }
    };
    public float intensity;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99469);
    }

    public VEBlurFilterParam() {
        this.filterName = "ve_blur";
        this.filterType = 31;
        this.filterDurationType = 1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEBlurFilterParam{intensity=" + this.intensity + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEBlurFilterParam(Parcel parcel) {
        super(parcel);
        this.intensity = parcel.readFloat();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeFloat(this.intensity);
    }
}

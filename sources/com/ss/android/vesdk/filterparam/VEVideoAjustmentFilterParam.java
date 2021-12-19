package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public class VEVideoAjustmentFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEVideoAjustmentFilterParam> CREATOR = new Parcelable.Creator<VEVideoAjustmentFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEVideoAjustmentFilterParam.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99503);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEVideoAjustmentFilterParam[] newArray(int i2) {
            return new VEVideoAjustmentFilterParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEVideoAjustmentFilterParam createFromParcel(Parcel parcel) {
            return new VEVideoAjustmentFilterParam(parcel);
        }
    };
    public float[] ajustmentIntensity;
    public String[] ajustmentName;
    public int[] ajustmentType;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99502);
    }

    public VEVideoAjustmentFilterParam() {
        this.filterName = "quality filter";
        this.filterType = 17;
        this.filterDurationType = 1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEVideoAjustmentFilterParam{ajustmentName=" + Arrays.toString(this.ajustmentName) + ", ajustmentType=" + Arrays.toString(this.ajustmentType) + ", ajustmentIntensity=" + Arrays.toString(this.ajustmentIntensity) + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEVideoAjustmentFilterParam(Parcel parcel) {
        super(parcel);
        this.ajustmentName = parcel.createStringArray();
        this.ajustmentType = parcel.createIntArray();
        this.ajustmentIntensity = parcel.createFloatArray();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeStringArray(this.ajustmentName);
        parcel.writeIntArray(this.ajustmentType);
        parcel.writeFloatArray(this.ajustmentIntensity);
    }
}

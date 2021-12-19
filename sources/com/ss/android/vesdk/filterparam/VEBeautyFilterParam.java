package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VEBeautyFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEBeautyFilterParam> CREATOR = new Parcelable.Creator<VEBeautyFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEBeautyFilterParam.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99468);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEBeautyFilterParam[] newArray(int i2) {
            return new VEBeautyFilterParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEBeautyFilterParam createFromParcel(Parcel parcel) {
            return new VEBeautyFilterParam(parcel);
        }
    };
    public String beautyName;
    public int beautyType;
    public float brightenIntensity;
    public float sharpIntensity;
    public float skinToneIntensity;
    public String skinTonePath;
    public float smoothIntensity;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99467);
    }

    public VEBeautyFilterParam() {
        this.filterName = "beauty";
        this.filterType = 12;
        this.filterDurationType = 1;
        this.beautyName = "";
        this.beautyType = -1;
        this.skinTonePath = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEBeautyFilterParam{beautyName='" + this.beautyName + '\'' + ", beautyType=" + this.beautyType + ", brightenIntensity=" + this.brightenIntensity + ", smoothIntensity=" + this.smoothIntensity + ", sharpIntensity=" + this.sharpIntensity + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + ", skinTonePath='" + this.skinTonePath + '\'' + ", skinToneIntensity=" + this.skinToneIntensity + '}';
    }

    protected VEBeautyFilterParam(Parcel parcel) {
        super(parcel);
        this.beautyName = parcel.readString();
        this.beautyType = parcel.readInt();
        this.brightenIntensity = parcel.readFloat();
        this.smoothIntensity = parcel.readFloat();
        this.sharpIntensity = parcel.readFloat();
        this.skinTonePath = parcel.readString();
        this.skinToneIntensity = parcel.readFloat();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.beautyName);
        parcel.writeInt(this.beautyType);
        parcel.writeFloat(this.brightenIntensity);
        parcel.writeFloat(this.smoothIntensity);
        parcel.writeFloat(this.sharpIntensity);
        parcel.writeString(this.skinTonePath);
        parcel.writeFloat(this.skinToneIntensity);
    }
}

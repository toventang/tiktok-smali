package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VEColorFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEColorFilterParam> CREATOR = new Parcelable.Creator<VEColorFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEColorFilterParam.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99475);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEColorFilterParam[] newArray(int i2) {
            return new VEColorFilterParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEColorFilterParam createFromParcel(Parcel parcel) {
            return new VEColorFilterParam(parcel);
        }
    };
    public float intensity;
    public String leftFilterPath;
    public float position;
    public String rightFilterPath;
    public float rightIntensity;
    public boolean useFilterResIntensity;
    public boolean useFilterV3;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99474);
    }

    public VEColorFilterParam() {
        this.filterName = "color filter";
        this.filterType = 7;
        this.filterDurationType = 1;
        this.leftFilterPath = "";
        this.rightFilterPath = "";
        this.position = 1.0f;
        this.intensity = 1.0f;
        this.rightIntensity = 1.0f;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEColorFilterParam{leftFilterPath='" + this.leftFilterPath + '\'' + ", rightFilterPath='" + this.rightFilterPath + '\'' + ", position=" + this.position + ", intensity=" + this.intensity + ", rightIntensity=" + this.rightIntensity + ", useFilterResIntensity=" + this.useFilterResIntensity + ", useFilterV3=" + this.useFilterV3 + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEColorFilterParam(Parcel parcel) {
        super(parcel);
        boolean z;
        this.leftFilterPath = parcel.readString();
        this.rightFilterPath = parcel.readString();
        this.position = parcel.readFloat();
        this.intensity = parcel.readFloat();
        this.rightIntensity = parcel.readFloat();
        boolean z2 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useFilterResIntensity = z;
        this.useFilterV3 = parcel.readByte() == 0 ? false : z2;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.leftFilterPath);
        parcel.writeString(this.rightFilterPath);
        parcel.writeFloat(this.position);
        parcel.writeFloat(this.intensity);
        parcel.writeFloat(this.rightIntensity);
        parcel.writeByte(this.useFilterResIntensity ? (byte) 1 : 0);
        parcel.writeByte(this.useFilterV3 ? (byte) 1 : 0);
    }
}

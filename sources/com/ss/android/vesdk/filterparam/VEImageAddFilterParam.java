package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VEImageAddFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEImageAddFilterParam> CREATOR = new Parcelable.Creator<VEImageAddFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEImageAddFilterParam.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99486);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEImageAddFilterParam[] newArray(int i2) {
            return new VEImageAddFilterParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEImageAddFilterParam createFromParcel(Parcel parcel) {
            return new VEImageAddFilterParam(parcel);
        }
    };
    public float height;
    public String imagePath;
    public float width;
    public float x;
    public float y;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99485);
    }

    public VEImageAddFilterParam() {
        this.filterName = "image add filter";
        this.filterType = 21;
        this.imagePath = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEImageAddFilterParam{imagePath='" + this.imagePath + '\'' + ", x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEImageAddFilterParam(Parcel parcel) {
        super(parcel);
        this.imagePath = parcel.readString();
        this.x = parcel.readFloat();
        this.y = parcel.readFloat();
        this.width = parcel.readFloat();
        this.height = parcel.readFloat();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.imagePath);
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
        parcel.writeFloat(this.width);
        parcel.writeFloat(this.height);
    }
}

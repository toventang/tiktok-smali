package com.ss.android.vesdk;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VEBitmapWithInfo implements Parcelable {
    public static final Parcelable.Creator<VEBitmapWithInfo> CREATOR = new Parcelable.Creator<VEBitmapWithInfo>() {
        /* class com.ss.android.vesdk.VEBitmapWithInfo.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99104);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEBitmapWithInfo[] newArray(int i2) {
            return new VEBitmapWithInfo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEBitmapWithInfo createFromParcel(Parcel parcel) {
            return new VEBitmapWithInfo(parcel);
        }
    };
    public Bitmap bitmap;
    public int colorPrimary;
    public int colorSpace;
    public int colorTransfer;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99103);
    }

    public enum a {
        UNKNOWN,
        BT601,
        BT709,
        BT2020_PQ,
        BT2020_HLG;

        static {
            Covode.recordClassIndex(99105);
        }
    }

    public VEBitmapWithInfo(Bitmap bitmap2) {
        this.bitmap = bitmap2;
        this.colorSpace = a.UNKNOWN.ordinal();
        this.colorPrimary = a.UNKNOWN.ordinal();
        this.colorTransfer = a.UNKNOWN.ordinal();
    }

    protected VEBitmapWithInfo(Parcel parcel) {
        this.colorSpace = parcel.readInt();
        this.colorPrimary = parcel.readInt();
        this.colorTransfer = parcel.readInt();
        this.bitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.colorSpace);
        parcel.writeInt(this.colorPrimary);
        parcel.writeInt(this.colorTransfer);
        parcel.writeParcelable(this.bitmap, i2);
    }

    public void setColorInfo(int i2, int i3, int i4) {
        this.colorSpace = i2;
        this.colorPrimary = i3;
        this.colorTransfer = i4;
    }

    public VEBitmapWithInfo(Bitmap bitmap2, int i2, int i3, int i4) {
        this.bitmap = bitmap2;
        this.colorSpace = i2;
        this.colorPrimary = i3;
        this.colorTransfer = i4;
    }
}

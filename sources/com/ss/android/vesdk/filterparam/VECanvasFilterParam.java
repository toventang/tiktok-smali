package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VECanvasFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VECanvasFilterParam> CREATOR = new Parcelable.Creator<VECanvasFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VECanvasFilterParam.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99472);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VECanvasFilterParam[] newArray(int i2) {
            return new VECanvasFilterParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VECanvasFilterParam createFromParcel(Parcel parcel) {
            return new VECanvasFilterParam(parcel);
        }
    };
    public int color;
    public boolean enableAntialiasing;
    public int gradientBottomColor;
    public int gradientTopColor;
    public int height;
    public String imagePath;
    public int radius;
    public int sourceType;
    public int width;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99471);
    }

    public enum a {
        COLOR,
        VIDEOFRAME,
        IMAGE,
        GRADIENT_COLOR;

        static {
            Covode.recordClassIndex(99473);
        }
    }

    public VECanvasFilterParam() {
        this.filterName = "color_canvas";
        this.filterType = 15;
        this.filterDurationType = 1;
        this.sourceType = a.COLOR.ordinal();
        this.color = -16777216;
        this.radius = 0;
        this.imagePath = "";
        this.width = -1;
        this.height = -1;
        this.enableAntialiasing = false;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VECanvasFilterParam{sourceType=" + this.sourceType + ", color=" + this.color + ", radius=" + this.radius + ", imagePath='" + this.imagePath + '\'' + ", width=" + this.width + ", height=" + this.height + ", enableAntialiasing=" + this.enableAntialiasing + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VECanvasFilterParam(Parcel parcel) {
        super(parcel);
        boolean z;
        this.sourceType = parcel.readInt();
        this.color = parcel.readInt();
        this.radius = parcel.readInt();
        this.imagePath = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.enableAntialiasing = z;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.sourceType);
        parcel.writeInt(this.color);
        parcel.writeInt(this.radius);
        parcel.writeString(this.imagePath);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.enableAntialiasing ? 1 : 0);
    }
}

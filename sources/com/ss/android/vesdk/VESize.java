package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VESize implements Parcelable {
    public static final Parcelable.Creator<VESize> CREATOR = new Parcelable.Creator<VESize>() {
        /* class com.ss.android.vesdk.VESize.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99210);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VESize[] newArray(int i2) {
            return new VESize[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VESize createFromParcel(Parcel parcel) {
            return new VESize(parcel);
        }
    };
    public int height = 1280;
    public int width = 720;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99209);
    }

    public boolean isValid() {
        if (this.width <= 0 || this.height <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.width + "*" + this.height;
    }

    protected VESize(Parcel parcel) {
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (obj instanceof VESize) {
            VESize vESize = (VESize) obj;
            if (this.width == vESize.width && this.height == vESize.height) {
                return true;
            }
            return false;
        }
        return false;
    }

    public VESize(int i2, int i3) {
        this.width = i2;
        this.height = i3;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }
}

package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VEARCoreParam implements Parcelable {
    public static final Parcelable.Creator<VEARCoreParam> CREATOR = new Parcelable.Creator<VEARCoreParam>() {
        /* class com.ss.android.vesdk.VEARCoreParam.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99087);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEARCoreParam[] newArray(int i2) {
            return new VEARCoreParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEARCoreParam createFromParcel(Parcel parcel) {
            return new VEARCoreParam(parcel);
        }
    };
    private boolean enableARCore;

    public int describeContents() {
        return 0;
    }

    public VEARCoreParam() {
    }

    public boolean isEnableARCore() {
        return this.enableARCore;
    }

    static {
        Covode.recordClassIndex(99086);
    }

    public void setEnableARCore(boolean z) {
        this.enableARCore = z;
    }

    public VEARCoreParam(Parcel parcel) {
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.enableARCore = z;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.enableARCore ? (byte) 1 : 0);
    }
}

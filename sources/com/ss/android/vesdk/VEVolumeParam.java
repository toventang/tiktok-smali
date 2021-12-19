package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VEVolumeParam implements Parcelable {
    public static final Parcelable.Creator<VEVolumeParam> CREATOR = new Parcelable.Creator<VEVolumeParam>() {
        /* class com.ss.android.vesdk.VEVolumeParam.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99247);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEVolumeParam[] newArray(int i2) {
            return new VEVolumeParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEVolumeParam createFromParcel(Parcel parcel) {
            return new VEVolumeParam(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f150868a = -1;

    /* renamed from: b  reason: collision with root package name */
    public float f150869b = -1.0f;

    /* renamed from: c  reason: collision with root package name */
    public boolean f150870c;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99246);
    }

    public VEVolumeParam() {
    }

    protected VEVolumeParam(Parcel parcel) {
        boolean z;
        this.f150869b = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f150870c = z;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.f150869b);
        parcel.writeByte(this.f150870c ? (byte) 1 : 0);
    }
}

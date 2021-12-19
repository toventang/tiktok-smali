package com.ss.android.vesdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VEPrePlayParams implements Parcelable {
    public static final Parcelable.Creator<VEPrePlayParams> CREATOR = new Parcelable.Creator<VEPrePlayParams>() {
        /* class com.ss.android.vesdk.model.VEPrePlayParams.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99543);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEPrePlayParams[] newArray(int i2) {
            return new VEPrePlayParams[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEPrePlayParams createFromParcel(Parcel parcel) {
            return new VEPrePlayParams(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f151361a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f151362b;

    /* renamed from: c  reason: collision with root package name */
    public int f151363c;

    public int describeContents() {
        return 0;
    }

    public VEPrePlayParams() {
    }

    static {
        Covode.recordClassIndex(99542);
    }

    protected VEPrePlayParams(Parcel parcel) {
        boolean z;
        this.f151361a = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f151362b = z;
        this.f151363c = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f151361a);
        parcel.writeByte(this.f151362b ? (byte) 1 : 0);
        parcel.writeInt(this.f151363c);
    }
}

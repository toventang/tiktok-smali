package com.bytedance.android.live.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public final class RoomStatus implements Parcelable {
    public static final Parcelable.Creator<RoomStatus> CREATOR = new Parcelable.Creator<RoomStatus>() {
        /* class com.bytedance.android.live.base.model.RoomStatus.AnonymousClass1 */

        static {
            Covode.recordClassIndex(3579);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RoomStatus[] newArray(int i2) {
            return new RoomStatus[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RoomStatus createFromParcel(Parcel parcel) {
            return new RoomStatus(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public long f7369a;

    /* renamed from: b  reason: collision with root package name */
    public long f7370b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7371c;

    /* renamed from: d  reason: collision with root package name */
    public int f7372d;

    public final int describeContents() {
        return 0;
    }

    public RoomStatus() {
    }

    static {
        Covode.recordClassIndex(3578);
    }

    protected RoomStatus(Parcel parcel) {
        boolean z;
        this.f7369a = parcel.readLong();
        this.f7370b = parcel.readLong();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f7371c = z;
        this.f7372d = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f7369a);
        parcel.writeLong(this.f7370b);
        parcel.writeByte(this.f7371c ? (byte) 1 : 0);
        parcel.writeInt(this.f7372d);
    }
}

package com.ss.android.ttvecamera;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class TEFrameSizei implements Parcelable {
    public static final Parcelable.Creator<TEFrameSizei> CREATOR = new Parcelable.Creator<TEFrameSizei>() {
        /* class com.ss.android.ttvecamera.TEFrameSizei.AnonymousClass1 */

        static {
            Covode.recordClassIndex(37801);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TEFrameSizei[] newArray(int i2) {
            return new TEFrameSizei[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TEFrameSizei createFromParcel(Parcel parcel) {
            return new TEFrameSizei(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f61374a = 720;

    /* renamed from: b  reason: collision with root package name */
    public int f61375b = 1280;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(37800);
    }

    public TEFrameSizei() {
    }

    public final boolean a() {
        if (this.f61374a <= 0 || this.f61375b <= 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f61374a * 65537) + 1 + this.f61375b;
    }

    public String toString() {
        return this.f61374a + "x" + this.f61375b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TEFrameSizei)) {
            return false;
        }
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        if (this.f61374a == tEFrameSizei.f61374a && this.f61375b == tEFrameSizei.f61375b) {
            return true;
        }
        return false;
    }

    protected TEFrameSizei(Parcel parcel) {
        this.f61374a = parcel.readInt();
        this.f61375b = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f61374a);
        parcel.writeInt(this.f61375b);
    }

    public TEFrameSizei(int i2, int i3) {
        this.f61374a = i2;
        this.f61375b = i3;
    }
}

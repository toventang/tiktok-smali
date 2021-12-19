package com.ss.android.ttvecamera;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.List;

public class TEFrameRateRange implements Parcelable {
    public static final Parcelable.Creator<TEFrameRateRange> CREATOR = new Parcelable.Creator<TEFrameRateRange>() {
        /* class com.ss.android.ttvecamera.TEFrameRateRange.AnonymousClass1 */

        static {
            Covode.recordClassIndex(37799);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TEFrameRateRange[] newArray(int i2) {
            return new TEFrameRateRange[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TEFrameRateRange createFromParcel(Parcel parcel) {
            return new TEFrameRateRange(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f61371a;

    /* renamed from: b  reason: collision with root package name */
    public int f61372b;

    /* renamed from: c  reason: collision with root package name */
    public int f61373c = 1;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(37798);
    }

    public int hashCode() {
        return (this.f61371a * 65537) + 1 + this.f61372b;
    }

    public final int[] a() {
        int i2 = this.f61371a;
        int i3 = this.f61373c;
        return new int[]{i2 / i3, this.f61372b / i3};
    }

    public String toString() {
        return "[" + (this.f61371a / this.f61373c) + ", " + (this.f61372b / this.f61373c) + "]";
    }

    public static int a(List<int[]> list) {
        if (list.size() > 0 && list.get(0)[1] > 1000) {
            return 1000;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TEFrameRateRange)) {
            return false;
        }
        TEFrameRateRange tEFrameRateRange = (TEFrameRateRange) obj;
        if (this.f61371a == tEFrameRateRange.f61371a && this.f61372b == tEFrameRateRange.f61372b) {
            return true;
        }
        return false;
    }

    protected TEFrameRateRange(Parcel parcel) {
        this.f61371a = parcel.readInt();
        this.f61372b = parcel.readInt();
        this.f61373c = parcel.readInt();
    }

    public final int[] a(int i2) {
        int i3 = this.f61371a;
        int i4 = this.f61373c;
        return new int[]{(i3 / i4) * i2, (this.f61372b / i4) * i2};
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f61371a);
        parcel.writeInt(this.f61372b);
        parcel.writeInt(this.f61373c);
    }

    public TEFrameRateRange(int i2, int i3) {
        int i4 = 1;
        this.f61371a = i2;
        this.f61372b = i3;
        this.f61373c = i3 > 1000 ? 1000 : i4;
    }
}

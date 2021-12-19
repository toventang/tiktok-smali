package com.ss.android.ugc.asve.recorder;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ASMediaSegment implements Parcelable {
    public static final a CREATOR = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f62103a;

    /* renamed from: b  reason: collision with root package name */
    public final double f62104b;

    static {
        Covode.recordClassIndex(38167);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ASMediaSegment)) {
            return false;
        }
        ASMediaSegment aSMediaSegment = (ASMediaSegment) obj;
        return this.f62103a == aSMediaSegment.f62103a && Double.compare(this.f62104b, aSMediaSegment.f62104b) == 0;
    }

    public final int hashCode() {
        long j2 = this.f62103a;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.f62104b);
        return i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "ASMediaSegment(duration=" + this.f62103a + ", speed=" + this.f62104b + ")";
    }

    public static final class a implements Parcelable.Creator<ASMediaSegment> {
        static {
            Covode.recordClassIndex(38168);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ASMediaSegment[] newArray(int i2) {
            return new ASMediaSegment[i2];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ASMediaSegment createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new ASMediaSegment(parcel);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ASMediaSegment(Parcel parcel) {
        this(parcel.readLong(), parcel.readDouble());
        l.d(parcel, "");
    }

    public ASMediaSegment(long j2, double d2) {
        this.f62103a = j2;
        this.f62104b = d2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeLong(this.f62103a);
        parcel.writeDouble(this.f62104b);
    }
}

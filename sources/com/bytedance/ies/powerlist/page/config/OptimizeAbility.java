package com.bytedance.ies.powerlist.page.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class OptimizeAbility implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f34353a;

    /* renamed from: b  reason: collision with root package name */
    public final int f34354b;

    public static class a implements Parcelable.Creator {
        static {
            Covode.recordClassIndex(20527);
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            l.c(parcel, "");
            return new OptimizeAbility(parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i2) {
            return new OptimizeAbility[i2];
        }
    }

    static {
        Covode.recordClassIndex(20526);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptimizeAbility)) {
            return false;
        }
        OptimizeAbility optimizeAbility = (OptimizeAbility) obj;
        return this.f34353a == optimizeAbility.f34353a && this.f34354b == optimizeAbility.f34354b;
    }

    public final int hashCode() {
        boolean z = this.f34353a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return (i2 * 31) + this.f34354b;
    }

    public final String toString() {
        return "OptimizeAbility(enable=" + this.f34353a + ", preloadCount=" + this.f34354b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.c(parcel, "");
        parcel.writeInt(this.f34353a ? 1 : 0);
        parcel.writeInt(this.f34354b);
    }

    private /* synthetic */ OptimizeAbility() {
        this(false, 8);
    }

    public OptimizeAbility(boolean z, int i2) {
        this.f34353a = z;
        this.f34354b = i2;
    }
}

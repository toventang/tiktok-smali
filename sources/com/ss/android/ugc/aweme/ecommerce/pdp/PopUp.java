package com.ss.android.ugc.aweme.ecommerce.pdp;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class PopUp implements Parcelable {
    public static final Parcelable.Creator<PopUp> CREATOR = new a();
    @c(a = "schema")

    /* renamed from: a  reason: collision with root package name */
    public final String f86322a;
    @c(a = "fc_second")

    /* renamed from: b  reason: collision with root package name */
    public final long f86323b;

    static {
        Covode.recordClassIndex(54048);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopUp)) {
            return false;
        }
        PopUp popUp = (PopUp) obj;
        return l.a(this.f86322a, popUp.f86322a) && this.f86323b == popUp.f86323b;
    }

    public final int hashCode() {
        String str = this.f86322a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.f86323b;
        return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "PopUp(schema=" + this.f86322a + ", fcSecond=" + this.f86323b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f86322a);
        parcel.writeLong(this.f86323b);
    }

    public static class a implements Parcelable.Creator<PopUp> {
        static {
            Covode.recordClassIndex(54049);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PopUp[] newArray(int i2) {
            return new PopUp[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PopUp createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new PopUp(parcel.readString(), parcel.readLong());
        }
    }

    public PopUp(String str, long j2) {
        l.d(str, "");
        this.f86322a = str;
        this.f86323b = j2;
    }
}

package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class Specification implements Parcelable {
    public static final Parcelable.Creator<Specification> CREATOR = new a();
    @c(a = StringSet.name)

    /* renamed from: a  reason: collision with root package name */
    public final String f86667a;
    @c(a = "value")

    /* renamed from: b  reason: collision with root package name */
    public final String f86668b;

    static {
        Covode.recordClassIndex(54278);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Specification)) {
            return false;
        }
        Specification specification = (Specification) obj;
        return l.a(this.f86667a, specification.f86667a) && l.a(this.f86668b, specification.f86668b);
    }

    public final int hashCode() {
        String str = this.f86667a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f86668b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Specification(name=" + this.f86667a + ", value=" + this.f86668b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f86667a);
        parcel.writeString(this.f86668b);
    }

    public static class a implements Parcelable.Creator<Specification> {
        static {
            Covode.recordClassIndex(54279);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Specification[] newArray(int i2) {
            return new Specification[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Specification createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new Specification(parcel.readString(), parcel.readString());
        }
    }

    public Specification(String str, String str2) {
        l.d(str2, "");
        this.f86667a = str;
        this.f86668b = str2;
    }
}

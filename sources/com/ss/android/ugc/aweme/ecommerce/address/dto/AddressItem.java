package com.ss.android.ugc.aweme.ecommerce.address.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class AddressItem implements Parcelable {
    public static final Parcelable.Creator<AddressItem> CREATOR = new a();
    @c(a = "key")

    /* renamed from: a  reason: collision with root package name */
    public final String f84305a;
    @c(a = "value")

    /* renamed from: b  reason: collision with root package name */
    public final String f84306b;

    static {
        Covode.recordClassIndex(52566);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressItem)) {
            return false;
        }
        AddressItem addressItem = (AddressItem) obj;
        return l.a(this.f84305a, addressItem.f84305a) && l.a(this.f84306b, addressItem.f84306b);
    }

    public final int hashCode() {
        String str = this.f84305a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f84306b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AddressItem(key=" + this.f84305a + ", value=" + this.f84306b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f84305a);
        parcel.writeString(this.f84306b);
    }

    public static class a implements Parcelable.Creator<AddressItem> {
        static {
            Covode.recordClassIndex(52567);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AddressItem[] newArray(int i2) {
            return new AddressItem[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AddressItem createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new AddressItem(parcel.readString(), parcel.readString());
        }
    }

    public AddressItem(String str, String str2) {
        this.f84305a = str;
        this.f84306b = str2;
    }
}

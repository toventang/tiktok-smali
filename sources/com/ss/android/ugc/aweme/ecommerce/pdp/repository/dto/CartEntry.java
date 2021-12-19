package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class CartEntry implements Parcelable {
    public static final Parcelable.Creator<CartEntry> CREATOR = new a();
    @c(a = "link")

    /* renamed from: a  reason: collision with root package name */
    public final String f86599a;
    @c(a = "item_count")

    /* renamed from: b  reason: collision with root package name */
    public final Integer f86600b;

    static {
        Covode.recordClassIndex(54250);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartEntry)) {
            return false;
        }
        CartEntry cartEntry = (CartEntry) obj;
        return l.a(this.f86599a, cartEntry.f86599a) && l.a(this.f86600b, cartEntry.f86600b);
    }

    public final int hashCode() {
        String str = this.f86599a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f86600b;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "CartEntry(link=" + this.f86599a + ", itemCount=" + this.f86600b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3;
        l.d(parcel, "");
        parcel.writeString(this.f86599a);
        Integer num = this.f86600b;
        if (num != null) {
            parcel.writeInt(1);
            i3 = num.intValue();
        } else {
            i3 = 0;
        }
        parcel.writeInt(i3);
    }

    public static class a implements Parcelable.Creator<CartEntry> {
        static {
            Covode.recordClassIndex(54251);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CartEntry[] newArray(int i2) {
            return new CartEntry[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CartEntry createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new CartEntry(parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }
    }

    public CartEntry(String str, Integer num) {
        this.f86599a = str;
        this.f86600b = num;
    }
}

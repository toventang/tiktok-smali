package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class AdditionalInfoItem implements Parcelable {
    public static final Parcelable.Creator<AdditionalInfoItem> CREATOR = new a();
    @c(a = "key")

    /* renamed from: a  reason: collision with root package name */
    public final String f86597a;
    @c(a = "value")

    /* renamed from: b  reason: collision with root package name */
    public final String f86598b;

    static {
        Covode.recordClassIndex(54248);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalInfoItem)) {
            return false;
        }
        AdditionalInfoItem additionalInfoItem = (AdditionalInfoItem) obj;
        return l.a(this.f86597a, additionalInfoItem.f86597a) && l.a(this.f86598b, additionalInfoItem.f86598b);
    }

    public final int hashCode() {
        String str = this.f86597a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f86598b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AdditionalInfoItem(key=" + this.f86597a + ", values=" + this.f86598b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f86597a);
        parcel.writeString(this.f86598b);
    }

    public static class a implements Parcelable.Creator<AdditionalInfoItem> {
        static {
            Covode.recordClassIndex(54249);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AdditionalInfoItem[] newArray(int i2) {
            return new AdditionalInfoItem[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AdditionalInfoItem createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new AdditionalInfoItem(parcel.readString(), parcel.readString());
        }
    }

    public AdditionalInfoItem(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f86597a = str;
        this.f86598b = str2;
    }
}

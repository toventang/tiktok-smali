package com.ss.android.ugc.aweme.ecommerce.sku.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class SkuSaleProp implements Parcelable {
    public static final Parcelable.Creator<SkuSaleProp> CREATOR = new a();
    @c(a = "prop_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f87417a;
    @c(a = "prop_value_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f87418b;

    static {
        Covode.recordClassIndex(54909);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuSaleProp)) {
            return false;
        }
        SkuSaleProp skuSaleProp = (SkuSaleProp) obj;
        return l.a(this.f87417a, skuSaleProp.f87417a) && l.a(this.f87418b, skuSaleProp.f87418b);
    }

    public final int hashCode() {
        String str = this.f87417a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f87418b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SkuSaleProp(propId=" + this.f87417a + ", propValueId=" + this.f87418b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f87417a);
        parcel.writeString(this.f87418b);
    }

    public static class a implements Parcelable.Creator<SkuSaleProp> {
        static {
            Covode.recordClassIndex(54910);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SkuSaleProp[] newArray(int i2) {
            return new SkuSaleProp[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SkuSaleProp createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new SkuSaleProp(parcel.readString(), parcel.readString());
        }
    }

    public SkuSaleProp(String str, String str2) {
        this.f87417a = str;
        this.f87418b = str2;
    }
}

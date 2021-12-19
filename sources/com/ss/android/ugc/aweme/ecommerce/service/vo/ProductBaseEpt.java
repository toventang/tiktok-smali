package com.ss.android.ugc.aweme.ecommerce.service.vo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class ProductBaseEpt implements Parcelable {
    public static final Parcelable.Creator<ProductBaseEpt> CREATOR = new a();
    @c(a = "title")

    /* renamed from: a  reason: collision with root package name */
    public final String f87352a;
    @c(a = "desc_detail")

    /* renamed from: b  reason: collision with root package name */
    public final String f87353b;
    @c(a = "sold_count")

    /* renamed from: c  reason: collision with root package name */
    public final String f87354c;
    @c(a = "price")

    /* renamed from: d  reason: collision with root package name */
    public final ProductPriceEpt f87355d;

    static {
        Covode.recordClassIndex(54836);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductBaseEpt)) {
            return false;
        }
        ProductBaseEpt productBaseEpt = (ProductBaseEpt) obj;
        return l.a(this.f87352a, productBaseEpt.f87352a) && l.a(this.f87353b, productBaseEpt.f87353b) && l.a(this.f87354c, productBaseEpt.f87354c) && l.a(this.f87355d, productBaseEpt.f87355d);
    }

    public final int hashCode() {
        String str = this.f87352a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f87353b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f87354c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        ProductPriceEpt productPriceEpt = this.f87355d;
        if (productPriceEpt != null) {
            i2 = productPriceEpt.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "ProductBaseEpt(title=" + this.f87352a + ", details=" + this.f87353b + ", sales=" + this.f87354c + ", priceInfo=" + this.f87355d + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f87352a);
        parcel.writeString(this.f87353b);
        parcel.writeString(this.f87354c);
        ProductPriceEpt productPriceEpt = this.f87355d;
        if (productPriceEpt != null) {
            parcel.writeInt(1);
            productPriceEpt.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static class a implements Parcelable.Creator<ProductBaseEpt> {
        static {
            Covode.recordClassIndex(54837);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ProductBaseEpt[] newArray(int i2) {
            return new ProductBaseEpt[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ProductBaseEpt createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new ProductBaseEpt(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? ProductPriceEpt.CREATOR.createFromParcel(parcel) : null);
        }
    }

    public ProductBaseEpt(String str, String str2, String str3, ProductPriceEpt productPriceEpt) {
        this.f87352a = str;
        this.f87353b = str2;
        this.f87354c = str3;
        this.f87355d = productPriceEpt;
    }
}

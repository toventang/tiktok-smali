package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.service.vo.ProductPriceEpt;
import h.f.b.l;

public final class ProductPrice implements Parcelable {
    public static final Parcelable.Creator<ProductPrice> CREATOR = new a();
    @c(a = "original_price")

    /* renamed from: a  reason: collision with root package name */
    public final String f86650a;
    @c(a = "real_price")

    /* renamed from: b  reason: collision with root package name */
    public final String f86651b;
    @c(a = "discount")

    /* renamed from: c  reason: collision with root package name */
    public final String f86652c;
    @c(a = "need_icon")

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f86653d;
    @c(a = "is_interval_price")

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f86654e;

    static {
        Covode.recordClassIndex(54270);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPrice)) {
            return false;
        }
        ProductPrice productPrice = (ProductPrice) obj;
        return l.a(this.f86650a, productPrice.f86650a) && l.a(this.f86651b, productPrice.f86651b) && l.a(this.f86652c, productPrice.f86652c) && l.a(this.f86653d, productPrice.f86653d) && l.a(this.f86654e, productPrice.f86654e);
    }

    public final int hashCode() {
        String str = this.f86650a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f86651b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f86652c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool = this.f86653d;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f86654e;
        if (bool2 != null) {
            i2 = bool2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "ProductPrice(originPrice=" + this.f86650a + ", realPrice=" + this.f86651b + ", discount=" + this.f86652c + ", needIcon=" + this.f86653d + ", isIntervalPrice=" + this.f86654e + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f86650a);
        parcel.writeString(this.f86651b);
        parcel.writeString(this.f86652c);
        Boolean bool = this.f86653d;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        Boolean bool2 = this.f86654e;
        if (bool2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static class a implements Parcelable.Creator<ProductPrice> {
        static {
            Covode.recordClassIndex(54271);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ProductPrice[] newArray(int i2) {
            return new ProductPrice[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ProductPrice createFromParcel(Parcel parcel) {
            Boolean bool;
            l.d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z = true;
            Boolean bool2 = null;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool2 = Boolean.valueOf(z);
            }
            return new ProductPrice(readString, readString2, readString3, bool, bool2);
        }
    }

    public final ProductPriceEpt a() {
        return new ProductPriceEpt(this.f86650a, this.f86651b, this.f86652c, this.f86653d);
    }

    public ProductPrice(String str, String str2, String str3, Boolean bool, Boolean bool2) {
        this.f86650a = str;
        this.f86651b = str2;
        this.f86652c = str3;
        this.f86653d = bool;
        this.f86654e = bool2;
    }
}

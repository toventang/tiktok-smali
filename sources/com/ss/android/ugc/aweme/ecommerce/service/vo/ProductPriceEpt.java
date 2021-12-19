package com.ss.android.ugc.aweme.ecommerce.service.vo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class ProductPriceEpt implements Parcelable {
    public static final Parcelable.Creator<ProductPriceEpt> CREATOR = new a();
    @c(a = "original_price")

    /* renamed from: a  reason: collision with root package name */
    public final String f87356a;
    @c(a = "real_price")

    /* renamed from: b  reason: collision with root package name */
    public final String f87357b;
    @c(a = "discount")

    /* renamed from: c  reason: collision with root package name */
    public final String f87358c;
    @c(a = "need_icon")

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f87359d;

    static {
        Covode.recordClassIndex(54838);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPriceEpt)) {
            return false;
        }
        ProductPriceEpt productPriceEpt = (ProductPriceEpt) obj;
        return l.a(this.f87356a, productPriceEpt.f87356a) && l.a(this.f87357b, productPriceEpt.f87357b) && l.a(this.f87358c, productPriceEpt.f87358c) && l.a(this.f87359d, productPriceEpt.f87359d);
    }

    public final int hashCode() {
        String str = this.f87356a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f87357b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f87358c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool = this.f87359d;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "ProductPriceEpt(originPrice=" + this.f87356a + ", realPrice=" + this.f87357b + ", discount=" + this.f87358c + ", needIcon=" + this.f87359d + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        boolean z;
        l.d(parcel, "");
        parcel.writeString(this.f87356a);
        parcel.writeString(this.f87357b);
        parcel.writeString(this.f87358c);
        Boolean bool = this.f87359d;
        if (bool != null) {
            parcel.writeInt(1);
            z = bool.booleanValue();
        } else {
            z = false;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        parcel.writeInt(i3);
    }

    public static class a implements Parcelable.Creator<ProductPriceEpt> {
        static {
            Covode.recordClassIndex(54839);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ProductPriceEpt[] newArray(int i2) {
            return new ProductPriceEpt[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ProductPriceEpt createFromParcel(Parcel parcel) {
            Boolean bool;
            l.d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            return new ProductPriceEpt(readString, readString2, readString3, bool);
        }
    }

    public ProductPriceEpt(String str, String str2, String str3, Boolean bool) {
        this.f87356a = str;
        this.f87357b = str2;
        this.f87358c = str3;
        this.f87359d = bool;
    }
}

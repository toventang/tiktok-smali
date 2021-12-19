package com.ss.android.ugc.aweme.ecommerce.sku.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class SkuPrice implements Parcelable, Serializable {
    public static final Parcelable.Creator<SkuPrice> CREATOR = new a();
    @c(a = "discount")
    private final String discount;
    @c(a = "original_price")
    private final String originalPrice;
    @c(a = "real_price")
    private final Price realPrice;

    static {
        Covode.recordClassIndex(54907);
    }

    public SkuPrice() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ SkuPrice copy$default(SkuPrice skuPrice, Price price, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            price = skuPrice.realPrice;
        }
        if ((i2 & 2) != 0) {
            str = skuPrice.originalPrice;
        }
        if ((i2 & 4) != 0) {
            str2 = skuPrice.discount;
        }
        return skuPrice.copy(price, str, str2);
    }

    public final Price component1() {
        return this.realPrice;
    }

    public final String component2() {
        return this.originalPrice;
    }

    public final String component3() {
        return this.discount;
    }

    public final SkuPrice copy(Price price, String str, String str2) {
        return new SkuPrice(price, str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuPrice)) {
            return false;
        }
        SkuPrice skuPrice = (SkuPrice) obj;
        return l.a(this.realPrice, skuPrice.realPrice) && l.a(this.originalPrice, skuPrice.originalPrice) && l.a(this.discount, skuPrice.discount);
    }

    public final int hashCode() {
        Price price = this.realPrice;
        int i2 = 0;
        int hashCode = (price != null ? price.hashCode() : 0) * 31;
        String str = this.originalPrice;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.discount;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "SkuPrice(realPrice=" + this.realPrice + ", originalPrice=" + this.originalPrice + ", discount=" + this.discount + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        Price price = this.realPrice;
        if (price != null) {
            parcel.writeInt(1);
            price.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.originalPrice);
        parcel.writeString(this.discount);
    }

    public final String getDiscount() {
        return this.discount;
    }

    public final String getOriginalPrice() {
        return this.originalPrice;
    }

    public final Price getRealPrice() {
        return this.realPrice;
    }

    public static class a implements Parcelable.Creator<SkuPrice> {
        static {
            Covode.recordClassIndex(54908);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SkuPrice[] newArray(int i2) {
            return new SkuPrice[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SkuPrice createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new SkuPrice(parcel.readInt() != 0 ? Price.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }
    }

    public final SkuPrice merge(SkuPrice skuPrice) {
        if (skuPrice == null) {
            return this;
        }
        String str = skuPrice.originalPrice;
        if (str == null) {
            str = this.originalPrice;
        }
        Price price = skuPrice.realPrice;
        if (price == null) {
            price = this.realPrice;
        }
        String str2 = skuPrice.discount;
        if (str2 == null) {
            str2 = this.discount;
        }
        return new SkuPrice(price, str, str2);
    }

    public SkuPrice(Price price, String str, String str2) {
        this.realPrice = price;
        this.originalPrice = str;
        this.discount = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SkuPrice(Price price, String str, String str2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : price, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2);
    }
}

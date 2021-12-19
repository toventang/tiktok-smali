package com.ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class Price implements Parcelable, Serializable {
    public static final Parcelable.Creator<Price> CREATOR = new a();
    @c(a = "currency")
    private final String currency;
    @c(a = "price_str")
    private final String priceStr;
    @c(a = "price_text_color")
    private final Integer priceTextColor;
    @c(a = "price_val")
    private final String priceVal;
    @c(a = "promotions")
    private final List<Promotion> promotions;

    static {
        Covode.recordClassIndex(52844);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.api.model.Price */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Price copy$default(Price price, String str, String str2, String str3, List list, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = price.priceStr;
        }
        if ((i2 & 2) != 0) {
            str2 = price.priceVal;
        }
        if ((i2 & 4) != 0) {
            str3 = price.currency;
        }
        if ((i2 & 8) != 0) {
            list = price.promotions;
        }
        if ((i2 & 16) != 0) {
            num = price.priceTextColor;
        }
        return price.copy(str, str2, str3, list, num);
    }

    public final String component1() {
        return this.priceStr;
    }

    public final String component2() {
        return this.priceVal;
    }

    public final String component3() {
        return this.currency;
    }

    public final List<Promotion> component4() {
        return this.promotions;
    }

    public final Integer component5() {
        return this.priceTextColor;
    }

    public final Price copy(String str, String str2, String str3, List<Promotion> list, Integer num) {
        return new Price(str, str2, str3, list, num);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price price = (Price) obj;
        return l.a(this.priceStr, price.priceStr) && l.a(this.priceVal, price.priceVal) && l.a(this.currency, price.currency) && l.a(this.promotions, price.promotions) && l.a(this.priceTextColor, price.priceTextColor);
    }

    public final int hashCode() {
        String str = this.priceStr;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.priceVal;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.currency;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<Promotion> list = this.promotions;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.priceTextColor;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "Price(priceStr=" + this.priceStr + ", priceVal=" + this.priceVal + ", currency=" + this.currency + ", promotions=" + this.promotions + ", priceTextColor=" + this.priceTextColor + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.priceStr);
        parcel.writeString(this.priceVal);
        parcel.writeString(this.currency);
        List<Promotion> list = this.promotions;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Promotion promotion : list) {
                promotion.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        Integer num = this.priceTextColor;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
            return;
        }
        parcel.writeInt(0);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getPriceStr() {
        return this.priceStr;
    }

    public final Integer getPriceTextColor() {
        return this.priceTextColor;
    }

    public final String getPriceVal() {
        return this.priceVal;
    }

    public final List<Promotion> getPromotions() {
        return this.promotions;
    }

    public static class a implements Parcelable.Creator<Price> {
        static {
            Covode.recordClassIndex(52845);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Price[] newArray(int i2) {
            return new Price[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Price createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            l.d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Integer num = null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(Promotion.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new Price(readString, readString2, readString3, arrayList, num);
        }
    }

    public Price(String str, String str2, String str3, List<Promotion> list, Integer num) {
        this.priceStr = str;
        this.priceVal = str2;
        this.currency = str3;
        this.promotions = list;
        this.priceTextColor = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Price(String str, String str2, String str3, List list, Integer num, int i2, g gVar) {
        this(str, str2, str3, list, (i2 & 16) != 0 ? 0 : num);
    }
}

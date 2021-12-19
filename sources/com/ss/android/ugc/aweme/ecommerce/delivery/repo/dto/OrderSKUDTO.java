package com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class OrderSKUDTO implements Parcelable {
    public static final Parcelable.Creator<OrderSKUDTO> CREATOR = new a();
    @c(a = "product_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f85906a;
    @c(a = "sku_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f85907b;
    @c(a = "quantity")

    /* renamed from: c  reason: collision with root package name */
    public final Integer f85908c;
    @c(a = "cart_item_id")

    /* renamed from: d  reason: collision with root package name */
    public final String f85909d;
    @c(a = "source")

    /* renamed from: e  reason: collision with root package name */
    public final Integer f85910e;
    @c(a = "source_info")

    /* renamed from: f  reason: collision with root package name */
    public final String f85911f;
    @c(a = "entrance_info")

    /* renamed from: g  reason: collision with root package name */
    public final String f85912g;
    @c(a = "chain_key")

    /* renamed from: h  reason: collision with root package name */
    public final String f85913h;
    @c(a = "kol_id")

    /* renamed from: i  reason: collision with root package name */
    public String f85914i;

    static {
        Covode.recordClassIndex(53785);
    }

    public static /* synthetic */ OrderSKUDTO a(OrderSKUDTO orderSKUDTO, String str, String str2, Integer num, String str3, Integer num2, String str4, String str5, String str6, String str7, int i2) {
        String str8 = str7;
        String str9 = str6;
        String str10 = str5;
        String str11 = str4;
        Integer num3 = num2;
        String str12 = str;
        String str13 = str2;
        Integer num4 = num;
        String str14 = str3;
        if ((i2 & 1) != 0) {
            str12 = orderSKUDTO.f85906a;
        }
        if ((i2 & 2) != 0) {
            str13 = orderSKUDTO.f85907b;
        }
        if ((i2 & 4) != 0) {
            num4 = orderSKUDTO.f85908c;
        }
        if ((i2 & 8) != 0) {
            str14 = orderSKUDTO.f85909d;
        }
        if ((i2 & 16) != 0) {
            num3 = orderSKUDTO.f85910e;
        }
        if ((i2 & 32) != 0) {
            str11 = orderSKUDTO.f85911f;
        }
        if ((i2 & 64) != 0) {
            str10 = orderSKUDTO.f85912g;
        }
        if ((i2 & 128) != 0) {
            str9 = orderSKUDTO.f85913h;
        }
        if ((i2 & 256) != 0) {
            str8 = orderSKUDTO.f85914i;
        }
        return a(str12, str13, num4, str14, num3, str11, str10, str9, str8);
    }

    private static OrderSKUDTO a(String str, String str2, Integer num, String str3, Integer num2, String str4, String str5, String str6, String str7) {
        return new OrderSKUDTO(str, str2, num, str3, num2, str4, str5, str6, str7);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderSKUDTO)) {
            return false;
        }
        OrderSKUDTO orderSKUDTO = (OrderSKUDTO) obj;
        return l.a(this.f85906a, orderSKUDTO.f85906a) && l.a(this.f85907b, orderSKUDTO.f85907b) && l.a(this.f85908c, orderSKUDTO.f85908c) && l.a(this.f85909d, orderSKUDTO.f85909d) && l.a(this.f85910e, orderSKUDTO.f85910e) && l.a(this.f85911f, orderSKUDTO.f85911f) && l.a(this.f85912g, orderSKUDTO.f85912g) && l.a(this.f85913h, orderSKUDTO.f85913h) && l.a(this.f85914i, orderSKUDTO.f85914i);
    }

    public final int hashCode() {
        String str = this.f85906a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f85907b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f85908c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.f85909d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num2 = this.f85910e;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str4 = this.f85911f;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f85912g;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f85913h;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f85914i;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "OrderSKUDTO(productId=" + this.f85906a + ", skuId=" + this.f85907b + ", quantity=" + this.f85908c + ", cartItemId=" + this.f85909d + ", source=" + this.f85910e + ", sourceInfo=" + this.f85911f + ", entranceInfo=" + this.f85912g + ", chainKey=" + this.f85913h + ", kolId=" + this.f85914i + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f85906a);
        parcel.writeString(this.f85907b);
        Integer num = this.f85908c;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f85909d);
        Integer num2 = this.f85910e;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f85911f);
        parcel.writeString(this.f85912g);
        parcel.writeString(this.f85913h);
        parcel.writeString(this.f85914i);
    }

    public static class a implements Parcelable.Creator<OrderSKUDTO> {
        static {
            Covode.recordClassIndex(53786);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OrderSKUDTO[] newArray(int i2) {
            return new OrderSKUDTO[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OrderSKUDTO createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer num = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new OrderSKUDTO(readString, readString2, valueOf, readString3, num, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public OrderSKUDTO(String str, String str2, Integer num, String str3, Integer num2, String str4, String str5, String str6, String str7) {
        this.f85906a = str;
        this.f85907b = str2;
        this.f85908c = num;
        this.f85909d = str3;
        this.f85910e = num2;
        this.f85911f = str4;
        this.f85912g = str5;
        this.f85913h = str6;
        this.f85914i = str7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderSKUDTO(String str, String str2, Integer num, String str3, Integer num2, String str4, String str5, String str6, String str7, int i2) {
        this(str, str2, num, (i2 & 8) != 0 ? null : str3, num2, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : str6, (i2 & 256) == 0 ? str7 : null);
    }
}

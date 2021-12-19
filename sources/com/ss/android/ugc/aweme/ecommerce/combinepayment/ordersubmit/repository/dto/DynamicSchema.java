package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class DynamicSchema implements Parcelable, Serializable {
    public static final Parcelable.Creator<DynamicSchema> CREATOR = new a();
    @c(a = "address_edit_schema")
    private final String addressEditSchema;
    @c(a = "address_list_schema")
    private final String addressListSchema;
    @c(a = "buy_now_schema")
    private final String buyNowSchema;

    static {
        Covode.recordClassIndex(53110);
    }

    public static /* synthetic */ DynamicSchema copy$default(DynamicSchema dynamicSchema, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dynamicSchema.buyNowSchema;
        }
        if ((i2 & 2) != 0) {
            str2 = dynamicSchema.addressListSchema;
        }
        if ((i2 & 4) != 0) {
            str3 = dynamicSchema.addressEditSchema;
        }
        return dynamicSchema.copy(str, str2, str3);
    }

    public final String component1() {
        return this.buyNowSchema;
    }

    public final String component2() {
        return this.addressListSchema;
    }

    public final String component3() {
        return this.addressEditSchema;
    }

    public final DynamicSchema copy(String str, String str2, String str3) {
        return new DynamicSchema(str, str2, str3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicSchema)) {
            return false;
        }
        DynamicSchema dynamicSchema = (DynamicSchema) obj;
        return l.a(this.buyNowSchema, dynamicSchema.buyNowSchema) && l.a(this.addressListSchema, dynamicSchema.addressListSchema) && l.a(this.addressEditSchema, dynamicSchema.addressEditSchema);
    }

    public final int hashCode() {
        String str = this.buyNowSchema;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.addressListSchema;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.addressEditSchema;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "DynamicSchema(buyNowSchema=" + this.buyNowSchema + ", addressListSchema=" + this.addressListSchema + ", addressEditSchema=" + this.addressEditSchema + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.buyNowSchema);
        parcel.writeString(this.addressListSchema);
        parcel.writeString(this.addressEditSchema);
    }

    public final String getAddressEditSchema() {
        return this.addressEditSchema;
    }

    public final String getAddressListSchema() {
        return this.addressListSchema;
    }

    public final String getBuyNowSchema() {
        return this.buyNowSchema;
    }

    public static class a implements Parcelable.Creator<DynamicSchema> {
        static {
            Covode.recordClassIndex(53111);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DynamicSchema[] newArray(int i2) {
            return new DynamicSchema[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DynamicSchema createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new DynamicSchema(parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public final DynamicSchema merge(DynamicSchema dynamicSchema) {
        if (dynamicSchema == null) {
            return this;
        }
        String str = dynamicSchema.buyNowSchema;
        if (str == null) {
            str = this.buyNowSchema;
        }
        String str2 = dynamicSchema.addressListSchema;
        if (str2 == null) {
            str2 = this.addressListSchema;
        }
        String str3 = dynamicSchema.addressEditSchema;
        if (str3 == null) {
            str3 = this.addressEditSchema;
        }
        return new DynamicSchema(str, str2, str3);
    }

    public DynamicSchema(String str, String str2, String str3) {
        this.buyNowSchema = str;
        this.addressListSchema = str2;
        this.addressEditSchema = str3;
    }
}

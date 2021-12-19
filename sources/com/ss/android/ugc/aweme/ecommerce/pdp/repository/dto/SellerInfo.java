package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import h.f.b.l;

public final class SellerInfo implements Parcelable {
    public static final Parcelable.Creator<SellerInfo> CREATOR = new a();
    @c(a = "seller_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f86657a;
    @c(a = StringSet.name)

    /* renamed from: b  reason: collision with root package name */
    public final String f86658b;
    @c(a = "avatar")

    /* renamed from: c  reason: collision with root package name */
    public final Image f86659c;
    @c(a = "product_count")

    /* renamed from: d  reason: collision with root package name */
    public final Long f86660d;
    @c(a = "rating")

    /* renamed from: e  reason: collision with root package name */
    public final String f86661e;
    @c(a = "link")

    /* renamed from: f  reason: collision with root package name */
    public final String f86662f;
    @c(a = "im_schema")

    /* renamed from: g  reason: collision with root package name */
    public final String f86663g;

    static {
        Covode.recordClassIndex(54274);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerInfo)) {
            return false;
        }
        SellerInfo sellerInfo = (SellerInfo) obj;
        return l.a(this.f86657a, sellerInfo.f86657a) && l.a(this.f86658b, sellerInfo.f86658b) && l.a(this.f86659c, sellerInfo.f86659c) && l.a(this.f86660d, sellerInfo.f86660d) && l.a(this.f86661e, sellerInfo.f86661e) && l.a(this.f86662f, sellerInfo.f86662f) && l.a(this.f86663g, sellerInfo.f86663g);
    }

    public final int hashCode() {
        String str = this.f86657a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f86658b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Image image = this.f86659c;
        int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 31;
        Long l2 = this.f86660d;
        int hashCode4 = (hashCode3 + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str3 = this.f86661e;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f86662f;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f86663g;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "SellerInfo(sellerId=" + this.f86657a + ", name=" + this.f86658b + ", avatar=" + this.f86659c + ", productCount=" + this.f86660d + ", rating=" + this.f86661e + ", link=" + this.f86662f + ", imSchema=" + this.f86663g + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f86657a);
        parcel.writeString(this.f86658b);
        Image image = this.f86659c;
        if (image != null) {
            parcel.writeInt(1);
            image.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Long l2 = this.f86660d;
        if (l2 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f86661e);
        parcel.writeString(this.f86662f);
        parcel.writeString(this.f86663g);
    }

    public static class a implements Parcelable.Creator<SellerInfo> {
        static {
            Covode.recordClassIndex(54275);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SellerInfo[] newArray(int i2) {
            return new SellerInfo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SellerInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Long l2 = null;
            Image createFromParcel = parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                l2 = Long.valueOf(parcel.readLong());
            }
            return new SellerInfo(readString, readString2, createFromParcel, l2, parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public final SellerInfo a(SellerInfo sellerInfo) {
        if (sellerInfo == null) {
            return this;
        }
        String str = sellerInfo.f86657a;
        if (str == null) {
            str = this.f86657a;
        }
        String str2 = sellerInfo.f86658b;
        if (str2 == null) {
            str2 = this.f86658b;
        }
        Image image = sellerInfo.f86659c;
        if (image == null) {
            image = this.f86659c;
        }
        Long l2 = sellerInfo.f86660d;
        if (l2 == null) {
            l2 = this.f86660d;
        }
        String str3 = sellerInfo.f86661e;
        if (str3 == null) {
            str3 = this.f86661e;
        }
        String str4 = sellerInfo.f86662f;
        if (str4 == null) {
            str4 = this.f86662f;
        }
        String str5 = sellerInfo.f86663g;
        if (str5 == null) {
            str5 = this.f86663g;
        }
        return new SellerInfo(str, str2, image, l2, str3, str4, str5);
    }

    public SellerInfo(String str, String str2, Image image, Long l2, String str3, String str4, String str5) {
        this.f86657a = str;
        this.f86658b = str2;
        this.f86659c = image;
        this.f86660d = l2;
        this.f86661e = str3;
        this.f86662f = str4;
        this.f86663g = str5;
    }
}

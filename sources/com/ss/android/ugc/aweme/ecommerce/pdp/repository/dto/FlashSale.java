package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import h.f.b.l;

public final class FlashSale implements Parcelable {
    public static final Parcelable.Creator<FlashSale> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    public static final b f86605j = new b((byte) 0);
    @c(a = "activity_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f86606a;
    @c(a = "status")

    /* renamed from: b  reason: collision with root package name */
    public final Integer f86607b;
    @c(a = "countdown")

    /* renamed from: c  reason: collision with root package name */
    public final String f86608c;
    @c(a = "start_time")

    /* renamed from: d  reason: collision with root package name */
    public final String f86609d;
    @c(a = "end_time")

    /* renamed from: e  reason: collision with root package name */
    public final String f86610e;
    @c(a = "title")

    /* renamed from: f  reason: collision with root package name */
    public final String f86611f;
    @c(a = "price")

    /* renamed from: g  reason: collision with root package name */
    public final String f86612g;
    @c(a = "bg_img")

    /* renamed from: h  reason: collision with root package name */
    public final Image f86613h;
    @c(a = "countdown_bg_img")

    /* renamed from: i  reason: collision with root package name */
    public final Image f86614i;

    static {
        Covode.recordClassIndex(54254);
    }

    /* access modifiers changed from: private */
    public static FlashSale a(String str, Integer num, String str2, String str3, String str4, String str5, String str6, Image image, Image image2) {
        return new FlashSale(str, num, str2, str3, str4, str5, str6, image, image2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlashSale)) {
            return false;
        }
        FlashSale flashSale = (FlashSale) obj;
        return l.a(this.f86606a, flashSale.f86606a) && l.a(this.f86607b, flashSale.f86607b) && l.a(this.f86608c, flashSale.f86608c) && l.a(this.f86609d, flashSale.f86609d) && l.a(this.f86610e, flashSale.f86610e) && l.a(this.f86611f, flashSale.f86611f) && l.a(this.f86612g, flashSale.f86612g) && l.a(this.f86613h, flashSale.f86613h) && l.a(this.f86614i, flashSale.f86614i);
    }

    public final int hashCode() {
        String str = this.f86606a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f86607b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f86608c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f86609d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f86610e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f86611f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f86612g;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Image image = this.f86613h;
        int hashCode8 = (hashCode7 + (image != null ? image.hashCode() : 0)) * 31;
        Image image2 = this.f86614i;
        if (image2 != null) {
            i2 = image2.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "FlashSale(activityId=" + this.f86606a + ", status=" + this.f86607b + ", countdown=" + this.f86608c + ", startTime=" + this.f86609d + ", endTime=" + this.f86610e + ", title=" + this.f86611f + ", price=" + this.f86612g + ", image=" + this.f86613h + ", countdownBg=" + this.f86614i + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f86606a);
        Integer num = this.f86607b;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f86608c);
        parcel.writeString(this.f86609d);
        parcel.writeString(this.f86610e);
        parcel.writeString(this.f86611f);
        parcel.writeString(this.f86612g);
        Image image = this.f86613h;
        if (image != null) {
            parcel.writeInt(1);
            image.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Image image2 = this.f86614i;
        if (image2 != null) {
            parcel.writeInt(1);
            image2.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(54256);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static class a implements Parcelable.Creator<FlashSale> {
        static {
            Covode.recordClassIndex(54255);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FlashSale[] newArray(int i2) {
            return new FlashSale[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FlashSale createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            String readString = parcel.readString();
            Image image = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            Image createFromParcel = parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                image = Image.CREATOR.createFromParcel(parcel);
            }
            return new FlashSale(readString, valueOf, readString2, readString3, readString4, readString5, readString6, createFromParcel, image);
        }
    }

    public FlashSale(String str, Integer num, String str2, String str3, String str4, String str5, String str6, Image image, Image image2) {
        this.f86606a = str;
        this.f86607b = num;
        this.f86608c = str2;
        this.f86609d = str3;
        this.f86610e = str4;
        this.f86611f = str5;
        this.f86612g = str6;
        this.f86613h = image;
        this.f86614i = image2;
    }
}

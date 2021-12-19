package com.bytedance.android.livesdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class ChargeDeal implements Parcelable {
    public static final Parcelable.Creator<ChargeDeal> CREATOR = new Parcelable.Creator<ChargeDeal>() {
        /* class com.bytedance.android.livesdk.model.ChargeDeal.AnonymousClass1 */

        static {
            Covode.recordClassIndex(11266);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ChargeDeal[] newArray(int i2) {
            return new ChargeDeal[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ChargeDeal createFromParcel(Parcel parcel) {
            return new ChargeDeal(parcel);
        }
    };
    @c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public long f18923a;
    @c(a = "exchange_price")

    /* renamed from: b  reason: collision with root package name */
    public int f18924b;
    @c(a = "price")

    /* renamed from: c  reason: collision with root package name */
    public int f18925c;
    @c(a = "describe")

    /* renamed from: d  reason: collision with root package name */
    public String f18926d = "";
    @c(a = "diamond_count")

    /* renamed from: e  reason: collision with root package name */
    public int f18927e;
    @c(a = "giving_count")

    /* renamed from: f  reason: collision with root package name */
    public int f18928f;
    @c(a = "iap_id")

    /* renamed from: g  reason: collision with root package name */
    public String f18929g;
    @c(a = "currency_price")

    /* renamed from: h  reason: collision with root package name */
    public List<CurrencyPrice> f18930h;

    /* renamed from: i  reason: collision with root package name */
    public int f18931i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f18932j;
    @c(a = "coupon_id")

    /* renamed from: k  reason: collision with root package name */
    private String f18933k;

    public int describeContents() {
        return 0;
    }

    public ChargeDeal() {
    }

    public static class CurrencyPrice implements Parcelable {
        public static final Parcelable.Creator<CurrencyPrice> CREATOR = new Parcelable.Creator<CurrencyPrice>() {
            /* class com.bytedance.android.livesdk.model.ChargeDeal.CurrencyPrice.AnonymousClass1 */

            static {
                Covode.recordClassIndex(11268);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ CurrencyPrice[] newArray(int i2) {
                return new CurrencyPrice[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CurrencyPrice createFromParcel(Parcel parcel) {
                return new CurrencyPrice(parcel);
            }
        };
        @c(a = "currency")

        /* renamed from: a  reason: collision with root package name */
        public String f18934a;
        @c(a = "price")

        /* renamed from: b  reason: collision with root package name */
        public String f18935b;
        @c(a = "price_show_form")

        /* renamed from: c  reason: collision with root package name */
        public String f18936c;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(11267);
        }

        protected CurrencyPrice(Parcel parcel) {
            this.f18934a = parcel.readString();
            this.f18935b = parcel.readString();
            this.f18936c = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f18934a);
            parcel.writeString(this.f18935b);
            parcel.writeString(this.f18936c);
        }
    }

    static {
        Covode.recordClassIndex(11265);
    }

    protected ChargeDeal(Parcel parcel) {
        boolean z;
        this.f18923a = parcel.readLong();
        this.f18924b = parcel.readInt();
        this.f18925c = parcel.readInt();
        this.f18926d = parcel.readString();
        this.f18927e = parcel.readInt();
        this.f18928f = parcel.readInt();
        this.f18929g = parcel.readString();
        this.f18930h = parcel.createTypedArrayList(CurrencyPrice.CREATOR);
        this.f18931i = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f18932j = z;
        this.f18933k = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f18923a);
        parcel.writeInt(this.f18924b);
        parcel.writeInt(this.f18925c);
        parcel.writeString(this.f18926d);
        parcel.writeInt(this.f18927e);
        parcel.writeInt(this.f18928f);
        parcel.writeString(this.f18929g);
        parcel.writeTypedList(this.f18930h);
        parcel.writeInt(this.f18931i);
        parcel.writeByte(this.f18932j ? (byte) 1 : 0);
        parcel.writeString(this.f18933k);
    }
}

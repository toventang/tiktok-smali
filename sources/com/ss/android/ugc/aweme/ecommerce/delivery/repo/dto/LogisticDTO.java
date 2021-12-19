package com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import h.f.b.l;

public final class LogisticDTO implements Parcelable {
    public static final Parcelable.Creator<LogisticDTO> CREATOR = new a();
    @c(a = "delivery_option")

    /* renamed from: a  reason: collision with root package name */
    public final int f85889a;
    @c(a = "delivery_name")

    /* renamed from: b  reason: collision with root package name */
    public final String f85890b;
    @c(a = "is_default")

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f85891c;
    @c(a = "reachable")

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f85892d;
    @c(a = "lead_time")

    /* renamed from: e  reason: collision with root package name */
    public final String f85893e;
    @c(a = "shipping_fee")

    /* renamed from: f  reason: collision with root package name */
    public final Price f85894f;
    @c(a = "original_shipping_fee")

    /* renamed from: g  reason: collision with root package name */
    public final String f85895g;
    @c(a = "free_shipping")

    /* renamed from: h  reason: collision with root package name */
    public final Boolean f85896h;
    @c(a = "shipping_discount")

    /* renamed from: i  reason: collision with root package name */
    public final Boolean f85897i;
    @c(a = "logistic_text")

    /* renamed from: j  reason: collision with root package name */
    public final LogisticTextDTO f85898j;
    @c(a = "logistics_service_id")

    /* renamed from: k  reason: collision with root package name */
    public final String f85899k;

    static {
        Covode.recordClassIndex(53781);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.f85889a);
        parcel.writeString(this.f85890b);
        Boolean bool = this.f85891c;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        Boolean bool2 = this.f85892d;
        if (bool2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f85893e);
        Price price = this.f85894f;
        if (price != null) {
            parcel.writeInt(1);
            price.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f85895g);
        Boolean bool3 = this.f85896h;
        if (bool3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        Boolean bool4 = this.f85897i;
        if (bool4 != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        LogisticTextDTO logisticTextDTO = this.f85898j;
        if (logisticTextDTO != null) {
            parcel.writeInt(1);
            logisticTextDTO.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f85899k);
    }

    public static class a implements Parcelable.Creator<LogisticDTO> {
        static {
            Covode.recordClassIndex(53782);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LogisticDTO[] newArray(int i2) {
            return new LogisticDTO[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LogisticDTO createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            l.d(parcel, "");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            boolean z = true;
            LogisticTextDTO logisticTextDTO = null;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            if (parcel.readInt() != 0) {
                bool2 = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool2 = null;
            }
            String readString2 = parcel.readString();
            Price createFromParcel = parcel.readInt() != 0 ? Price.CREATOR.createFromParcel(parcel) : null;
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool3 = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool3 = null;
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool4 = Boolean.valueOf(z);
            } else {
                bool4 = null;
            }
            if (parcel.readInt() != 0) {
                logisticTextDTO = LogisticTextDTO.CREATOR.createFromParcel(parcel);
            }
            return new LogisticDTO(readInt, readString, bool, bool2, readString2, createFromParcel, readString3, bool3, bool4, logisticTextDTO, parcel.readString());
        }
    }

    public LogisticDTO(int i2, String str, Boolean bool, Boolean bool2, String str2, Price price, String str3, Boolean bool3, Boolean bool4, LogisticTextDTO logisticTextDTO, String str4) {
        this.f85889a = i2;
        this.f85890b = str;
        this.f85891c = bool;
        this.f85892d = bool2;
        this.f85893e = str2;
        this.f85894f = price;
        this.f85895g = str3;
        this.f85896h = bool3;
        this.f85897i = bool4;
        this.f85898j = logisticTextDTO;
        this.f85899k = str4;
    }
}

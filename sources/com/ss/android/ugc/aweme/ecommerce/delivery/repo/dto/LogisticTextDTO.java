package com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class LogisticTextDTO implements Parcelable {
    public static final Parcelable.Creator<LogisticTextDTO> CREATOR = new a();
    @c(a = "discount_desc_text")

    /* renamed from: a  reason: collision with root package name */
    public final String f85900a;
    @c(a = "service_text")

    /* renamed from: b  reason: collision with root package name */
    public final String f85901b;
    @c(a = "lead_time_text")

    /* renamed from: c  reason: collision with root package name */
    public final String f85902c;
    @c(a = "delivery_status_text")

    /* renamed from: d  reason: collision with root package name */
    public final String f85903d;
    @c(a = "threshold_text")

    /* renamed from: e  reason: collision with root package name */
    public final String f85904e;
    @c(a = "threshold_text_en")

    /* renamed from: f  reason: collision with root package name */
    public final String f85905f;

    static {
        Covode.recordClassIndex(53783);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticTextDTO)) {
            return false;
        }
        LogisticTextDTO logisticTextDTO = (LogisticTextDTO) obj;
        return l.a(this.f85900a, logisticTextDTO.f85900a) && l.a(this.f85901b, logisticTextDTO.f85901b) && l.a(this.f85902c, logisticTextDTO.f85902c) && l.a(this.f85903d, logisticTextDTO.f85903d) && l.a(this.f85904e, logisticTextDTO.f85904e) && l.a(this.f85905f, logisticTextDTO.f85905f);
    }

    public final int hashCode() {
        String str = this.f85900a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f85901b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f85902c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f85903d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f85904e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f85905f;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "LogisticTextDTO(discountDescText=" + this.f85900a + ", serviceText=" + this.f85901b + ", leadTimeText=" + this.f85902c + ", deliveryStatusText=" + this.f85903d + ", thresholdText=" + this.f85904e + ", thresholdTextEn=" + this.f85905f + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f85900a);
        parcel.writeString(this.f85901b);
        parcel.writeString(this.f85902c);
        parcel.writeString(this.f85903d);
        parcel.writeString(this.f85904e);
        parcel.writeString(this.f85905f);
    }

    public static class a implements Parcelable.Creator<LogisticTextDTO> {
        static {
            Covode.recordClassIndex(53784);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LogisticTextDTO[] newArray(int i2) {
            return new LogisticTextDTO[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LogisticTextDTO createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new LogisticTextDTO(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public LogisticTextDTO(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f85900a = str;
        this.f85901b = str2;
        this.f85902c = str3;
        this.f85903d = str4;
        this.f85904e = str5;
        this.f85905f = str6;
    }
}

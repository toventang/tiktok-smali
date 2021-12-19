package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class ThirdParty implements Parcelable {
    public static final Parcelable.Creator<ThirdParty> CREATOR = new a();
    @c(a = "pkg_name")

    /* renamed from: a  reason: collision with root package name */
    public final String f86669a;
    @c(a = "product_links_h5")

    /* renamed from: b  reason: collision with root package name */
    public final String f86670b;
    @c(a = "product_links_native")

    /* renamed from: c  reason: collision with root package name */
    public final String f86671c;
    @c(a = "btn_text")

    /* renamed from: d  reason: collision with root package name */
    public final String f86672d;
    @c(a = "source")

    /* renamed from: e  reason: collision with root package name */
    public final String f86673e;
    @c(a = "first_notice")

    /* renamed from: f  reason: collision with root package name */
    public final FirstNotice f86674f;

    static {
        Covode.recordClassIndex(54280);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f86669a);
        parcel.writeString(this.f86670b);
        parcel.writeString(this.f86671c);
        parcel.writeString(this.f86672d);
        parcel.writeString(this.f86673e);
        FirstNotice firstNotice = this.f86674f;
        if (firstNotice != null) {
            parcel.writeInt(1);
            firstNotice.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static class a implements Parcelable.Creator<ThirdParty> {
        static {
            Covode.recordClassIndex(54281);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ThirdParty[] newArray(int i2) {
            return new ThirdParty[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ThirdParty createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new ThirdParty(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? FirstNotice.CREATOR.createFromParcel(parcel) : null);
        }
    }

    public ThirdParty(String str, String str2, String str3, String str4, String str5, FirstNotice firstNotice) {
        this.f86669a = str;
        this.f86670b = str2;
        this.f86671c = str3;
        this.f86672d = str4;
        this.f86673e = str5;
        this.f86674f = firstNotice;
    }
}

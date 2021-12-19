package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommercebase.dto.GImage;
import h.f.b.l;

public final class HalfWaistBanner implements Parcelable {
    public static final Parcelable.Creator<HalfWaistBanner> CREATOR = new a();
    @c(a = "background_image")

    /* renamed from: a  reason: collision with root package name */
    public final GImage f86615a;
    @c(a = "left_image")

    /* renamed from: b  reason: collision with root package name */
    public final GImage f86616b;
    @c(a = "text")

    /* renamed from: c  reason: collision with root package name */
    public final String f86617c;
    @c(a = "text_color")

    /* renamed from: d  reason: collision with root package name */
    public final String f86618d;

    static {
        Covode.recordClassIndex(54257);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HalfWaistBanner)) {
            return false;
        }
        HalfWaistBanner halfWaistBanner = (HalfWaistBanner) obj;
        return l.a(this.f86615a, halfWaistBanner.f86615a) && l.a(this.f86616b, halfWaistBanner.f86616b) && l.a(this.f86617c, halfWaistBanner.f86617c) && l.a(this.f86618d, halfWaistBanner.f86618d);
    }

    public final int hashCode() {
        GImage gImage = this.f86615a;
        int i2 = 0;
        int hashCode = (gImage != null ? gImage.hashCode() : 0) * 31;
        GImage gImage2 = this.f86616b;
        int hashCode2 = (hashCode + (gImage2 != null ? gImage2.hashCode() : 0)) * 31;
        String str = this.f86617c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f86618d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "HalfWaistBanner(backgroundImage=" + this.f86615a + ", leftImage=" + this.f86616b + ", text=" + this.f86617c + ", textColor=" + this.f86618d + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeParcelable(this.f86615a, i2);
        parcel.writeParcelable(this.f86616b, i2);
        parcel.writeString(this.f86617c);
        parcel.writeString(this.f86618d);
    }

    public static class a implements Parcelable.Creator<HalfWaistBanner> {
        static {
            Covode.recordClassIndex(54258);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ HalfWaistBanner[] newArray(int i2) {
            return new HalfWaistBanner[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ HalfWaistBanner createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new HalfWaistBanner((GImage) parcel.readParcelable(HalfWaistBanner.class.getClassLoader()), (GImage) parcel.readParcelable(HalfWaistBanner.class.getClassLoader()), parcel.readString(), parcel.readString());
        }
    }

    public HalfWaistBanner(GImage gImage, GImage gImage2, String str, String str2) {
        this.f86615a = gImage;
        this.f86616b = gImage2;
        this.f86617c = str;
        this.f86618d = str2;
    }
}

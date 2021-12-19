package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import h.f.b.l;

public final class WaistBanner implements Parcelable {
    public static final Parcelable.Creator<WaistBanner> CREATOR = new a();
    @c(a = "activity_name")

    /* renamed from: a  reason: collision with root package name */
    public final String f86675a;
    @c(a = "backgroud")

    /* renamed from: b  reason: collision with root package name */
    public final Image f86676b;
    @c(a = "promotion_name")

    /* renamed from: c  reason: collision with root package name */
    public final String f86677c;

    static {
        Covode.recordClassIndex(54282);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaistBanner)) {
            return false;
        }
        WaistBanner waistBanner = (WaistBanner) obj;
        return l.a(this.f86675a, waistBanner.f86675a) && l.a(this.f86676b, waistBanner.f86676b) && l.a(this.f86677c, waistBanner.f86677c);
    }

    public final int hashCode() {
        String str = this.f86675a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Image image = this.f86676b;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 31;
        String str2 = this.f86677c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "WaistBanner(activityName=" + this.f86675a + ", background=" + this.f86676b + ", promotionName=" + this.f86677c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f86675a);
        Image image = this.f86676b;
        if (image != null) {
            parcel.writeInt(1);
            image.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f86677c);
    }

    public static class a implements Parcelable.Creator<WaistBanner> {
        static {
            Covode.recordClassIndex(54283);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ WaistBanner[] newArray(int i2) {
            return new WaistBanner[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WaistBanner createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new WaistBanner(parcel.readString(), parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }
    }

    private /* synthetic */ WaistBanner() {
        this("", null, null);
    }

    public WaistBanner(String str, Image image, String str2) {
        l.d(str, "");
        this.f86675a = str;
        this.f86676b = image;
        this.f86677c = str2;
    }
}

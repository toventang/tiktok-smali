package com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class District implements Parcelable {
    public static final Parcelable.Creator<District> CREATOR = new a();
    @c(a = StringSet.name)

    /* renamed from: a  reason: collision with root package name */
    public final String f87671a;
    @c(a = "geoname_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f87672b;
    @c(a = "index")

    /* renamed from: c  reason: collision with root package name */
    public final String f87673c;

    static {
        Covode.recordClassIndex(55143);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f87671a);
        parcel.writeString(this.f87672b);
        parcel.writeString(this.f87673c);
    }

    public static class a implements Parcelable.Creator<District> {
        static {
            Covode.recordClassIndex(55144);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ District[] newArray(int i2) {
            return new District[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ District createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new District(parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public District(String str, String str2, String str3) {
        this.f87671a = str;
        this.f87672b = str2;
        this.f87673c = str3;
    }
}

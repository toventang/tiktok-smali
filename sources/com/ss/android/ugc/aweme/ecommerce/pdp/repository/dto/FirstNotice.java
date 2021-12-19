package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import h.f.b.l;

public final class FirstNotice implements Parcelable {
    public static final Parcelable.Creator<FirstNotice> CREATOR = new a();
    @c(a = "icon")

    /* renamed from: a  reason: collision with root package name */
    public final Image f86601a;
    @c(a = "title")

    /* renamed from: b  reason: collision with root package name */
    public final String f86602b;
    @c(a = "description")

    /* renamed from: c  reason: collision with root package name */
    public final String f86603c;
    @c(a = "btn_txt")

    /* renamed from: d  reason: collision with root package name */
    public final String f86604d;

    static {
        Covode.recordClassIndex(54252);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        Image image = this.f86601a;
        if (image != null) {
            parcel.writeInt(1);
            image.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f86602b);
        parcel.writeString(this.f86603c);
        parcel.writeString(this.f86604d);
    }

    public static class a implements Parcelable.Creator<FirstNotice> {
        static {
            Covode.recordClassIndex(54253);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FirstNotice[] newArray(int i2) {
            return new FirstNotice[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FirstNotice createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new FirstNotice(parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public FirstNotice(Image image, String str, String str2, String str3) {
        this.f86601a = image;
        this.f86602b = str;
        this.f86603c = str2;
        this.f86604d = str3;
    }
}

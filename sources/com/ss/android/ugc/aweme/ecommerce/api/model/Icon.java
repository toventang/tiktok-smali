package com.ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class Icon implements Parcelable {
    public static final Parcelable.Creator<Icon> CREATOR = new a();
    @c(a = "icon")

    /* renamed from: a  reason: collision with root package name */
    public final Image f84630a;
    @c(a = "icon_dark")

    /* renamed from: b  reason: collision with root package name */
    public final Image f84631b;
    @c(a = "link")

    /* renamed from: c  reason: collision with root package name */
    public final String f84632c;

    static {
        Covode.recordClassIndex(52840);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Icon)) {
            return false;
        }
        Icon icon = (Icon) obj;
        return l.a(this.f84630a, icon.f84630a) && l.a(this.f84631b, icon.f84631b) && l.a(this.f84632c, icon.f84632c);
    }

    public final int hashCode() {
        Image image = this.f84630a;
        int i2 = 0;
        int hashCode = (image != null ? image.hashCode() : 0) * 31;
        Image image2 = this.f84631b;
        int hashCode2 = (hashCode + (image2 != null ? image2.hashCode() : 0)) * 31;
        String str = this.f84632c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "Icon(icon=" + this.f84630a + ", iconDark=" + this.f84631b + ", link=" + this.f84632c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        this.f84630a.writeToParcel(parcel, 0);
        Image image = this.f84631b;
        if (image != null) {
            parcel.writeInt(1);
            image.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f84632c);
    }

    public static class a implements Parcelable.Creator<Icon> {
        static {
            Covode.recordClassIndex(52841);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Icon[] newArray(int i2) {
            return new Icon[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Icon createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new Icon(Image.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }
    }

    public Icon(Image image, Image image2, String str) {
        l.d(image, "");
        this.f84630a = image;
        this.f84631b = image2;
        this.f84632c = str;
    }
}

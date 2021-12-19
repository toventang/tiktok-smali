package com.ss.android.ugc.aweme.ecommerce.sku.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import h.f.b.l;

public final class SalePropValue implements Parcelable {
    public static final Parcelable.Creator<SalePropValue> CREATOR = new a();
    @c(a = "prop_value_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f87412a;
    @c(a = "prop_value")

    /* renamed from: b  reason: collision with root package name */
    public final String f87413b;
    @c(a = "image")

    /* renamed from: c  reason: collision with root package name */
    public final Image f87414c;

    static {
        Covode.recordClassIndex(54901);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SalePropValue)) {
            return false;
        }
        SalePropValue salePropValue = (SalePropValue) obj;
        return l.a(this.f87412a, salePropValue.f87412a) && l.a(this.f87413b, salePropValue.f87413b) && l.a(this.f87414c, salePropValue.f87414c);
    }

    public final int hashCode() {
        String str = this.f87412a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f87413b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Image image = this.f87414c;
        if (image != null) {
            i2 = image.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "SalePropValue(propValueId=" + this.f87412a + ", propValue=" + this.f87413b + ", image=" + this.f87414c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f87412a);
        parcel.writeString(this.f87413b);
        Image image = this.f87414c;
        if (image != null) {
            parcel.writeInt(1);
            image.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static class a implements Parcelable.Creator<SalePropValue> {
        static {
            Covode.recordClassIndex(54902);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SalePropValue[] newArray(int i2) {
            return new SalePropValue[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SalePropValue createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new SalePropValue(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null);
        }
    }

    public SalePropValue(String str, String str2, Image image) {
        this.f87412a = str;
        this.f87413b = str2;
        this.f87414c = image;
    }
}

package com.ss.android.ugc.aweme.ecommerce.sku.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class SaleProp implements Parcelable {
    public static final Parcelable.Creator<SaleProp> CREATOR = new a();
    @c(a = "prop_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f87408a;
    @c(a = "prop_name")

    /* renamed from: b  reason: collision with root package name */
    public final String f87409b;
    @c(a = "has_image")

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f87410c;
    @c(a = "sale_prop_values")

    /* renamed from: d  reason: collision with root package name */
    public final List<SalePropValue> f87411d;

    static {
        Covode.recordClassIndex(54899);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaleProp)) {
            return false;
        }
        SaleProp saleProp = (SaleProp) obj;
        return l.a(this.f87408a, saleProp.f87408a) && l.a(this.f87409b, saleProp.f87409b) && l.a(this.f87410c, saleProp.f87410c) && l.a(this.f87411d, saleProp.f87411d);
    }

    public final int hashCode() {
        String str = this.f87408a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f87409b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f87410c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        List<SalePropValue> list = this.f87411d;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "SaleProp(propId=" + this.f87408a + ", propName=" + this.f87409b + ", hasImage=" + this.f87410c + ", salePropValueList=" + this.f87411d + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f87408a);
        parcel.writeString(this.f87409b);
        Boolean bool = this.f87410c;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        List<SalePropValue> list = this.f87411d;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (SalePropValue salePropValue : list) {
                salePropValue.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    public static class a implements Parcelable.Creator<SaleProp> {
        static {
            Covode.recordClassIndex(54900);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SaleProp[] newArray(int i2) {
            return new SaleProp[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SaleProp createFromParcel(Parcel parcel) {
            Boolean bool;
            l.d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList arrayList = null;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(SalePropValue.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            }
            return new SaleProp(readString, readString2, bool, arrayList);
        }
    }

    public SaleProp(String str, String str2, Boolean bool, List<SalePropValue> list) {
        this.f87408a = str;
        this.f87409b = str2;
        this.f87410c = bool;
        this.f87411d = list;
    }
}

package com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class DistrictData implements Parcelable {
    public static final Parcelable.Creator<DistrictData> CREATOR = new a();
    @c(a = "districts")

    /* renamed from: a  reason: collision with root package name */
    public final List<District> f87674a;
    @c(a = "has_next_level")

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f87675b;
    @c(a = "title")

    /* renamed from: c  reason: collision with root package name */
    public final String f87676c;
    @c(a = "title_en")

    /* renamed from: d  reason: collision with root package name */
    public final String f87677d;

    static {
        Covode.recordClassIndex(55145);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistrictData)) {
            return false;
        }
        DistrictData districtData = (DistrictData) obj;
        return l.a(this.f87674a, districtData.f87674a) && l.a(this.f87675b, districtData.f87675b) && l.a(this.f87676c, districtData.f87676c) && l.a(this.f87677d, districtData.f87677d);
    }

    public final int hashCode() {
        List<District> list = this.f87674a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Boolean bool = this.f87675b;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.f87676c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f87677d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "DistrictData(districts=" + this.f87674a + ", hasNextLevel=" + this.f87675b + ", title=" + this.f87676c + ", titleEn=" + this.f87677d + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        List<District> list = this.f87674a;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (District district : list) {
                district.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        Boolean bool = this.f87675b;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f87676c);
        parcel.writeString(this.f87677d);
    }

    public static class a implements Parcelable.Creator<DistrictData> {
        static {
            Covode.recordClassIndex(55146);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DistrictData[] newArray(int i2) {
            return new DistrictData[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistrictData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            l.d(parcel, "");
            Boolean bool = null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(District.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DistrictData(arrayList, bool, parcel.readString(), parcel.readString());
        }
    }

    public DistrictData(List<District> list, Boolean bool, String str, String str2) {
        this.f87674a = list;
        this.f87675b = bool;
        this.f87676c = str;
        this.f87677d = str2;
    }
}

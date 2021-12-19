package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class AdditionInfo implements Parcelable {
    public static final Parcelable.Creator<AdditionInfo> CREATOR = new a();
    @c(a = StringSet.type)

    /* renamed from: a  reason: collision with root package name */
    public final int f86594a;
    @c(a = "info_title")

    /* renamed from: b  reason: collision with root package name */
    public final String f86595b;
    @c(a = "info_items")

    /* renamed from: c  reason: collision with root package name */
    public final List<AdditionalInfoItem> f86596c;

    static {
        Covode.recordClassIndex(54246);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionInfo)) {
            return false;
        }
        AdditionInfo additionInfo = (AdditionInfo) obj;
        return this.f86594a == additionInfo.f86594a && l.a(this.f86595b, additionInfo.f86595b) && l.a(this.f86596c, additionInfo.f86596c);
    }

    public final int hashCode() {
        int i2 = this.f86594a * 31;
        String str = this.f86595b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        List<AdditionalInfoItem> list = this.f86596c;
        if (list != null) {
            i3 = list.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "AdditionInfo(type=" + this.f86594a + ", title=" + this.f86595b + ", items=" + this.f86596c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.f86594a);
        parcel.writeString(this.f86595b);
        List<AdditionalInfoItem> list = this.f86596c;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (AdditionalInfoItem additionalInfoItem : list) {
                additionalInfoItem.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    public static class a implements Parcelable.Creator<AdditionInfo> {
        static {
            Covode.recordClassIndex(54247);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AdditionInfo[] newArray(int i2) {
            return new AdditionInfo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AdditionInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            l.d(parcel, "");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList.add(AdditionalInfoItem.CREATOR.createFromParcel(parcel));
                    readInt2--;
                }
            } else {
                arrayList = null;
            }
            return new AdditionInfo(readInt, readString, arrayList);
        }
    }

    public AdditionInfo(int i2, String str, List<AdditionalInfoItem> list) {
        l.d(str, "");
        this.f86594a = i2;
        this.f86595b = str;
        this.f86596c = list;
    }
}

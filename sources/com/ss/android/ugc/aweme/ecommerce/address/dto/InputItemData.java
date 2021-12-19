package com.ss.android.ugc.aweme.ecommerce.address.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class InputItemData implements Parcelable {
    public static final Parcelable.Creator<InputItemData> CREATOR = new a();
    @c(a = "input_items")

    /* renamed from: a  reason: collision with root package name */
    public final List<InputItemDTO> f84317a;
    @c(a = "district")

    /* renamed from: b  reason: collision with root package name */
    public final Region f84318b;

    static {
        Covode.recordClassIndex(52570);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputItemData)) {
            return false;
        }
        InputItemData inputItemData = (InputItemData) obj;
        return l.a(this.f84317a, inputItemData.f84317a) && l.a(this.f84318b, inputItemData.f84318b);
    }

    public final int hashCode() {
        List<InputItemDTO> list = this.f84317a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Region region = this.f84318b;
        if (region != null) {
            i2 = region.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "InputItemData(inputItems=" + this.f84317a + ", regionInfo=" + this.f84318b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        List<InputItemDTO> list = this.f84317a;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (InputItemDTO inputItemDTO : list) {
                inputItemDTO.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        Region region = this.f84318b;
        if (region != null) {
            parcel.writeInt(1);
            region.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static class a implements Parcelable.Creator<InputItemData> {
        static {
            Covode.recordClassIndex(52571);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InputItemData[] newArray(int i2) {
            return new InputItemData[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InputItemData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            l.d(parcel, "");
            Region region = null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(InputItemDTO.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                region = Region.CREATOR.createFromParcel(parcel);
            }
            return new InputItemData(arrayList, region);
        }
    }

    public InputItemData(List<InputItemDTO> list, Region region) {
        this.f84317a = list;
        this.f84318b = region;
    }
}

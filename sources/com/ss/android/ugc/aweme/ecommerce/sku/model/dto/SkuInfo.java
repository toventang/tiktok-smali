package com.ss.android.ugc.aweme.ecommerce.sku.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class SkuInfo implements Parcelable {
    public static final Parcelable.Creator<SkuInfo> CREATOR = new a();
    @c(a = "skus")

    /* renamed from: a  reason: collision with root package name */
    public final List<SkuItem> f87415a;
    @c(a = "sale_props")

    /* renamed from: b  reason: collision with root package name */
    public final List<SaleProp> f87416b;

    static {
        Covode.recordClassIndex(54903);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuInfo)) {
            return false;
        }
        SkuInfo skuInfo = (SkuInfo) obj;
        return l.a(this.f87415a, skuInfo.f87415a) && l.a(this.f87416b, skuInfo.f87416b);
    }

    public final int hashCode() {
        List<SkuItem> list = this.f87415a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<SaleProp> list2 = this.f87416b;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SkuInfo(skuList=" + this.f87415a + ", salePropList=" + this.f87416b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        List<SkuItem> list = this.f87415a;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (SkuItem skuItem : list) {
                skuItem.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        List<SaleProp> list2 = this.f87416b;
        if (list2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (SaleProp saleProp : list2) {
                saleProp.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    public static class a implements Parcelable.Creator<SkuInfo> {
        static {
            Covode.recordClassIndex(54904);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SkuInfo[] newArray(int i2) {
            return new SkuInfo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SkuInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            l.d(parcel, "");
            ArrayList arrayList2 = null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(SkuItem.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList2.add(SaleProp.CREATOR.createFromParcel(parcel));
                    readInt2--;
                }
            }
            return new SkuInfo(arrayList, arrayList2);
        }
    }

    public SkuInfo(List<SkuItem> list, List<SaleProp> list2) {
        this.f87415a = list;
        this.f87416b = list2;
    }
}

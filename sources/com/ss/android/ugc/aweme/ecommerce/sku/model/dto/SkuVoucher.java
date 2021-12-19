package com.ss.android.ugc.aweme.ecommerce.sku.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class SkuVoucher implements Parcelable, Serializable {
    public static final Parcelable.Creator<SkuVoucher> CREATOR = new a();
    @c(a = "best_voucher_type_ids")
    private final List<String> bestVoucherTypeIds;

    static {
        Covode.recordClassIndex(54911);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuVoucher */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkuVoucher copy$default(SkuVoucher skuVoucher, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = skuVoucher.bestVoucherTypeIds;
        }
        return skuVoucher.copy(list);
    }

    public final List<String> component1() {
        return this.bestVoucherTypeIds;
    }

    public final SkuVoucher copy(List<String> list) {
        return new SkuVoucher(list);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SkuVoucher) && l.a(this.bestVoucherTypeIds, ((SkuVoucher) obj).bestVoucherTypeIds);
        }
        return true;
    }

    public final int hashCode() {
        List<String> list = this.bestVoucherTypeIds;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SkuVoucher(bestVoucherTypeIds=" + this.bestVoucherTypeIds + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeStringList(this.bestVoucherTypeIds);
    }

    public final List<String> getBestVoucherTypeIds() {
        return this.bestVoucherTypeIds;
    }

    public static class a implements Parcelable.Creator<SkuVoucher> {
        static {
            Covode.recordClassIndex(54912);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SkuVoucher[] newArray(int i2) {
            return new SkuVoucher[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SkuVoucher createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new SkuVoucher(parcel.createStringArrayList());
        }
    }

    public SkuVoucher(List<String> list) {
        this.bestVoucherTypeIds = list;
    }
}

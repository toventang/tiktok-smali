package com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class VoucherInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<VoucherInfo> CREATOR = new a();
    @c(a = "best_voucher_type_ids")
    private final List<String> bestVoucherTypeIds;
    @c(a = "lowest_price")
    private final Price lowestPrice;
    @c(a = "vouchers")
    private List<Voucher> vouchers;

    static {
        Covode.recordClassIndex(53649);
    }

    public VoucherInfo() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoucherInfo copy$default(VoucherInfo voucherInfo, Price price, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            price = voucherInfo.lowestPrice;
        }
        if ((i2 & 2) != 0) {
            list = voucherInfo.vouchers;
        }
        if ((i2 & 4) != 0) {
            list2 = voucherInfo.bestVoucherTypeIds;
        }
        return voucherInfo.copy(price, list, list2);
    }

    public final Price component1() {
        return this.lowestPrice;
    }

    public final List<Voucher> component2() {
        return this.vouchers;
    }

    public final List<String> component3() {
        return this.bestVoucherTypeIds;
    }

    public final VoucherInfo copy(Price price, List<Voucher> list, List<String> list2) {
        return new VoucherInfo(price, list, list2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoucherInfo)) {
            return false;
        }
        VoucherInfo voucherInfo = (VoucherInfo) obj;
        return l.a(this.lowestPrice, voucherInfo.lowestPrice) && l.a(this.vouchers, voucherInfo.vouchers) && l.a(this.bestVoucherTypeIds, voucherInfo.bestVoucherTypeIds);
    }

    public final int hashCode() {
        Price price = this.lowestPrice;
        int i2 = 0;
        int hashCode = (price != null ? price.hashCode() : 0) * 31;
        List<Voucher> list = this.vouchers;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.bestVoucherTypeIds;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "VoucherInfo(lowestPrice=" + this.lowestPrice + ", vouchers=" + this.vouchers + ", bestVoucherTypeIds=" + this.bestVoucherTypeIds + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        Price price = this.lowestPrice;
        if (price != null) {
            parcel.writeInt(1);
            price.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<Voucher> list = this.vouchers;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Voucher voucher : list) {
                voucher.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeStringList(this.bestVoucherTypeIds);
    }

    public final List<String> getBestVoucherTypeIds() {
        return this.bestVoucherTypeIds;
    }

    public final Price getLowestPrice() {
        return this.lowestPrice;
    }

    public final List<Voucher> getVouchers() {
        return this.vouchers;
    }

    public static class a implements Parcelable.Creator<VoucherInfo> {
        static {
            Covode.recordClassIndex(53650);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VoucherInfo[] newArray(int i2) {
            return new VoucherInfo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VoucherInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            ArrayList arrayList = null;
            Price createFromParcel = parcel.readInt() != 0 ? Price.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(Voucher.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            }
            return new VoucherInfo(createFromParcel, arrayList, parcel.createStringArrayList());
        }
    }

    public final void setVouchers(List<Voucher> list) {
        this.vouchers = list;
    }

    public VoucherInfo(Price price, List<Voucher> list, List<String> list2) {
        this.lowestPrice = price;
        this.vouchers = list;
        this.bestVoucherTypeIds = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VoucherInfo(Price price, List list, List list2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : price, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : list2);
    }
}

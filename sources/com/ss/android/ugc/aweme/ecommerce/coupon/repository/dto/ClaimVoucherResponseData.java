package com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class ClaimVoucherResponseData implements Parcelable, Serializable {
    public static final Parcelable.Creator<ClaimVoucherResponseData> CREATOR = new a();
    @c(a = "can_retry")
    private final Boolean canRetry;
    @c(a = "voucher")
    private final Voucher voucher;

    static {
        Covode.recordClassIndex(53640);
    }

    public static /* synthetic */ ClaimVoucherResponseData copy$default(ClaimVoucherResponseData claimVoucherResponseData, Boolean bool, Voucher voucher2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = claimVoucherResponseData.canRetry;
        }
        if ((i2 & 2) != 0) {
            voucher2 = claimVoucherResponseData.voucher;
        }
        return claimVoucherResponseData.copy(bool, voucher2);
    }

    public final Boolean component1() {
        return this.canRetry;
    }

    public final Voucher component2() {
        return this.voucher;
    }

    public final ClaimVoucherResponseData copy(Boolean bool, Voucher voucher2) {
        return new ClaimVoucherResponseData(bool, voucher2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaimVoucherResponseData)) {
            return false;
        }
        ClaimVoucherResponseData claimVoucherResponseData = (ClaimVoucherResponseData) obj;
        return l.a(this.canRetry, claimVoucherResponseData.canRetry) && l.a(this.voucher, claimVoucherResponseData.voucher);
    }

    public final int hashCode() {
        Boolean bool = this.canRetry;
        int i2 = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Voucher voucher2 = this.voucher;
        if (voucher2 != null) {
            i2 = voucher2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ClaimVoucherResponseData(canRetry=" + this.canRetry + ", voucher=" + this.voucher + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        Boolean bool = this.canRetry;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        Voucher voucher2 = this.voucher;
        if (voucher2 != null) {
            parcel.writeInt(1);
            voucher2.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public final Boolean getCanRetry() {
        return this.canRetry;
    }

    public final Voucher getVoucher() {
        return this.voucher;
    }

    public static class a implements Parcelable.Creator<ClaimVoucherResponseData> {
        static {
            Covode.recordClassIndex(53641);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ClaimVoucherResponseData[] newArray(int i2) {
            return new ClaimVoucherResponseData[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ClaimVoucherResponseData createFromParcel(Parcel parcel) {
            Boolean bool;
            l.d(parcel, "");
            Voucher voucher = null;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            if (parcel.readInt() != 0) {
                voucher = Voucher.CREATOR.createFromParcel(parcel);
            }
            return new ClaimVoucherResponseData(bool, voucher);
        }
    }

    public ClaimVoucherResponseData(Boolean bool, Voucher voucher2) {
        this.canRetry = bool;
        this.voucher = voucher2;
    }
}

package com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class CouponCache implements Parcelable, Serializable {
    public static final Parcelable.Creator<CouponCache> CREATOR = new a();
    @c(a = "claim_status")
    private int claimStatus;
    @c(a = "update_millis")
    private long updateMillis;
    @c(a = "voucher_id")
    private final String voucherId;
    @c(a = "voucher_type_id")
    private final String voucherTypeID;

    static {
        Covode.recordClassIndex(53643);
    }

    public static int com_ss_android_ugc_aweme_ecommerce_coupon_repository_dto_CouponCache_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_ecommerce_coupon_repository_dto_CouponCache_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ CouponCache copy$default(CouponCache couponCache, String str, String str2, int i2, long j2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = couponCache.voucherId;
        }
        if ((i3 & 2) != 0) {
            str2 = couponCache.voucherTypeID;
        }
        if ((i3 & 4) != 0) {
            i2 = couponCache.claimStatus;
        }
        if ((i3 & 8) != 0) {
            j2 = couponCache.updateMillis;
        }
        return couponCache.copy(str, str2, i2, j2);
    }

    public final String component1() {
        return this.voucherId;
    }

    public final String component2() {
        return this.voucherTypeID;
    }

    public final int component3() {
        return this.claimStatus;
    }

    public final long component4() {
        return this.updateMillis;
    }

    public final CouponCache copy(String str, String str2, int i2, long j2) {
        l.d(str2, "");
        return new CouponCache(str, str2, i2, j2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponCache)) {
            return false;
        }
        CouponCache couponCache = (CouponCache) obj;
        return l.a(this.voucherId, couponCache.voucherId) && l.a(this.voucherTypeID, couponCache.voucherTypeID) && this.claimStatus == couponCache.claimStatus && this.updateMillis == couponCache.updateMillis;
    }

    public final int hashCode() {
        String str = this.voucherId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.voucherTypeID;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((((hashCode + i2) * 31) + com_ss_android_ugc_aweme_ecommerce_coupon_repository_dto_CouponCache_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.claimStatus)) * 31) + com_ss_android_ugc_aweme_ecommerce_coupon_repository_dto_CouponCache_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.updateMillis);
    }

    public final String toString() {
        return "CouponCache(voucherId=" + this.voucherId + ", voucherTypeID=" + this.voucherTypeID + ", claimStatus=" + this.claimStatus + ", updateMillis=" + this.updateMillis + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.voucherId);
        parcel.writeString(this.voucherTypeID);
        parcel.writeInt(this.claimStatus);
        parcel.writeLong(this.updateMillis);
    }

    public final int getClaimStatus() {
        return this.claimStatus;
    }

    public final long getUpdateMillis() {
        return this.updateMillis;
    }

    public final String getVoucherId() {
        return this.voucherId;
    }

    public final String getVoucherTypeID() {
        return this.voucherTypeID;
    }

    public static class a implements Parcelable.Creator<CouponCache> {
        static {
            Covode.recordClassIndex(53644);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CouponCache[] newArray(int i2) {
            return new CouponCache[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CouponCache createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new CouponCache(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong());
        }
    }

    public final void setClaimStatus(int i2) {
        this.claimStatus = i2;
    }

    public final void setUpdateMillis(long j2) {
        this.updateMillis = j2;
    }

    public CouponCache(String str, String str2, int i2, long j2) {
        l.d(str2, "");
        this.voucherId = str;
        this.voucherTypeID = str2;
        this.claimStatus = i2;
        this.updateMillis = j2;
    }
}

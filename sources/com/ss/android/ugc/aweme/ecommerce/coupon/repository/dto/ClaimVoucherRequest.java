package com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class ClaimVoucherRequest {
    @c(a = "request_source")
    private final int requestSource;
    @c(a = "voucher_type_id")
    private final String voucherTypeID;

    static {
        Covode.recordClassIndex(53638);
    }

    public static int com_ss_android_ugc_aweme_ecommerce_coupon_repository_dto_ClaimVoucherRequest_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ ClaimVoucherRequest copy$default(ClaimVoucherRequest claimVoucherRequest, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = claimVoucherRequest.voucherTypeID;
        }
        if ((i3 & 2) != 0) {
            i2 = claimVoucherRequest.requestSource;
        }
        return claimVoucherRequest.copy(str, i2);
    }

    public final String component1() {
        return this.voucherTypeID;
    }

    public final int component2() {
        return this.requestSource;
    }

    public final ClaimVoucherRequest copy(String str, int i2) {
        l.d(str, "");
        return new ClaimVoucherRequest(str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaimVoucherRequest)) {
            return false;
        }
        ClaimVoucherRequest claimVoucherRequest = (ClaimVoucherRequest) obj;
        return l.a(this.voucherTypeID, claimVoucherRequest.voucherTypeID) && this.requestSource == claimVoucherRequest.requestSource;
    }

    public final int hashCode() {
        String str = this.voucherTypeID;
        return ((str != null ? str.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_ecommerce_coupon_repository_dto_ClaimVoucherRequest_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.requestSource);
    }

    public final String toString() {
        return "ClaimVoucherRequest(voucherTypeID=" + this.voucherTypeID + ", requestSource=" + this.requestSource + ")";
    }

    public final int getRequestSource() {
        return this.requestSource;
    }

    public final String getVoucherTypeID() {
        return this.voucherTypeID;
    }

    public ClaimVoucherRequest(String str, int i2) {
        l.d(str, "");
        this.voucherTypeID = str;
        this.requestSource = i2;
    }
}

package com.ss.android.ugc.aweme.donation.token;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.io.Serializable;

public final class DonationTokenResponse extends BaseResponse implements Serializable {
    @c(a = "data")
    private final DonationTokenBean data;

    static {
        Covode.recordClassIndex(51768);
    }

    public static /* synthetic */ DonationTokenResponse copy$default(DonationTokenResponse donationTokenResponse, DonationTokenBean donationTokenBean, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            donationTokenBean = donationTokenResponse.data;
        }
        return donationTokenResponse.copy(donationTokenBean);
    }

    public final DonationTokenBean component1() {
        return this.data;
    }

    public final DonationTokenResponse copy(DonationTokenBean donationTokenBean) {
        return new DonationTokenResponse(donationTokenBean);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DonationTokenResponse) && l.a(this.data, ((DonationTokenResponse) obj).data);
        }
        return true;
    }

    public final int hashCode() {
        DonationTokenBean donationTokenBean = this.data;
        if (donationTokenBean != null) {
            return donationTokenBean.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "DonationTokenResponse(data=" + this.data + ")";
    }

    public final DonationTokenBean getData() {
        return this.data;
    }

    public DonationTokenResponse(DonationTokenBean donationTokenBean) {
        this.data = donationTokenBean;
    }
}

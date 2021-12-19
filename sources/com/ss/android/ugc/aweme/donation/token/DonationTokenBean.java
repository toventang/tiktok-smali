package com.ss.android.ugc.aweme.donation.token;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class DonationTokenBean implements Serializable {
    @c(a = "token")
    private final String token;

    static {
        Covode.recordClassIndex(51765);
    }

    public static /* synthetic */ DonationTokenBean copy$default(DonationTokenBean donationTokenBean, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = donationTokenBean.token;
        }
        return donationTokenBean.copy(str);
    }

    public final String component1() {
        return this.token;
    }

    public final DonationTokenBean copy(String str) {
        return new DonationTokenBean(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DonationTokenBean) && l.a(this.token, ((DonationTokenBean) obj).token);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.token;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DonationTokenBean(token=" + this.token + ")";
    }

    public final String getToken() {
        return this.token;
    }

    public DonationTokenBean(String str) {
        this.token = str;
    }
}

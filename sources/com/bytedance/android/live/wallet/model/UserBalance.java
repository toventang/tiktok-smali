package com.bytedance.android.live.wallet.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class UserBalance {
    @c(a = "balance")
    private long balance;
    @c(a = "country_code")
    private final String countryCode;
    @c(a = "currency_type")
    private final String currencyType;

    static {
        Covode.recordClassIndex(7331);
    }

    public UserBalance() {
        this(null, null, 0, 7, null);
    }

    public static int com_bytedance_android_live_wallet_model_UserBalance_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ UserBalance copy$default(UserBalance userBalance, String str, String str2, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = userBalance.currencyType;
        }
        if ((i2 & 2) != 0) {
            str2 = userBalance.countryCode;
        }
        if ((i2 & 4) != 0) {
            j2 = userBalance.balance;
        }
        return userBalance.copy(str, str2, j2);
    }

    public final String component1() {
        return this.currencyType;
    }

    public final String component2() {
        return this.countryCode;
    }

    public final long component3() {
        return this.balance;
    }

    public final UserBalance copy(String str, String str2, long j2) {
        l.d(str, "");
        l.d(str2, "");
        return new UserBalance(str, str2, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserBalance)) {
            return false;
        }
        UserBalance userBalance = (UserBalance) obj;
        return l.a(this.currencyType, userBalance.currencyType) && l.a(this.countryCode, userBalance.countryCode) && this.balance == userBalance.balance;
    }

    public final int hashCode() {
        String str = this.currencyType;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.countryCode;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + com_bytedance_android_live_wallet_model_UserBalance_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.balance);
    }

    public final String toString() {
        return "UserBalance(currencyType=" + this.currencyType + ", countryCode=" + this.countryCode + ", balance=" + this.balance + ")";
    }

    public final long getBalance() {
        return this.balance;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCurrencyType() {
        return this.currencyType;
    }

    public final void setBalance(long j2) {
        this.balance = j2;
    }

    public UserBalance(String str, String str2, long j2) {
        l.d(str, "");
        l.d(str2, "");
        this.currencyType = str;
        this.countryCode = str2;
        this.balance = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserBalance(String str, String str2, long j2, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : j2);
    }
}

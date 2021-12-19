package com.bytedance.android.live.wallet.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class RevenueExchange {
    @c(a = "revenue")
    private final long balance;
    @c(a = "currency")
    private final String currency;
    @c(a = "price_dot")
    private final int dot;
    @c(a = "enable")
    private final boolean enableExchange;
    @c(a = "has_short_video_gift")
    private final boolean isRevenue;
    @c(a = "unit_price")
    private final int price;
    @c(a = "region")
    private final String region;

    static {
        Covode.recordClassIndex(7330);
    }

    public RevenueExchange() {
        this(null, false, false, 0, null, 0, 0, 127, null);
    }

    public static int com_bytedance_android_live_wallet_model_RevenueExchange_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_bytedance_android_live_wallet_model_RevenueExchange_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ RevenueExchange copy$default(RevenueExchange revenueExchange, String str, boolean z, boolean z2, int i2, String str2, long j2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = revenueExchange.currency;
        }
        if ((i4 & 2) != 0) {
            z = revenueExchange.enableExchange;
        }
        if ((i4 & 4) != 0) {
            z2 = revenueExchange.isRevenue;
        }
        if ((i4 & 8) != 0) {
            i2 = revenueExchange.dot;
        }
        if ((i4 & 16) != 0) {
            str2 = revenueExchange.region;
        }
        if ((i4 & 32) != 0) {
            j2 = revenueExchange.balance;
        }
        if ((i4 & 64) != 0) {
            i3 = revenueExchange.price;
        }
        return revenueExchange.copy(str, z, z2, i2, str2, j2, i3);
    }

    public final String component1() {
        return this.currency;
    }

    public final boolean component2() {
        return this.enableExchange;
    }

    public final boolean component3() {
        return this.isRevenue;
    }

    public final int component4() {
        return this.dot;
    }

    public final String component5() {
        return this.region;
    }

    public final long component6() {
        return this.balance;
    }

    public final int component7() {
        return this.price;
    }

    public final RevenueExchange copy(String str, boolean z, boolean z2, int i2, String str2, long j2, int i3) {
        l.d(str, "");
        l.d(str2, "");
        return new RevenueExchange(str, z, z2, i2, str2, j2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RevenueExchange)) {
            return false;
        }
        RevenueExchange revenueExchange = (RevenueExchange) obj;
        return l.a(this.currency, revenueExchange.currency) && this.enableExchange == revenueExchange.enableExchange && this.isRevenue == revenueExchange.isRevenue && this.dot == revenueExchange.dot && l.a(this.region, revenueExchange.region) && this.balance == revenueExchange.balance && this.price == revenueExchange.price;
    }

    public final int hashCode() {
        String str = this.currency;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.enableExchange;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode + i4) * 31;
        if (!this.isRevenue) {
            i3 = 0;
        }
        int com_bytedance_android_live_wallet_model_RevenueExchange_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((i7 + i3) * 31) + com_bytedance_android_live_wallet_model_RevenueExchange_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.dot)) * 31;
        String str2 = this.region;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((((com_bytedance_android_live_wallet_model_RevenueExchange_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i2) * 31) + com_bytedance_android_live_wallet_model_RevenueExchange_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.balance)) * 31) + com_bytedance_android_live_wallet_model_RevenueExchange_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.price);
    }

    public final String toString() {
        return "RevenueExchange(currency=" + this.currency + ", enableExchange=" + this.enableExchange + ", isRevenue=" + this.isRevenue + ", dot=" + this.dot + ", region=" + this.region + ", balance=" + this.balance + ", price=" + this.price + ")";
    }

    public final long getBalance() {
        return this.balance;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final int getDot() {
        return this.dot;
    }

    public final boolean getEnableExchange() {
        return this.enableExchange;
    }

    public final int getPrice() {
        return this.price;
    }

    public final String getRegion() {
        return this.region;
    }

    public final boolean isRevenue() {
        return this.isRevenue;
    }

    public RevenueExchange(String str, boolean z, boolean z2, int i2, String str2, long j2, int i3) {
        l.d(str, "");
        l.d(str2, "");
        this.currency = str;
        this.enableExchange = z;
        this.isRevenue = z2;
        this.dot = i2;
        this.region = str2;
        this.balance = j2;
        this.price = i3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RevenueExchange(java.lang.String r10, boolean r11, boolean r12, int r13, java.lang.String r14, long r15, int r17, int r18, h.f.b.g r19) {
        /*
            r9 = this;
            r6 = r15
            r1 = r10
            r3 = r12
            r2 = r11
            r4 = r13
            r0 = r18 & 1
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x000c
            r1 = r5
        L_0x000c:
            r0 = r18 & 2
            r8 = 0
            if (r0 == 0) goto L_0x0012
            r2 = 0
        L_0x0012:
            r0 = r18 & 4
            if (r0 == 0) goto L_0x0017
            r3 = 0
        L_0x0017:
            r0 = r18 & 8
            if (r0 == 0) goto L_0x001c
            r4 = 0
        L_0x001c:
            r0 = r18 & 16
            if (r0 == 0) goto L_0x0032
        L_0x0020:
            r0 = r18 & 32
            if (r0 == 0) goto L_0x0026
            r6 = 0
        L_0x0026:
            r0 = r18 & 64
            if (r0 == 0) goto L_0x002f
        L_0x002a:
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            return
        L_0x002f:
            r8 = r17
            goto L_0x002a
        L_0x0032:
            r5 = r14
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.model.RevenueExchange.<init>(java.lang.String, boolean, boolean, int, java.lang.String, long, int, int, h.f.b.g):void");
    }
}

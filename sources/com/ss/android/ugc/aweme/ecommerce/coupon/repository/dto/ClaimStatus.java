package com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto;

import com.bytedance.covode.number.Covode;

public final class ClaimStatus {
    public static final ClaimStatus INSTANCE = new ClaimStatus();

    private ClaimStatus() {
    }

    static {
        Covode.recordClassIndex(53637);
    }
}

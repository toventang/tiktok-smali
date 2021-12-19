package com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto;

import com.bytedance.covode.number.Covode;

public final class ClaimableUserType {
    public static final ClaimableUserType INSTANCE = new ClaimableUserType();

    private ClaimableUserType() {
    }

    static {
        Covode.recordClassIndex(53642);
    }
}

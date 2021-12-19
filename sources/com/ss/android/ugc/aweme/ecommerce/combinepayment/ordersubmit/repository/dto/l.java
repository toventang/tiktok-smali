package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;

public final class l {
    static {
        Covode.recordClassIndex(53131);
    }

    public static final int a(PackedSku packedSku) {
        Integer skuAmount;
        if (packedSku == null || (skuAmount = packedSku.getSkuAmount()) == null) {
            return 1;
        }
        return skuAmount.intValue();
    }
}

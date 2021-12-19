package com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.api.model.a;
import java.io.Serializable;

public final class GetEntranceInfoResponse extends a<TradeEntranceInfo> implements Serializable {
    static {
        Covode.recordClassIndex(53980);
    }

    public GetEntranceInfoResponse(int i2, String str, TradeEntranceInfo tradeEntranceInfo) {
        super(i2, str, tradeEntranceInfo);
    }
}

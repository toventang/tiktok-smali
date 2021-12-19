package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.api.model.a;
import java.io.Serializable;

public final class BindInfoResponse extends a<BindInfoResponseData> implements Serializable {
    static {
        Covode.recordClassIndex(53370);
    }

    public BindInfoResponse(int i2, String str, BindInfoResponseData bindInfoResponseData) {
        super(i2, str, bindInfoResponseData);
    }
}

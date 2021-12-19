package com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.api.model.a;
import java.io.Serializable;

public final class ListOrderTabResponse extends a<ListOrderTabData> implements Serializable {
    static {
        Covode.recordClassIndex(53983);
    }

    public ListOrderTabResponse(int i2, String str, ListOrderTabData listOrderTabData) {
        super(i2, str, listOrderTabData);
    }
}

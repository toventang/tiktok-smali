package com.ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;

public final class ImageResponse extends BaseNetResponse {
    private AfrResponse data;

    static {
        Covode.recordClassIndex(91985);
    }

    public final AfrResponse getData() {
        return this.data;
    }

    public final void setData(AfrResponse afrResponse) {
        this.data = afrResponse;
    }
}

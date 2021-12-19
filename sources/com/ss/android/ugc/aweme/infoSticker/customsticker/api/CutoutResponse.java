package com.ss.android.ugc.aweme.infoSticker.customsticker.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;

public final class CutoutResponse extends BaseNetResponse {
    private CutoutResult data;

    static {
        Covode.recordClassIndex(67067);
    }

    public final CutoutResult getData() {
        return this.data;
    }

    public final void setData(CutoutResult cutoutResult) {
        this.data = cutoutResult;
    }
}

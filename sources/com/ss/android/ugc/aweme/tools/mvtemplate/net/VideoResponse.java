package com.ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;

public final class VideoResponse extends BaseNetResponse {
    private VideoItemInfo data;

    static {
        Covode.recordClassIndex(91989);
    }

    public final VideoItemInfo getData() {
        return this.data;
    }

    public final void setData(VideoItemInfo videoItemInfo) {
        this.data = videoItemInfo;
    }
}

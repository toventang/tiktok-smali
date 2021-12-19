package com.ss.android.ugc.aweme.services.publish;

import com.bytedance.covode.number.Covode;

public interface GoodsPublishModel {
    static {
        Covode.recordClassIndex(79769);
    }

    String getGoodsDraftId();
}

package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

interface PreloadFetcher {
    static {
        Covode.recordClassIndex(64054);
    }

    List<UrlModel> fetchPreload();
}

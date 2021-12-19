package com.ss.android.ugc.aweme.base;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.Collections;

public final class v {
    static {
        Covode.recordClassIndex(42147);
    }

    public static l a(UrlModel urlModel) {
        if (urlModel == null) {
            return new l("", Collections.emptyList());
        }
        return new l(urlModel.getUri(), urlModel.getUrlList());
    }
}

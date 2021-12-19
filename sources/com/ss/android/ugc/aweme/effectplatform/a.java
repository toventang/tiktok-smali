package com.ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

public final class a {
    static {
        Covode.recordClassIndex(55987);
    }

    public static UrlModel a(com.ss.android.ugc.effectmanager.common.model.UrlModel urlModel) {
        UrlModel urlModel2 = new UrlModel();
        if (urlModel != null) {
            urlModel2.setUri(urlModel.getUri());
            urlModel2.setUrlList(new ArrayList(urlModel.getUrlList()));
        }
        return urlModel2;
    }
}

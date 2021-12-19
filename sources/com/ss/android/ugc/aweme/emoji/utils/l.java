package com.ss.android.ugc.aweme.emoji.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

public final class l {
    static {
        Covode.recordClassIndex(56224);
    }

    public static UrlModel a(String str, int i2, int i3) {
        if (str == null) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setHeight(i3);
        urlModel.setWidth(i2);
        urlModel.setUri(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        urlModel.setUrlList(arrayList);
        return urlModel;
    }
}

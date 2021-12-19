package com.ss.android.ugc.aweme.im.sdk.share.b.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareWebContent;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;

/* access modifiers changed from: package-private */
public final class d {
    static {
        Covode.recordClassIndex(66246);
    }

    public static BaseContent a(SharePackage sharePackage) {
        if (TextUtils.equals("web", sharePackage.f124590d)) {
            return ShareWebContent.fromSharePackage(sharePackage);
        }
        return null;
    }
}

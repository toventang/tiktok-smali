package com.ss.android.ugc.aweme.share.business;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;

public final class d {
    static {
        Covode.recordClassIndex(81042);
    }

    public static final Aweme a(SharePackage sharePackage) {
        String str = "";
        l.d(sharePackage, str);
        String string = sharePackage.f124595i.getString("aid", str);
        if (string != null) {
            str = string;
        }
        return AwemeService.b().d(str);
    }
}

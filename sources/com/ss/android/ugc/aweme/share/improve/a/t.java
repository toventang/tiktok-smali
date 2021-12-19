package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;

public final class t extends af {
    static {
        Covode.recordClassIndex(81256);
    }

    @Override // com.ss.android.ugc.aweme.share.improve.a.af, com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        Aweme d2 = AwemeService.b().d(sharePackage.f124595i.getString("aweme_id"));
        if (d2 != null) {
            ShareDependService.a.a().c(context, d2);
            super.a(context, sharePackage);
        }
    }
}

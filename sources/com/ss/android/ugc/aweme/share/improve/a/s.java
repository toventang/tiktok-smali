package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;

public final class s extends d {
    static {
        Covode.recordClassIndex(81255);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(String str) {
        super(str, true);
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.share.improve.a.d, com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        Aweme d2 = AwemeService.b().d(sharePackage.f124595i.getString("aweme_id"));
        if (d2 != null) {
            ShareDependService.a.a().b(context, d2);
            super.a(context, sharePackage);
        }
    }
}

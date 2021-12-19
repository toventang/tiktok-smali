package com.ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.improve.c.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;

public final class l extends k {

    /* renamed from: a  reason: collision with root package name */
    private final c f124046a;

    static {
        Covode.recordClassIndex(81445);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Activity activity, c cVar) {
        super(activity, cVar);
        h.f.b.l.d(activity, "");
        h.f.b.l.d(cVar, "");
        this.f124046a = cVar;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.k, com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(sharePackage, "");
        Aweme b2 = AwemeService.b().b(this.f124046a.M);
        if (b2 != null) {
            a.a().b(b.a(context), com.ss.android.ugc.aweme.report.b.a(b2, "live_ad", this.f124046a.f22967c, "ad"));
        }
    }
}

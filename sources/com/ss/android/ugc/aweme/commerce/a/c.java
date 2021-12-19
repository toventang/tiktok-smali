package com.ss.android.ugc.aweme.commerce.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.commerce.a.a.a.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Aweme f73378a;

    static {
        Covode.recordClassIndex(45169);
    }

    c(Aweme aweme) {
        this.f73378a = aweme;
    }

    @Override // com.ss.android.ugc.aweme.commerce.a.a.a.b
    public final void a() {
        Aweme aweme = this.f73378a;
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            a.a("draw_ad", "viewable_2s", aweme.getAwemeRawAd()).a("is_piv", 1).b();
        }
    }
}

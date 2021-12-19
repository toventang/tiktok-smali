package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements n.a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f75804a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f75805b;

    static {
        Covode.recordClassIndex(46751);
    }

    r(Context context, Aweme aweme) {
        this.f75804a = context;
        this.f75805b = aweme;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.utils.n.a
    public final void sendLog(boolean z) {
        Context context = this.f75804a;
        Aweme aweme = this.f75805b;
        if (z) {
            j.d(context, aweme);
            a.a("draw_ad", "deeplink_success", aweme.getAwemeRawAd()).c();
            return;
        }
        j.e(context, aweme);
        a.a("draw_ad", "deeplink_failed", aweme.getAwemeRawAd()).c();
    }
}

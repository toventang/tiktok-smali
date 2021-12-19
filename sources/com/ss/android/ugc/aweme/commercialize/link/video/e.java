package com.ss.android.ugc.aweme.commercialize.link.video;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final CommerceTagLayout f74529a;

    /* renamed from: b  reason: collision with root package name */
    private final g f74530b;

    static {
        Covode.recordClassIndex(45959);
    }

    e(CommerceTagLayout commerceTagLayout, g gVar) {
        this.f74529a = commerceTagLayout;
        this.f74530b = gVar;
    }

    public final void run() {
        CommerceTagLayout commerceTagLayout = this.f74529a;
        g gVar = this.f74530b;
        commerceTagLayout.setVisibility(8);
        commerceTagLayout.setAlpha(1.0f);
        gVar.c();
    }
}

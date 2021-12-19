package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.i.s;

final /* synthetic */ class dp implements s {

    /* renamed from: a  reason: collision with root package name */
    private final dn f94607a;

    static {
        Covode.recordClassIndex(60048);
    }

    dp(dn dnVar) {
        this.f94607a = dnVar;
    }

    @Override // com.ss.android.ugc.aweme.feed.i.s
    public final void a(Object obj) {
        dn dnVar = this.f94607a;
        if (dnVar.Q != null) {
            dnVar.Q.a("feed_internal_event", obj);
        }
    }
}

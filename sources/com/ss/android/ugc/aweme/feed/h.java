package com.ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;

final /* synthetic */ class h implements s {

    /* renamed from: a  reason: collision with root package name */
    private final g f93300a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f93301b;

    static {
        Covode.recordClassIndex(59149);
    }

    h(g gVar, Aweme aweme) {
        this.f93300a = gVar;
        this.f93301b = aweme;
    }

    @Override // com.ss.android.ugc.aweme.feed.i.s
    public final void a(Object obj) {
        this.f93300a.a(this.f93301b, (ag) obj);
    }
}

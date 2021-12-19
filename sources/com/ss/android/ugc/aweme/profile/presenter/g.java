package com.ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.story.j.a;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f116576a;

    static {
        Covode.recordClassIndex(75315);
    }

    g(b bVar) {
        this.f116576a = bVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        b bVar = this.f116576a;
        a.b("AwemeModel", "fetchListRx: finished");
        n.a().a(bVar.mHandler, new e((FeedItemList) obj), 0);
    }
}

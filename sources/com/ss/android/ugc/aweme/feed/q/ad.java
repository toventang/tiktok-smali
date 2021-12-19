package com.ss.android.ugc.aweme.feed.q;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.i.a;
import f.a.d.f;
import java.util.Map;

final /* synthetic */ class ad implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Map f93751a;

    /* renamed from: b  reason: collision with root package name */
    private final a f93752b;

    static {
        Covode.recordClassIndex(59644);
    }

    ad(Map map, a aVar) {
        this.f93751a = map;
        this.f93752b = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        ((aj) obj).a(this.f93751a);
    }
}

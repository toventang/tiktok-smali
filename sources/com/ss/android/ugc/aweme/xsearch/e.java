package com.ss.android.ugc.aweme.xsearch;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.e.a;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.flowfeed.a.b;

public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public b f145155a;

    /* renamed from: b  reason: collision with root package name */
    public final b.d f145156b;

    static {
        Covode.recordClassIndex(94917);
    }

    public e(b.d dVar) {
        this.f145156b = dVar;
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.a.b
    public final void a(Aweme aweme) {
        b.d dVar = this.f145156b;
        if (dVar != null) {
            a.d(dVar);
        }
        com.ss.android.ugc.aweme.flowfeed.a.b bVar = this.f145155a;
        if (bVar != null) {
            bVar.a(aweme);
        }
    }
}

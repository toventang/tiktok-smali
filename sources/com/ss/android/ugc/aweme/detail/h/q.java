package com.ss.android.ugc.aweme.detail.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.helper.g;

/* access modifiers changed from: package-private */
public final /* synthetic */ class q implements g.b {

    /* renamed from: a  reason: collision with root package name */
    private final b f79748a;

    static {
        Covode.recordClassIndex(49558);
    }

    q(b bVar) {
        this.f79748a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.feed.helper.g.b
    public final void a() {
        b bVar = this.f79748a;
        if (bVar.N != null) {
            bVar.N.post(new l(bVar));
        }
    }
}

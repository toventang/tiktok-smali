package com.ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.story.j.a;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f116577a;

    static {
        Covode.recordClassIndex(75316);
    }

    h(b bVar) {
        this.f116577a = bVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        b bVar = this.f116577a;
        Throwable th = (Throwable) obj;
        a.a("AwemeModel", "fetchListRx: " + com.ss.android.ugc.aweme.story.d.a.a(th), th);
        n.a().a(bVar.mHandler, new m(th), 0);
    }
}

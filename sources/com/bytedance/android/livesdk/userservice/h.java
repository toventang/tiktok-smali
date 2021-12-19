package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.livesdkapi.depend.f.a;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class h implements a {

    /* renamed from: a  reason: collision with root package name */
    private final c f22089a;

    static {
        Covode.recordClassIndex(13008);
    }

    h(c cVar) {
        this.f22089a = cVar;
    }

    @Override // com.bytedance.android.livesdkapi.depend.f.a
    public final void a(com.bytedance.android.livesdkapi.depend.model.b.a aVar) {
        this.f22089a.f22062e.onNext(aVar);
        com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdkapi.depend.b.a(aVar));
    }
}

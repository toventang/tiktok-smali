package com.ss.android.ugc.aweme.initializer;

import com.bytedance.android.livesdkapi.depend.model.a.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.am;

final /* synthetic */ class k implements g {

    /* renamed from: a  reason: collision with root package name */
    private final am.a f104740a;

    static {
        Covode.recordClassIndex(67146);
    }

    k(am.a aVar) {
        this.f104740a = aVar;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.g
    public final void onStartLive() {
        this.f104740a.a();
    }
}

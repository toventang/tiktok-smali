package com.ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final IHostAction.a f108470a;

    static {
        Covode.recordClassIndex(69510);
    }

    g(IHostAction.a aVar) {
        this.f108470a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f108470a.a("Server error");
    }
}

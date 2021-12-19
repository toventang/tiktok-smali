package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.livesdkapi.depend.model.a.e;
import com.bytedance.covode.number.Covode;
import h.f.b.p;

final /* synthetic */ class h extends p {
    static {
        Covode.recordClassIndex(4177);
    }

    h(d dVar) {
        super(dVar, d.class, "mLiveParamsListener", "getMLiveParamsListener()Lcom/bytedance/android/livesdkapi/depend/model/broadcast/ILiveParamsListener;", 0);
    }

    @Override // h.f.b.p, h.k.j
    public final Object get() {
        return ((d) this.receiver).f8169j;
    }

    @Override // h.f.b.p
    public final void set(Object obj) {
        ((d) this.receiver).f8169j = (e) obj;
    }
}

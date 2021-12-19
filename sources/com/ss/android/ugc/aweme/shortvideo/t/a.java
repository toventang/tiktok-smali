package com.ss.android.ugc.aweme.shortvideo.t;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.bb;
import h.f.b.l;

public final class a implements bb {
    static {
        Covode.recordClassIndex(85901);
    }

    @Override // com.ss.android.ugc.aweme.port.in.bb
    public final void a(bb.a aVar) {
        aVar.onSuccess();
    }

    @Override // com.ss.android.ugc.aweme.port.in.bb
    public final void a(String str, bb.a aVar) {
        l.d(str, "");
        aVar.onSuccess();
    }
}

package com.bytedance.android.live.publicscreen.impl.d.a;

import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.android.livesdk.model.message.n;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b implements com.bytedance.android.live.publicscreen.a.b<n> {
    static {
        Covode.recordClassIndex(6770);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.sdk.message.data.IMessage, com.bytedance.android.live.publicscreen.a.g] */
    @Override // com.bytedance.android.live.publicscreen.a.b
    public final /* synthetic */ boolean a(n nVar, g gVar) {
        n nVar2 = nVar;
        l.d(nVar2, "");
        l.d(gVar, "");
        if (nVar2.f19656a == 1 || nVar2.f19656a == 2) {
            return true;
        }
        return false;
    }
}

package com.bytedance.android.live.publicscreen.impl.d.a;

import com.bytedance.android.live.publicscreen.a.b;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.android.livesdk.model.message.az;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e implements b<az> {
    static {
        Covode.recordClassIndex(6773);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.sdk.message.data.IMessage, com.bytedance.android.live.publicscreen.a.g] */
    @Override // com.bytedance.android.live.publicscreen.a.b
    public final /* synthetic */ boolean a(az azVar, g gVar) {
        az azVar2 = azVar;
        l.d(azVar2, "");
        l.d(gVar, "");
        if (azVar2.f19236h == 1) {
            return false;
        }
        com.bytedance.android.live.publicscreen.impl.f.b.a(azVar2, "MemberMessage discarded because it's not an enter message.");
        return true;
    }
}

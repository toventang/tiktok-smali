package com.bytedance.android.live.liveinteract.match.e.b;

import com.bytedance.android.live.liveinteract.match.d.a.b;
import com.bytedance.android.live.publicscreen.a.c;
import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.android.livesdk.model.message.ao;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements c<ao> {
    static {
        Covode.recordClassIndex(5781);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.android.livesdk.ac.b.a] */
    @Override // com.bytedance.android.live.publicscreen.a.c
    public final /* synthetic */ h a(ao aoVar) {
        ao aoVar2 = aoVar;
        l.d(aoVar2, "");
        int i2 = aoVar2.f19174a;
        if (i2 == 0 || i2 == 4) {
            return new com.bytedance.android.live.liveinteract.match.d.a.a(aoVar2);
        }
        return new b(aoVar2);
    }
}

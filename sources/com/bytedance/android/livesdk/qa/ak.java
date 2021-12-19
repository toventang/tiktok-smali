package com.bytedance.android.livesdk.qa;

import com.bytedance.android.live.m.c;
import com.bytedance.android.live.publicscreen.a.b;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.android.livesdk.model.message.bl;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ak implements b<bl> {
    static {
        Covode.recordClassIndex(12019);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.sdk.message.data.IMessage, com.bytedance.android.live.publicscreen.a.g] */
    @Override // com.bytedance.android.live.publicscreen.a.b
    public final /* synthetic */ boolean a(bl blVar, g gVar) {
        l.d(blVar, "");
        l.d(gVar, "");
        if (!c.a(gVar.f12208l)) {
            return true;
        }
        if (!gVar.f12205i) {
            return false;
        }
        com.bytedance.android.live.p.l.QUESTION.showRedDot(gVar.f12208l);
        return false;
    }
}

package com.bytedance.android.live.publicscreen.impl.d.a;

import com.bytedance.android.live.publicscreen.a.b;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastLiveAudienceIntroSetting;
import com.bytedance.android.livesdk.model.message.au;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d implements b<au> {
    static {
        Covode.recordClassIndex(6772);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.sdk.message.data.IMessage, com.bytedance.android.live.publicscreen.a.g] */
    @Override // com.bytedance.android.live.publicscreen.a.b
    public final /* synthetic */ boolean a(au auVar, g gVar) {
        l.d(auVar, "");
        l.d(gVar, "");
        if (!BroadcastLiveAudienceIntroSetting.INSTANCE.disable() || p.f()) {
            return false;
        }
        return true;
    }
}

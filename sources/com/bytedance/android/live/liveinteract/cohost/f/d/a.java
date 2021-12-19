package com.bytedance.android.live.liveinteract.cohost.f.d;

import com.bytedance.android.live.liveinteract.api.ai;
import com.bytedance.android.live.liveinteract.platform.common.g.h;
import com.bytedance.android.live.publicscreen.a.b;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.android.livesdk.model.message.ak;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;

public final class a implements b<ak> {
    static {
        Covode.recordClassIndex(5382);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.sdk.message.data.IMessage, com.bytedance.android.live.publicscreen.a.g] */
    @Override // com.bytedance.android.live.publicscreen.a.b
    public final /* synthetic */ boolean a(ak akVar, g gVar) {
        Integer num;
        ak akVar2 = akVar;
        l.d(akVar2, "");
        l.d(gVar, "");
        DataChannel dataChannel = gVar.f12208l;
        if (dataChannel != null) {
            num = (Integer) dataChannel.b(ai.class);
        } else {
            num = null;
        }
        if (num == null || (num.intValue() != 1 && num.intValue() != 3)) {
            return true;
        }
        num.intValue();
        if (akVar2.f19151g == 2) {
            h.a(false, true);
        } else {
            h.a(false, false);
        }
        return false;
    }
}

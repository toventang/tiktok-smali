package com.bytedance.android.live.publicscreen.impl.d.a;

import com.bytedance.android.live.publicscreen.a.b;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements b<com.bytedance.android.livesdk.model.message.a> {
    static {
        Covode.recordClassIndex(6769);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.sdk.message.data.IMessage, com.bytedance.android.live.publicscreen.a.g] */
    @Override // com.bytedance.android.live.publicscreen.a.b
    public final /* synthetic */ boolean a(com.bytedance.android.livesdk.model.message.a aVar, g gVar) {
        com.bytedance.android.livesdk.model.message.a aVar2 = aVar;
        l.d(aVar2, "");
        l.d(gVar, "");
        if (aVar2.f19111g && aVar2.O != null && aVar2.O.f23218j != null) {
            return false;
        }
        com.bytedance.android.live.publicscreen.impl.f.b.a(aVar2, "AssetMessage discarded because show_message field is false or displayText field is empty.");
        return true;
    }
}

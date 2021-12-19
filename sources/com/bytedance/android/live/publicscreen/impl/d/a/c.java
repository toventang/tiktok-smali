package com.bytedance.android.live.publicscreen.impl.d.a;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.publicscreen.a.b;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.livesetting.gift.SuppressGiftTextMessagesSetting;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c implements b<y> {
    static {
        Covode.recordClassIndex(6771);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.sdk.message.data.IMessage, com.bytedance.android.live.publicscreen.a.g] */
    @Override // com.bytedance.android.live.publicscreen.a.b
    public final /* synthetic */ boolean a(y yVar, g gVar) {
        Room room;
        y yVar2 = yVar;
        l.d(yVar2, "");
        l.d(gVar, "");
        u findGiftById = ((IGiftService) a.a(IGiftService.class)).findGiftById(yVar2.f19707i);
        if (findGiftById != null) {
            if (findGiftById.f19764g && yVar2.f19711m == 0) {
                com.bytedance.android.live.publicscreen.impl.f.b.a(yVar2, "GiftMessage discarded because it's not the end message for the repeated gifts.");
                return true;
            } else if (findGiftById.f19762e == 11) {
                com.bytedance.android.live.publicscreen.impl.f.b.a(yVar2, "GiftMessage discarded because it's type is game.");
                return true;
            }
        }
        if (!SuppressGiftTextMessagesSetting.INSTANCE.getValue() || (room = gVar.f12206j) == null || room.giftMessageStyle != 1) {
            return false;
        }
        return true;
    }
}

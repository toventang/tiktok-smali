package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class cg implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Room f16062a;

    static {
        Covode.recordClassIndex(8886);
    }

    cg(Room room) {
        this.f16062a = room;
    }

    public final void run() {
        Room room = this.f16062a;
        ((IGiftService) a.a(IGiftService.class)).getFirstRechargeManager().a(room.getId(), room.getOwnerUserId());
        ((IGiftService) a.a(IGiftService.class)).clearFastGift(room.getId());
    }
}

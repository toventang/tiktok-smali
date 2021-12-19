package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class cd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Room f16059a;

    static {
        Covode.recordClassIndex(8883);
    }

    cd(Room room) {
        this.f16059a = room;
    }

    public final void run() {
        Room room = this.f16059a;
        ((IGiftService) a.a(IGiftService.class)).getFirstRechargeManager().a(room.getId(), room.getOwnerUserId());
    }
}

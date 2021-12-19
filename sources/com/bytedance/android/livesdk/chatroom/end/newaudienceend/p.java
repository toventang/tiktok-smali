package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import android.content.Context;
import com.bytedance.android.livesdk.chatroom.g.k;
import com.bytedance.android.livesdk.event.e;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableEnterRoomOptFromLiveAudienceEndSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.a;
import com.bytedance.android.livesdkapi.host.j;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class p {
    static {
        Covode.recordClassIndex(8560);
    }

    static void a(Room room, Context context, DataChannel dataChannel, boolean z) {
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f23298b.f23315g = room.getLog_pb();
        enterRoomConfig.f23298b.f23309a = room.getRequestId();
        enterRoomConfig.f23299c.J = "live_end";
        enterRoomConfig.f23299c.L = "live_cover";
        EnterRoomConfig a2 = k.a(enterRoomConfig, dataChannel);
        a2.f23299c.R = room.getId();
        a2.f23299c.S = room.getStreamType();
        a2.f23298b.f23319k = room.getUserFrom();
        a2.f23299c.r = room.getOrientation();
        Boolean valueOf = Boolean.valueOf(EnableEnterRoomOptFromLiveAudienceEndSetting.INSTANCE.getValue());
        if (valueOf != null && valueOf.booleanValue()) {
            a2 = a.a(room, a2);
        }
        if (!com.bytedance.android.livesdk.chatroom.backroom.d.a.a()) {
            ((j) com.bytedance.android.live.t.a.a(j.class)).b(context, a2);
        } else if (z) {
            com.bytedance.android.livesdk.an.a.a().a(new e(room.getId(), a2, "jump_source_live_end"));
        } else {
            com.bytedance.android.livesdk.an.a.a().a(new e(room.getId(), a2));
        }
        com.bytedance.android.livesdk.live.c.a.a().f18672a = new com.bytedance.android.livesdk.live.a.a("live_end");
    }
}

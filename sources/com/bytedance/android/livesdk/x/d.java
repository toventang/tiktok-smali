package com.bytedance.android.livesdk.x;

import android.text.TextUtils;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.model.message.ae;
import com.bytedance.android.livesdk.model.message.by;
import com.bytedance.android.livesdk.rank.api.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;

public final class d implements IInterceptor {
    static {
        Covode.recordClassIndex(13534);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IInterceptor
    public final boolean onMessage(IMessage iMessage) {
        if ((iMessage instanceof by) && TextUtils.equals(((by) iMessage).f19392k, "hourly_rank")) {
            Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
            if (room == null || !((com.bytedance.android.livesdk.rank.api.d) a.a(com.bytedance.android.livesdk.rank.api.d.class)).isRankEnabledInTheRoom(j.HOURLY_RANK.getType(), room.getId())) {
                return true;
            }
            return false;
        } else if (!(iMessage instanceof ae)) {
            return false;
        } else {
            if (!((com.bytedance.android.livesdk.rank.api.d) a.a(com.bytedance.android.livesdk.rank.api.d.class)).isRankEnabled(j.HOURLY_RANK.getType()) || ((com.bytedance.android.live.j.a) a.a(com.bytedance.android.live.j.a.class)).isMicRoomForCurrentRoom()) {
                return true;
            }
            return false;
        }
    }
}

package com.bytedance.android.live.liveinteract.platform.common.api;

import com.bytedance.android.live.network.e;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import f.a.t;

public final class a {
    static {
        Covode.recordClassIndex(6494);
    }

    public static t<d<Void>> a(int i2, boolean z) {
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room == null) {
            return null;
        }
        long id = room.getId();
        String secUid = room.getOwner().getSecUid();
        if (i2 == 0) {
            return ((LinkApi) e.a().a(LinkApi.class)).updateAnchorLinkSetting(id, secUid, 0, z, false, false, false, false);
        }
        if (i2 == 2) {
            return ((LinkApi) e.a().a(LinkApi.class)).updateAnchorLinkSetting(id, secUid, 2, false, false, z, false, false);
        }
        if (i2 == 4) {
            return ((LinkApi) e.a().a(LinkApi.class)).updateAnchorLinkSetting(id, secUid, 4, false, false, false, false, true);
        }
        return null;
    }
}

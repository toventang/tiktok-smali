package com.bytedance.android.livesdk.utils;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.j.dn;
import com.bytedance.android.livesdk.model.ba;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public static final ac f22223a = new ac();

    private ac() {
    }

    static {
        Covode.recordClassIndex(13120);
    }

    public static final String a(Room room, DataChannel dataChannel) {
        User user;
        Long l2;
        ba userAttr;
        Long l3 = null;
        if (dataChannel != null) {
            user = (User) dataChannel.b(dn.class);
            if (user != null) {
                l2 = Long.valueOf(user.getId());
            }
            l2 = null;
        } else {
            user = null;
            l2 = null;
        }
        if (room != null) {
            l3 = Long.valueOf(room.getOwnerUserId());
        }
        if (l.a(l2, l3)) {
            return "anchor";
        }
        if (user == null || (userAttr = user.getUserAttr()) == null || !userAttr.f19030b) {
            return "viewer";
        }
        return "admin";
    }
}

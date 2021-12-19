package com.bytedance.android.livesdk.at;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

public final class b implements c {
    static {
        Covode.recordClassIndex(7829);
    }

    @Override // com.bytedance.android.livesdk.at.c
    public final CharSequence a(Room room, User user) {
        if (user == null) {
            return "";
        }
        if (room == null) {
            return user.getNickName();
        }
        if (room.getOwnerUserId() == user.getId()) {
            return user.getDisplayId();
        }
        if (room.getNameMode() == 1) {
            return user.getNickName();
        }
        return user.getDisplayId();
    }
}

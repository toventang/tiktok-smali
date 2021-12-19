package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class n {
    static {
        Covode.recordClassIndex(57818);
    }

    public static final int a(LiveRoomStruct liveRoomStruct) {
        l.d(liveRoomStruct, "");
        if (liveRoomStruct.owner == null) {
            return -1;
        }
        User user = liveRoomStruct.owner;
        l.b(user, "");
        int followStatus = user.getFollowStatus();
        if (followStatus == 0 || followStatus == 1 || followStatus == 2) {
            return followStatus;
        }
        User user2 = liveRoomStruct.owner;
        l.b(user2, "");
        if (user2.getFollowerStatus() == 0) {
            return 0;
        }
        return 3;
    }
}

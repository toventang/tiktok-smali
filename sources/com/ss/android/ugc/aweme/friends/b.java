package com.ss.android.ugc.aweme.friends;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.api.SummonFriendApi;
import com.ss.android.ugc.aweme.friends.model.RecentFriendModel;
import f.a.t;

public final class b {
    static {
        Covode.recordClassIndex(61431);
    }

    public static t<RecentFriendModel> a(SummonFriendApi.SummonFriendService summonFriendService, int i2, int i3) {
        return summonFriendService.queryFollowFriends4At(i2, i3);
    }
}

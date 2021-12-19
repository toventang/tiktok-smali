package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;

final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final FollowLiveVideoViewHolder f91887a;

    static {
        Covode.recordClassIndex(57831);
    }

    t(FollowLiveVideoViewHolder followLiveVideoViewHolder) {
        this.f91887a = followLiveVideoViewHolder;
    }

    public final void run() {
        int i2;
        FollowLiveVideoViewHolder followLiveVideoViewHolder = this.f91887a;
        if (!followLiveVideoViewHolder.f91494f) {
            followLiveVideoViewHolder.f91494f = true;
            if (followLiveVideoViewHolder.f91489a != null) {
                d a2 = new d().a("enter_from_merge", "homepage_follow").a("action_type", "click").a("anchor_id", followLiveVideoViewHolder.f91489a.ownerUserId).a("room_id", followLiveVideoViewHolder.f91489a.id);
                RoomStruct roomStruct = followLiveVideoViewHolder.f91489a;
                if (roomStruct.owner != null) {
                    i2 = roomStruct.owner.getFollowStatus();
                    if (!(i2 == 0 || i2 == 1 || i2 == 2)) {
                        i2 = roomStruct.owner.getFollowerStatus() == 0 ? 0 : 3;
                    }
                } else {
                    i2 = -1;
                }
                d a3 = a2.a("follow_status", i2).a("enter_method", "live_window");
                if (followLiveVideoViewHolder.f91515j != null) {
                    a3.a("request_id", followLiveVideoViewHolder.f91515j.getRequestId()).a("order", followLiveVideoViewHolder.f91515j.getAwemePosition());
                }
                r.a("livesdk_live_show", a3.f66730a);
            }
            followLiveVideoViewHolder.a(followLiveVideoViewHolder.f91492d, followLiveVideoViewHolder.f91493e);
        }
    }
}

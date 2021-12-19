package com.bytedance.android.livesdk.userinfowidget;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.u.h;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class l implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f21974a;

    static {
        Covode.recordClassIndex(12937);
    }

    l(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f21974a = liveRoomUserInfoWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f21974a;
        User user = (User) obj;
        if (liveRoomUserInfoWidget.isViewValid()) {
            if (!h.b()) {
                user = User.from(user);
            }
            ((Room) liveRoomUserInfoWidget.dataChannel.b(df.class)).getOwner().setFollowInfo(user.getFollowInfo());
            if (user.isFollowing()) {
                liveRoomUserInfoWidget.a(LiveRoomUserInfoWidget.a.FOLLOWED);
            } else if (liveRoomUserInfoWidget.u) {
                liveRoomUserInfoWidget.a();
            } else {
                liveRoomUserInfoWidget.a(LiveRoomUserInfoWidget.a.UNFOLLOW);
                n.a(liveRoomUserInfoWidget.f21933f, 0);
            }
        }
    }
}

package com.bytedance.android.livesdk.userinfowidget;

import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.z;

final /* synthetic */ class k implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f21973a;

    static {
        Covode.recordClassIndex(12936);
    }

    k(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f21973a = liveRoomUserInfoWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f21973a;
        SubscribeBadge subscribeBadge = (SubscribeBadge) obj;
        if (!(liveRoomUserInfoWidget.q == null || liveRoomUserInfoWidget.q.getOwner() == null || liveRoomUserInfoWidget.q.getOwner().getSubscribeInfo() == null)) {
            liveRoomUserInfoWidget.q.getOwner().getSubscribeInfo().setSubscribeBadge(subscribeBadge);
            liveRoomUserInfoWidget.q.getOwner().setSubscribeStatus(true);
            liveRoomUserInfoWidget.a(LiveRoomUserInfoWidget.a.SUBSCRIBED);
            ao.a(p.a(liveRoomUserInfoWidget.context), y.a((int) R.string.eom, liveRoomUserInfoWidget.f21933f.getText()), 0);
        }
        return z.f158842a;
    }
}

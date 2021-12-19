package com.bytedance.android.livesdk.userinfowidget;

import android.view.View;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f21976a;

    static {
        Covode.recordClassIndex(12939);
    }

    n(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f21976a = liveRoomUserInfoWidget;
    }

    public final void onClick(View view) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f21976a;
        liveRoomUserInfoWidget.a(view);
        if (liveRoomUserInfoWidget.q != null && liveRoomUserInfoWidget.q.getOwner() != null && liveRoomUserInfoWidget.q.getOwner().getSubscribeInfo() != null) {
            b.a.a("livesdk_subscribe_icon_click").a("anchor_id", liveRoomUserInfoWidget.q.getOwnerUserId()).a("room_id", liveRoomUserInfoWidget.q.getId()).a("enter_from_merge", e.a()).a("enter_method", e.d()).a("action_type", "click").a("request_id", e.k()).a("video_id", e.f()).a("click_position", "live_left_corner").b();
        }
    }
}

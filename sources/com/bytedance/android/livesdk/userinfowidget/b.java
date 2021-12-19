package com.bytedance.android.livesdk.userinfowidget;

import android.view.View;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f21964a;

    static {
        Covode.recordClassIndex(12927);
    }

    b(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f21964a = liveRoomUserInfoWidget;
    }

    public final void onClick(View view) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f21964a;
        if (!liveRoomUserInfoWidget.s && liveRoomUserInfoWidget.z != null && liveRoomUserInfoWidget.z.isMicRoomForCurrentRoom() && liveRoomUserInfoWidget.q != null && liveRoomUserInfoWidget.q.officialChannelInfo != null && liveRoomUserInfoWidget.q.officialChannelInfo.f18978a != null) {
            UserProfileEvent userProfileEvent = new UserProfileEvent(liveRoomUserInfoWidget.q.officialChannelInfo.f18978a.getId());
            userProfileEvent.mSource = "video_head";
            a.a().a(userProfileEvent);
        } else if (liveRoomUserInfoWidget.q != null && liveRoomUserInfoWidget.q.getOwner() != null) {
            UserProfileEvent userProfileEvent2 = new UserProfileEvent(liveRoomUserInfoWidget.q.getOwner().getId());
            userProfileEvent2.mReportType = "report_anchor";
            userProfileEvent2.mSource = "video_head";
            a.a().a(userProfileEvent2);
        }
    }
}

package com.bytedance.android.livesdk.userinfowidget;

import android.view.View;
import com.bytedance.android.live.core.f.s;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f21965a;

    static {
        Covode.recordClassIndex(12928);
    }

    c(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f21965a = liveRoomUserInfoWidget;
    }

    public final void onClick(View view) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f21965a;
        liveRoomUserInfoWidget.a();
        if (s.b(liveRoomUserInfoWidget.dataChannel) && !liveRoomUserInfoWidget.t && liveRoomUserInfoWidget.dataChannel != null) {
            liveRoomUserInfoWidget.dataChannel.c(com.bytedance.android.live.gift.s.class);
        }
    }
}

package com.bytedance.android.livesdk.userinfowidget;

import com.bytedance.android.live.r.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

public class aa implements a {
    static {
        Covode.recordClassIndex(12926);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.r.a
    public Class<? extends LiveRecyclableWidget> getGeneralUserInfoWidget() {
        return LiveRoomGeneralInfoWidget.class;
    }

    @Override // com.bytedance.android.live.r.a
    public Class<? extends LiveRecyclableWidget> getUserInfoWidget() {
        return LiveRoomUserInfoWidget.class;
    }
}

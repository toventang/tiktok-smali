package com.bytedance.android.livesdk.userinfowidget;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f21967a;

    static {
        Covode.recordClassIndex(12930);
    }

    e(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f21967a = liveRoomUserInfoWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        this.f21967a.r = (User) obj;
        return z.f158842a;
    }
}

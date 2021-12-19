package com.bytedance.android.livesdk.userinfowidget;

import com.bytedance.android.livesdk.chatroom.c.t;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import f.a.a.a.a;
import h.f.a.b;
import h.z;

final /* synthetic */ class f implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f21968a;

    static {
        Covode.recordClassIndex(12931);
    }

    f(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f21968a = liveRoomUserInfoWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f21968a;
        if (((t) obj).f15148a) {
            long id = liveRoomUserInfoWidget.q.getOwner().getId();
            if (!(liveRoomUserInfoWidget.s || liveRoomUserInfoWidget.z == null || !liveRoomUserInfoWidget.z.isMicRoomForCurrentRoom() || liveRoomUserInfoWidget.q == null || liveRoomUserInfoWidget.q.officialChannelInfo == null || liveRoomUserInfoWidget.q.officialChannelInfo.f18978a == null)) {
                id = liveRoomUserInfoWidget.q.officialChannelInfo.f18978a.getId();
            }
            u.a().b().b(id).a(a.a(f.a.a.b.a.f157156a)).a(liveRoomUserInfoWidget.getAutoUnbindTransformer()).a(new l(liveRoomUserInfoWidget), m.f21975a);
        }
        return z.f158842a;
    }
}

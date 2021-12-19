package com.bytedance.android.livesdk.userinfowidget;

import com.bytedance.android.live.base.model.user.b;
import com.bytedance.android.livesdkapi.e.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class w implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f21988a;

    static {
        Covode.recordClassIndex(12948);
    }

    w(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f21988a = liveRoomUserInfoWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f21988a.dataChannel.b(a.class, Long.valueOf(((b) obj).getFanTicketCount()));
    }
}

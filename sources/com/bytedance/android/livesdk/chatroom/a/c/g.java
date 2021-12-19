package com.bytedance.android.livesdk.chatroom.a.c;

import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.barrage.a.a;

final /* synthetic */ class g implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private final UserProfileEvent f14918a;

    static {
        Covode.recordClassIndex(8265);
    }

    g(UserProfileEvent userProfileEvent) {
        this.f14918a = userProfileEvent;
    }

    @Override // com.ss.ugc.live.barrage.a.a.b
    public final void a() {
        com.bytedance.android.livesdk.an.a.a().a(this.f14918a);
    }
}

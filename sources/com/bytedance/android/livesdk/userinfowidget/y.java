package com.bytedance.android.livesdk.userinfowidget;

import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class y implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LiveRoomUserInfoWidget.AnonymousClass2 f21990a;

    static {
        Covode.recordClassIndex(12950);
    }

    y(LiveRoomUserInfoWidget.AnonymousClass2 r1) {
        this.f21990a = r1;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        LiveRoomUserInfoWidget.AnonymousClass2 r2 = this.f21990a;
        if (LiveRoomUserInfoWidget.this.A == LiveRoomUserInfoWidget.a.FOLLOW_ANIM) {
            LiveRoomUserInfoWidget.this.a(LiveRoomUserInfoWidget.a.UNSUBSCRIBE);
        }
    }
}

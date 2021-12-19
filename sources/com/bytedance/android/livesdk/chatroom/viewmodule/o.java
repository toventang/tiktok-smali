package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.banner.InRoomBannerManager;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class o implements f {

    /* renamed from: a  reason: collision with root package name */
    private final BottomRightBannerWidget f16514a;

    static {
        Covode.recordClassIndex(9152);
    }

    o(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f16514a = bottomRightBannerWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f16514a.a(((InRoomBannerManager.a) obj).f7357b);
    }
}

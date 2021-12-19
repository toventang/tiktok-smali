package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.liveinteract.api.b.k;
import com.bytedance.android.live.liveinteract.api.h;
import com.bytedance.covode.number.Covode;
import h.f.a.b;

final /* synthetic */ class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final BottomRightBannerWidget f16500a;

    static {
        Covode.recordClassIndex(9140);
    }

    c(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f16500a = bottomRightBannerWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BottomRightBannerWidget bottomRightBannerWidget = this.f16500a;
        k kVar = (k) bottomRightBannerWidget.dataChannel.b(h.class);
        if (kVar == null || !kVar.f9998a) {
            return null;
        }
        bottomRightBannerWidget.hide();
        return null;
    }
}

package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class m implements b {

    /* renamed from: a  reason: collision with root package name */
    private final BottomRightBannerWidget f16512a;

    static {
        Covode.recordClassIndex(9150);
    }

    m(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f16512a = bottomRightBannerWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BottomRightBannerWidget bottomRightBannerWidget = this.f16512a;
        bottomRightBannerWidget.f16253h = ((Boolean) obj).booleanValue();
        bottomRightBannerWidget.c();
        return z.f158842a;
    }
}

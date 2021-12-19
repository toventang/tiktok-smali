package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.covode.number.Covode;
import h.z;

final /* synthetic */ class b implements h.f.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final BottomRightBannerWidget f16480a;

    static {
        Covode.recordClassIndex(9117);
    }

    b(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f16480a = bottomRightBannerWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BottomRightBannerWidget bottomRightBannerWidget = this.f16480a;
        bottomRightBannerWidget.f16253h = ((Boolean) obj).booleanValue();
        bottomRightBannerWidget.c();
        return z.f158842a;
    }
}

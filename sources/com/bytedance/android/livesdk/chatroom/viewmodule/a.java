package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final BottomRightBannerWidget f16345a;

    static {
        Covode.recordClassIndex(9045);
    }

    a(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f16345a = bottomRightBannerWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BottomRightBannerWidget bottomRightBannerWidget = this.f16345a;
        bottomRightBannerWidget.f16252g = ((Boolean) obj).booleanValue();
        bottomRightBannerWidget.c();
        return z.f158842a;
    }
}

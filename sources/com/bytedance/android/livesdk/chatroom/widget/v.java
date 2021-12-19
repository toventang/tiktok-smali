package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class v implements b {

    /* renamed from: a  reason: collision with root package name */
    private final OrientationChangeWidget f16674a;

    static {
        Covode.recordClassIndex(9252);
    }

    v(OrientationChangeWidget orientationChangeWidget) {
        this.f16674a = orientationChangeWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        OrientationChangeWidget orientationChangeWidget = this.f16674a;
        if (((Boolean) obj).booleanValue()) {
            orientationChangeWidget.getView().setVisibility(4);
        } else {
            orientationChangeWidget.show();
        }
        return z.f158842a;
    }
}

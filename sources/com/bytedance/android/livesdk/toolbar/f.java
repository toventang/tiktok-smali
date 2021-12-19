package com.bytedance.android.livesdk.toolbar;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class f implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LiveToolbarWidget f21721a;

    static {
        Covode.recordClassIndex(12805);
    }

    f(LiveToolbarWidget liveToolbarWidget) {
        this.f21721a = liveToolbarWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        LiveToolbarWidget liveToolbarWidget = this.f21721a;
        if (((Boolean) obj).booleanValue()) {
            liveToolbarWidget.getView().setVisibility(4);
        } else {
            liveToolbarWidget.show();
        }
        return z.f158842a;
    }
}

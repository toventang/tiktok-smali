package com.bytedance.android.livesdk.toolbar;

import com.bytedance.covode.number.Covode;
import h.z;

final /* synthetic */ class b implements h.f.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final LiveAudienceToolbarWidget f21693a;

    static {
        Covode.recordClassIndex(12791);
    }

    b(LiveAudienceToolbarWidget liveAudienceToolbarWidget) {
        this.f21693a = liveAudienceToolbarWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        LiveAudienceToolbarWidget liveAudienceToolbarWidget = this.f21693a;
        if (((Boolean) obj).booleanValue()) {
            liveAudienceToolbarWidget.contentView.setVisibility(4);
        } else {
            liveAudienceToolbarWidget.contentView.setVisibility(0);
        }
        return z.f158842a;
    }
}

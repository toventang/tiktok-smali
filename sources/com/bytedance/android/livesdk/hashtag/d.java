package com.bytedance.android.livesdk.hashtag;

import com.bytedance.android.live.h.b;
import com.bytedance.android.live.p.f;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;

public class d implements b {
    static {
        Covode.recordClassIndex(10066);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.h.b
    public Class<? extends LiveRecyclableWidget> getAnchorHashTagWidget() {
        return BroadcastHashTagWidget.class;
    }

    @Override // com.bytedance.android.live.h.b
    public Class<? extends LiveRecyclableWidget> getAudienceHashTagWidget() {
        return AudienceHashTagWidget.class;
    }

    @Override // com.bytedance.android.live.h.b
    public f getAnchorToolbarBehavior() {
        return new m();
    }

    @Override // com.bytedance.android.live.h.b
    public LiveWidget getPreviewHashTagWidget(i iVar) {
        return new PreviewHashtagWidget(iVar);
    }

    @Override // com.bytedance.android.live.h.b
    public void updatePreviewHashTagWidgetLiveMode(LiveWidget liveWidget, i iVar) {
        if (liveWidget instanceof PreviewHashtagWidget) {
            ((PreviewHashtagWidget) liveWidget).f18123b = iVar;
        }
    }
}

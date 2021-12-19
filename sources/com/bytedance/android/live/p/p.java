package com.bytedance.android.live.p;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import h.f.b.l;

public class p implements h {
    static {
        Covode.recordClassIndex(6683);
    }

    @Override // com.bytedance.android.live.p.h
    public Class<? extends LiveRecyclableWidget> audienceToolbarWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.p.h
    public Class<? extends LiveRecyclableWidget> broadcastToolbarWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.p.h
    public void preloadAudienceToolbarWidget() {
    }

    @Override // com.bytedance.android.live.p.h
    public void preloadBroadcastToolbarWidget() {
    }

    @Override // com.bytedance.android.live.p.h
    public void preloadToolbarView(Context context, int i2, q qVar) {
        l.d(qVar, "");
    }

    @Override // com.bytedance.android.live.p.h
    public void releaseToolbarView() {
    }

    @Override // com.bytedance.android.live.p.h
    public g toolbarManager() {
        return null;
    }

    @Override // com.bytedance.android.live.p.h
    public Class<? extends LiveRecyclableWidget> toolbarWidget() {
        return null;
    }
}

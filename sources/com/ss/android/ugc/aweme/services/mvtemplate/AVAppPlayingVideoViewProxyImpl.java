package com.ss.android.ugc.aweme.services.mvtemplate;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.mvtemplate.c.a.a;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.playerkit.videoview.a;

public final class AVAppPlayingVideoViewProxyImpl implements a {
    static {
        Covode.recordClassIndex(79739);
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.c.a.a
    public final void release() {
        VideoViewComponent videoViewComponent;
        com.ss.android.ugc.playerkit.videoview.a aVar = a.C4019a.f148902a;
        if (aVar.f148900a != null && (videoViewComponent = aVar.f148900a.get()) != null) {
            videoViewComponent.d();
        }
    }
}

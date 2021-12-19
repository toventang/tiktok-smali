package com.ss.android.ugc.aweme.services.mvtemplate;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.mvtemplate.c.a.e;
import com.ss.android.ugc.aweme.tools.mvtemplate.c.a.f;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;

public final class AVVideoViewComponentFactoryImpl implements f {
    static {
        Covode.recordClassIndex(79740);
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.c.a.f
    public final e create() {
        return new AVVideoViewComponentFactoryImpl$create$1(new VideoViewComponent());
    }
}

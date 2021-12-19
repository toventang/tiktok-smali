package com.ss.android.ugc.aweme.services.mvtemplate;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.tools.mvtemplate.c.a.b;
import com.ss.android.ugc.aweme.tools.mvtemplate.c.a.c;
import com.ss.android.ugc.aweme.tools.mvtemplate.c.a.d;
import com.ss.android.ugc.playerkit.model.l;
import com.ss.android.ugc.playerkit.model.o;

public final class AVVideoViewComponentFactoryImplKt {
    static {
        Covode.recordClassIndex(79742);
    }

    public static final b toIAVMediaError(l lVar) {
        return new AVVideoViewComponentFactoryImplKt$toIAVMediaError$1(lVar);
    }

    public static final d toIAVPlayerFirstFrameEvent(o oVar) {
        return new AVVideoViewComponentFactoryImplKt$toIAVPlayerFirstFrameEvent$1(oVar);
    }

    public static final OnUIPlayListener toOnUIPlayListener(c cVar) {
        return new AVVideoViewComponentFactoryImplKt$toOnUIPlayListener$1(cVar);
    }
}

package com.ss.android.ugc.aweme.services.mvtemplate;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.mvtemplate.c.a;
import com.ss.android.ugc.aweme.tools.mvtemplate.c.a.f;
import com.ss.android.ugc.aweme.tools.mvtemplate.c.a.g;

public final class MvTemplateDependentsImpl implements a {
    private final AVAppPlayingVideoViewProxyImpl avAppPlayingVideoViewProxy = new AVAppPlayingVideoViewProxyImpl();
    private final AVVideoViewComponentFactoryImpl avVideoViewComponentFactory = new AVVideoViewComponentFactoryImpl();
    private final KeepSurfaceTextureViewFactoryImpl keepSurfaceTextureViewFactory = new KeepSurfaceTextureViewFactoryImpl();

    static {
        Covode.recordClassIndex(79747);
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.c.a
    public final com.ss.android.ugc.aweme.tools.mvtemplate.c.a.a getAVAppPlayingVideoViewProxy() {
        return this.avAppPlayingVideoViewProxy;
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.c.a
    public final f getAVVideoViewComponentFactory() {
        return this.avVideoViewComponentFactory;
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.c.a
    public final g getKeepSurfaceTextureViewFactory() {
        return this.keepSurfaceTextureViewFactory;
    }
}

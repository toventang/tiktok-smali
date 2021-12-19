package com.ss.android.ugc.aweme.services.mvtemplate;

import android.content.Context;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.mvtemplate.c.a.g;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;

public final class KeepSurfaceTextureViewFactoryImpl implements g {
    static {
        Covode.recordClassIndex(79746);
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.c.a.g
    public final TextureView create(Context context) {
        return new KeepSurfaceTextureView(context);
    }
}

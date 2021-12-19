package com.ss.android.ugc.aweme.video.preload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.preload.api.a.n;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static IVideoPreloadConfig f143762a;

    static {
        Covode.recordClassIndex(94057);
    }

    public static IVideoPreloadConfig a() {
        IVideoPreloadConfig iVideoPreloadConfig = f143762a;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig;
        }
        return new n(((IVideoPreloadConfigInjectWrapper) InjectedConfigManager.getConfig(IVideoPreloadConfigInjectWrapper.class)).wrap((IVideoPreloadConfig) InjectedConfigManager.getConfig(IVideoPreloadConfig.class)));
    }
}

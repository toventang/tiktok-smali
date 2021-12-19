package com.ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.IExternalService;
import f.a.t;
import h.f.a.b;

public interface ICreationToolsPluginService {
    static {
        Covode.recordClassIndex(79459);
    }

    void asyncService(Context context, b<? super Long, String> bVar, boolean z, String str, IExternalService.ServiceLoadCallback serviceLoadCallback);

    void forcePreload(Context context, String str);

    boolean isReady();

    t<PluginState> pluginState();

    void preload(Context context, String str);
}

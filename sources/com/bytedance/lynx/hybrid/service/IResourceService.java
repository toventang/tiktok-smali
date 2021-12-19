package com.bytedance.lynx.hybrid.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.a.j;
import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import com.bytedance.lynx.hybrid.resource.config.c;
import com.bytedance.lynx.hybrid.resource.d.b;
import com.bytedance.lynx.hybrid.resource.d.e;
import h.z;
import java.util.Map;

public interface IResourceService extends com.bytedance.lynx.hybrid.service.a.a {

    public static final class a {
        static {
            Covode.recordClassIndex(25258);
        }
    }

    static {
        Covode.recordClassIndex(25257);
    }

    void cancel(b bVar);

    void deleteResource(e eVar);

    Map<String, String> getPreloadConfigs();

    c getResourceConfig();

    void init(j jVar);

    b loadAsync(String str, com.bytedance.lynx.hybrid.resource.config.j jVar, h.f.a.b<? super e, z> bVar, h.f.a.b<? super Throwable, z> bVar2);

    e loadSync(String str, com.bytedance.lynx.hybrid.resource.config.j jVar);

    void registerConfig(String str, GeckoConfig geckoConfig);

    void registerCustomLoader(Class<? extends IHybridResourceLoader> cls, com.bytedance.lynx.hybrid.resource.d.c cVar);

    void unRegisterConfig(String str);

    void unregisterCustomLoader(Class<? extends IHybridResourceLoader> cls, com.bytedance.lynx.hybrid.resource.d.c cVar);
}

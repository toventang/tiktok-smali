package com.bytedance.ies.bullet.service.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.a.c;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import com.bytedance.ies.bullet.service.base.resourceloader.config.i;
import com.bytedance.ies.bullet.service.base.resourceloader.config.j;
import h.f.a.b;
import h.z;
import java.util.Map;

public interface IResourceLoaderService extends c {

    public static final class a {
        static {
            Covode.recordClassIndex(19278);
        }
    }

    static {
        Covode.recordClassIndex(19277);
    }

    void cancel(aj ajVar);

    void deleteResource(ap apVar);

    Map<String, String> getPreloadConfigs();

    i getResourceConfig();

    void init(i iVar);

    aj loadAsync(String str, j jVar, b<? super ap, z> bVar, b<? super Throwable, z> bVar2);

    ap loadSync(String str, j jVar);

    void registerConfig(String str, GeckoConfig geckoConfig);

    void registerCustomLoader(Class<? extends IXResourceLoader> cls, e eVar);

    void unRegisterConfig(String str);

    void unregisterCustomLoader(Class<? extends IXResourceLoader> cls, e eVar);
}

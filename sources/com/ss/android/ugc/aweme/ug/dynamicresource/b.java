package com.ss.android.ugc.aweme.ug.dynamicresource;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final Map<String, IDynamicResourceConfig> f141780a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final b f141781b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(92672);
        for (IDynamicResourceConfig iDynamicResourceConfig : ServiceManager.get().getServices(IDynamicResourceConfig.class)) {
            Map<String, IDynamicResourceConfig> map = f141780a;
            String a2 = iDynamicResourceConfig.a();
            l.b(iDynamicResourceConfig, "");
            map.put(a2, iDynamicResourceConfig);
        }
    }
}

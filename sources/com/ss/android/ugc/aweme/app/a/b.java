package com.ss.android.ugc.aweme.app.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.g;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.ApiConfigEntity;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.SpringApiLimitConfig;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f66523a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, a> f66524b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final a f66525c = new a(g.b(), (String) null, 4);

    private b() {
    }

    static {
        List<ApiConfigEntity> configList;
        Covode.recordClassIndex(40889);
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            SpringApiLimitConfig springApiLimitConfig = iESSettingsProxy.getSpringApiLimitConfig();
            l.b(springApiLimitConfig, "");
            if (!(springApiLimitConfig == null || (configList = springApiLimitConfig.getConfigList()) == null)) {
                for (T t : configList) {
                    Map<String, a> map = f66524b;
                    l.b(t, "");
                    String apiName = t.getApiName();
                    l.b(apiName, "");
                    Boolean isBanned = t.getIsBanned();
                    l.b(isBanned, "");
                    boolean booleanValue = isBanned.booleanValue();
                    Long delayTime = t.getDelayTime();
                    l.b(delayTime, "");
                    long longValue = delayTime.longValue();
                    String apiName2 = t.getApiName();
                    l.b(apiName2, "");
                    map.put(apiName, new a(booleanValue, longValue, apiName2));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static a a(String str) {
        l.d(str, "");
        a aVar = f66524b.get(str);
        if (aVar != null) {
            return aVar;
        }
        return null;
    }
}

package com.bytedance.ies.abmock;

import android.app.Application;
import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.datacenter.a.a;
import com.bytedance.ies.abmock.datacenter.c.c;
import com.bytedance.ies.abmock.datacenter.e;
import com.bytedance.ies.abmock.datacenter.f;
import com.bytedance.ies.abmock.datacenter.plugin.BaseConfigPlugin;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.o;
import java.util.Map;

public class j {

    /* renamed from: e  reason: collision with root package name */
    private static volatile j f31863e;

    /* renamed from: a  reason: collision with root package name */
    public Application f31864a;

    /* renamed from: b  reason: collision with root package name */
    public f f31865b;

    /* renamed from: c  reason: collision with root package name */
    public l f31866c = new k();

    /* renamed from: d  reason: collision with root package name */
    public f f31867d;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f31868f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f31869g;

    static {
        Covode.recordClassIndex(18630);
    }

    public final a d() {
        return this.f31865b.c();
    }

    private j() {
    }

    public final boolean b() {
        if (this.f31868f == null) {
            this.f31868f = Boolean.valueOf(this.f31865b.a());
        }
        return this.f31868f.booleanValue();
    }

    public final boolean c() {
        if (this.f31869g == null) {
            this.f31869g = Boolean.valueOf(this.f31865b.b());
        }
        return this.f31869g.booleanValue();
    }

    public static j a() {
        MethodCollector.i(8361);
        if (f31863e == null) {
            synchronized (j.class) {
                try {
                    if (f31863e == null) {
                        f31863e = new j();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8361);
                    throw th;
                }
            }
        }
        j jVar = f31863e;
        MethodCollector.o(8361);
        return jVar;
    }

    public static void a(o oVar) {
        Map<String, ConfigItem> configMap;
        c.f31814b = oVar;
        Map<String, ConfigItem> map = f.f31846a;
        Map<String, ConfigItem> map2 = f.f31847b;
        for (Map.Entry<String, ConfigItem> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!map2.containsKey(key)) {
                switch (c.AnonymousClass1.f31815a[entry.getValue().type.ordinal()]) {
                    case 1:
                        c.b(oVar, key);
                        continue;
                    case 2:
                        c.a(oVar, key);
                        continue;
                    case 3:
                        c.d(oVar, key);
                        continue;
                    case 4:
                        c.e(oVar, key);
                        continue;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        c.f(oVar, key);
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        c.c(oVar, key);
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        c.g(oVar, key);
                        continue;
                    default:
                        c.h(oVar, key);
                        continue;
                }
            }
        }
        Map<BaseConfigPlugin, Boolean> map3 = com.bytedance.ies.abmock.datacenter.plugin.a.a().f31838a;
        Map<String, ConfigItem> map4 = f.f31846a;
        for (Map.Entry<BaseConfigPlugin, Boolean> entry2 : map3.entrySet()) {
            if (!entry2.getValue().booleanValue() && (configMap = entry2.getKey().getConfigMap()) != null) {
                for (Map.Entry<String, ConfigItem> entry3 : configMap.entrySet()) {
                    String key2 = entry3.getKey();
                    if (map4 == null || !map4.containsKey(key2)) {
                        switch (c.AnonymousClass1.f31815a[entry3.getValue().type.ordinal()]) {
                            case 1:
                                c.b(oVar, key2);
                                break;
                            case 2:
                                c.a(oVar, key2);
                                break;
                            case 3:
                                c.d(oVar, key2);
                                break;
                            case 4:
                                c.e(oVar, key2);
                                break;
                            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                                c.f(oVar, key2);
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                                c.c(oVar, key2);
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                                c.g(oVar, key2);
                                break;
                            default:
                                c.h(oVar, key2);
                                break;
                        }
                    }
                }
            }
        }
        c.a(oVar);
        try {
            c.f31813a = true;
            com.bytedance.ies.abmock.datacenter.c.a.f31807a.b("config_center_saved", true);
        } catch (Throwable th) {
            b.a(th);
        }
        e.a().b();
    }
}

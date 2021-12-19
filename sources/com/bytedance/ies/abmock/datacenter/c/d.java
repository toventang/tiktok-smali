package com.bytedance.ies.abmock.datacenter.c;

import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.datacenter.plugin.BaseConfigPlugin;
import com.bytedance.ies.abmock.datacenter.plugin.a;
import com.bytedance.ies.abmock.f;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.r;
import java.util.Iterator;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31816a;

    /* renamed from: b  reason: collision with root package name */
    public static o f31817b;

    static {
        Covode.recordClassIndex(18603);
    }

    /* renamed from: com.bytedance.ies.abmock.datacenter.c.d$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31818a;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 102
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.abmock.datacenter.c.d.AnonymousClass1.<clinit>():void");
        }
    }

    public static boolean a(o oVar) {
        Map<String, ConfigItem> configMap;
        f31817b = oVar;
        for (Map.Entry<String, ConfigItem> entry : f.f31846a.entrySet()) {
            String key = entry.getKey();
            switch (AnonymousClass1.f31818a[entry.getValue().type.ordinal()]) {
                case 1:
                    b(oVar, key);
                    break;
                case 2:
                    a(oVar, key);
                    break;
                case 3:
                    d(oVar, key);
                    break;
                case 4:
                    e(oVar, key);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    f(oVar, key);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    c(oVar, key);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    g(oVar, key);
                    break;
                default:
                    h(oVar, key);
                    break;
            }
        }
        Map<BaseConfigPlugin, Boolean> map = a.a().f31838a;
        Map<String, ConfigItem> map2 = f.f31846a;
        for (Map.Entry<BaseConfigPlugin, Boolean> entry2 : map.entrySet()) {
            if (!entry2.getValue().booleanValue() && (configMap = entry2.getKey().getConfigMap()) != null) {
                for (Map.Entry<String, ConfigItem> entry3 : configMap.entrySet()) {
                    String key2 = entry3.getKey();
                    if (map2 == null || !map2.containsKey(key2)) {
                        switch (AnonymousClass1.f31818a[entry3.getValue().type.ordinal()]) {
                            case 1:
                                b(oVar, key2);
                                break;
                            case 2:
                                a(oVar, key2);
                                break;
                            case 3:
                                d(oVar, key2);
                                break;
                            case 4:
                                e(oVar, key2);
                                break;
                            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                                f(oVar, key2);
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                                c(oVar, key2);
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                                g(oVar, key2);
                                break;
                            default:
                                h(oVar, key2);
                                break;
                        }
                    }
                }
            }
        }
        o a2 = oVar.i();
        Iterator<String> it = a2.f54898a.keySet().iterator();
        Map<String, ConfigItem> map3 = f.f31846a;
        while (it.hasNext()) {
            String next = it.next();
            if (map3 != null && map3.containsKey(next)) {
                it.remove();
            }
        }
        e.f31819a.b(a2);
        try {
            f31816a = true;
            b.f31810a.b("libra_config_center_saved", true);
        } catch (Throwable th) {
            b.a(th);
        }
        return true;
    }

    private static void d(o oVar, String str) {
        l c2;
        try {
            o f2 = oVar.f(str);
            if (f2 == null || (c2 = f2.c("val")) == null || (c2 instanceof n)) {
                b.f31810a.c(str);
            } else {
                b.f31810a.b(str, c2.f());
            }
        } catch (Throwable th) {
            b.a(th + "  , key: " + str);
        }
    }

    private static void e(o oVar, String str) {
        l c2;
        try {
            o f2 = oVar.f(str);
            if (f2 == null || (c2 = f2.c("val")) == null || (c2 instanceof n)) {
                b.f31810a.c(str);
            } else {
                b.f31810a.b(str, c2.d());
            }
        } catch (Throwable th) {
            b.a(th + "  , key: " + str);
        }
    }

    private static void f(o oVar, String str) {
        l c2;
        try {
            o f2 = oVar.f(str);
            if (f2 == null || (c2 = f2.c("val")) == null || (c2 instanceof n)) {
                b.f31810a.c(str);
            } else {
                b.f31810a.b(str, c2.e());
            }
        } catch (Throwable th) {
            b.a(th + "  , key: " + str);
        }
    }

    private static void a(o oVar, String str) {
        r d2;
        int i2;
        try {
            o f2 = oVar.f(str);
            if (f2 == null || (d2 = f2.d("val")) == null) {
                b.f31810a.c(str);
            } else if (d2.f54900a instanceof Boolean) {
                b bVar = b.f31810a;
                if (d2.h()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                bVar.b(str, i2);
            } else {
                b.f31810a.b(str, d2.g());
            }
        } catch (Throwable th) {
            b.a(th + "  , key: " + str);
        }
    }

    private static void b(o oVar, String str) {
        r d2;
        boolean z;
        try {
            o f2 = oVar.f(str);
            if (f2 == null || (d2 = f2.d("val")) == null) {
                b.f31810a.c(str);
            } else if (d2.f54900a instanceof Number) {
                b bVar = b.f31810a;
                if (d2.g() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                bVar.b(str, z);
            } else {
                b.f31810a.b(str, d2.h());
            }
        } catch (Throwable th) {
            b.a(th + "  , key: " + str);
        }
    }

    private static void c(o oVar, String str) {
        l c2;
        try {
            o f2 = oVar.f(str);
            if (f2 != null && (c2 = f2.c("val")) != null && !(c2 instanceof n)) {
                b.f31810a.b(str, c2.c());
            } else if (oVar.b(str)) {
                b.f31810a.b(str, (String) null);
            } else {
                b.f31810a.c(str);
            }
        } catch (Throwable th) {
            b.a(th + "  , key: " + str);
        }
    }

    private static void g(o oVar, String str) {
        l c2;
        try {
            o f2 = oVar.f(str);
            if (f2 != null && (c2 = f2.c("val")) != null && !(c2 instanceof n)) {
                b.f31810a.a(str, (String[]) b.f31810a.a().a(c2, String[].class));
            } else if (oVar.b(str)) {
                b.f31810a.a(str, (String[]) null);
            } else {
                b.f31810a.c(str);
            }
        } catch (Throwable th) {
            b.a(th + "  , key: " + str);
        }
    }

    private static void h(o oVar, String str) {
        l c2;
        try {
            o f2 = oVar.f(str);
            if (f2 != null && (c2 = f2.c("val")) != null && !(c2 instanceof n)) {
                b.f31810a.b(str, c2.toString());
            } else if (oVar.b(str)) {
                b.f31810a.b(str, (String) null);
            } else {
                b.f31810a.c(str);
            }
        } catch (Throwable th) {
            b.a(th + "  , key: " + str);
        }
    }
}

package com.bytedance.helios.sdk.f.e;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.config.ApiInfo;
import com.bytedance.helios.api.config.ControlConfig;
import com.bytedance.helios.api.config.RuleInfo;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.d.q;
import com.bytedance.helios.sdk.utils.c;
import com.bytedance.helios.sdk.utils.d;
import com.bytedance.helios.sdk.utils.f;
import com.bytedance.helios.sdk.utils.h;
import h.a.ag;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.m.p;
import h.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a implements com.bytedance.helios.sdk.f.a {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, RuleInfo> f30979a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static String f30980b = "";

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, RuleInfo> f30981c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f30982d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static final List<Integer> f30983e;

    /* renamed from: f  reason: collision with root package name */
    private static final List<Integer> f30984f;

    /* renamed from: g  reason: collision with root package name */
    private static final List<Integer> f30985g;

    private a() {
    }

    private static void a() {
        Context baseContext;
        Application application = HeliosEnvImpl.INSTANCE.getApplication();
        if (!(application == null || (baseContext = application.getBaseContext()) == null || !h.a(baseContext))) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, RuleInfo> entry : f30979a.entrySet()) {
                if ((!entry.getValue().getApiIds().isEmpty()) || (true ^ entry.getValue().getResourceIds().isEmpty())) {
                    sb.append(entry.getKey()).append(",");
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            String sb2 = sb.toString();
            l.a((Object) sb2, "");
            d.b("sky_eye_rule_update", sb2);
        }
    }

    static {
        Context baseContext;
        Covode.recordClassIndex(17995);
        Application application = HeliosEnvImpl.INSTANCE.getApplication();
        if (!(application == null || (baseContext = application.getBaseContext()) == null || !h.a(baseContext))) {
            l.c("sky_eye_rule_update", "");
            d.f31001a.erase("sky_eye_rule_update");
        }
        List<Integer> b2 = n.b(100400, 100100, 100102, 100200, 100203, 100202, 102600);
        f30983e = b2;
        List<Integer> b3 = n.b(102000, 101000, 100002, 102001, 101700, 100900, 100909, 101701, 101600, 101601, 101900, 101400, 101500, 100000, 101803, 101309, 101304, 102300, 101310, 102500, 102501, 102502, 100013);
        f30984f = b3;
        List<Integer> b4 = n.b(101000, 101100, 100002, 102300, 101700, 100900, 101600, 101601, 101900, 101400, 101500, 100000, 100013, 101309, 101304, 101310);
        f30985g = b4;
        f30981c = ag.a(v.a("app_agreement_scene", new RuleInfo("app_agreement_scene", "manual", n.d((Collection) b2, (Iterable) b3), null, 8, null)), v.a("guest_mode_scene", new RuleInfo("guest_mode_scene", "manual", b4, null, 8, null)), v.a("app_agreement_overseas_scene", new RuleInfo("app_agreement_overseas_scene", "manual", null, n.a(q.f30917a), 4, null)), v.a("guest_mode_overseas_scene", new RuleInfo("guest_mode_overseas_scene", "manual", null, n.a(q.f30917a), 4, null)));
    }

    @Override // com.bytedance.helios.sdk.f.a
    public final void a(RuleInfo ruleInfo) {
        l.c(ruleInfo, "");
        ConcurrentHashMap<String, RuleInfo> concurrentHashMap = f30979a;
        concurrentHashMap.put(ruleInfo.getName(), ruleInfo);
        a();
        b(ruleInfo.getName(), true);
        f.a("Helios-Common-Env", "RulesManager.update name=" + ruleInfo.getName() + '\n' + c.a(concurrentHashMap), (String) null, 12);
    }

    public static void b(String str, boolean z) {
        ApiInfo apiInfo;
        List<Integer> list;
        List<String> list2;
        List<Integer> list3;
        List<String> list4;
        List<String> resourceIds;
        if (z && f30981c.containsKey(str)) {
            RuleInfo ruleInfo = f30979a.get(str);
            List<ApiInfo> apiInfoList = HeliosEnvImpl.INSTANCE.getApiConfig().getApiInfoList();
            if (!(apiInfoList instanceof Collection) || !apiInfoList.isEmpty()) {
                for (T t : apiInfoList) {
                    List<ControlConfig> monitorConfigs = t.getMonitorConfigs();
                    if (!(monitorConfigs instanceof Collection) || !monitorConfigs.isEmpty()) {
                        Iterator<T> it = monitorConfigs.iterator();
                        while (it.hasNext()) {
                            if (p.a((CharSequence) it.next().getConditionExpression(), (CharSequence) str, false)) {
                                return;
                            }
                        }
                    }
                    List<ControlConfig> blockConfigs = t.getBlockConfigs();
                    if (!(blockConfigs instanceof Collection) || !blockConfigs.isEmpty()) {
                        Iterator<T> it2 = blockConfigs.iterator();
                        while (it2.hasNext()) {
                            if (p.a((CharSequence) it2.next().getConditionExpression(), (CharSequence) str, false)) {
                                return;
                            }
                        }
                        continue;
                    }
                }
            }
            if (l.a((Object) str, (Object) "app_agreement_scene") && l.a(ruleInfo, f30981c.get("app_agreement_scene"))) {
                apiInfoList.add(new ApiInfo(f30983e, null, null, null, n.a(new ControlConfig(null, null, "$".concat(String.valueOf(str)), null, false, false, 59, null)), null, 46, null));
                apiInfoList.add(new ApiInfo(f30984f, null, null, null, null, n.a(new ControlConfig(null, null, "$".concat(String.valueOf(str)), null, false, false, 59, null)), 30, null));
            } else if (ruleInfo != null) {
                List<Integer> apiIds = ruleInfo.getApiIds();
                if (!((apiIds == null || apiIds.isEmpty()) && (ruleInfo == null || (resourceIds = ruleInfo.getResourceIds()) == null || resourceIds.isEmpty()))) {
                    if (l.a((Object) str, (Object) "app_agreement_overseas_scene") || l.a((Object) str, (Object) "guest_mode_overseas_scene")) {
                        if (ruleInfo == null || (list = ruleInfo.getApiIds()) == null) {
                            list = z.INSTANCE;
                        }
                        if (ruleInfo == null || (list2 = ruleInfo.getResourceIds()) == null) {
                            list2 = z.INSTANCE;
                        }
                        apiInfo = new ApiInfo(list, list2, null, null, n.a(new ControlConfig(null, null, "$".concat(String.valueOf(str)), null, false, false, 59, null)), null, 44, null);
                    } else {
                        if (ruleInfo == null || (list3 = ruleInfo.getApiIds()) == null) {
                            list3 = z.INSTANCE;
                        }
                        if (ruleInfo == null || (list4 = ruleInfo.getResourceIds()) == null) {
                            list4 = z.INSTANCE;
                        }
                        apiInfo = new ApiInfo(list3, list4, null, null, null, n.a(new ControlConfig(null, null, "$".concat(String.valueOf(str)), null, false, false, 59, null)), 28, null);
                    }
                    apiInfoList.add(apiInfo);
                }
            }
        }
    }

    @Override // com.bytedance.helios.sdk.f.a
    public final void a(String str, boolean z) {
        T t;
        l.c(str, "");
        if (z) {
            Iterator<T> it = HeliosEnvImpl.INSTANCE.getRuleInfoList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (l.a((Object) t.getName(), (Object) str)) {
                    break;
                }
            }
            RuleInfo ruleInfo = t;
            if (!(ruleInfo == null && (ruleInfo = f30981c.get(str)) == null)) {
                f30982d.a(ruleInfo);
            }
        } else {
            f30979a.remove(str);
            a();
        }
        b(str, z);
        f.a("Helios-Common-Env", "RulesManager.update name=" + str + " isEnable=" + z + '\n' + c.a(f30979a), (String) null, 12);
    }
}

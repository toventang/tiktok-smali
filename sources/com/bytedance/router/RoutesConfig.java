package com.bytedance.router;

import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.route.BaseRoute;
import com.bytedance.router.route.BroadcastRoute;
import com.bytedance.router.route.ServiceRoute;
import com.bytedance.router.util.Logger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RoutesConfig {
    private Set<String> mOtherSchemeSet;
    private String[] mOtherSchemes;
    private Map<String, Class<? extends BaseRoute>> mRouteMap;
    private String mScheme;

    static {
        Covode.recordClassIndex(26126);
    }

    public String[] getOtherSchemes() {
        return this.mOtherSchemes;
    }

    public String getScheme() {
        return this.mScheme;
    }

    static RoutesConfig defaultConfig() {
        return new RoutesConfig("snssdk143").withOtherSchemes(RouterConstant.DEFAULT_HISTORY_SCHEME).withSupportRoute("bt.service", ServiceRoute.class).withSupportRoute("bt.broadcast", BroadcastRoute.class);
    }

    public String toString() {
        int i2;
        StringBuilder append = new StringBuilder("scheme:").append(this.mScheme).append("\n");
        append.append("other schemes: ");
        String[] strArr = this.mOtherSchemes;
        if (strArr != null && strArr.length > 0) {
            for (String str : strArr) {
                append.append(str).append(',');
            }
            append.append("\n");
        }
        Map<String, Class<? extends BaseRoute>> map = this.mRouteMap;
        if (map != null) {
            i2 = map.size();
        } else {
            i2 = 0;
        }
        append.append(a.a("other supported routes: %s routes\n", new Object[]{Integer.valueOf(i2)}));
        if (i2 > 0) {
            for (Map.Entry<String, Class<? extends BaseRoute>> entry : this.mRouteMap.entrySet()) {
                append.append("\t").append(entry.getKey()).append(":").append(entry.getValue().getName()).append('\n');
            }
        }
        return append.toString();
    }

    RoutesConfig(String str) {
        this.mScheme = str;
        HashMap hashMap = new HashMap();
        this.mRouteMap = hashMap;
        hashMap.put("bt.service", ServiceRoute.class);
        this.mRouteMap.put("bt.broadcast", BroadcastRoute.class);
    }

    public Class<? extends BaseRoute> getRouteClass(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mRouteMap.get(str);
    }

    public boolean supportScheme(String str) {
        if (str == null || str.length() == 0 || str.equals(this.mScheme)) {
            return true;
        }
        Set<String> set = this.mOtherSchemeSet;
        if (set == null || !set.contains(str)) {
            return false;
        }
        return true;
    }

    public RoutesConfig withOtherSchemes(String[] strArr) {
        this.mOtherSchemes = strArr;
        if (strArr == null || strArr.length == 0) {
            this.mOtherSchemeSet = null;
        } else {
            Set<String> set = this.mOtherSchemeSet;
            if (set != null) {
                set.clear();
            } else {
                this.mOtherSchemeSet = new HashSet();
            }
            this.mOtherSchemeSet.addAll(Arrays.asList(strArr));
        }
        return this;
    }

    public RoutesConfig withSupportRoute(String str, Class<? extends BaseRoute> cls) {
        if (TextUtils.isEmpty(str) || cls == null) {
            Logger.w("RoutesConfig#withHostRoute() host or routeClass is null!!!");
            return this;
        }
        if (this.mRouteMap == null) {
            this.mRouteMap = new HashMap();
        }
        this.mRouteMap.put(str, cls);
        return this;
    }
}

package com.bytedance.router.interceptor;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RewriteManager implements IInterceptor {
    private Object mLockObject = new Object();
    private Map<String, String> mRewriteMap;

    static {
        Covode.recordClassIndex(26183);
    }

    public String getRewriteUrl(String str) {
        Map<String, String> map = this.mRewriteMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public void setRewriteMap(Map<String, String> map) {
        MethodCollector.i(14523);
        synchronized (this.mLockObject) {
            if (map == null) {
                try {
                    this.mRewriteMap = Collections.EMPTY_MAP;
                } catch (Throwable th) {
                    MethodCollector.o(14523);
                    throw th;
                }
            } else {
                this.mRewriteMap = map;
            }
        }
        MethodCollector.o(14523);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean matchInterceptRules(RouteIntent routeIntent) {
        Map<String, String> map;
        String originUrl = routeIntent.getOriginUrl();
        if (TextUtils.isEmpty(originUrl)) {
            return false;
        }
        String routeUrl = Util.getRouteUrl(originUrl);
        if (!(TextUtils.isEmpty(routeUrl) || (map = this.mRewriteMap) == null || map.size() == 0)) {
            String str = this.mRewriteMap.get(routeUrl);
            if (!TextUtils.isEmpty(str)) {
                routeIntent.setUrl(str);
                return true;
            }
        }
        return false;
    }

    public void addRewriteValue(String str, String str2) {
        MethodCollector.i(14524);
        synchronized (this.mLockObject) {
            try {
                if (this.mRewriteMap == null) {
                    this.mRewriteMap = new HashMap();
                }
                this.mRewriteMap.put(str, str2);
            } finally {
                MethodCollector.o(14524);
            }
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Logger.d("RewriteManager#RouteIntent-originUrl: " + routeIntent.getOriginUrl());
        Logger.d("RewriteManager#RouteIntent-outputUrl: " + routeIntent.getUrl());
        new RouteIntent.Builder(routeIntent.getUrl()).build();
        return false;
    }
}

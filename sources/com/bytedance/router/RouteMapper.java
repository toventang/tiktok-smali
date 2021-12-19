package com.bytedance.router;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.dynamic.RouterConfig;
import com.bytedance.router.dynamic.ServerParam;
import com.bytedance.router.mapping.ExternalSmartRouter$$Mapping;
import com.bytedance.router.mapping.SmartRouter$$Mapping;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import com.ss.android.ugc.aweme.bf.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class RouteMapper {
    private IConfigUpdateListener mConfigUpdateListener;
    private Context mContext;
    private Map<String, List<String>> mExternalRouteInterceptorMap = new HashMap();
    private Map<String, String> mExternalRouteMap = new HashMap(this.mExternalSmartRouter$$Mapping.getMapSize() + 1, 1.0f);
    private ExternalSmartRouter$$Mapping mExternalSmartRouter$$Mapping = new ExternalSmartRouter$$Mapping();
    private IMappingInitializer mIMappingInitializer;
    private AtomicBoolean mIsInited = new AtomicBoolean(false);
    private Map<String, String> mOriginExternalMap;
    private Map<String, String> mOriginMap;
    private Map<String, List<String>> mRouteInterceptorMap = new HashMap();
    private Map<String, String> mRouteMap = new HashMap(this.mSmartRouter$$Mapping.getMapSize() + 1, 1.0f);
    private final Object mRouteMapLock = new Object();
    private ServerParam mServerParam;
    private SmartRouter$$Mapping mSmartRouter$$Mapping = new SmartRouter$$Mapping();
    private List<String> mTestUrlList = new ArrayList();

    public interface IConfigUpdateListener {
        static {
            Covode.recordClassIndex(26124);
        }

        void onConfigChanged(RouterConfig routerConfig);
    }

    static {
        Covode.recordClassIndex(26121);
    }

    public void updateNetRouteConfig() {
    }

    public Map<String, String> getExternalRouteMap() {
        return this.mExternalRouteMap;
    }

    public Map<String, String> getRouteMap() {
        return this.mRouteMap;
    }

    public ServerParam getServerParam() {
        return this.mServerParam;
    }

    public List<String> getTestUrlList() {
        return this.mTestUrlList;
    }

    /* access modifiers changed from: package-private */
    public void requestRouteConfig() {
        ServerParam serverParam = this.mServerParam;
        if (serverParam == null || !serverParam.isAvailable()) {
            Logger.e("RouteMapper#requestRouteConfig serverParam is null or unavailable,You must use SmartRouter#init(Context, ServerParam) before !!!");
        } else {
            AsyncTask.execute(new Runnable() {
                /* class com.bytedance.router.RouteMapper.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(26123);
                }

                public void run() {
                    RouteMapper.this.updateNetRouteConfig();
                }
            });
        }
    }

    private void initRouteMap() {
        MethodCollector.i(12642);
        synchronized (this.mRouteMapLock) {
            try {
                if (!this.mIsInited.get()) {
                    this.mSmartRouter$$Mapping.init(this.mRouteMap);
                    this.mExternalSmartRouter$$Mapping.init(this.mExternalRouteMap);
                    this.mSmartRouter$$Mapping.initInterceptorMap(this.mRouteInterceptorMap);
                    this.mExternalSmartRouter$$Mapping.initInterceptorMap(this.mExternalRouteInterceptorMap);
                    this.mIsInited.set(true);
                }
            } finally {
                MethodCollector.o(12642);
            }
        }
    }

    public void loadLocalRouteConfig() {
        String string = d.a(this.mContext, "smartrouter_conf", 0).getString("smartrouter_config", "");
        if (!TextUtils.isEmpty(string)) {
            RouterConfig load = RouterConfig.load(string);
            if (this.mConfigUpdateListener != null && load != null && !RouterConfig.isExpired(this.mContext, load)) {
                this.mConfigUpdateListener.onConfigChanged(load);
                if (Logger.isDebug()) {
                    Logger.d("Load local routerConfig: ".concat(String.valueOf(string)));
                }
            }
        }
    }

    public void setCustomInitializer(IMappingInitializer iMappingInitializer) {
        this.mIMappingInitializer = iMappingInitializer;
    }

    public void init(Context context) {
        init(context, null, null);
    }

    private void initDynamicRoutes(ServerParam serverParam) {
        this.mServerParam = serverParam;
        if (serverParam == null || !serverParam.isAvailable()) {
            Logger.e("RouteMapper#initDynamicRoutes serverParam is null or unavailable!!!");
        } else {
            AsyncTask.execute(new Runnable() {
                /* class com.bytedance.router.RouteMapper.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(26122);
                }

                public void run() {
                    RouteMapper.this.loadLocalRouteConfig();
                    RouteMapper.this.updateNetRouteConfig();
                }
            });
        }
    }

    public void updateMapping(Map<String, String> map) {
        MethodCollector.i(12646);
        synchronized (this.mRouteMapLock) {
            try {
                if (this.mOriginMap == null) {
                    HashMap hashMap = new HashMap();
                    this.mOriginMap = hashMap;
                    hashMap.putAll(this.mRouteMap);
                    this.mRouteMap.putAll(map);
                } else {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.putAll(this.mOriginMap);
                    hashMap2.putAll(map);
                    this.mRouteMap = hashMap2;
                }
            } finally {
                MethodCollector.o(12646);
            }
        }
    }

    public boolean loadModuleMapping(String str) {
        MethodCollector.i(12648);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(12648);
            return false;
        }
        try {
            Object newInstance = Class.forName(a.a("com.bytedance.router.generator.mapping.SmartrouterMapping$$%s", new Object[]{str})).newInstance();
            if (newInstance.getClass() == SmartRouter$$Mapping.class) {
                synchronized (this.mRouteMapLock) {
                    try {
                        ((IMappingInitializer) newInstance).init(this.mRouteMap);
                        ((IMappingInitializer) newInstance).initInterceptorMap(this.mRouteInterceptorMap);
                    } finally {
                        MethodCollector.o(12648);
                    }
                }
                return true;
            }
            if (newInstance.getClass() == ExternalSmartRouter$$Mapping.class) {
                synchronized (this.mRouteMapLock) {
                    try {
                        ((IMappingInitializer) newInstance).init(this.mExternalRouteMap);
                        ((IMappingInitializer) newInstance).initInterceptorMap(this.mExternalRouteInterceptorMap);
                    } finally {
                        MethodCollector.o(12648);
                    }
                }
                return true;
            }
            MethodCollector.o(12648);
            return false;
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
        }
    }

    public List<String> getInterceptorList(String str, boolean z) {
        if (z) {
            if (this.mExternalRouteInterceptorMap == null) {
                return null;
            }
            return this.mExternalRouteInterceptorMap.get(Util.getRealRouteUrl(str));
        } else if (this.mRouteInterceptorMap == null) {
            return null;
        } else {
            return this.mRouteInterceptorMap.get(Util.getRealRouteUrl(str));
        }
    }

    private String getTargetClassFromUri(String str, Map<String, String> map) {
        String realRouteUrl = Util.getRealRouteUrl(str);
        String str2 = map.get(realRouteUrl);
        if (TextUtils.isEmpty(str2) && realRouteUrl.endsWith("/") && realRouteUrl.length() > 1) {
            realRouteUrl = realRouteUrl.substring(0, realRouteUrl.length() - 1);
            str2 = map.get(realRouteUrl);
        }
        if (TextUtils.isEmpty(str2)) {
            realRouteUrl = Util.getRouteUrl(str);
            str2 = map.get(realRouteUrl);
        }
        if (!TextUtils.isEmpty(str2) || !realRouteUrl.endsWith("/") || realRouteUrl.length() <= 1) {
            return str2;
        }
        return map.get(realRouteUrl.substring(0, realRouteUrl.length() - 1));
    }

    public String getTargetClass(String str, boolean z) {
        String targetClassFromUri;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (z) {
            targetClassFromUri = getTargetClassFromUri(str, this.mExternalRouteMap);
        } else {
            targetClassFromUri = getTargetClassFromUri(str, this.mRouteMap);
        }
        if (TextUtils.isEmpty(targetClassFromUri) && !this.mIsInited.get()) {
            initRouteMap();
            if (z) {
                targetClassFromUri = getTargetClassFromUri(str, this.mExternalRouteMap);
            } else {
                targetClassFromUri = getTargetClassFromUri(str, this.mRouteMap);
            }
        }
        Logger.d("RouteMapper#getTargetClass url: " + str + "  |  targetClass: " + targetClassFromUri + "  |  isExternal: " + z);
        return targetClassFromUri;
    }

    public void init(Context context, ServerParam serverParam, IConfigUpdateListener iConfigUpdateListener) {
        Logger.d("RouteMapper#init RouteMapper");
        this.mContext = context;
        this.mConfigUpdateListener = iConfigUpdateListener;
        if (!this.mIsInited.get()) {
            initRouteMap();
        }
        Logger.d(a.a("RouteMapper#loadMappingByRouter routes: %d .", new Object[]{Integer.valueOf(this.mRouteMap.size())}));
        Logger.d(a.a("RouteMapper#loadMappingByRouter routes: %d .", new Object[]{Integer.valueOf(this.mExternalRouteMap.size())}));
        if (serverParam != null) {
            initDynamicRoutes(serverParam);
        }
    }
}

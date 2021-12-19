package com.bytedance.router;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.RouteMapper;
import com.bytedance.router.dynamic.RouterConfig;
import com.bytedance.router.dynamic.ServerParam;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.interceptor.IInterceptorProvider;
import com.bytedance.router.listener.RouteCallbackProxy;
import com.bytedance.router.plugin.Plugin;
import com.bytedance.router.plugin.SupportPluginCallback;
import com.bytedance.router.route.ActivityRoute;
import com.bytedance.router.route.BaseRoute;
import com.bytedance.router.route.IRoute;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.router.route.RouteFactory;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class RouteManager {
    private Boolean alReadyInit;
    private IRouterInjectInitializer iRouterInjectInitializer;
    private Context mContext;
    private InterceptManager mInterceptManager;
    private List<Plugin> mPluginsList;
    private RouteCallbackProxy mRouteCallbackProxy;
    public RouteMapper mRouteMapper;
    private RoutesConfig mRoutesConfig;
    private ServerParam mServerParam;
    private SupportPluginCallback mSupportPluginCallback;

    /* access modifiers changed from: package-private */
    public static class StartupLock {
        private static ReentrantLock lock = new ReentrantLock();

        /* access modifiers changed from: package-private */
        public static class SingletonHolder {
            public static final StartupLock INSTANCE = new StartupLock();

            private SingletonHolder() {
            }

            static {
                Covode.recordClassIndex(26120);
            }
        }

        private StartupLock() {
        }

        public static StartupLock getInstance() {
            return SingletonHolder.INSTANCE;
        }

        public void lock() {
            lock.lock();
        }

        public void unlock() {
            lock.unlock();
        }

        static {
            Covode.recordClassIndex(26119);
        }
    }

    static {
        Covode.recordClassIndex(26116);
    }

    /* access modifiers changed from: package-private */
    public static class SingleBuilder {
        public static RouteManager sInstance = new RouteManager();

        private SingleBuilder() {
        }

        static {
            Covode.recordClassIndex(26118);
        }
    }

    public static final RouteManager getInstance() {
        return SingleBuilder.sInstance;
    }

    public Context getContext() {
        return this.mContext;
    }

    public RouteCallbackProxy getRouteCallbackProxy() {
        return this.mRouteCallbackProxy;
    }

    public RoutesConfig getRoutesConfig() {
        return this.mRoutesConfig;
    }

    public Map<String, String> getExternalRouteMap() {
        return this.mRouteMapper.getExternalRouteMap();
    }

    public List<String> getTestUrlList() {
        return this.mRouteMapper.getTestUrlList();
    }

    /* access modifiers changed from: package-private */
    public void requestRouteConfig() {
        this.mRouteMapper.requestRouteConfig();
    }

    public Map<String, String> getRouteMap() {
        tryInit();
        return this.mRouteMapper.getRouteMap();
    }

    private RouteManager() {
        this.mRoutesConfig = RoutesConfig.defaultConfig();
        this.alReadyInit = false;
        this.iRouterInjectInitializer = null;
        this.mRouteMapper = new RouteMapper();
        this.mInterceptManager = new InterceptManager();
        this.mRouteCallbackProxy = new RouteCallbackProxy();
    }

    private void tryInit() {
        if (!this.alReadyInit.booleanValue()) {
            try {
                StartupLock.getInstance().lock();
                if (!this.alReadyInit.booleanValue()) {
                    this.mRouteMapper.init(this.mContext, this.mServerParam, new RouteMapper.IConfigUpdateListener() {
                        /* class com.bytedance.router.RouteManager.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(26117);
                        }

                        @Override // com.bytedance.router.RouteMapper.IConfigUpdateListener
                        public void onConfigChanged(RouterConfig routerConfig) {
                            if (routerConfig != null) {
                                RouteManager.this.mRouteMapper.updateMapping(routerConfig.getIncMapping());
                                RouteManager.this.setRewriteMap(routerConfig.getRewriteMapping());
                            }
                        }
                    });
                    this.mInterceptManager.initInterceptors();
                    IRouterInjectInitializer iRouterInjectInitializer2 = this.iRouterInjectInitializer;
                    if (iRouterInjectInitializer2 != null) {
                        iRouterInjectInitializer2.injectInitialize();
                    }
                    this.alReadyInit = true;
                }
            } finally {
                StartupLock.getInstance().unlock();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void injectInitializer(IRouterInjectInitializer iRouterInjectInitializer2) {
        this.iRouterInjectInitializer = iRouterInjectInitializer2;
    }

    public void setConfig(RoutesConfig routesConfig) {
        this.mRoutesConfig = routesConfig;
    }

    public void setSupportPluginCallback(SupportPluginCallback supportPluginCallback) {
        this.mSupportPluginCallback = supportPluginCallback;
    }

    public void addGlobalResultCallback(OpenResultCallback openResultCallback) {
        this.mRouteCallbackProxy.addCallback(openResultCallback);
    }

    public void addInterceptor(IInterceptor iInterceptor) {
        this.mInterceptManager.addInterceptor(iInterceptor);
    }

    public void addInterceptroProvider(IInterceptorProvider iInterceptorProvider) {
        this.mInterceptManager.addInterceptorProvider(iInterceptorProvider);
    }

    public void addLastInterceptor(IInterceptor iInterceptor) {
        this.mInterceptManager.addLastInterceptor(iInterceptor);
    }

    /* access modifiers changed from: package-private */
    public boolean canOpen(String str) {
        return canOpen(str, false);
    }

    public void init(Context context) {
        init(context, null);
    }

    public void removeGlobalResultCallback(OpenResultCallback openResultCallback) {
        this.mRouteCallbackProxy.removeCallback(openResultCallback);
    }

    public void setCustomInitializer(IMappingInitializer iMappingInitializer) {
        this.mRouteMapper.setCustomInitializer(iMappingInitializer);
    }

    public void setTempResultCallback(OpenResultCallback openResultCallback) {
        this.mRouteCallbackProxy.setTempCallback(openResultCallback);
    }

    public void setRewriteMap(Map<String, String> map) {
        this.mInterceptManager.getRewriteManager().setRewriteMap(map);
    }

    private boolean checkLegality(RouteIntent routeIntent) {
        String url = routeIntent.getUrl();
        if (Util.isLegalUrl(url, this.mRoutesConfig)) {
            return true;
        }
        Logger.e("RouteManager#checkLegality originUrl is illegal: " + url + ". \n" + this.mRoutesConfig.toString());
        return false;
    }

    private synchronized boolean loadPluginsSchemas(String str) {
        MethodCollector.i(13887);
        SupportPluginCallback supportPluginCallback = this.mSupportPluginCallback;
        boolean z = false;
        if (supportPluginCallback == null) {
            Logger.w("if you use urls in plugins, you must set SupportPluginCallback to support plugins.");
            MethodCollector.o(13887);
            return false;
        }
        if (this.mPluginsList == null) {
            this.mPluginsList = supportPluginCallback.initPlugins();
        }
        if (this.mPluginsList == null) {
            throw new NullPointerException("size");
        }
        Iterator<Plugin> it = this.mPluginsList.iterator();
        while (it.hasNext()) {
            Plugin next = it.next();
            if (next.containsUrl(str)) {
                this.mSupportPluginCallback.loadPlugin(next, str);
                if (this.mRouteMapper.loadModuleMapping(next.getName())) {
                    z = true;
                }
                it.remove();
            }
        }
        MethodCollector.o(13887);
        return z;
    }

    private RouteIntent processRouteIntent(RouteIntent routeIntent) {
        String url = routeIntent.getUrl();
        if (!Util.isLegalUrl(url)) {
            Logger.e("RouteManager#RouteIntent-outputUrl is illegal and url is : ".concat(String.valueOf(url)));
            return null;
        }
        routeIntent.setUrl(Util.completeUrl(this.mRoutesConfig.getScheme(), url));
        Logger.d("RouteManager#processRouteIntent originUlr: " + routeIntent.getOriginUrl());
        Logger.d("RouteManager#processRouteIntent outputUlr: " + routeIntent.getUrl());
        return routeIntent;
    }

    public void addAssignInterceptor(String str, IInterceptor iInterceptor) {
        this.mInterceptManager.addAssignInterceptor(str, iInterceptor);
    }

    private IRoute getRoute(RouteIntent routeIntent, String str) {
        BaseRoute createRoute = RouteFactory.createRoute(routeIntent, str, this.mRoutesConfig);
        if (createRoute != null) {
            createRoute.init(routeIntent, this.mRouteMapper);
        }
        return createRoute;
    }

    public void init(Context context, ServerParam serverParam) {
        this.mContext = context;
        this.mServerParam = serverParam;
    }

    public void putRewriteValue(String str, String str2) {
        this.mInterceptManager.getRewriteManager().addRewriteValue(str, str2);
    }

    public void open(Context context, RouteIntent routeIntent) {
        tryInit();
        this.mRouteCallbackProxy.setTempCallback(routeIntent.getCallback());
        IRoute route = getRoute(context, routeIntent);
        if (route != null) {
            try {
                route.open(context);
            } catch (Exception e2) {
                Logger.e("Please check the scheme and its mapping class!!!");
                e2.printStackTrace();
                this.mRouteCallbackProxy.onFail(routeIntent.getOriginUrl(), "Please check the scheme and its mapping class!");
            }
        }
    }

    public void openMulti(Context context, MultiRouteIntent multiRouteIntent) {
        tryInit();
        ArrayList<RouteIntent> routeIntents = multiRouteIntent.getRouteIntents();
        ArrayList arrayList = new ArrayList();
        this.mRouteCallbackProxy.setMultiTempCallback(multiRouteIntent.getCallback());
        Iterator<RouteIntent> it = routeIntents.iterator();
        while (it.hasNext()) {
            RouteIntent next = it.next();
            next.setNeedIntercept(false);
            IRoute route = getRoute(context, next);
            if (route != null) {
                if (route instanceof ActivityRoute) {
                    arrayList.add(route);
                } else {
                    throw new IllegalArgumentException("Now only Activity route is supported");
                }
            }
        }
        if (arrayList.isEmpty()) {
            this.mRouteCallbackProxy.onEmpty();
            return;
        }
        multiRouteIntent.getRoutes().addAll(arrayList);
        getRoute(multiRouteIntent, (String) null).open(context);
    }

    private IRoute getRoute(Context context, RouteIntent routeIntent) {
        List<String> interceptorList;
        if (!checkLegality(routeIntent)) {
            this.mRouteCallbackProxy.onFail(routeIntent.getOriginUrl(), "OriginUrl is illegal");
            return null;
        } else if (!routeIntent.getNeedIntercept() || !this.mInterceptManager.processRouteIntent(context, routeIntent)) {
            RouteIntent processRouteIntent = processRouteIntent(routeIntent);
            if (processRouteIntent == null) {
                RouteCallbackProxy routeCallbackProxy = this.mRouteCallbackProxy;
                throw new NullPointerException("getOriginUrl");
            } else if (!processRouteIntent.getNeedIntercept() || (interceptorList = this.mRouteMapper.getInterceptorList(processRouteIntent.getUrl(), processRouteIntent.isExternalType())) == null || !this.mInterceptManager.processAssignInterceptor(context, interceptorList, processRouteIntent)) {
                String targetClass = this.mRouteMapper.getTargetClass(processRouteIntent.getUrl(), processRouteIntent.isExternalType());
                if (TextUtils.isEmpty(targetClass)) {
                    if (!loadPluginsSchemas(processRouteIntent.getUrl())) {
                        Logger.w("RouteManager#open cannot find the routeUri with " + processRouteIntent.getUrl());
                        return null;
                    }
                    this.mRouteMapper.getTargetClass(processRouteIntent.getUrl(), processRouteIntent.isExternalType());
                }
                if (TextUtils.isEmpty(targetClass)) {
                    this.mRouteCallbackProxy.onMissed(processRouteIntent.getOriginUrl());
                } else {
                    this.mRouteCallbackProxy.onMatched(processRouteIntent.getUrl());
                }
                IRoute route = getRoute(processRouteIntent, targetClass);
                if (route != null) {
                    return route;
                }
                Logger.e("RouteManager#Not support the route with url：" + processRouteIntent.getUrl());
                this.mRouteCallbackProxy.onFail(processRouteIntent.getOriginUrl(), "Not support the route");
                return null;
            } else {
                this.mRouteCallbackProxy.onIntercept(processRouteIntent.getUrl());
                this.mRouteCallbackProxy.onSuccess();
                return null;
            }
        } else {
            this.mRouteCallbackProxy.onIntercept(routeIntent.getUrl());
            this.mRouteCallbackProxy.onSuccess(routeIntent.getExtra());
            return null;
        }
    }

    public Intent buildIntent(Context context, RouteIntent routeIntent) {
        tryInit();
        this.mRouteCallbackProxy.setTempCallback(routeIntent.getCallback());
        if (!checkLegality(routeIntent)) {
            this.mRouteCallbackProxy.onFail(routeIntent.getOriginUrl(), "OriginUrl is illegal");
            return null;
        } else if (this.mInterceptManager.processRouteIntent(context, routeIntent)) {
            this.mRouteCallbackProxy.onIntercept(routeIntent.getUrl());
            this.mRouteCallbackProxy.onSuccess();
            return null;
        } else {
            RouteIntent processRouteIntent = processRouteIntent(routeIntent);
            if (processRouteIntent == null) {
                RouteCallbackProxy routeCallbackProxy = this.mRouteCallbackProxy;
                throw new NullPointerException("getOriginUrl");
            }
            List<String> interceptorList = this.mRouteMapper.getInterceptorList(processRouteIntent.getUrl(), processRouteIntent.isExternalType());
            if (interceptorList == null || !this.mInterceptManager.processAssignInterceptor(context, interceptorList, processRouteIntent)) {
                String targetClass = this.mRouteMapper.getTargetClass(processRouteIntent.getUrl(), processRouteIntent.isExternalType());
                if (TextUtils.isEmpty(targetClass)) {
                    if (!loadPluginsSchemas(processRouteIntent.getUrl())) {
                        Logger.w("RouteManager#buildIntent cannot find the routeUri with " + processRouteIntent.getUrl());
                        return null;
                    }
                    targetClass = this.mRouteMapper.getTargetClass(processRouteIntent.getUrl(), processRouteIntent.isExternalType());
                }
                if (TextUtils.isEmpty(targetClass)) {
                    this.mRouteCallbackProxy.onFail(processRouteIntent.getOriginUrl(), "TargetClass is null");
                    return null;
                }
                try {
                    if (IRouteAction.class.isAssignableFrom(Class.forName(targetClass))) {
                        return null;
                    }
                } catch (ClassNotFoundException e2) {
                    e2.printStackTrace();
                }
                processRouteIntent.getExtra().setComponent(new ComponentName(context.getPackageName(), targetClass));
                this.mRouteCallbackProxy.onSuccess();
                return processRouteIntent.getExtra();
            }
            this.mRouteCallbackProxy.onIntercept(processRouteIntent.getUrl());
            this.mRouteCallbackProxy.onSuccess();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean canOpen(String str, boolean z) {
        tryInit();
        if (TextUtils.isEmpty(str)) {
            Logger.w("SmartRoute#url is null!!!");
            return false;
        } else if (!Util.isLegalUrl(str)) {
            Logger.w("SmartRoute#url is illegal and url is ".concat(String.valueOf(str)));
            return false;
        } else {
            String realRouteUrl = Util.getRealRouteUrl(str);
            String rewriteUrl = this.mInterceptManager.getRewriteManager().getRewriteUrl(realRouteUrl);
            if (!TextUtils.isEmpty(rewriteUrl)) {
                realRouteUrl = rewriteUrl;
            }
            String scheme = Uri.parse(realRouteUrl).getScheme();
            if (TextUtils.isEmpty(scheme)) {
                scheme = Uri.parse(str).getScheme();
            }
            if (!this.mRoutesConfig.supportScheme(scheme)) {
                Logger.w("SmartRouter not supports this scheme: ".concat(String.valueOf(scheme)));
                return false;
            } else if (!this.mRoutesConfig.supportScheme(scheme)) {
                Logger.w("SmartRouter not supports this scheme: ".concat(String.valueOf(scheme)));
                return false;
            } else {
                String targetClass = this.mRouteMapper.getTargetClass(realRouteUrl, z);
                if (TextUtils.isEmpty(targetClass) && loadPluginsSchemas(realRouteUrl)) {
                    targetClass = this.mRouteMapper.getTargetClass(realRouteUrl, z);
                }
                if (!TextUtils.isEmpty(targetClass) || this.mInterceptManager.whetherIntercept(str)) {
                    return true;
                }
                return false;
            }
        }
    }
}

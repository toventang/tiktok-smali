package com.bytedance.router;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.autowire.AutowiredService;
import com.bytedance.router.autowire.ISerializationService;
import com.bytedance.router.dynamic.ServerParam;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.interceptor.IInterceptorProvider;
import com.bytedance.router.plugin.SupportPluginCallback;
import com.bytedance.router.util.Logger;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.util.Map;

public class SmartRouter {
    private static ISerializationService serializationService;

    static {
        Covode.recordClassIndex(26133);
    }

    public static ISerializationService getSerializationService() {
        return serializationService;
    }

    public static boolean isDebug() {
        return Logger.isDebug();
    }

    public static void requestRouteConfig() {
        RouteManager.getInstance().requestRouteConfig();
    }

    public static void setDebug(boolean z) {
        Logger.setDebug(z);
    }

    public static void setSerializationService(ISerializationService iSerializationService) {
        serializationService = iSerializationService;
    }

    public static void addInterceptor(IInterceptor iInterceptor) {
        RouteManager.getInstance().addInterceptor(iInterceptor);
    }

    public static void addInterceptorProvider(IInterceptorProvider iInterceptorProvider) {
        RouteManager.getInstance().addInterceptroProvider(iInterceptorProvider);
    }

    public static void addLastInterceptor(IInterceptor iInterceptor) {
        RouteManager.getInstance().addLastInterceptor(iInterceptor);
    }

    public static void addRewriteMap(Map<String, String> map) {
        RouteManager.getInstance().setRewriteMap(map);
    }

    public static void autowire(Object obj) {
        AutowiredService.inst().autowire(obj);
    }

    public static void injectInitializer(IRouterInjectInitializer iRouterInjectInitializer) {
        RouteManager.getInstance().injectInitializer(iRouterInjectInitializer);
    }

    public static boolean isSmartIntent(Intent intent) {
        return SmartIntent.isSmartIntent(intent);
    }

    public static void setCustomInitializer(IMappingInitializer iMappingInitializer) {
        RouteManager.getInstance().setCustomInitializer(iMappingInitializer);
    }

    public static void setSupportPluginCallback(SupportPluginCallback supportPluginCallback) {
        RouteManager.getInstance().setSupportPluginCallback(supportPluginCallback);
    }

    public static SmartBundle smartBundle(Bundle bundle) {
        return new SmartBundle(bundle);
    }

    public static Intent smartIntent(Intent intent) {
        return SmartIntent.smartIntent(intent);
    }

    public static boolean canOpen(String str) {
        return RouteManager.getInstance().canOpen(str);
    }

    public static Context com_bytedance_router_SmartRouter_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public static RoutesConfig configRouter(String str) {
        RoutesConfig routesConfig = new RoutesConfig(str);
        RouteManager.getInstance().setConfig(routesConfig);
        return routesConfig;
    }

    public static void init(Context context) {
        RouteManager.getInstance().init(com_bytedance_router_SmartRouter_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context));
    }

    public static void init(Context context, ServerParam serverParam) {
        RouteManager.getInstance().init(context, serverParam);
    }

    public static void putRewriteValue(String str, String str2) {
        RouteManager.getInstance().putRewriteValue(str, str2);
    }

    public static SmartRoute buildRoute(Context context, String str) {
        return new SmartRoute(context).withUrl(str);
    }

    public static SmartRoute buildFragmentRoute(Fragment fragment, String str) {
        return new SmartRoute(fragment.getActivity()).withUrl(str).withFragment(fragment);
    }

    public static SmartRoute buildRoute(Fragment fragment, String str) {
        return new SmartRoute(fragment.getActivity()).withUrl(str);
    }
}

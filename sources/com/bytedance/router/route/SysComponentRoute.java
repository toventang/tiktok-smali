package com.bytedance.router.route;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.RouteManager;
import com.bytedance.router.util.Logger;

public abstract class SysComponentRoute extends BaseRoute {
    static {
        Covode.recordClassIndex(26202);
    }

    public abstract void openComponent(Context context, Intent intent);

    @Override // com.bytedance.router.route.IRoute
    public void open(Context context) {
        Intent component = getComponent(context);
        if (component != null) {
            RouteManager.getInstance().getRouteCallbackProxy().onOpen(component);
            openComponent(context, component);
            RouteManager.getInstance().getRouteCallbackProxy().onSuccess(component);
        }
    }

    @Override // com.bytedance.router.route.BaseRoute
    public Intent getComponent(Context context) {
        ComponentName componentName;
        RouteIntent routeIntent = getRouteIntent();
        Class<?> cls = null;
        if (routeIntent == null) {
            RouteManager.getInstance().getRouteCallbackProxy();
            throw new NullPointerException("getOriginUrl");
        }
        String targetClass = getTargetClass();
        if (TextUtils.isEmpty(targetClass)) {
            RouteManager.getInstance().getRouteCallbackProxy().onFail(routeIntent.getOriginUrl(), "ClassPath is null");
            Logger.e("SysComponentRoute open routeIntent but the classPath is null!!!");
            return null;
        }
        Intent extra = routeIntent.getExtra();
        if (extra == null) {
            RouteManager.getInstance().getRouteCallbackProxy().onFail(routeIntent.getOriginUrl(), "Intent is null");
            Logger.e("SysComponentRoute open routeIntent but the intent is null!!!");
            return null;
        }
        try {
            cls = Class.forName(targetClass);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        }
        if (cls != null) {
            componentName = new ComponentName(context, cls);
        } else {
            componentName = new ComponentName(context.getPackageName(), targetClass);
        }
        extra.setComponent(componentName);
        extra.setPackage(context.getPackageName());
        return extra;
    }
}

package com.bytedance.router.route;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.RouteMapper;

public abstract class BaseRoute implements IRoute {
    private RouteIntent mRouteIntent;
    private RouteMapper mRouteMapper;
    private Uri mUri;
    private String mUrl;

    static {
        Covode.recordClassIndex(26195);
    }

    public Intent getComponent(Context context) {
        return null;
    }

    /* access modifiers changed from: protected */
    public RouteIntent getRouteIntent() {
        return this.mRouteIntent;
    }

    @Override // com.bytedance.router.route.IRoute
    public String getUrl() {
        return this.mUrl;
    }

    @Override // com.bytedance.router.route.IRoute
    public String getHost() {
        return this.mUri.getHost();
    }

    @Override // com.bytedance.router.route.IRoute
    public String getPath() {
        return this.mUri.getPath();
    }

    @Override // com.bytedance.router.route.IRoute
    public String getScheme() {
        return this.mUri.getScheme();
    }

    /* access modifiers changed from: protected */
    public String getTargetClass() {
        return this.mRouteMapper.getTargetClass(this.mUrl, this.mRouteIntent.isExternalType());
    }

    @Override // com.bytedance.router.route.IRoute
    public Bundle getParams() {
        if (this.mRouteIntent.getExtra() != null) {
            return com_bytedance_router_route_BaseRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this.mRouteIntent.getExtra());
        }
        return new Bundle();
    }

    public static Bundle com_bytedance_router_route_BaseRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public void init(RouteIntent routeIntent, RouteMapper routeMapper) {
        this.mRouteIntent = routeIntent;
        String url = routeIntent.getUrl();
        this.mUrl = url;
        this.mUri = Uri.parse(url);
        this.mRouteMapper = routeMapper;
    }
}

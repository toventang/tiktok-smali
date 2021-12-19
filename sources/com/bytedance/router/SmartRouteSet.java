package com.bytedance.router;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.MultiRouteIntent;
import h.f.a.a;
import h.f.b.g;
import h.f.b.l;
import h.h;
import h.i;
import java.util.ArrayList;

public final class SmartRouteSet {
    public static final Companion Companion = new Companion(null);
    private Bundle animationBundle;
    private OpenResultCallback callback;
    private final Context context;
    private final h routes$delegate = i.a((a) SmartRouteSet$routes$2.INSTANCE);

    static {
        Covode.recordClassIndex(26130);
    }

    public static final SmartRouteSet buildRoute(Context context2) {
        return Companion.buildRoute(context2);
    }

    private final ArrayList<RouteIntent> getRoutes() {
        return (ArrayList) this.routes$delegate.getValue();
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(26131);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final SmartRouteSet buildRoute(Context context) {
            l.c(context, "");
            return new SmartRouteSet(context);
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final void open() {
        RouteManager.getInstance().openMulti(this.context, buildRouteIntent());
    }

    private final MultiRouteIntent buildRouteIntent() {
        return new MultiRouteIntent.Builder(new MultiRouteIntent(), getRoutes()).withBundleAnimation(this.animationBundle).withCallback(this.callback).build();
    }

    public final SmartRouteSet withBundleAnimation(Bundle bundle) {
        this.animationBundle = bundle;
        return this;
    }

    public final SmartRouteSet withCallBack(OpenResultCallback openResultCallback) {
        this.callback = openResultCallback;
        return this;
    }

    public SmartRouteSet(Context context2) {
        l.c(context2, "");
        this.context = context2;
    }

    public final SmartRouteSet addRoute(SmartRoute smartRoute) {
        l.c(smartRoute, "");
        RouteIntent buildRouteIntent = smartRoute.buildRouteIntent();
        ArrayList<RouteIntent> routes = getRoutes();
        ArrayList arrayList = new ArrayList();
        for (T t : routes) {
            String url = t.getUrl();
            l.a((Object) buildRouteIntent, "");
            if (l.a((Object) url, (Object) buildRouteIntent.getUrl())) {
                arrayList.add(t);
            }
        }
        if (arrayList.isEmpty()) {
            l.a((Object) buildRouteIntent, "");
            if (buildRouteIntent.getAnimationBundle() != null) {
                throw new IllegalArgumentException("Don't support setAnimationBundle for single Route, Use SmartRouteSet.withBundleAnimation instead".toString());
            } else if (buildRouteIntent.getEnterAnim() == -1 || buildRouteIntent.getExitAnim() == -1) {
                getRoutes().add(buildRouteIntent);
                return this;
            } else {
                throw new IllegalArgumentException("Don't support setAnimation for single Route".toString());
            }
        } else {
            StringBuilder sb = new StringBuilder("Already contains a route with same url: ");
            l.a((Object) buildRouteIntent, "");
            throw new IllegalArgumentException(sb.append(buildRouteIntent.getUrl()).toString().toString());
        }
    }
}

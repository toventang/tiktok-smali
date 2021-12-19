package com.bytedance.router.route;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.MultiRouteIntent;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.RouteManager;
import h.a.n;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.Iterator;

public final class MultiRoute extends BaseRoute {
    static {
        Covode.recordClassIndex(26199);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.router.route.BaseRoute
    public final MultiRouteIntent getRouteIntent() {
        RouteIntent routeIntent = super.getRouteIntent();
        if (routeIntent != null) {
            return (MultiRouteIntent) routeIntent;
        }
        throw new w("null cannot be cast to non-null type");
    }

    @Override // com.bytedance.router.route.IRoute
    public final void open(Context context) {
        l.c(context, "");
        ArrayList<BaseRoute> routes = getRouteIntent().getRoutes();
        ArrayList arrayList = new ArrayList(n.a((Iterable) routes, 10));
        Iterator<T> it = routes.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getComponent(context));
        }
        Object[] array = arrayList.toArray(new Intent[0]);
        if (array != null) {
            a.a(context, (Intent[]) array, getRouteIntent().getAnimationBundle());
            RouteManager instance = RouteManager.getInstance();
            l.a((Object) instance, "");
            instance.getRouteCallbackProxy().onSuccess(null);
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }
}

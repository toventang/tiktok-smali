package com.bytedance.router.route;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.RouteManager;

public class ActionRoute extends BaseRoute {
    private IRouteAction mMethodRoute;

    static {
        Covode.recordClassIndex(26193);
    }

    public ActionRoute(Class cls) {
        try {
            this.mMethodRoute = (IRouteAction) cls.newInstance();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        }
    }

    @Override // com.bytedance.router.route.IRoute
    public void open(Context context) {
        IRouteAction iRouteAction = this.mMethodRoute;
        if (iRouteAction != null) {
            Object open = iRouteAction.open(context, getUrl(), getParams());
            OpenResultCallback callback = getRouteIntent().getCallback();
            if (callback != null) {
                callback.onActionResult(open);
            }
            RouteManager.getInstance().getRouteCallbackProxy().onSuccess();
        }
    }
}

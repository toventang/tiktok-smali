package com.bytedance.router.interceptor;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;

public interface IInterceptor {
    static {
        Covode.recordClassIndex(26181);
    }

    boolean matchInterceptRules(RouteIntent routeIntent);

    boolean onInterceptRoute(Context context, RouteIntent routeIntent);
}

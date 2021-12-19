package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.ies.powerpage.b.a;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;

public final class de implements IInterceptor {
    static {
        Covode.recordClassIndex(75651);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        if (b.a().a(true, "profile_refactor_power_page", 1) == 2) {
            if (routeIntent != null) {
                str = routeIntent.getUrl();
            } else {
                str = null;
            }
            Uri.Builder path = Uri.parse(str).buildUpon().scheme("aweme").authority("user_profile_page").path("");
            if (routeIntent != null) {
                routeIntent.setUrl(path.build().toString());
            }
            if (new a().onInterceptRoute(context, routeIntent)) {
                return true;
            }
            if (routeIntent != null) {
                routeIntent.setUrl(str);
            }
        }
        return false;
    }
}

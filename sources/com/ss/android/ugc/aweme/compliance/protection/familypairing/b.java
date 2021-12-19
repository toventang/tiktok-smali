package com.ss.android.ugc.aweme.compliance.protection.familypairing;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ck.j;
import com.ss.android.ugc.aweme.ck.v;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.SetTimeLockActivity;

public final class b implements IInterceptor, j {
    static {
        Covode.recordClassIndex(48345);
    }

    @Override // com.ss.android.ugc.aweme.ck.j
    public final boolean c(String str) {
        return b(null, str);
    }

    private static int a(String str) {
        String b2 = v.b(str, StringSet.type);
        b2.hashCode();
        if (b2.equals("teen_mode")) {
            return 1;
        }
        if (!b2.equals("time_lock")) {
            return -1;
        }
        return 0;
    }

    private static int b(String str) {
        String b2 = v.b(str, "time_lock");
        if (TextUtils.isEmpty(b2)) {
            return 0;
        }
        try {
            return Integer.parseInt(b2);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private static int d(String str) {
        String b2 = v.b(str, "teen_mode");
        if (TextUtils.isEmpty(b2)) {
            return 0;
        }
        try {
            return Integer.parseInt(b2);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        if (routeIntent == null || routeIntent.getUri() == null) {
            str = null;
        } else {
            str = routeIntent.getUri().getHost();
        }
        return "teen_protection".equals(str);
    }

    @Override // com.ss.android.ugc.aweme.ck.j
    public final boolean a(Activity activity, String str) {
        return b(activity, str);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        b((Activity) context, routeIntent.getOriginUrl());
        return true;
    }

    private static boolean b(Activity activity, String str) {
        boolean z;
        Context context = activity;
        if (context == null && (context = f.j()) == null) {
            context = d.a();
        }
        if (d(str) == -1 || TextUtils.isEmpty(v.b(str, "user_id"))) {
            return false;
        }
        int a2 = a(str);
        if (a2 != 0 ? !(a2 == 1 && d(str) == 1) : b(str) <= 0) {
            z = false;
        } else {
            z = true;
        }
        SetTimeLockActivity.a(context, a(str), v.b(str, "user_id"), v.b(str, "sec_user_id"), v.b(str, "username"), z, b(str));
        return true;
    }
}

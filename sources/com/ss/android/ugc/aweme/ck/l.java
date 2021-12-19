package com.ss.android.ugc.aweme.ck;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.PushLoginActivity;
import com.ss.android.ugc.aweme.app.o;
import com.ss.android.ugc.aweme.utils.a.c;

public final class l implements IInterceptor, j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f71137a = new a((byte) 0);

    static {
        Covode.recordClassIndex(43787);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43788);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ck.j
    public final boolean c(String str) {
        h.f.b.l.d(str, "");
        return b(null, str);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        Uri uri;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null) {
            str = null;
        } else {
            str = uri.getHost();
        }
        return h.f.b.l.a((Object) "login", (Object) str);
    }

    private static void a(Activity activity, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
        activity.startActivity(intent);
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.ss.android.ugc.aweme.ck.j
    public final boolean a(Activity activity, String str) {
        return b(activity, str);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        String str2 = null;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (routeIntent != null) {
                str2 = routeIntent.getUrl();
            }
            b(activity, str2);
            return true;
        }
        Activity j2 = f.j();
        if (j2 != null) {
            if (routeIntent != null) {
                str2 = routeIntent.getUrl();
            }
            b(j2, str2);
            return true;
        }
        if (routeIntent != null) {
            str = routeIntent.getUrl();
        } else {
            str = null;
        }
        b(null, str);
        return true;
    }

    private static boolean b(Activity activity, String str) {
        if (h.f.b.l.a((Object) "push", (Object) Uri.parse(str).getQueryParameter("enter_from"))) {
            Intent a2 = c.a(activity);
            Intent intent = new Intent(activity, PushLoginActivity.class);
            if (activity != null) {
                IAccountUserService g2 = b.g();
                h.f.b.l.b(g2, "");
                if (!g2.isLogin()) {
                    o a3 = o.a();
                    h.f.b.l.b(a3, "");
                    if (a3.f66861a.a()) {
                        a(activity, intent);
                    } else {
                        activity.startActivities(new Intent[]{a2, intent});
                    }
                    return true;
                }
            }
            Context a4 = d.a();
            h.f.b.l.b(a2, "");
            a2.setFlags(268435456);
            a(a4, a2);
            return true;
        }
        if (activity == null) {
            com.ss.android.ugc.aweme.login.c.a(f.j(), "h5", "");
        } else {
            com.ss.android.ugc.aweme.login.c.a(activity, "h5", "");
        }
        return true;
    }
}

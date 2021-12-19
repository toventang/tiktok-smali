package com.ss.android.ugc.aweme.ck;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.ac;
import com.ss.android.ugc.aweme.utils.a.c;
import h.f.b.l;

public final class k implements IInterceptor {

    /* renamed from: a  reason: collision with root package name */
    public static final a f71136a = new a((byte) 0);

    static {
        Covode.recordClassIndex(43785);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43786);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
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
        return l.a((Object) "chat", (Object) str);
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (!(context == null || routeIntent == null)) {
            b.a();
            IAccountUserService e2 = b.f62864a.e();
            l.b(e2, "");
            if (!e2.isLogin() && (context instanceof Activity)) {
                a(context, ac.a.a((Activity) context, routeIntent.getExtra(), routeIntent.getUri().getQueryParameter("multi_account_push_uid")));
                return true;
            } else if (com.ss.android.ugc.aweme.inbox.b.b.b()) {
                Intent a2 = c.a(context);
                a2.setFlags(67108864);
                a2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
                a2.putExtras(routeIntent.getExtra());
                a(context, a2);
                return true;
            }
        }
        return false;
    }
}

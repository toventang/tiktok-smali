package com.ss.android.ugc.aweme.ck;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import h.f.b.l;

public final class g implements IInterceptor {

    /* renamed from: a  reason: collision with root package name */
    public static final a f71133a = new a((byte) 0);

    static {
        Covode.recordClassIndex(43778);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43779);
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
        return l.a((Object) str, (Object) "draft_box");
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Context context2;
        Class<? extends Activity> draftBoxActivity = AVExternalServiceImpl.a().classnameService().getDraftBoxActivity();
        if (context instanceof Activity) {
            a(context, new Intent(context, draftBoxActivity));
            return true;
        }
        if (context == null) {
            context2 = d.a();
        } else {
            context2 = context;
        }
        Intent intent = new Intent(context, draftBoxActivity);
        intent.addFlags(268435456);
        a(context2, intent);
        return true;
    }
}

package com.ss.android.ugc.aweme.ecommerce.router;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.ecommerce.common.a.b;
import com.ss.android.ugc.aweme.ecommerce.util.h;
import h.f.b.l;
import h.m.p;
import java.util.Set;

public final class c implements IInterceptor {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f87145a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f87146b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(54684);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(54683);
        Uri parse = Uri.parse("aweme://echybrid");
        l.b(parse, "");
        f87145a = parse;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null) {
            return false;
        }
        String scheme = uri.getScheme();
        Uri uri2 = f87145a;
        if (!TextUtils.equals(scheme, uri2.getScheme()) || !TextUtils.equals(uri.getAuthority(), uri2.getAuthority()) || !TextUtils.equals(uri.getPath(), uri2.getPath())) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Uri uri;
        boolean z;
        float f2;
        Float c2;
        if (!(routeIntent == null || (uri = routeIntent.getUri()) == null)) {
            Uri.Builder encodedAuthority = new Uri.Builder().scheme("bullet").encodedAuthority("bullet");
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            l.b(queryParameterNames, "");
            for (T t : queryParameterNames) {
                encodedAuthority.appendQueryParameter(t, uri.getQueryParameter(t));
            }
            Uri build = encodedAuthority.build();
            i iVar = null;
            if (context instanceof e) {
                e eVar = (e) context;
                i supportFragmentManager = eVar.getSupportFragmentManager();
                l.b(supportFragmentManager, "");
                if (!supportFragmentManager.g()) {
                    i supportFragmentManager2 = eVar.getSupportFragmentManager();
                    l.b(supportFragmentManager2, "");
                    if (!supportFragmentManager2.h()) {
                        iVar = eVar.getSupportFragmentManager();
                    }
                }
            }
            String queryParameter = uri.getQueryParameter("is_large_half");
            if (queryParameter != null) {
                z = l.a((Object) queryParameter, (Object) "1");
            } else {
                z = false;
            }
            String queryParameter2 = uri.getQueryParameter("container_height");
            if (queryParameter2 == null || (c2 = p.c(queryParameter2)) == null) {
                f2 = 1.0f;
            } else {
                c2.floatValue();
                f2 = c2.floatValue();
            }
            if (iVar != null) {
                if (z) {
                    l.b(build, "");
                    int i2 = (int) h.f87569c;
                    String uri2 = build.toString();
                    l.b(uri2, "");
                    b.a.a(build, i2, iVar, uri2, true);
                } else if (f2 < 1.0f) {
                    l.b(build, "");
                    int i3 = (int) (((float) h.f87568b) * f2);
                    String uri3 = build.toString();
                    l.b(uri3, "");
                    b.a.a(build, i3, iVar, uri3, true);
                }
            }
            if (context != null) {
                IBulletService f3 = BulletService.f();
                String uri4 = build.toString();
                l.b(uri4, "");
                f3.a(context, uri4);
            }
        }
        return true;
    }
}

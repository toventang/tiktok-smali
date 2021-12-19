package com.ss.android.ugc.aweme.ecommerce.router;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.ECommerceService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import h.f.b.l;

public final class e implements IInterceptor {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f87148a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f87149b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(54688);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(54687);
        Uri parse = Uri.parse("aweme://echybrid");
        l.b(parse, "");
        f87148a = parse;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String queryParameter;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || (queryParameter = uri.getQueryParameter("url")) == null || !l.a((Object) "1", (Object) Uri.parse(queryParameter).getQueryParameter("outer_ecom_product"))) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        Uri uri;
        IECommerceService createIECommerceServicebyMonsterPlugin = ECommerceService.createIECommerceServicebyMonsterPlugin(false);
        if (routeIntent == null || (uri = routeIntent.getUri()) == null) {
            str = null;
        } else {
            str = uri.getQueryParameter("url");
        }
        createIECommerceServicebyMonsterPlugin.showThirdpartyDisclaimerTips(context, str);
        return false;
    }
}

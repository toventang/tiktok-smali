package com.ss.android.ugc.aweme.ecommerce.router;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.im.IIMAdapterService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.common.data.service.IMAdapterServiceImpl;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.a;
import h.f.b.l;

public final class d implements IInterceptor {

    /* renamed from: a  reason: collision with root package name */
    public static final a f87147a = new a((byte) 0);

    static {
        Covode.recordClassIndex(54685);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54686);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        if (!(routeIntent == null || routeIntent.getUri() == null)) {
            StringBuilder sb = new StringBuilder();
            Uri uri = routeIntent.getUri();
            l.b(uri, "");
            StringBuilder append = sb.append(uri.getAuthority());
            Uri uri2 = routeIntent.getUri();
            l.b(uri2, "");
            if (l.a((Object) "chat/launchchat", (Object) append.append(uri2.getPath()).toString())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String queryParameter;
        IIMAdapterService d2;
        if (routeIntent == null || routeIntent.getUri() == null || (queryParameter = routeIntent.getUri().getQueryParameter("uid")) == null || queryParameter.length() == 0) {
            return false;
        }
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        String str = "";
        l.b(createIIMServicebyMonsterPlugin, str);
        if (!(createIIMServicebyMonsterPlugin == null || (d2 = IMAdapterServiceImpl.d()) == null || !d2.a())) {
            IMUser iMUser = new IMUser();
            Uri uri = routeIntent.getUri();
            iMUser.setUid(queryParameter);
            iMUser.setNickName(uri.getQueryParameter("nickname"));
            iMUser.setSignature(uri.getQueryParameter("alias"));
            iMUser.setFake(true);
            a.C2643a a2 = a.b.a(context, iMUser);
            String queryParameter2 = routeIntent.getUri().getQueryParameter("enter_from");
            if (queryParameter2 != null) {
                str = queryParameter2;
            }
            com.ss.android.ugc.aweme.im.service.model.a aVar = a2.c(str).a().f103883a;
            String userId = aVar.getUserId();
            if (userId != null && userId.length() > 0) {
                createIIMServicebyMonsterPlugin.startChat(aVar);
            }
        }
        return true;
    }
}

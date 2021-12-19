package com.ss.android.ugc.aweme.deeplink;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.deeplink.RequireLoginActivity;
import com.ss.android.ugc.aweme.deeplink.a;
import com.ss.android.ugc.aweme.deeplink.d.e;
import com.ss.android.ugc.aweme.deeplink.u;
import com.ss.android.ugc.aweme.deeplink.v;
import f.a.b.b;
import h.f.b.l;

public final class DeepLinkServiceImpl implements IDeepLinkService {
    static {
        Covode.recordClassIndex(49314);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String f() {
        return a.f79425b;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String e() {
        return a.C1849a.a();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String b() {
        String name = DeepLinkHandlerActivity.class.getName();
        l.b(name, "");
        return name;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String c() {
        String name = DeepLinkActivityV2.class.getName();
        l.b(name, "");
        return name;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String d() {
        String name = AppLinkHandlerV2.class.getName();
        l.b(name, "");
        return name;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void a() {
        u.f79533a = null;
        u.f79535c = false;
        u.f79534b = "";
        u.f79538f = null;
        b bVar = u.f79536d;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public static IDeepLinkService g() {
        MethodCollector.i(12690);
        Object a2 = com.ss.android.ugc.b.a(IDeepLinkService.class, false);
        if (a2 != null) {
            IDeepLinkService iDeepLinkService = (IDeepLinkService) a2;
            MethodCollector.o(12690);
            return iDeepLinkService;
        }
        if (com.ss.android.ugc.b.aX == null) {
            synchronized (IDeepLinkService.class) {
                try {
                    if (com.ss.android.ugc.b.aX == null) {
                        com.ss.android.ugc.b.aX = new DeepLinkServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12690);
                    throw th;
                }
            }
        }
        DeepLinkServiceImpl deepLinkServiceImpl = (DeepLinkServiceImpl) com.ss.android.ugc.b.aX;
        MethodCollector.o(12690);
        return deepLinkServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String b(String str) {
        l.d(str, "");
        return a.C1849a.a(str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String a2 = a.C1849a.a();
        if (l.a((Object) str, (Object) a.f79424a) || l.a((Object) str, (Object) a2) || l.a((Object) str, (Object) a.f79427d) || l.a((Object) str, (Object) a.f79428e)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean a(String str) {
        l.d(str, "");
        l.d(str, "");
        if (m.a(str)) {
            return false;
        }
        if (l.a((Object) a.f79424a, (Object) str)) {
            return true;
        }
        String a2 = a.C1849a.a();
        if (m.a(a2) || !l.a((Object) a2, (Object) str)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        w wVar = new w(str, str2);
        l.d(wVar, "");
        v.f79541a.onNext(wVar);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void a(d dVar, c cVar) {
        l.d(dVar, "");
        l.d(cVar, "");
        l.d(dVar, "");
        l.d(cVar, "");
        u.f79537e = cVar;
        u.f79538f = dVar;
        if (!u.f79535c) {
            if (u.f79533a == null) {
                u.f79533a = new t(u.f79537e);
                u.f79535c = true;
            }
            u.a aVar = u.a.f79540a;
            l.d(aVar, "");
            b d2 = v.f79541a.d(new v.a(aVar));
            l.b(d2, "");
            u.f79536d = d2;
        }
        s a2 = u.a();
        if (a2 != null) {
            a2.a(dVar, a2);
        }
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void a(String str, boolean z, String str2) {
        e.a(str, z, str2);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void b(Activity activity, String str, boolean z) {
        l.d(activity, "");
        l.d(str, "");
        RequireLoginActivity.a.a(activity, str, z);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean a(Activity activity, String str, boolean z) {
        Uri uri;
        l.d(activity, "");
        l.d(str, "");
        l.d(activity, "");
        l.d(str, "");
        Intent intent = activity.getIntent();
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        if (!RequireLoginActivity.a.a(uri)) {
            return false;
        }
        RequireLoginActivity.a.a(activity, str, z);
        return true;
    }
}

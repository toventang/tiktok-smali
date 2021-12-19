package com.ss.android.ugc.tiktok.deeplink.impl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.utils.dc;
import com.ss.android.ugc.aweme.web.k;
import com.ss.android.ugc.b;
import com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService;
import h.f.b.l;

public final class DeeplinkPrefetchImpl implements IDeepLinkSecurityService {
    static {
        Covode.recordClassIndex(98108);
    }

    public static IDeepLinkSecurityService a() {
        MethodCollector.i(4051);
        Object a2 = b.a(IDeepLinkSecurityService.class, false);
        if (a2 != null) {
            IDeepLinkSecurityService iDeepLinkSecurityService = (IDeepLinkSecurityService) a2;
            MethodCollector.o(4051);
            return iDeepLinkSecurityService;
        }
        if (b.eJ == null) {
            synchronized (IDeepLinkSecurityService.class) {
                try {
                    if (b.eJ == null) {
                        b.eJ = new DeeplinkPrefetchImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4051);
                    throw th;
                }
            }
        }
        DeeplinkPrefetchImpl deeplinkPrefetchImpl = (DeeplinkPrefetchImpl) b.eJ;
        MethodCollector.o(4051);
        return deeplinkPrefetchImpl;
    }

    @Override // com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService
    public final void a(Context context) {
        a aVar;
        if (SettingsManager.a().a("roma_schema_enabled", true) && b.f148987b == null) {
            boolean z = Keva.getRepo("gecko_deeplink").getBoolean(b.f148986a + d.i(), true);
            k kVar = k.f145061a;
            l.b(kVar, "");
            String c2 = kVar.c();
            long j2 = -1L;
            l.b(c2, "");
            l.b(k.f145061a, "");
            String a2 = b.a(dc.a("offlineX", c2, "roma_schema_config"));
            if (!TextUtils.isEmpty(a2)) {
                l.b(k.f145061a, "");
                j2 = dc.b("offlineX", c2, "roma_schema_config");
            }
            if (a2 == null || a2.length() == 0) {
                aVar = null;
            } else {
                aVar = new a(a2, j2);
            }
            if (!z || aVar == null) {
                a a3 = b.a(context);
                if (aVar == null) {
                    b.f148987b = a3;
                    return;
                }
                if (!(a3 == null || aVar.f148982a == null)) {
                    long longValue = a3.f148985d.longValue();
                    Long l2 = aVar.f148985d;
                    l.b(l2, "");
                    if (longValue > l2.longValue()) {
                        b.f148987b = a3;
                        return;
                    }
                }
                b.f148987b = aVar;
                Keva.getRepo("gecko_deeplink").storeBoolean(b.f148986a + d.i(), true);
                return;
            }
            b.f148987b = aVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    @Override // com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.tiktok.deeplink.b a(com.ss.android.ugc.tiktok.deeplink.a r12) {
        /*
        // Method dump skipped, instructions count: 496
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.deeplink.impl.DeeplinkPrefetchImpl.a(com.ss.android.ugc.tiktok.deeplink.a):com.ss.android.ugc.tiktok.deeplink.b");
    }
}

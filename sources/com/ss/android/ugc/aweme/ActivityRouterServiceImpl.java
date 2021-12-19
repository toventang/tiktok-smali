package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2;
import com.ss.android.ugc.aweme.shortvideo.y.a;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class ActivityRouterServiceImpl implements IActivityRouterService {
    static {
        Covode.recordClassIndex(38339);
    }

    @Override // com.ss.android.ugc.aweme.IActivityRouterService
    public final Class<? extends Activity> a() {
        return DeepLinkActivityV2.class;
    }

    public static IActivityRouterService b() {
        MethodCollector.i(3400);
        Object a2 = b.a(IActivityRouterService.class, false);
        if (a2 != null) {
            IActivityRouterService iActivityRouterService = (IActivityRouterService) a2;
            MethodCollector.o(3400);
            return iActivityRouterService;
        }
        if (b.f145537l == null) {
            synchronized (IActivityRouterService.class) {
                try {
                    if (b.f145537l == null) {
                        b.f145537l = new ActivityRouterServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3400);
                    throw th;
                }
            }
        }
        ActivityRouterServiceImpl activityRouterServiceImpl = (ActivityRouterServiceImpl) b.f145537l;
        MethodCollector.o(3400);
        return activityRouterServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.IActivityRouterService
    public final Intent a(Context context, Uri uri) {
        Intent a2 = com.ss.android.ugc.aweme.crossplatform.a.b.a(context, uri);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.IActivityRouterService
    public final void a(Activity activity, Uri uri) {
        l.d(activity, "");
        l.d(uri, "");
        a.a(activity, uri);
    }
}

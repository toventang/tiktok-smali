package com.ss.android.ugc.aweme.crossplatform;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.sdk.webview.i;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.web.b.c;
import com.ss.android.ugc.aweme.web.k;
import com.ss.android.ugc.b;
import java.util.Map;

public class CrossPlatformServiceImpl implements ICrossPlatformService {
    static {
        Covode.recordClassIndex(48745);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.ICrossPlatformService
    public final Class<? extends Activity> a() {
        return CrossPlatformActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.ICrossPlatformService
    public final String b() {
        return k.f145061a.c();
    }

    public static ICrossPlatformService c() {
        MethodCollector.i(12885);
        Object a2 = b.a(ICrossPlatformService.class, false);
        if (a2 != null) {
            ICrossPlatformService iCrossPlatformService = (ICrossPlatformService) a2;
            MethodCollector.o(12885);
            return iCrossPlatformService;
        }
        if (b.aV == null) {
            synchronized (ICrossPlatformService.class) {
                try {
                    if (b.aV == null) {
                        b.aV = new CrossPlatformServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12885);
                    throw th;
                }
            }
        }
        CrossPlatformServiceImpl crossPlatformServiceImpl = (CrossPlatformServiceImpl) b.aV;
        MethodCollector.o(12885);
        return crossPlatformServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.ICrossPlatformService
    public final void a(Context context, Map<String, String> map) {
        c a2 = c.a();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (a.f107168c && applicationContext == null) {
                applicationContext = a.f107166a;
            }
            a2.f144889b = applicationContext;
        }
        a2.f144888a = map;
        i.a().a(new com.ss.android.ugc.aweme.web.b.b());
    }
}

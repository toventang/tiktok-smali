package com.ss.android.ugc.aweme.commercialize.views;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.ad.feed.IAdLightWebPageOpen;
import com.ss.android.ugc.aweme.commercialize.views.a;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class AdLightWebPageOpenUtils implements IAdLightWebPageOpen {
    static {
        Covode.recordClassIndex(46785);
    }

    public static IAdLightWebPageOpen a() {
        MethodCollector.i(2815);
        Object a2 = b.a(IAdLightWebPageOpen.class, false);
        if (a2 != null) {
            IAdLightWebPageOpen iAdLightWebPageOpen = (IAdLightWebPageOpen) a2;
            MethodCollector.o(2815);
            return iAdLightWebPageOpen;
        }
        if (b.ax == null) {
            synchronized (IAdLightWebPageOpen.class) {
                try {
                    if (b.ax == null) {
                        b.ax = new AdLightWebPageOpenUtils();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2815);
                    throw th;
                }
            }
        }
        AdLightWebPageOpenUtils adLightWebPageOpenUtils = (AdLightWebPageOpenUtils) b.ax;
        MethodCollector.o(2815);
        return adLightWebPageOpenUtils;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IAdLightWebPageOpen
    public final void a(Activity activity, String str) {
        l.d(activity, "");
        l.d(str, "");
        a.d dVar = a.n;
        boolean unused = a.d.a(activity, str, (Boolean) false, a.f75904m);
    }
}

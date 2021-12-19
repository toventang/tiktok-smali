package com.ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.crossplatform.activity.MainMixActivityContainer;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.ss.android.ugc.aweme.crossplatform.d.a.a;
import com.ss.android.ugc.b;

public class MixActivityContainerProvider implements IMixActivityContainerProvider {
    static {
        Covode.recordClassIndex(48817);
    }

    public static IMixActivityContainerProvider a() {
        MethodCollector.i(2425);
        Object a2 = b.a(IMixActivityContainerProvider.class, false);
        if (a2 != null) {
            IMixActivityContainerProvider iMixActivityContainerProvider = (IMixActivityContainerProvider) a2;
            MethodCollector.o(2425);
            return iMixActivityContainerProvider;
        }
        if (b.aW == null) {
            synchronized (IMixActivityContainerProvider.class) {
                try {
                    if (b.aW == null) {
                        b.aW = new MixActivityContainerProvider();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2425);
                    throw th;
                }
            }
        }
        MixActivityContainerProvider mixActivityContainerProvider = (MixActivityContainerProvider) b.aW;
        MethodCollector.o(2425);
        return mixActivityContainerProvider;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.business.IMixActivityContainerProvider
    public final MixActivityContainer a(Activity activity, a aVar) {
        return new MainMixActivityContainer(activity, aVar);
    }
}

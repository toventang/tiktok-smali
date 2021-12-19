package com.ss.android.ugc.aweme.ecommerce.router;

import android.net.Uri;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.ecommerce.router.view.FallbackView;
import com.ss.android.ugc.aweme.ecommerce.router.view.a;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class StrategyService implements IStrategyService {
    static {
        Covode.recordClassIndex(54676);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.IStrategyService
    public final h a() {
        return new o();
    }

    public static IStrategyService b() {
        MethodCollector.i(3478);
        Object a2 = b.a(IStrategyService.class, false);
        if (a2 != null) {
            IStrategyService iStrategyService = (IStrategyService) a2;
            MethodCollector.o(3478);
            return iStrategyService;
        }
        if (b.bk == null) {
            synchronized (IStrategyService.class) {
                try {
                    if (b.bk == null) {
                        b.bk = new StrategyService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3478);
                    throw th;
                }
            }
        }
        StrategyService strategyService = (StrategyService) b.bk;
        MethodCollector.o(3478);
        return strategyService;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.IStrategyService
    public final a a(e eVar, Uri uri, boolean z) {
        l.d(eVar, "");
        l.d(uri, "");
        FallbackView fallbackView = new FallbackView(eVar);
        fallbackView.a(eVar, uri, z);
        return fallbackView;
    }
}

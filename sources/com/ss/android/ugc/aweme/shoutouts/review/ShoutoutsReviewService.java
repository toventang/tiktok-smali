package com.ss.android.ugc.aweme.shoutouts.review;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.shoutouts.api.IShoutoutsReviewService;
import com.ss.android.ugc.aweme.shoutouts.api.a;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class ShoutoutsReviewService implements IShoutoutsReviewService {
    static {
        Covode.recordClassIndex(87212);
    }

    public static IShoutoutsReviewService a() {
        MethodCollector.i(1699);
        Object a2 = b.a(IShoutoutsReviewService.class, false);
        if (a2 != null) {
            IShoutoutsReviewService iShoutoutsReviewService = (IShoutoutsReviewService) a2;
            MethodCollector.o(1699);
            return iShoutoutsReviewService;
        }
        if (b.eg == null) {
            synchronized (IShoutoutsReviewService.class) {
                try {
                    if (b.eg == null) {
                        b.eg = new ShoutoutsReviewService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1699);
                    throw th;
                }
            }
        }
        ShoutoutsReviewService shoutoutsReviewService = (ShoutoutsReviewService) b.eg;
        MethodCollector.o(1699);
        return shoutoutsReviewService;
    }

    @Override // com.ss.android.ugc.aweme.shoutouts.api.IShoutoutsReviewService
    public final void a(Context context, String str, Integer num, Float f2, String str2) {
        l.d(context, "");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//shoutouts/detail");
        if (str != null) {
            buildRoute.withParam("description", str);
        }
        if (num != null) {
            buildRoute.withParam("coin", String.valueOf(num.intValue()));
        }
        if (f2 != null) {
            buildRoute.withParam("standardMoney", String.valueOf(f2.floatValue()));
        }
        if (str2 != null) {
            buildRoute.withParam("currencyCharacter", str2);
        }
        buildRoute.withParam("enter_from", "tools_preview");
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.shoutouts.api.IShoutoutsReviewService
    public final void a(ViewGroup viewGroup, int i2, float f2, String str, String str2, a aVar) {
        MethodCollector.i(272);
        l.d(viewGroup, "");
        l.d(str, "");
        Context context = viewGroup.getContext();
        l.b(context, "");
        c cVar = new c(context, (byte) 0);
        viewGroup.addView(cVar, new ViewGroup.LayoutParams(-1, -1));
        cVar.setDescription(str2);
        cVar.a(i2, (int) f2, str, 0.0f, 0, true, false);
        cVar.a();
        cVar.setBottomSheetCallback(aVar);
        MethodCollector.o(272);
    }
}

package com.ss.android.ugc.aweme.di;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.services.d;
import com.ss.android.ugc.aweme.commercialize.model.ad;
import com.ss.android.ugc.aweme.main.service.ICommerceService;
import com.ss.android.ugc.b;

public class CommerceServiceImpl implements ICommerceService {

    /* renamed from: a  reason: collision with root package name */
    private final ICommerceService f80119a = d.a.f66888a;

    static {
        Covode.recordClassIndex(49861);
    }

    public static ICommerceService a() {
        MethodCollector.i(4897);
        Object a2 = b.a(ICommerceService.class, false);
        if (a2 != null) {
            ICommerceService iCommerceService = (ICommerceService) a2;
            MethodCollector.o(4897);
            return iCommerceService;
        }
        if (b.aY == null) {
            synchronized (ICommerceService.class) {
                try {
                    if (b.aY == null) {
                        b.aY = new CommerceServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4897);
                    throw th;
                }
            }
        }
        CommerceServiceImpl commerceServiceImpl = (CommerceServiceImpl) b.aY;
        MethodCollector.o(4897);
        return commerceServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.main.service.ICommerceService
    public final ad a(String str) {
        return this.f80119a.a(str);
    }

    @Override // com.ss.android.ugc.aweme.main.service.ICommerceService
    public final boolean a(Context context, String str, String str2) {
        return this.f80119a.a(context, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.main.service.ICommerceService
    public final boolean a(Context context, String str, boolean z) {
        return this.f80119a.a(context, str, z);
    }
}

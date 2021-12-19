package com.ss.android.ugc.aweme.im.sdk.common.data.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.im.IIMAdapterService;
import com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.b;

public class IMAdapterServiceImpl extends a {
    static {
        Covode.recordClassIndex(65633);
    }

    @Override // com.ss.android.ugc.aweme.im.IIMAdapterService
    public final boolean b() {
        return ImUnder16Manger.b();
    }

    @Override // com.ss.android.ugc.aweme.im.IIMAdapterService
    public final boolean c() {
        return ImUnder16Manger.c();
    }

    @Override // com.ss.android.ugc.aweme.im.IIMAdapterService
    public final boolean a() {
        if (SharePrefCache.inst().getCanIm().c().intValue() == 1) {
            return true;
        }
        return false;
    }

    public static IIMAdapterService d() {
        MethodCollector.i(6700);
        Object a2 = b.a(IIMAdapterService.class, false);
        if (a2 != null) {
            IIMAdapterService iIMAdapterService = (IIMAdapterService) a2;
            MethodCollector.o(6700);
            return iIMAdapterService;
        }
        if (b.bA == null) {
            synchronized (IIMAdapterService.class) {
                try {
                    if (b.bA == null) {
                        b.bA = new IMAdapterServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6700);
                    throw th;
                }
            }
        }
        a aVar = (a) b.bA;
        MethodCollector.o(6700);
        return aVar;
    }

    @Override // com.ss.android.ugc.aweme.im.IIMAdapterService, com.ss.android.ugc.aweme.im.sdk.common.data.service.a
    public final /* bridge */ /* synthetic */ void a(User user) {
        super.a(user);
    }
}

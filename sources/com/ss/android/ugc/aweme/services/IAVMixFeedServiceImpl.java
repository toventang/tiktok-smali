package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.mix.b.j;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.port.in.IAVMixFeedService;
import com.ss.android.ugc.aweme.port.in.ah;
import com.ss.android.ugc.b;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;

public final class IAVMixFeedServiceImpl implements IAVMixFeedService {
    private final IMixFeedService mixFeedService = MixFeedService.k();

    static {
        Covode.recordClassIndex(79451);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVMixFeedService
    public final boolean needCreateFirstMix() {
        return this.mixFeedService.b();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVMixFeedService
    public final boolean needShowAddOrRemoveButton() {
        return this.mixFeedService.a();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVMixFeedService
    public final void updateFeedEvent() {
        c.a(new j(false, null));
    }

    public static IAVMixFeedService createIAVMixFeedServicebyMonsterPlugin(boolean z) {
        MethodCollector.i(10011);
        Object a2 = b.a(IAVMixFeedService.class, z);
        if (a2 != null) {
            IAVMixFeedService iAVMixFeedService = (IAVMixFeedService) a2;
            MethodCollector.o(10011);
            return iAVMixFeedService;
        }
        if (b.ds == null) {
            synchronized (IAVMixFeedService.class) {
                try {
                    if (b.ds == null) {
                        b.ds = new IAVMixFeedServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10011);
                    throw th;
                }
            }
        }
        IAVMixFeedServiceImpl iAVMixFeedServiceImpl = (IAVMixFeedServiceImpl) b.ds;
        MethodCollector.o(10011);
        return iAVMixFeedServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVMixFeedService
    public final void showAddToMixInPublishPage(Activity activity, ah ahVar, String str, String str2, String str3, String str4) {
        l.d(activity, "");
        l.d(ahVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.mixFeedService.a(activity, new IAVMixFeedServiceImpl$showAddToMixInPublishPage$1(ahVar), str, str2, str3, str4);
    }
}

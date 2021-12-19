package com.ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.miniapp.a.a;
import com.ss.android.ugc.b;
import h.f.b.l;
import h.p;

public final class IRessoAnchorServiceImpl implements IRessoAnchorService {
    static {
        Covode.recordClassIndex(79474);
    }

    @Override // com.ss.android.ugc.aweme.services.IRessoAnchorService
    public final p<Long, Integer> getCopyrightLimitMsUninstalledResso(String str) {
        return a.b(str);
    }

    public static IRessoAnchorService createIRessoAnchorServicebyMonsterPlugin(boolean z) {
        Object a2 = b.a(IRessoAnchorService.class, z);
        if (a2 != null) {
            return (IRessoAnchorService) a2;
        }
        return new IRessoAnchorServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.services.IRessoAnchorService
    public final boolean showAnchorUninstalledResso(String str, Context context) {
        l.d(str, "");
        l.d(context, "");
        return a.a(context, str);
    }
}

package com.ss.android.ugc.aweme.service.downgrade;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.service.IEtDebugService;
import h.f.b.l;

public final class DefaultEtDebugServiceImpl implements IEtDebugService {
    static {
        Covode.recordClassIndex(79373);
    }

    @Override // com.ss.android.ugc.aweme.service.IEtDebugService
    public final void a(Context context) {
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.service.IEtDebugService
    public final void a(String str, Context context) {
        l.d(str, "");
        l.d(context, "");
    }
}

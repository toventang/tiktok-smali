package com.ss.android.ugc.aweme.service.downgrade;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.service.IFrameCheckService;
import h.f.b.l;

public final class DefaultFrameCheckServiceImpl implements IFrameCheckService {
    static {
        Covode.recordClassIndex(79375);
    }

    @Override // com.ss.android.ugc.aweme.service.IFrameCheckService
    public final void a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
    }
}

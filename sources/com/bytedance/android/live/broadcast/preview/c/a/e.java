package com.bytedance.android.live.broadcast.preview.c.a;

import com.bytedance.android.live.broadcast.preview.c.a;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e implements a {
    static {
        Covode.recordClassIndex(4077);
    }

    @Override // com.bytedance.android.live.broadcast.preview.c.a
    public final boolean a(a.C0122a aVar) {
        l.d(aVar, "");
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IHostContext.class);
        l.b(a2, "");
        if (!((IHostContext) a2).isNeedProtectMinor()) {
            return false;
        }
        ao.a(y.e(), (int) R.string.gtf);
        return true;
    }
}

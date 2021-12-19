package com.ss.android.ugc.aweme.commercialize.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IHostRouterDepend;
import com.ss.android.ugc.aweme.ck.t;
import h.f.b.l;

public final class r implements IHostRouterDepend {
    static {
        Covode.recordClassIndex(45432);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostRouterDepend
    public final boolean isHostScheme(String str) {
        l.d(str, "");
        return l.a((Object) str, (Object) "aweme");
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostRouterDepend
    public final boolean openHostScheme(String str) {
        l.d(str, "");
        return t.a(t.a(), str);
    }
}

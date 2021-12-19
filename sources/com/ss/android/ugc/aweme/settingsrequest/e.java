package com.ss.android.ugc.aweme.settingsrequest;

import com.bytedance.covode.number.Covode;
import com.bytedance.u.a;
import com.ss.android.ugc.aweme.utils.bn;

public abstract class e implements a {
    static {
        Covode.recordClassIndex(80922);
    }

    @Override // com.bytedance.u.a
    public final String a() {
        return "CACHE";
    }

    @Override // com.bytedance.u.a
    public final boolean b() {
        com.ss.android.ugc.aweme.video.e.b(c());
        return true;
    }

    @Override // com.bytedance.u.a
    public final boolean d() {
        com.ss.android.ugc.aweme.video.e.b(c());
        return true;
    }

    @Override // com.bytedance.u.a
    public final long e() {
        return bn.a(c());
    }
}

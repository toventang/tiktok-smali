package com.ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.livesdkapi.host.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import h.f.b.l;

public final class ac implements i {
    static {
        Covode.recordClassIndex(69480);
    }

    @Override // com.bytedance.android.live.base.a
    public final void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.i
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        RuntimeBehaviorServiceImpl.c().a(str, str2);
    }
}

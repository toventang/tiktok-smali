package com.ss.android.ugc.aweme.comment.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.comment.ui.k;
import h.f.a.b;
import h.z;

final /* synthetic */ class be implements b {

    /* renamed from: a  reason: collision with root package name */
    private final k.AnonymousClass8 f72567a;

    static {
        Covode.recordClassIndex(44714);
    }

    be(k.AnonymousClass8 r1) {
        this.f72567a = r1;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        SmartRouter.buildRoute(k.this.getActivity(), "//setting/blocklist").open();
        return z.f158842a;
    }
}

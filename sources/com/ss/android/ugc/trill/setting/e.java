package com.ss.android.ugc.trill.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.activity.processor.x;
import h.f.a.b;

final /* synthetic */ class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final x f150588a;

    static {
        Covode.recordClassIndex(99026);
    }

    e(x xVar) {
        this.f150588a = xVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        ((BaseViewModel) obj).config(new f(this.f150588a));
        return null;
    }
}

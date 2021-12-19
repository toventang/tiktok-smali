package com.ss.android.ugc.aweme.friends.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.activity.processor.x;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements h.f.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final x f97227a;

    static {
        Covode.recordClassIndex(61760);
    }

    b(x xVar) {
        this.f97227a = xVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        baseViewModel.config(new c(this.f97227a));
        baseViewModel.config(d.f97229a);
        return null;
    }
}

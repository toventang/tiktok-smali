package com.ss.android.ugc.aweme.detail.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.activity.processor.x;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements h.f.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final x f79926a;

    static {
        Covode.recordClassIndex(49723);
    }

    b(x xVar) {
        this.f79926a = xVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        baseViewModel.config(new h(this.f79926a));
        baseViewModel.config(i.f79951a);
        baseViewModel.config(j.f79952a);
        return null;
    }
}

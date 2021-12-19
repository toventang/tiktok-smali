package com.ss.android.ugc.aweme.prop.activity;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.activity.processor.x;
import h.f.a.b;

final /* synthetic */ class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final x f118219a;

    static {
        Covode.recordClassIndex(76765);
    }

    a(x xVar) {
        this.f118219a = xVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        baseViewModel.config(new b(this.f118219a));
        baseViewModel.config(c.f118221a);
        return null;
    }
}

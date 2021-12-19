package com.ss.android.ugc.aweme.compliance.business.setting.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.activity.processor.x;
import h.f.a.b;

final /* synthetic */ class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final x f77196a;

    static {
        Covode.recordClassIndex(47727);
    }

    a(x xVar) {
        this.f77196a = xVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        ((BaseViewModel) obj).config(new b(this.f77196a));
        return null;
    }
}

package com.ss.android.ugc.aweme.setting.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import h.f.a.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w implements b {

    /* renamed from: a  reason: collision with root package name */
    private final v f122942a;

    static {
        Covode.recordClassIndex(80711);
    }

    w(v vVar) {
        this.f122942a = vVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        baseViewModel.config(new bp(this.f122942a));
        baseViewModel.config(bq.f122875a);
        return null;
    }
}

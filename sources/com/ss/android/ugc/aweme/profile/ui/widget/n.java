package com.ss.android.ugc.aweme.profile.ui.widget;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.c;
import h.f.a.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements b {

    /* renamed from: a  reason: collision with root package name */
    private final l f117469a;

    static {
        Covode.recordClassIndex(75882);
    }

    n(l lVar) {
        this.f117469a = lVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        l lVar = this.f117469a;
        c cVar = (c) obj;
        if (cVar.f103893a || !cVar.f103894b) {
            return null;
        }
        lVar.f117458d.setOnClickListener(lVar);
        return null;
    }
}

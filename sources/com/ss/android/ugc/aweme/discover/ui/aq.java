package com.ss.android.ugc.aweme.discover.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.ai;
import com.ss.android.ugc.aweme.search.j;
import h.f.a.b;

final /* synthetic */ class aq implements b {

    /* renamed from: a  reason: collision with root package name */
    private final ap f82323a;

    static {
        Covode.recordClassIndex(51235);
    }

    aq(ap apVar) {
        this.f82323a = apVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        ap apVar = this.f82323a;
        ai aiVar = (ai) obj;
        if (apVar.q) {
            return null;
        }
        apVar.f82313c.setCurrentItem(j.a(aiVar.f66560a));
        return null;
    }
}

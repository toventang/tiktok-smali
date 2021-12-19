package com.ss.android.ugc.aweme.account.login.v2.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import h.f.b.l;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public final c f64729a;

    static {
        Covode.recordClassIndex(39779);
    }

    public abstract boolean a();

    public d(c cVar) {
        l.d(cVar, "");
        this.f64729a = cVar;
    }

    protected static void a(a.C0731a aVar) {
        l.d(aVar, "");
        aVar.a().b().setCanceledOnTouchOutside(false);
    }
}

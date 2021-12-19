package com.ss.android.ugc.aweme.legoImpl.task;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.e;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;

final /* synthetic */ class c implements e {

    /* renamed from: a  reason: collision with root package name */
    static final e f108028a = new c();

    static {
        Covode.recordClassIndex(69268);
    }

    private c() {
    }

    @Override // com.google.android.gms.c.e
    public final void a(Object obj) {
        r.a("firebase_to_server", new d().a("app_instance_id", (String) obj).a("growth_deepevent", 3).f66730a);
    }
}

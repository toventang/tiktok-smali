package com.ss.android.ugc.aweme.account.login.v2.ui.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.a.b.a;
import com.ss.android.ugc.aweme.account.login.v2.base.c;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;

public final class i {
    static {
        Covode.recordClassIndex(39851);
    }

    public static final void a(c cVar, boolean z, int i2) {
        l.d(cVar, "");
        a aVar = new a();
        aVar.a("enter_from", cVar.w());
        aVar.a("enter_method", cVar.x());
        aVar.a("is_success", z ? 1 : 0);
        aVar.a("error_code", i2);
        r.a("email_code_verification_result", aVar.f62575a);
    }
}

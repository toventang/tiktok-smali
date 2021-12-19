package com.ss.android.ugc.aweme.account.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.c;
import com.ss.android.ugc.aweme.account.login.authorize.a.a;
import com.ss.android.ugc.aweme.account.login.i;
import com.ss.android.ugc.aweme.account.m.d;
import h.f.b.l;

public final class h implements e {
    static {
        Covode.recordClassIndex(38843);
    }

    @Override // com.ss.android.ugc.aweme.account.h.e
    public final void a(AuthResult authResult) {
        if (authResult != null) {
            int i2 = 0;
            String str = null;
            c cVar = authResult.f40149c;
            if (cVar != null) {
                l.b(cVar, "");
                i2 = cVar.getErrorCode();
                str = cVar.getMessage();
            }
            if (authResult.f40147a) {
                a.a(a.EnumC1407a.SUCCESS, "", "vk");
            } else if (authResult.f40148b) {
                d.a.a(2, "vk", i2, str);
                a.a(a.EnumC1407a.CANCEL, "", "vk");
            } else {
                d.a.a(1, "vk", i2, str);
                i.a("", str, "vk");
                a.a(a.EnumC1407a.FAILURE, "errorCode: ".concat(String.valueOf(i2)), "vk");
            }
        }
    }
}

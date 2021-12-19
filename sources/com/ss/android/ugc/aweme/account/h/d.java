package com.ss.android.ugc.aweme.account.h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.c;
import com.ss.android.ugc.aweme.account.login.authorize.a.a;
import com.ss.android.ugc.aweme.account.login.i;
import com.ss.android.ugc.aweme.account.m.d;
import h.f.b.l;

public final class d implements e {
    static {
        Covode.recordClassIndex(38837);
    }

    @Override // com.ss.android.ugc.aweme.account.h.e
    public final void a(AuthResult authResult) {
        String str;
        int i2;
        if (authResult != null) {
            if (!authResult.f40147a) {
                c cVar = authResult.f40149c;
                if (cVar != null) {
                    l.b(cVar, "");
                    i2 = cVar.getErrorCode();
                    str = cVar.getMessage();
                } else {
                    str = null;
                    i2 = 0;
                }
                if (authResult.f40148b) {
                    a.a(a.EnumC1407a.CANCEL, null, "line");
                    d.a.a(2, "line", i2, str);
                    return;
                }
                int i3 = authResult.f40156j.getInt("line_response_ordinal", 0);
                i.a(i3, str, "line");
                a.a(a.EnumC1407a.FAILURE, "Internal error {code = " + i3 + ", desc = " + str + '}', "line");
                d.a.a(1, "line", i3, str);
                i.a(i3, str, "line");
            } else if (!TextUtils.isEmpty(authResult.f40152f)) {
                a.a(a.EnumC1407a.SUCCESS, null, "line");
            } else {
                a.a(a.EnumC1407a.FAILURE, "token = null", "line");
            }
        }
    }
}

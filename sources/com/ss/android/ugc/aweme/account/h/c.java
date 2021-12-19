package com.ss.android.ugc.aweme.account.h;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.ss.android.ugc.aweme.account.login.authorize.a.a;
import com.ss.android.ugc.aweme.account.login.i;
import com.ss.android.ugc.aweme.account.m.d;
import h.f.b.l;

public final class c implements e {
    static {
        Covode.recordClassIndex(38836);
    }

    @Override // com.ss.android.ugc.aweme.account.h.e
    public final void a(AuthResult authResult) {
        String str;
        int i2;
        if (authResult != null) {
            com.bytedance.lobby.c cVar = authResult.f40149c;
            if (cVar != null) {
                l.b(cVar, "");
                i2 = cVar.getErrorCode();
                str = cVar.getMessage();
            } else {
                str = null;
                i2 = 0;
            }
            if (authResult.f40147a) {
                a.a(a.EnumC1407a.SUCCESS, null, "kakaotalk");
            } else if (authResult.f40148b) {
                String str2 = str + " | " + Log.getStackTraceString(authResult.f40149c);
                l.b(str2, "");
                a.a(a.EnumC1407a.CANCEL, str2, "kakaotalk");
                d.a.a(2, "kakaotalk", 0, "");
            } else {
                d.a.a(1, "kakaotalk", i2, str);
                i.a(i2, str, "kakaotalk");
                String str3 = "Error code = " + i2 + ", desc = " + str;
                l.b(str3, "");
                a.a(a.EnumC1407a.FAILURE, str3, "kakaotalk");
            }
        }
    }
}

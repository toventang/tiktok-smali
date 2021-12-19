package com.ss.android.ugc.aweme.account.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.c;
import com.ss.android.ugc.aweme.account.login.authorize.a.a;
import com.ss.android.ugc.aweme.account.login.i;
import com.ss.android.ugc.aweme.account.m.d;
import h.f.b.l;
import h.m.p;

public final class a implements e {
    static {
        Covode.recordClassIndex(38833);
    }

    @Override // com.ss.android.ugc.aweme.account.h.e
    public final void a(AuthResult authResult) {
        String str;
        int i2;
        int i3;
        if (authResult != null) {
            if (authResult.f40147a) {
                String str2 = authResult.f40152f;
                long j2 = authResult.f40154h;
                com.ss.android.ugc.trill.c.a.a.a("fb_access_token", str2);
                com.ss.android.ugc.trill.c.a.a.a().edit().putLong("fb_access_token_exp", j2).apply();
                com.ss.android.ugc.aweme.account.login.authorize.a.a.a(a.EnumC1407a.SUCCESS, null, "facebook");
                return;
            }
            c cVar = authResult.f40149c;
            if (cVar != null) {
                l.b(cVar, "");
                i2 = cVar.getErrorCode();
                str = cVar.getMessage();
            } else {
                str = "";
                i2 = 0;
            }
            if (authResult.f40148b) {
                com.ss.android.ugc.aweme.account.login.authorize.a.a.a(a.EnumC1407a.CANCEL, null, "facebook");
                d.a.a(2, "facebook", i2, str);
                return;
            }
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) authResult.f40149c);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" | ");
            c cVar2 = authResult.f40149c;
            if (!(cVar2 == null || cVar2.getStackTrace() == null)) {
                c cVar3 = authResult.f40149c;
                if (cVar3 == null) {
                    l.b();
                }
                l.b(cVar3, "");
                for (StackTraceElement stackTraceElement : cVar3.getStackTrace()) {
                    sb.append(stackTraceElement.toString());
                }
            }
            String sb2 = sb.toString();
            l.b(sb2, "");
            if (!(str == null || str.length() == 0)) {
                if (str == null) {
                    l.b();
                }
                if (p.a((CharSequence) str, (CharSequence) "connection", true)) {
                    i3 = -10002;
                    i.a("", sb2, "facebook");
                    d.a.a(1, "facebook", i3, sb2);
                    com.ss.android.ugc.aweme.account.login.authorize.a.a.a(a.EnumC1407a.FAILURE, sb2, "facebook");
                }
            }
            i3 = -10000;
            i.a("", sb2, "facebook");
            d.a.a(1, "facebook", i3, sb2);
            com.ss.android.ugc.aweme.account.login.authorize.a.a.a(a.EnumC1407a.FAILURE, sb2, "facebook");
        }
    }
}

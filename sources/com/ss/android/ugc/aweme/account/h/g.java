package com.ss.android.ugc.aweme.account.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.c;
import com.ss.android.ugc.aweme.account.login.authorize.a.a;
import com.ss.android.ugc.aweme.account.m.d;
import h.a.i;
import h.f.b.l;

public final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f63056a = {"Authorize failed.", "Authorization failed, request was canceled.", "Failed to get authorization, bundle incomplete"};

    /* renamed from: c  reason: collision with root package name */
    private static final a f63057c = new a((byte) 0);

    static final class a {
        static {
            Covode.recordClassIndex(38842);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(38841);
    }

    @Override // com.ss.android.ugc.aweme.account.h.e
    public final void a(AuthResult authResult) {
        String str;
        int i2;
        if (authResult != null) {
            if (authResult.f40147a) {
                com.ss.android.ugc.aweme.account.login.authorize.a.a.a(a.EnumC1407a.SUCCESS, null, "twitter");
                return;
            }
            c cVar = authResult.f40149c;
            if (cVar != null) {
                l.b(cVar, "");
                i2 = cVar.getErrorCode();
                str = cVar.getMessage();
            } else {
                str = null;
                i2 = 0;
            }
            if (i.a(f63056a, str)) {
                com.ss.android.ugc.aweme.account.login.authorize.a.a.a(a.EnumC1407a.CANCEL, null, "twitter");
                d.a.a(2, "twitter", i2, str);
                return;
            }
            StringBuilder append = new StringBuilder().append(str).append(" | ");
            c cVar2 = authResult.f40149c;
            if (!(cVar2 == null || cVar2.getStackTrace() == null)) {
                c cVar3 = authResult.f40149c;
                if (cVar3 == null) {
                    l.b();
                }
                l.b(cVar3, "");
                for (StackTraceElement stackTraceElement : cVar3.getStackTrace()) {
                    append.append(stackTraceElement.toString());
                }
            }
            String sb = append.toString();
            l.b(sb, "");
            com.ss.android.ugc.aweme.account.login.i.a("", sb, "twitter");
            d.a.a(1, "twitter", -10000, sb);
            com.ss.android.ugc.aweme.account.login.authorize.a.a.a(a.EnumC1407a.FAILURE, sb, "twitter");
        }
    }
}

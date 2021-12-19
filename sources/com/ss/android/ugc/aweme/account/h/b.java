package com.ss.android.ugc.aweme.account.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.c;
import com.ss.android.ugc.aweme.account.login.authorize.a.a;
import com.ss.android.ugc.aweme.account.login.i;
import com.ss.android.ugc.aweme.account.m.d;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final List<Integer> f63051a = n.b(7, 8, 16, 12501, 12502);

    /* renamed from: c  reason: collision with root package name */
    private static final a f63052c = new a((byte) 0);

    static final class a {
        static {
            Covode.recordClassIndex(38835);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(38834);
    }

    @Override // com.ss.android.ugc.aweme.account.h.e
    public final void a(AuthResult authResult) {
        if (authResult != null) {
            String str = null;
            if (authResult.f40147a) {
                com.ss.android.ugc.aweme.account.login.authorize.a.a.a(a.EnumC1407a.SUCCESS, null, "google");
                return;
            }
            int i2 = 0;
            c cVar = authResult.f40149c;
            if (cVar != null) {
                l.b(cVar, "");
                i2 = cVar.getProviderErrorCode();
                cVar.getErrorCode();
                str = cVar.getMessage();
            }
            if (authResult.f40148b || f63051a.contains(Integer.valueOf(i2))) {
                d.a.a(2, "google", i2, str);
                return;
            }
            i.a(i2, str, "google");
            d.a.a(1, "google", i2, str);
            com.ss.android.ugc.aweme.account.login.authorize.a.a.a(a.EnumC1407a.FAILURE, "googleErrorCode: " + i2 + ", errorDesc: " + str, "google");
        }
    }
}

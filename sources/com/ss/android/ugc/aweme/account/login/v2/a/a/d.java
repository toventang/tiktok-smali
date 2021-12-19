package com.ss.android.ugc.aweme.account.login.v2.a.a;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.v2.base.c;
import com.ss.android.ugc.aweme.account.login.v2.base.e;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import f.a.d.f;
import h.f.b.l;

public final class d extends com.ss.android.ugc.aweme.account.login.v2.base.d {
    static {
        Covode.recordClassIndex(39531);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.d
    public final boolean a() {
        com.ss.android.ugc.aweme.account.o.a.f65209a.invoke(this.f64729a, e.a(this.f64729a), "user_click").d(new a(this)).c();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(c cVar) {
        super(cVar);
        l.d(cVar, "");
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f64154a;

        static {
            Covode.recordClassIndex(39532);
        }

        a(d dVar) {
            this.f64154a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            e.a((Fragment) this.f64154a.f64729a, true);
            c cVar = this.f64154a.f64729a;
            Bundle arguments = this.f64154a.f64729a.getArguments();
            if (arguments == null) {
                l.b();
            }
            arguments.putInt("next_page", k.EMAIL_SMS_VERIFY.getValue());
            l.b(arguments, "");
            cVar.a(arguments);
        }
    }
}

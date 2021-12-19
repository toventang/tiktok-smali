package com.ss.android.ugc.aweme.account.login.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.ss.android.ugc.aweme.account.login.g.a;
import h.f.b.l;

public final class b implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final AuthResult f63456a;

    /* renamed from: b  reason: collision with root package name */
    public final a f63457b;

    public interface a {
        static {
            Covode.recordClassIndex(39105);
        }

        void b(int i2, AuthResult authResult);
    }

    static {
        Covode.recordClassIndex(39104);
    }

    @Override // com.ss.android.ugc.aweme.account.login.g.a.b
    public final void b() {
        a(0);
    }

    @Override // com.ss.android.ugc.aweme.account.login.g.a.b
    public final void a() {
        a(-1);
    }

    private void a(int i2) {
        this.f63457b.b(i2, this.f63456a);
    }

    public b(AuthResult authResult, a aVar) {
        l.d(authResult, "");
        l.d(aVar, "");
        this.f63456a = authResult;
        this.f63457b = aVar;
    }
}

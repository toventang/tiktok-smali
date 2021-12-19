package com.ss.android.ugc.aweme.account.agegate;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.ss.android.ugc.aweme.account.agegate.b;

public final class a implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private AuthResult f62578a;

    /* renamed from: b  reason: collision with root package name */
    private AbstractC1371a f62579b;

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.a$a  reason: collision with other inner class name */
    public interface AbstractC1371a {
        static {
            Covode.recordClassIndex(38514);
        }

        void a(int i2, AuthResult authResult);
    }

    static {
        Covode.recordClassIndex(38513);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.b.a
    public final void a() {
        a(1);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.b.a
    public final void b() {
        a(-1);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.b.a
    public final void c() {
        a(0);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.b.a
    public final void d() {
        a(1);
    }

    private void a(int i2) {
        AbstractC1371a aVar = this.f62579b;
        if (aVar != null) {
            aVar.a(i2, this.f62578a);
        }
    }

    public a(AuthResult authResult, AbstractC1371a aVar) {
        this.f62578a = authResult;
        this.f62579b = aVar;
    }
}

package com.ss.android.ugc.aweme.account.login.authorize.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.e;
import com.ss.android.account.g;
import java.lang.ref.WeakReference;

public final class b extends g {

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<a> f63350c;

    static {
        Covode.recordClassIndex(39043);
    }

    public b(a aVar) {
        this.f63350c = new WeakReference<>(aVar);
    }

    @Override // com.ss.android.account.g
    public final void a(e eVar) {
        if (this.f63350c.get() != null) {
            this.f63350c.get().a(eVar.f43073d, eVar.f43075f, eVar.u, eVar);
        }
    }

    @Override // com.ss.android.account.g
    public final void b(e eVar) {
        if (this.f63350c.get() != null) {
            this.f63350c.get().a(eVar.f43082j);
        }
    }

    @Override // com.ss.android.account.g
    public final void a(e eVar, String str) {
        if (this.f63350c.get() != null) {
            this.f63350c.get().a(eVar.f43073d, eVar.f43075f, eVar.u, eVar);
        }
    }
}

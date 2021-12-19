package com.ss.android.ugc.aweme.cs;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cs.h.a;
import com.ss.android.ugc.aweme.cs.h.c;
import com.ss.android.ugc.aweme.cs.h.d;
import com.ss.android.ugc.aweme.cs.h.e;
import com.ss.android.ugc.aweme.cs.h.f;
import com.ss.android.ugc.aweme.port.in.g;
import h.f.b.l;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private a f78995a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f78996b = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(49028);
    }

    private final void f() {
        g.a().c().a(b());
    }

    @Override // com.ss.android.ugc.aweme.cs.h.f
    public final com.ss.android.ugc.aweme.cs.h.b a() {
        a aVar = this.f78995a;
        if (aVar == null) {
            l.a("mProxy");
        }
        return aVar.getMonitor();
    }

    @Override // com.ss.android.ugc.aweme.cs.h.f
    public final e b() {
        a aVar = this.f78995a;
        if (aVar == null) {
            l.a("mProxy");
        }
        return aVar.getAllowListService();
    }

    @Override // com.ss.android.ugc.aweme.cs.h.f
    public final c c() {
        a aVar = this.f78995a;
        if (aVar == null) {
            l.a("mProxy");
        }
        return aVar.getFileProvider();
    }

    @Override // com.ss.android.ugc.aweme.cs.h.f
    public final d d() {
        a aVar = this.f78995a;
        if (aVar == null) {
            l.a("mProxy");
        }
        return aVar.getPersistedAllowListManager();
    }

    private final void e() {
        a aVar = this.f78995a;
        if (aVar == null) {
            l.a("mProxy");
        }
        aVar.getPersistedAllowListManager().a(new com.ss.android.ugc.aweme.cs.a.b.a.a());
    }

    @Override // com.ss.android.ugc.aweme.cs.h.f
    public final void a(a aVar) {
        l.d(aVar, "");
        if (!this.f78996b.get()) {
            this.f78996b.set(true);
            this.f78995a = aVar;
            e();
            f();
        }
    }
}

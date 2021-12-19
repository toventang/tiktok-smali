package com.ss.android.ugc.aweme.feed.q;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.al;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import f.a.b.a;
import f.a.t;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

public final class as implements al, an {

    /* renamed from: a  reason: collision with root package name */
    final WeakReference<al> f93769a;

    /* renamed from: b  reason: collision with root package name */
    private final int f93770b;

    /* renamed from: c  reason: collision with root package name */
    private final a f93771c = new a();

    static {
        Covode.recordClassIndex(59660);
    }

    @Override // com.ss.android.ugc.aweme.al
    public final void a() {
        this.f93771c.dispose();
    }

    @Override // com.ss.android.ugc.aweme.feed.q.an
    public final void c() {
        BusinessComponentServiceUtils.getAppStateReporter().b(this);
        this.f93771c.dispose();
    }

    @Override // com.ss.android.ugc.aweme.al
    public final void b() {
        this.f93771c.dispose();
        this.f93771c.a(t.b("").e((long) this.f93770b, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new at(this), au.f93773a));
    }

    public as(al alVar, int i2) {
        this.f93769a = new WeakReference<>(alVar);
        this.f93770b = i2;
        BusinessComponentServiceUtils.getAppStateReporter().a(this);
    }
}

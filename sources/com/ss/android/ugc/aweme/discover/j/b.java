package com.ss.android.ugc.aweme.discover.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.l.a.a;
import com.ss.android.ugc.aweme.search.l.a.g;
import com.ss.android.ugc.aweme.search.l.a.h;
import com.ss.android.ugc.aweme.search.model.d;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

public abstract class b implements a, Callable {

    /* renamed from: a  reason: collision with root package name */
    public d f81229a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f81230b;

    static {
        Covode.recordClassIndex(50481);
    }

    /* access modifiers changed from: protected */
    public abstract Object a();

    private void b() {
        if (this.f81230b) {
            throw new CancellationException();
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        b();
        Object a2 = a();
        b();
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.discover.j.a
    public final void a(int i2, String str) {
        this.f81230b = true;
        d dVar = this.f81229a;
        if (dVar != null) {
            g.a(dVar).d().b(2).g();
            h.a(this.f81229a).b().c(2).d(i2).f();
            a.f121303d.b();
            a.f121302c.a(2, str);
        }
    }
}

package com.ss.android.ugc.aweme.awemeservice.a;

import android.os.Looper;
import b.i;
import com.bytedance.covode.number.Covode;
import com.google.c.b.m;
import com.google.c.b.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements m {

    /* renamed from: a  reason: collision with root package name */
    private final d f67633a;

    static {
        Covode.recordClassIndex(41642);
    }

    e(d dVar) {
        this.f67633a = dVar;
    }

    @Override // com.google.c.b.m
    public final void a(n nVar) {
        d dVar = this.f67633a;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            i.b(new Callable<Object>(nVar) {
                /* class com.ss.android.ugc.aweme.awemeservice.a.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ n f67631a;

                static {
                    Covode.recordClassIndex(41641);
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    d.this.a((String) this.f67631a.getKey(), (Aweme) this.f67631a.getValue());
                    return null;
                }

                {
                    this.f67631a = r2;
                }
            }, i.f4824a);
        } else {
            dVar.a((String) nVar.getKey(), (Aweme) nVar.getValue());
        }
    }
}

package com.bytedance.geckox.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.policy.d.c;
import com.bytedance.geckox.utils.o;
import com.bytedance.q.b;
import java.util.concurrent.Executor;

public final class a implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public b f29808a;

    /* renamed from: b  reason: collision with root package name */
    private Executor f29809b;

    static {
        Covode.recordClassIndex(17291);
    }

    @Override // com.bytedance.geckox.policy.d.c.a
    public final void a() {
        if (this.f29808a != null) {
            if (this.f29809b == null) {
                this.f29809b = o.a().b();
            }
            this.f29809b.execute(new Runnable() {
                /* class com.bytedance.geckox.e.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(17292);
                }

                public final void run() {
                    try {
                        com.bytedance.geckox.i.a.a("check request retry start");
                        a.this.f29808a.a("req_type", 2);
                        a.this.f29808a.a();
                    } catch (Exception unused) {
                        com.bytedance.geckox.i.a.a("check request retry failed");
                    }
                }
            });
        }
    }

    public a(Executor executor, b bVar) {
        this.f29809b = executor;
        this.f29808a = bVar;
    }
}

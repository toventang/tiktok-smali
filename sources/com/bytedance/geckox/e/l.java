package com.bytedance.geckox.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.policy.c.c;
import com.bytedance.q.b;
import com.bytedance.q.d;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class l extends d<List<UpdatePackage>, UpdatePackage> {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicInteger f29830a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    public static AtomicInteger f29831b = new AtomicInteger(0);

    /* renamed from: j  reason: collision with root package name */
    private Executor f29832j;

    /* renamed from: k  reason: collision with root package name */
    private OptionCheckUpdateParams f29833k;

    static {
        Covode.recordClassIndex(17307);
    }

    @Override // com.bytedance.q.d
    public final void a(Object... objArr) {
        super.a(objArr);
        if (objArr == null) {
            l.a a2 = com.ss.android.ugc.aweme.cw.l.a(o.FIXED);
            a2.f79174c = 2;
            this.f29832j = g.a(a2.a());
        } else if (objArr[0] instanceof Executor) {
            this.f29832j = (Executor) objArr[0];
            if (objArr[1] == null) {
                this.f29833k = null;
            } else {
                this.f29833k = (OptionCheckUpdateParams) objArr[1];
            }
        } else {
            throw new IllegalArgumentException("ParallelInterceptor args must be instance of Executor");
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.q.b, java.lang.Object] */
    @Override // com.bytedance.q.d
    public final /* synthetic */ Object a(final b<UpdatePackage> bVar, List<UpdatePackage> list) {
        final int i2;
        List<UpdatePackage> list2 = list;
        OptionCheckUpdateParams optionCheckUpdateParams = this.f29833k;
        if (optionCheckUpdateParams != null) {
            i2 = optionCheckUpdateParams.getChannelUpdatePriority();
        } else {
            i2 = 1;
        }
        f29831b.addAndGet(list2.size());
        for (final UpdatePackage updatePackage : list2) {
            this.f29832j.execute(new c(((3 - i2) * 100000) + f29830a.getAndIncrement(), updatePackage.getAccessKey() + "-" + updatePackage.getChannel()) {
                /* class com.bytedance.geckox.e.l.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(17308);
                }

                public final void run() {
                    try {
                        bVar.a("update_priority", Integer.valueOf(i2));
                        bVar.a(updatePackage);
                        if (l.f29831b.decrementAndGet() == 0) {
                            l.f29830a.set(0);
                        }
                    } catch (Throwable th) {
                        l lVar = l.this;
                        if (lVar.f42373g != null) {
                            lVar.f42373g.c(lVar.f42374h, lVar, th);
                        }
                    }
                }
            });
        }
        return null;
    }
}

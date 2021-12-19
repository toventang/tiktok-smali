package com.ss.android.ugc.aweme.influencer.ecommercelive.framework.b.b;

import com.bytedance.covode.number.Covode;
import h.c.f;
import h.f.b.l;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.ah;

public final class a extends ah {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f104573a;

    static {
        Covode.recordClassIndex(66995);
    }

    public a(ExecutorService executorService) {
        l.d(executorService, "");
        this.f104573a = executorService;
    }

    @Override // h.c.f, h.c.a
    public final f plus(f fVar) {
        l.d(fVar, "");
        return super.plus(fVar);
    }

    @Override // kotlinx.coroutines.ah
    public final void dispatch(f fVar, Runnable runnable) {
        l.d(fVar, "");
        l.d(runnable, "");
        try {
            this.f104573a.execute(runnable);
        } catch (RejectedExecutionException unused) {
        }
    }
}

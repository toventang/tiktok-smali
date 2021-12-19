package com.bytedance.globalpayment.payment.common.lib.h.a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.Executor;

public final class c implements com.bytedance.globalpayment.payment.common.lib.h.b.c {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f30579a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f30580b = new a((byte) 0);

    static {
        Covode.recordClassIndex(17727);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.c
    public final Executor a() {
        return this.f30580b;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.c
    public final Executor b() {
        return this.f30579a;
    }

    static class a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private Handler f30581a;

        static {
            Covode.recordClassIndex(17728);
        }

        private a() {
            this.f30581a = new Handler(Looper.getMainLooper());
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final void execute(Runnable runnable) {
            this.f30581a.post(runnable);
        }
    }

    public c() {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 3;
        this.f30579a = g.a(a2.a());
    }
}

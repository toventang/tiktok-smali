package com.google.android.gms.c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CancellationException;

final class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ h f49939a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ x f49940b;

    static {
        Covode.recordClassIndex(31174);
    }

    y(x xVar, h hVar) {
        this.f49940b = xVar;
        this.f49939a = hVar;
    }

    public final void run() {
        try {
            h<TContinuationResult> a2 = this.f49940b.f49936a.a((TResult) this.f49939a.d());
            if (a2 == null) {
                this.f49940b.a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            a2.a(j.f49904b, (e<? super TContinuationResult>) this.f49940b);
            a2.a(j.f49904b, (d) this.f49940b);
            a2.a(j.f49904b, (b) this.f49940b);
        } catch (f e2) {
            if (e2.getCause() instanceof Exception) {
                this.f49940b.a((Exception) e2.getCause());
            } else {
                this.f49940b.a((Exception) e2);
            }
        } catch (CancellationException unused) {
            this.f49940b.a();
        } catch (Exception e3) {
            this.f49940b.a(e3);
        }
    }
}

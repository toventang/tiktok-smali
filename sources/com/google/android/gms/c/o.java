package com.google.android.gms.c;

import com.bytedance.covode.number.Covode;

final class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ h f49915a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ n f49916b;

    static {
        Covode.recordClassIndex(31164);
    }

    o(n nVar, h hVar) {
        this.f49916b = nVar;
        this.f49915a = hVar;
    }

    public final void run() {
        try {
            h<TContinuationResult> a2 = this.f49916b.f49912a.a(this.f49915a);
            if (a2 == null) {
                this.f49916b.a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            a2.a(j.f49904b, (e<? super TContinuationResult>) this.f49916b);
            a2.a(j.f49904b, (d) this.f49916b);
            a2.a(j.f49904b, (b) this.f49916b);
        } catch (f e2) {
            if (e2.getCause() instanceof Exception) {
                this.f49916b.f49913b.a((Exception) e2.getCause());
            } else {
                this.f49916b.f49913b.a(e2);
            }
        } catch (Exception e3) {
            this.f49916b.f49913b.a(e3);
        }
    }
}

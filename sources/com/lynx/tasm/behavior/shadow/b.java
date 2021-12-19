package com.lynx.tasm.behavior.shadow;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.b.c;

public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    Runnable f55965a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f55966b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f55967c;

    /* renamed from: d  reason: collision with root package name */
    private c f55968d;

    static {
        Covode.recordClassIndex(34963);
    }

    @Override // com.lynx.tasm.behavior.shadow.c
    public final void a(Runnable runnable) {
        boolean z;
        if (this.f55967c == null) {
            this.f55967c = new Handler();
            this.f55968d = new c();
        }
        c cVar = this.f55968d;
        Thread currentThread = Thread.currentThread();
        if (cVar.f55751a == null) {
            cVar.f55751a = currentThread;
        }
        if (cVar.f55751a == currentThread) {
            z = true;
        } else {
            z = false;
        }
        com.lynx.tasm.base.c.a(z);
        if (!this.f55966b) {
            this.f55965a = runnable;
            this.f55967c.postDelayed(new Runnable() {
                /* class com.lynx.tasm.behavior.shadow.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(34964);
                }

                public final void run() {
                    b bVar = b.this;
                    if (bVar.f55965a != null) {
                        bVar.f55965a.run();
                    }
                    b.this.f55966b = false;
                }
            }, 16);
            this.f55966b = true;
        }
    }
}

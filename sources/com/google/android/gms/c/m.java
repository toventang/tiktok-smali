package com.google.android.gms.c;

import com.bytedance.covode.number.Covode;

final class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ h f49910a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ l f49911b;

    static {
        Covode.recordClassIndex(31162);
    }

    m(l lVar, h hVar) {
        this.f49911b = lVar;
        this.f49910a = hVar;
    }

    public final void run() {
        if (this.f49910a.c()) {
            this.f49911b.f49908b.f();
            return;
        }
        try {
            this.f49911b.f49908b.a(this.f49911b.f49907a.a(this.f49910a));
        } catch (f e2) {
            if (e2.getCause() instanceof Exception) {
                this.f49911b.f49908b.a((Exception) e2.getCause());
            } else {
                this.f49911b.f49908b.a(e2);
            }
        } catch (Exception e3) {
            this.f49911b.f49908b.a(e3);
        }
    }
}

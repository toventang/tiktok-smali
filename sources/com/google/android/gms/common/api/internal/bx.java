package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.p;

final class bx implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ p f50128a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ bv f50129b;

    static {
        Covode.recordClassIndex(31267);
    }

    public final void run() {
        try {
            BasePendingResult.f50004c.set(true);
            this.f50129b.f50125h.sendMessage(this.f50129b.f50125h.obtainMessage(0, this.f50129b.f50118a.a()));
            BasePendingResult.f50004c.set(false);
            i iVar = this.f50129b.f50124g.get();
            if (iVar != null) {
                iVar.b(this.f50129b);
            }
        } catch (RuntimeException e2) {
            this.f50129b.f50125h.sendMessage(this.f50129b.f50125h.obtainMessage(1, e2));
            BasePendingResult.f50004c.set(false);
            i iVar2 = this.f50129b.f50124g.get();
            if (iVar2 != null) {
                iVar2.b(this.f50129b);
            }
        } catch (Throwable th) {
            BasePendingResult.f50004c.set(false);
            i iVar3 = this.f50129b.f50124g.get();
            if (iVar3 != null) {
                iVar3.b(this.f50129b);
            }
            throw th;
        }
    }

    bx(bv bvVar, p pVar) {
        this.f50129b = bvVar;
        this.f50128a = pVar;
    }
}

package com.ss.ugc.live.a.a;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;

final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f f154057a;

    /* renamed from: b  reason: collision with root package name */
    private final c f154058b;

    /* renamed from: c  reason: collision with root package name */
    private final int f154059c;

    static {
        Covode.recordClassIndex(102727);
    }

    j(f fVar, c cVar, int i2) {
        this.f154057a = fVar;
        this.f154058b = cVar;
        this.f154059c = i2;
    }

    public final void run() {
        k kVar = this.f154057a.f154042b.get(this.f154058b.f154004a);
        if (kVar != null) {
            Iterator<d> it = kVar.f154061b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}

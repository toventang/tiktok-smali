package com.bytedance.android.live.publicscreen.impl.model.chat.badge;

import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public a f12438a;

    /* renamed from: b  reason: collision with root package name */
    public final g f12439b;

    static {
        Covode.recordClassIndex(6830);
    }

    public abstract int a();

    public abstract a c();

    public final a b() {
        if (this.f12438a == null) {
            this.f12438a = c();
        }
        a aVar = this.f12438a;
        if (aVar == null) {
            l.a("badge");
        }
        return aVar;
    }

    public b(g gVar) {
        l.d(gVar, "");
        this.f12439b = gVar;
    }
}

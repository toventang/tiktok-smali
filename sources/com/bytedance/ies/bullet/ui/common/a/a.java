package com.bytedance.ies.bullet.ui.common.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.e;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.ui.common.g;
import h.f.b.l;

public abstract class a extends e {
    static {
        Covode.recordClassIndex(19741);
    }

    public final Context e() {
        return (Context) this.f32005a.c(Context.class);
    }

    /* access modifiers changed from: protected */
    public final g f() {
        return (g) this.f32005a.c(g.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(bVar);
        l.c(bVar, "");
    }
}

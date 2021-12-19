package com.bytedance.ies.bullet.kit.lynx;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.o;
import com.bytedance.ies.bullet.kit.lynx.b;
import com.bytedance.ies.bullet.service.base.a.j;

public abstract class ILynxKitApi<U extends b> extends o<e, c, U, d> implements j {
    static {
        Covode.recordClassIndex(18930);
    }

    public abstract boolean h();

    public abstract Throwable i();

    @Override // com.bytedance.ies.bullet.c.c.d
    public final com.bytedance.ies.bullet.service.f.a.b.b a() {
        return com.bytedance.ies.bullet.service.f.a.b.b.LYNX;
    }
}

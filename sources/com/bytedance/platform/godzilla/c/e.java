package com.bytedance.platform.godzilla.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.a.g;
import com.bytedance.platform.godzilla.a.h;
import com.bytedance.platform.godzilla.b;

public abstract class e extends a implements h {
    static {
        Covode.recordClassIndex(25655);
    }

    public abstract boolean c();

    @Override // com.bytedance.platform.godzilla.c.a
    public final d d() {
        return d.REGISTER_EXCEPTION;
    }

    @Override // com.bytedance.platform.godzilla.c.a
    public void a() {
        super.a();
        if (c()) {
            b.INSTANCE.addUncaughtExceptionConsumer(this);
            b();
            g.a(g.a.ERROR);
        }
    }
}

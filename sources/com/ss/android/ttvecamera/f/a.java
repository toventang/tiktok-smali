package com.ss.android.ttvecamera.f;

import android.content.Context;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.e;
import com.ss.android.ttvecamera.g;
import com.ss.android.ttvecamera.o;

public final class a extends e {
    static {
        Covode.recordClassIndex(37872);
    }

    @Override // com.ss.android.ttvecamera.e
    public final void x() {
        o.b("GNOBMediaCamera", "create GNOBMediaVideo2Mode");
        this.f61517i = new b(this, this.s, this.f61513e, this.r);
    }

    public a(int i2, Context context, g.a aVar, Handler handler, g.c cVar) {
        super(i2, context, aVar, handler, cVar);
        o.b("GNOBMediaCamera", "create GNOBMediaCamera");
    }
}

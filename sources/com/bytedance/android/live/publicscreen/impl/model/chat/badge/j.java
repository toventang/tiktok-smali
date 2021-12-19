package com.bytedance.android.live.publicscreen.impl.model.chat.badge;

import android.os.Handler;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class j extends h {

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f12452h;

    static {
        Covode.recordClassIndex(6840);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.b, com.bytedance.android.live.publicscreen.impl.model.chat.badge.h
    public final a c() {
        c cVar = new c(this.f12439b.f12200d, d());
        cVar.f12436c = this.f12452h;
        return cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(int i2, g gVar, Handler handler, ImageModel imageModel, b<? super i, z> bVar, Runnable runnable) {
        super(i2, gVar, handler, imageModel, bVar);
        l.d(gVar, "");
        l.d(handler, "");
        l.d(imageModel, "");
        l.d(bVar, "");
        l.d(runnable, "");
        this.f12452h = runnable;
    }
}

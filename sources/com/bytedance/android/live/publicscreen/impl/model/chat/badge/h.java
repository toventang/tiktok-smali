package com.bytedance.android.live.publicscreen.impl.model.chat.badge;

import android.os.Handler;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public class h extends f {

    /* renamed from: h  reason: collision with root package name */
    private final int f12449h;

    static {
        Covode.recordClassIndex(6838);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.b
    public final int a() {
        return this.f12449h;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.b
    public a c() {
        return new c(this.f12439b.f12200d, d());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(int i2, g gVar, Handler handler, ImageModel imageModel, b<? super i, z> bVar) {
        super(gVar, handler, imageModel, bVar);
        l.d(gVar, "");
        l.d(handler, "");
        l.d(imageModel, "");
        l.d(bVar, "");
        this.f12449h = i2;
    }
}

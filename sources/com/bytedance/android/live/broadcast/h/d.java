package com.bytedance.android.live.broadcast.h;

import com.bytedance.android.live.a.a.b.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f7881a;

    static {
        Covode.recordClassIndex(3903);
    }

    d(b bVar) {
        this.f7881a = bVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        b bVar = this.f7881a;
        Throwable th = (Throwable) obj;
        if (th instanceof a) {
            bVar.f7877a.a(((com.bytedance.android.live.a.a.a) th).getErrorCode());
        }
        bVar.f7877a.a(0);
    }
}

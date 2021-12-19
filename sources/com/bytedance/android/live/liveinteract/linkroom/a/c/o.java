package com.bytedance.android.live.liveinteract.linkroom.a.c;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.b.g;
import com.bytedance.android.live.liveinteract.linkroom.a.c.b;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class o implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f10522a;

    static {
        Covode.recordClassIndex(5605);
    }

    o(b bVar) {
        this.f10522a = bVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        b bVar = this.f10522a;
        g gVar = (g) obj;
        if (bVar.y != null && TextUtils.equals(gVar.f9984a, g.f9979b) && bVar.f10499d) {
            ((b.a) bVar.y).h();
        }
    }
}

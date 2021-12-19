package com.bytedance.android.live.broadcast.c.a;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.gift.model.b;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class j implements f {

    /* renamed from: a  reason: collision with root package name */
    private final g f7814a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7815b;

    static {
        Covode.recordClassIndex(3862);
    }

    j(g gVar, String str) {
        this.f7814a = gVar;
        this.f7815b = str;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        g gVar = this.f7814a;
        String str = this.f7815b;
        d dVar = (d) obj;
        if (gVar.f7803b) {
            if (((b) dVar.data).f17865a) {
                str = null;
            }
            gVar.a(str);
        }
    }
}

package com.bytedance.android.live.broadcast.c.a;

import com.bytedance.android.live.e;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.model.message.ax;
import com.bytedance.android.livesdk.model.message.cg;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import f.a.v;
import f.a.w;

final /* synthetic */ class l implements w {

    /* renamed from: a  reason: collision with root package name */
    private final y f7817a;

    static {
        Covode.recordClassIndex(3864);
    }

    l(y yVar) {
        this.f7817a = yVar;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        u uVar;
        y yVar = this.f7817a;
        cg cgVar = null;
        if (!(yVar == null || yVar.getMessageId() == 0 || yVar.f19705g == null || (uVar = yVar.t) == null)) {
            String assetsPath = ((IGiftService) a.a(IGiftService.class)).getAssetsPath("effects", uVar.n);
            if (!m.a(assetsPath)) {
                cgVar = new cg();
                if (uVar.f19765h <= 0) {
                    uVar.f19765h = 3000;
                }
                cgVar.o = (long) uVar.f19765h;
                cgVar.p = true;
                cgVar.q = (ax) e.a.f9628b.a(uVar.o, ax.class);
                cgVar.f19673a = yVar.getMessageId();
                cgVar.f19682j = uVar.f19761d;
                cgVar.f19674b = uVar.n;
                cgVar.f19675c = uVar.f19763f;
                cgVar.f19676d = assetsPath;
                cgVar.f19677e = yVar.r;
                cgVar.f19678f = yVar.f19706h;
                cgVar.f19679g = yVar.f19705g;
                cgVar.f19680h = uVar.f19760c;
            }
        }
        vVar.a(cgVar);
        vVar.a();
    }
}

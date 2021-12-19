package com.bytedance.android.livesdk.qa;

import com.bytedance.android.live.publicscreen.a.e.a;
import com.bytedance.android.live.publicscreen.a.e.b;
import com.bytedance.android.live.publicscreen.a.e.c;
import com.bytedance.android.live.publicscreen.a.e.d;
import com.bytedance.android.live.publicscreen.a.e.e;
import com.bytedance.android.livesdk.model.message.bl;
import com.bytedance.android.livesdk.model.message.bo;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class h implements e {
    static {
        Covode.recordClassIndex(12087);
    }

    @Override // com.bytedance.android.live.publicscreen.a.e.e
    public final void a(a aVar) {
        l.d(aVar, "");
        aVar.a(bl.class, new ak());
    }

    @Override // com.bytedance.android.live.publicscreen.a.e.e
    public final void a(b bVar) {
        l.d(bVar, "");
        bVar.a(com.bytedance.android.livesdk.model.message.a.a.QUESTION.getIntType());
        bVar.a(com.bytedance.android.livesdk.model.message.a.a.QUESTION_SWITCH_MESSAGE.getIntType());
    }

    @Override // com.bytedance.android.live.publicscreen.a.e.e
    public final void a(c cVar) {
        l.d(cVar, "");
        cVar.a(bl.class, new aj());
        cVar.a(bo.class, new ap());
    }

    @Override // com.bytedance.android.live.publicscreen.a.e.e
    public final void a(d dVar) {
        l.d(dVar, "");
        dVar.a(al.class, new ar());
    }
}

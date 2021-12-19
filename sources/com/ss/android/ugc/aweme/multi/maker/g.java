package com.ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.multi.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Map;

public final class g extends o {
    static {
        Covode.recordClassIndex(71190);
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final String l() {
        return "app_page";
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final boolean m() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final c i() {
        return new g();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final int k() {
        return ab.NEWS.getTYPE();
    }

    private static boolean n() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final void d(d dVar) {
        String schema;
        l.d(dVar, "");
        r();
        if (!j.f107226e || !j.b() || j.c()) {
            j.f107226e = n();
        }
        if (!j.f107226e) {
            new b(r()).e(R.string.de2).b();
            return;
        }
        Activity e2 = a().e();
        o.a(this, dVar, false, false, 6);
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        if (!(anchorCommonStruct == null || (schema = anchorCommonStruct.getSchema()) == null)) {
            SmartRoute withParam = SmartRouter.buildRoute(e2, schema).withParam("EVENT_NAME_WHEN_REQUEST", "request_anchor_detail").withParam("EVENT_NAME_FOR_STAY", "multi_anchor_stay_time");
            for (Map.Entry<String, String> entry : dVar.f66730a.entrySet()) {
                withParam = withParam.withParam(entry.getKey(), entry.getValue());
            }
            withParam.open();
        }
    }
}

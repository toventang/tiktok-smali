package com.ss.android.ugc.aweme.ml.infra.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.l;
import com.ss.android.ml.m;
import com.ss.android.ml.process.bl.AfOPModel;
import com.ss.android.ml.process.c;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.android.ugc.aweme.ml.infra.k;
import java.util.List;
import java.util.Map;

public final class d extends e {
    static {
        Covode.recordClassIndex(71011);
    }

    public d(SmartSceneConfig smartSceneConfig) {
        super(smartSceneConfig);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.a.f
    public final void a(g gVar, a aVar) {
        l lVar;
        try {
            Map<String, Object> map = gVar.f110620a;
            m mVar = this.f110613a;
            if (mVar != null) {
                lVar = mVar.f59875b;
            } else {
                lVar = null;
            }
            if (a(mVar, gVar, aVar) && mVar != null && map != null && lVar != null) {
                List<? extends c> a2 = mVar.a();
                AfOPModel afOPModel = mVar.f59877d.output;
                List<String> list = mVar.f59877d.feature_list;
                long currentTimeMillis = System.currentTimeMillis();
                float a3 = lVar.a(map, a2, afOPModel, list);
                this.f110614b = System.currentTimeMillis() - currentTimeMillis;
                k kVar = new k();
                kVar.f110663c = Float.valueOf(a3);
                this.f110618f = kVar;
                this.f110615c = 0;
                aVar.a(true, 0, kVar);
            }
        } catch (Exception unused) {
            this.f110615c = -6;
            aVar.a(false, -6, null);
        }
    }
}

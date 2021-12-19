package com.ss.android.ugc.aweme.ml.infra.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.l;
import com.ss.android.ml.m;
import com.ss.android.ml.process.bl.AfOPModel;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.android.ugc.aweme.ml.infra.k;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class c extends e {
    static {
        Covode.recordClassIndex(71010);
    }

    public c(SmartSceneConfig smartSceneConfig) {
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
                List<? extends com.ss.android.ml.process.c> a2 = mVar.a();
                AfOPModel afOPModel = mVar.f59877d.output;
                List<String> list = mVar.f59877d.feature_list;
                HashMap hashMap = new HashMap();
                long currentTimeMillis = System.currentTimeMillis();
                List<String> a3 = lVar.a(map, a2, afOPModel, list, hashMap);
                this.f110614b = System.currentTimeMillis() - currentTimeMillis;
                if (!a3.isEmpty()) {
                    k kVar = new k();
                    kVar.f110662b = hashMap;
                    kVar.f110661a = a3.get(0);
                    this.f110618f = kVar;
                    this.f110615c = 0;
                    aVar.a(true, 0, kVar);
                    return;
                }
                this.f110615c = -5;
                aVar.a(false, -5, null);
            }
        } catch (Exception unused) {
            this.f110615c = -6;
            aVar.a(false, -6, null);
        }
    }
}

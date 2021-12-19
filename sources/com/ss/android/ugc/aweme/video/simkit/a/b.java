package com.ss.android.ugc.aweme.video.simkit.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.playerkit.a.e;
import com.ss.android.ugc.aweme.playerkit.a.f;
import com.ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections;
import com.ss.android.ugc.aweme.requestcombine.IServerPortraitService;
import com.ss.android.ugc.aweme.video.simkit.a.a.b.a;
import com.ss.android.ugc.aweme.video.simkit.a.a.b.b;
import com.ss.android.ugc.aweme.video.simkit.a.a.b.c;
import com.ss.android.ugc.playerkit.exp.PlayerSettingService;

public final class b extends com.ss.android.ugc.aweme.simkit.config.a.b {

    /* renamed from: a  reason: collision with root package name */
    private f f143822a;

    static {
        Covode.recordClassIndex(94115);
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig, com.ss.android.ugc.aweme.simkit.config.a.b
    public final boolean a() {
        return b.a.f143819a;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig, com.ss.android.ugc.aweme.simkit.config.a.b
    public final f b() {
        IServerPortraitService d2 = ServerPortraitCollections.d();
        if (this.f143822a == null) {
            f.a aVar = new f.a();
            aVar.f115472a = c.a.f143821a;
            aVar.f115473b = a.C3829a.f143818a;
            aVar.f115474c = d2.a();
            e[] eVarArr = com.ss.android.ugc.aweme.video.simkit.a.b.a.f143823a;
            for (e eVar : eVarArr) {
                if (!aVar.f115476e.contains(eVar)) {
                    aVar.f115476e.add(eVar);
                }
            }
            if ((aVar.f115472a == null || aVar.f115472a.a() == 0) && ((aVar.f115473b == null || aVar.f115473b.a() == 0) && PlayerSettingService.isDebug())) {
                throw new RuntimeException("globalConditionListJson/additionalConditionListJson must not be null at the same time!");
            }
            f fVar = new f(aVar.f115472a, aVar.f115473b, aVar.f115474c, null, aVar.f115476e, (byte) 0);
            fVar.f115468d = aVar.f115475d;
            this.f143822a = fVar;
        }
        this.f143822a.f115467c = d2.a();
        return this.f143822a;
    }
}

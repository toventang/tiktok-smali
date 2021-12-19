package com.ss.android.ugc.aweme.video.simkit.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.playerkit.a.e;
import com.ss.android.ugc.aweme.playerkit.a.f;
import com.ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections;
import com.ss.android.ugc.aweme.requestcombine.IServerPortraitService;
import com.ss.android.ugc.aweme.video.simkit.a.a.a.a;
import com.ss.android.ugc.aweme.video.simkit.a.a.a.b;
import com.ss.android.ugc.aweme.video.simkit.a.a.a.c;
import com.ss.android.ugc.aweme.video.simkit.a.a.a.d;

public final class a extends com.ss.android.ugc.aweme.simkit.config.a.a {

    /* renamed from: a  reason: collision with root package name */
    private f f143809a;

    static {
        Covode.recordClassIndex(94100);
    }

    @Override // com.ss.android.ugc.aweme.simkit.config.a.a, com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig
    public final boolean a() {
        return b.a.f143812a;
    }

    @Override // com.ss.android.ugc.aweme.simkit.config.a.a, com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig
    public final f b() {
        IServerPortraitService d2 = ServerPortraitCollections.d();
        if (this.f143809a == null) {
            f.b bVar = new f.b();
            bVar.f115477a = c.a.f143814a;
            bVar.f115478b = a.C3828a.f143811a;
            bVar.f115479c = d2.a();
            bVar.f115481e = d.a.f143816a;
            e[] eVarArr = com.ss.android.ugc.aweme.video.simkit.a.b.a.f143823a;
            for (e eVar : eVarArr) {
                if (!bVar.f115482f.contains(eVar)) {
                    bVar.f115482f.add(eVar);
                }
            }
            if ((bVar.f115477a == null || bVar.f115477a.a() == 0) && ((bVar.f115478b == null || bVar.f115478b.a() == 0) && f.b.a())) {
                throw new RuntimeException("globalConditionListJson/additionalConditionListJson must not be null at the same time!");
            } else if ((bVar.f115481e == null || bVar.f115481e.a() == 0) && f.b.a()) {
                throw new RuntimeException("priorityList must not be null!");
            } else {
                f fVar = new f(bVar.f115477a, bVar.f115478b, bVar.f115479c, bVar.f115481e, bVar.f115482f, (byte) 0);
                fVar.f115468d = bVar.f115480d;
                this.f143809a = fVar;
            }
        }
        this.f143809a.f115467c = d2.a();
        return this.f143809a;
    }
}

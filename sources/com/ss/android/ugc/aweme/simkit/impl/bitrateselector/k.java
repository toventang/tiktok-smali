package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.playerkit.a.b;
import com.ss.android.ugc.aweme.playerkit.a.d;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig;
import com.ss.android.ugc.f.a.a.a.a.a;
import com.ss.android.ugc.f.a.a.a.a.c;
import com.ss.android.ugc.f.a.a.a.a.e;
import com.ss.android.ugc.f.a.a.a.a.f;
import com.ss.android.ugc.f.a.a.a.b.g;
import java.util.List;
import java.util.Map;

public final class k implements g {

    /* renamed from: a  reason: collision with root package name */
    private final g f133553a;

    /* renamed from: b  reason: collision with root package name */
    private final a f133554b;

    /* renamed from: c  reason: collision with root package name */
    private final b f133555c = d.a().a();

    static {
        Covode.recordClassIndex(87367);
    }

    @Override // com.ss.android.ugc.f.a.a.a.b.g
    public final void a(a aVar) {
    }

    @Override // com.ss.android.ugc.f.a.a.a.b.g
    public final void a(List<? extends e> list) {
    }

    @Override // com.ss.android.ugc.f.a.a.a.b.g
    public final void b(List<? extends com.ss.android.ugc.f.a.a.a.a.b> list) {
    }

    protected k(g gVar, a aVar) {
        this.f133553a = gVar;
        this.f133554b = aVar;
    }

    @Override // com.ss.android.ugc.f.a.a.a.b.g
    public final f a(List<? extends c> list, Map<String, Object> map) {
        System.currentTimeMillis();
        String str = (String) map.get("source_id");
        IDimensionBitrateCurveConfig dimensionBitrateCurveConfig = com.ss.android.ugc.aweme.simkit.d.a().b().getDimensionBitrateCurveConfig();
        a aVar = null;
        if (dimensionBitrateCurveConfig != null && dimensionBitrateCurveConfig.a()) {
            b bVar = this.f133555c;
            com.ss.android.ugc.aweme.playerkit.a.f b2 = dimensionBitrateCurveConfig.b();
            b2.f115471g = str;
            com.ss.android.ugc.aweme.simkit.model.bitrateselect.b bVar2 = (com.ss.android.ugc.aweme.simkit.model.bitrateselect.b) bVar.a(b2, com.ss.android.ugc.aweme.simkit.model.bitrateselect.b.class);
            if (bVar2 == null) {
                com.ss.android.ugc.playerkit.session.a.f148854a.b(str, null);
            } else {
                com.ss.android.ugc.playerkit.session.a.f148854a.b(str, new StringBuilder().append(bVar2.f133601a).append(bVar2.f133602b).append(bVar2.f133603c).append(bVar2.f133604d).append(bVar2.f133605e).toString());
                aVar = bVar2;
            }
        }
        System.currentTimeMillis();
        g gVar = this.f133553a;
        if (aVar == null) {
            aVar = this.f133554b;
        }
        gVar.a(aVar);
        return this.f133553a.a(list, map);
    }
}

package com.ss.android.ugc.aweme.playerkit.configpickerimpl.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.playerkit.a.e;
import com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.a;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements a.AbstractC2950a {

    /* renamed from: a  reason: collision with root package name */
    private final a f115489a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f115490b;

    /* renamed from: c  reason: collision with root package name */
    private final e f115491c;

    static {
        Covode.recordClassIndex(74136);
    }

    b(a aVar, Map map, e eVar) {
        this.f115489a = aVar;
        this.f115490b = map;
        this.f115491c = eVar;
    }

    @Override // com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.a.AbstractC2950a
    public final Object a() {
        Map map = this.f115490b;
        e eVar = this.f115491c;
        return map.put(eVar.a(), eVar.b());
    }
}

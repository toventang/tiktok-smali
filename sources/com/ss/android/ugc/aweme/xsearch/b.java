package com.ss.android.ugc.aweme.xsearch;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.c;
import h.f.b.l;
import java.util.Map;
import java.util.Set;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final LynxBaseUI f145138a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<String> f145139b;

    static {
        Covode.recordClassIndex(94914);
    }

    public b(LynxBaseUI lynxBaseUI, Set<String> set) {
        l.d(lynxBaseUI, "");
        l.d(set, "");
        this.f145138a = lynxBaseUI;
        this.f145139b = set;
    }

    public static /* synthetic */ void a(b bVar, String str, Map map) {
        l.d(str, "");
        l.d(map, "");
        if (bVar.f145139b.contains(str)) {
            j jVar = bVar.f145138a.mContext;
            l.b(jVar, "");
            c cVar = jVar.f55897e;
            com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(bVar.f145138a.getSign(), str);
            for (Map.Entry entry : map.entrySet()) {
                cVar2.a((String) entry.getKey(), entry.getValue());
            }
            cVar.a(cVar2);
        }
    }
}

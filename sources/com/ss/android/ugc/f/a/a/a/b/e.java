package com.ss.android.ugc.f.a.a.a.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.f.a.a.a.a.a;
import com.ss.android.ugc.f.a.a.a.a.b;
import com.ss.android.ugc.f.a.a.a.a.c;
import com.ss.android.ugc.f.a.a.a.a.f;
import java.util.List;
import java.util.Map;

public final class e implements g {
    static {
        Covode.recordClassIndex(95615);
    }

    @Override // com.ss.android.ugc.f.a.a.a.b.g
    public final void a(a aVar) {
    }

    @Override // com.ss.android.ugc.f.a.a.a.b.g
    public final void a(List<? extends com.ss.android.ugc.f.a.a.a.a.e> list) {
    }

    @Override // com.ss.android.ugc.f.a.a.a.b.g
    public final void b(List<? extends b> list) {
    }

    @Override // com.ss.android.ugc.f.a.a.a.b.g
    public final f a(List<? extends c> list, Map<String, Object> map) {
        f fVar = new f();
        if (list == null || list.isEmpty()) {
            fVar.f145548b = new com.ss.android.ugc.f.a.a.a.b(0, "bitrate list is empty...");
            return fVar;
        }
        c cVar = (c) list.get(0);
        for (c cVar2 : list) {
            if (cVar2.getBitRate() < cVar.getBitRate()) {
                cVar = cVar2;
            }
        }
        fVar.f145550d = (double) cVar.getBitRate();
        fVar.f145547a = cVar;
        fVar.f145549c = 2;
        return fVar;
    }
}

package com.bytedance.geckox.policy.loop;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.f;
import com.bytedance.geckox.policy.loop.model.LoopInterval;
import com.bytedance.q.e;
import java.util.Map;

public final class a implements e {
    static {
        Covode.recordClassIndex(17401);
    }

    @Override // com.bytedance.q.e
    public final void a(Object obj) {
        if (obj != null && f.a().e() == null) {
            Map<String, LoopInterval> map = (Map) obj;
            com.bytedance.geckox.i.a.a("[loop]update interval:", map);
            b.a().b(map);
        }
    }
}

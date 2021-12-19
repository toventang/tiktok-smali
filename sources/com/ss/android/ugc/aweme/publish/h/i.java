package com.ss.android.ugc.aweme.publish.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.publish.f;
import com.ss.android.ugc.tools.utils.q;
import h.f.a.a;
import h.f.b.l;
import java.util.Map;

final class i implements f {
    static {
        Covode.recordClassIndex(77178);
    }

    @Override // com.ss.android.ugc.aweme.publish.f
    public final void a(a<Boolean> aVar, String str, String str2, Map<String, String> map) {
        l.d(aVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(map, "");
        if (aVar.invoke().booleanValue()) {
            g.a();
            com.bytedance.services.apm.api.a.a("[" + str + "][" + str2 + ']', map);
            q.a(str, "publish illegal state: message=[" + str + "][" + str2 + "], data=" + map);
        }
    }
}

package com.ss.android.ugc.aweme.i18n.xbridge.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.c.c.z;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostFrameworkDepend;
import com.bytedance.ies.xbridge.model.b.c;
import com.ss.android.ugc.aweme.crossplatform.c.d;
import h.a.n;
import h.f.b.l;
import java.util.List;
import org.json.JSONObject;

public final class d implements IHostFrameworkDepend {
    static {
        Covode.recordClassIndex(63705);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostFrameworkDepend
    public final String getContainerID(c cVar) {
        String str;
        z a2;
        i a3 = com.ss.android.ugc.aweme.i18n.xbridge.d.d.a(cVar);
        if (a3 != null && (a2 = a3.a()) != null) {
            return a2.f32074a;
        }
        com.ss.android.ugc.aweme.crossplatform.c.d a4 = d.a.a();
        if (!(!a4.f78699b.isEmpty()) || (str = (String) n.i((List) a4.f78699b)) == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostFrameworkDepend
    public final void addObserverEvent(c cVar, String str, List<String> list, List<? extends JSONObject> list2) {
        l.d(str, "");
        l.d(list, "");
        l.d(list2, "");
        i a2 = com.ss.android.ugc.aweme.i18n.xbridge.d.d.a(cVar);
        if (a2 != null) {
            a2.a(str, list, list2);
        }
    }
}

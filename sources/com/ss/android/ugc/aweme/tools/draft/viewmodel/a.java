package com.ss.android.ugc.aweme.tools.draft.viewmodel;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.tools.draft.b.b;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, c> f139948a = new HashMap();

    static {
        Covode.recordClassIndex(91457);
    }

    public final void a() {
        this.f139948a.clear();
    }

    public final void b(String str) {
        l.d(str, "");
        this.f139948a.remove(str);
    }

    public final c a(String str) {
        l.d(str, "");
        q.a("AwemeDraftCaches : query -> creationId = ".concat(String.valueOf(str)));
        c cVar = this.f139948a.get(str);
        if (cVar != null) {
            q.a("AwemeDraftCaches : query -> draft from caches");
        } else {
            cVar = b.a(str);
            if (cVar != null) {
                this.f139948a.put(str, cVar);
                q.a("AwemeDraftCaches : query -> draft from db,creationId = " + cVar.r());
            }
        }
        return cVar;
    }
}

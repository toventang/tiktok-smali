package com.ss.android.ugc.aweme.live;

import com.bytedance.android.livesdkapi.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.o;
import com.ss.android.ugc.aweme.live.settings.a;
import com.ss.android.ugc.aweme.live.settings.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class aj implements i {
    static {
        Covode.recordClassIndex(69316);
    }

    @Override // com.ss.android.ugc.aweme.live.i
    public final h a() {
        return ah.f108100a;
    }

    @Override // com.ss.android.ugc.aweme.live.i
    public final m b() {
        return a.f108572a;
    }

    @Override // com.ss.android.ugc.aweme.live.i
    public final void a(c cVar) {
        o oVar;
        if (cVar != null && cVar.status_code == 0 && (oVar = cVar.f108575a) != null) {
            f.a(d.a(), oVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.i
    public final Map<String, Object> a(List<String> list) {
        HashMap hashMap = new HashMap();
        com.bytedance.android.livesdkapi.service.d a2 = f.a();
        if (a2 == null) {
            return hashMap;
        }
        JSONObject p = a2.p();
        for (String str : list) {
            Object opt = p.opt(str);
            if (opt != null) {
                hashMap.put(str, opt);
            }
        }
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.live.i
    public final <T> T a(String str, T t) {
        return (T) Live.getService().a(str, (Object) t);
    }
}

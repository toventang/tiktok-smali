package com.ss.android.ugc.aweme.discover.ui.search;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.search.e;
import h.f.b.l;
import org.json.JSONObject;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final b f82643a = new b();

    @Override // com.ss.android.ugc.aweme.search.e
    public final void a(String str) {
        l.d(str, "");
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(51466);
    }

    public static void a(Exception exc, String str) {
        l.d(exc, "");
        l.d(str, "");
        com.bytedance.c.a.a.a.b.a(exc, str);
        a.a((Throwable) exc);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception_message", exc.getMessage());
            jSONObject.put("bridge_type", str);
            com.bytedance.apm.b.a("get_search_history_exception", 0, c.a(jSONObject).a());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}

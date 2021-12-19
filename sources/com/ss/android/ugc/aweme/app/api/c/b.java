package com.ss.android.ugc.aweme.app.api.c;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.framework.a.a;
import f.a.d.f;
import org.json.JSONObject;

final /* synthetic */ class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f66602a;

    static {
        Covode.recordClassIndex(40946);
    }

    b(boolean z) {
        this.f66602a = z;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        boolean z = this.f66602a;
        JSONObject jSONObject = new JSONObject();
        String str = "proto";
        if (z) {
            str = "json";
        }
        try {
            jSONObject.put("service", str);
            jSONObject.put(StringSet.type, str);
        } catch (Throwable th) {
            a.a(th);
        }
        com.bytedance.apm.b.a(a.f66596a, jSONObject);
    }
}

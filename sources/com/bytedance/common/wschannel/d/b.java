package com.bytedance.common.wschannel.d;

import com.bytedance.common.wschannel.app.d;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public d f27210a;

    static {
        Covode.recordClassIndex(16037);
    }

    private b() {
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f27211a = new b((byte) 0);

        static {
            Covode.recordClassIndex(16038);
        }
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    @Override // com.bytedance.common.wschannel.app.d
    public final void a(String str, JSONObject jSONObject) {
        d dVar = this.f27210a;
        if (dVar != null) {
            dVar.a(str, jSONObject);
        }
    }
}

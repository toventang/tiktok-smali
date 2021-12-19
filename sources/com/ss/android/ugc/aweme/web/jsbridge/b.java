package com.ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.ss.android.ugc.aweme.commercialize.event.g;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import org.json.JSONObject;

public final class b implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f145019b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.ies.web.a.a f145020a;

    static {
        Covode.recordClassIndex(94820);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94821);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public b(com.bytedance.ies.web.a.a aVar) {
        this.f145020a = aVar;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        if (hVar != null) {
            hVar.f35538i = false;
            String str = hVar.f35532c;
            l.b(str, "");
            c.a(new g(str, hVar.f35533d, hVar.f35531b, this.f145020a));
        }
    }
}

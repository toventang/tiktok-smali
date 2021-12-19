package com.ss.android.ugc.aweme.shortcut.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.ss.android.ugc.aweme.shortcut.e;
import org.json.JSONObject;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final C3260a f124687a = new C3260a((byte) 0);

    static {
        Covode.recordClassIndex(81933);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortcut.a.a.a$a  reason: collision with other inner class name */
    public static final class C3260a {
        static {
            Covode.recordClassIndex(81934);
        }

        private C3260a() {
        }

        public /* synthetic */ C3260a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        long j2;
        JSONObject jSONObject2;
        Long valueOf;
        if (hVar == null || (jSONObject2 = hVar.f35533d) == null || (valueOf = Long.valueOf(jSONObject2.optLong("withdrawal_amount"))) == null) {
            j2 = 0;
        } else {
            j2 = valueOf.longValue();
        }
        com.ss.android.ugc.aweme.shortcut.d.a(j2);
        e.a(true);
    }
}

package com.ss.android.ugc.aweme.sticker.a.d;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.utils.hz;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import h.f.b.m;
import h.z;
import org.json.JSONObject;

public final class a extends com.ss.android.ugc.aweme.sticker.a.a {

    /* renamed from: b  reason: collision with root package name */
    public static final C3506a f134718b = new C3506a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private String f134719c = "NICK";

    /* renamed from: d  reason: collision with root package name */
    private boolean f134720d = true;

    static {
        Covode.recordClassIndex(88054);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.a.d.a$a  reason: collision with other inner class name */
    public static final class C3506a {
        static {
            Covode.recordClassIndex(88055);
        }

        private C3506a() {
        }

        public /* synthetic */ C3506a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.a.a
    public final String a() {
        return this.f134719c;
    }

    @Override // com.ss.android.ugc.aweme.sticker.a.a
    public final boolean b() {
        return this.f134720d;
    }

    static final class b extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f134721a = new b();

        static {
            Covode.recordClassIndex(88056);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.aweme.port.in.z zVar = c.u;
            Activity c2 = com.ss.android.ugc.aweme.df.c.c();
            l.b(c2, "");
            zVar.a(c2, "", "", null, null);
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(d dVar) {
        super(dVar);
        l.d(dVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sticker.a.a
    public final void a(int i2, String str) {
        if (!c.u.b()) {
            hz.a(b.f134721a);
            return;
        }
        com.ss.android.ugc.aweme.account.model.a e2 = g.a().A().e();
        if (e2 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("interface", "NICK");
            jSONObject.put("status", 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("handle", e2.a());
            jSONObject2.put("nickname", e2.h());
            jSONObject.put("body", jSONObject2);
            String jSONObject3 = jSONObject.toString();
            l.b(jSONObject3, "");
            a((long) i2, jSONObject3);
            return;
        }
        q.a("EffectUserInfoHandler", "handleEffectMessage::currentUser is null");
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("interface", "NICK");
        jSONObject4.put("status", 1);
        String jSONObject5 = jSONObject4.toString();
        l.b(jSONObject5, "");
        a((long) i2, jSONObject5);
    }
}

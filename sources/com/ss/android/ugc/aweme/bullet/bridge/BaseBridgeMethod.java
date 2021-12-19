package com.ss.android.ugc.aweme.bullet.bridge;

import android.app.Activity;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.c.d;
import com.bytedance.ies.bullet.service.base.o;
import com.bytedance.ies.bullet.ui.common.g;
import com.bytedance.ies.web.a.h;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.au;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseBridgeMethod extends com.bytedance.ies.bullet.ui.common.a.a implements au {

    public interface a {
        static {
            Covode.recordClassIndex(42418);
        }

        void a(int i2, String str);

        void a(Object obj);

        void a(Object obj, int i2, String str);

        void a(JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(42417);
    }

    public void a(JSONObject jSONObject, a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
    }

    public static final class c implements p {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f68851a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f68852b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ JSONObject f68853c;

        /* renamed from: d  reason: collision with root package name */
        private final String f68854d;

        static {
            Covode.recordClassIndex(42420);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f68854d;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final /* bridge */ /* synthetic */ Object b() {
            return this.f68851a;
        }

        c(String str, JSONObject jSONObject) {
            this.f68852b = str;
            this.f68853c = jSONObject;
            this.f68854d = str;
            this.f68851a = jSONObject;
        }
    }

    public final com.bytedance.ies.bullet.c.c.i g() {
        return (com.bytedance.ies.bullet.c.c.i) this.f32005a.c(com.bytedance.ies.bullet.c.c.i.class);
    }

    /* access modifiers changed from: protected */
    public final com.bytedance.ies.bullet.service.f.a.b.b h() {
        com.bytedance.ies.bullet.service.f.a.b.b b2;
        com.bytedance.ies.bullet.c.c.i g2 = g();
        if (g2 == null || (b2 = g2.b()) == null) {
            return com.bytedance.ies.bullet.service.f.a.b.b.RN;
        }
        return b2;
    }

    /* access modifiers changed from: protected */
    public final com.bytedance.ies.web.a.a i() {
        return (com.bytedance.ies.web.a.a) this.f32005a.c(com.bytedance.ies.web.a.a.class);
    }

    /* access modifiers changed from: protected */
    public final o j() {
        return (o) this.f32005a.c(o.class);
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.b f68850a;

        static {
            Covode.recordClassIndex(42419);
        }

        b(k.b bVar) {
            this.f68850a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.a
        public final void a(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("data", obj);
                this.f68850a.a(jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.a
        public final void a(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    this.f68850a.a(jSONObject);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.a
        public final void a(int i2, String str) {
            k.b bVar = this.f68850a;
            if (str == null) {
                str = "";
            }
            bVar.a(i2, str);
        }

        @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.a
        public final void a(Object obj, int i2, String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", i2);
                jSONObject.put("msg", str);
                jSONObject.put("data", obj);
                this.f68850a.a(jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseBridgeMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    /* access modifiers changed from: protected */
    public final Activity a(String str) {
        d dVar;
        com.bytedance.ies.bullet.c.c.i a2;
        g z;
        if (!(str == null || (dVar = (d) this.f32005a.c(d.class)) == null || (a2 = dVar.a(str)) == null)) {
            if (!(a2 instanceof com.bytedance.ies.bullet.ui.common.c.c)) {
                a2 = null;
            }
            com.bytedance.ies.bullet.ui.common.c.c cVar = (com.bytedance.ies.bullet.ui.common.c.c) a2;
            if (!(cVar == null || (z = cVar.z()) == null)) {
                return z.a();
            }
        }
        return null;
    }

    protected static h a(JSONObject jSONObject) {
        l.d(jSONObject, "");
        h hVar = new h();
        hVar.f35533d = jSONObject;
        JSONObject optJSONObject = jSONObject.optJSONObject("jsMsg");
        if (optJSONObject != null) {
            hVar.f35530a = optJSONObject.optString(StringSet.type);
            hVar.f35532c = optJSONObject.optString("func");
            hVar.f35531b = optJSONObject.optString("callback_id");
            hVar.f35534e = optJSONObject.optInt("version");
            hVar.f35538i = optJSONObject.optBoolean("needCallback");
            hVar.f35537h = optJSONObject.optString("permissionGroup");
        }
        return hVar;
    }

    public final void a(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        com.bytedance.ies.bullet.c.c.i g2 = g();
        if (g2 != null) {
            g2.onEvent(new c(str, jSONObject));
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.k
    public void a(JSONObject jSONObject, k.b bVar) {
        l.d(jSONObject, "");
        l.d(bVar, "");
        a(jSONObject, new b(bVar));
    }
}

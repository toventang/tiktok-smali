package com.bytedance.android.monitorV2.webview.c.b;

import com.bytedance.android.monitorV2.a.b;
import com.bytedance.android.monitorV2.a.f;
import com.bytedance.android.monitorV2.webview.c.a.c;
import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private C0519a f24172a = new C0519a("falconPerf");

    static {
        Covode.recordClassIndex(14236);
    }

    @Override // com.bytedance.android.monitorV2.a.g
    public final f f() {
        return null;
    }

    @Override // com.bytedance.android.monitorV2.webview.c.a.c, com.bytedance.android.monitorV2.a.g
    public final /* bridge */ /* synthetic */ b e() {
        return this.f24172a;
    }

    @Override // com.bytedance.android.monitorV2.webview.c.a.c
    public final com.bytedance.android.monitorV2.webview.c.a.a j() {
        return this.f24172a;
    }

    @Override // com.bytedance.android.monitorV2.webview.c.a.c, com.bytedance.android.monitorV2.webview.c.a.b
    public final boolean k() {
        return this.f24172a.f24165c;
    }

    @Override // com.bytedance.android.monitorV2.webview.c.a.c, com.bytedance.android.monitorV2.webview.c.a.b
    public final void l() {
        this.f24172a.f24165c = false;
    }

    /* renamed from: com.bytedance.android.monitorV2.webview.c.b.a$a  reason: collision with other inner class name */
    class C0519a extends com.bytedance.android.monitorV2.webview.c.a.a {

        /* renamed from: d  reason: collision with root package name */
        private JSONArray f24174d = new JSONArray();

        static {
            Covode.recordClassIndex(14237);
        }

        @Override // com.bytedance.android.monitorV2.webview.c.a.a
        public final void b() {
            this.f24165c = false;
        }

        @Override // com.bytedance.android.monitorV2.a.a
        public final void a(JSONObject jSONObject) {
            com.bytedance.android.monitorV2.l.f.a(jSONObject, "resource_list", this.f24174d);
        }

        public C0519a(String str) {
            super(str);
        }
    }

    public a(b bVar) {
        super(bVar, "falconPerf", bVar.f23904c);
    }
}

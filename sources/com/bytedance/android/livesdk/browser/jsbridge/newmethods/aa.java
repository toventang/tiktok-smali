package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.model.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import f.a.d.g;
import org.json.JSONObject;

final /* synthetic */ class aa implements g {

    /* renamed from: a  reason: collision with root package name */
    private final z f14493a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14494b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f14495c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f14496d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f14497e;

    static {
        Covode.recordClassIndex(8049);
    }

    aa(z zVar, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f14493a = zVar;
        this.f14494b = str;
        this.f14495c = jSONObject;
        this.f14496d = jSONObject2;
        this.f14497e = jSONObject3;
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        a a2;
        z zVar = this.f14493a;
        String str = this.f14494b;
        JSONObject jSONObject = this.f14495c;
        JSONObject jSONObject2 = this.f14496d;
        JSONObject jSONObject3 = this.f14497e;
        String str2 = (String) obj;
        com.ss.android.common.util.g gVar = new com.ss.android.common.util.g(str);
        for (com.bytedance.android.live.base.model.a aVar : z.a(jSONObject)) {
            gVar.a(aVar.getName(), aVar.getValue());
        }
        com.bytedance.android.live.core.c.a.a(3, "FetchMethod", "build url is " + gVar.a());
        zVar.f14800e = gVar.a();
        if (TextUtils.equals(str2, UGCMonitor.TYPE_POST)) {
            a2 = z.a(zVar.f14800e, jSONObject2, jSONObject3);
        } else {
            a2 = z.a(zVar.f14800e, jSONObject2);
        }
        zVar.f14796a = a2.f23265b;
        zVar.f14797b = a2.f23269f;
        zVar.a(a2);
        return new JSONObject(new String(a2.f23268e));
    }
}

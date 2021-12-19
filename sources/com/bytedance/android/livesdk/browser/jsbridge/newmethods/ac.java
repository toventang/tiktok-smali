package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.android.live.network.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import f.a.d.g;
import org.json.JSONObject;

final /* synthetic */ class ac implements g {

    /* renamed from: a  reason: collision with root package name */
    private final String f14500a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f14501b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f14502c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f14503d;

    static {
        Covode.recordClassIndex(8052);
    }

    ac(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f14500a = str;
        this.f14501b = jSONObject;
        this.f14502c = jSONObject2;
        this.f14503d = jSONObject3;
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        String str = this.f14500a;
        JSONObject jSONObject = this.f14501b;
        JSONObject jSONObject2 = this.f14502c;
        JSONObject jSONObject3 = this.f14503d;
        if (TextUtils.equals((String) obj, UGCMonitor.TYPE_POST)) {
            return ab.a(str, jSONObject, jSONObject2, jSONObject3);
        }
        return Base64.encodeToString(h.a().a(ab.a(str, jSONObject2), ab.a(jSONObject), null).a().f23268e, 2);
    }
}

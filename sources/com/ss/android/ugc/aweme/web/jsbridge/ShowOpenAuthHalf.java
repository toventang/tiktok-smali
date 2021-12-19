package com.ss.android.ugc.aweme.web.jsbridge;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.c.a.c;
import com.google.gson.f;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ShowOpenAuthHalf extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public final String f144949a = "_aweme_params_verify_scope";

    /* renamed from: b  reason: collision with root package name */
    private BaseCommonJavaMethod.a f144950b;

    /* renamed from: c  reason: collision with root package name */
    private String f144951c;

    /* renamed from: d  reason: collision with root package name */
    private String f144952d;

    /* renamed from: e  reason: collision with root package name */
    private String f144953e;

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.ies.web.a.a f144954f;

    static {
        Covode.recordClassIndex(94787);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a extends com.google.gson.b.a<HashMap<String, Integer>> {
        static {
            Covode.recordClassIndex(94788);
        }

        a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShowOpenAuthHalf(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
        l.d(aVar, "");
        this.f144954f = aVar;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        com.ss.android.ugc.aweme.ax.a.m mVar = (com.ss.android.ugc.aweme.ax.a.m) b().a(com.ss.android.ugc.aweme.ax.a.m.class);
        if (mVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.type, "jsb");
            jSONObject2.put("bridge_name", "showOpenAuth");
            jSONObject2.put("bridge_access", "true");
            jSONObject2.put("stage", "open_jsb_auth");
            mVar.a("open_jsb_monitor", "open_jsb_invoke", jSONObject2, null, null);
        }
        this.f144950b = aVar;
        StringBuilder sb = new StringBuilder();
        String str = null;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        if (jSONObject != null) {
            if (jSONObject.has("client_key")) {
                this.f144951c = jSONObject.getString("client_key");
            }
            if (jSONObject.has("scopes")) {
                Object a2 = new f().a(jSONObject.getString("scopes"), new a().type);
                l.b(a2, "");
                for (Map.Entry entry : ((HashMap) a2).entrySet()) {
                    String str2 = (String) entry.getKey();
                    int intValue = ((Number) entry.getValue()).intValue();
                    if (intValue == 0) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        sb.append(str2);
                    } else if (intValue == 1) {
                        if (sb2.length() > 0) {
                            sb2.append(",");
                        }
                        sb2.append(str2);
                    } else if (intValue == 2) {
                        if (sb3.length() > 0) {
                            sb3.append(",");
                        }
                        sb3.append(str2);
                    }
                }
            }
            if (jSONObject.has("state")) {
                this.f144952d = jSONObject.getString("state");
            }
            if (jSONObject.has("redirect_uri")) {
                this.f144953e = jSONObject.getString("redirect_uri");
            }
            if (jSONObject.has("certificationInfo")) {
                str = jSONObject.getString("certificationInfo");
            }
        }
        c.a aVar2 = new c.a();
        aVar2.f43132a = this.f144952d;
        aVar2.f43133b = this.f144953e;
        if (sb.length() > 0) {
            aVar2.f43139h = sb.toString();
        }
        if (sb2.length() > 0) {
            aVar2.f43140i = sb2.toString();
        }
        if (sb3.length() > 0) {
            aVar2.f43141j = sb3.toString();
        }
        aVar2.f43134c = this.f144951c;
        aVar2.f43137f = "wap_to_native";
        Bundle bundle = new Bundle();
        aVar2.toBundle(bundle);
        if (str != null) {
            bundle.putString(this.f144949a, str);
        }
    }
}

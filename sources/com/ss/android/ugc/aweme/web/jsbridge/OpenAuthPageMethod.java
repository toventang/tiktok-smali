package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.c.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class OpenAuthPageMethod extends BaseCommonJavaMethod implements au, d {
    public static final a Companion = new a((byte) 0);
    private final com.bytedance.ies.web.a.a jsBridge;
    private BaseCommonJavaMethod.a mIReturn;

    static {
        Covode.recordClassIndex(94774);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94775);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenAuthPageMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
        l.d(aVar, "");
        this.jsBridge = aVar;
    }

    public final void onClick(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ticket", str);
        jSONObject.put("code", 1);
        jSONObject.put("response", jSONObject2);
        BaseCommonJavaMethod.a aVar = this.mIReturn;
        if (aVar != null) {
            aVar.a(jSONObject);
        }
    }

    public final void onError(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", 0);
        jSONObject.put("errorCode", str);
        jSONObject.put("errorMsg", str2);
        BaseCommonJavaMethod.a aVar = this.mIReturn;
        if (aVar != null) {
            aVar.a(jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String str;
        String str2;
        String str3;
        this.mIReturn = aVar;
        com.ss.android.ugc.aweme.ax.a.m mVar = (com.ss.android.ugc.aweme.ax.a.m) b().a(com.ss.android.ugc.aweme.ax.a.m.class);
        if (mVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.type, "jsb");
            jSONObject2.put("bridge_name", "jumpOpenAuthPage");
            jSONObject2.put("bridge_access", "true");
            jSONObject2.put("stage", "open_jsb_auth");
            mVar.a("open_jsb_monitor", "open_jsb_invoke", jSONObject2, null, null);
        }
        String str4 = null;
        if (jSONObject != null) {
            str = jSONObject.getString("client_key");
            jSONObject.getString("response_type");
            str2 = jSONObject.getString("scope");
            str3 = jSONObject.getString("state");
            str4 = jSONObject.getString("redirect_uri");
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        c.a aVar2 = new c.a();
        aVar2.f43139h = str2;
        aVar2.f43132a = str3;
        aVar2.f43137f = "wap_to_native";
        aVar2.f43133b = str4;
        Bundle bundle = new Bundle();
        aVar2.toBundle(bundle);
        bundle.putString("_bytedance_params_client_key", str);
        bundle.putString("__bytedance_base_caller_version", "1");
        Context actContext = getActContext();
        l.b(actContext, "");
        bundle.putString("_bytedance_params_type_caller_package", actContext.getPackageName());
        bundle.putString("_aweme_params_enter_from_flag", "ENTER_FROM_INNER_WEB");
    }
}

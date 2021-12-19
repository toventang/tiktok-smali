package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.bean.d;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bo;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.profile.f.ai;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class LoginMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f91092b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f91093a;

    static {
        Covode.recordClassIndex(57307);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57308);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static void a(BaseCommonJavaMethod.a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            ai.a(jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        if (aVar != null) {
            aVar.a(jSONObject);
        }
    }

    public final void b(BaseCommonJavaMethod.a aVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", false);
        jSONObject.put("code", 1);
        if (aVar != null) {
            aVar.a(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(StringSet.type, "loginCanceled");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("code", 1);
            jSONObject2.put("args", jSONObject3);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        sendEvent("H5_nativeEvent", jSONObject2, 3);
    }

    public LoginMethod(com.bytedance.ies.web.a.a aVar, boolean z) {
        super(aVar);
        this.f91093a = z;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        Context actContext = getActContext();
        if (!(actContext instanceof Activity)) {
            actContext = null;
        }
        Activity activity = (Activity) actContext;
        if (!(activity == null || jSONObject == null)) {
            String optString = jSONObject.optString("enter_from", "h5");
            String optString2 = jSONObject.optString("enter_method", "");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (!g2.isLogin() || l.a((Object) "find_account", (Object) optString)) {
                String optString3 = jSONObject.optString("platform", "");
                l.b(optString3, "");
                if (!TextUtils.isEmpty(optString3)) {
                    bo b2 = com.ss.android.ugc.aweme.account.b.b();
                    l.b(b2, "");
                    for (d dVar : b2.getAllSupportedLoginPlatform()) {
                        if (TextUtils.equals(optString3, dVar.f62897c)) {
                            Bundle bundle = new Bundle();
                            bundle.putString("setting_page", "feedback_faq_list_page");
                            bundle.putBoolean("is_login", this.f91093a);
                            bundle.putString("jsb_parmas", jSONObject.toString());
                            bo b3 = com.ss.android.ugc.aweme.account.b.b();
                            IAccountService.d dVar2 = new IAccountService.d();
                            dVar2.f62401a = activity;
                            dVar2.f62402b = optString;
                            dVar2.f62403c = optString2;
                            dVar2.f62404d = bundle;
                            dVar2.f62405e = new b(this, aVar);
                            b3.loginByPlatform(dVar2.a(), dVar);
                            return;
                        }
                    }
                }
                bo b4 = com.ss.android.ugc.aweme.account.b.b();
                IAccountService.d dVar3 = new IAccountService.d();
                dVar3.f62401a = activity;
                dVar3.f62402b = optString;
                dVar3.f62405e = new c(this, aVar);
                b4.showLoginAndRegisterView(dVar3.a());
                return;
            }
            a(aVar);
        }
    }

    static final class b implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LoginMethod f91094a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f91095b;

        static {
            Covode.recordClassIndex(57309);
        }

        b(LoginMethod loginMethod, BaseCommonJavaMethod.a aVar) {
            this.f91094a = loginMethod;
            this.f91095b = aVar;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i2 != 1) {
                return;
            }
            if (i3 == 1) {
                LoginMethod.a(this.f91095b);
            } else {
                this.f91094a.b(this.f91095b);
            }
        }
    }

    static final class c implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LoginMethod f91096a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f91097b;

        static {
            Covode.recordClassIndex(57310);
        }

        c(LoginMethod loginMethod, BaseCommonJavaMethod.a aVar) {
            this.f91096a = loginMethod;
            this.f91097b = aVar;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i2 != 1) {
                return;
            }
            if (i3 == 1) {
                LoginMethod.a(this.f91097b);
            } else {
                this.f91096a.b(this.f91097b);
            }
        }
    }
}

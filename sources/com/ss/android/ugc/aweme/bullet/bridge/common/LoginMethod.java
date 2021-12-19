package com.ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
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
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.bo;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.profile.f.ai;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public class LoginMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f68997b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f68998c = "login";

    static {
        Covode.recordClassIndex(42541);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42542);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public String d() {
        return this.f68998c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    public final void a(BaseBridgeMethod.a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            ai.a(jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        if (h() == com.bytedance.ies.bullet.service.f.a.b.b.LYNX) {
            aVar.a((Object) jSONObject);
        } else {
            aVar.a(jSONObject);
        }
    }

    public final void b(BaseBridgeMethod.a aVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", false);
        jSONObject.put("code", 1);
        if (h() == com.bytedance.ies.bullet.service.f.a.b.b.LYNX) {
            aVar.a((Object) jSONObject);
        } else {
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
        a("H5_nativeEvent", jSONObject2);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        Activity a2 = o.a(e());
        if (a2 != null) {
            String optString = jSONObject.optString("enter_from", "h5");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (!g2.isLogin()) {
                String optString2 = jSONObject.optString("platform", "");
                l.b(optString2, "");
                if (!TextUtils.isEmpty(optString2)) {
                    bo b2 = com.ss.android.ugc.aweme.account.b.b();
                    l.b(b2, "");
                    for (d dVar : b2.getAllSupportedLoginPlatform()) {
                        if (TextUtils.equals(optString2, dVar.f62897c)) {
                            Bundle bundle = new Bundle();
                            bundle.putString("setting_page", "feedback_faq_list_page");
                            bundle.putBoolean("is_login", TextUtils.equals(d(), "loginWithPlatform"));
                            bundle.putString("jsb_parmas", jSONObject.toString());
                            bo b3 = com.ss.android.ugc.aweme.account.b.b();
                            IAccountService.d dVar2 = new IAccountService.d();
                            dVar2.f62401a = a2;
                            dVar2.f62402b = optString;
                            dVar2.f62404d = bundle;
                            dVar2.f62405e = new b(this, aVar);
                            b3.loginByPlatform(dVar2.a(), dVar);
                            return;
                        }
                    }
                }
                bo b4 = com.ss.android.ugc.aweme.account.b.b();
                IAccountService.d dVar3 = new IAccountService.d();
                dVar3.f62401a = a2;
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
        final /* synthetic */ LoginMethod f68999a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseBridgeMethod.a f69000b;

        static {
            Covode.recordClassIndex(42543);
        }

        b(LoginMethod loginMethod, BaseBridgeMethod.a aVar) {
            this.f68999a = loginMethod;
            this.f69000b = aVar;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i2 != 1) {
                return;
            }
            if (i3 == 1) {
                this.f68999a.a(this.f69000b);
            } else {
                this.f68999a.b(this.f69000b);
            }
        }
    }

    static final class c implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LoginMethod f69001a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseBridgeMethod.a f69002b;

        static {
            Covode.recordClassIndex(42544);
        }

        c(LoginMethod loginMethod, BaseBridgeMethod.a aVar) {
            this.f69001a = loginMethod;
            this.f69002b = aVar;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i2 != 1) {
                return;
            }
            if (i3 == 1) {
                this.f69001a.a(this.f69002b);
            } else {
                this.f69001a.b(this.f69002b);
            }
        }
    }
}

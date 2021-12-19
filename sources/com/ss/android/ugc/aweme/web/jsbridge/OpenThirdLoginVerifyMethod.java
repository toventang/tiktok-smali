package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.a.b;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class OpenThirdLoginVerifyMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.ies.web.a.a f144938a;

    static {
        Covode.recordClassIndex(94781);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public OpenThirdLoginVerifyMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
        this.f144938a = aVar;
    }

    static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f144939a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f144940b;

        static {
            Covode.recordClassIndex(94782);
        }

        a(BaseCommonJavaMethod.a aVar, String str) {
            this.f144939a = aVar;
            this.f144940b = str;
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.ss.android.ugc.aweme.base.a.b
        public final boolean a(int i2, int i3, Intent intent) {
            if (i3 == -1 && i2 == 10000) {
                String a2 = a(intent, "access_token");
                if (a2 == null) {
                    a2 = "";
                }
                l.b(a2, "");
                String a3 = a(intent, "access_token_secret");
                if (a3 == null) {
                    a3 = "";
                }
                l.b(a3, "");
                String a4 = a(intent, "code");
                if (a4 == null) {
                    a4 = "";
                }
                l.b(a4, "");
                String a5 = a(intent, "platform_id");
                if (a5 == null) {
                    a5 = "";
                }
                l.b(a5, "");
                if (!l.a((Object) a2, (Object) "") || !l.a((Object) a3, (Object) "") || !l.a((Object) a4, (Object) "")) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (l.a((Object) "line", (Object) this.f144940b)) {
                            jSONObject.put("access_token", Uri.encode(a2));
                            jSONObject.put("access_token_secret", Uri.encode(a3));
                            jSONObject.put("code", Uri.encode(a4));
                        } else {
                            jSONObject.put("access_token", a2);
                            jSONObject.put("access_token_secret", a3);
                            jSONObject.put("code", a4);
                        }
                        jSONObject.put("platform", this.f144940b);
                        jSONObject.put("platform_app_id", a5);
                        BaseCommonJavaMethod.a aVar = this.f144939a;
                        if (aVar != null) {
                            aVar.a((Object) jSONObject);
                        }
                    } catch (JSONException unused) {
                        BaseCommonJavaMethod.a aVar2 = this.f144939a;
                        if (aVar2 != null) {
                            aVar2.a(0, "failed");
                        }
                        return true;
                    }
                } else {
                    BaseCommonJavaMethod.a aVar3 = this.f144939a;
                    if (aVar3 != null) {
                        aVar3.a(0, "");
                    }
                    return true;
                }
            } else {
                BaseCommonJavaMethod.a aVar4 = this.f144939a;
                if (aVar4 != null) {
                    aVar4.a(0, "");
                }
            }
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String str;
        if (this.mContextRef != null && this.f144938a != null) {
            if (jSONObject != null) {
                str = jSONObject.getString("platform");
            } else {
                str = null;
            }
            Context context = (Context) this.mContextRef.get();
            if (context instanceof CrossPlatformActivity) {
                CrossPlatformActivity crossPlatformActivity = (CrossPlatformActivity) context;
                crossPlatformActivity.setActivityResultListener(new a(aVar, str));
                Intent authorizeActivityStartIntent = com.ss.android.ugc.aweme.account.b.e().getAuthorizeActivityStartIntent(crossPlatformActivity);
                authorizeActivityStartIntent.putExtra("platform", str);
                authorizeActivityStartIntent.putExtra("is_login", false);
                authorizeActivityStartIntent.putExtra("is_only_fetch_token", true);
                crossPlatformActivity.startActivityForResult(authorizeActivityStartIntent, 10000);
            } else if (aVar != null) {
                aVar.a(0, "");
            }
        }
    }
}

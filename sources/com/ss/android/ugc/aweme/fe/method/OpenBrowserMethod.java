package com.ss.android.ugc.aweme.fe.method;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.f.b.l;
import h.m.p;
import org.json.JSONObject;

public final class OpenBrowserMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91108a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57322);
    }

    private OpenBrowserMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57323);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ OpenBrowserMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public OpenBrowserMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    static final class b implements n.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f91109a;

        static {
            Covode.recordClassIndex(57324);
        }

        b(Context context) {
            this.f91109a = context;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.utils.n.a
        public final void sendLog(boolean z) {
            String str;
            f.b a2 = f.a();
            a2.f74804a = "draw_ad";
            String str2 = "deeplink_success";
            if (z) {
                str = str2;
            } else {
                str = "deeplink_failed";
            }
            a2.f74805b = str;
            a2.a(this.f91109a);
            if (!z) {
                str2 = "deeplink_failed";
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", str2, "0", "", "0").c();
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        Context context = (Context) this.mContextRef.get();
        try {
            String string = jSONObject.getString("url");
            if (!TextUtils.isEmpty(string)) {
                l.b(string, "");
                if (string != null) {
                    String lowerCase = string.toLowerCase();
                    l.b(lowerCase, "");
                    if (p.b(lowerCase, "http://", false) || p.b(lowerCase, "https://", false)) {
                        Context context2 = (Context) this.mContextRef.get();
                        String string2 = jSONObject.getString("url");
                        if (context2 != null && jSONObject.optBoolean("use_external_browser", false)) {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string2));
                            intent.addFlags(268435456);
                            intent.addCategory("android.intent.category.BROWSABLE");
                            ResolveInfo resolveActivity = context2.getPackageManager().resolveActivity(intent, 65536);
                            if (resolveActivity != null) {
                                intent.setClassName(resolveActivity.activityInfo.packageName, resolveActivity.activityInfo.name);
                                com.ss.android.ugc.tiktok.security.a.a.a(intent, context2);
                                context2.startActivity(intent);
                            }
                        }
                        jSONObject.put(StringSet.type, "webview");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("url", string2);
                        jSONObject.put("args", jSONObject2);
                        com.ss.android.ugc.aweme.fe.a.a.a(context2, jSONObject);
                    } else if (context != null) {
                        if (w.a(context, string, false)) {
                            f.b a2 = f.a();
                            a2.f74804a = "draw_ad";
                            a2.f74805b = "open_url_app";
                            a2.a(context);
                            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "open_url_app", "0", "", "0").c();
                            w.a(new b(context));
                        }
                    }
                    aVar.a("");
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            aVar.a(0, "");
        } catch (Exception unused) {
            aVar.a(0, "");
        }
    }
}

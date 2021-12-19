package com.ss.android.ugc.aweme.bullet.bridge.framework;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import h.f.b.l;
import h.m.p;
import org.json.JSONObject;

public final class OpenBrowserMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69104b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69105c = "openBrowser";

    /* renamed from: d  reason: collision with root package name */
    private k.a f69106d = k.a.PROTECT;

    static {
        Covode.recordClassIndex(42616);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42617);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f69106d;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69105c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f69106d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenBrowserMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    static final class b implements n.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f69107a;

        static {
            Covode.recordClassIndex(42618);
        }

        b(Context context) {
            this.f69107a = context;
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
            a2.a(this.f69107a);
            if (!z) {
                str2 = "deeplink_failed";
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", str2, "0", "", "0").c();
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            Context e2 = e();
            String string = jSONObject.getString("url");
            if (!TextUtils.isEmpty(string)) {
                l.b(string, "");
                if (string != null) {
                    String lowerCase = string.toLowerCase();
                    l.b(lowerCase, "");
                    if (p.b(lowerCase, "http://", false) || p.b(lowerCase, "https://", false)) {
                        String string2 = jSONObject.getString("url");
                        Context e3 = e();
                        if (e3 != null && jSONObject.optBoolean("use_external_browser", false)) {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string2));
                            intent.addFlags(268435456);
                            intent.addCategory("android.intent.category.BROWSABLE");
                            ResolveInfo resolveActivity = e3.getPackageManager().resolveActivity(intent, 65536);
                            if (resolveActivity != null) {
                                intent.setClassName(resolveActivity.activityInfo.packageName, resolveActivity.activityInfo.name);
                                com.ss.android.ugc.tiktok.security.a.a.a(intent, e3);
                                e3.startActivity(intent);
                            }
                        }
                        jSONObject.put(StringSet.type, "webview");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("url", string2);
                        jSONObject.put("args", jSONObject2);
                        com.ss.android.ugc.aweme.fe.a.a.a(e3, jSONObject);
                    } else if (e2 != null) {
                        if (w.a(e2, string, false)) {
                            f.b a2 = f.a();
                            a2.f74804a = "draw_ad";
                            a2.f74805b = "open_url_app";
                            a2.a(e2);
                            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "open_url_app", "0", "", "0").c();
                            w.a(new b(e2));
                        }
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("code", 1);
                    aVar.a(jSONObject3);
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

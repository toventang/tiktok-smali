package com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class OpenAlertMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public k.b f82657b;

    /* renamed from: c  reason: collision with root package name */
    private final String f82658c = "openAlert";

    static {
        Covode.recordClassIndex(51486);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class d implements p {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f82665a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f82666b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f82667c;

        /* renamed from: d  reason: collision with root package name */
        private final String f82668d = "onAlertButtonClickAction";

        static {
            Covode.recordClassIndex(51490);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f82668d;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final /* bridge */ /* synthetic */ Object b() {
            return this.f82665a;
        }

        d(String str, String str2) {
            this.f82666b = str;
            this.f82667c = str2;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("op_args", str);
            jSONObject.put("alert_id", str2);
            this.f82665a = jSONObject;
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f82658c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenAlertMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OpenAlertMethod f82659a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f82660b;

        static {
            Covode.recordClassIndex(51487);
        }

        a(OpenAlertMethod openAlertMethod, String str) {
            this.f82659a = openAlertMethod;
            this.f82660b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f82659a.a("cancel", this.f82660b);
            dialogInterface.dismiss();
        }
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OpenAlertMethod f82661a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f82662b;

        static {
            Covode.recordClassIndex(51488);
        }

        b(OpenAlertMethod openAlertMethod, String str) {
            this.f82661a = openAlertMethod;
            this.f82662b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f82661a.a("center", this.f82662b);
            dialogInterface.dismiss();
        }
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OpenAlertMethod f82663a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f82664b;

        static {
            Covode.recordClassIndex(51489);
        }

        c(OpenAlertMethod openAlertMethod, String str) {
            this.f82663a = openAlertMethod;
            this.f82664b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f82663a.a("confirm", this.f82664b);
            dialogInterface.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.c.c.a.k
    public final void a(JSONObject jSONObject, k.b bVar) {
        l.d(jSONObject, "");
        l.d(bVar, "");
        super.a(jSONObject, bVar);
        this.f82657b = bVar;
    }

    public final void a(String str, String str2) {
        try {
            d dVar = new d(str, str2);
            com.bytedance.ies.bullet.c.c.i g2 = g();
            if (g2 != null) {
                g2.onEvent(dVar);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        JSONObject jSONObject2;
        String str;
        String str2;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            String optString = jSONObject.optString("title");
            String optString2 = jSONObject.optString("content");
            boolean optBoolean = jSONObject.optBoolean("cancelable");
            JSONObject optJSONObject3 = jSONObject.optJSONObject("buttons");
            String optString3 = jSONObject.optString("id");
            String str3 = null;
            if (optJSONObject3 != null) {
                jSONObject2 = optJSONObject3.optJSONObject("cancel");
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                str = jSONObject2.optString("text");
            } else {
                str = null;
            }
            if (optJSONObject3 == null || (optJSONObject2 = optJSONObject3.optJSONObject("center")) == null) {
                str2 = null;
            } else {
                str2 = optJSONObject2.optString("text");
            }
            if (!(optJSONObject3 == null || (optJSONObject = optJSONObject3.optJSONObject("confirm")) == null)) {
                str3 = optJSONObject.optString("text");
            }
            Activity j2 = f.j();
            if (j2 != null) {
                a.C0731a aVar2 = new a.C0731a(j2);
                if (!TextUtils.isEmpty(optString)) {
                    aVar2.f33401a = optString;
                }
                if (!TextUtils.isEmpty(optString2)) {
                    aVar2.f33402b = optString2;
                }
                aVar2.M = optBoolean;
                if (!TextUtils.isEmpty(str)) {
                    aVar2.b(str, (DialogInterface.OnClickListener) new a(this, optString3), false);
                }
                if (!TextUtils.isEmpty(str2)) {
                    aVar2.E = true;
                }
                aVar2.c(str2, new b(this, optString3), false);
                if (!TextUtils.isEmpty(str3)) {
                    aVar2.a(str3, (DialogInterface.OnClickListener) new c(this, optString3), false);
                }
                aVar2.a().c();
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.discover.ui.search.b.a(e2, "GetSearchHistoryMethod");
            aVar.a(0, e2.getMessage());
            e2.printStackTrace();
        }
    }
}

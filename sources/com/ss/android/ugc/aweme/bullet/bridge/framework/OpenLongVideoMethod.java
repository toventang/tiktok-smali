package com.ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.detail.i.j;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import org.json.JSONObject;

public final class OpenLongVideoMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69116b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.qrcode.view.a f69117c;

    /* renamed from: d  reason: collision with root package name */
    private String f69118d = "";

    /* renamed from: e  reason: collision with root package name */
    private final String f69119e = "open_long_video";

    /* renamed from: f  reason: collision with root package name */
    private k.a f69120f = k.a.PRIVATE;

    static {
        Covode.recordClassIndex(42624);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e, com.bytedance.ies.bullet.c.e.a
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42625);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f69120f;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69119e;
    }

    public final void k() {
        com.ss.android.ugc.aweme.qrcode.view.a aVar;
        Context e2 = e();
        if (!(e2 instanceof Activity)) {
            e2 = null;
        }
        Activity activity = (Activity) e2;
        if (activity != null && !activity.isFinishing() && (aVar = this.f69117c) != null && aVar.isShowing()) {
            try {
                com.ss.android.ugc.aweme.qrcode.view.a aVar2 = this.f69117c;
                if (aVar2 != null) {
                    aVar2.dismiss();
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f69120f = aVar;
    }

    public static final class b implements com.ss.android.ugc.aweme.detail.i.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OpenLongVideoMethod f69121a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f69122b;

        static {
            Covode.recordClassIndex(42626);
        }

        @Override // com.ss.android.ugc.aweme.detail.i.m
        public final void a(Aweme aweme) {
            l.d(aweme, "");
            this.f69121a.k();
            this.f69122b.h();
            this.f69122b.cd_();
        }

        @Override // com.ss.android.ugc.aweme.detail.i.m
        public final void b_(Exception exc) {
            l.d(exc, "");
            this.f69121a.k();
            this.f69122b.h();
            this.f69122b.cd_();
        }

        b(OpenLongVideoMethod openLongVideoMethod, j jVar) {
            this.f69121a = openLongVideoMethod;
            this.f69122b = jVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenLongVideoMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        String str = null;
        if (!jSONObject.has("aweme_id")) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            this.f69118d = jSONObject.optString("react_id");
            String optString = jSONObject.optString("aweme_id");
            jSONObject.optDouble("current_time");
            jSONObject.optString("enter_from");
            Context e2 = e();
            if (e2 != null) {
                l.b(optString, "");
                Resources resources = e2.getResources();
                if (resources != null) {
                    str = resources.getString(R.string.cyz);
                }
                com.ss.android.ugc.aweme.qrcode.view.a a2 = com.ss.android.ugc.aweme.qrcode.view.a.a(e2, str);
                this.f69117c = a2;
                if (a2 != null) {
                    a2.setIndeterminate(false);
                }
                j jVar = new j();
                jVar.a_(new b(this, jVar));
                jVar.a(new com.ss.android.ugc.aweme.detail.i.i());
                jVar.a(optString);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        aVar.a(jSONObject2);
    }
}

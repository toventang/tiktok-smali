package com.ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.detail.i.j;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class OpenLongVideoMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f144933a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.qrcode.view.a f144934b;

    /* renamed from: c  reason: collision with root package name */
    private String f144935c;

    static {
        Covode.recordClassIndex(94776);
    }

    private OpenLongVideoMethod(byte b2) {
        this();
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94777);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ OpenLongVideoMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public final void c() {
        com.ss.android.ugc.aweme.qrcode.view.a aVar;
        Activity activity = (Activity) this.mContextRef.get();
        if (activity != null && !activity.isFinishing() && (aVar = this.f144934b) != null && aVar.isShowing()) {
            try {
                com.ss.android.ugc.aweme.qrcode.view.a aVar2 = this.f144934b;
                if (aVar2 != null) {
                    aVar2.dismiss();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public OpenLongVideoMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
        this.f144935c = "";
    }

    public static final class b implements com.ss.android.ugc.aweme.detail.i.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OpenLongVideoMethod f144936a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f144937b;

        static {
            Covode.recordClassIndex(94778);
        }

        @Override // com.ss.android.ugc.aweme.detail.i.m
        public final void a(Aweme aweme) {
            l.d(aweme, "");
            this.f144936a.c();
            this.f144937b.h();
            this.f144937b.cd_();
        }

        @Override // com.ss.android.ugc.aweme.detail.i.m
        public final void b_(Exception exc) {
            l.d(exc, "");
            this.f144936a.c();
            this.f144937b.h();
            this.f144937b.cd_();
        }

        b(OpenLongVideoMethod openLongVideoMethod, j jVar) {
            this.f144936a = openLongVideoMethod;
            this.f144937b = jVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        l.d(weakReference, "");
        Context context = weakReference.get();
        if (context instanceof m) {
            ((m) context).getLifecycle().a(this);
        }
        BaseCommonJavaMethod attach = super.attach(weakReference);
        l.b(attach, "");
        return attach;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        if (jSONObject != null) {
            String str = null;
            if (jSONObject.has("aweme_id")) {
                this.f144935c = jSONObject.optString("react_id");
                String optString = jSONObject.optString("aweme_id");
                jSONObject.optDouble("current_time");
                jSONObject.optString("enter_from");
                Context actContext = getActContext();
                if (actContext != null) {
                    l.b(optString, "");
                    Resources resources = actContext.getResources();
                    if (resources != null) {
                        str = resources.getString(R.string.cyz);
                    }
                    com.ss.android.ugc.aweme.qrcode.view.a a2 = com.ss.android.ugc.aweme.qrcode.view.a.a(actContext, str);
                    this.f144934b = a2;
                    if (a2 != null) {
                        a2.setIndeterminate(false);
                    }
                    j jVar = new j();
                    jVar.a_(new b(this, jVar));
                    jVar.a(new com.ss.android.ugc.aweme.detail.i.i());
                    jVar.a(optString);
                }
            }
        }
        if (aVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            aVar.a(jSONObject2);
        }
    }
}

package com.ss.android.ugc.aweme.account.p.a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.bytedance.sdk.a.f.e;
import com.ss.android.account.c;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.login.v2.a.a.a;
import com.ss.android.ugc.aweme.account.login.v2.a.a.o;
import com.ss.android.ugc.aweme.account.login.v2.base.c;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.network.AccountRetrofitInetcept;
import com.ss.android.ugc.aweme.account.util.p;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IRegionMockService;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.Objects;
import org.json.JSONObject;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f65261a;

    /* renamed from: b  reason: collision with root package name */
    public final a f65262b;

    static {
        Covode.recordClassIndex(40133);
    }

    public b(WeakReference<Context> weakReference, a aVar) {
        l.d(weakReference, "");
        l.d(aVar, "");
        this.f65261a = weakReference;
        this.f65262b = aVar;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        c cVar;
        AuthorizeActivity authorizeActivity;
        l.d(hVar, "");
        if (hVar.f35533d != null) {
            AccountRetrofitInetcept.a("");
            com.ss.android.account.c a2 = c.a.a(hVar.f35533d);
            WeakReference<com.ss.android.ugc.aweme.account.login.v2.base.c> weakReference = o.f64187a;
            if (weakReference != null) {
                cVar = weakReference.get();
            } else {
                cVar = null;
            }
            e.a(this.f65261a.get()).a(a2);
            e.a(this.f65261a.get()).e();
            com.bytedance.sdk.a.f.d.a(this.f65261a.get()).a("wap_login", (com.bytedance.sdk.a.a.b.d) null);
            if (cVar != null) {
                j A = cVar.A();
                k V_ = cVar.V_();
                l.b(a2, "");
                com.ss.android.ugc.aweme.account.login.v2.a.a.a.a(cVar, A, V_, a2);
            } else {
                Context context = this.f65261a.get();
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                Activity activity = (Activity) context;
                JSONObject jSONObject2 = hVar.f35533d;
                l.b(a2, "");
                l.d(activity, "");
                l.d(a2, "");
                cj.a(a2);
                AccountRetrofitInetcept.a("");
                Bundle bundle = new Bundle();
                if (cj.a()) {
                    bundle.putBoolean("only_login", true);
                }
                com.ss.android.ugc.aweme.account.d.a(bundle, activity, new a.C1438a(activity, jSONObject2));
                if (p.a()) {
                    ServiceManager.get().getService(IRegionMockService.class);
                }
            }
            WeakReference<AuthorizeActivity> weakReference2 = o.f64188b;
            if (!(weakReference2 == null || (authorizeActivity = weakReference2.get()) == null)) {
                authorizeActivity.b(a2);
            }
            o.f64188b = null;
            o.f64187a = null;
        }
    }
}

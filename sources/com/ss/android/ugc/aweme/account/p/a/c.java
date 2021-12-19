package com.ss.android.ugc.aweme.account.p.a;

import android.content.Context;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.login.v2.a.a.o;
import com.ss.android.ugc.aweme.account.network.AccountRetrofitInetcept;
import h.f.b.l;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f65263a;

    /* renamed from: b  reason: collision with root package name */
    public final a f65264b;

    static {
        Covode.recordClassIndex(40134);
    }

    public c(WeakReference<Context> weakReference, a aVar) {
        l.d(weakReference, "");
        l.d(aVar, "");
        this.f65263a = weakReference;
        this.f65264b = aVar;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        com.ss.android.ugc.aweme.account.login.v2.base.c cVar;
        e activity;
        AuthorizeActivity authorizeActivity;
        WeakReference<AuthorizeActivity> weakReference = o.f64188b;
        if (!(weakReference == null || (authorizeActivity = weakReference.get()) == null)) {
            authorizeActivity.g();
        }
        AccountRetrofitInetcept.a("");
        WeakReference<com.ss.android.ugc.aweme.account.login.v2.base.c> weakReference2 = o.f64187a;
        if (!(weakReference2 == null || (cVar = weakReference2.get()) == null || (activity = cVar.getActivity()) == null)) {
            activity.finish();
        }
        o.f64187a = null;
        o.f64188b = null;
    }
}

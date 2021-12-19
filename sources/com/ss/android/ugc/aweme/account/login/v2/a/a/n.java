package com.ss.android.ugc.aweme.account.login.v2.a.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.login.v2.base.c;
import com.ss.android.ugc.aweme.account.login.v2.base.d;
import h.f.b.l;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class n extends d {

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f64186b;

    static {
        Covode.recordClassIndex(39547);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.d
    public final boolean a() {
        if (this.f64186b == null) {
            return false;
        }
        o.f64187a = new WeakReference<>(this.f64729a);
        String optString = this.f64186b.optString("webapp_url");
        if (TextUtils.isEmpty(optString)) {
            return false;
        }
        SmartRouter.buildRoute(this.f64729a.getActivity(), optString).open();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(c cVar, JSONObject jSONObject) {
        super(cVar);
        l.d(cVar, "");
        this.f64186b = jSONObject;
    }
}

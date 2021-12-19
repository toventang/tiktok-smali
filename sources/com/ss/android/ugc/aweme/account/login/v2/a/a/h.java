package com.ss.android.ugc.aweme.account.login.v2.a.a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.v2.base.c;
import com.ss.android.ugc.aweme.account.login.v2.base.d;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import h.f.b.l;
import org.json.JSONObject;

public final class h extends d {

    /* renamed from: b  reason: collision with root package name */
    final g f64164b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f64165c;

    /* renamed from: d  reason: collision with root package name */
    public final j f64166d;

    /* renamed from: e  reason: collision with root package name */
    public final k f64167e;

    static {
        Covode.recordClassIndex(39538);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.d
    public final boolean a() {
        if (!this.f64164b.f64159a) {
            return false;
        }
        c cVar = this.f64729a;
        Bundle b2 = this.f64164b.b();
        b2.putInt("current_scene", j.CHANGE_PASSWORD.getValue());
        b2.putInt("next_page", this.f64164b.a().getValue());
        cVar.a(b2);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(c cVar, JSONObject jSONObject, j jVar, k kVar) {
        super(cVar);
        l.d(cVar, "");
        l.d(jVar, "");
        l.d(kVar, "");
        this.f64165c = jSONObject;
        this.f64166d = jVar;
        this.f64167e = kVar;
        this.f64164b = new g(jSONObject);
    }
}

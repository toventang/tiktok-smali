package com.ss.android.ugc.aweme.account.login.v2.a.a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.h.a;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.c;
import com.ss.android.ugc.aweme.account.login.v2.base.d;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import h.f.b.l;
import java.io.Serializable;
import java.util.Objects;
import org.json.JSONObject;

public final class i extends d {

    /* renamed from: b  reason: collision with root package name */
    private final j f64168b;

    /* renamed from: c  reason: collision with root package name */
    private final k f64169c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f64170d;

    static {
        Covode.recordClassIndex(39539);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.d
    public final boolean a() {
        Serializable serializable;
        Bundle arguments = this.f64729a.getArguments();
        if (arguments == null || (serializable = arguments.getSerializable("phone_number")) == null) {
            return true;
        }
        c cVar = this.f64729a;
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber");
        String a2 = a.a((a.C1412a) serializable);
        l.b(a2, "");
        x.b(cVar, a2, this.f64168b, this.f64169c, "anti_spam").c();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(c cVar, j jVar, k kVar, JSONObject jSONObject) {
        super(cVar);
        l.d(cVar, "");
        l.d(jVar, "");
        l.d(kVar, "");
        this.f64168b = jVar;
        this.f64169c = kVar;
        this.f64170d = jSONObject;
    }
}

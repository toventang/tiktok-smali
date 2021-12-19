package com.bytedance.sdk.a.h.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.a.c;
import com.bytedance.sdk.a.d.a;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.h.a.o;
import com.bytedance.sdk.a.h.b.a.n;
import com.bytedance.sdk.a.i.a;
import java.util.HashMap;
import org.json.JSONObject;

public final class m extends h<d<o>> {

    /* renamed from: e  reason: collision with root package name */
    private o f43335e;

    static {
        Covode.recordClassIndex(26561);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(d<o> dVar) {
        a.a("passport_account_login", (String) null, (String) null, dVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ d<o> a(boolean z, b bVar) {
        return new d(z, 1016, this.f43335e);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43335e.u = b.a.a(jSONObject, jSONObject2);
        this.f43335e.f43284m = jSONObject;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.a.f.b.a(this.f43335e, jSONObject);
        this.f43335e.f43284m = jSONObject2;
    }

    private m(Context context, com.bytedance.sdk.a.d.a aVar, o oVar, n nVar) {
        super(context, aVar, nVar);
        this.f43335e = oVar;
    }

    public static m a(Context context, String str, String str2, String str3, String str4, String str5, n nVar) {
        o oVar = new o(str2, str3, str, null, str4, null, str5, 0);
        a.C1046a aVar = new a.C1046a();
        aVar.f43153a = c.a.a("/passport/user/login/");
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(oVar.f43309a)) {
            hashMap.put("email", com.bytedance.common.utility.m.c(oVar.f43309a));
        }
        if (!TextUtils.isEmpty(oVar.f43311c)) {
            hashMap.put("mobile", com.bytedance.common.utility.m.c(oVar.f43311c));
        }
        if (!TextUtils.isEmpty(oVar.f43310b)) {
            hashMap.put("username", com.bytedance.common.utility.m.c(oVar.f43310b));
        }
        if (!TextUtils.isEmpty(oVar.f43312d)) {
            hashMap.put("account", com.bytedance.common.utility.m.c(oVar.f43312d));
        }
        if (!TextUtils.isEmpty(oVar.f43314f)) {
            hashMap.put("token", oVar.f43314f);
        }
        if (!TextUtils.isEmpty(oVar.f43315g)) {
            hashMap.put("captcha", oVar.f43315g);
        }
        if (oVar.t > 0) {
            hashMap.put("scene", com.bytedance.common.utility.m.c(String.valueOf(oVar.t)));
        }
        hashMap.put("password", com.bytedance.common.utility.m.c(oVar.f43313e));
        hashMap.put("mix_mode", "1");
        return new m(context, aVar.a(hashMap).c(), oVar, nVar);
    }
}

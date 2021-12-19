package com.ss.android.ugc.aweme.account.login.recover.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.a.c;
import com.bytedance.sdk.a.d.a;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.h.a.o;
import com.bytedance.sdk.a.h.b.a.n;
import h.f.b.l;
import java.util.HashMap;
import org.json.JSONObject;

public final class f extends h<d<o>> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f63573f = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public final o f63574e;

    static {
        Covode.recordClassIndex(39196);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39197);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static f a(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, int i3, n nVar) {
            l.d(context, "");
            l.d(str5, "");
            l.d(str6, "");
            l.d(str7, "");
            l.d(str8, "");
            l.d(nVar, "");
            o oVar = new o(str3, str4, str2, str5, str6, str7, str8, i2);
            a.C1046a aVar = new a.C1046a();
            aVar.f43153a = c.a.a("/passport/user/login/");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(oVar.f43309a)) {
                hashMap.put("email", m.c(oVar.f43309a));
            }
            if (!TextUtils.isEmpty(oVar.f43311c)) {
                hashMap.put("mobile", m.c(oVar.f43311c));
            }
            if (!TextUtils.isEmpty(oVar.f43310b)) {
                hashMap.put("username", m.c(oVar.f43310b));
            }
            if (!TextUtils.isEmpty(oVar.f43312d)) {
                hashMap.put("account", m.c(oVar.f43312d));
            }
            if (!TextUtils.isEmpty(oVar.f43314f)) {
                hashMap.put("token", oVar.f43314f);
            }
            if (!TextUtils.isEmpty(oVar.f43315g)) {
                hashMap.put("captcha", oVar.f43315g);
            }
            if (oVar.t > 0) {
                hashMap.put("scene", m.c(String.valueOf(oVar.t)));
            }
            hashMap.put("password", m.c(oVar.f43313e));
            hashMap.put("mix_mode", "1");
            if (str != null) {
                hashMap.put("not_login_ticket", str);
            }
            hashMap.put("account_type", String.valueOf(i3));
            com.bytedance.sdk.a.d.a c2 = aVar.a(hashMap).c();
            l.b(c2, "");
            return new f(context, c2, oVar, nVar);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ void a(d<o> dVar) {
        d<o> dVar2 = dVar;
        l.d(dVar2, "");
        com.bytedance.sdk.a.i.a.a("passport_account_login", (String) null, (String) null, dVar2);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ d<o> a(boolean z, b bVar) {
        l.d(bVar, "");
        return new d(z, 1016, this.f63574e);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(jSONObject, "");
        l.d(jSONObject2, "");
        o oVar = this.f63574e;
        if (oVar != null) {
            oVar.u = b.a.a(jSONObject, jSONObject2);
        }
        o oVar2 = this.f63574e;
        if (oVar2 != null) {
            oVar2.f43284m = jSONObject;
        }
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(jSONObject, "");
        l.d(jSONObject2, "");
        com.bytedance.sdk.a.f.b.a(this.f63574e, jSONObject);
        o oVar = this.f63574e;
        if (oVar != null) {
            oVar.f43284m = jSONObject2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, com.bytedance.sdk.a.d.a aVar, o oVar, n nVar) {
        super(context, aVar, nVar);
        l.d(context, "");
        l.d(aVar, "");
        l.d(oVar, "");
        l.d(nVar, "");
        this.f63574e = oVar;
    }
}

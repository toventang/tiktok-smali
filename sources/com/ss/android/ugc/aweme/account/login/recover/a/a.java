package com.ss.android.ugc.aweme.account.login.recover.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.h;
import h.f.b.l;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a extends h<com.ss.android.ugc.aweme.account.login.recover.a.b.a> {

    /* renamed from: e  reason: collision with root package name */
    public static final C1416a f63553e = new C1416a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private com.ss.android.ugc.aweme.account.login.recover.a.b.a f63554f;

    static {
        Covode.recordClassIndex(39179);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.a$a  reason: collision with other inner class name */
    public static final class C1416a {
        static {
            Covode.recordClassIndex(39180);
        }

        private C1416a() {
        }

        public /* synthetic */ C1416a(byte b2) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(com.ss.android.ugc.aweme.account.login.recover.a.b.a aVar) {
        com.bytedance.sdk.a.i.a.a("passport_auth_available_ways", (String) null, (String) null, aVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ com.ss.android.ugc.aweme.account.login.recover.a.b.a a(boolean z, b bVar) {
        com.ss.android.ugc.aweme.account.login.recover.a.b.a aVar = this.f63554f;
        if (aVar == null) {
            aVar = new com.ss.android.ugc.aweme.account.login.recover.a.b.a(z);
        } else {
            aVar.f43071b = z;
        }
        if (!z && bVar != null) {
            aVar.f43073d = bVar.f43158b;
            aVar.f43075f = bVar.f43159c;
        }
        this.f63554f = null;
        return aVar;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        com.ss.android.ugc.aweme.account.login.recover.a.b.a aVar = new com.ss.android.ugc.aweme.account.login.recover.a.b.a(true);
        this.f63554f = aVar;
        if (jSONObject2 != null) {
            aVar.f43092j = jSONObject2.optString("email");
            aVar.f43093k = jSONObject2.optBoolean("has_email");
            aVar.f43094l = jSONObject2.optBoolean("has_mobile");
            aVar.f43095m = jSONObject2.optBoolean("has_oauth");
            aVar.n = jSONObject2.optBoolean("has_pwd");
            aVar.o = jSONObject2.optBoolean("is_most_device");
            aVar.p = jSONObject2.optString("mobile");
            aVar.r = jSONObject2.optString("token");
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject2.optJSONArray("oauth_platforms");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    arrayList.add(optJSONArray.getString(i2));
                }
            }
            aVar.q = arrayList;
            aVar.s = jSONObject2.optString("avatar_url");
            aVar.t = jSONObject2.optString("username");
            aVar.u = jSONObject2.optBoolean("is_ftc_user");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, com.bytedance.sdk.a.d.a aVar, com.ss.android.ugc.aweme.account.login.recover.a.a.a aVar2) {
        super(context, aVar, aVar2);
        l.d(context, "");
        l.d(aVar, "");
        l.d(aVar2, "");
    }
}

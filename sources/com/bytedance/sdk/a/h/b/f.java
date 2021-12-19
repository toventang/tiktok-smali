package com.bytedance.sdk.a.h.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.a.c;
import com.bytedance.sdk.a.d.a;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.h.a.g;
import com.bytedance.sdk.a.o.i;
import com.kakao.usermgmt.StringSet;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f extends h<d<g>> {

    /* renamed from: e  reason: collision with root package name */
    private g f43324e;

    static {
        Covode.recordClassIndex(26553);
    }

    private static a.C1046a a(g gVar) {
        return new a.C1046a().a(b(gVar), gVar.f43276e);
    }

    private static Map<String, String> b(g gVar) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(gVar.f43272a)) {
            hashMap.put("email", m.c(gVar.f43272a));
        }
        if (!TextUtils.isEmpty(gVar.f43273b)) {
            hashMap.put("captcha", gVar.f43273b);
        }
        hashMap.put(StringSet.type, m.c(String.valueOf(gVar.f43274c)));
        if (!TextUtils.isEmpty(gVar.f43278g)) {
            hashMap.put("password", m.c(gVar.f43278g));
        }
        if (!TextUtils.isEmpty(gVar.f43275d)) {
            hashMap.put("next", gVar.f43275d);
        }
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(d<g> dVar) {
        com.bytedance.sdk.a.i.a.a("passport_email_send_code", "email", this.f43207b.a(StringSet.type), dVar);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43324e.f43284m = jSONObject;
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ d<g> a(boolean z, b bVar) {
        return new d(z, 1024, this.f43324e);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.a.f.b.a(this.f43324e, jSONObject);
        this.f43324e.f43284m = jSONObject2;
    }

    private f(Context context, a aVar, g gVar, com.bytedance.sdk.a.h.b.a.g gVar2) {
        super(context, aVar, gVar2);
        this.f43324e = gVar;
    }

    public static f a(Context context, String str, String str2, int i2, Map map, com.bytedance.sdk.a.h.b.a.g gVar) {
        g gVar2 = new g(str, null, str2, i2, null, map, null);
        a.C1046a a2 = a(gVar2);
        a2.f43153a = i.a(c.a.a("/passport/email/send_code/"), null);
        return new f(context, a2.c(), gVar2, gVar);
    }
}

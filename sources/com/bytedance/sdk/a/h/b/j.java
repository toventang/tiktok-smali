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
import com.bytedance.sdk.a.h.a.n;
import com.bytedance.sdk.a.h.b.a.l;
import com.kakao.usermgmt.StringSet;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class j extends h<d<n>> {

    /* renamed from: e  reason: collision with root package name */
    private n f43330e;

    static {
        Covode.recordClassIndex(26557);
    }

    private static a.C1046a a(n nVar) {
        return new a.C1046a().a(b(nVar), nVar.z);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(d<n> dVar) {
        com.bytedance.sdk.a.i.a.a("passport_mobile_sendcode", "mobile", this.f43207b.a(StringSet.type), dVar);
    }

    private static Map<String, String> b(n nVar) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(nVar.f43302a)) {
            hashMap.put("mobile", m.c(nVar.f43302a));
        }
        if (!TextUtils.isEmpty(nVar.f43308g)) {
            hashMap.put("old_mobile", m.c(nVar.f43308g));
        }
        if (!TextUtils.isEmpty(nVar.f43303b)) {
            hashMap.put("captcha", nVar.f43303b);
        }
        hashMap.put(StringSet.type, m.c(String.valueOf(nVar.f43306e)));
        hashMap.put("unbind_exist", m.c(String.valueOf(nVar.f43307f)));
        hashMap.put("mix_mode", "1");
        if (nVar.A == 1) {
            hashMap.put("check_register", "1");
        } else if (nVar.A == 0) {
            hashMap.put("check_register", "0");
        }
        if (!TextUtils.isEmpty(nVar.u)) {
            hashMap.put("ticket", nVar.u);
        }
        hashMap.put("auto_read", String.valueOf(nVar.v));
        if (!TextUtils.isEmpty(nVar.w)) {
            hashMap.put("shark_ticket", nVar.w);
        }
        if (!TextUtils.isEmpty(nVar.y)) {
            hashMap.put("auth_token", nVar.y);
        }
        if (!TextUtils.isEmpty(nVar.x)) {
            hashMap.put("unusable_mobile_ticket", nVar.x);
        }
        return hashMap;
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ d<n> a(boolean z, b bVar) {
        if (z) {
            this.f43330e.f43279h = 0;
            this.f43330e.f43281j = "";
            this.f43330e.f43280i = 0;
        }
        return new d(z, 1002, this.f43330e);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43330e.t = jSONObject2.optInt("retry_time", 30);
        this.f43330e.f43284m = jSONObject;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.a.f.b.a(this.f43330e, jSONObject);
        this.f43330e.f43284m = jSONObject2;
    }

    private j(Context context, a aVar, n nVar, l lVar) {
        super(context, aVar, lVar);
        this.f43330e = nVar;
    }

    public static j a(Context context, String str, int i2, String str2, int i3, int i4, String str3, String str4, Map map, l lVar) {
        n nVar = new n(str, i2, 0, str2, i3, i4, str3, str4, map);
        a.C1046a a2 = a(nVar);
        a2.f43153a = c.a.a("/passport/mobile/send_code/v1/");
        return new j(context, a2.c(), nVar, lVar);
    }
}

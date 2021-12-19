package com.bytedance.sdk.a.h.b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.f;
import com.bytedance.sdk.a.a.c;
import com.bytedance.sdk.a.d.a;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.h.b.a.p;
import com.kakao.usermgmt.StringSet;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class o extends h<f> {

    /* renamed from: e  reason: collision with root package name */
    private a f43337e;

    static {
        Covode.recordClassIndex(26563);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(f fVar) {
        com.bytedance.sdk.a.i.a.a("passport_mobile_validate_code_v1", (String) null, (String) null, fVar);
    }

    public static Map<String, String> a(a aVar) {
        HashMap hashMap = new HashMap();
        String str = "1";
        hashMap.put("mix_mode", str);
        hashMap.put("fixed_mix_mode", str);
        hashMap.put("code", m.c(Uri.encode(aVar.f43339b)));
        hashMap.put(StringSet.type, m.c(String.valueOf(aVar.f43341d)));
        if (!aVar.f43340c) {
            str = "0";
        }
        hashMap.put("need_ticket", str);
        if (aVar.f43342e > 0) {
            hashMap.put("scene", String.valueOf(aVar.f43342e));
        }
        if (!TextUtils.isEmpty(aVar.f43343f)) {
            hashMap.put("shark_ticket", aVar.f43343f);
        }
        return hashMap;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        b.a(this.f43337e, jSONObject);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            this.f43337e.f43338a = jSONObject2.optString("ticket", "");
        }
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ f a(boolean z, com.bytedance.sdk.a.d.b bVar) {
        f fVar = new f(z);
        if (z) {
            fVar.f43086j = this.f43337e.f43338a;
        } else {
            fVar.f43073d = this.f43337e.f43438g;
            fVar.f43075f = this.f43337e.f43439h;
        }
        return fVar;
    }

    public static class a extends com.bytedance.sdk.a.m.a {

        /* renamed from: a  reason: collision with root package name */
        String f43338a;

        /* renamed from: b  reason: collision with root package name */
        public String f43339b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f43340c;

        /* renamed from: d  reason: collision with root package name */
        public int f43341d;

        /* renamed from: e  reason: collision with root package name */
        public int f43342e;

        /* renamed from: f  reason: collision with root package name */
        public String f43343f;

        static {
            Covode.recordClassIndex(26564);
        }

        public a(String str, boolean z, int i2) {
            this.f43339b = str;
            this.f43340c = false;
            this.f43341d = 23;
        }

        public a(String str, boolean z, int i2, int i3, String str2) {
            this.f43339b = str;
            this.f43340c = true;
            this.f43341d = i2;
            this.f43342e = i3;
            this.f43343f = str2;
        }
    }

    public o(Context context, com.bytedance.sdk.a.d.a aVar, a aVar2, p pVar) {
        super(context, aVar, pVar);
        this.f43337e = aVar2;
    }

    public static o a(Context context, String str, int i2, int i3, String str2, Map<String, String> map, p pVar) {
        a aVar = new a(str, true, i2, i3, str2);
        a.C1046a aVar2 = new a.C1046a();
        aVar2.f43153a = c.a.a("/passport/mobile/validate_code/v1/");
        return new o(context, aVar2.a(a(aVar), map).c(), aVar, pVar);
    }
}

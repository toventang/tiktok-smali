package com.bytedance.sdk.a.g;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.c;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.h;
import org.json.JSONObject;

public final class a extends h<com.bytedance.sdk.a.a.d.a> {

    /* renamed from: e  reason: collision with root package name */
    private String f43219e;

    /* renamed from: f  reason: collision with root package name */
    private JSONObject f43220f;

    static {
        Covode.recordClassIndex(26502);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ void a(com.bytedance.sdk.a.a.d.a aVar) {
        String str;
        com.bytedance.sdk.a.a.d.a aVar2 = aVar;
        if (!TextUtils.isEmpty(aVar2.f43072c)) {
            if (aVar2.f43072c.contains(c.a.a("/passport/mobile/check_code/"))) {
                str = "passport_mobile_check_code";
            } else {
                str = "passport_email_check_code";
            }
            com.bytedance.sdk.a.i.a.a(str, (String) null, (String) null, aVar2);
        }
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43220f = jSONObject2;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43219e = jSONObject2.optString("ticket");
        this.f43220f = jSONObject;
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ com.bytedance.sdk.a.a.d.a a(boolean z, b bVar) {
        com.bytedance.sdk.a.a.d.a aVar = new com.bytedance.sdk.a.a.d.a(z);
        if (z) {
            aVar.f43089j = this.f43219e;
        } else {
            aVar.f43073d = bVar.f43158b;
            aVar.f43075f = bVar.f43159c;
        }
        aVar.f43077h = this.f43220f;
        return aVar;
    }

    public a(Context context, com.bytedance.sdk.a.d.a aVar, com.bytedance.sdk.a.a.b.a aVar2) {
        super(context, aVar, aVar2);
    }
}

package com.ss.android.ugc.aweme.bullet.utils;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class BulletMethodAdapter$javaMethodToBullet$1 extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f69533b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f69534c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k.a f69535d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ b f69536e;

    /* renamed from: f  reason: collision with root package name */
    private final String f69537f;

    /* renamed from: g  reason: collision with root package name */
    private k.a f69538g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f69539h = true;

    static {
        Covode.recordClassIndex(42885);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final boolean aY_() {
        return this.f69539h;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f69538g;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69537f;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f69538g = aVar;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        JSONObject optJSONObject = jSONObject.optJSONObject("res");
        h a2 = a(jSONObject);
        this.f69533b.call(a2, optJSONObject);
        this.f69539h = a2.f35538i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BulletMethodAdapter$javaMethodToBullet$1(d dVar, String str, k.a aVar, b bVar, b bVar2) {
        super(bVar2);
        this.f69533b = dVar;
        this.f69534c = str;
        this.f69535d = aVar;
        this.f69536e = bVar;
        this.f69537f = str;
        this.f69538g = aVar;
    }
}

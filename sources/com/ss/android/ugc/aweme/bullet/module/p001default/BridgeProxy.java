package com.ss.android.ugc.aweme.bullet.module.p001default;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.a.ag;
import h.f.a.b;
import h.f.b.l;
import h.v;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.default.BridgeProxy  reason: invalid package */
public final class BridgeProxy extends BaseBridgeMethod implements au {

    /* renamed from: c  reason: collision with root package name */
    public static final a f69462c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final b<com.bytedance.ies.bullet.c.e.a.b, k> f69463b;

    /* renamed from: d  reason: collision with root package name */
    private String f69464d;

    /* renamed from: e  reason: collision with root package name */
    private k f69465e;

    static {
        Covode.recordClassIndex(42816);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.BridgeProxy$a */
    public static final class a {
        static {
            Covode.recordClassIndex(42817);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69464d;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e, com.bytedance.ies.bullet.c.e.a
    public final void a() {
        Class<?> cls;
        super.a();
        k kVar = this.f69465e;
        if (kVar != null) {
            kVar.a();
        }
        k kVar2 = this.f69465e;
        if (kVar2 != null && (cls = kVar2.getClass()) != null) {
            cls.getSimpleName();
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        super.a(jSONObject, aVar);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.c.c.a.k
    public final void a(JSONObject jSONObject, k.b bVar) {
        Class<?> cls;
        l.d(jSONObject, "");
        l.d(bVar, "");
        if (this.f69465e == null) {
            String str = this.f69464d;
            l.d(str, "");
            l.a((Object) this.f69464d, (Object) str);
            if (this.f69465e != null) {
                ag.a();
            } else {
                k invoke = this.f69463b.invoke(this.f32005a);
                this.f69465e = invoke;
                ag.a(v.a(str, invoke));
            }
        }
        k kVar = this.f69465e;
        if (kVar != null) {
            kVar.a(jSONObject, bVar);
        }
        k kVar2 = this.f69465e;
        if (kVar2 != null && (cls = kVar2.getClass()) != null) {
            cls.getSimpleName();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super com.bytedance.ies.bullet.c.e.a.b, ? extends com.bytedance.ies.bullet.c.c.a.k> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BridgeProxy(String str, com.bytedance.ies.bullet.c.e.a.b bVar, b<? super com.bytedance.ies.bullet.c.e.a.b, ? extends k> bVar2) {
        super(bVar);
        l.d(str, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        this.f69463b = bVar2;
        this.f69464d = str;
    }
}

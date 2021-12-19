package com.ss.android.ugc.aweme.bridge;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import f.a.d.f;
import h.f.b.l;
import org.json.JSONObject;

public final class RequestBarrageListMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private f.a.b.b f68783b;

    /* renamed from: c  reason: collision with root package name */
    private final String f68784c = "requestBarrageList";

    static {
        Covode.recordClassIndex(42361);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68784c;
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        f.a.b.b bVar;
        f.a.b.b bVar2 = this.f68783b;
        if (bVar2 != null && !bVar2.isDisposed() && (bVar = this.f68783b) != null) {
            bVar.dispose();
        }
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.b f68785a;

        static {
            Covode.recordClassIndex(42362);
        }

        a(k.b bVar) {
            this.f68785a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            a.a(this.f68785a, (JSONObject) obj);
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.b f68786a;

        static {
            Covode.recordClassIndex(42363);
        }

        b(k.b bVar) {
            this.f68786a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            a.a(this.f68786a, (Throwable) obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RequestBarrageListMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.c.c.a.k
    public final void a(JSONObject jSONObject, k.b bVar) {
        f.a.b.b bVar2;
        l.d(jSONObject, "");
        l.d(bVar, "");
        f.a.b.b bVar3 = this.f68783b;
        if (!(bVar3 == null || bVar3.isDisposed() || (bVar2 = this.f68783b) == null)) {
            bVar2.dispose();
        }
        this.f68783b = com.ss.android.ugc.aweme.util.m.a().b(f.a.h.a.b(f.a.k.a.f158006c)).a(new a(bVar), new b(bVar));
    }
}

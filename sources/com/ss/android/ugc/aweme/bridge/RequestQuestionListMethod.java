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

public final class RequestQuestionListMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private f.a.b.b f68787b;

    /* renamed from: c  reason: collision with root package name */
    private final String f68788c = "requestQuestionList";

    static {
        Covode.recordClassIndex(42364);
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
        return this.f68788c;
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        f.a.b.b bVar;
        f.a.b.b bVar2 = this.f68787b;
        if (bVar2 != null && !bVar2.isDisposed() && (bVar = this.f68787b) != null) {
            bVar.dispose();
        }
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.b f68789a;

        static {
            Covode.recordClassIndex(42365);
        }

        a(k.b bVar) {
            this.f68789a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            a.a(this.f68789a, (JSONObject) obj);
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.b f68790a;

        static {
            Covode.recordClassIndex(42366);
        }

        b(k.b bVar) {
            this.f68790a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            a.a(this.f68790a, (Throwable) obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RequestQuestionListMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.c.c.a.k
    public final void a(JSONObject jSONObject, k.b bVar) {
        f.a.b.b bVar2;
        l.d(jSONObject, "");
        l.d(bVar, "");
        int optInt = jSONObject.optInt("count");
        int optInt2 = jSONObject.optInt("offset");
        String optString = jSONObject.optString("extra");
        boolean optBoolean = jSONObject.optBoolean("need_complete_aweme_list");
        boolean optBoolean2 = jSONObject.optBoolean("use_cache");
        f.a.b.b bVar3 = this.f68787b;
        if (!(bVar3 == null || bVar3.isDisposed() || (bVar2 = this.f68787b) == null)) {
            bVar2.dispose();
        }
        this.f68787b = com.ss.android.ugc.aweme.util.k.a(optInt, optInt2, optString, optBoolean, !optBoolean2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new a(bVar), new b(bVar));
    }
}

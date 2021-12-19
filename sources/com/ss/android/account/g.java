package com.ss.android.account;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.a;
import com.bytedance.sdk.a.a.a.e;

public abstract class g extends a<e> {
    static {
        Covode.recordClassIndex(36176);
    }

    public abstract void a(e eVar);

    public abstract void a(e eVar, String str);

    public abstract void b(e eVar);

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.a.a.a
    public final /* synthetic */ void a(e eVar) {
        e eVar2 = eVar;
        if (eVar2.f43071b) {
            b(eVar2);
        } else if (!eVar2.a()) {
            a(eVar2);
        } else if (eVar2.f43085m != null) {
            a(eVar2, eVar2.f43083k);
        } else {
            a(eVar2);
        }
    }
}

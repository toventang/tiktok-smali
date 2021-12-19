package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.m;
import java.util.ArrayList;
import java.util.List;

final class o extends m<List<String>> {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r f53074c;

    static {
        Covode.recordClassIndex(32769);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    o(r rVar, m<List<String>> mVar) {
        super(rVar, mVar);
        this.f53074c = rVar;
    }

    @Override // com.google.android.play.core.assetpacks.m, com.google.android.play.core.b.cc
    public final void a(List<Bundle> list) {
        super.a(list);
        r rVar = this.f53074c;
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : list) {
            AssetPackState next = d.a(bundle, rVar.f53083c, new ArrayList(), ab.f52767a).b().values().iterator().next();
            if (next == null) {
                r.f53080a.b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (bw.a(next.b())) {
                arrayList.add(next.a());
            }
        }
        this.f53072a.a(arrayList);
    }
}

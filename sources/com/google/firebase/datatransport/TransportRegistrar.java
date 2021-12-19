package com.google.firebase.datatransport;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.cct.a;
import com.google.android.datatransport.g;
import com.google.android.datatransport.runtime.f;
import com.google.android.datatransport.runtime.k;
import com.google.android.datatransport.runtime.l;
import com.google.android.datatransport.runtime.p;
import com.google.firebase.components.b;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class TransportRegistrar implements h {
    static {
        Covode.recordClassIndex(33746);
    }

    @Override // com.google.firebase.components.h
    public List<b<?>> getComponents() {
        return Collections.singletonList(b.a(g.class).a(n.a(Context.class)).a(a.f54355a).a());
    }

    static /* synthetic */ g lambda$getComponents$0(e eVar) {
        Set singleton;
        p.a((Context) eVar.a(Context.class));
        p a2 = p.a();
        a aVar = a.f49302e;
        if (aVar instanceof f) {
            singleton = Collections.unmodifiableSet(aVar.c());
        } else {
            singleton = Collections.singleton(com.google.android.datatransport.b.a("proto"));
        }
        return new l(singleton, k.d().a(aVar.a()).a(aVar.b()).a(), a2);
    }
}

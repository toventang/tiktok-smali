package com.google.firebase.installations;

import com.bytedance.covode.number.Covode;
import com.google.firebase.c.c;
import com.google.firebase.components.b;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import com.google.firebase.f.g;
import java.util.Arrays;
import java.util.List;

public class FirebaseInstallationsRegistrar implements h {
    static {
        Covode.recordClassIndex(33830);
    }

    @Override // com.google.firebase.components.h
    public List<b<?>> getComponents() {
        return Arrays.asList(b.a(h.class).a(n.a(com.google.firebase.b.class)).a(n.a(c.class)).a(n.a(com.google.firebase.f.h.class)).a(j.f54585a).a(), g.a("fire-installations", "16.3.2"));
    }

    static /* synthetic */ h lambda$getComponents$0(e eVar) {
        return new c((com.google.firebase.b) eVar.a(com.google.firebase.b.class), (com.google.firebase.f.h) eVar.a(com.google.firebase.f.h.class), (c) eVar.a(c.class));
    }
}

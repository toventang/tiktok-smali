package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.google.firebase.b.d;
import com.google.firebase.c.c;
import com.google.firebase.components.b;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import com.google.firebase.f.g;
import java.util.Arrays;
import java.util.List;

public final class Registrar implements h {
    static {
        Covode.recordClassIndex(33764);
    }

    @Override // com.google.firebase.components.h
    public final List<b<?>> getComponents() {
        return Arrays.asList(b.a(FirebaseInstanceId.class).a(n.a(com.google.firebase.b.class)).a(n.a(d.class)).a(n.a(com.google.firebase.f.h.class)).a(n.a(c.class)).a(n.a(com.google.firebase.installations.h.class)).a(af.f54395a).a(1).a(), b.a(com.google.firebase.iid.a.a.class).a(n.a(FirebaseInstanceId.class)).a(ag.f54396a).a(), g.a("fire-iid", "20.2.3"));
    }

    /* access modifiers changed from: package-private */
    public static class a implements com.google.firebase.iid.a.a {

        /* renamed from: a  reason: collision with root package name */
        final FirebaseInstanceId f54383a;

        static {
            Covode.recordClassIndex(33765);
        }

        public a(FirebaseInstanceId firebaseInstanceId) {
            this.f54383a = firebaseInstanceId;
        }
    }

    static final /* synthetic */ com.google.firebase.iid.a.a lambda$getComponents$1$Registrar(e eVar) {
        return new a((FirebaseInstanceId) eVar.a(FirebaseInstanceId.class));
    }

    static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(e eVar) {
        return new FirebaseInstanceId((com.google.firebase.b) eVar.a(com.google.firebase.b.class), (d) eVar.a(d.class), (com.google.firebase.f.h) eVar.a(com.google.firebase.f.h.class), (c) eVar.a(c.class), (com.google.firebase.installations.h) eVar.a(com.google.firebase.installations.h.class));
    }
}

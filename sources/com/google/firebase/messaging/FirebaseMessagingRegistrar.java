package com.google.firebase.messaging;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.c;
import com.google.android.datatransport.f;
import com.google.android.datatransport.g;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Arrays;
import java.util.List;

public class FirebaseMessagingRegistrar implements h {
    static {
        Covode.recordClassIndex(33870);
    }

    static class a<T> implements f<T> {
        static {
            Covode.recordClassIndex(33871);
        }

        @Override // com.google.android.datatransport.f
        public final void a(c<T> cVar) {
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.google.firebase.components.h
    public List<com.google.firebase.components.b<?>> getComponents() {
        return Arrays.asList(com.google.firebase.components.b.a(FirebaseMessaging.class).a(n.a(com.google.firebase.b.class)).a(n.a(FirebaseInstanceId.class)).a(n.a(com.google.firebase.f.h.class)).a(n.a(com.google.firebase.c.c.class)).a(new n(g.class, 0)).a(n.a(com.google.firebase.installations.h.class)).a(i.f54614a).a(1).a(), com.google.firebase.f.g.a("fire-fcm", "20.2.3"));
    }

    static g determineFactory(g gVar) {
        if (gVar == null || !com.google.android.datatransport.cct.a.f49300c.contains(com.google.android.datatransport.b.a("json"))) {
            return new b();
        }
        return gVar;
    }

    static final /* synthetic */ FirebaseMessaging lambda$getComponents$0$FirebaseMessagingRegistrar(e eVar) {
        return new FirebaseMessaging((com.google.firebase.b) eVar.a(com.google.firebase.b.class), (FirebaseInstanceId) eVar.a(FirebaseInstanceId.class), (com.google.firebase.f.h) eVar.a(com.google.firebase.f.h.class), (com.google.firebase.c.c) eVar.a(com.google.firebase.c.c.class), (com.google.firebase.installations.h) eVar.a(com.google.firebase.installations.h.class), determineFactory((g) eVar.a(g.class)));
    }

    public static class b implements g {
        static {
            Covode.recordClassIndex(33872);
        }

        @Override // com.google.android.datatransport.g
        public final <T> f<T> a(String str, com.google.android.datatransport.b bVar, com.google.android.datatransport.e<T, byte[]> eVar) {
            return new a((byte) 0);
        }
    }
}

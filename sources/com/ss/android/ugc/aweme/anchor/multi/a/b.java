package com.ss.android.ugc.aweme.anchor.multi.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

public final class b {
    static {
        Covode.recordClassIndex(40800);
    }

    static final class a extends m implements h.f.a.b<com.ss.android.ugc.aweme.multi.c, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66407a = new a();

        static {
            Covode.recordClassIndex(40801);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(com.ss.android.ugc.aweme.multi.c cVar) {
            com.ss.android.ugc.aweme.multi.c cVar2 = cVar;
            l.d(cVar2, "");
            return cVar2.b().d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.multi.a.b$b  reason: collision with other inner class name */
    static final class C1486b extends m implements h.f.a.b<com.ss.android.ugc.aweme.multi.c, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1486b f66408a = new C1486b();

        static {
            Covode.recordClassIndex(40802);
        }

        C1486b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(com.ss.android.ugc.aweme.multi.c cVar) {
            com.ss.android.ugc.aweme.multi.c cVar2 = cVar;
            l.d(cVar2, "");
            return cVar2.b().f();
        }
    }

    static final class c extends m implements h.f.a.b<com.ss.android.ugc.aweme.multi.c, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f66409a = new c();

        static {
            Covode.recordClassIndex(40803);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(com.ss.android.ugc.aweme.multi.c cVar) {
            com.ss.android.ugc.aweme.multi.c cVar2 = cVar;
            l.d(cVar2, "");
            return cVar2.b().e();
        }
    }

    public static final d a(com.ss.android.ugc.aweme.multi.d dVar, com.ss.android.ugc.aweme.multi.c cVar, boolean z) {
        l.d(dVar, "");
        l.d(cVar, "");
        d a2 = new d().a("main_anchor_id", cVar.b().a()).a("main_anchor_name", cVar.b().c()).a("main_anchor_type", cVar.b().b()).a("multi_anchor", z ? 1 : 0).a("group_id", dVar.f110897b.getAid()).a("anchor_id", n.a(dVar.f110896a, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, a.f66407a, 30)).a("anchor_name", n.a(dVar.f110896a, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C1486b.f66408a, 30)).a("anchor_type", n.a(dVar.f110896a, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, c.f66409a, 30));
        l.b(a2, "");
        return a2;
    }

    public static final d b(com.ss.android.ugc.aweme.multi.d dVar, com.ss.android.ugc.aweme.multi.c cVar, boolean z) {
        l.d(dVar, "");
        l.d(cVar, "");
        if (n.h((List) dVar.f110896a) == null) {
            new d();
        }
        d a2 = new d().a("main_anchor_id", ((com.ss.android.ugc.aweme.multi.c) n.g((List) dVar.f110896a)).b().a()).a("main_anchor_name", ((com.ss.android.ugc.aweme.multi.c) n.g((List) dVar.f110896a)).b().c()).a("main_anchor_type", ((com.ss.android.ugc.aweme.multi.c) n.g((List) dVar.f110896a)).b().b()).a("multi_anchor", z ? 1 : 0).a("group_id", dVar.f110897b.getAid()).a("anchor_id", cVar.b().a()).a("anchor_name", cVar.b().c()).a("anchor_type", cVar.b().b());
        l.b(a2, "");
        return a2;
    }
}

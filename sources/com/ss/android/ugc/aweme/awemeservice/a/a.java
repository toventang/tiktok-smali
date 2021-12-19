package com.ss.android.ugc.aweme.awemeservice.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.c.e;
import com.ss.android.ugc.aweme.awemeservice.b.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import h.f.b.l;
import java.util.Collection;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static b<String> f67620a;

    /* renamed from: b  reason: collision with root package name */
    public static final b<String> f67621b = new C1527a();

    /* renamed from: c  reason: collision with root package name */
    public static final a f67622c = new a();

    /* renamed from: com.ss.android.ugc.aweme.awemeservice.a.a$a  reason: collision with other inner class name */
    public static final class C1527a implements b<String> {
        static {
            Covode.recordClassIndex(41637);
        }

        C1527a() {
        }

        @Override // com.ss.android.ugc.aweme.awemeservice.a.b
        public final void b() {
            a.f67620a.b();
        }

        @Override // com.ss.android.ugc.aweme.awemeservice.a.b
        public final Collection<Aweme> a() {
            Collection<Aweme> a2 = a.f67620a.a();
            l.b(a2, "");
            return a2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.aweme.awemeservice.a.b
        public final /* synthetic */ Aweme a(String str) {
            Aweme a2 = a.f67620a.a(str);
            l.b(a2, "");
            return a2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.aweme.awemeservice.a.b
        public final /* bridge */ /* synthetic */ boolean b(String str) {
            return a.f67620a.b(str);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.aweme.feed.model.Aweme] */
        @Override // com.ss.android.ugc.aweme.awemeservice.a.b
        public final /* synthetic */ void a(String str, Aweme aweme) {
            if (aweme != null) {
                Aweme clone = aweme.clone();
                l.b(clone, "");
                l.d(clone, "");
                com.ss.android.ugc.aweme.awemeservice.b.a aVar = b.f67653b;
                String aid = clone.getAid();
                l.b(aid, "");
                aVar.a(aid, clone);
            }
            a.f67620a.a(str, aweme);
        }
    }

    private a() {
    }

    static {
        b<String> cVar;
        Covode.recordClassIndex(41631);
        IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        l.b(createIMainServicebyMonsterPlugin, "");
        if (createIMainServicebyMonsterPlugin.isReplaceAwemeCache()) {
            cVar = new d();
        } else {
            cVar = new c();
        }
        f67620a = cVar;
        f.a.j.b.a(b.f67654c.a(true, new e[0])).d(AnonymousClass1.f67623a).a(AnonymousClass2.f67624a).d(AnonymousClass3.f67625a).a(f.a.h.a.b(f.a.k.a.f158006c)).a(AnonymousClass4.f67626a, AnonymousClass5.f67627a);
    }
}

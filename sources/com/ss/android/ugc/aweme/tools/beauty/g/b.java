package com.ss.android.ugc.aweme.tools.beauty.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.c;
import com.ss.android.ugc.tools.b.a.d;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f138941b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final d f138942a;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.c.a<String, Boolean> f138943c = new androidx.c.a<>();

    /* renamed from: d  reason: collision with root package name */
    private final h f138944d = i.a((h.f.a.a) new C3667b(this));

    static {
        Covode.recordClassIndex(90854);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.dependence.a.a.a<c, Void> a() {
        return (com.ss.android.ugc.aweme.dependence.a.a.a) this.f138944d.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90855);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.b$b  reason: collision with other inner class name */
    static final class C3667b extends m implements h.f.a.a<com.ss.android.ugc.aweme.dependence.a.a.a<c, Void>> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90856);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3667b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.dependence.a.a.a<c, Void> invoke() {
            com.ss.android.ugc.aweme.dependence.a.a.a aVar = new com.ss.android.ugc.aweme.dependence.a.a.a(new com.ss.android.ugc.aweme.tools.beauty.d.b(this.this$0.f138942a));
            aVar.f79549a = 0;
            aVar.f79551c = true;
            aVar.f79550b = true;
            aVar.f79552d = new com.ss.android.ugc.aweme.dependence.a.a.b.d() {
                /* class com.ss.android.ugc.aweme.tools.beauty.g.b.C3667b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(90857);
                }

                @Override // com.ss.android.ugc.aweme.dependence.a.a.b.d
                public final void a(Exception exc) {
                    l.d(exc, "");
                    com.ss.android.ugc.aweme.dependence.beauty.a.a(exc);
                }
            };
            return aVar;
        }
    }

    public b(d dVar) {
        l.d(dVar, "");
        this.f138942a = dVar;
    }

    private final synchronized void e(ComposerBeauty composerBeauty) {
        MethodCollector.i(11853);
        this.f138943c.put(composerBeauty.getEffect().getEffectId(), true);
        MethodCollector.o(11853);
    }

    private final boolean c(ComposerBeauty composerBeauty) {
        if (com.ss.android.ugc.aweme.tools.beauty.d.a(composerBeauty.getEffect().getEffectId()) < 0 || d(composerBeauty)) {
            return true;
        }
        boolean c2 = this.f138942a.c(composerBeauty.getEffect());
        if (c2) {
            e(composerBeauty);
        }
        return c2;
    }

    private final synchronized boolean d(ComposerBeauty composerBeauty) {
        boolean a2;
        MethodCollector.i(11852);
        a2 = l.a((Object) this.f138943c.get(composerBeauty.getEffect().getEffectId()), (Object) true);
        MethodCollector.o(11852);
        return a2;
    }

    public final boolean a(ComposerBeauty composerBeauty) {
        l.d(composerBeauty, "");
        if (4 == b(composerBeauty)) {
            return true;
        }
        return false;
    }

    public final int b(ComposerBeauty composerBeauty) {
        l.d(composerBeauty, "");
        if (c(composerBeauty)) {
            return 4;
        }
        if (a().b(new c(composerBeauty)) || a().c(new c(composerBeauty))) {
            return 8;
        }
        return 2;
    }

    public final void a(c cVar, com.ss.android.ugc.aweme.dependence.a.a.a.a<c, Void> aVar) {
        l.d(cVar, "");
        l.d(aVar, "");
        a().a(cVar, aVar, null);
    }
}

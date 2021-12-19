package com.ss.android.ugc.aweme.qna.vm;

import com.bytedance.assem.arch.extensions.i;
import com.bytedance.assem.arch.extensions.o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.h;

public final class QnaBannerViewModel extends AssemViewModel<f> {

    /* renamed from: j  reason: collision with root package name */
    private final i f119625j = new i(true, new a(this, null));

    /* renamed from: k  reason: collision with root package name */
    private final h f119626k = com.bytedance.assem.arch.a.c.a(this, d.f119629a);

    static {
        Covode.recordClassIndex(77716);
    }

    private final com.bytedance.assem.arch.a.a<com.ss.android.ugc.aweme.qna.d.d> g() {
        return (com.bytedance.assem.arch.a.a) this.f119626k.getValue();
    }

    static final class d extends m implements h.f.a.a<com.bytedance.assem.arch.a.a<com.ss.android.ugc.aweme.qna.d.d>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f119629a = new d();

        static {
            Covode.recordClassIndex(77722);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.a.a<com.ss.android.ugc.aweme.qna.d.d> invoke() {
            return new com.ss.android.ugc.aweme.qna.d.e();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ f f() {
        return new f();
    }

    public static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.qna.api.c> {
        final /* synthetic */ String $identify;
        final /* synthetic */ AssemViewModel $this_hierarchyData;

        static {
            Covode.recordClassIndex(77717);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AssemViewModel assemViewModel, String str) {
            super(0);
            this.$this_hierarchyData = assemViewModel;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [com.ss.android.ugc.aweme.qna.api.c, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.qna.api.c invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.$this_hierarchyData
                com.bytedance.assem.arch.core.d r0 = r0.f25687d
                if (r0 == 0) goto L_0x0018
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.$this_hierarchyData
                com.bytedance.assem.arch.core.d r2 = r0.f25687d
                if (r2 != 0) goto L_0x000f
                h.f.b.l.a()
            L_0x000f:
                java.lang.Class<com.ss.android.ugc.aweme.qna.api.c> r1 = com.ss.android.ugc.aweme.qna.api.c.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            L_0x0018:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = "HierarchyData has not inject to "
                r1.<init>(r0)
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.$this_hierarchyData
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = ", you can't get hierarchyData"
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel.a.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QnaBannerViewModel f119627a;

        static {
            Covode.recordClassIndex(77718);
        }

        b(QnaBannerViewModel qnaBannerViewModel) {
            this.f119627a = qnaBannerViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final com.ss.android.ugc.aweme.qna.api.h hVar = (com.ss.android.ugc.aweme.qna.api.h) obj;
            this.f119627a.a(new h.f.a.b<f, f>() {
                /* class com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(77719);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ f invoke(f fVar) {
                    l.d(fVar, "");
                    return f.a(new o(hVar), hVar.f119249f, hVar.f119250g, Boolean.valueOf(hVar.f119251h), hVar.f119248e);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QnaBannerViewModel f119628a;

        static {
            Covode.recordClassIndex(77720);
        }

        c(QnaBannerViewModel qnaBannerViewModel) {
            this.f119628a = qnaBannerViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final Throwable th = (Throwable) obj;
            this.f119628a.a(new h.f.a.b<f, f>() {
                /* class com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(77721);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ f invoke(f fVar) {
                    f fVar2 = fVar;
                    l.d(fVar2, "");
                    Throwable th = th;
                    l.b(th, "");
                    return f.a(fVar2, new com.bytedance.assem.arch.extensions.h(th), null, null, null, null, 30);
                }
            });
        }
    }

    public static final class e extends m implements h.f.a.b<f, f> {
        final /* synthetic */ long $questionsCount;

        static {
            Covode.recordClassIndex(77723);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(long j2) {
            super(1);
            this.$questionsCount = j2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ f invoke(f fVar) {
            f fVar2 = fVar;
            l.d(fVar2, "");
            return f.a(fVar2, null, null, Long.valueOf(this.$questionsCount), null, null, 27);
        }
    }

    public final void a(Long l2, String str) {
        l.d(str, "");
        f.a.b.b a2 = g().a().a(l2, str).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this), new c(this));
        l.b(a2, "");
        a(a2);
    }
}

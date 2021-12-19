package com.ss.android.ugc.aweme.commercialize.feed.assem;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.b.u;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.feed.bd;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class t extends q<t> {
    private final h r = i.a((h.f.a.a) e.f74159a);
    private final h s = new com.bytedance.ext_power_list.g(ab.a(FeedAdViewModel.class), this, c.INSTANCE, d.INSTANCE, b.INSTANCE);
    private final com.bytedance.assem.arch.extensions.i t = new com.bytedance.assem.arch.extensions.i(bQ_(), new a(this, "commerce_video_delegate_key"));

    public static final class b extends m implements h.f.a.b<s, s> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(45750);
        }

        public b() {
            super(1);
        }

        public final s invoke(s sVar) {
            l.c(sVar, "");
            return sVar;
        }
    }

    static {
        Covode.recordClassIndex(45748);
    }

    public final v D() {
        return (v) this.t.getValue();
    }

    public static final class c extends m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<s>> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(45751);
        }

        public c() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<s> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class d extends m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(45752);
        }

        public d() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    static final class e extends m implements h.f.a.a<com.ss.android.ugc.aweme.ad.feed.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f74159a = new e();

        static {
            Covode.recordClassIndex(45753);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ad.feed.c invoke() {
            com.ss.android.ugc.aweme.commercialize_ad_api.a.a a2 = CommercializeAdServiceImpl.a().a(17);
            if (!(a2 instanceof com.ss.android.ugc.aweme.ad.feed.c)) {
                return null;
            }
            return a2;
        }
    }

    public static final class a extends m implements h.f.a.a<v> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyData;

        static {
            Covode.recordClassIndex(45749);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyData = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.commercialize.feed.assem.v] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.commercialize.feed.assem.v invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyData
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.commercialize.feed.assem.v> r1 = com.ss.android.ugc.aweme.commercialize.feed.assem.v.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.assem.t.a.invoke():java.lang.Object");
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        l.d(view, "");
        u.a(this, new f(this));
        f.a.a(this, (FeedAdViewModel) this.s.getValue(), u.f74162a, (k) null, g.f74161a, 6);
    }

    static final class f extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ t this$0;

        static {
            Covode.recordClassIndex(45754);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(t tVar) {
            super(1);
            this.this$0 = tVar;
        }

        static final class a extends m implements h.f.a.b<com.bytedance.assem.arch.core.m, z> {
            final /* synthetic */ FrameLayout $it;

            static {
                Covode.recordClassIndex(45756);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(FrameLayout frameLayout) {
                super(1);
                this.$it = frameLayout;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.m mVar) {
                com.bytedance.assem.arch.core.m mVar2 = mVar;
                l.d(mVar2, "");
                mVar2.a(ab.a(com.ss.android.ugc.aweme.commercialize.feed.assem.popup.a.b.class));
                mVar2.f25578b = new com.ss.android.ugc.aweme.commercialize.feed.assem.popup.a.b();
                mVar2.f25582f = this.$it;
                mVar2.a(com.bytedance.assem.arch.core.h.LAZY);
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
            if (r2 != null) goto L_0x0059;
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.bytedance.assem.arch.core.Assembler r7) {
            /*
            // Method dump skipped, instructions count: 157
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.assem.t.f.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        com.ss.android.ugc.aweme.ad.feed.c cVar;
        VideoItemParams videoItemParams2 = videoItemParams;
        l.d(videoItemParams2, "");
        if (o.f74116a && (cVar = (com.ss.android.ugc.aweme.ad.feed.c) this.r.getValue()) != null && cVar.c(videoItemParams2.mAweme)) {
            u.a(this, ab.a(c.class));
        }
        if (b.f74088a && com.ss.android.ugc.aweme.commercialize.e.a.a.a(videoItemParams2.mAweme)) {
            u.a(this, ab.a(com.ss.android.ugc.aweme.commercialize.feed.assem.popup.a.b.class));
        }
    }

    static final class g extends m implements h.f.a.m<t, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f74161a = new g();

        static {
            Covode.recordClassIndex(45757);
        }

        g() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(t tVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            T t;
            t tVar2 = tVar;
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            l.d(tVar2, "");
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                boolean booleanValue = t.booleanValue();
                bd bdVar = tVar2.D().f74163a;
                if (bdVar != null) {
                    bdVar.a(booleanValue);
                }
            }
            return z.f158842a;
        }
    }
}

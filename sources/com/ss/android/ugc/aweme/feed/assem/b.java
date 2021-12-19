package com.ss.android.ugc.aweme.feed.assem;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.b.w;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.n;
import com.bytedance.assem.arch.extensions.k;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.ck;
import com.ss.android.ugc.aweme.feed.assem.addiction.VideoAntiAddictionVM;
import com.ss.android.ugc.aweme.feed.assem.b.a;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import com.ss.android.ugc.aweme.feed.experiment.u;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.utils.y;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class b extends w<b> implements com.bytedance.assem.arch.b.i<VideoItemParams> {
    public final BaseFeedPageParams r;
    public final h.f.a.a<Long> s;
    public final boolean t;
    public final Set<f> u;
    private final h.h v = new com.bytedance.ext_power_list.g(ab.a(VideoViewModel.class), this, C2224b.INSTANCE, c.INSTANCE, a.INSTANCE);

    public static final class a extends m implements h.f.a.b<ck, ck> {
        public static final a INSTANCE = new a();

        static {
            Covode.recordClassIndex(57994);
        }

        public a() {
            super(1);
        }

        public final ck invoke(ck ckVar) {
            l.c(ckVar, "");
            return ckVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f92073a;

        static {
            Covode.recordClassIndex(58029);
        }

        h(h.f.a.a aVar) {
            this.f92073a = aVar;
        }

        public final /* synthetic */ void run() {
            l.b(this.f92073a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(57993);
    }

    public final VideoViewModel D() {
        return (VideoViewModel) this.v.getValue();
    }

    @Override // com.bytedance.assem.arch.b.i
    public final void a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$b  reason: collision with other inner class name */
    public static final class C2224b extends m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<ck>> {
        public static final C2224b INSTANCE = new C2224b();

        static {
            Covode.recordClassIndex(57995);
        }

        public C2224b() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<ck> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class c extends m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(57996);
        }

        public c() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class i extends h.f.b.j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(58030);
        }

        i(b bVar) {
            super(0, bVar, b.class, "subscribeUpvotePublishEvent", "subscribeUpvotePublishEvent()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((b) this.receiver).E();
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ Assembler $assemble;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(57997);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, Assembler assembler) {
            super(0);
            this.this$0 = bVar;
            this.$assemble = assembler;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            String str;
            Assembler assembler = this.$assemble;
            if (this.this$0.t && com.ss.android.ugc.aweme.feed.experiment.w.e()) {
                if (u.f93089a) {
                    assembler.a(this.this$0, (h.f.a.b<? super n, z>) new a(this));
                }
                assembler.a(this.this$0, (h.f.a.b<? super n, z>) new C2226b(this));
                com.ss.android.ugc.aweme.feed.param.b bVar = this.this$0.r.param;
                if (bVar != null) {
                    str = bVar.getFrom();
                } else {
                    str = null;
                }
                if (!l.a((Object) "from_publish_add_video", (Object) str)) {
                    assembler.a(this.this$0, (h.f.a.b<? super n, z>) new c(this));
                }
                assembler.a(this.this$0, (h.f.a.b<? super n, z>) new C2227d(this));
                assembler.a(this.this$0, (h.f.a.b<? super n, z>) new e(this));
            }
            return z.f158842a;
        }

        static final class a extends m implements h.f.a.b<n, z> {
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(57998);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                n nVar2 = nVar;
                l.d(nVar2, "");
                nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                nVar2.f25588d = R.id.fhu;
                nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.desc.c.class));
                nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.desc.c();
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$d$b  reason: collision with other inner class name */
        static final class C2226b extends m implements h.f.a.b<n, z> {
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(57999);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2226b(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                n nVar2 = nVar;
                l.d(nVar2, "");
                nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.music.n.class));
                nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.music.n();
                nVar2.f25588d = R.id.fhx;
                return z.f158842a;
            }
        }

        static final class c extends m implements h.f.a.b<n, z> {
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(58000);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                n nVar2 = nVar;
                l.d(nVar2, "");
                nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.music.b.class));
                nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.music.b();
                nVar2.f25588d = R.id.fhw;
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$d$d  reason: collision with other inner class name */
        static final class C2227d extends m implements h.f.a.b<n, z> {
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(58001);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2227d(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                n nVar2 = nVar;
                l.d(nVar2, "");
                nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a.class));
                nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a();
                nVar2.f25588d = R.id.c4q;
                return z.f158842a;
            }
        }

        static final class e extends m implements h.f.a.b<n, z> {
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(58002);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                n nVar2 = nVar;
                l.d(nVar2, "");
                nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.progressbar.a.class));
                nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.progressbar.a();
                nVar2.f25588d = R.id.dka;
                return z.f158842a;
            }
        }
    }

    static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ Assembler $assemble;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(58021);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar, Assembler assembler) {
            super(0);
            this.this$0 = bVar;
            this.$assemble = assembler;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Assembler assembler = this.$assemble;
            k kVar = com.bytedance.assem.arch.extensions.j.f25647b;
            if (kVar != null) {
                kVar.a("AssemList", "reusedUiSlotAssem triggerAssemCreated");
            }
            if (this.this$0.t && com.ss.android.ugc.aweme.feed.experiment.w.d()) {
                if (com.ss.android.ugc.aweme.im.service.c.k.c()) {
                    assembler.a(this.this$0, (h.f.a.b<? super n, z>) f.f92072a);
                }
                assembler.a(this.this$0, (h.f.a.b<? super n, z>) new a(this));
                assembler.a(this.this$0, (h.f.a.b<? super n, z>) new C2230b(this));
                assembler.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>) new c(this));
                k kVar2 = com.bytedance.assem.arch.extensions.j.f25647b;
                if (kVar2 != null) {
                    kVar2.a("AssemList", "reusedUiSlotAssem diggAssem: " + com.bytedance.assem.arch.extensions.j.f25649d);
                }
                assembler.a(this.this$0, (h.f.a.b<? super n, z>) new d(this));
                assembler.a(this.this$0, (h.f.a.b<? super n, z>) new e(this));
            }
            return z.f158842a;
        }

        static final class a extends m implements h.f.a.b<n, z> {
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(58022);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(1);
                this.this$0 = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                n nVar2 = nVar;
                l.d(nVar2, "");
                nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                nVar2.f25588d = R.id.e11;
                nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.share.h.class));
                nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.share.h();
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$g$b  reason: collision with other inner class name */
        static final class C2230b extends m implements h.f.a.b<n, z> {
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(58023);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2230b(g gVar) {
                super(1);
                this.this$0 = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                n nVar2 = nVar;
                l.d(nVar2, "");
                nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.videocomment.b.class));
                nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.videocomment.b();
                nVar2.f25588d = R.id.a_k;
                return z.f158842a;
            }
        }

        static final class d extends m implements h.f.a.b<n, z> {
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(58026);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(g gVar) {
                super(1);
                this.this$0 = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                n nVar2 = nVar;
                l.d(nVar2, "");
                nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                nVar2.f25588d = R.id.am5;
                nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.digg.a.class));
                nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.digg.a();
                return z.f158842a;
            }
        }

        static final class e extends m implements h.f.a.b<n, z> {
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(58027);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(g gVar) {
                super(1);
                this.this$0 = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                n nVar2 = nVar;
                l.d(nVar2, "");
                nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                nVar2.f25588d = R.id.pg;
                nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.avatar.a.class));
                nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.avatar.a();
                return z.f158842a;
            }
        }

        static final class f extends m implements h.f.a.b<n, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final f f92072a = new f();

            static {
                Covode.recordClassIndex(58028);
            }

            f() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                n nVar2 = nVar;
                l.d(nVar2, "");
                nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                nVar2.f25588d = R.id.co7;
                nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.more.a.class));
                nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.more.a();
                return z.f158842a;
            }
        }

        static final class c extends m implements h.f.a.b<com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z> {
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(58024);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(g gVar) {
                super(1);
                this.this$0 = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar) {
                String str;
                String parentTagId;
                com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar2 = iVar;
                String str2 = "";
                l.d(iVar2, str2);
                String previousPage = this.this$0.this$0.r.getPreviousPage();
                if (previousPage == null) {
                    previousPage = str2;
                }
                String fromGroupId = this.this$0.this$0.r.getFromGroupId();
                if (fromGroupId == null) {
                    fromGroupId = str2;
                }
                String previousPagePosition = this.this$0.this$0.r.getPreviousPagePosition();
                if (previousPagePosition == null) {
                    previousPagePosition = str2;
                }
                com.ss.android.ugc.aweme.feed.param.b bVar = this.this$0.this$0.r.param;
                if (bVar == null || (str = bVar.getCreationId()) == null) {
                    str = str2;
                }
                String str3 = this.this$0.this$0.r.challengeId;
                if (str3 == null) {
                    str3 = str2;
                }
                com.ss.android.ugc.aweme.feed.param.b bVar2 = this.this$0.this$0.r.param;
                if (!(bVar2 == null || (parentTagId = bVar2.getParentTagId()) == null)) {
                    str2 = parentTagId;
                }
                iVar2.a(new com.ss.android.ugc.aweme.feed.assem.digg.j(previousPage, fromGroupId, previousPagePosition, str, str3, str2, new VideoDiggWidget.a(this) {
                    /* class com.ss.android.ugc.aweme.feed.assem.b.g.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f92071a;

                    static {
                        Covode.recordClassIndex(58025);
                    }

                    {
                        this.f92071a = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget.a
                    public final long a() {
                        return this.f92071a.this$0.this$0.s.invoke().longValue();
                    }
                }));
                return z.f158842a;
            }
        }
    }

    public final void E() {
        AssemViewModel<com.ss.android.ugc.aweme.upvote.publish.g> a2;
        if (com.ss.android.ugc.aweme.upvote.b.a.a()) {
            Thread currentThread = Thread.currentThread();
            Handler a3 = com.ss.android.ugc.aweme.base.utils.m.a();
            l.b(a3, "");
            Looper looper = a3.getLooper();
            l.b(looper, "");
            if (!currentThread.equals(looper.getThread())) {
                com.ss.android.ugc.aweme.base.utils.m.a(new h(new i(this)));
                return;
            }
            androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this);
            if (b2 != null && this.r.pageType == 0 && (a2 = com.ss.android.ugc.aweme.upvote.service.a.f142308a.a(b2)) != null) {
                f.a.a(this, a2, e.f92252a, (com.bytedance.assem.arch.viewModel.k) null, j.f92074a, 6);
            }
        }
    }

    static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ Assembler $assemble;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(58003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, Assembler assembler) {
            super(0);
            this.this$0 = bVar;
            this.$assemble = assembler;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            String str;
            Assembler assembler = this.$assemble;
            if (this.this$0.t && com.ss.android.ugc.aweme.feed.experiment.w.b()) {
                assembler.a(this.this$0, (h.f.a.b<? super n, z>) new a(this));
                if (TextUtils.equals(((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.this$0)).mEventType, "homepage_hot")) {
                    com.ss.android.ugc.aweme.language.d.a();
                    if (com.ss.android.ugc.aweme.feed.assem.report.b.a()) {
                        assembler.a(this.this$0, (h.f.a.b<? super n, z>) l.f92068a);
                    }
                }
                assembler.a(this.this$0, (h.f.a.b<? super n, z>) new c(this));
                assembler.a(this.this$0, (h.f.a.b<? super n, z>) new d(this));
                assembler.a(this.this$0, (h.f.a.b<? super n, z>) new C2229e(this));
                assembler.a(this.this$0, (h.f.a.b<? super n, z>) new f(this));
                if (com.ss.android.ugc.aweme.feed.experiment.w.c()) {
                    assembler.a(this.this$0, (h.f.a.b<? super n, z>) new g(this));
                    assembler.a(this.this$0, (h.f.a.b<? super n, z>) new h(this));
                    assembler.a(this.this$0, (h.f.a.b<? super n, z>) new i(this));
                    assembler.a(this.this$0, (h.f.a.b<? super n, z>) new j(this));
                    com.ss.android.ugc.aweme.feed.param.b bVar = this.this$0.r.param;
                    if (bVar != null) {
                        str = bVar.getFrom();
                    } else {
                        str = null;
                    }
                    if (!h.f.b.l.a((Object) "from_publish_add_video", (Object) str)) {
                        assembler.a(this.this$0, (h.f.a.b<? super n, z>) new C2228b(this));
                    }
                }
                b bVar2 = this.this$0;
                f.a.a(bVar2, bVar2.D(), c.f92076a, (com.bytedance.assem.arch.viewModel.k) null, k.f92067a, 6);
            }
            return z.f158842a;
        }

        static final class a extends m implements h.f.a.b<n, z> {
            final /* synthetic */ e this$0;

            static {
                Covode.recordClassIndex(58004);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(1);
                this.this$0 = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                n nVar2 = nVar;
                h.f.b.l.d(nVar2, "");
                nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                nVar2.f25588d = R.id.uw;
                nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.addiction.b.class));
                nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.addiction.b();
                nVar2.a(b.a(com.bytedance.assem.arch.core.h.LAZY));
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$e$b  reason: collision with other inner class name */
        static final class C2228b extends m implements h.f.a.b<n, z> {
            final /* synthetic */ e this$0;

            static {
                Covode.recordClassIndex(58005);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2228b(e eVar) {
                super(1);
                this.this$0 = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                n nVar2 = nVar;
                h.f.b.l.d(nVar2, "");
                nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.multitag.a.class));
                nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.multitag.a();
                nVar2.f25588d = R.id.b23;
                nVar2.a(b.a(com.bytedance.assem.arch.core.h.LAZY));
                return z.f158842a;
            }
        }

        static final class c extends m implements h.f.a.b<n, z> {
            final /* synthetic */ e this$0;

            static {
                Covode.recordClassIndex(58006);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(e eVar) {
                super(1);
                this.this$0 = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                n nVar2 = nVar;
                h.f.b.l.d(nVar2, "");
                nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.review.b.class));
                nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.review.b();
                nVar2.f25588d = R.id.uw;
                nVar2.a(b.a(com.bytedance.assem.arch.core.h.LAZY));
                return z.f158842a;
            }
        }

        static final class d extends m implements h.f.a.b<n, z> {
            final /* synthetic */ e this$0;

            static {
                Covode.recordClassIndex(58007);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(e eVar) {
                super(1);
                this.this$0 = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                n nVar2 = nVar;
                h.f.b.l.d(nVar2, "");
                nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                nVar2.f25588d = R.id.uw;
                nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.vpainfobar.a.class));
                nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.vpainfobar.a();
                nVar2.a(b.a(com.bytedance.assem.arch.core.h.LAZY));
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$e$e  reason: collision with other inner class name */
        static final class C2229e extends m implements h.f.a.b<n, z> {
            final /* synthetic */ e this$0;

            static {
                Covode.recordClassIndex(58008);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2229e(e eVar) {
                super(1);
                this.this$0 = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                n nVar2 = nVar;
                h.f.b.l.d(nVar2, "");
                nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                nVar2.f25588d = R.id.fjk;
                nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.a.class));
                nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.a();
                nVar2.a(b.a(com.bytedance.assem.arch.core.h.LAZY));
                return z.f158842a;
            }
        }

        static final class f extends m implements h.f.a.b<n, z> {
            final /* synthetic */ e this$0;

            static {
                Covode.recordClassIndex(58009);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            f(e eVar) {
                super(1);
                this.this$0 = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                n nVar2 = nVar;
                h.f.b.l.d(nVar2, "");
                nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.sharer.a.class));
                nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.sharer.a();
                nVar2.f25588d = R.id.az0;
                nVar2.a(b.a(com.bytedance.assem.arch.core.h.LAZY));
                return z.f158842a;
            }
        }

        static final class g extends m implements h.f.a.b<n, z> {
            final /* synthetic */ e this$0;

            static {
                Covode.recordClassIndex(58010);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            g(e eVar) {
                super(1);
                this.this$0 = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                n nVar2 = nVar;
                h.f.b.l.d(nVar2, "");
                nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.generalmask.a.class));
                nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.generalmask.a();
                nVar2.f25588d = R.id.fjk;
                nVar2.a(b.a(com.bytedance.assem.arch.core.h.LAZY));
                return z.f158842a;
            }
        }

        static final class h extends m implements h.f.a.b<n, z> {
            final /* synthetic */ e this$0;

            static {
                Covode.recordClassIndex(58011);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            h(e eVar) {
                super(1);
                this.this$0 = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                n nVar2 = nVar;
                h.f.b.l.d(nVar2, "");
                nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.report.c.class));
                nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.report.c();
                nVar2.f25588d = R.id.fjk;
                nVar2.a(b.a(com.bytedance.assem.arch.core.h.LAZY));
                return z.f158842a;
            }
        }

        static final class i extends m implements h.f.a.b<n, z> {
            final /* synthetic */ e this$0;

            static {
                Covode.recordClassIndex(58012);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            i(e eVar) {
                super(1);
                this.this$0 = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                n nVar2 = nVar;
                h.f.b.l.d(nVar2, "");
                nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a.class));
                nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a();
                nVar2.f25588d = R.id.fjk;
                nVar2.a(b.a(com.bytedance.assem.arch.core.h.LAZY));
                return z.f158842a;
            }
        }

        static final class j extends m implements h.f.a.b<n, z> {
            final /* synthetic */ e this$0;

            static {
                Covode.recordClassIndex(58013);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            j(e eVar) {
                super(1);
                this.this$0 = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                n nVar2 = nVar;
                h.f.b.l.d(nVar2, "");
                nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                nVar2.f25588d = R.id.fjk;
                nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.caution.a.class));
                nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.caution.a();
                nVar2.a(b.a(com.bytedance.assem.arch.core.h.LAZY));
                return z.f158842a;
            }
        }

        static final class l extends m implements h.f.a.b<n, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final l f92068a = new l();

            static {
                Covode.recordClassIndex(58015);
            }

            l() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                n nVar2 = nVar;
                h.f.b.l.d(nVar2, "");
                nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                nVar2.f25588d = R.id.dls;
                nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.report.i.class));
                nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.report.i();
                return z.f158842a;
            }
        }

        static final class k extends m implements h.f.a.m<b, com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final k f92067a = new k();

            static {
                Covode.recordClassIndex(58014);
            }

            k() {
                super(2);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(b bVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar) {
                List<AnchorCommonStruct> anchors;
                b bVar2 = bVar;
                h.f.b.l.d(bVar2, "");
                if (aVar != null && com.ss.android.ugc.aweme.feed.experiment.z.f93100a && com.ss.android.ugc.aweme.feed.experiment.w.c()) {
                    if (y.h(((VideoItemParams) com.bytedance.assem.arch.b.l.a(bVar2)).mAweme)) {
                        com.bytedance.assem.arch.b.u.a(bVar2, ab.a(com.ss.android.ugc.aweme.feed.assem.generalmask.a.class));
                    }
                    if (y.g(((VideoItemParams) com.bytedance.assem.arch.b.l.a(bVar2)).mAweme)) {
                        com.bytedance.assem.arch.b.u.a(bVar2, ab.a(com.ss.android.ugc.aweme.feed.assem.report.c.class));
                    }
                    if (y.i(((VideoItemParams) com.bytedance.assem.arch.b.l.a(bVar2)).mAweme)) {
                        com.bytedance.assem.arch.b.u.a(bVar2, ab.a(com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a.class));
                    }
                    if (com.ss.android.ugc.aweme.feed.x.g.b(((VideoItemParams) com.bytedance.assem.arch.b.l.a(bVar2)).mAweme)) {
                        com.bytedance.assem.arch.b.u.a(bVar2, ab.a(com.ss.android.ugc.aweme.feed.assem.caution.a.class));
                    }
                    Aweme aweme = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(bVar2)).mAweme;
                    if (!(aweme == null || (anchors = aweme.getAnchors()) == null || anchors.isEmpty())) {
                        com.bytedance.assem.arch.b.u.a(bVar2, ab.a(com.ss.android.ugc.aweme.feed.assem.multitag.a.class));
                    }
                }
                return z.f158842a;
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void b(VideoItemParams videoItemParams) {
        l.d(videoItemParams, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ boolean c(VideoItemParams videoItemParams) {
        l.d(videoItemParams, "");
        return true;
    }

    public static com.bytedance.assem.arch.core.h a(com.bytedance.assem.arch.core.h hVar) {
        if (hVar != com.bytedance.assem.arch.core.h.LAZY || !com.ss.android.ugc.aweme.feed.experiment.z.f93100a) {
            return com.bytedance.assem.arch.core.h.IMMEDIATE;
        }
        return com.bytedance.assem.arch.core.h.LAZY;
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        l.d(view, "");
        k kVar = com.bytedance.assem.arch.extensions.j.f25647b;
        if (kVar != null) {
            kVar.a("AssemList", "reusedUiSlotAssem onViewCreated: " + com.bytedance.assem.arch.extensions.j.f25649d);
        }
        com.bytedance.assem.arch.b.u.a(this, new f(this));
    }

    static final class f extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(58016);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            final Assembler assembler2 = assembler;
            l.d(assembler2, "");
            new g(this.this$0, assembler2).invoke();
            new d(this.this$0, assembler2).invoke();
            new e(this.this$0, assembler2).invoke();
            if (this.this$0.t && com.ss.android.ugc.aweme.feed.experiment.w.a()) {
                assembler2.a(this.this$0, (h.f.a.b<? super n, z>) AnonymousClass1.f92069a);
            }
            if (com.ss.android.ugc.aweme.upvote.b.a.a()) {
                assembler2.a(this.this$0, (h.f.a.b<? super n, z>) new h.f.a.b<n, z>(this) {
                    /* class com.ss.android.ugc.aweme.feed.assem.b.f.AnonymousClass2 */
                    final /* synthetic */ f this$0;

                    static {
                        Covode.recordClassIndex(58018);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(n nVar) {
                        n nVar2 = nVar;
                        l.d(nVar2, "");
                        assembler2.a(this.this$0.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>) new h.f.a.b<com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>(this) {
                            /* class com.ss.android.ugc.aweme.feed.assem.b.f.AnonymousClass2.AnonymousClass1 */
                            final /* synthetic */ AnonymousClass2 this$0;

                            static {
                                Covode.recordClassIndex(58019);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar) {
                                com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar2 = iVar;
                                l.d(iVar2, "");
                                com.ss.android.ugc.aweme.feed.param.b bVar = this.this$0.this$0.this$0.r.param;
                                l.b(bVar, "");
                                iVar2.a(new a(bVar.getUpvoteId()));
                                return z.f158842a;
                            }
                        });
                        nVar2.a(com.bytedance.assem.arch.core.l.ASYNC_X2C);
                        nVar2.f25588d = R.id.b6q;
                        nVar2.a(ab.a(com.ss.android.ugc.aweme.feed.assem.b.b.class));
                        nVar2.f25586b = new com.ss.android.ugc.aweme.feed.assem.b.b();
                        nVar2.a(com.bytedance.assem.arch.core.h.LAZY);
                        return z.f158842a;
                    }
                });
                this.this$0.E();
            }
            b bVar = this.this$0;
            f.a.a(bVar, bVar.D(), d.f92140a, (com.bytedance.assem.arch.viewModel.k) null, AnonymousClass3.f92070a, 6);
            Set<f> set = this.this$0.u;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    it.next().a(this.this$0.r, assembler2, this.this$0);
                }
            }
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        l.d(videoItemParams2, "");
        if (this.t && com.ss.android.ugc.aweme.feed.experiment.w.b() && com.ss.android.ugc.aweme.feed.experiment.z.f93100a) {
            if (VideoAntiAddictionVM.a.a(videoItemParams2)) {
                com.bytedance.assem.arch.b.u.a(this, ab.a(com.ss.android.ugc.aweme.feed.assem.addiction.b.class));
            }
            if (com.ss.android.ugc.aweme.feed.x.g.a(videoItemParams2.mAweme)) {
                com.bytedance.assem.arch.b.u.a(this, ab.a(com.ss.android.ugc.aweme.feed.assem.vpainfobar.a.class));
                com.bytedance.assem.arch.b.u.a(this, ab.a(com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.a.class));
            }
            l.d(videoItemParams2, "");
            Aweme aweme = videoItemParams2.mAweme;
            l.b(aweme, "");
            if (aweme.isProhibitedAndShouldTell()) {
                com.bytedance.assem.arch.b.u.a(this, ab.a(com.ss.android.ugc.aweme.feed.assem.review.b.class));
            }
            if (VideoExposeSharerInformationVM.a.a(videoItemParams2)) {
                com.bytedance.assem.arch.b.u.a(this, ab.a(com.ss.android.ugc.aweme.feed.assem.sharer.a.class));
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.List] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams, List list) {
        l.d(videoItemParams, "");
    }

    /* access modifiers changed from: package-private */
    public static final class j extends m implements h.f.a.m<b, com.bytedance.assem.arch.extensions.a<? extends p<? extends Integer, ? extends String>>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f92074a = new j();

        static {
            Covode.recordClassIndex(58031);
        }

        j() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, com.bytedance.assem.arch.extensions.a<? extends p<? extends Integer, ? extends String>> aVar) {
            b bVar2 = bVar;
            com.bytedance.assem.arch.extensions.a<? extends p<? extends Integer, ? extends String>> aVar2 = aVar;
            l.d(bVar2, "");
            if (!(aVar2 == null || aVar2.f25631b == null)) {
                com.bytedance.assem.arch.b.u.a(bVar2, ab.a(com.ss.android.ugc.aweme.feed.assem.b.b.class));
            }
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: java.util.Set<? extends com.ss.android.ugc.aweme.feed.assem.f> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(BaseFeedPageParams baseFeedPageParams, h.f.a.a<Long> aVar, boolean z, Set<? extends f> set) {
        l.d(baseFeedPageParams, "");
        l.d(aVar, "");
        this.r = baseFeedPageParams;
        this.s = aVar;
        this.t = z;
        this.u = set;
    }
}

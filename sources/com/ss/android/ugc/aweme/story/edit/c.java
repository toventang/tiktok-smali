package com.ss.android.ugc.aweme.story.edit;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.u;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.j;
import com.bytedance.o.n;
import com.ss.android.ugc.aweme.adaptation.analysis.Analysis;
import com.ss.android.ugc.aweme.adaptation.analysis.AnalysisActivityComponent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.p;
import com.ss.android.ugc.aweme.story.edit.b;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.ss.android.ugc.aweme.view.w;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.m;
import h.v;
import h.z;
import java.util.Objects;

public final class c extends w implements com.bytedance.o.a, com.ss.android.ugc.aweme.adaptation.analysis.b {

    /* renamed from: e  reason: collision with root package name */
    public static final C3612c f137515e = new C3612c((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public j f137516b;

    /* renamed from: c  reason: collision with root package name */
    public SurfaceView f137517c;

    /* renamed from: d  reason: collision with root package name */
    public StoryEditModel f137518d;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f137519i = h.i.a(m.NONE, new a(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f137520j = h.i.a((h.f.a.a) new d(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f137521k = h.i.a((h.f.a.a) new e(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f137522l = h.i.a((h.f.a.a) new f(this));

    private final com.ss.android.ugc.aweme.story.edit.b.e F() {
        return (com.ss.android.ugc.aweme.story.edit.b.e) this.f137519i.getValue();
    }

    private final e G() {
        return (e) this.f137522l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.c$c  reason: collision with other inner class name */
    public static final class C3612c {
        static {
            Covode.recordClassIndex(89958);
        }

        private C3612c() {
        }

        public /* synthetic */ C3612c(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.view.w
    public final void E() {
        F().Z();
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.story.edit.b.e> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.b.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.edit.b.e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.b.e> r1 = com.ss.android.ugc.aweme.story.edit.b.e.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.c.a.invoke():com.bytedance.als.b");
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<AnalysisActivityComponent> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(89959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnalysisActivityComponent invoke() {
            return new AnalysisActivityComponent(this.this$0.t(), this.this$0);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<e> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(89961);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            return new e(com.bytedance.scene.ktx.c.b(this.this$0));
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.analysis.b
    public final Analysis f() {
        return (Analysis) this.f137521k.getValue();
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        com.bytedance.o.f b2 = com.bytedance.als.dsl.c.b(this);
        if (b2 == null) {
            l.b();
        }
        return b2;
    }

    @Override // com.bytedance.scene.j
    public final void o() {
        com.ss.android.ugc.aweme.sticker.text.c.a(new com.ss.android.ugc.aweme.editSticker.a.f());
        super.o();
    }

    static {
        Covode.recordClassIndex(89955);
        com.ss.android.ugc.aweme.sticker.text.b.a();
        com.ss.android.ugc.aweme.sticker.text.c.a();
    }

    static final class e extends h.f.b.m implements h.f.a.a<Analysis> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(89960);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Analysis invoke() {
            Analysis analysis = new Analysis();
            analysis.setLabelName("video_edit_page");
            analysis.setExtraMap(ag.b(v.a("creation_id", c.a(this.this$0).getCreationId()), v.a("is_story_shoot", "1")));
            return analysis;
        }
    }

    @Override // com.bytedance.scene.j, com.ss.android.ugc.aweme.view.w
    public final void n_() {
        super.n_();
        p.f128027a = false;
        com.ss.android.ugc.aweme.sticker.text.b.a(new com.ss.android.ugc.aweme.sticker.view.b());
        com.ss.android.ugc.aweme.port.in.l.f115658a.b().k().a(true);
        com.ss.android.ugc.aweme.shortvideo.p.d.a(com.ss.android.ugc.aweme.shortvideo.p.c.f129554a).a("at_edit_page");
    }

    @Override // com.ss.android.ugc.aweme.view.w
    public final void a(boolean z) {
        G();
    }

    @Override // com.ss.android.ugc.aweme.view.w
    public final void b(boolean z) {
        G();
    }

    static final class i extends h.f.b.m implements h.f.a.b<n, z> {
        final /* synthetic */ VideoPublishEditModel $publishModel;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(89964);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar, VideoPublishEditModel videoPublishEditModel) {
            super(1);
            this.this$0 = cVar;
            this.$publishModel = videoPublishEditModel;
        }

        public static final class a extends com.bytedance.o.p<VEEditClipCluster> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f137527a;

            static {
                Covode.recordClassIndex(89965);
            }

            public a(i iVar) {
                this.f137527a = iVar;
            }

            @Override // com.bytedance.o.p
            public final VEEditClipCluster get(com.bytedance.o.f fVar) {
                l.d(fVar, "");
                return new VEEditClipCluster(this.f137527a.this$0);
            }
        }

        public static final class b extends com.bytedance.o.p<SurfaceView> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f137528a;

            static {
                Covode.recordClassIndex(89966);
            }

            public b(i iVar) {
                this.f137528a = iVar;
            }

            @Override // com.bytedance.o.p
            public final SurfaceView get(com.bytedance.o.f fVar) {
                l.d(fVar, "");
                SurfaceView surfaceView = this.f137528a.this$0.f137517c;
                if (surfaceView == null) {
                    l.a("surfaceView");
                }
                return surfaceView;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.edit.c$i$c  reason: collision with other inner class name */
        public static final class C3613c extends com.bytedance.o.p<j> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f137529a;

            static {
                Covode.recordClassIndex(89967);
            }

            public C3613c(i iVar) {
                this.f137529a = iVar;
            }

            @Override // com.bytedance.o.p
            public final j get(com.bytedance.o.f fVar) {
                l.d(fVar, "");
                j jVar = this.f137529a.this$0.f137516b;
                if (jVar == null) {
                    l.a("gestureService");
                }
                return jVar;
            }
        }

        public static final class d extends com.bytedance.o.p<StoryEditModel> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f137530a;

            static {
                Covode.recordClassIndex(89968);
            }

            public d(i iVar) {
                this.f137530a = iVar;
            }

            @Override // com.bytedance.o.p
            public final StoryEditModel get(com.bytedance.o.f fVar) {
                l.d(fVar, "");
                return c.a(this.f137530a.this$0);
            }
        }

        public static final class g extends com.bytedance.o.p<VideoPublishEditModel> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f137531a;

            static {
                Covode.recordClassIndex(89971);
            }

            public g(i iVar) {
                this.f137531a = iVar;
            }

            @Override // com.bytedance.o.p
            public final VideoPublishEditModel get(com.bytedance.o.f fVar) {
                l.d(fVar, "");
                return this.f137531a.$publishModel;
            }
        }

        public static final class h extends com.bytedance.o.p<com.ss.android.ugc.aweme.infoSticker.i> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f137532a;

            static {
                Covode.recordClassIndex(89972);
            }

            public h(i iVar) {
                this.f137532a = iVar;
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.infoSticker.i get(com.bytedance.o.f fVar) {
                l.d(fVar, "");
                return new com.ss.android.ugc.aweme.infoSticker.i(this.f137532a.$publishModel);
            }
        }

        public static final class e extends com.bytedance.o.p<com.ss.android.ugc.aweme.story.edit.model.c> {
            static {
                Covode.recordClassIndex(89969);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.story.edit.model.c get(com.bytedance.o.f fVar) {
                l.d(fVar, "");
                return new com.ss.android.ugc.aweme.story.edit.model.c();
            }
        }

        public static final class f extends com.bytedance.o.p<com.ss.android.ugc.aweme.filter.d.a> {
            static {
                Covode.recordClassIndex(89970);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.filter.d.a get(com.bytedance.o.f fVar) {
                l.d(fVar, "");
                return com.ss.android.ugc.aweme.story.base.e.f136896b.a();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(n nVar) {
            n nVar2 = nVar;
            l.d(nVar2, "");
            l.b(nVar2.a(VEEditClipCluster.class, (String) null, (com.bytedance.o.p) new a(this)), "");
            l.b(nVar2.a(SurfaceView.class, (String) null, (com.bytedance.o.p) new b(this)), "");
            l.b(nVar2.a(j.class, (String) null, (com.bytedance.o.p) new C3613c(this)), "");
            l.b(nVar2.a(StoryEditModel.class, (String) null, (com.bytedance.o.p) new d(this)), "");
            l.b(nVar2.a(com.ss.android.ugc.aweme.story.edit.model.c.class, (String) null, (com.bytedance.o.p) new e()), "");
            l.b(nVar2.a(com.ss.android.ugc.aweme.filter.d.a.class, (String) null, (com.bytedance.o.p) new f()), "");
            l.b(nVar2.a(VideoPublishEditModel.class, (String) null, (com.bytedance.o.p) new g(this)), "");
            l.b(nVar2.a(com.ss.android.ugc.aweme.infoSticker.i.class, (String) null, (com.bytedance.o.p) new h(this)), "");
            return z.f158842a;
        }
    }

    public static final class b extends com.bytedance.o.p<com.ss.android.ugc.aweme.story.edit.b.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f137523a;

        static {
            Covode.recordClassIndex(89957);
        }

        public b(com.bytedance.als.dsl.d dVar) {
            this.f137523a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.story.edit.b.f get(com.bytedance.o.f fVar) {
            l.d(fVar, "");
            return new com.ss.android.ugc.aweme.story.edit.b.f(fVar);
        }
    }

    static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f137524a;

        static {
            Covode.recordClassIndex(89962);
        }

        g(c cVar) {
            this.f137524a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f137524a.M();
        }
    }

    public static final class h extends com.bytedance.o.p<com.ss.android.ugc.aweme.story.edit.business.shared.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f137525a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f137526b;

        static {
            Covode.recordClassIndex(89963);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.story.edit.business.shared.b get(com.bytedance.o.f fVar) {
            l.d(fVar, "");
            return new com.ss.android.ugc.aweme.story.edit.business.shared.b(fVar, this.f137526b);
        }

        public h(com.bytedance.als.dsl.d dVar, c cVar) {
            this.f137525a = dVar;
            this.f137526b = cVar;
        }
    }

    public static final /* synthetic */ StoryEditModel a(c cVar) {
        StoryEditModel storyEditModel = cVar.f137518d;
        if (storyEditModel == null) {
            l.a("editModel");
        }
        return storyEditModel;
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        StoryEditModel storyEditModel;
        super.a(bundle);
        getLifecycle().a((AnalysisActivityComponent) this.f137520j.getValue());
        p.f128027a = true;
        com.ss.android.ugc.aweme.sticker.text.b.a(com.ss.android.ugc.aweme.story.edit.a.b.f137048a);
        com.ss.android.ugc.aweme.sticker.text.c.a(false, false, false);
        Bundle bundle2 = this.r;
        if (bundle2 == null || (storyEditModel = (StoryEditModel) bundle2.getParcelable("extra_edit_model")) == null || storyEditModel.getClips().isEmpty()) {
            com.bytedance.scene.ktx.b.b(this).F();
            return;
        }
        this.f137518d = storyEditModel;
        com.bytedance.als.dsl.g.a(this, new i(this, a.a(storyEditModel)));
        com.bytedance.als.dsl.b bVar = new com.bytedance.als.dsl.b(com.bytedance.als.dsl.c.a(this));
        com.bytedance.als.dsl.d dVar = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer = bVar.f6461a;
        alsLogicContainer.f6437d.a(com.ss.android.ugc.aweme.story.edit.b.f.class, (String) null, (com.bytedance.o.p) new b(dVar));
        alsLogicContainer.a(com.ss.android.ugc.aweme.story.edit.b.e.class, com.ss.android.ugc.aweme.story.edit.b.f.class);
        com.bytedance.als.dsl.d dVar2 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer2 = bVar.f6461a;
        alsLogicContainer2.f6437d.a(com.ss.android.ugc.aweme.story.edit.business.shared.b.class, (String) null, (com.bytedance.o.p) new h(dVar2, this));
        alsLogicContainer2.a(com.ss.android.ugc.aweme.story.edit.business.shared.a.class, com.ss.android.ugc.aweme.story.edit.business.shared.b.class);
        bVar.a();
        F().T().observe(this, new g(this));
        StoryEditModel storyEditModel2 = this.f137518d;
        if (storyEditModel2 == null) {
            l.a("editModel");
        }
        l.d(storyEditModel2, "");
        com.ss.android.ugc.aweme.story.record.j.c.a("enter_video_edit_page");
        b.a("enter_video_edit_page", storyEditModel2, new b.C3589b(storyEditModel2));
        com.ss.android.ugc.aweme.shortvideo.p.d.a(com.ss.android.ugc.aweme.shortvideo.p.c.f129554a).a("at_edit_page", false);
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.view.w
    public final void a(int i2, int i3) {
        G().a(i2, i3);
        com.ss.android.ugc.aweme.story.edit.b.e F = F();
        F.c(i2);
        F.d(i3);
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.b2s, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a2;
        View findViewById = viewGroup2.findViewById(R.id.efe);
        l.b(findViewById, "");
        this.f137517c = (SurfaceView) findViewById;
        Context context = viewGroup.getContext();
        l.b(context, "");
        this.f137516b = com.bytedance.f.a.a.a.a(context, (FrameLayout) viewGroup2.findViewById(R.id.asl));
        return viewGroup2;
    }
}

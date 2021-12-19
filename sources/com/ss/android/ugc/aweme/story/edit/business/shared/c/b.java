package com.ss.android.ugc.aweme.story.edit.business.shared.c;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.v;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.da.e;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.shortvideo.q.e;
import com.ss.android.ugc.aweme.story.edit.business.shared.c.g;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.ss.android.ugc.aweme.themechange.base.AVDmtSeekBar;
import com.ss.android.ugc.gamora.editor.music.EditMusicState;
import com.ss.android.ugc.gamora.editor.music.EditMusicViewModel;
import com.ss.android.ugc.gamora.editor.s;
import com.zhiliaoapp.musically.R;
import dmt.av.video.t;
import h.f.b.y;
import h.f.b.z;
import h.z;
import java.util.Objects;

public final class b extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a, com.ss.android.ugc.aweme.cz.a.j, com.ss.android.ugc.aweme.cz.a.k, e.b, com.ss.android.ugc.aweme.story.edit.clip.impl.b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f137252a = {new y(b.class, "editMusicControllerCallback", "getEditMusicControllerCallback()Lcom/ss/android/ugc/gamora/editor/EditMusicControllerCallback;", 0), new y(b.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0), new y(b.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new y(b.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: f  reason: collision with root package name */
    public static final f f137253f = new f((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public boolean f137254b;

    /* renamed from: c  reason: collision with root package name */
    final h.h.d f137255c = com.bytedance.o.b.a.a(getDiContainer(), s.class);

    /* renamed from: d  reason: collision with root package name */
    final h.h f137256d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f137257e;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f137258g = h.i.a((h.f.a.a) new m(this));

    /* renamed from: h  reason: collision with root package name */
    private final h.h f137259h = h.i.a((h.f.a.a) new r(this));

    /* renamed from: i  reason: collision with root package name */
    private final h.h f137260i = h.i.a((h.f.a.a) new h(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f137261j = com.bytedance.o.b.a.a(getDiContainer(), VEEditClipCluster.class);

    /* renamed from: k  reason: collision with root package name */
    private final h.h f137262k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f137263l;
    private final h.h.d t;
    private final h.h u;
    private final h.h.d v;
    private final com.bytedance.o.f w;

    static {
        Covode.recordClassIndex(89773);
    }

    private final com.ss.android.ugc.gamora.editor.f L() {
        return (com.ss.android.ugc.gamora.editor.f) this.f137260i.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.q.e C() {
        return (com.ss.android.ugc.aweme.shortvideo.q.e) this.f137258g.getValue();
    }

    public final g D() {
        return (g) this.f137259h.getValue();
    }

    /* renamed from: F */
    public final VEEditClipCluster cy_() {
        return (VEEditClipCluster) this.f137261j.a(this, f137252a[1]);
    }

    public final EditMusicViewModel G() {
        return (EditMusicViewModel) this.f137262k.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a H() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f137263l.getValue();
    }

    public final com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d I() {
        return (com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d) this.u.getValue();
    }

    public final VideoPublishEditModel J() {
        return (VideoPublishEditModel) this.v.a(this, f137252a[3]);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.q.e.b
    public final void a(boolean z, com.ss.android.ugc.aweme.shortvideo.c cVar) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.q.e.b
    public final void f() {
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class f {
        static {
            Covode.recordClassIndex(89779);
        }

        private f() {
        }

        public /* synthetic */ f(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.w;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89774);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.preview.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.ss.android.ugc.aweme.shortvideo.preview.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.c.b.a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.b$b  reason: collision with other inner class name */
    public static final class C3597b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.cutmusic.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89775);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3597b(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.cutmusic.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.cutmusic.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.cutmusic.a> r1 = com.ss.android.ugc.gamora.editor.cutmusic.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.c.b.C3597b.invoke():com.bytedance.als.b");
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89776);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d> r1 = com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.c.b.c.invoke():com.bytedance.als.b");
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.q.e> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89786);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.q.e invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.q.e(new h.f.a.a<String>(this) {
                /* class com.ss.android.ugc.aweme.story.edit.business.shared.c.b.m.AnonymousClass1 */
                final /* synthetic */ m this$0;

                static {
                    Covode.recordClassIndex(89787);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ String invoke() {
                    StoryEditClipModel d2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.d(this.this$0.this$0);
                    if (d2 != null) {
                        return d2.getAiMusicRequestTaskId();
                    }
                    return null;
                }
            });
        }
    }

    public static final class n implements com.ss.android.ugc.aweme.cz.a.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f137266a;

        static {
            Covode.recordClassIndex(89788);
        }

        @Override // com.ss.android.ugc.aweme.cz.a.g
        public final void a() {
            bl.g(this.f137266a.J());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        n(b bVar) {
            this.f137266a = bVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.q.e.b
    public final void d() {
        bl.e(J(), c_(R.string.yt));
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        C().b();
    }

    static final class r extends h.f.b.m implements h.f.a.a<g> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89793);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            Activity activity = this.this$0.f42913m;
            if (!(activity instanceof com.ss.android.ugc.tools.view.a.c)) {
                activity = null;
            }
            return new g((com.ss.android.ugc.tools.view.a.c) activity);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.q.e.b
    public final void a() {
        H().v().setValue(t.b());
        L().h();
        bl.f(J());
    }

    static final class h extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.f> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89781);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.f invoke() {
            androidx.fragment.app.e b2 = com.bytedance.scene.ktx.c.b(this.this$0);
            b bVar = this.this$0;
            return new com.ss.android.ugc.gamora.editor.f(b2, (s) bVar.f137255c.a(bVar, b.f137252a[0]), this.this$0.getDiContainer());
        }
    }

    public static final class p extends e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f137268a;

        static {
            Covode.recordClassIndex(89790);
        }

        @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
        public final void d() {
            StoryEditClipModel d2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.d(this.f137268a);
            if (d2 != null) {
                com.ss.android.ugc.aweme.story.edit.a.a(this.f137268a.J(), d2);
            }
            if (this.f137268a.f137254b) {
                this.f137268a.f137254b = false;
                ((com.ss.android.ugc.gamora.editor.cutmusic.a) this.f137268a.f137256d.getValue()).a();
                return;
            }
            this.f137268a.H().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, false, true);
        }

        @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
        public final void a() {
            MethodCollector.i(1720);
            super.a();
            if (!this.f137268a.f137257e) {
                this.f137268a.f137257e = true;
                View inflate = LayoutInflater.from(this.f137268a.t()).inflate(R.layout.b37, (ViewGroup) null);
                inflate.setOnClickListener(new a(this));
                com.ss.android.ugc.aweme.shortvideo.q.e C = this.f137268a.C();
                h.f.b.l.b(inflate, "");
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, en.a(44.0d, com.ss.android.ugc.aweme.port.in.i.f115645a), 8388613);
                if (com.ss.android.ugc.aweme.tools.c.a(this.f137268a.t())) {
                    layoutParams.leftMargin = en.a(16.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
                } else {
                    layoutParams.rightMargin = en.a(16.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
                }
                layoutParams.bottomMargin = en.a(16.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
                h.f.b.l.d(inflate, "");
                if (C.n == null || inflate.getParent() != null) {
                    MethodCollector.o(1720);
                    return;
                }
                FrameLayout frameLayout = C.n;
                if (frameLayout != null) {
                    frameLayout.addView(inflate, layoutParams);
                    MethodCollector.o(1720);
                    return;
                }
            }
            MethodCollector.o(1720);
        }

        public static final class a extends com.ss.android.ugc.aweme.views.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f137269a;

            static {
                Covode.recordClassIndex(89791);
            }

            a(p pVar) {
                this.f137269a = pVar;
            }

            @Override // com.ss.android.ugc.aweme.views.d
            public final void a(View view) {
                StoryEditClipModel d2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.d(this.f137269a.f137268a);
                if (d2 != null) {
                    com.ss.android.ugc.aweme.story.edit.a.a(this.f137269a.f137268a.J(), d2);
                }
                this.f137269a.f137268a.I().a(new com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.n(100, "click_panel"));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        p(b bVar) {
            this.f137268a = bVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.q.e.b
    public final void e() {
        androidx.lifecycle.t<Boolean> g2;
        if (bp.m(J())) {
            this.f137254b = true;
            G().b();
            com.ss.android.ugc.gamora.editor.sticker.core.a aVar = (com.ss.android.ugc.gamora.editor.sticker.core.a) this.t.a(this, f137252a[2]);
            if (aVar != null && (g2 = aVar.g()) != null) {
                g2.setValue(false);
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        if (C().f129953k) {
            aa.d dVar = C().f129948f;
            if (dVar != null) {
                dVar.b();
            }
            aa.d dVar2 = C().f129948f;
            if (dVar2 != null) {
                dVar2.g();
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final void x() {
        super.x();
        if (C().f129953k) {
            aa.d dVar = C().f129948f;
            if (dVar != null) {
                dVar.a();
            }
            aa.d dVar2 = C().f129948f;
            if (dVar2 != null) {
                dVar2.f();
            }
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<EditMusicViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(89777);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.music.EditMusicViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.music.EditMusicViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.music.EditMusicViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                com.bytedance.scene.j r5 = r0.o
                h.k.c r0 = r6.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                h.f.b.l.b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.s.a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass$inlined     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                h.f.b.l.b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_story_edit_business_shared_music_StoryEditMusicScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.c.b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a
                androidx.lifecycle.ad r1 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r6.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_story_edit_business_shared_music_StoryEditMusicScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.c.b.d.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_story_edit_business_shared_music_StoryEditMusicScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public final void K() {
        boolean z;
        D().a((int) (J().musicVolume * 100.0f));
        D().b((int) (J().voiceVolume * 100.0f));
        g D = D();
        StoryEditClipModel d2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.d(this);
        boolean z2 = true;
        if (d2 == null || com.ss.android.ugc.aweme.story.edit.model.a.e(d2)) {
            z = false;
        } else {
            z = true;
        }
        D.a(z);
        g D2 = D();
        if (cr.a().f125295a == null) {
            z2 = false;
        }
        D2.b(z2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.q.e.b
    public final void b() {
        if (!D().f137282h) {
            g D = D();
            ViewGroup viewGroup = C().q;
            if (!D.f137282h && viewGroup != null) {
                D.f137277c = viewGroup;
                View findViewById = viewGroup.findViewById(R.id.dww);
                h.f.b.l.b(findViewById, "");
                D.f137278d = (AVDmtSeekBar) findViewById;
                View findViewById2 = viewGroup.findViewById(R.id.dwx);
                h.f.b.l.b(findViewById2, "");
                D.f137279e = (AVDmtSeekBar) findViewById2;
                View findViewById3 = viewGroup.findViewById(R.id.f47);
                h.f.b.l.b(findViewById3, "");
                D.f137275a = (TextView) findViewById3;
                View findViewById4 = viewGroup.findViewById(R.id.f48);
                h.f.b.l.b(findViewById4, "");
                D.f137276b = (TextView) findViewById4;
                AVDmtSeekBar aVDmtSeekBar = D.f137278d;
                if (aVDmtSeekBar == null) {
                    h.f.b.l.a("mVoiceSeekBar");
                }
                aVDmtSeekBar.setDisplayPercent(true);
                AVDmtSeekBar aVDmtSeekBar2 = D.f137279e;
                if (aVDmtSeekBar2 == null) {
                    h.f.b.l.a("mMusicSeekBar");
                }
                aVDmtSeekBar2.setDisplayPercent(true);
                AVDmtSeekBar aVDmtSeekBar3 = D.f137278d;
                if (aVDmtSeekBar3 == null) {
                    h.f.b.l.a("mVoiceSeekBar");
                }
                aVDmtSeekBar3.setMax(200);
                AVDmtSeekBar aVDmtSeekBar4 = D.f137279e;
                if (aVDmtSeekBar4 == null) {
                    h.f.b.l.a("mMusicSeekBar");
                }
                aVDmtSeekBar4.setMax(200);
                AVDmtSeekBar aVDmtSeekBar5 = D.f137279e;
                if (aVDmtSeekBar5 == null) {
                    h.f.b.l.a("mMusicSeekBar");
                }
                aVDmtSeekBar5.setOnSeekBarChangeListener(new g.d(D));
                AVDmtSeekBar aVDmtSeekBar6 = D.f137278d;
                if (aVDmtSeekBar6 == null) {
                    h.f.b.l.a("mVoiceSeekBar");
                }
                aVDmtSeekBar6.setOnSeekBarChangeListener(new g.e(D));
                View view = D.f137277c;
                if (view != null) {
                    view.setOnClickListener(new g.f(D));
                }
                D.f137282h = true;
            }
            D().f137283i = new g(this);
        }
        K();
        bl.d(J(), c_(R.string.zj));
    }

    public static final class e implements h.h.d<Object, com.ss.android.ugc.gamora.editor.sticker.core.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.a f137264a;

        static {
            Covode.recordClassIndex(89778);
        }

        public e(com.bytedance.o.a aVar) {
            this.f137264a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.gamora.editor.sticker.core.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.h.d
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.core.a a(java.lang.Object r3, h.k.i<?> r4) {
            /*
                r2 = this;
                java.lang.String r0 = ""
                h.f.b.l.d(r3, r0)
                h.f.b.l.d(r4, r0)
                com.bytedance.o.a r0 = r2.f137264a
                com.ss.android.ugc.aweme.story.edit.business.a.b r1 = com.ss.android.ugc.aweme.story.edit.business.a.a.a(r0)
                if (r1 == 0) goto L_0x0017
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.core.a> r0 = com.ss.android.ugc.gamora.editor.sticker.core.a.class
                java.lang.Object r0 = r1.a(r0)
                return r0
            L_0x0017:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.c.b.e.a(java.lang.Object, h.k.i):java.lang.Object");
        }
    }

    public static final class g implements g.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f137265a;

        static {
            Covode.recordClassIndex(89780);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(b bVar) {
            this.f137265a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.story.edit.business.shared.c.g.b
        public final void a(float f2) {
            boolean z;
            com.ss.android.ugc.aweme.shortvideo.preview.a H = this.f137265a.H();
            VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(f2);
            h.f.b.l.b(ofVoice, "");
            H.a(ofVoice);
            this.f137265a.J().voiceVolume = f2;
            com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d I = this.f137265a.I();
            if (f2 == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            I.d(z);
        }

        @Override // com.ss.android.ugc.aweme.story.edit.business.shared.c.g.b
        public final void b(float f2) {
            if (this.f137265a.J().mMusicPath != null) {
                com.ss.android.ugc.aweme.shortvideo.preview.a H = this.f137265a.H();
                VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f2);
                h.f.b.l.b(ofMusic, "");
                H.a(ofMusic);
            }
            this.f137265a.J().musicVolume = f2;
        }
    }

    public static final class o implements com.ss.android.ugc.aweme.cz.a.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f137267a;

        static {
            Covode.recordClassIndex(89789);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        o(b bVar) {
            this.f137267a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.cz.a.l
        public final void a(boolean z) {
            String str;
            VideoPublishEditModel J = this.f137267a.J();
            if (z) {
                str = "recommend";
            } else {
                str = "favorite";
            }
            bl.f(J, str);
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class q extends h.f.b.m implements h.f.a.b<EditMusicState, z> {
        final /* synthetic */ z.a $needMob;

        static {
            Covode.recordClassIndex(89792);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(z.a aVar) {
            super(1);
            this.$needMob = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            h.f.b.l.d(editMusicState2, "");
            this.$needMob.element = editMusicState2.getNeedMob();
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.cz.a.k
    public final void a(int i2) {
        String str;
        String str2;
        com.ss.android.ugc.aweme.shortvideo.c a2 = C().a(i2);
        VideoPublishEditModel J = J();
        if (a2 == null || (str = a2.getMusicId()) == null) {
            str = "";
        }
        C();
        int a3 = com.ss.android.ugc.aweme.shortvideo.q.e.a();
        if (C().e() == 0) {
            str2 = "recommend";
        } else {
            str2 = "favorite";
        }
        bl.a(J, str, a3, str2, i2);
    }

    public b(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.w = fVar;
        h.k.c a2 = h.f.b.ab.a(EditMusicViewModel.class);
        this.f137262k = h.i.a((h.f.a.a) new d(this, a2, a2));
        this.f137263l = h.i.a(h.m.NONE, new a(this));
        this.f137256d = h.i.a(h.m.NONE, new C3597b(this));
        this.t = new e(this);
        this.u = h.i.a(h.m.NONE, new c(this));
        this.v = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        C().r = this;
        C().s = this;
        C().f129952j = this;
        C().f129947e = new n(this);
        C().f129950h = new o(this);
        C().a(new p(this));
        selectNonNullSubscribe(G(), c.f137270a, new ah(), new i(this));
        b.a.b(this, G(), d.f137271a, new j(this));
        selectNonNullSubscribe(G(), e.f137272a, new ah(), new k(this));
        selectNonNullSubscribe(G(), f.f137273a, new ah(), new l(this));
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Integer, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89783);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, Integer num) {
            num.intValue();
            h.f.b.l.d(bVar, "");
            this.this$0.C();
            return h.z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            this.this$0.C().f129951i = booleanValue;
            aa.d dVar = this.this$0.C().f129948f;
            if (dVar != null) {
                dVar.a(booleanValue);
            }
            return h.z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.p, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89784);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.p pVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar, "");
            this.this$0.G().a(bp.m(this.this$0.J()));
            this.this$0.K();
            this.this$0.C().a(1, true);
            aa.d dVar = this.this$0.C().f129948f;
            if (dVar != null) {
                dVar.k();
            }
            return h.z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.l, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89785);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.l lVar) {
            com.bytedance.jedi.arch.l lVar2 = lVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(lVar2, "");
            Float f2 = (Float) lVar2.a();
            if (f2 != null) {
                this.this$0.J().voiceVolume = f2.floatValue();
                this.this$0.D().b((int) (this.this$0.J().voiceVolume * 100.0f));
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        com.ss.android.ugc.aweme.shortvideo.q.e C = C();
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        C.a((androidx.appcompat.app.d) activity);
        com.ss.android.ugc.aweme.shortvideo.q.e C2 = C();
        Activity activity2 = this.f42913m;
        if (!(activity2 instanceof com.ss.android.ugc.tools.view.a.c)) {
            activity2 = null;
        }
        C2.f129945c = (com.ss.android.ugc.tools.view.a.c) activity2;
        com.ss.android.ugc.aweme.shortvideo.q.e C3 = C();
        View a2 = com.a.a(layoutInflater, R.layout.at4, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.widget.FrameLayout");
        C3.f129944b = (FrameLayout) a2;
        FrameLayout frameLayout = C().f129944b;
        if (frameLayout == null) {
            h.f.b.l.b();
        }
        return frameLayout;
    }

    @Override // com.ss.android.ugc.aweme.cz.a.j
    public final void a(View view, int i2) {
        String str;
        String str2;
        h.f.b.l.d(view, "");
        com.ss.android.ugc.aweme.shortvideo.c a2 = C().a(i2);
        VideoPublishEditModel J = J();
        if (a2 == null || (str = a2.getMusicId()) == null) {
            str = "";
        }
        h.f.b.l.b(str, "");
        int i3 = i2 + 1;
        C();
        int a3 = com.ss.android.ugc.aweme.shortvideo.q.e.a();
        if (C().e() == 0) {
            str2 = "recommend";
        } else {
            str2 = "favorite";
        }
        bl.a(J, str, i3, a3, str2, false);
        J().mMusicShowRank = i3;
        VideoPublishEditModel J2 = J();
        C();
        J2.mMusicRecType = com.ss.android.ugc.aweme.shortvideo.q.e.a();
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.q.e.b
    public final void a(String str, com.ss.android.ugc.aweme.shortvideo.c cVar, boolean z) {
        if (this.f42913m != null) {
            Activity activity = this.f42913m;
            if (activity == null || !activity.isFinishing()) {
                L().a(str, cVar, z);
            }
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}

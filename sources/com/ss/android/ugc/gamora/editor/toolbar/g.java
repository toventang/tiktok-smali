package com.ss.android.ugc.gamora.editor.toolbar;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ab;
import androidx.lifecycle.ad;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
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
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.experiment.ce;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.be;
import com.ss.android.ugc.aweme.property.aa;
import com.ss.android.ugc.aweme.property.av;
import com.ss.android.ugc.aweme.property.cm;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.setting.cj;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.edit.k;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.gr;
import com.ss.android.ugc.gamora.editor.ac;
import com.ss.android.ugc.gamora.editor.toolbar.t;
import com.zhiliaoapp.musically.R;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

public class g extends com.bytedance.scene.group.b implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f147099b = {new h.f.b.y(g.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new h.f.b.y(g.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0), new h.f.b.y(g.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0), new h.f.b.y(g.class, "editPreviewProgressApi", "getEditPreviewProgressApi()Lcom/ss/android/ugc/gamora/editor/progressbar/EditPreviewProgressApi;", 0)};
    public static final d w = new d((byte) 0);
    private final h.h.d A = new c(this, this);
    private final h.h B = h.i.a(h.m.NONE, new a(this));
    private final h.h.d C = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.editor.progressbar.a.class);
    private View D;
    private final h.h E = h.i.a((h.f.a.a) e.f147112a);
    private final boolean F = av.a();
    private final com.bytedance.o.f G;

    /* renamed from: c  reason: collision with root package name */
    public ConstraintLayout f147100c;

    /* renamed from: d  reason: collision with root package name */
    protected ImageView f147101d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f147102e;

    /* renamed from: f  reason: collision with root package name */
    public ViewGroup f147103f;

    /* renamed from: g  reason: collision with root package name */
    public final Map<Integer, View> f147104g = new LinkedHashMap();

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.edit.m f147105h;

    /* renamed from: i  reason: collision with root package name */
    final h.h.d f147106i = com.bytedance.o.b.a.a(getDiContainer(), ac.class);

    /* renamed from: j  reason: collision with root package name */
    public View f147107j;

    /* renamed from: k  reason: collision with root package name */
    public ImageView f147108k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f147109l;
    public View t;
    public Animator u;
    public View v;
    private final h.h x;
    private final h.h.d y = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
    private t z;

    static {
        Covode.recordClassIndex(96892);
    }

    private final com.ss.android.ugc.gamora.editor.music.a Q() {
        return (com.ss.android.ugc.gamora.editor.music.a) this.A.a(this, f147099b[1]);
    }

    /* access modifiers changed from: protected */
    public final EditToolbarViewModel F() {
        return (EditToolbarViewModel) this.x.getValue();
    }

    /* access modifiers changed from: protected */
    public final VideoPublishEditModel G() {
        return (VideoPublishEditModel) this.y.a(this, f147099b[0]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a I() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.B.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.progressbar.a J() {
        return (com.ss.android.ugc.gamora.editor.progressbar.a) this.C.a(this, f147099b[3]);
    }

    public final boolean K() {
        return ((Boolean) this.E.getValue()).booleanValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class d {
        static {
            Covode.recordClassIndex(96896);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public com.bytedance.o.f getDiContainer() {
        return this.G;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    public final boolean M() {
        return G().isStickPointMode;
    }

    @Override // com.bytedance.jedi.arch.v
    public androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96893);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.toolbar.g.a.invoke():com.bytedance.als.b");
        }
    }

    static final class f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f147113a;

        static {
            Covode.recordClassIndex(96898);
        }

        f(String str) {
            this.f147113a = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return MusicService.m().a(this.f147113a);
        }
    }

    /* access modifiers changed from: protected */
    public final ImageView H() {
        ImageView imageView = this.f147101d;
        if (imageView == null) {
            h.f.b.l.a("mBackImageView");
        }
        return imageView;
    }

    static final class e extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f147112a = new e();

        static {
            Covode.recordClassIndex(96897);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(AVExternalServiceImpl.a().configService().avsettingsConfig().enableNewMusicMarquee());
        }
    }

    private final boolean R() {
        if (!G().isPhotoMvMode || G().getOriginal() != 1) {
            return false;
        }
        return true;
    }

    public final boolean L() {
        if (G().isStickPointMode || G().isTemplateMv()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        Animator animator = this.u;
        if (animator != null) {
            animator.cancel();
        }
        t tVar = this.z;
        if (tVar != null) {
            tVar.a();
        }
    }

    public final int P() {
        if (this.F) {
            if (G().isAudioEnhance) {
                return 2131232664;
            }
            return 2131232662;
        } else if (G().isAudioEnhance) {
            return 2131232663;
        } else {
            return 2131232661;
        }
    }

    static final class v extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, List<? extends com.ss.android.ugc.gamora.editor.y>, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(96914);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        public static final class a implements com.ss.android.ugc.aweme.shortvideo.edit.l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v f147120a;

            static {
                Covode.recordClassIndex(96915);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.edit.l
            public final void a() {
                com.ss.android.ugc.aweme.common.r.a("click_more_icon", new com.ss.android.ugc.tools.f.b().a("creation_id", this.f147120a.this$0.G().creationId).a("enter_from", "video_edit_page").a("shoot_way", this.f147120a.this$0.G().mShootWay).a("content_type", bl.a(this.f147120a.this$0.G())).a("content_source", bl.b(this.f147120a.this$0.G())).a("is_multi_content", bl.k(this.f147120a.this$0.G())).f149193a);
            }

            a(v vVar) {
                this.f147120a = vVar;
            }
        }

        public static final class b extends com.ss.android.ugc.aweme.views.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ View f147121a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.gamora.editor.y f147122b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ v f147123c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List f147124d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Map f147125e;

            static {
                Covode.recordClassIndex(96916);
            }

            @Override // com.ss.android.ugc.aweme.views.d
            public final void a(View view) {
                if (((com.ss.android.ugc.aweme.shortvideo.edit.k) this.f147121a).b()) {
                    this.f147123c.this$0.F().f146976b = true;
                    ((com.ss.android.ugc.aweme.shortvideo.edit.k) this.f147121a).a();
                } else {
                    this.f147123c.this$0.F().f146976b = false;
                }
                this.f147123c.this$0.F().a(this.f147122b.f147356a);
            }

            b(View view, com.ss.android.ugc.gamora.editor.y yVar, v vVar, List list, Map map) {
                this.f147121a = view;
                this.f147122b = yVar;
                this.f147123c = vVar;
                this.f147124d = list;
                this.f147125e = map;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, List<? extends com.ss.android.ugc.gamora.editor.y> list) {
            MethodCollector.i(3578);
            List<? extends com.ss.android.ugc.gamora.editor.y> list2 = list;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(list2, "");
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t : list2) {
                Activity activity = this.this$0.f42913m;
                if (activity == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(activity, "");
                com.ss.android.ugc.aweme.shortvideo.edit.k a2 = k.a.a(activity, t.f147358c, t.f147357b);
                arrayList.add(a2);
                linkedHashMap.put(Integer.valueOf(t.f147356a), a2);
                a2.setOnClickListener(new b(a2, t, this, arrayList, linkedHashMap));
            }
            this.this$0.f147104g.clear();
            this.this$0.f147104g.putAll(linkedHashMap);
            g.g(this.this$0).removeAllViews();
            com.ss.android.ugc.aweme.shortvideo.edit.m mVar = this.this$0.f147105h;
            if (mVar != null) {
                mVar.c();
            }
            g gVar = this.this$0;
            ViewGroup g2 = g.g(this.this$0);
            Activity activity2 = this.this$0.f42913m;
            if (activity2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity2, "");
            com.ss.android.ugc.aweme.shortvideo.edit.m mVar2 = new com.ss.android.ugc.aweme.shortvideo.edit.m(g2, arrayList, activity2);
            mVar2.a();
            mVar2.f127807a = new a(this);
            gVar.f147105h = mVar2;
            this.this$0.N();
            z zVar = z.f158842a;
            MethodCollector.o(3578);
            return zVar;
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<EditToolbarViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(96894);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_toolbar_EditTitlebarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_toolbar_EditTitlebarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.toolbar.g.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static androidx.lifecycle.ac com_ss_android_ugc_gamora_editor_toolbar_EditTitlebarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            androidx.lifecycle.ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    private final void S() {
        Drawable a2;
        if (G().isAutoEnhanceEnable(com.ss.android.ugc.aweme.shortvideo.edit.b.a.a())) {
            EditToolbarViewModel F2 = F();
            if (G().autoEnhanceOn) {
                Activity activity = this.f42913m;
                if (activity == null) {
                    h.f.b.l.b();
                }
                a2 = androidx.core.content.b.a(activity, x.a().a(1));
                if (a2 == null) {
                    h.f.b.l.b();
                }
            } else {
                Activity activity2 = this.f42913m;
                if (activity2 == null) {
                    h.f.b.l.b();
                }
                a2 = androidx.core.content.b.a(activity2, x.a().a(2));
                if (a2 == null) {
                    h.f.b.l.b();
                }
            }
            h.f.b.l.b(a2, "");
            F2.a(new a(a2, G().autoEnhanceOn, com.ss.android.ugc.aweme.shortvideo.edit.b.d.b()));
        }
    }

    private final void T() {
        if (!bp.f(G())) {
            com.ss.android.ugc.aweme.shortvideo.edit.w.a("voice", -1);
        } else {
            com.ss.android.ugc.aweme.shortvideo.edit.w.a("voice", com.ss.android.ugc.aweme.shortvideo.edit.w.f128056g);
        }
        if (G().canvasVideoData != null) {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            h.f.b.l.b(createIAVServiceProxybyMonsterPlugin, "");
            if (createIAVServiceProxybyMonsterPlugin.getStoryService().e()) {
                if (com.ss.android.ugc.aweme.canvas.ad.f69671a) {
                    com.ss.android.ugc.aweme.shortvideo.edit.w.a("canvas_gesture", com.ss.android.ugc.aweme.shortvideo.edit.w.f128057h);
                }
            } else if (com.ss.android.ugc.aweme.canvas.q.f69745a) {
                com.ss.android.ugc.aweme.shortvideo.edit.w.a("canvas_gesture", com.ss.android.ugc.aweme.shortvideo.edit.w.f128057h);
            }
        }
        if (es.n(G()) && bp.a(G())) {
            com.ss.android.ugc.aweme.shortvideo.edit.w.a("cut_optimized", com.ss.android.ugc.aweme.shortvideo.edit.w.f128058i);
        }
    }

    public final void N() {
        t tVar = this.z;
        if (tVar != null) {
            tVar.a();
        }
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        VideoPublishEditModel G2 = G();
        EditToolbarViewModel F2 = F();
        com.bytedance.scene.j jVar = this.o;
        Objects.requireNonNull(jVar, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        t tVar2 = new t((androidx.fragment.app.e) activity, G2, F2, (com.bytedance.scene.group.b) jVar, Q());
        tVar2.a(this.f147104g);
        tVar2.b(this.f147104g);
        tVar2.c(this.f147104g);
        tVar2.a(this.f147104g, 80);
        View view = this.f147104g.get(1);
        if (view != null) {
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
            tVar2.a(this, (com.ss.android.ugc.aweme.shortvideo.edit.k) view);
        }
        View view2 = this.f147104g.get(9);
        if (view2 != null) {
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
            com.ss.android.ugc.aweme.shortvideo.edit.k kVar = (com.ss.android.ugc.aweme.shortvideo.edit.k) view2;
            h.f.b.l.d(this, "");
            h.f.b.l.d(kVar, "");
            selectNonNullSubscribe(tVar2.f147145e, u.f147164a, new ah(), new t.b(tVar2, kVar));
        }
        this.z = tVar2;
    }

    public List<com.ss.android.ugc.gamora.editor.y> E() {
        Serializable serializable;
        int i2;
        boolean z2;
        com.ss.android.ugc.aweme.shortvideo.c cVar;
        int i3;
        int i4;
        int i5;
        ArrayList<String> arrayList;
        Intent intent;
        ArrayList arrayList2 = new ArrayList();
        Activity activity = this.f42913m;
        com.ss.android.ugc.aweme.mvtheme.d dVar = null;
        if (activity == null || (intent = activity.getIntent()) == null) {
            serializable = null;
        } else {
            serializable = intent.getSerializableExtra("key_mv_theme_data");
        }
        if (serializable instanceof com.ss.android.ugc.aweme.mvtheme.d) {
            dVar = serializable;
        }
        com.ss.android.ugc.aweme.mvtheme.d dVar2 = dVar;
        if (dVar2 == null || (arrayList = dVar2.selectMediaList) == null) {
            i2 = 0;
        } else {
            i2 = arrayList.size();
        }
        if (i2 > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i6 = 2131232582;
        int i7 = 2131232558;
        if (!"slideshow".equals(es.c(G())) || !z2) {
            if (cm.a() == 3 && !com.ss.android.ugc.gamora.editor.lightening.a.a()) {
                a(arrayList2);
            }
            if (cm.c() && !com.ss.android.ugc.gamora.editor.lightening.a.a()) {
                if (!this.F) {
                    i6 = 2131232581;
                }
                arrayList2.add(new com.ss.android.ugc.gamora.editor.y(4, i6, R.string.g6x));
            }
            if (!this.F) {
                i7 = 2131232557;
            }
            arrayList2.add(new com.ss.android.ugc.gamora.editor.y(5, i7, R.string.bww));
            int i8 = 2131232204;
            if (es.n(G())) {
                if (!this.F) {
                    i8 = 2131232203;
                }
                arrayList2.add(new com.ss.android.ugc.gamora.editor.y(15, i8, R.string.bjp));
            } else if (bp.d(G())) {
                if (!this.F) {
                    i8 = 2131232203;
                }
                arrayList2.add(new com.ss.android.ugc.gamora.editor.y(13, i8, R.string.bjp));
            }
            if (cm.a() == 2 && !com.ss.android.ugc.gamora.editor.lightening.a.a()) {
                a(arrayList2);
            }
            if (bp.f(G())) {
                if (this.F) {
                    i5 = 2131232596;
                } else {
                    i5 = 2131232595;
                }
                arrayList2.add(new com.ss.android.ugc.gamora.editor.y(6, i5, R.string.zf));
            }
            if (bp.i(G())) {
                if (this.F) {
                    i4 = 2131232570;
                } else {
                    i4 = 2131232569;
                }
                arrayList2.add(new com.ss.android.ugc.gamora.editor.y(10, i4, R.string.axl));
            }
            if (cm.a() == 0 || com.ss.android.ugc.gamora.editor.lightening.a.a()) {
                a(arrayList2);
            }
            int i9 = 2131232598;
            if (!bp.l(G())) {
                if (!G().isDuet() && !G().isReaction() && !bp.b(G())) {
                    if (this.F) {
                        i3 = 2131232552;
                    } else {
                        i3 = 2131232551;
                    }
                    arrayList2.add(new com.ss.android.ugc.gamora.editor.y(8, i3, R.string.b45));
                }
                if (!this.F) {
                    i9 = 2131232597;
                }
                arrayList2.add(new com.ss.android.ugc.gamora.editor.y(7, i9, R.string.g2a));
            } else if (G().isReaction() || G().isDuet() || bp.b(G())) {
                if (!this.F) {
                    i9 = 2131232597;
                }
                arrayList2.add(new com.ss.android.ugc.gamora.editor.y(7, i9, R.string.g2a));
            }
            if (G().isAutoEnhanceEnable(com.ss.android.ugc.aweme.shortvideo.edit.b.a.a())) {
                arrayList2.add(new com.ss.android.ugc.gamora.editor.y(9, x.a().a(1), R.string.bjh));
            }
            if ((aa.a() || com.bytedance.ies.abmock.b.a().a(true, "studio_audio_enhance_type_android", 0) == 1) && ((cVar = cr.a().f125295a) == null || !cVar.isPgc())) {
                arrayList2.add(new com.ss.android.ugc.gamora.editor.y(14, P(), R.string.di8));
            }
            return arrayList2;
        }
        if (cm.c() && !com.ss.android.ugc.gamora.editor.lightening.a.a()) {
            if (!this.F) {
                i6 = 2131232581;
            }
            arrayList2.add(new com.ss.android.ugc.gamora.editor.y(4, i6, R.string.g6x));
        }
        if (!this.F) {
            i7 = 2131232557;
        }
        arrayList2.add(new com.ss.android.ugc.gamora.editor.y(5, i7, R.string.bww));
        if (G().isAutoEnhanceEnable(com.ss.android.ugc.aweme.shortvideo.edit.b.a.a())) {
            arrayList2.add(new com.ss.android.ugc.gamora.editor.y(9, x.a().a(1), R.string.bjh));
        }
        return arrayList2;
    }

    public final void O() {
        F().a(E());
        boolean z2 = false;
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        h.f.b.l.b(createIAVServiceProxybyMonsterPlugin, "");
        be storyService = createIAVServiceProxybyMonsterPlugin.getStoryService();
        boolean z3 = true;
        if (storyService.b() || storyService.c() || storyService.d()) {
            F().b(false);
        } else {
            if (G().mIsFromDraft && !ce.a()) {
                if (G().isDuet() || G().isUploadVideo() || G().isReaction() || ((G().isMvThemeVideoType() && !R()) || ((G().isDuet() && !G().duetFilesExist()) || G().isCutSameVideoType()))) {
                    F().b(false);
                } else {
                    F().b(true);
                }
                if (com.ss.android.ugc.gamora.editor.lightening.a.a(G())) {
                    F().b(true);
                    F().a("");
                } else if (R()) {
                    F().b(true);
                    EditToolbarViewModel F2 = F();
                    Activity activity = this.f42913m;
                    if (activity == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(activity, "");
                    String string = activity.getResources().getString(R.string.azh);
                    h.f.b.l.b(string, "");
                    F2.a(string);
                } else if (G().mShootMode == 2 && G().getOriginal() == 1) {
                    F().b(false);
                }
            } else if (G().mIsFromDraft && ce.a()) {
                F().b(false);
            }
            if (G().draftFromShoot) {
                F().b(true);
            }
        }
        S();
        if (G().isStickPointMode) {
            F().d(8, false);
            F().d(7, false);
            F().b(7, false);
        }
        if (bp.h(G())) {
            if (G().veAudioRecorderParam == null || !G().veAudioRecorderParam.hasRecord()) {
                F().d(6, false);
            } else {
                F().d(6, true);
            }
        }
        if ((!G().hasOriginalAudio() || G().voiceVolume <= 0.0f) && !G().hasRecord()) {
            F().d(11, false);
        } else {
            F().d(11, true);
        }
        if (G().isDuet() || G().isReaction() || G().mMusicPath == null || G().isStickPointMode) {
            z3 = false;
        }
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        if (!G().isMvThemeVideoType() || cVar == null || com.ss.android.ugc.tools.utils.k.a(G().mvCreateVideoData.musicIds) || !G().mvCreateVideoData.musicIds.contains(cVar.getMusicId())) {
            z2 = z3;
        }
        if (bp.l(G())) {
            com.ss.android.ugc.gamora.editor.music.a Q = Q();
            if (Q != null) {
                Q.a(z2);
            }
        } else {
            F().b(8, z2);
            LiveData<com.ss.android.ugc.asve.editor.g> C2 = I().C();
            Activity t2 = t();
            Objects.requireNonNull(t2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            C2.observe((androidx.appcompat.app.d) t2, new w(this));
        }
        T();
    }

    public static final class x extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147127a;

        static {
            Covode.recordClassIndex(96918);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        x(g gVar) {
            this.f147127a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            h.f.b.l.d(view, "");
            this.f147127a.I().J();
        }
    }

    public static final class y extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147128a;

        static {
            Covode.recordClassIndex(96919);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        y(g gVar) {
            this.f147128a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            h.f.b.l.d(view, "");
            gr.a("camera_start");
            this.f147128a.I().J();
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147115a;

        static {
            Covode.recordClassIndex(96900);
        }

        h(g gVar) {
            this.f147115a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f147115a.F().a(1);
        }
    }

    public static final /* synthetic */ TextView a(g gVar) {
        TextView textView = gVar.f147109l;
        if (textView == null) {
            h.f.b.l.a("tvChooseMusic");
        }
        return textView;
    }

    public static final /* synthetic */ View b(g gVar) {
        View view = gVar.v;
        if (view == null) {
            h.f.b.l.a("removeMusicView");
        }
        return view;
    }

    public static final /* synthetic */ ImageView c(g gVar) {
        ImageView imageView = gVar.f147108k;
        if (imageView == null) {
            h.f.b.l.a("ivChooseMusic");
        }
        return imageView;
    }

    public static final /* synthetic */ View d(g gVar) {
        View view = gVar.t;
        if (view == null) {
            h.f.b.l.a("loadingMusicView");
        }
        return view;
    }

    public static final /* synthetic */ View e(g gVar) {
        View view = gVar.f147107j;
        if (view == null) {
            h.f.b.l.a("chooseMusicContainer");
        }
        return view;
    }

    public static final /* synthetic */ TextView f(g gVar) {
        TextView textView = gVar.f147102e;
        if (textView == null) {
            h.f.b.l.a("mTvBackTip");
        }
        return textView;
    }

    public static final /* synthetic */ ViewGroup g(g gVar) {
        ViewGroup viewGroup = gVar.f147103f;
        if (viewGroup == null) {
            h.f.b.l.a("mToolbarContainer");
        }
        return viewGroup;
    }

    public static final /* synthetic */ ConstraintLayout h(g gVar) {
        ConstraintLayout constraintLayout = gVar.f147100c;
        if (constraintLayout == null) {
            h.f.b.l.a("titleLayout");
        }
        return constraintLayout;
    }

    @Override // com.bytedance.jedi.arch.b
    public <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class k<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147117a;

        static {
            Covode.recordClassIndex(96903);
        }

        k(g gVar) {
            this.f147117a = gVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            int i2 = 0;
            if (bool.booleanValue() || this.f147117a.M()) {
                z = true;
            } else {
                z = false;
            }
            View e2 = g.e(this.f147117a);
            if (!z) {
                i2 = 8;
            }
            e2.setVisibility(i2);
        }
    }

    static final class m<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147118a;

        static {
            Covode.recordClassIndex(96905);
        }

        m(g gVar) {
            this.f147118a = gVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                if (bool.booleanValue()) {
                    com.ss.android.ugc.gamora.editor.progressbar.a J = this.f147118a.J();
                    if (J != null) {
                        J.b();
                    }
                } else {
                    com.ss.android.ugc.gamora.editor.progressbar.a J2 = this.f147118a.J();
                    if (J2 != null) {
                        J2.c();
                    }
                }
                ViewGroup g2 = g.g(this.f147118a);
                if (bool.booleanValue()) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                g2.setVisibility(i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class w<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147126a;

        static {
            Covode.recordClassIndex(96917);
        }

        w(g gVar) {
            this.f147126a = gVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj != null && bp.a(this.f147126a.I()) > this.f147126a.G().mCurMusicLength) {
                this.f147126a.F().d(8, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$g  reason: collision with other inner class name */
    static final class C3947g<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147114a;

        static {
            Covode.recordClassIndex(96899);
        }

        C3947g(g gVar) {
            this.f147114a = gVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            MusicModel convertToMusicModel;
            h.f.b.l.b(iVar, "");
            if (!(iVar.d() == null || (convertToMusicModel = ((Music) iVar.d()).convertToMusicModel()) == null)) {
                g.a(this.f147114a).setText(convertToMusicModel.getName() + "-" + convertToMusicModel.getSinger());
            }
            return z.f158842a;
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147116a;

        static {
            Covode.recordClassIndex(96901);
        }

        i(g gVar) {
            this.f147116a = gVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            VideoPublishEditModel G = this.f147116a.G();
            com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
            if (cVar == null || (str = cVar.getMusicId()) == null) {
                str = "";
            }
            h.f.b.l.b(str, "");
            bl.a(G, str, "");
            cr.a().a((com.ss.android.ugc.aweme.shortvideo.c) null);
            g gVar = this.f147116a;
            ((ac) gVar.f147106i.a(gVar, g.f147099b[2])).a();
            g.a(this.f147116a).setText(R.string.fvx);
            g.b(this.f147116a).setVisibility(8);
        }
    }

    static final class u<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147119a;

        static {
            Covode.recordClassIndex(96913);
        }

        u(g gVar) {
            this.f147119a = gVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                g.f(this.f147119a).setVisibility(8);
                g.g(this.f147119a).setVisibility(8);
                if (this.f147119a.f147107j != null) {
                    g.e(this.f147119a).setVisibility(8);
                    return;
                }
                return;
            }
            g.f(this.f147119a).setVisibility(0);
            g.g(this.f147119a).setVisibility(0);
            if (this.f147119a.f147107j != null) {
                g.e(this.f147119a).setVisibility(0);
            }
        }
    }

    public g(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.G = fVar;
        h.k.c a2 = h.f.b.ab.a(EditToolbarViewModel.class);
        this.x = h.i.a((h.f.a.a) new b(this, a2, a2));
    }

    private final void a(List<com.ss.android.ugc.gamora.editor.y> list) {
        int i2;
        if (!bp.k(G())) {
            return;
        }
        if (G().hasOriginalAudio() || bp.i(G())) {
            if (!this.F) {
                i2 = 2131232583;
            } else if (G().hasSubtitle()) {
                i2 = 2131232586;
            } else {
                i2 = 2131232585;
            }
            list.add(new com.ss.android.ugc.gamora.editor.y(11, i2, R.string.xc));
        }
    }

    public static final class c implements h.h.d<Object, com.ss.android.ugc.gamora.editor.music.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.a f147110a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f147111b;

        static {
            Covode.recordClassIndex(96895);
        }

        public c(com.bytedance.o.a aVar, g gVar) {
            this.f147110a = aVar;
            this.f147111b = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.h.d
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.music.a a(Object obj, h.k.i iVar) {
            h.f.b.l.d(obj, "");
            h.f.b.l.d(iVar, "");
            Object b2 = this.f147110a.getDiContainer().b(com.ss.android.ugc.gamora.editor.music.a.class, null);
            if (bp.l(this.f147111b.G())) {
                return b2;
            }
            return null;
        }
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    static final class p extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(96908);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            this.this$0.O();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(96904);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            com.ss.android.ugc.aweme.shortvideo.edit.m mVar = this.this$0.f147105h;
            if (mVar != null) {
                mVar.c();
            }
            return z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(96909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            int i2;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            ImageView H = this.this$0.H();
            if (booleanValue) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            H.setVisibility(i2);
            return z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, String, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(96912);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, String str) {
            String str2 = str;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(str2, "");
            g.f(this.this$0).setText(str2);
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Integer, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(96907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Integer num) {
            int intValue = num.intValue();
            h.f.b.l.d(bVar, "");
            ViewGroup.LayoutParams layoutParams = g.h(this.this$0).getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = intValue;
                g.h(this.this$0).setLayoutParams(marginLayoutParams);
            }
            return z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(96910);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            View view = this.this$0.f147104g.get(14);
            if (view != null) {
                Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
                ((com.ss.android.ugc.aweme.shortvideo.edit.k) view).setIcon(this.this$0.P());
            }
            return z.f158842a;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(96911);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            TextView textView;
            int i2;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            if (this.this$0.K() || cm.b()) {
                textView = g.f(this.this$0);
            } else {
                textView = g.f(this.this$0);
                if (booleanValue) {
                    i2 = 0;
                    textView.setVisibility(i2);
                    return z.f158842a;
                }
            }
            i2 = 8;
            textView.setVisibility(i2);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.ath, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) a2;
        this.f147100c = constraintLayout;
        if (constraintLayout == null) {
            h.f.b.l.a("titleLayout");
        }
        return constraintLayout;
    }

    static final class n extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(96906);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            if (booleanValue) {
                View view = this.this$0.f147104g.get(11);
                if (view != null) {
                    Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
                    ((com.ss.android.ugc.aweme.shortvideo.edit.k) view).setIcon(2131232586);
                }
            } else {
                View view2 = this.this$0.f147104g.get(11);
                if (view2 != null) {
                    Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
                    ((com.ss.android.ugc.aweme.shortvideo.edit.k) view2).setIcon(2131232585);
                }
            }
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.m, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(96902);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.m mVar) {
            com.bytedance.jedi.arch.m mVar2 = mVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(mVar2, "");
            int intValue = mVar2.f39404b.intValue();
            if (intValue == 0) {
                g.a(this.this$0).setText(R.string.fvx);
                g.c(this.this$0).setVisibility(0);
                g.d(this.this$0).setVisibility(8);
                Animator animator = this.this$0.u;
                if (animator != null) {
                    animator.cancel();
                }
                g.b(this.this$0).setVisibility(8);
            } else if (intValue == 1) {
                com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
                if (cVar != null) {
                    g.a(this.this$0).setText(cVar.getName() + "-" + cVar.authorName);
                }
                g.c(this.this$0).setVisibility(0);
                g.d(this.this$0).setVisibility(8);
                Animator animator2 = this.this$0.u;
                if (animator2 != null) {
                    animator2.cancel();
                }
                if (!this.this$0.L()) {
                    g.b(this.this$0).setVisibility(0);
                }
            } else if (intValue == 2) {
                g.a(this.this$0).setText(this.this$0.t().getResources().getText(R.string.g4k));
                g.c(this.this$0).setVisibility(8);
                g.d(this.this$0).setVisibility(0);
                Animator animator3 = this.this$0.u;
                if (animator3 != null) {
                    animator3.start();
                }
                g.b(this.this$0).setVisibility(8);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        int i2;
        LiveData<Boolean> a2;
        int i3;
        h.f.b.l.d(view, "");
        super.a(view, bundle);
        View c2 = c(R.id.q9);
        h.f.b.l.b(c2, "");
        this.f147101d = (ImageView) c2;
        if (!G().mIsFromDraft || (!(G().mOrigin == 0 || G().recordMode == 1) || !ce.a())) {
            ImageView imageView = this.f147101d;
            if (imageView == null) {
                h.f.b.l.a("mBackImageView");
            }
            if (cj.a()) {
                i2 = 2131232197;
            } else {
                i2 = 2131232195;
            }
            imageView.setImageResource(i2);
        } else {
            ImageView imageView2 = this.f147101d;
            if (imageView2 == null) {
                h.f.b.l.a("mBackImageView");
            }
            if (cj.a()) {
                i3 = 2131232199;
            } else {
                i3 = 2131232429;
            }
            imageView2.setImageResource(i3);
        }
        ImageView imageView3 = this.f147101d;
        if (imageView3 == null) {
            h.f.b.l.a("mBackImageView");
        }
        imageView3.setOnClickListener(new x(this));
        View c3 = c(R.id.evz);
        h.f.b.l.b(c3, "");
        TextView textView = (TextView) c3;
        this.f147102e = textView;
        if (textView == null) {
            h.f.b.l.a("mTvBackTip");
        }
        textView.setOnClickListener(new y(this));
        View c4 = c(R.id.c95);
        h.f.b.l.b(c4, "");
        this.f147103f = (ViewGroup) c4;
        if (!cm.b() && K() && !G().isDuet() && !G().isReaction() && !com.ss.android.ugc.gamora.editor.lightening.a.a() && G().canvasVideoData == null) {
            View c5 = c(R.id.dom);
            h.f.b.l.b(c5, "");
            this.f147107j = c5;
            if (c5 == null) {
                h.f.b.l.a("chooseMusicContainer");
            }
            c5.setVisibility(0);
            View c6 = c(R.id.bv9);
            h.f.b.l.b(c6, "");
            this.f147108k = (ImageView) c6;
            View c7 = c(R.id.bv_);
            h.f.b.l.b(c7, "");
            this.t = c7;
            View c8 = c(R.id.ewx);
            h.f.b.l.b(c8, "");
            this.f147109l = (TextView) c8;
            View c9 = c(R.id.dxq);
            h.f.b.l.b(c9, "");
            this.D = c9;
            View c10 = c(R.id.cej);
            h.f.b.l.b(c10, "");
            this.v = c10;
            View view2 = this.f147107j;
            if (view2 == null) {
                h.f.b.l.a("chooseMusicContainer");
            }
            Drawable background = view2.getBackground();
            h.f.b.l.b(background, "");
            background.setAlpha(127);
            View view3 = this.t;
            if (view3 == null) {
                h.f.b.l.a("loadingMusicView");
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, "rotation", 0.0f, 360.0f);
            ofFloat.setRepeatCount(-1);
            ofFloat.setDuration(1000L);
            ofFloat.setInterpolator(new LinearInterpolator());
            this.u = ofFloat;
            View view4 = this.D;
            if (view4 == null) {
                h.f.b.l.a("chooseMusicPressLayer");
            }
            view4.setOnClickListener(new h(this));
            View view5 = this.v;
            if (view5 == null) {
                h.f.b.l.a("removeMusicView");
            }
            view5.setOnClickListener(new i(this));
            if (com.ss.android.ugc.gamora.editor.t.a(G())) {
                com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
                if (cVar != null) {
                    TextView textView2 = this.f147109l;
                    if (textView2 == null) {
                        h.f.b.l.a("tvChooseMusic");
                    }
                    textView2.setText(cVar.getName() + "-" + cVar.authorName);
                }
                if (G().isTemplateMv() && G().mvCreateVideoData != null && !com.ss.android.ugc.tools.utils.k.a(G().mvCreateVideoData.musicIds)) {
                    String str = G().mvCreateVideoData.musicIds.get(0);
                    h.f.b.l.b(str, "");
                    b.i.b(new f(str), b.i.f4824a).a(new C3947g(this), b.i.f4826c, null);
                }
                if (!L()) {
                    View view6 = this.v;
                    if (view6 == null) {
                        h.f.b.l.a("removeMusicView");
                    }
                    view6.setVisibility(0);
                }
            }
            if (G().isStickPointMode) {
                if (!G().isStickPointMode) {
                    View view7 = this.D;
                    if (view7 == null) {
                        h.f.b.l.a("chooseMusicPressLayer");
                    }
                    view7.setEnabled(false);
                }
                ImageView imageView4 = this.f147108k;
                if (imageView4 == null) {
                    h.f.b.l.a("ivChooseMusic");
                }
                imageView4.setImageAlpha(127);
                TextView textView3 = this.f147109l;
                if (textView3 == null) {
                    h.f.b.l.a("tvChooseMusic");
                }
                textView3.setAlpha(0.5f);
                View view8 = this.v;
                if (view8 == null) {
                    h.f.b.l.a("removeMusicView");
                }
                view8.setVisibility(8);
            } else {
                selectNonNullSubscribe(F(), h.f147129a, new ah(), new j(this));
                LiveData<Boolean> d2 = F().d(1);
                if (d2 != null) {
                    d2.observe(this, new k(this));
                }
            }
        }
        selectNonNullSubscribe(F(), i.f147130a, new ah(), new q(this));
        selectNonNullSubscribe(F(), o.f147136a, new ah(), new s(this));
        selectNonNullSubscribe(F(), p.f147137a, new ah(), new t(this));
        com.ss.android.ugc.gamora.editor.progressbar.a J = J();
        if (!(J == null || (a2 = J.a()) == null)) {
            a2.observe(this, new u(this));
        }
        selectNonNullSubscribe(F(), q.f147138a, new ah(), new v(this));
        b.a.b(this, F(), j.f147131a, new l(this));
        androidx.lifecycle.t<Boolean> j2 = F().j();
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        j2.observe((androidx.fragment.app.e) activity, new m(this));
        if (av.a()) {
            selectNonNullSubscribe(F(), k.f147132a, new ah(), new n(this));
        }
        selectNonNullSubscribe(F(), l.f147133a, new ah(), new o(this));
        b.a.b(this, F(), m.f147134a, new p(this));
        b.a.b(this, F(), n.f147135a, new r(this));
        O();
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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

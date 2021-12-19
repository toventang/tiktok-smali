package com.ss.android.ugc.gamora.editor.toolbar;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ab;
import androidx.lifecycle.ad;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
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
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.property.av;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.edit.EditMusicStruct;
import com.ss.android.ugc.aweme.services.edit.MusicTimeStruct;
import com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.edit.k;
import com.ss.android.ugc.aweme.shortvideo.q.b;
import com.ss.android.ugc.aweme.utils.fa;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.f.a.s;
import h.f.b.y;
import h.u;
import h.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class ac extends com.bytedance.scene.group.b implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f147039b = {new y(ac.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: h  reason: collision with root package name */
    public static final d f147040h = new d((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public final Map<Integer, com.ss.android.ugc.aweme.shortvideo.edit.k> f147041c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f147042d;

    /* renamed from: e  reason: collision with root package name */
    public ViewGroup f147043e;

    /* renamed from: f  reason: collision with root package name */
    public TuxButton f147044f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f147045g;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f147046i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f147047j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f147048k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f147049l;
    private View t;
    private final com.bytedance.o.f u;

    static {
        Covode.recordClassIndex(96846);
    }

    private final ReplaceMusicToolbarViewModel H() {
        return (ReplaceMusicToolbarViewModel) this.f147047j.getValue();
    }

    public final EditToolbarViewModel E() {
        return (EditToolbarViewModel) this.f147046i.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a F() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f147048k.getValue();
    }

    public final VideoPublishEditModel G() {
        return (VideoPublishEditModel) this.f147049l.a(this, f147039b[0]);
    }

    @Override // com.bytedance.jedi.arch.h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class d {
        static {
            Covode.recordClassIndex(96850);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public com.bytedance.o.f getDiContainer() {
        return this.u;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.v
    public androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96847);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.toolbar.ac.a.invoke():com.bytedance.als.b");
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<EditToolbarViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(96848);
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_toolbar_ReplaceMusicToolbarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_toolbar_ReplaceMusicToolbarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.toolbar.ac.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static androidx.lifecycle.ac com_ss_android_ugc_gamora_editor_toolbar_ReplaceMusicToolbarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            androidx.lifecycle.ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<ReplaceMusicToolbarViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(96849);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicToolbarViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_toolbar_ReplaceMusicToolbarScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_toolbar_ReplaceMusicToolbarScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.toolbar.ac.c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static androidx.lifecycle.ac com_ss_android_ugc_gamora_editor_toolbar_ReplaceMusicToolbarScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            androidx.lifecycle.ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class e extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.gamora.editor.y f147050a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ac f147051b;

        static {
            Covode.recordClassIndex(96851);
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            this.f147051b.E().a(this.f147050a.f147356a);
        }

        e(com.ss.android.ugc.gamora.editor.y yVar, ac acVar) {
            this.f147050a = yVar;
            this.f147051b = acVar;
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ac f147052a;

        static {
            Covode.recordClassIndex(96852);
        }

        f(ac acVar) {
            this.f147052a = acVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Activity activity = this.f147052a.f42913m;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public static final /* synthetic */ TuxButton a(ac acVar) {
        TuxButton tuxButton = acVar.f147044f;
        if (tuxButton == null) {
            h.f.b.l.a("postButton");
        }
        return tuxButton;
    }

    @Override // com.bytedance.jedi.arch.b
    public <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class l<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ac f147055a;

        static {
            Covode.recordClassIndex(96858);
        }

        l(ac acVar) {
            this.f147055a = acVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (((Boolean) ((u) obj).getFirst()).booleanValue()) {
                ViewGroup viewGroup = this.f147055a.f147043e;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                    return;
                }
                return;
            }
            ViewGroup viewGroup2 = this.f147055a.f147043e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
        }
    }

    public ac(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.u = fVar;
        h.k.c a2 = h.f.b.ab.a(EditToolbarViewModel.class);
        this.f147046i = h.i.a((h.f.a.a) new b(this, a2, a2));
        h.k.c a3 = h.f.b.ab.a(ReplaceMusicToolbarViewModel.class);
        this.f147047j = h.i.a((h.f.a.a) new c(this, a3, a3));
        this.f147048k = h.i.a(h.m.NONE, new a(this));
        this.f147049l = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
        this.f147045g = av.a();
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ac f147054a;

        static {
            Covode.recordClassIndex(96856);
        }

        j(ac acVar) {
            this.f147054a = acVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            int i3;
            int i4;
            MethodCollector.i(3697);
            com.ss.android.ugc.asve.editor.g gVar = (com.ss.android.ugc.asve.editor.g) obj;
            ac acVar = this.f147054a;
            boolean l2 = bp.l(acVar.G());
            View c2 = acVar.c(R.id.c95);
            h.f.b.l.b(c2, "");
            acVar.f147042d = (LinearLayout) c2;
            ArrayList arrayList = new ArrayList();
            if (acVar.f147045g) {
                i2 = 2131232540;
            } else {
                i2 = 2131232355;
            }
            int i5 = 1;
            arrayList.add(new com.ss.android.ugc.gamora.editor.y(1, i2, R.string.dcm));
            if (!l2) {
                if (acVar.f147045g) {
                    i3 = 2131232552;
                } else {
                    i3 = 2131232551;
                }
                arrayList.add(new com.ss.android.ugc.gamora.editor.y(8, i3, R.string.b45));
                if (acVar.f147045g) {
                    i4 = 2131232598;
                } else {
                    i4 = 2131232597;
                }
                arrayList.add(new com.ss.android.ugc.gamora.editor.y(7, i4, R.string.g2a));
            }
            for (T t : arrayList) {
                Activity activity = acVar.f42913m;
                if (activity == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(activity, "");
                com.ss.android.ugc.aweme.shortvideo.edit.k a2 = k.a.a(activity, t.f147358c, t.f147357b);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.leftMargin = (int) n.b(acVar.q(), 4.0f);
                LinearLayout linearLayout = acVar.f147042d;
                if (linearLayout == null) {
                    h.f.b.l.a("bottomBarContainer");
                }
                linearLayout.addView(a2, layoutParams);
                acVar.f147041c.put(Integer.valueOf(t.f147356a), a2);
                a2.setOnClickListener(new e(t, acVar));
                if (t.f147356a == 8) {
                    a2.setEnabled(false);
                    a2.setAlpha(0.5f);
                }
            }
            if (bp.a() && bp.j(this.f147054a.G())) {
                cr.a().a((com.ss.android.ugc.aweme.shortvideo.c) null);
                VideoPublishEditModel G = this.f147054a.G();
                h.f.b.l.d(G, "");
                if (G.videoDurationFromVideoCutPage > 0) {
                    com.ss.android.ugc.aweme.shortvideo.q.a.a(new b.d(G.getPreviewInfo().getVideoList().get(0).getVideoPath(), (long) G.videoDurationFromVideoCutPage, com.ss.android.ugc.aweme.shortvideo.q.d.NORMAL, G.creationId, G.microAppId, false));
                }
            }
            VideoPublishEditModel G2 = this.f147054a.G();
            int j2 = gVar.j();
            h.f.b.l.d(G2, "");
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            dVar.a("creation_id", G2.creationId);
            dVar.a("group_id", G2.replaceMusicModel.getAid());
            dVar.a("shoot_way", G2.mShootWay);
            dVar.a("content_source", "upload");
            if (j2 < 61000) {
                i5 = 0;
            }
            z.f147170a = i5;
            dVar.a("is_long_video", i5);
            dVar.a("music_id", G2.replaceMusicModel.getMid());
            r.a("click_change_music_icon", dVar.f66730a);
            MethodCollector.o(3697);
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ac f147053a;

        static {
            Covode.recordClassIndex(96855);
        }

        i(ac acVar) {
            this.f147053a = acVar;
        }

        public final void onClick(View view) {
            int i2;
            int min;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
            if (cVar == null) {
                Activity t = this.f147053a.t();
                h.f.b.l.b(t, "");
                new com.bytedance.tux.g.b(t).e(R.string.dif).b();
                return;
            }
            ReplaceMusicServiceImpl.a().setClickPost(true);
            ReplaceMusicRequest replaceMusicRequest = new ReplaceMusicRequest();
            replaceMusicRequest.setItemID(this.f147053a.G().replaceMusicModel.getAid());
            replaceMusicRequest.setOriginalVid(this.f147053a.G().replaceMusicModel.getVid());
            EditMusicStruct editMusicStruct = new EditMusicStruct();
            String musicId = cVar.getMusicId();
            h.f.b.l.b(musicId, "");
            editMusicStruct.setMusicID(musicId);
            editMusicStruct.setMusicVolume(String.valueOf((int) ((this.f147053a.G().musicVolume * 100.0f) / 2.0f)));
            MusicTimeStruct musicTimeStruct = new MusicTimeStruct();
            musicTimeStruct.setStartTime((long) this.f147053a.G().mMusicStart);
            com.ss.android.ugc.asve.editor.g value = this.f147053a.F().C().getValue();
            if (value != null) {
                i2 = value.j();
            } else {
                i2 = 0;
            }
            VideoPublishEditModel G = this.f147053a.G();
            h.f.b.l.d(G, "");
            if (cr.a().f125295a == null) {
                min = 0;
            } else {
                int a2 = fa.a(G.mMusicPath);
                if (cr.a().f125295a != null) {
                    com.ss.android.ugc.aweme.shortvideo.c cVar2 = cr.a().f125295a;
                    if (cVar2 == null) {
                        h.f.b.l.b();
                    }
                    if (cVar2.getShootDuration() > 0) {
                        com.ss.android.ugc.aweme.shortvideo.c cVar3 = cr.a().f125295a;
                        if (cVar3 == null) {
                            h.f.b.l.b();
                        }
                        if (Math.abs(a2 - cVar3.getShootDuration()) >= 1000) {
                            com.ss.android.ugc.aweme.shortvideo.c cVar4 = cr.a().f125295a;
                            if (cVar4 == null) {
                                h.f.b.l.b();
                            }
                            a2 = cVar4.getShootDuration();
                        }
                    }
                }
                min = Math.min(G.mMusicStart + i2, G.mMusicStart + a2);
            }
            musicTimeStruct.setEndTime((long) min);
            editMusicStruct.setMusicTime(musicTimeStruct);
            StringBuilder sb = new StringBuilder("click post mid : ");
            String musicID = editMusicStruct.getMusicID();
            if (musicID == null) {
                musicID = "null";
            }
            q.a("ReplaceMusicToolbarScene", sb.append(musicID).append("volume ").append(editMusicStruct.getMusicVolume()).append("itemID ").append(replaceMusicRequest.getItemID()).append("startTime ").append(musicTimeStruct.getStartTime()).append("endTime ").append(musicTimeStruct.getEndTime()).toString());
            replaceMusicRequest.setEditMusicStruct(editMusicStruct);
            ReplaceMusicServiceImpl.a().setReplaceMusicRequest(replaceMusicRequest);
            ReplaceMusicServiceImpl.a().setCover(this.f147053a.G().replaceMusicModel.getCover());
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            h.f.b.l.b(createIAVServiceProxybyMonsterPlugin, "");
            com.ss.android.ugc.aweme.port.in.ab applicationService = createIAVServiceProxybyMonsterPlugin.getApplicationService();
            h.f.b.l.b(applicationService, "");
            Class<? extends androidx.fragment.app.e> e2 = applicationService.e();
            h.f.b.l.b(e2, "");
            Intent intent = new Intent(this.f147053a.f42913m, e2);
            intent.addFlags(603979776);
            Activity t2 = this.f147053a.t();
            com.ss.android.ugc.tiktok.security.a.a.a(intent, t2);
            t2.startActivity(intent);
            VideoPublishEditModel G2 = this.f147053a.G();
            String musicId2 = cVar.getMusicId();
            h.f.b.l.b(musicId2, "");
            h.f.b.l.d(G2, "");
            h.f.b.l.d(musicId2, "");
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            dVar.a("creation_id", G2.creationId);
            dVar.a("group_id", G2.replaceMusicModel.getAid());
            dVar.a("shoot_way", G2.mShootWay);
            dVar.a("content_source", "upload");
            dVar.a("is_long_video", z.f147170a);
            dVar.a("music_id", G2.replaceMusicModel.getMid());
            dVar.a("replace_music_id", musicId2);
            r.a("publish_replace_music", dVar.f66730a);
        }
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f147056a = new m();

        static {
            Covode.recordClassIndex(96859);
        }

        m() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            bool.booleanValue();
            h.f.b.l.d(bVar, "");
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.aud, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a2;
        this.f147043e = viewGroup2;
        if (viewGroup2 == null) {
            h.f.b.l.b();
        }
        return viewGroup2;
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Integer, z> {
        final /* synthetic */ ac this$0;

        static {
            Covode.recordClassIndex(96853);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ac acVar) {
            super(2);
            this.this$0 = acVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Integer num) {
            ViewGroup.LayoutParams layoutParams;
            int intValue = num.intValue();
            h.f.b.l.d(bVar, "");
            ViewGroup viewGroup = this.this$0.f147043e;
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (viewGroup != null) {
                layoutParams = viewGroup.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = layoutParams;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = intValue;
                ViewGroup viewGroup2 = this.this$0.f147043e;
                if (viewGroup2 != null) {
                    viewGroup2.setLayoutParams(marginLayoutParams2);
                }
            }
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ ac this$0;

        static {
            Covode.recordClassIndex(96857);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(ac acVar) {
            super(2);
            this.this$0 = acVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            if (bp.a(this.this$0.G(), this.this$0.G().mMusicPath)) {
                com.ss.android.ugc.aweme.shortvideo.edit.k kVar = this.this$0.f147041c.get(8);
                if (kVar != null) {
                    kVar.setEnabled(true);
                }
                com.ss.android.ugc.aweme.shortvideo.edit.k kVar2 = this.this$0.f147041c.get(8);
                if (kVar2 != null) {
                    kVar2.setAlpha(1.0f);
                }
            } else {
                com.ss.android.ugc.aweme.shortvideo.edit.k kVar3 = this.this$0.f147041c.get(8);
                if (kVar3 != null) {
                    kVar3.setEnabled(false);
                }
                com.ss.android.ugc.aweme.shortvideo.edit.k kVar4 = this.this$0.f147041c.get(8);
                if (kVar4 != null) {
                    kVar4.setAlpha(0.5f);
                }
            }
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Drawable, z> {
        final /* synthetic */ ac this$0;

        static {
            Covode.recordClassIndex(96854);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(ac acVar) {
            super(2);
            this.this$0 = acVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Drawable drawable) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(drawable, "");
            if (cr.a().f125295a == null) {
                ac.a(this.this$0).setButtonVariant(2);
                if (this.this$0.f147045g) {
                    com.ss.android.ugc.aweme.shortvideo.edit.k kVar = this.this$0.f147041c.get(1);
                    if (kVar != null) {
                        kVar.setIcon(2131232540);
                    }
                } else {
                    com.ss.android.ugc.aweme.shortvideo.edit.k kVar2 = this.this$0.f147041c.get(1);
                    if (kVar2 != null) {
                        kVar2.setIcon(2131232355);
                    }
                }
            } else {
                ac.a(this.this$0).setButtonVariant(0);
                if (this.this$0.f147045g) {
                    com.ss.android.ugc.aweme.shortvideo.edit.k kVar3 = this.this$0.f147041c.get(1);
                    if (kVar3 != null) {
                        kVar3.setIcon(2131232540);
                    }
                } else {
                    com.ss.android.ugc.aweme.shortvideo.edit.k kVar4 = this.this$0.f147041c.get(1);
                    if (kVar4 != null) {
                        kVar4.setIcon(2131232539);
                    }
                }
                com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
                if (cVar != null && !TextUtils.isEmpty(cVar.getMusicId())) {
                    VideoPublishEditModel G = this.this$0.G();
                    String musicId = cVar.getMusicId();
                    h.f.b.l.b(musicId, "");
                    h.f.b.l.d(G, "");
                    h.f.b.l.d(musicId, "");
                    com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                    dVar.a("creation_id", G.creationId);
                    dVar.a("group_id", G.replaceMusicModel.getAid());
                    dVar.a("shoot_way", G.mShootWay);
                    dVar.a("content_source", "upload");
                    dVar.a("is_long_video", z.f147170a);
                    dVar.a("music_id", G.replaceMusicModel.getMid());
                    dVar.a("replace_music_id", musicId);
                    r.a("select_replace_music", dVar.f66730a);
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.a(view, bundle);
        View c2 = c(R.id.q9);
        h.f.b.l.b(c2, "");
        this.t = c2;
        View c3 = c(R.id.d7w);
        h.f.b.l.b(c3, "");
        this.f147044f = (TuxButton) c3;
        View view2 = this.t;
        if (view2 == null) {
            h.f.b.l.a("backView");
        }
        view2.setOnClickListener(new f(this));
        G().musicVolume = 0.0f;
        TuxButton tuxButton = this.f147044f;
        if (tuxButton == null) {
            h.f.b.l.a("postButton");
        }
        tuxButton.setOnClickListener(new i(this));
        F().C().observe(this, new j(this));
        b.a.b(this, H(), ae.f147058a, new k(this));
        F().F().observe(getLifecycleOwner(), new l(this));
        b.a.b(this, H(), af.f147059a, m.f147056a);
        selectNonNullSubscribe(E(), ag.f147060a, new ah(), new g(this));
        selectNonNullSubscribe(E(), ad.f147057a, new ah(), new h(this));
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
    public <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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

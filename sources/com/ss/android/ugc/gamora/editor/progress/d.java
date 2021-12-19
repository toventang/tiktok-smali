package com.ss.android.ugc.gamora.editor.progress;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.t;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
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
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.k.i;
import h.k.k;
import h.m;
import h.z;

public final class d extends j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f146280a = {new y(d.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};
    public static final C3910d t = new C3910d((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public t<dmt.av.video.t> f146281b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f146282c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f146283d;

    /* renamed from: e  reason: collision with root package name */
    public View f146284e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f146285f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f146286g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f146287h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f146288i;

    /* renamed from: j  reason: collision with root package name */
    public int f146289j;

    /* renamed from: k  reason: collision with root package name */
    public float f146290k;

    /* renamed from: l  reason: collision with root package name */
    public final g f146291l;
    private final h.h.d u = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
    private final h.h v = h.i.a(m.NONE, new a(this));
    private final h.h w = h.i.a(m.NONE, new c(this));
    private final h.h x;
    private final com.bytedance.o.f y;

    static {
        Covode.recordClassIndex(96151);
    }

    public final VideoPublishEditModel a() {
        return (VideoPublishEditModel) this.u.a(this, f146280a[0]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a b() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.v.getValue();
    }

    public final a d() {
        return (a) this.w.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progress.d$d  reason: collision with other inner class name */
    public static final class C3910d {
        static {
            Covode.recordClassIndex(96155);
        }

        private C3910d() {
        }

        public /* synthetic */ C3910d(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.y;
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
            Covode.recordClassIndex(96152);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.progress.d.a.invoke():com.bytedance.als.b");
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<a> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(96154);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.progress.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.progress.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.progress.a> r1 = com.ss.android.ugc.gamora.editor.progress.a.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.progress.d.c.invoke():com.bytedance.als.b");
        }
    }

    public static final class h implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f146294a;

        static {
            Covode.recordClassIndex(96159);
        }

        @Override // com.ss.android.ugc.gamora.editor.progress.g
        public final void a() {
            a d2 = this.f146294a.d();
            if (d2 == null || d2.a()) {
                this.f146294a.C();
            }
        }

        @Override // com.ss.android.ugc.gamora.editor.progress.g
        public final void b() {
            String str;
            a d2 = this.f146294a.d();
            if ((d2 == null || d2.a()) && this.f146294a.f146289j != -1) {
                if (this.f146294a.f146290k > 0.0f) {
                    str = "right";
                } else {
                    str = "left";
                }
                r.a("drag_edit_page_progress", new com.ss.android.ugc.tools.f.b().a("creation_id", this.f146294a.a().creationId).a("content_source", bl.b(this.f146294a.a())).a("content_type", bl.a(this.f146294a.a())).a("direction", str).a("drag_time", (int) Math.abs(((float) this.f146294a.a().getPreviewInfo().getPreviewVideoLength()) * this.f146294a.f146290k)).a("enter_from", "video_edit_page").a("creation_duration", this.f146294a.a().getPreviewInfo().getPreviewVideoLength()).f149193a);
                if (this.f146294a.b().m() == 1) {
                    d.a(this.f146294a).setValue(dmt.av.video.t.b());
                    this.f146294a.f146289j = -1;
                    d.c(this.f146294a).setVisibility(8);
                    d.d(this.f146294a).setVisibility(8);
                    d.b(this.f146294a).setVisibility(0);
                    this.f146294a.f146288i = true;
                    return;
                }
                d.a(this.f146294a).setValue(dmt.av.video.t.a());
                this.f146294a.f146289j = -1;
                d.c(this.f146294a).setVisibility(8);
                d.d(this.f146294a).setVisibility(8);
                d.b(this.f146294a).setVisibility(8);
                this.f146294a.f146288i = false;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(d dVar) {
            this.f146294a = dVar;
        }

        @Override // com.ss.android.ugc.gamora.editor.progress.g
        public final void a(float f2) {
            com.ss.android.ugc.asve.editor.g value;
            int i2;
            a d2 = this.f146294a.d();
            if ((d2 == null || d2.a()) && (value = this.f146294a.b().C().getValue()) != null) {
                float j2 = ((float) value.j()) / 1000.0f;
                if (j2 < 7.0f) {
                    i2 = 0;
                } else if (j2 < 15.0f) {
                    i2 = 1;
                } else if (j2 < 30.0f) {
                    i2 = 2;
                } else if (j2 < 45.0f) {
                    i2 = 3;
                } else if (j2 < 60.0f) {
                    i2 = 4;
                } else {
                    i2 = 5;
                }
                String.valueOf(i2);
                SparseArray<Integer> a2 = com.ss.android.ugc.aweme.shortvideo.edit.j.a();
                String.valueOf(a2.toString());
                float floatValue = (a2.get((a2.size() - i2) - 1).floatValue() / 100.0f) * f2;
                if (com.ss.android.ugc.aweme.tools.c.a(this.f146294a.t())) {
                    floatValue = -f2;
                }
                this.f146294a.f146290k = floatValue;
                d.a(this.f146294a).setValue(dmt.av.video.t.b());
                d.c(this.f146294a).setVisibility(0);
                d.d(this.f146294a).setVisibility(0);
                d.b(this.f146294a).setVisibility(8);
                float f3 = 0.0f;
                d.c(this.f146294a).setRotation(0.0f);
                if (floatValue < 0.0f) {
                    d.c(this.f146294a).setRotation(180.0f);
                }
                if (this.f146294a.f146289j == -1) {
                    this.f146294a.f146289j = value.k();
                }
                float j3 = ((float) this.f146294a.f146289j) + (((float) value.j()) * floatValue);
                if (j3 > ((float) value.j())) {
                    j3 = (float) value.j();
                }
                if (j3 >= 0.0f) {
                    f3 = j3;
                }
                d.a(this.f146294a).setValue(dmt.av.video.t.b((long) f3));
                d.a(this.f146294a).setValue(dmt.av.video.t.b());
                TextView textView = this.f146294a.f146282c;
                if (textView == null) {
                    l.a("curTextView");
                }
                textView.setText(f.a(f3));
                TextView textView2 = this.f146294a.f146283d;
                if (textView2 == null) {
                    l.a("totalTextView");
                }
                textView2.setText(f.a((float) value.j()));
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        if (this.f146287h && this.f146288i) {
            this.f146287h = false;
            t<dmt.av.video.t> tVar = this.f146281b;
            if (tVar == null) {
                l.a("mPreviewControlOpLiveData");
            }
            tVar.setValue(dmt.av.video.t.a());
            ImageView imageView = this.f146286g;
            if (imageView == null) {
                l.a("playView");
            }
            imageView.setVisibility(8);
            b().b(0);
            this.f146288i = false;
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<EditProgressViewModel> {
        final /* synthetic */ j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(96153);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.progress.EditProgressViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.progress.EditProgressViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.progress.EditProgressViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_progress_EditProgressScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_progress_EditProgressScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.progress.d.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_gamora_editor_progress_EditProgressScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public final void C() {
        if (this.f146288i) {
            ImageView imageView = this.f146286g;
            if (imageView == null) {
                l.a("playView");
            }
            imageView.setVisibility(8);
            b().b(0);
            t<dmt.av.video.t> tVar = this.f146281b;
            if (tVar == null) {
                l.a("mPreviewControlOpLiveData");
            }
            tVar.setValue(dmt.av.video.t.a());
            this.f146288i = false;
            return;
        }
        r.a("click_edit_page_pause", new com.ss.android.ugc.tools.f.b().a("creation_id", a().creationId).a("content_source", bl.b(a())).a("content_type", bl.a(a())).a("enter_from", "video_edit_page").a("creation_duration", a().getPreviewInfo().getPreviewVideoLength()).f149193a);
        ImageView imageView2 = this.f146286g;
        if (imageView2 == null) {
            l.a("playView");
        }
        imageView2.setVisibility(0);
        t<dmt.av.video.t> tVar2 = this.f146281b;
        if (tVar2 == null) {
            l.a("mPreviewControlOpLiveData");
        }
        tVar2.setValue(dmt.av.video.t.b());
        this.f146288i = true;
        b().b(1);
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f146292a;

        static {
            Covode.recordClassIndex(96156);
        }

        e(d dVar) {
            this.f146292a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f146292a.C();
        }
    }

    public static final /* synthetic */ t a(d dVar) {
        t<dmt.av.video.t> tVar = dVar.f146281b;
        if (tVar == null) {
            l.a("mPreviewControlOpLiveData");
        }
        return tVar;
    }

    public static final /* synthetic */ ImageView b(d dVar) {
        ImageView imageView = dVar.f146286g;
        if (imageView == null) {
            l.a("playView");
        }
        return imageView;
    }

    public static final /* synthetic */ ImageView c(d dVar) {
        ImageView imageView = dVar.f146285f;
        if (imageView == null) {
            l.a("seekView");
        }
        return imageView;
    }

    public static final /* synthetic */ View d(d dVar) {
        View view = dVar.f146284e;
        if (view == null) {
            l.a("parentView");
        }
        return view;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f146293a;

        static {
            Covode.recordClassIndex(96158);
        }

        g(d dVar) {
            this.f146293a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == 3) {
                    if (this.f146293a.b().m() == 1) {
                        d.b(this.f146293a).setVisibility(8);
                    }
                } else if (intValue == -1 && this.f146293a.b().m() == 1) {
                    d.b(this.f146293a).setVisibility(0);
                }
            }
        }
    }

    public d(com.bytedance.o.f fVar) {
        l.d(fVar, "");
        this.y = fVar;
        h.k.c a2 = h.f.b.ab.a(EditProgressViewModel.class);
        this.x = h.i.a((h.f.a.a) new b(this, a2, a2));
        this.f146289j = -1;
        this.f146291l = new h(this);
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        View c2 = c(R.id.el1);
        l.b(c2, "");
        this.f146284e = c2;
        View c3 = c(R.id.ahi);
        l.b(c3, "");
        this.f146282c = (TextView) c3;
        View c4 = c(R.id.epq);
        l.b(c4, "");
        this.f146283d = (TextView) c4;
        View c5 = c(R.id.dx1);
        l.b(c5, "");
        this.f146285f = (ImageView) c5;
        View c6 = c(R.id.d60);
        l.b(c6, "");
        this.f146286g = (ImageView) c6;
        View c7 = c(R.id.a3s);
        l.b(c7, "");
        View view = this.f146284e;
        if (view == null) {
            l.a("parentView");
        }
        view.setTranslationY(((float) (-com.ss.android.ttve.utils.b.b(t()))) / 5.0f);
        ImageView imageView = this.f146285f;
        if (imageView == null) {
            l.a("seekView");
        }
        imageView.setTranslationY(((float) (-com.ss.android.ttve.utils.b.b(t()))) / 5.0f);
        c7.setTranslationY(-com.ss.android.ttve.utils.b.b(t(), 1.5f));
        ImageView imageView2 = this.f146285f;
        if (imageView2 == null) {
            l.a("seekView");
        }
        imageView2.setVisibility(8);
        ImageView imageView3 = this.f146286g;
        if (imageView3 == null) {
            l.a("playView");
        }
        imageView3.setVisibility(8);
        View view2 = this.f146284e;
        if (view2 == null) {
            l.a("parentView");
        }
        view2.setVisibility(8);
        this.f146281b = b().v();
        ((com.bytedance.f.a.a.j) getDiContainer().a(com.bytedance.f.a.a.j.class, (String) null)).a(new com.bytedance.f.a.a.f(1, new c(this.f146291l)));
        ImageView imageView4 = this.f146286g;
        if (imageView4 == null) {
            l.a("playView");
        }
        imageView4.setOnClickListener(new e(this));
        b.a.b(this, (EditProgressViewModel) this.x.getValue(), e.f146295a, new f(this));
        b().n().observe(this, new g(this));
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.at9, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Integer, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(96157);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar) {
            super(2);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Integer num) {
            int intValue = num.intValue();
            l.d(bVar, "");
            if (intValue == -1) {
                this.this$0.f146287h = true;
            } else if (intValue == 5 || intValue == 1 || intValue == 8 || intValue == 7 || intValue == 1001 || intValue == 6) {
                if (this.this$0.f146288i) {
                    if (intValue != 1) {
                        d.a(this.this$0).setValue(dmt.av.video.t.a());
                    } else if (bp.l(this.this$0.a())) {
                        d.a(this.this$0).setValue(dmt.av.video.t.a());
                    }
                }
                d.b(this.this$0).setVisibility(8);
                this.this$0.b().b(0);
                this.this$0.f146288i = false;
            } else if (!(intValue == 4 || intValue == 3)) {
                d.b(this.this$0).setVisibility(8);
                this.this$0.b().b(0);
                this.this$0.f146288i = false;
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(ahVar, "");
        l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}

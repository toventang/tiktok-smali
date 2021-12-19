package com.ss.android.ugc.gamora.editor.progressbar.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
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
import com.bytedance.keva.Keva;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel;
import com.ss.android.ugc.gamora.editor.progressbar.EditPreviewProgressViewModel;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import h.f.a.s;
import h.f.b.y;
import h.z;
import java.lang.reflect.Type;

public final class a extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {
    public static final d H = new d((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f146306a = {new y(a.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new y(a.class, "editPreviewProgressApi", "getEditPreviewProgressApi()Lcom/ss/android/ugc/gamora/editor/progressbar/EditPreviewProgressApi;", 0), new y(a.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};
    ImageView A;
    public SeekBar B;
    public RelativeLayout C;
    public t<dmt.av.video.t> D;
    public Context E;
    View F;
    public TextView G;
    private final h.h.d I = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.preview.a.class);
    private final h.h J;
    private final h.h K;
    private final h.h.d L;
    private final h.h M;
    private final h.h N;
    private final h.h O;
    private final h.h P;
    private g.b Q;
    private ImageView R;
    private int S;
    private int T;
    private int U;
    private final com.bytedance.o.f V;

    /* renamed from: b  reason: collision with root package name */
    final h.h.d f146307b = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.editor.progressbar.a.class);

    /* renamed from: c  reason: collision with root package name */
    final h.h f146308c;

    /* renamed from: d  reason: collision with root package name */
    boolean f146309d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f146310e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f146311f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f146312g;

    /* renamed from: h  reason: collision with root package name */
    public int f146313h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f146314i;

    /* renamed from: j  reason: collision with root package name */
    public int f146315j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f146316k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f146317l;
    public int t;
    public int u;
    public int v;
    public long w;
    public View x;
    public TuxTextView y;
    public TuxTextView z;

    static {
        Covode.recordClassIndex(96174);
    }

    private final EditPreviewProgressViewModel F() {
        return (EditPreviewProgressViewModel) this.J.getValue();
    }

    private final Handler G() {
        return (Handler) this.N.getValue();
    }

    private final Runnable H() {
        return (Runnable) this.O.getValue();
    }

    private final Keva I() {
        return (Keva) this.P.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a a() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.I.a(this, f146306a[0]);
    }

    public final VideoPublishEditModel b() {
        return (VideoPublishEditModel) this.L.a(this, f146306a[2]);
    }

    public final com.ss.android.ugc.asve.editor.g d() {
        return (com.ss.android.ugc.asve.editor.g) this.M.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class d {
        static {
            Covode.recordClassIndex(96178);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.V;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    static final class n extends h.f.b.m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f146323a = new n();

        static {
            Covode.recordClassIndex(96188);
        }

        n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("edit_page_long_press_tips");
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<Runnable> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(96190);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Runnable invoke() {
            return new Runnable(this) {
                /* class com.ss.android.ugc.gamora.editor.progressbar.a.a.p.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ p f146325a;

                static {
                    Covode.recordClassIndex(96191);
                }

                {
                    this.f146325a = r1;
                }

                public final void run() {
                    if (this.f146325a.this$0.G != null) {
                        TextView textView = this.f146325a.this$0.G;
                        if (textView == null) {
                            h.f.b.l.a("longPressTips");
                        }
                        textView.setVisibility(8);
                    }
                }
            };
        }
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

    static final class o extends h.f.b.m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f146324a = new o();

        static {
            Covode.recordClassIndex(96189);
        }

        o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.asve.editor.g> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(96192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.asve.editor.g invoke() {
            return this.this$0.a().C().getValue();
        }
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        G().removeCallbacks(H());
        com.ss.android.ugc.asve.editor.g d2 = d();
        if (d2 != null) {
            d2.b(this.Q);
        }
    }

    public final void D() {
        int i2;
        com.ss.android.ugc.asve.editor.g d2 = d();
        if (d2 != null) {
            i2 = d2.k();
        } else {
            i2 = 0;
        }
        this.u = i2;
        d(2);
        View view = this.F;
        if (view == null) {
            h.f.b.l.a("mProgressTimeLayout");
        }
        view.setVisibility(0);
        ImageView imageView = this.A;
        if (imageView == null) {
            h.f.b.l.a("statusImg");
        }
        imageView.setVisibility(8);
        F().a(true);
        this.f146311f = true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.a.a$a  reason: collision with other inner class name */
    public static final class C3912a extends h.f.b.m implements h.f.a.a<EditPreviewProgressViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(96175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3912a(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.progressbar.EditPreviewProgressViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.progressbar.EditPreviewProgressViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.progressbar.EditPreviewProgressViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_progressbar_ui_EditPreviewProgressScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_progressbar_ui_EditPreviewProgressScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.progressbar.a.a.C3912a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_gamora_editor_progressbar_ui_EditPreviewProgressScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<EditFilterViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(96176);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_progressbar_ui_EditPreviewProgressScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_progressbar_ui_EditPreviewProgressScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.progressbar.a.a.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_gamora_editor_progressbar_ui_EditPreviewProgressScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<EditToolbarViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(96177);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_progressbar_ui_EditPreviewProgressScene$$special$$inlined$hostViewModel$3_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_progressbar_ui_EditPreviewProgressScene$$special$$inlined$hostViewModel$3_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.progressbar.a.a.c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_gamora_editor_progressbar_ui_EditPreviewProgressScene$$special$$inlined$hostViewModel$3_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f146318a;

        static {
            Covode.recordClassIndex(96179);
        }

        e(a aVar) {
            this.f146318a = aVar;
        }

        public final void run() {
            Integer num;
            int i2;
            int intValue;
            int[] iArr = new int[2];
            a.d(this.f146318a).getLocationOnScreen(iArr);
            h.f.b.l.d(iArr, "");
            if (1 <= h.a.i.b(iArr)) {
                num = Integer.valueOf(iArr[1]);
            } else {
                num = null;
            }
            if (num == null || (intValue = num.intValue()) == -1) {
                i2 = -1;
            } else {
                i2 = Float.valueOf(((float) intValue) + r.a(15.0f) + ((float) a.d(this.f146318a).getHeight()));
            }
            a aVar = this.f146318a;
            ((com.bytedance.f.a.a.j) this.f146318a.getDiContainer().a((Type) com.bytedance.f.a.a.j.class, (String) null)).a(new com.bytedance.f.a.a.f(1, new com.ss.android.ugc.gamora.editor.progressbar.c((com.ss.android.ugc.gamora.editor.progressbar.a) aVar.f146307b.a(aVar, a.f146306a[1]), i2.intValue())));
        }
    }

    public final void C() {
        if (this.f146310e) {
            com.ss.android.ugc.asve.editor.g d2 = d();
            if (d2 != null) {
                d2.u();
            }
            ImageView imageView = this.A;
            if (imageView == null) {
                h.f.b.l.a("statusImg");
            }
            imageView.setVisibility(0);
            if (com.ss.android.ugc.aweme.property.ad.c()) {
                View view = this.F;
                if (view == null) {
                    h.f.b.l.a("mProgressTimeLayout");
                }
                view.setVisibility(0);
            }
            this.f146310e = false;
            d(1);
            J();
            return;
        }
        t<dmt.av.video.t> tVar = this.D;
        if (tVar == null) {
            h.f.b.l.a("mPreviewControlOpLiveData");
        }
        tVar.setValue(dmt.av.video.t.a());
        ImageView imageView2 = this.A;
        if (imageView2 == null) {
            h.f.b.l.a("statusImg");
        }
        imageView2.setVisibility(8);
        TextView textView = this.G;
        if (textView == null) {
            h.f.b.l.a("longPressTips");
        }
        textView.setVisibility(8);
        View view2 = this.F;
        if (view2 == null) {
            h.f.b.l.a("mProgressTimeLayout");
        }
        view2.setVisibility(8);
        d(0);
        this.f146310e = true;
    }

    public final void E() {
        int i2;
        String str;
        com.ss.android.ugc.asve.editor.g d2 = d();
        if (d2 != null) {
            i2 = d2.k();
        } else {
            i2 = 0;
        }
        this.v = i2;
        F().a(false);
        View view = this.F;
        if (view == null) {
            h.f.b.l.a("mProgressTimeLayout");
        }
        view.setVisibility(8);
        if (this.f146310e) {
            d(0);
            t<dmt.av.video.t> tVar = this.D;
            if (tVar == null) {
                h.f.b.l.a("mPreviewControlOpLiveData");
            }
            tVar.setValue(dmt.av.video.t.a());
        } else {
            ImageView imageView = this.A;
            if (imageView == null) {
                h.f.b.l.a("statusImg");
            }
            imageView.setVisibility(0);
            d(1);
        }
        this.f146311f = false;
        int i3 = this.v;
        int i4 = this.u;
        if (i3 - i4 > 0) {
            str = "forth";
        } else {
            str = "back";
        }
        a(str, "drag", i3 - i4);
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        if (this.f146314i) {
            return;
        }
        if (this.f146309d || this.f146310e) {
            this.f146309d = false;
            ImageView imageView = this.A;
            if (imageView == null) {
                h.f.b.l.a("statusImg");
            }
            imageView.setVisibility(8);
            View view = this.F;
            if (view == null) {
                h.f.b.l.a("mProgressTimeLayout");
            }
            view.setVisibility(8);
            d(0);
            t<dmt.av.video.t> tVar = this.D;
            if (tVar == null) {
                h.f.b.l.a("mPreviewControlOpLiveData");
            }
            tVar.setValue(dmt.av.video.t.a());
            this.f146310e = true;
        }
    }

    private final void J() {
        boolean z2;
        int i2;
        int i3;
        if (com.ss.android.ugc.aweme.property.ad.c()) {
            int i4 = I().getInt("long_press_day_count", 0);
            int i5 = I().getInt("long_press_total_count", 0);
            long j2 = I().getLong("long_press_start_time", 0);
            if (j2 == 0) {
                I().storeLong("long_press_start_time", System.currentTimeMillis());
            }
            if (System.currentTimeMillis() - j2 < 86400000) {
                z2 = true;
            } else {
                z2 = false;
            }
            com.ss.android.ugc.aweme.property.ac a2 = com.ss.android.ugc.aweme.property.ab.a();
            if (a2 != null) {
                i2 = a2.f118325a;
            } else {
                i2 = 0;
            }
            com.ss.android.ugc.aweme.property.ac a3 = com.ss.android.ugc.aweme.property.ab.a();
            if (a3 != null) {
                i3 = a3.f118326b;
            } else {
                i3 = 0;
            }
            if (!z2) {
                I().storeLong("long_press_start_time", System.currentTimeMillis());
                i4 = 0;
                if (i5 >= i3) {
                    return;
                }
            } else if (i4 >= i2 || i5 >= i3) {
                return;
            }
            TextView textView = this.G;
            if (textView == null) {
                h.f.b.l.a("longPressTips");
            }
            textView.setVisibility(0);
            I().storeInt("long_press_total_count", i5 + 1);
            I().storeInt("long_press_day_count", i4 + 1);
            G().postDelayed(H(), 3000);
        }
    }

    public static final class k implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f146320a;

        static {
            Covode.recordClassIndex(96185);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(a aVar) {
            this.f146320a = aVar;
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            this.f146320a.D();
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            this.f146320a.E();
        }

        public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            int i3;
            if (z || this.f146320a.f146316k) {
                com.ss.android.ugc.asve.editor.g d2 = this.f146320a.d();
                if (d2 != null) {
                    i3 = d2.j();
                } else {
                    i3 = 0;
                }
                a.a(this.f146320a).setValue(dmt.av.video.t.b((long) ((((float) i3) * ((float) i2)) / 100.0f)));
                a.a(this.f146320a).setValue(dmt.av.video.t.b());
            }
        }
    }

    public static final class l implements g.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f146321a;

        static {
            Covode.recordClassIndex(96186);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(a aVar) {
            this.f146321a = aVar;
        }

        @Override // com.ss.android.ugc.asve.editor.g.b
        public final void a(int i2) {
            long j2;
            if (!com.ss.android.ugc.aweme.property.ad.b()) {
                if (this.f146321a.f146312g) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.f146321a.w > 25 || currentTimeMillis - this.f146321a.w <= 0) {
                        j2 = 16;
                    } else {
                        j2 = currentTimeMillis - this.f146321a.w;
                    }
                    com.ss.android.ugc.asve.editor.g d2 = this.f146321a.d();
                    if (d2 != null) {
                        a.b(this.f146321a).setText(com.ss.android.ugc.gamora.editor.progress.f.a((float) this.f146321a.f146315j));
                        a.c(this.f146321a).setText(com.ss.android.ugc.gamora.editor.progress.f.a((float) d2.j()));
                    }
                    a aVar = this.f146321a;
                    aVar.a(aVar.f146313h, (int) j2);
                    this.f146321a.w = currentTimeMillis;
                    return;
                }
                if (!this.f146321a.f146311f) {
                    SeekBar seekBar = this.f146321a.B;
                    if (seekBar == null) {
                        h.f.b.l.a("progressSeek");
                    }
                    float f2 = (float) i2;
                    com.ss.android.ugc.asve.editor.g d3 = this.f146321a.d();
                    if (d3 == null) {
                        h.f.b.l.b();
                    }
                    seekBar.setProgress((int) ((f2 / ((float) d3.j())) * 100.0f));
                }
                com.ss.android.ugc.asve.editor.g d4 = this.f146321a.d();
                if (d4 != null) {
                    a.b(this.f146321a).setText(com.ss.android.ugc.gamora.editor.progress.f.a((float) i2));
                    a.c(this.f146321a).setText(com.ss.android.ugc.gamora.editor.progress.f.a((float) d4.j()));
                }
            }
        }
    }

    static final class m implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f146322a;

        static {
            Covode.recordClassIndex(96187);
        }

        m(a aVar) {
            this.f146322a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f146322a.C();
        }
    }

    public static final /* synthetic */ t a(a aVar) {
        t<dmt.av.video.t> tVar = aVar.D;
        if (tVar == null) {
            h.f.b.l.a("mPreviewControlOpLiveData");
        }
        return tVar;
    }

    public static final /* synthetic */ TuxTextView b(a aVar) {
        TuxTextView tuxTextView = aVar.y;
        if (tuxTextView == null) {
            h.f.b.l.a("curTime");
        }
        return tuxTextView;
    }

    public static final /* synthetic */ TuxTextView c(a aVar) {
        TuxTextView tuxTextView = aVar.z;
        if (tuxTextView == null) {
            h.f.b.l.a("totalTime");
        }
        return tuxTextView;
    }

    public static final /* synthetic */ RelativeLayout d(a aVar) {
        RelativeLayout relativeLayout = aVar.C;
        if (relativeLayout == null) {
            h.f.b.l.a("progressLayout");
        }
        return relativeLayout;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class i<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f146319a;

        static {
            Covode.recordClassIndex(96183);
        }

        i(a aVar) {
            this.f146319a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            h.p pVar = (h.p) obj;
            if (pVar != null) {
                a aVar = this.f146319a;
                int intValue = ((Number) pVar.getFirst()).intValue();
                if (intValue == 1) {
                    aVar.f146316k = true;
                    aVar.D();
                } else if (intValue == 2) {
                    SeekBar seekBar = aVar.B;
                    if (seekBar == null) {
                        h.f.b.l.a("progressSeek");
                    }
                    seekBar.setProgress(((Number) pVar.getSecond()).intValue());
                } else if (intValue == 3) {
                    aVar.E();
                    aVar.f146316k = false;
                }
            }
        }
    }

    public a(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.V = fVar;
        h.k.c a2 = h.f.b.ab.a(EditPreviewProgressViewModel.class);
        this.J = h.i.a((h.f.a.a) new C3912a(this, a2, a2));
        h.k.c a3 = h.f.b.ab.a(EditFilterViewModel.class);
        this.K = h.i.a((h.f.a.a) new b(this, a3, a3));
        h.k.c a4 = h.f.b.ab.a(EditToolbarViewModel.class);
        this.f146308c = h.i.a((h.f.a.a) new c(this, a4, a4));
        this.L = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
        this.M = h.i.a((h.f.a.a) new q(this));
        this.N = h.i.a((h.f.a.a) o.f146324a);
        this.O = h.i.a((h.f.a.a) new p(this));
        this.P = h.i.a((h.f.a.a) n.f146323a);
        this.f146310e = true;
        this.f146313h = -1;
        this.f146315j = -1;
        this.t = -1;
    }

    /* access modifiers changed from: package-private */
    public final void d(int i2) {
        if (!com.ss.android.ugc.gamora.editor.progressbar.d.b()) {
            return;
        }
        if (i2 == 0) {
            SeekBar seekBar = this.B;
            if (seekBar == null) {
                h.f.b.l.a("progressSeek");
            }
            Context context = this.E;
            if (context == null) {
                h.f.b.l.a("context");
            }
            seekBar.setThumb(androidx.core.content.b.a(context, (int) R.drawable.a71));
            SeekBar seekBar2 = this.B;
            if (seekBar2 == null) {
                h.f.b.l.a("progressSeek");
            }
            ViewGroup.LayoutParams layoutParams = seekBar2.getLayoutParams();
            layoutParams.height = this.S;
            SeekBar seekBar3 = this.B;
            if (seekBar3 == null) {
                h.f.b.l.a("progressSeek");
            }
            seekBar3.setLayoutParams(layoutParams);
        } else if (i2 == 1) {
            SeekBar seekBar4 = this.B;
            if (seekBar4 == null) {
                h.f.b.l.a("progressSeek");
            }
            Context context2 = this.E;
            if (context2 == null) {
                h.f.b.l.a("context");
            }
            seekBar4.setThumb(androidx.core.content.b.a(context2, (int) R.drawable.a72));
            SeekBar seekBar5 = this.B;
            if (seekBar5 == null) {
                h.f.b.l.a("progressSeek");
            }
            ViewGroup.LayoutParams layoutParams2 = seekBar5.getLayoutParams();
            layoutParams2.height = this.T;
            SeekBar seekBar6 = this.B;
            if (seekBar6 == null) {
                h.f.b.l.a("progressSeek");
            }
            seekBar6.setLayoutParams(layoutParams2);
        } else if (i2 == 2) {
            SeekBar seekBar7 = this.B;
            if (seekBar7 == null) {
                h.f.b.l.a("progressSeek");
            }
            Context context3 = this.E;
            if (context3 == null) {
                h.f.b.l.a("context");
            }
            seekBar7.setThumb(androidx.core.content.b.a(context3, (int) R.drawable.a70));
            SeekBar seekBar8 = this.B;
            if (seekBar8 == null) {
                h.f.b.l.a("progressSeek");
            }
            ViewGroup.LayoutParams layoutParams3 = seekBar8.getLayoutParams();
            layoutParams3.height = this.U;
            SeekBar seekBar9 = this.B;
            if (seekBar9 == null) {
                h.f.b.l.a("progressSeek");
            }
            seekBar9.setLayoutParams(layoutParams3);
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.D = a().v();
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = a().d().f156778e;
        if (vEEditorAutoStartStopArbiter != null) {
            vEEditorAutoStartStopArbiter.f156723c = true;
        }
        Context s = s();
        h.f.b.l.b(s, "");
        this.E = s;
        if (s == null) {
            h.f.b.l.a("context");
        }
        this.S = (int) r.a(s, 13.0f);
        Context context = this.E;
        if (context == null) {
            h.f.b.l.a("context");
        }
        this.T = (int) r.a(context, 14.0f);
        Context context2 = this.E;
        if (context2 == null) {
            h.f.b.l.a("context");
        }
        this.U = (int) r.a(context2, 16.0f);
        View c2 = c(R.id.at2);
        h.f.b.l.b(c2, "");
        this.y = (TuxTextView) c2;
        View c3 = c(R.id.at4);
        h.f.b.l.b(c3, "");
        this.z = (TuxTextView) c3;
        View c4 = c(R.id.at1);
        h.f.b.l.b(c4, "");
        this.A = (ImageView) c4;
        View c5 = c(R.id.ast);
        h.f.b.l.b(c5, "");
        this.R = (ImageView) c5;
        View c6 = c(R.id.at0);
        h.f.b.l.b(c6, "");
        SeekBar seekBar = (SeekBar) c6;
        this.B = seekBar;
        if (seekBar == null) {
            h.f.b.l.a("progressSeek");
        }
        seekBar.setEnabled(false);
        View c7 = c(R.id.asz);
        h.f.b.l.b(c7, "");
        this.C = (RelativeLayout) c7;
        View c8 = c(R.id.at3);
        h.f.b.l.b(c8, "");
        this.F = c8;
        View c9 = c(R.id.cjb);
        h.f.b.l.b(c9, "");
        this.G = (TextView) c9;
        View view = this.F;
        if (view == null) {
            h.f.b.l.a("mProgressTimeLayout");
        }
        view.setVisibility(8);
        ImageView imageView = this.A;
        if (imageView == null) {
            h.f.b.l.a("statusImg");
        }
        imageView.setOnClickListener(new m(this));
        if (com.ss.android.ugc.aweme.property.ad.b()) {
            RelativeLayout relativeLayout = this.C;
            if (relativeLayout == null) {
                h.f.b.l.a("progressLayout");
            }
            relativeLayout.setVisibility(8);
        } else {
            RelativeLayout relativeLayout2 = this.C;
            if (relativeLayout2 == null) {
                h.f.b.l.a("progressLayout");
            }
            ViewGroup.LayoutParams layoutParams = relativeLayout2.getLayoutParams();
            if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
                layoutParams = null;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                int c10 = com.ss.android.ugc.aweme.adaptation.a.c();
                if (com.ss.android.ugc.aweme.property.ad.c()) {
                    Context context3 = this.E;
                    if (context3 == null) {
                        h.f.b.l.a("context");
                    }
                    layoutParams2.bottomMargin = c10 + ((int) r.a(context3, 30.0f));
                } else if (com.ss.android.ugc.gamora.editor.progressbar.d.b()) {
                    Context context4 = this.E;
                    if (context4 == null) {
                        h.f.b.l.a("context");
                    }
                    layoutParams2.bottomMargin = c10 + ((int) r.a(context4, 15.0f));
                }
                RelativeLayout relativeLayout3 = this.C;
                if (relativeLayout3 == null) {
                    h.f.b.l.a("progressLayout");
                }
                relativeLayout3.setLayoutParams(layoutParams2);
            }
        }
        RelativeLayout relativeLayout4 = this.C;
        if (relativeLayout4 == null) {
            h.f.b.l.a("progressLayout");
        }
        relativeLayout4.post(new e(this));
        if (!com.ss.android.ugc.gamora.editor.progressbar.d.b()) {
            SeekBar seekBar2 = this.B;
            if (seekBar2 == null) {
                h.f.b.l.a("progressSeek");
            }
            seekBar2.setVisibility(8);
        } else {
            d(0);
            SeekBar seekBar3 = this.B;
            if (seekBar3 == null) {
                h.f.b.l.a("progressSeek");
            }
            seekBar3.setOnSeekBarChangeListener(new k(this));
        }
        this.Q = new l(this);
        com.ss.android.ugc.asve.editor.g d2 = d();
        if (d2 != null) {
            d2.a(this.Q);
        }
        b.a.b(this, F(), b.f146326a, new f(this));
        b.a.b(this, F(), c.f146327a, new g(this));
        b.a.b(this, F(), d.f146328a, new h(this));
        F().f146297b.observe(this, new i(this));
        f.a.b.b unused = selectSubscribe((EditFilterViewModel) this.K.getValue(), e.f146329a, new ah(), new j(this));
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.ati, viewGroup, false);
        h.f.b.l.b(a2, "");
        this.x = a2;
        if (a2 == null) {
            h.f.b.l.a("rootView");
        }
        return a2;
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends FilterBean>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(96184);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends FilterBean> dVar) {
            x.j jVar;
            com.ss.android.ugc.asve.editor.g d2;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(dVar, "");
            com.ss.android.ugc.asve.editor.g d3 = this.this$0.d();
            if (d3 != null) {
                jVar = d3.f();
            } else {
                jVar = null;
            }
            if (!(jVar == x.j.STARTED || (d2 = this.this$0.d()) == null)) {
                d2.w();
            }
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(96181);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            if (!this.this$0.f146317l) {
                if (this.this$0.f146310e) {
                    com.ss.android.ugc.aweme.common.r.a("click_edit_page_pause", new com.ss.android.ugc.tools.f.b().a("creation_id", this.this$0.b().creationId).a("content_source", bl.b(this.this$0.b())).a("content_type", bl.a(this.this$0.b())).a("shoot_way", this.this$0.b().mShootWay).a("creation_duration", this.this$0.b().getPreviewInfo().getPreviewVideoLength()).f149193a);
                }
                this.this$0.C();
            }
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(96180);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Integer num) {
            int i2;
            String str;
            int i3;
            int intValue = num.intValue();
            h.f.b.l.d(bVar, "");
            if (!this.this$0.f146317l && this.this$0.f146313h != intValue) {
                Context context = this.this$0.E;
                if (context == null) {
                    h.f.b.l.a("context");
                }
                if (!com.ss.android.ugc.aweme.tools.c.a(context) || intValue == -1) {
                    if (intValue == -1) {
                        if (intValue == -1) {
                            a aVar = this.this$0;
                            com.ss.android.ugc.asve.editor.g d2 = aVar.d();
                            if (d2 != null) {
                                i2 = d2.k();
                            } else {
                                i2 = 0;
                            }
                            aVar.v = i2;
                            a aVar2 = this.this$0;
                            if (aVar2.t == 1) {
                                str = "back";
                            } else {
                                str = "forth";
                            }
                            aVar2.a(str, "press", this.this$0.v - this.this$0.u);
                        }
                        this.this$0.f146313h = intValue;
                        this.this$0.a(intValue, 0);
                    }
                } else if (intValue == 1) {
                    intValue = 0;
                } else {
                    intValue = 1;
                }
                this.this$0.t = intValue;
                a aVar3 = this.this$0;
                com.ss.android.ugc.asve.editor.g d3 = aVar3.d();
                if (d3 != null) {
                    i3 = d3.k();
                } else {
                    i3 = 0;
                }
                aVar3.u = i3;
                this.this$0.f146313h = intValue;
                this.this$0.a(intValue, 0);
            }
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.p<? extends Integer, ? extends Integer>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(96182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, h.p<? extends Integer, ? extends Integer> pVar) {
            int intValue;
            Boolean bool;
            h.p<? extends Integer, ? extends Integer> pVar2 = pVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar2, "");
            a aVar = this.this$0;
            int intValue2 = ((Number) pVar2.getFirst()).intValue();
            if (intValue2 == 0) {
                aVar.f146309d = true;
            } else if (intValue2 == 1) {
                ImageView imageView = aVar.A;
                if (imageView == null) {
                    h.f.b.l.a("statusImg");
                }
                imageView.setVisibility(8);
                TextView textView = aVar.G;
                if (textView == null) {
                    h.f.b.l.a("longPressTips");
                }
                textView.setVisibility(8);
                View view = aVar.F;
                if (view == null) {
                    h.f.b.l.a("mProgressTimeLayout");
                }
                view.setVisibility(8);
                aVar.d(0);
                aVar.f146310e = true;
            } else if (!(intValue2 != 2 || (intValue = ((Number) pVar2.getSecond()).intValue()) == 4 || intValue == 3 || intValue == 14 || intValue == 9 || intValue == 15 || intValue == 13)) {
                LiveData<Boolean> c2 = ((EditToolbarViewModel) aVar.f146308c.getValue()).c(intValue);
                if (c2 != null) {
                    bool = c2.getValue();
                } else {
                    bool = null;
                }
                if (!h.f.b.l.a((Object) bool, (Object) false)) {
                    if (intValue != 5) {
                        if (intValue == 1) {
                        }
                        ImageView imageView2 = aVar.A;
                        if (imageView2 == null) {
                            h.f.b.l.a("statusImg");
                        }
                        imageView2.setVisibility(8);
                        View view2 = aVar.F;
                        if (view2 == null) {
                            h.f.b.l.a("mProgressTimeLayout");
                        }
                        view2.setVisibility(8);
                        aVar.d(0);
                        aVar.f146310e = true;
                    }
                    if (!aVar.f146310e) {
                        aVar.C();
                    }
                }
            }
            return z.f158842a;
        }
    }

    public final void a(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        TextView textView = this.G;
        if (textView == null) {
            h.f.b.l.a("longPressTips");
        }
        textView.setVisibility(8);
        int i7 = 0;
        if (i2 == -1) {
            this.f146312g = false;
            ImageView imageView = this.R;
            if (imageView == null) {
                h.f.b.l.a("mLongPressImg");
            }
            imageView.setVisibility(8);
            this.f146315j = -1;
            if (!this.f146310e) {
                View view = this.F;
                if (view == null) {
                    h.f.b.l.a("mProgressTimeLayout");
                }
                view.setVisibility(0);
                ImageView imageView2 = this.A;
                if (imageView2 == null) {
                    h.f.b.l.a("statusImg");
                }
                imageView2.setVisibility(0);
                return;
            }
            View view2 = this.F;
            if (view2 == null) {
                h.f.b.l.a("mProgressTimeLayout");
            }
            view2.setVisibility(8);
            t<dmt.av.video.t> tVar = this.D;
            if (tVar == null) {
                h.f.b.l.a("mPreviewControlOpLiveData");
            }
            tVar.setValue(dmt.av.video.t.a());
            return;
        }
        View view3 = this.F;
        if (view3 == null) {
            h.f.b.l.a("mProgressTimeLayout");
        }
        view3.setVisibility(0);
        ImageView imageView3 = this.R;
        if (imageView3 == null) {
            h.f.b.l.a("mLongPressImg");
        }
        imageView3.setVisibility(0);
        ImageView imageView4 = this.A;
        if (imageView4 == null) {
            h.f.b.l.a("statusImg");
        }
        imageView4.setVisibility(8);
        ImageView imageView5 = this.R;
        if (imageView5 == null) {
            h.f.b.l.a("mLongPressImg");
        }
        imageView5.setRotation(0.0f);
        if (i2 == 1) {
            ImageView imageView6 = this.R;
            if (imageView6 == null) {
                h.f.b.l.a("mLongPressImg");
            }
            imageView6.setRotation(180.0f);
        }
        com.ss.android.ugc.asve.editor.g d2 = d();
        if (d2 != null) {
            if (this.f146315j == -1) {
                this.f146315j = d2.k();
            }
            int j2 = d2.j();
            if (i2 == 0) {
                int i8 = this.f146315j;
                if (j2 <= 15000) {
                    i6 = i3 * 2;
                } else {
                    i6 = i3 * 3;
                }
                i5 = i8 + i6;
            } else {
                int i9 = this.f146315j;
                if (j2 <= 15000) {
                    i4 = i3 * 2;
                } else {
                    i4 = i3 * 3;
                }
                i5 = i9 - i4;
            }
            if (i5 >= 0 && i5 <= j2) {
                i7 = i5;
            }
            this.f146315j = i7;
            t<dmt.av.video.t> tVar2 = this.D;
            if (tVar2 == null) {
                h.f.b.l.a("mPreviewControlOpLiveData");
            }
            tVar2.setValue(dmt.av.video.t.a((long) i7));
            t<dmt.av.video.t> tVar3 = this.D;
            if (tVar3 == null) {
                h.f.b.l.a("mPreviewControlOpLiveData");
            }
            tVar3.setValue(dmt.av.video.t.b());
            this.f146312g = true;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    public final void a(String str, String str2, int i2) {
        com.ss.android.ugc.aweme.common.r.a("drag_edit_page_progress", new com.ss.android.ugc.tools.f.b().a("creation_id", b().creationId).a("content_source", bl.b(b())).a("content_type", bl.a(b())).a("direction", str).a("drag_time", Math.abs(i2)).a("is_pause", !this.f146310e ? 1 : 0).a("enter_method", str2).a("shoot_way", b().mShootWay).a("creation_duration", b().getPreviewInfo().getPreviewVideoLength()).f149193a);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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

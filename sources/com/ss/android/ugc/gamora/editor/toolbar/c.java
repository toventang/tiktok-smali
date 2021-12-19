package com.ss.android.ugc.gamora.editor.toolbar;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
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
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.property.av;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.edit.k;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.s;
import h.f.b.y;
import h.z;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class c extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f147074a = {new y(c.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new y(c.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0)};

    /* renamed from: k  reason: collision with root package name */
    public static final f f147075k = new f((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final h.h f147076b = h.i.a(h.m.NONE, new C3946c(this));

    /* renamed from: c  reason: collision with root package name */
    public FrameLayout f147077c;

    /* renamed from: d  reason: collision with root package name */
    public RelativeLayout f147078d;

    /* renamed from: e  reason: collision with root package name */
    public View f147079e;

    /* renamed from: f  reason: collision with root package name */
    SeekBarHelpLinearLayout f147080f;

    /* renamed from: g  reason: collision with root package name */
    public EditProcessBarView f147081g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Integer, View> f147082h = new LinkedHashMap();

    /* renamed from: i  reason: collision with root package name */
    t f147083i;

    /* renamed from: j  reason: collision with root package name */
    final h.h.d f147084j = new e(this, this);

    /* renamed from: l  reason: collision with root package name */
    private final h.h f147085l;
    private final h.h.d t = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
    private final h.h u = h.i.a(h.m.NONE, new a(this));
    private final h.h v = h.i.a(h.m.NONE, new d(this));
    private final boolean w = av.a();
    private final com.bytedance.o.f x;

    static {
        Covode.recordClassIndex(96873);
    }

    public final com.ss.android.ugc.gamora.editor.progressbar.a C() {
        return (com.ss.android.ugc.gamora.editor.progressbar.a) this.v.getValue();
    }

    public final EditToolbarViewModel a() {
        return (EditToolbarViewModel) this.f147085l.getValue();
    }

    public final VideoPublishEditModel b() {
        return (VideoPublishEditModel) this.t.a(this, f147074a[0]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a d() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.u.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class f {
        static {
            Covode.recordClassIndex(96879);
        }

        private f() {
        }

        public /* synthetic */ f(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.x;
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
            Covode.recordClassIndex(96874);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.toolbar.c.a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.c$c  reason: collision with other inner class name */
    public static final class C3946c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.progress.a> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(96876);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3946c(com.bytedance.o.a aVar) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.toolbar.c.C3946c.invoke():com.bytedance.als.b");
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.progressbar.a> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(96877);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.progressbar.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.progressbar.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.progressbar.a> r1 = com.ss.android.ugc.gamora.editor.progressbar.a.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.toolbar.c.d.invoke():com.bytedance.als.b");
        }
    }

    public final boolean D() {
        if (b().mShoutOutsData == null || !h.f.b.l.a((Object) com.ss.android.ugc.aweme.shoutouts.d.MODE_SEND, (Object) b().mShoutOutsData.getShoutOutsMode())) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        t tVar = this.f147083i;
        if (tVar != null) {
            tVar.a();
        }
        EditProcessBarView editProcessBarView = this.f147081g;
        if (editProcessBarView != null) {
            editProcessBarView.f146972d.cancel();
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<EditToolbarViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(96875);
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_toolbar_EditBottomBarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_toolbar_EditBottomBarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.toolbar.c.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_gamora_editor_toolbar_EditBottomBarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    @Override // com.bytedance.scene.j
    public final void e(Bundle bundle) {
        super.e(bundle);
    }

    public static final class n extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147094a;

        static {
            Covode.recordClassIndex(96887);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(c cVar) {
            super(600);
            this.f147094a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            String str;
            this.f147094a.d().L();
            com.ss.android.ugc.gamora.editor.progress.a aVar = (com.ss.android.ugc.gamora.editor.progress.a) this.f147094a.f147076b.getValue();
            if (aVar != null) {
                aVar.a(-1);
            }
            com.ss.android.ugc.gamora.editor.progressbar.a C = this.f147094a.C();
            if (C != null) {
                C.a(0, -1);
            }
            if (this.f147094a.D()) {
                c cVar = this.f147094a;
                if (cVar.f42913m != null) {
                    Activity activity = cVar.f42913m;
                    if (activity == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(activity, "");
                    if (!activity.isFinishing()) {
                        a.C0731a aVar2 = new a.C0731a(cVar.f42913m);
                        a.C0731a a2 = aVar2.a(R.string.ga6);
                        String string = cVar.t().getResources().getString(R.string.ga5);
                        h.f.b.l.b(string, "");
                        Object[] objArr = new Object[1];
                        com.ss.android.ugc.aweme.shoutouts.i shoutOutSettingsModel = AVExternalServiceImpl.a().shoutOutsService().getShoutOutSettingsModel();
                        if (!TextUtils.isEmpty(shoutOutSettingsModel.f133179a)) {
                            str = shoutOutSettingsModel.f133179a;
                            if (str == null) {
                                h.f.b.l.b();
                            }
                        } else {
                            str = "24";
                        }
                        objArr[0] = str;
                        String a3 = com.a.a(string, Arrays.copyOf(objArr, 1));
                        h.f.b.l.b(a3, "");
                        a2.f33402b = a3;
                        a2.a(R.string.c7, (DialogInterface.OnClickListener) new o(cVar), false);
                        aVar2.a().c();
                        com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
                        if (cVar.b().isShoutout()) {
                            bVar.a("enter_from", "video_edit_page");
                            bVar.a("reviewed", cVar.b().mShoutOutsData.getReviewed());
                            if (!TextUtils.isEmpty(cVar.b().mShoutOutsData.getOrderId())) {
                                bVar.a(com.ss.android.ugc.aweme.shoutouts.d.MOD_ORDER_ID, cVar.b().mShoutOutsData.getOrderId());
                            }
                        }
                        r.a("show_submitting_thanks_pop_up", bVar.f149193a);
                        return;
                    }
                    return;
                }
                return;
            }
            bj.a("VEVideoPublishEditActivity nextStep OnClick");
            this.f147094a.d().N();
        }
    }

    public static final /* synthetic */ RelativeLayout a(c cVar) {
        RelativeLayout relativeLayout = cVar.f147078d;
        if (relativeLayout == null) {
            h.f.b.l.a("bottomLayout");
        }
        return relativeLayout;
    }

    public static final /* synthetic */ FrameLayout b(c cVar) {
        FrameLayout frameLayout = cVar.f147077c;
        if (frameLayout == null) {
            h.f.b.l.a("bottomBarRootLayout");
        }
        return frameLayout;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class l<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147092a;

        static {
            Covode.recordClassIndex(96885);
        }

        l(c cVar) {
            this.f147092a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            FrameLayout b2 = c.b(this.f147092a);
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            b2.setVisibility(i2);
        }
    }

    public static final class g extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.k f147088a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.gamora.editor.y f147089b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f147090c;

        static {
            Covode.recordClassIndex(96880);
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            if (this.f147088a.b()) {
                this.f147090c.a().f146976b = true;
                this.f147088a.a();
            } else {
                this.f147090c.a().f146976b = false;
            }
            this.f147090c.a().a(this.f147089b.f147356a);
        }

        g(com.ss.android.ugc.aweme.shortvideo.edit.k kVar, com.ss.android.ugc.gamora.editor.y yVar, c cVar) {
            this.f147088a = kVar;
            this.f147089b = yVar;
            this.f147090c = cVar;
        }
    }

    static final class i<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147091a;

        static {
            Covode.recordClassIndex(96882);
        }

        i(c cVar) {
            this.f147091a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                View view = this.f147091a.f147079e;
                if (view == null) {
                    h.f.b.l.a("nextStep");
                }
                int i3 = 0;
                if (bool.booleanValue()) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                view.setVisibility(i2);
                EditProcessBarView editProcessBarView = this.f147091a.f147081g;
                if (editProcessBarView != null) {
                    if (!bool.booleanValue()) {
                        i3 = 8;
                    }
                    editProcessBarView.setVisibility(i3);
                }
            }
        }
    }

    static final class m<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147093a;

        static {
            Covode.recordClassIndex(96886);
        }

        m(c cVar) {
            this.f147093a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            if (this.f147093a.f147077c != null) {
                FrameLayout b2 = c.b(this.f147093a);
                h.f.b.l.b(bool, "");
                if (bool.booleanValue()) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                b2.setVisibility(i2);
            }
        }
    }

    public c(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.x = fVar;
        h.k.c a2 = h.f.b.ab.a(EditToolbarViewModel.class);
        this.f147085l = h.i.a((h.f.a.a) new b(this, a2, a2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0207, code lost:
        if (com.ss.android.ugc.aweme.property.a.a.a() != false) goto L_0x0209;
     */
    @Override // com.bytedance.scene.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.os.Bundle r17) {
        /*
        // Method dump skipped, instructions count: 898
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.toolbar.c.a(android.os.Bundle):void");
    }

    public static final class e implements h.h.d<Object, com.ss.android.ugc.gamora.editor.music.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.a f147086a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f147087b;

        static {
            Covode.recordClassIndex(96878);
        }

        public e(com.bytedance.o.a aVar, c cVar) {
            this.f147086a = aVar;
            this.f147087b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.h.d
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.music.a a(Object obj, h.k.i iVar) {
            h.f.b.l.d(obj, "");
            h.f.b.l.d(iVar, "");
            Object b2 = this.f147086a.getDiContainer().b(com.ss.android.ugc.gamora.editor.music.a.class, null);
            if (bp.l(this.f147087b.b())) {
                return b2;
            }
            return null;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Integer, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96884);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Integer num) {
            int intValue = num.intValue();
            h.f.b.l.d(bVar, "");
            ViewGroup.LayoutParams layoutParams = c.a(this.this$0).getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.height = intValue;
                c.a(this.this$0).setLayoutParams(marginLayoutParams);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        if (this.f42913m != null) {
            Activity activity = this.f42913m;
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            if (com.ss.android.ugc.gamora.editor.d.a.a(activity)) {
                View a2 = com.a.a(layoutInflater, R.layout.asx, viewGroup, false);
                h.f.b.l.b(a2, "");
                return a2;
            }
        }
        View a3 = com.a.a(layoutInflater, R.layout.asw, viewGroup, false);
        h.f.b.l.b(a3, "");
        return a3;
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            if (booleanValue) {
                View view = this.this$0.f147082h.get(11);
                if (view != null) {
                    Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
                    ((com.ss.android.ugc.aweme.shortvideo.edit.k) view).setIcon(2131232586);
                }
            } else {
                View view2 = this.this$0.f147082h.get(11);
                if (view2 != null) {
                    Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
                    ((com.ss.android.ugc.aweme.shortvideo.edit.k) view2).setIcon(2131232585);
                }
            }
            return z.f158842a;
        }
    }

    static final class o implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147095a;

        static {
            Covode.recordClassIndex(96888);
        }

        o(c cVar) {
            this.f147095a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            bj.a("VEVideoPublishEditActivity nextStep OnClick");
            this.f147095a.d().N();
            if (this.f147095a.b().isShoutout()) {
                com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
                bVar.a("enter_from", "video_edit_page");
                bVar.a("reviewed", this.f147095a.b().mShoutOutsData.getReviewed());
                if (!TextUtils.isEmpty(this.f147095a.b().mShoutOutsData.getOrderId())) {
                    bVar.a(com.ss.android.ugc.aweme.shoutouts.d.MOD_ORDER_ID, this.f147095a.b().mShoutOutsData.getOrderId());
                }
                r.a("submit_shoutouts_order_video", bVar.f149193a);
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.a(view, bundle);
        View c2 = c(R.id.dsk);
        h.f.b.l.b(c2, "");
        this.f147077c = (FrameLayout) c2;
        View c3 = c(R.id.c51);
        h.f.b.l.b(c3, "");
        this.f147078d = (RelativeLayout) c3;
        View c4 = c(R.id.v_);
        h.f.b.l.b(c4, "");
        this.f147080f = (SeekBarHelpLinearLayout) c4;
        View c5 = c(R.id.cv4);
        h.f.b.l.b(c5, "");
        this.f147079e = c5;
        EditProcessBarView editProcessBarView = (EditProcessBarView) c(R.id.dc1);
        this.f147081g = editProcessBarView;
        if (editProcessBarView == null) {
            h.f.b.l.b();
        }
        editProcessBarView.setVisibility(8);
        if (com.ss.android.ugc.aweme.property.ad.e()) {
            SeekBarHelpLinearLayout seekBarHelpLinearLayout = this.f147080f;
            if (seekBarHelpLinearLayout == null) {
                h.f.b.l.a("bottomBarContainer");
            }
            seekBarHelpLinearLayout.setEditPreviewProgressApi(C());
        }
        View view2 = this.f147079e;
        if (view2 == null) {
            h.f.b.l.a("nextStep");
        }
        view2.setOnClickListener(new n(this));
        if (this.f42913m != null) {
            Activity activity = this.f42913m;
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            if (com.ss.android.ugc.gamora.editor.d.a.a(activity)) {
                Activity activity2 = this.f42913m;
                if (activity2 == null) {
                    h.f.b.l.b();
                }
                if (com.ss.android.ugc.aweme.tools.c.a(activity2)) {
                    View view3 = this.f147079e;
                    if (view3 == null) {
                        h.f.b.l.a("nextStep");
                    }
                    h.f.b.l.b(activity2, "");
                    view3.setBackground(activity2.getResources().getDrawable(R.drawable.e3));
                } else {
                    View view4 = this.f147079e;
                    if (view4 == null) {
                        h.f.b.l.a("nextStep");
                    }
                    h.f.b.l.b(activity2, "");
                    view4.setBackground(activity2.getResources().getDrawable(R.drawable.e2));
                }
            }
        }
        if (D() && this.f42913m != null) {
            Activity activity3 = this.f42913m;
            if (activity3 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity3, "");
            if (!com.ss.android.ugc.gamora.editor.d.a.a(activity3)) {
                View view5 = this.f147079e;
                if (view5 == null) {
                    h.f.b.l.a("nextStep");
                }
                Objects.requireNonNull(view5, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) view5).setText(R.string.fyq);
            }
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, List<? extends com.ss.android.ugc.gamora.editor.y>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96881);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, List<? extends com.ss.android.ugc.gamora.editor.y> list) {
            HashMap<String, Integer> extraShareOptions;
            HashMap<String, Integer> extraShareOptions2;
            Integer num;
            List<? extends com.ss.android.ugc.gamora.editor.y> list2 = list;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(list2, "");
            c cVar = this.this$0;
            SeekBarHelpLinearLayout seekBarHelpLinearLayout = cVar.f147080f;
            if (seekBarHelpLinearLayout == null) {
                h.f.b.l.a("bottomBarContainer");
            }
            seekBarHelpLinearLayout.removeAllViews();
            cVar.f147082h.clear();
            for (T t : list2) {
                Activity activity = cVar.f42913m;
                if (activity == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(activity, "");
                com.ss.android.ugc.aweme.shortvideo.edit.k a2 = k.a.a(activity, t.f147358c, t.f147357b);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.leftMargin = (int) com.bytedance.common.utility.n.b(cVar.q(), 4.0f);
                SeekBarHelpLinearLayout seekBarHelpLinearLayout2 = cVar.f147080f;
                if (seekBarHelpLinearLayout2 == null) {
                    h.f.b.l.a("bottomBarContainer");
                }
                seekBarHelpLinearLayout2.addView(a2, layoutParams);
                cVar.f147082h.put(Integer.valueOf(t.f147356a), a2);
                a2.setOnClickListener(new g(a2, t, cVar));
                if (t.f147356a == 1 && (extraShareOptions = cVar.b().creativeFlowData.getExtraShareOptions()) != null && extraShareOptions.containsKey("tiktok_videokit_disable_music_selection") && (extraShareOptions2 = cVar.b().creativeFlowData.getExtraShareOptions()) != null && (num = extraShareOptions2.get("tiktok_videokit_disable_music_selection")) != null && num.intValue() == 1) {
                    cVar.b();
                    AVDmtTextView aVDmtTextView = a2.f127804a;
                    if (aVDmtTextView == null) {
                        h.f.b.l.a("mToolTv");
                    }
                    aVDmtTextView.setAlpha(0.5f);
                    SimpleDraweeView simpleDraweeView = a2.f127805b;
                    if (simpleDraweeView == null) {
                        h.f.b.l.a("mToolIv");
                    }
                    simpleDraweeView.setAlpha(0.5f);
                    a2.setOnClickListener(new k.b(a2));
                }
            }
            t tVar = cVar.f147083i;
            if (tVar != null) {
                tVar.a();
            }
            Activity activity2 = cVar.f42913m;
            Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            VideoPublishEditModel b2 = cVar.b();
            EditToolbarViewModel a3 = cVar.a();
            com.bytedance.scene.j jVar = cVar.o;
            Objects.requireNonNull(jVar, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
            t tVar2 = new t((androidx.fragment.app.e) activity2, b2, a3, (com.bytedance.scene.group.b) jVar, (com.ss.android.ugc.gamora.editor.music.a) cVar.f147084j.a(cVar, c.f147074a[1]));
            tVar2.a(cVar.f147082h);
            tVar2.b(cVar.f147082h);
            tVar2.c(cVar.f147082h);
            tVar2.a(cVar.f147082h, 48);
            if (bp.l(cVar.b())) {
                cVar.a().f146975a.f145949c = com.ss.android.ugc.aweme.port.in.g.a().e().getCombinedShootModeTipShown(true);
                tVar2.a(cVar.f147082h.get(1));
            }
            View view = cVar.f147082h.get(1);
            if (view != null) {
                Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
                tVar2.a(cVar, (com.ss.android.ugc.aweme.shortvideo.edit.k) view);
            }
            cVar.f147083i = tVar2;
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
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
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
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

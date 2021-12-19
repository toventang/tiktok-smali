package com.bytedance.creativex.recorder.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.a.g;
import com.bytedance.creativex.recorder.b.a.ac;
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
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.tools.beauty.e.b.a;
import com.ss.android.ugc.aweme.tools.beauty.impl.view.InternalBeautyPanel;
import com.ss.android.ugc.aweme.tools.beauty.service.f;
import com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl;
import com.ss.android.ugc.tools.view.widget.j;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.k.i;
import h.k.k;
import h.z;
import java.util.Objects;

public final class m extends j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f28155a = {new y(m.class, "beautyApi", "getBeautyApi()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0), new y(m.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(m.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0)};

    /* renamed from: g  reason: collision with root package name */
    public static final a f28156g = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final h.h.d f28157b;

    /* renamed from: c  reason: collision with root package name */
    TextView f28158c;

    /* renamed from: d  reason: collision with root package name */
    public final g f28159d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.beauty.service.f f28160e;

    /* renamed from: f  reason: collision with root package name */
    public final h.f.a.b<f.a, f.a> f28161f;

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f28162h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f28163i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f28164j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f28165k;

    /* renamed from: l  reason: collision with root package name */
    private final h.f.a.b<com.ss.android.ugc.aweme.tools.beauty.b.a.e, z> f28166l;
    private final com.bytedance.o.f t;
    private final com.ss.android.ugc.aweme.tools.beauty.service.a.a u;
    private final com.ss.android.ugc.aweme.tools.beauty.e.b.a v;
    private final h.f.a.a<Integer> w;

    static {
        Covode.recordClassIndex(16486);
    }

    private final f.a C() {
        return (f.a) this.f28165k.getValue();
    }

    private final com.ss.android.ugc.tools.view.a.a d() {
        return (com.ss.android.ugc.tools.view.a.a) this.f28164j.getValue();
    }

    public final com.bytedance.creativex.recorder.a.a.a a() {
        return (com.bytedance.creativex.recorder.a.a.a) this.f28162h.a(this, f28155a[0]);
    }

    public final com.bytedance.creativex.recorder.b.a.d b() {
        return (com.bytedance.creativex.recorder.b.a.d) this.f28163i.a(this, f28155a[1]);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(16487);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class e implements com.ss.android.ugc.aweme.tools.beauty.e.b.c {
        static {
            Covode.recordClassIndex(16495);
        }

        e() {
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.e.b.c
        public final void a(Context context, String str) {
            l.d(context, "");
            l.d(str, "");
            j.a.a(context, str, 0).a();
        }
    }

    public static final class g implements com.ss.android.ugc.aweme.tools.beauty.e.b.a {
        static {
            Covode.recordClassIndex(16497);
        }

        g() {
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.e.b.a
        public final void a(a.C3665a aVar) {
            l.d(aVar, "");
            AlertDialog.Builder builder = new AlertDialog.Builder(aVar.f138925a);
            builder.setTitle(aVar.f138926b).setMessage(aVar.f138927c).setPositiveButton(aVar.f138928d, new a(aVar)).setNegativeButton(aVar.f138929e, new b(aVar));
            AlertDialog create = builder.create();
            create.setCanceledOnTouchOutside(false);
            create.setCancelable(false);
            create.show();
        }

        static final class a implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a.C3665a f28169a;

            static {
                Covode.recordClassIndex(16498);
            }

            a(a.C3665a aVar) {
                this.f28169a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                a.b bVar = this.f28169a.f138930f;
                if (bVar != null) {
                    bVar.a();
                }
            }
        }

        static final class b implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a.C3665a f28170a;

            static {
                Covode.recordClassIndex(16499);
            }

            b(a.C3665a aVar) {
                this.f28170a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                a.b bVar = this.f28170a.f138930f;
                if (bVar != null) {
                    bVar.b();
                }
            }
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.t;
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.tools.view.a.a> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(16488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(m mVar) {
            super(0);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.tools.view.a.a invoke() {
            return new com.ss.android.ugc.tools.view.a.a(this) {
                /* class com.bytedance.creativex.recorder.a.m.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f28167a;

                static {
                    Covode.recordClassIndex(16489);
                }

                {
                    this.f28167a = r1;
                }

                @Override // com.ss.android.ugc.tools.view.a.a
                public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
                    com.bytedance.scene.navigation.d a2;
                    if (i2 != 4 || (a2 = com.bytedance.scene.ktx.b.a(this.f28167a.this$0)) == null || !com.ss.android.ugc.aweme.scene.a.a(a2, m.class)) {
                        return false;
                    }
                    com.ss.android.ugc.aweme.tools.beauty.service.f fVar = this.f28167a.this$0.f28160e;
                    if (fVar != null) {
                        fVar.c();
                    }
                    return true;
                }
            };
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<f.a> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(16490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(m mVar) {
            super(0);
            this.this$0 = mVar;
        }

        public static final class a extends com.ss.android.ugc.aweme.tools.beauty.f.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f28168a;

            static {
                Covode.recordClassIndex(16491);
            }

            @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.a, com.ss.android.ugc.aweme.tools.beauty.f.a
            public final void a() {
                this.f28168a.this$0.b().a(new ac(false, false, 6));
            }

            @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.a, com.ss.android.ugc.aweme.tools.beauty.f.a
            public final void b() {
                androidx.lifecycle.i lifecycle = this.f28168a.this$0.getLifecycle();
                l.b(lifecycle, "");
                if (lifecycle.a().isAtLeast(i.b.CREATED)) {
                    com.bytedance.scene.navigation.d a2 = com.bytedance.scene.ktx.b.a(this.f28168a.this$0);
                    if (a2 == null) {
                        l.b();
                    }
                    a2.E();
                    m mVar = this.f28168a.this$0;
                    com.bytedance.creativex.recorder.gesture.api.b bVar = (com.bytedance.creativex.recorder.gesture.api.b) mVar.f28157b.a(mVar, m.f28155a[2]);
                    if (bVar != null) {
                        com.bytedance.creativex.recorder.gesture.api.c.a(bVar, false);
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar, com.ss.android.ugc.aweme.tools.beauty.service.d dVar) {
                super(dVar);
                this.f28168a = cVar;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a invoke() {
            f.a invoke;
            a aVar = new a(this, this.this$0.a());
            h.f.a.b<f.a, f.a> bVar = this.this$0.f28161f;
            return (bVar == null || (invoke = bVar.invoke(aVar)) == null) ? aVar : invoke;
        }
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        if (this.f42913m instanceof com.ss.android.ugc.tools.view.a.c) {
            Activity activity = this.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
            ((com.ss.android.ugc.tools.view.a.c) activity).c(d());
        }
        b().a(new ac(true, false, 6));
        com.ss.android.ugc.aweme.tools.beauty.service.f fVar = this.f28160e;
        if (fVar != null) {
            fVar.c();
        }
        this.f28160e = null;
        this.f28159d.f28079g.D().getEffectController().b();
    }

    public /* synthetic */ m(com.bytedance.o.f fVar) {
        this(fVar, new com.ss.android.ugc.aweme.tools.beauty.service.a.a(), null, null, null);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class d extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.tools.beauty.b.a.e, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(16492);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(m mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.tools.beauty.b.a.e eVar) {
            com.ss.android.ugc.aweme.tools.beauty.b.a.e eVar2 = eVar;
            l.d(eVar2, "");
            AnonymousClass1 r1 = new h.f.a.b<com.ss.android.ugc.aweme.tools.beauty.b.a.d, z>(this) {
                /* class com.bytedance.creativex.recorder.a.m.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(16493);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.tools.beauty.b.a.d dVar) {
                    boolean z;
                    com.ss.android.ugc.aweme.tools.beauty.b.a.d dVar2 = dVar;
                    l.d(dVar2, "");
                    int itemShape = this.this$0.this$0.a().i().u().getItemShape();
                    boolean z2 = false;
                    if (itemShape == 0 || itemShape != 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    dVar2.f138847e = z;
                    if (this.this$0.this$0.a().d() && !this.this$0.this$0.a().e()) {
                        z2 = true;
                    }
                    dVar2.q = z2;
                    dVar2.r = this.this$0.this$0.a().e();
                    return z.f158842a;
                }
            };
            l.d(r1, "");
            r1.invoke(eVar2.f138859c);
            AnonymousClass2 r12 = new h.f.a.b<com.ss.android.ugc.aweme.tools.beauty.b.a.h, z>(this) {
                /* class com.bytedance.creativex.recorder.a.m.d.AnonymousClass2 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(16494);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.tools.beauty.b.a.h hVar) {
                    com.ss.android.ugc.aweme.tools.beauty.b.a.h hVar2 = hVar;
                    l.d(hVar2, "");
                    hVar2.f138882b = this.this$0.this$0.a().i().u().getHasTitle();
                    return z.f158842a;
                }
            };
            l.d(r12, "");
            r12.invoke(eVar2.f138861e);
            eVar2.n = this.this$0.f28159d.f28078f;
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(16500);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(m mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            TextView textView;
            TextView textView2;
            if (bool.booleanValue()) {
                m mVar = this.this$0;
                TextView textView3 = mVar.f28158c;
                if ((textView3 == null || textView3.getVisibility() != 0) && (textView2 = mVar.f28158c) != null) {
                    textView2.setVisibility(0);
                }
            } else {
                m mVar2 = this.this$0;
                TextView textView4 = mVar2.f28158c;
                if ((textView4 == null || textView4.getVisibility() != 8) && (textView = mVar2.f28158c) != null) {
                    textView.setVisibility(8);
                }
            }
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v4, resolved type: com.ss.android.ugc.aweme.tools.beauty.impl.view.InternalBeautyPanel */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        ComposerBeautyViewImpl composerBeautyViewImpl;
        super.a(bundle);
        com.ss.android.ugc.aweme.tools.beauty.e.a.n = true;
        e eVar = new e();
        l.d(eVar, "");
        com.ss.android.ugc.aweme.tools.beauty.e.a.f138913c = eVar;
        com.ss.android.ugc.aweme.tools.beauty.e.a.f138914d = new f(this);
        com.ss.android.ugc.aweme.tools.beauty.e.b.a aVar = this.v;
        if (aVar == null) {
            aVar = new g();
        }
        l.d(aVar, "");
        com.ss.android.ugc.aweme.tools.beauty.e.a.f138915e = aVar;
        FrameLayout frameLayout = (FrameLayout) this.n.findViewById(R.id.dis);
        com.ss.android.ugc.aweme.tools.beauty.service.f fVar = this.f28160e;
        if (fVar == null) {
            l.b(frameLayout, "");
            if (com.ss.android.ugc.aweme.tools.beauty.e.a.r) {
                com.ss.android.ugc.aweme.tools.beauty.f fVar2 = new com.ss.android.ugc.aweme.tools.beauty.f(a().i(), this.u, this.f28166l);
                Activity t2 = t();
                l.b(t2, "");
                f.a C = C();
                boolean z = com.ss.android.ugc.aweme.tools.beauty.e.a.o;
                l.d(t2, "");
                l.d(frameLayout, "");
                l.d(C, "");
                InternalBeautyPanel.a aVar2 = new InternalBeautyPanel.a(t2, frameLayout, fVar2.f138932b);
                aVar2.f139035d = fVar2.f138933c;
                fVar2.f138931a.f138903m = z;
                com.ss.android.ugc.aweme.tools.beauty.b.a.e eVar2 = fVar2.f138931a;
                l.d(eVar2, "");
                aVar2.f139032a = eVar2;
                aVar2.f139033b = C;
                InternalBeautyPanel internalBeautyPanel = new InternalBeautyPanel(aVar2.f139036e, aVar2.f139037f, aVar2.f139038g, aVar2.f139032a, (byte) 0);
                internalBeautyPanel.setContainer(aVar2.f139037f);
                internalBeautyPanel.f139030l = aVar2.f139033b;
                com.ss.android.ugc.aweme.tools.beauty.impl.view.c cVar = internalBeautyPanel.f139020b;
                if (cVar == null) {
                    l.a("listBusiness");
                }
                cVar.f139052c = internalBeautyPanel.f139030l;
                com.ss.android.ugc.aweme.tools.beauty.impl.view.d dVar = internalBeautyPanel.f139026h;
                if (dVar == null) {
                    l.a("beautyResetBusiness");
                }
                dVar.f139056b = internalBeautyPanel.f139030l;
                com.ss.android.ugc.aweme.tools.beauty.impl.view.e eVar3 = internalBeautyPanel.f139024f;
                if (eVar3 == null) {
                    l.a("seekBarBusiness");
                }
                eVar3.f139065b = internalBeautyPanel.f139030l;
                com.ss.android.ugc.aweme.tools.beauty.impl.view.b bVar = internalBeautyPanel.f139028j;
                if (bVar == null) {
                    l.a("enableViewBusiness");
                }
                bVar.f139046b = internalBeautyPanel.f139030l;
                if (aVar2.f139034c != null) {
                    internalBeautyPanel.f139031m = aVar2.f139034c;
                    com.ss.android.ugc.aweme.tools.beauty.impl.view.c cVar2 = internalBeautyPanel.f139020b;
                    if (cVar2 == null) {
                        l.a("listBusiness");
                    }
                    cVar2.f139051b = internalBeautyPanel.f139031m;
                    com.ss.android.ugc.aweme.tools.beauty.impl.view.e eVar4 = internalBeautyPanel.f139024f;
                    if (eVar4 == null) {
                        l.a("seekBarBusiness");
                    }
                    eVar4.f139066c = internalBeautyPanel.f139031m;
                    com.ss.android.ugc.aweme.tools.beauty.impl.view.d dVar2 = internalBeautyPanel.f139026h;
                    if (dVar2 == null) {
                        l.a("beautyResetBusiness");
                    }
                    dVar2.f139057c = internalBeautyPanel.f139031m;
                    com.ss.android.ugc.aweme.tools.beauty.impl.view.f fVar3 = internalBeautyPanel.f139022d;
                    if (fVar3 == null) {
                        l.a("tabViewBusiness");
                    }
                    fVar3.f139072c = internalBeautyPanel.f139031m;
                }
                internalBeautyPanel.n.f139043a = aVar2.f139035d;
                composerBeautyViewImpl = internalBeautyPanel;
            } else {
                com.ss.android.ugc.aweme.tools.beauty.e eVar5 = new com.ss.android.ugc.aweme.tools.beauty.e(a().i(), this.u, this.f28166l);
                Activity t3 = t();
                l.b(t3, "");
                f.a C2 = C();
                boolean z2 = com.ss.android.ugc.aweme.tools.beauty.e.a.o;
                l.d(t3, "");
                l.d(frameLayout, "");
                l.d(C2, "");
                ComposerBeautyViewImpl.a aVar3 = new ComposerBeautyViewImpl.a(t3, frameLayout, eVar5.f138910b);
                aVar3.f139213b = C2;
                aVar3.f139214c = eVar5.f138911c;
                eVar5.f138909a.f138903m = z2;
                com.ss.android.ugc.aweme.tools.beauty.b.a.e eVar6 = eVar5.f138909a;
                l.d(eVar6, "");
                aVar3.f139215d = eVar6;
                ComposerBeautyViewImpl composerBeautyViewImpl2 = new ComposerBeautyViewImpl(aVar3.f139216e, aVar3.f139218g, aVar3.f139215d, (byte) 0);
                if (aVar3.f139212a != null) {
                    composerBeautyViewImpl2.setBeautyOnInteractListener(aVar3.f139212a);
                }
                composerBeautyViewImpl2.setContainer(aVar3.f139217f);
                composerBeautyViewImpl2.setBeautyViewListener(aVar3.f139213b);
                composerBeautyViewImpl2.setBeautyBuried(aVar3.f139214c);
                composerBeautyViewImpl = composerBeautyViewImpl2;
            }
            this.f28160e = composerBeautyViewImpl;
        } else {
            l.b(frameLayout, "");
            fVar.setContainer(frameLayout);
        }
        this.u.b();
        com.ss.android.ugc.aweme.tools.beauty.service.f fVar4 = this.f28160e;
        if (fVar4 != null) {
            fVar4.b();
        }
        g gVar = this.f28159d;
        l.d(this, "");
        gVar.f28080h.i().i().a(this, new g.d(gVar));
        if (this.f42913m instanceof com.ss.android.ugc.tools.view.a.c) {
            Activity activity = this.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
            ((com.ss.android.ugc.tools.view.a.c) activity).b(d());
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class f extends h.f.b.m implements h.f.a.m<Context, String, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(16496);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Context context, String str) {
            l.d(context, "");
            l.d(str, "");
            h.f.a.m<Context, String, z> f2 = this.this$0.a().f();
            if (f2 != null) {
                f2.invoke(context, str);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.bik, viewGroup, false);
        this.f28158c = (TextView) a2.findViewById(R.id.ewe);
        g gVar = this.f28159d;
        gVar.f28079g.D().getEffectController().a(new g.e(gVar));
        l.b(a2, "");
        return a2;
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

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.tools.beauty.service.f$a, ? extends com.ss.android.ugc.aweme.tools.beauty.service.f$a> */
    /* JADX WARN: Multi-variable type inference failed */
    public m(com.bytedance.o.f fVar, com.ss.android.ugc.aweme.tools.beauty.service.a.a aVar, com.ss.android.ugc.aweme.tools.beauty.e.b.a aVar2, h.f.a.a<Integer> aVar3, h.f.a.b<? super f.a, ? extends f.a> bVar) {
        l.d(fVar, "");
        l.d(aVar, "");
        this.t = fVar;
        this.u = aVar;
        this.v = aVar2;
        this.w = aVar3;
        this.f28161f = bVar;
        this.f28162h = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.a.a.a.class);
        this.f28163i = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);
        this.f28157b = com.bytedance.o.b.a.b(getDiContainer(), com.bytedance.creativex.recorder.gesture.api.b.class);
        this.f28164j = h.i.a((h.f.a.a) new b(this));
        this.f28159d = new g(b(), a(), new h(this));
        this.f28165k = h.i.a((h.f.a.a) new c(this));
        this.f28166l = new d(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
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

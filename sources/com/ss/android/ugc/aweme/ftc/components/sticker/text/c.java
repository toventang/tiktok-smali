package com.ss.android.ugc.aweme.ftc.components.sticker.text;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
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
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.view.i;
import com.ss.android.ugc.aweme.ftc.components.sticker.hint.FTCStickerHintTextViewModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.h.c.a.b;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class c implements com.bytedance.jedi.arch.b, com.bytedance.o.a, b.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f98140a = {new h.f.b.y(c.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};
    public static final a u = new a((byte) 0);
    private int A;
    private boolean B;
    private boolean C;
    private h.p<Integer, Integer> D;
    private final com.bytedance.o.f E;
    private final androidx.fragment.app.e F;
    private final com.bytedance.f.a.a.j G;
    private final com.ss.android.ugc.aweme.editSticker.text.view.i H;
    private final s I;
    private final int J;

    /* renamed from: b  reason: collision with root package name */
    protected FTCEditTextStickerViewModel f98141b;

    /* renamed from: c  reason: collision with root package name */
    public FTCStickerHintTextViewModel f98142c;

    /* renamed from: d  reason: collision with root package name */
    View f98143d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.editSticker.text.view.q f98144e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.editSticker.text.c.e f98145f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.editSticker.interact.a.b f98146g;

    /* renamed from: h  reason: collision with root package name */
    public h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, h.z> f98147h;

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.editSticker.text.c.f f98148i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.editSticker.d.e f98149j;

    /* renamed from: k  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.ftc.f f98150k;

    /* renamed from: l  reason: collision with root package name */
    public h.f.a.m<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? super com.ss.android.ugc.aweme.editSticker.text.view.q, h.z> f98151l;

    /* renamed from: m  reason: collision with root package name */
    public com.ss.android.ugc.aweme.editSticker.text.c.d f98152m;
    protected SafeHandler n;
    public long o;
    public final FrameLayout p;
    public final com.ss.android.ugc.aweme.editSticker.interact.e q;
    public final LiveData<com.ss.android.ugc.asve.editor.g> r;
    public Rect s;
    public com.ss.android.ugc.aweme.editSticker.interact.view.e t;
    private final h.h.d v;
    private com.ss.android.ugc.aweme.story.h.c.a.b w;
    private com.ss.android.ugc.aweme.ftc.components.sticker.text.a.a x;
    private Runnable y;
    private int z;

    static {
        Covode.recordClassIndex(62388);
    }

    public final VideoPublishEditModel b() {
        return (VideoPublishEditModel) this.v.a(this, f98140a[0]);
    }

    @Override // com.bytedance.jedi.arch.h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(62389);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public com.bytedance.o.f getDiContainer() {
        return this.E;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    public static final class y implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f98165a;

        /* renamed from: b  reason: collision with root package name */
        private int f98166b = -1;

        /* renamed from: c  reason: collision with root package name */
        private Runnable f98167c = new a(this);

        static {
            Covode.recordClassIndex(62413);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ y f98168a;

            static {
                Covode.recordClassIndex(62414);
            }

            a(y yVar) {
                this.f98168a = yVar;
            }

            public final void run() {
                int i2 = Build.VERSION.SDK_INT;
            }
        }

        public final void run() {
            com.ss.android.ugc.asve.editor.g value;
            int k2;
            Runnable runnable = this.f98167c;
            if (runnable != null) {
                runnable.run();
                this.f98167c = null;
            }
            this.f98165a.c().postDelayed(this, 16);
            LiveData<com.ss.android.ugc.asve.editor.g> liveData = this.f98165a.r;
            if (!(liveData == null || (value = liveData.getValue()) == null || !this.f98165a.a().l() || (k2 = value.k()) == this.f98166b)) {
                this.f98166b = k2;
                long j2 = (long) k2;
                for (com.ss.android.ugc.aweme.editSticker.text.view.q qVar : this.f98165a.a().f98110a) {
                    qVar.setPlayPosition(j2);
                    qVar.o();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        y(c cVar) {
            this.f98165a = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$c  reason: collision with other inner class name */
    public static final class RunnableC2373c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.q f98155a;

        static {
            Covode.recordClassIndex(62391);
        }

        RunnableC2373c(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            this.f98155a = qVar;
        }

        public final void run() {
            this.f98155a.setShowHelpBox(true);
        }
    }

    public static final class f implements i.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.i f98159a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f98160b;

        static {
            Covode.recordClassIndex(62394);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.view.i.c
        public final void a() {
            c cVar = this.f98160b;
            cVar.a(cVar.f98144e);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.view.i.c
        public final void b() {
            this.f98159a.c();
        }

        f(com.ss.android.ugc.aweme.editSticker.text.view.i iVar, c cVar) {
            this.f98159a = iVar;
            this.f98160b = cVar;
        }
    }

    static final class i implements i.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.i f98163a;

        static {
            Covode.recordClassIndex(62397);
        }

        i(com.ss.android.ugc.aweme.editSticker.text.view.i iVar) {
            this.f98163a = iVar;
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.view.i.b
        public final void a() {
            this.f98163a.c();
        }
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

    public static final class d implements com.ss.android.ugc.aweme.editSticker.text.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f98156a;

        static {
            Covode.recordClassIndex(62392);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.b.a
        public final boolean a() {
            return this.f98156a.a().f();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(c cVar) {
            this.f98156a = cVar;
        }
    }

    public static final class e implements com.ss.android.ugc.aweme.editSticker.text.c.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.i f98157a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f98158b;

        static {
            Covode.recordClassIndex(62393);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.f
        public final void a() {
            com.ss.android.ugc.aweme.editSticker.text.c.f fVar = this.f98158b.f98148i;
            if (fVar != null) {
                fVar.a();
            }
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.f
        public final void b() {
            com.ss.android.ugc.aweme.editSticker.text.c.f fVar = this.f98158b.f98148i;
            if (fVar != null) {
                fVar.b();
            }
            com.ss.android.ugc.aweme.editSticker.text.view.q qVar = this.f98158b.f98144e;
            if (qVar != null) {
                qVar.k();
            }
            this.f98157a.c();
        }

        e(com.ss.android.ugc.aweme.editSticker.text.view.i iVar, c cVar) {
            this.f98157a = iVar;
            this.f98158b = cVar;
        }
    }

    static final class h implements com.ss.android.ugc.aweme.editSticker.interact.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f98162a;

        static {
            Covode.recordClassIndex(62396);
        }

        h(c cVar) {
            this.f98162a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.editSticker.interact.a.b
        public final void a() {
            this.f98162a.a().f98113d.a(h.z.f158842a);
        }
    }

    /* access modifiers changed from: protected */
    public final FTCEditTextStickerViewModel a() {
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f98141b;
        if (fTCEditTextStickerViewModel == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        return fTCEditTextStickerViewModel;
    }

    /* access modifiers changed from: protected */
    public final SafeHandler c() {
        SafeHandler safeHandler = this.n;
        if (safeHandler == null) {
            h.f.b.l.a("safeHandler");
        }
        return safeHandler;
    }

    public final void e() {
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f98141b;
        if (fTCEditTextStickerViewModel == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        fTCEditTextStickerViewModel.f98110a.clear();
    }

    @Override // androidx.lifecycle.m
    public androidx.lifecycle.i getLifecycle() {
        androidx.lifecycle.i lifecycle = this.F.getLifecycle();
        h.f.b.l.b(lifecycle, "");
        return lifecycle;
    }

    private static int l() {
        com.ss.android.ugc.aweme.editSticker.text.a.b a2 = com.ss.android.ugc.aweme.editSticker.text.a.b.a();
        h.f.b.l.b(a2, "");
        if (a2.d() <= 0) {
            return 28;
        }
        com.ss.android.ugc.aweme.editSticker.text.a.b a3 = com.ss.android.ugc.aweme.editSticker.text.a.b.a();
        h.f.b.l.b(a3, "");
        return a3.d();
    }

    public final void j() {
        com.ss.android.ugc.aweme.editSticker.interact.e eVar = this.q;
        if (eVar != null) {
            eVar.b();
        }
        SafeHandler safeHandler = this.n;
        if (safeHandler == null) {
            h.f.b.l.a("safeHandler");
        }
        Runnable runnable = this.y;
        if (runnable == null) {
            h.f.b.l.a("mNonInfoStickerPlayingRefreshTask");
        }
        safeHandler.post(runnable);
    }

    public final void k() {
        SafeHandler safeHandler = this.n;
        if (safeHandler == null) {
            h.f.b.l.a("safeHandler");
        }
        Runnable runnable = this.y;
        if (runnable == null) {
            h.f.b.l.a("mNonInfoStickerPlayingRefreshTask");
        }
        safeHandler.removeCallbacks(runnable);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f98153a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.q f98154b;

        static {
            Covode.recordClassIndex(62390);
        }

        b(c cVar, com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            this.f98153a = cVar;
            this.f98154b = qVar;
        }

        public final void run() {
            FTCStickerHintTextViewModel fTCStickerHintTextViewModel = this.f98153a.f98142c;
            if (fTCStickerHintTextViewModel == null) {
                h.f.b.l.a("hintTextViewModel");
            }
            fTCStickerHintTextViewModel.b().postValue(new com.ss.android.ugc.aweme.ftc.components.sticker.hint.a(this.f98154b.getHelpRect().left + (this.f98154b.getHelpRect().width() / 2.0f), this.f98154b.getHelpRect().top, R.string.ayb, 1));
        }
    }

    public final void g() {
        MethodCollector.i(3851);
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f98141b;
        if (fTCEditTextStickerViewModel == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        ListIterator<com.ss.android.ugc.aweme.editSticker.text.view.q> listIterator = fTCEditTextStickerViewModel.f98110a.listIterator();
        while (listIterator.hasNext()) {
            com.ss.android.ugc.aweme.editSticker.text.view.q next = listIterator.next();
            this.p.removeView(next);
            listIterator.remove();
            com.ss.android.ugc.aweme.editSticker.text.c.e eVar = this.f98145f;
            if (eVar != null) {
                eVar.a(next);
            }
        }
        this.f98144e = null;
        MethodCollector.o(3851);
    }

    public final void i() {
        View view;
        View view2;
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f98141b;
        if (fTCEditTextStickerViewModel == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        if (!fTCEditTextStickerViewModel.q() || (view2 = this.f98143d) == null || view2.getVisibility() != 8) {
            View view3 = this.f98143d;
            if (view3 != null && view3.getVisibility() == 0 && (view = this.f98143d) != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view4 = this.f98143d;
        if (view4 != null) {
            view4.setVisibility(0);
        }
    }

    public static final class g implements com.ss.android.ugc.aweme.editSticker.text.c.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f98161a;

        static {
            Covode.recordClassIndex(62395);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.f
        public final void a() {
            View view;
            this.f98161a.a().f98114e.a(new h.p<>(false, false));
            c cVar = this.f98161a;
            View view2 = cVar.f98143d;
            if (!(view2 == null || view2.getVisibility() != 0 || (view = cVar.f98143d) == null)) {
                view.setVisibility(8);
            }
            VideoPublishEditModel b2 = this.f98161a.b();
            h.f.b.l.d(b2, "");
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", b2.creationId).a("group_id", dv.a());
            if (b2.draftId != 0) {
                a2.a("draft_id", b2.draftId);
            }
            com.ss.android.ugc.aweme.common.r.a("click_text_entrance", a2.f149193a);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.f
        public final void b() {
            this.f98161a.a().f98114e.a(new h.p<>(true, false));
            this.f98161a.i();
            VideoPublishEditModel b2 = this.f98161a.b();
            h.f.b.l.d(b2, "");
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", b2.creationId).a("group_id", dv.a());
            if (b2.draftId != 0) {
                a2.a("draft_id", b2.draftId);
            }
            com.ss.android.ugc.aweme.common.r.a("text_complete", a2.f149193a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(c cVar) {
            this.f98161a = cVar;
        }
    }

    private final void m() {
        com.ss.android.ugc.aweme.editSticker.interact.view.e eVar;
        View contentView;
        MethodCollector.i(3865);
        ViewGroup.LayoutParams layoutParams = this.p.getLayoutParams();
        this.s = new Rect(0, 0, layoutParams.width, layoutParams.height);
        com.ss.android.ugc.aweme.editSticker.interact.view.e eVar2 = this.t;
        if (!(eVar2 == null || (contentView = eVar2.getContentView()) == null || contentView.getParent() == null)) {
            ViewParent parent = contentView.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(contentView);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                MethodCollector.o(3865);
                throw nullPointerException;
            }
        }
        com.ss.android.ugc.aweme.editSticker.interact.view.a aVar = com.ss.android.ugc.aweme.editSticker.d.c().f88097d;
        if (aVar != null) {
            eVar = aVar.a(this.F, this.z);
        } else {
            eVar = null;
        }
        this.t = eVar;
        if (eVar != null) {
            this.p.addView(eVar.getContentView());
            MethodCollector.o(3865);
            return;
        }
        MethodCollector.o(3865);
    }

    public final void f() {
        InfoStickerModel a2;
        List<StickerItemModel> list;
        com.ss.android.ugc.asve.editor.g value;
        VESize b2;
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f98141b;
        if (fTCEditTextStickerViewModel == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        boolean z2 = !fTCEditTextStickerViewModel.l();
        boolean z3 = false;
        s sVar = this.I;
        if (sVar != null && (a2 = sVar.a()) != null && (list = a2.stickers) != null) {
            Iterator<StickerItemModel> it = list.iterator();
            while (it.hasNext()) {
                StickerItemModel next = it.next();
                if (next.type == 2) {
                    if (z2) {
                        if (!z3) {
                            h.p<Integer, Integer> pVar = null;
                            LiveData<com.ss.android.ugc.asve.editor.g> liveData = this.r;
                            if (!(liveData == null || (value = liveData.getValue()) == null || (b2 = value.b()) == null)) {
                                pVar = new h.p<>(Integer.valueOf(b2.width), Integer.valueOf(b2.height));
                            }
                            a(pVar);
                            z3 = true;
                        }
                        TextStickerData textStickerData = (TextStickerData) com.ss.android.ugc.aweme.editSticker.d.b().a(next.extra, TextStickerData.class);
                        if (textStickerData != null) {
                            FTCEditTextStickerViewModel fTCEditTextStickerViewModel2 = this.f98141b;
                            if (fTCEditTextStickerViewModel2 == null) {
                                h.f.b.l.a("textStickerViewModel");
                            }
                            fTCEditTextStickerViewModel2.a(textStickerData);
                        }
                    }
                    it.remove();
                }
            }
        }
    }

    public final void h() {
        h.p<Integer, Integer> pVar = this.D;
        if (pVar != null && pVar.getFirst().intValue() != 0 && pVar.getSecond().intValue() != 0) {
            int[] a2 = com.ss.android.ugc.aweme.editSticker.f.g.a(this.p, pVar.getFirst().intValue(), pVar.getSecond().intValue());
            this.z = a2[0];
            this.A = a2[1];
            m();
        }
    }

    public final void d() {
        com.ss.android.ugc.aweme.editSticker.text.a.b.a().a(this.p.getContext());
        androidx.fragment.app.e eVar = this.F;
        JediViewModel a2 = com.bytedance.jedi.arch.t.a(eVar).a(FTCEditTextStickerViewModel.class);
        h.f.b.l.b(a2, "");
        this.f98141b = (FTCEditTextStickerViewModel) a2;
        ac a3 = androidx.lifecycle.ae.a(eVar, (ad.b) null).a(FTCStickerHintTextViewModel.class);
        h.f.b.l.b(a3, "");
        this.f98142c = (FTCStickerHintTextViewModel) a3;
        this.n = new SafeHandler(this.F);
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f98141b;
        if (fTCEditTextStickerViewModel == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        this.x = new com.ss.android.ugc.aweme.ftc.components.sticker.text.a.a(fTCEditTextStickerViewModel);
        com.bytedance.f.a.a.j jVar = this.G;
        com.ss.android.ugc.aweme.ftc.components.sticker.text.a.a aVar = this.x;
        if (aVar == null) {
            h.f.b.l.a("gestureListener");
        }
        jVar.a(new com.bytedance.f.a.a.f(200, aVar));
        com.ss.android.ugc.aweme.story.h.c.a.b bVar = new com.ss.android.ugc.aweme.story.h.c.a.b(this.F, null);
        bVar.a(this);
        this.w = bVar;
        com.ss.android.ugc.aweme.editSticker.interact.e eVar2 = this.q;
        if (eVar2 != null) {
            eVar2.a();
        }
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel2 = this.f98141b;
        if (fTCEditTextStickerViewModel2 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        fTCEditTextStickerViewModel2.o().observe(this.F, new j(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel3 = this.f98141b;
        if (fTCEditTextStickerViewModel3 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar = g.f98174a;
        ah ahVar = new ah();
        ahVar.f39377a = true;
        selectSubscribe(fTCEditTextStickerViewModel3, kVar, ahVar, new u(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel4 = this.f98141b;
        if (fTCEditTextStickerViewModel4 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar2 = p.f98183a;
        ah ahVar2 = new ah();
        ahVar2.f39377a = true;
        subscribeEvent(fTCEditTextStickerViewModel4, kVar2, ahVar2, new x(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel5 = this.f98141b;
        if (fTCEditTextStickerViewModel5 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar3 = q.f98184a;
        ah ahVar3 = new ah();
        ahVar3.f39377a = true;
        selectSubscribe(fTCEditTextStickerViewModel5, kVar3, ahVar3, new k(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel6 = this.f98141b;
        if (fTCEditTextStickerViewModel6 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar4 = d.f98171a;
        ah ahVar4 = new ah();
        ahVar4.f39377a = true;
        selectSubscribe(fTCEditTextStickerViewModel6, kVar4, ahVar4, new l(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel7 = this.f98141b;
        if (fTCEditTextStickerViewModel7 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar5 = e.f98172a;
        ah ahVar5 = new ah();
        ahVar5.f39377a = true;
        selectSubscribe(fTCEditTextStickerViewModel7, kVar5, ahVar5, new m(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel8 = this.f98141b;
        if (fTCEditTextStickerViewModel8 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar6 = f.f98173a;
        ah ahVar6 = new ah();
        ahVar6.f39377a = true;
        selectSubscribe(fTCEditTextStickerViewModel8, kVar6, ahVar6, new n(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel9 = this.f98141b;
        if (fTCEditTextStickerViewModel9 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar7 = h.f98175a;
        ah ahVar7 = new ah();
        ahVar7.f39377a = true;
        selectSubscribe(fTCEditTextStickerViewModel9, kVar7, ahVar7, new o(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel10 = this.f98141b;
        if (fTCEditTextStickerViewModel10 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar8 = i.f98176a;
        ah ahVar8 = new ah();
        ahVar8.f39377a = true;
        selectSubscribe(fTCEditTextStickerViewModel10, kVar8, ahVar8, new p(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel11 = this.f98141b;
        if (fTCEditTextStickerViewModel11 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar9 = j.f98177a;
        ah ahVar9 = new ah();
        ahVar9.f39377a = true;
        subscribeEvent(fTCEditTextStickerViewModel11, kVar9, ahVar9, new q(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel12 = this.f98141b;
        if (fTCEditTextStickerViewModel12 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar10 = k.f98178a;
        ah ahVar10 = new ah();
        ahVar10.f39377a = true;
        selectSubscribe(fTCEditTextStickerViewModel12, kVar10, ahVar10, new r(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel13 = this.f98141b;
        if (fTCEditTextStickerViewModel13 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar11 = l.f98179a;
        ah ahVar11 = new ah();
        ahVar11.f39377a = true;
        selectSubscribe(fTCEditTextStickerViewModel13, kVar11, ahVar11, new s(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel14 = this.f98141b;
        if (fTCEditTextStickerViewModel14 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar12 = m.f98180a;
        ah ahVar12 = new ah();
        ahVar12.f39377a = true;
        selectSubscribe(fTCEditTextStickerViewModel14, kVar12, ahVar12, new t(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel15 = this.f98141b;
        if (fTCEditTextStickerViewModel15 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar13 = n.f98181a;
        ah ahVar13 = new ah();
        ahVar13.f39377a = true;
        subscribeEvent(fTCEditTextStickerViewModel15, kVar13, ahVar13, new v(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel16 = this.f98141b;
        if (fTCEditTextStickerViewModel16 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar14 = o.f98182a;
        ah ahVar14 = new ah();
        ahVar14.f39377a = true;
        subscribeEvent(fTCEditTextStickerViewModel16, kVar14, ahVar14, new w(this));
        this.f98148i = new g(this);
        this.f98146g = new h(this);
        com.ss.android.ugc.aweme.editSticker.text.view.i iVar = this.H;
        iVar.setInputLayoutShowListener(new e(iVar, this));
        iVar.setTextStickerUpdateListener(new i(iVar));
        iVar.setVisibleController(new f(iVar, this));
        f();
        this.y = new y(this);
    }

    public static final class z implements com.ss.android.ugc.aweme.editSticker.text.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f98170a;

        static {
            Covode.recordClassIndex(62416);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final void b(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            h.f.b.l.d(qVar, "");
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final void c(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            h.f.b.l.d(qVar, "");
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final void d(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            h.f.b.l.d(qVar, "");
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final void e(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            h.f.b.l.d(qVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        z(c cVar) {
            this.f98170a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final float a(float f2) {
            com.ss.android.ugc.aweme.editSticker.interact.view.e eVar = this.f98170a.t;
            if (eVar != null) {
                return eVar.a(f2);
            }
            return f2;
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final void a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            h.f.b.l.d(qVar, "");
            this.f98170a.a().a(true);
            this.f98170a.a().k();
            h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, h.z> bVar = this.f98170a.f98147h;
            if (bVar != null) {
                bVar.invoke(qVar);
            }
            com.ss.android.ugc.aweme.editSticker.d.e eVar = this.f98170a.f98149j;
            if (eVar != null) {
                eVar.b();
            }
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final void a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar, boolean z) {
            h.f.b.l.d(qVar, "");
            com.ss.android.ugc.aweme.editSticker.text.c.d dVar = this.f98170a.f98152m;
            if (dVar != null) {
                dVar.a(qVar, z);
            }
            if (z) {
                c cVar = this.f98170a;
                if (!((FTCEditTextStickerViewState) cVar.getState(cVar.a())).getInTimeEditView()) {
                    if (System.currentTimeMillis() - this.f98170a.o > 500) {
                        this.f98170a.a().f98115f.a((Boolean) false);
                        this.f98170a.f98144e = qVar;
                        this.f98170a.a(qVar);
                        if (this.f98170a.f98145f != null) {
                            com.ss.android.ugc.aweme.editSticker.text.c.e eVar = this.f98170a.f98145f;
                            if (eVar == null) {
                                h.f.b.l.b();
                            }
                            eVar.c(qVar);
                        }
                        this.f98170a.o = System.currentTimeMillis();
                        com.ss.android.ugc.aweme.editSticker.d.e eVar2 = this.f98170a.f98149j;
                        if (eVar2 != null) {
                            eVar2.a();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            if (this.f98170a.f98146g != null) {
                com.ss.android.ugc.aweme.editSticker.interact.a.b bVar = this.f98170a.f98146g;
                if (bVar == null) {
                    h.f.b.l.b();
                }
                bVar.a();
                if (this.f98170a.f98144e != null) {
                    c cVar2 = this.f98170a;
                    cVar2.b(cVar2.f98144e);
                }
            }
            this.f98170a.a().k();
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final int a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar, boolean z, boolean z2) {
            h.f.b.l.d(qVar, "");
            com.ss.android.ugc.aweme.editSticker.interact.view.e eVar = this.f98170a.t;
            if (eVar == null) {
                return -1;
            }
            if (!z) {
                return eVar.a(qVar.getAnglePointListForBlock(), z2);
            }
            eVar.b();
            return -1;
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final PointF a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar, float f2, float f3) {
            h.f.b.l.d(qVar, "");
            com.ss.android.ugc.aweme.editSticker.interact.view.e eVar = this.f98170a.t;
            if (eVar == null) {
                return new PointF(0.0f, 0.0f);
            }
            PointF[] anglePointList = qVar.getAnglePointList();
            for (PointF pointF : anglePointList) {
                pointF.x += f2;
                pointF.y += f3;
            }
            return eVar.a(anglePointList, f2, f3);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final void a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar, RectF rectF, com.ss.android.ugc.aweme.editSticker.text.c.i iVar) {
            h.f.b.l.d(qVar, "");
            h.f.b.l.d(rectF, "");
            h.f.b.l.d(iVar, "");
            if (!iVar.f88461c) {
                this.f98170a.b(qVar);
            }
            if (!iVar.f88462d && !iVar.f88463e) {
                boolean a2 = com.ss.android.ugc.aweme.editSticker.f.b.a(this.f98170a.s, qVar.getAnglePointList());
                com.ss.android.ugc.aweme.editSticker.interact.e eVar = this.f98170a.q;
                if (eVar != null) {
                    this.f98170a.a(qVar, eVar.a(iVar.f88459a, iVar.f88460b, iVar.f88461c, a2));
                }
            }
            if (this.f98170a.q != null) {
                qVar.setAlpha(1.0f);
            }
            com.ss.android.ugc.aweme.editSticker.text.c.e eVar2 = this.f98170a.f98145f;
            if (eVar2 != null) {
                eVar2.a(qVar, new com.ss.android.ugc.aweme.editSticker.text.c.i(iVar.f88459a, iVar.f88460b, iVar.f88461c, iVar.f88462d, iVar.f88463e));
            }
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
    public final void a(int i2) {
        if (this.C) {
            com.ss.android.ugc.aweme.editSticker.text.view.q qVar = this.f98144e;
            if (qVar != null) {
                qVar.l();
            }
            this.H.g();
            this.H.a(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
    public final void c(int i2) {
        if (this.H.i()) {
            this.H.b(i2);
        }
    }

    static final class j<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f98164a;

        static {
            Covode.recordClassIndex(62398);
        }

        j(c cVar) {
            this.f98164a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            h.p pVar = (h.p) obj;
            if (pVar != null) {
                FTCEditTextStickerViewModel a2 = this.f98164a.a();
                float floatValue = ((Number) pVar.getFirst()).floatValue();
                boolean booleanValue = ((Boolean) pVar.getSecond()).booleanValue();
                for (com.ss.android.ugc.aweme.editSticker.text.view.q qVar : a2.f98110a) {
                    qVar.a(floatValue, booleanValue);
                }
            }
        }
    }

    public final void a(h.p<Integer, Integer> pVar) {
        if (pVar != null && this.D == null) {
            this.D = pVar;
            h();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
        this.C = true;
        if (qVar == null) {
            com.ss.android.ugc.aweme.editSticker.text.view.i iVar = this.H;
            FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f98141b;
            if (fTCEditTextStickerViewModel == null) {
                h.f.b.l.a("textStickerViewModel");
            }
            iVar.a("", "", fTCEditTextStickerViewModel.p());
            this.f98144e = null;
            return;
        }
        com.ss.android.ugc.aweme.editSticker.text.view.i iVar2 = this.H;
        List<TextStickerTextWrap> textWrapList = qVar.getTextWrapList();
        int curMode = qVar.getCurMode();
        int curColor = qVar.getCurColor();
        int curAlignTxt = qVar.getCurAlignTxt();
        String curFontType = qVar.getCurFontType();
        TextStickerData data = qVar.getData();
        if (data == null) {
            h.f.b.l.b();
        }
        int fontSize = data.getFontSize();
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel2 = this.f98141b;
        if (fTCEditTextStickerViewModel2 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        iVar2.a(textWrapList, curMode, curColor, curAlignTxt, curFontType, false, fontSize, fTCEditTextStickerViewModel2.p());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        if (r2 != r7) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.ss.android.ugc.aweme.editSticker.text.view.q r7) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.sticker.text.c.b(com.ss.android.ugc.aweme.editSticker.text.view.q):void");
    }

    @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
    public final void b(int i2) {
        MethodCollector.i(3870);
        if (!this.C) {
            MethodCollector.o(3870);
            return;
        }
        this.H.h();
        List<TextStickerTextWrap> textWrapList = this.H.getTextWrapList();
        h.f.b.l.b(textWrapList, "");
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig = null;
        if (com.ss.android.ugc.aweme.editSticker.text.bean.t.e(textWrapList)) {
            com.ss.android.ugc.aweme.editSticker.text.view.q qVar = this.f98144e;
            if (qVar != null) {
                qVar.getData();
                int curTxtMode = this.H.getCurTxtMode();
                int curColor = this.H.getCurColor();
                int alignTxt = this.H.getAlignTxt();
                com.ss.android.ugc.aweme.editSticker.text.a.b a2 = com.ss.android.ugc.aweme.editSticker.text.a.b.a();
                h.f.b.l.b(a2, "");
                qVar.a(curTxtMode, curColor, alignTxt, a2.f88281d);
                qVar.setFontSize(l());
                TextStickerData data = qVar.getData();
                if (data != null) {
                    innerEffectTextLayoutConfig = data.getEffectTextLayoutConfig();
                }
                qVar.b(textWrapList, innerEffectTextLayoutConfig);
            } else {
                FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f98141b;
                if (fTCEditTextStickerViewModel == null) {
                    h.f.b.l.a("textStickerViewModel");
                }
                if (fTCEditTextStickerViewModel.f98110a.size() >= this.J) {
                    com.ss.android.ugc.aweme.editSticker.d.e().a(this.F, R.string.cn6);
                } else {
                    int curTxtMode2 = this.H.getCurTxtMode();
                    int curColor2 = this.H.getCurColor();
                    int alignTxt2 = this.H.getAlignTxt();
                    com.ss.android.ugc.aweme.editSticker.text.a.b a3 = com.ss.android.ugc.aweme.editSticker.text.a.b.a();
                    h.f.b.l.b(a3, "");
                    TextStickerData textStickerData = new TextStickerData("", curTxtMode2, curColor2, alignTxt2, a3.f88281d, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870880, null);
                    Point editInputScreenCenterPoint = this.H.getEditInputScreenCenterPoint();
                    h.f.b.l.b(editInputScreenCenterPoint, "");
                    textStickerData.setEditCenterPoint(editInputScreenCenterPoint);
                    textStickerData.setTextWrapList(textWrapList);
                    textStickerData.setFontSize(l());
                    a(textStickerData, false);
                }
            }
        } else {
            com.ss.android.ugc.aweme.editSticker.text.view.q qVar2 = this.f98144e;
            if (qVar2 != null) {
                this.p.removeView(qVar2);
                FTCEditTextStickerViewModel fTCEditTextStickerViewModel2 = this.f98141b;
                if (fTCEditTextStickerViewModel2 == null) {
                    h.f.b.l.a("textStickerViewModel");
                }
                fTCEditTextStickerViewModel2.a(qVar2);
            }
            this.f98144e = null;
        }
        this.C = false;
        com.ss.android.ugc.aweme.editSticker.text.c.f fVar = this.f98148i;
        if (fVar != null) {
            fVar.b();
            MethodCollector.o(3870);
            return;
        }
        MethodCollector.o(3870);
    }

    static final class q extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.z, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62405);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            this.this$0.f();
            return h.z.f158842a;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.p, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62407);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.p pVar) {
            h.f.b.l.d(iVar, "");
            this.this$0.h();
            return h.z.f158842a;
        }
    }

    static final class v extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.z, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62410);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            this.this$0.g();
            return h.z.f158842a;
        }
    }

    static final class w extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.z, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62411);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            this.this$0.i();
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.c.e>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62400);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.c.e> dVar) {
            T t;
            com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.c.e> dVar2 = dVar;
            h.f.b.l.d(iVar, "");
            c cVar = this.this$0;
            if (dVar2 != null) {
                t = dVar2.f39404b;
            } else {
                t = null;
            }
            cVar.f98145f = t;
            return h.z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends h.f.a.m<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? extends h.z>>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62401);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends h.f.a.m<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? extends h.z>> dVar) {
            T t;
            com.bytedance.jedi.arch.d<? extends h.f.a.m<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? extends h.z>> dVar2 = dVar;
            h.f.b.l.d(iVar, "");
            c cVar = this.this$0;
            if (dVar2 != null) {
                t = dVar2.f39404b;
            } else {
                t = null;
            }
            cVar.f98151l = t;
            return h.z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? extends h.z>>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62402);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? extends h.z>> dVar) {
            T t;
            com.bytedance.jedi.arch.d<? extends h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? extends h.z>> dVar2 = dVar;
            h.f.b.l.d(iVar, "");
            c cVar = this.this$0;
            if (dVar2 != null) {
                t = dVar2.f39404b;
            } else {
                t = null;
            }
            cVar.f98147h = t;
            return h.z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.c.d>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62403);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.c.d> dVar) {
            T t;
            com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.c.d> dVar2 = dVar;
            h.f.b.l.d(iVar, "");
            c cVar = this.this$0;
            if (dVar2 != null) {
                t = dVar2.f39404b;
            } else {
                t = null;
            }
            cVar.f98152m = t;
            return h.z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.d.e>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62404);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.d.e> dVar) {
            T t;
            com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.d.e> dVar2 = dVar;
            h.f.b.l.d(iVar, "");
            c cVar = this.this$0;
            if (dVar2 != null) {
                t = dVar2.f39404b;
            } else {
                t = null;
            }
            cVar.f98149j = t;
            return h.z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends h.p<? extends Integer, ? extends Integer>>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62406);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends h.p<? extends Integer, ? extends Integer>> dVar) {
            T t;
            com.bytedance.jedi.arch.d<? extends h.p<? extends Integer, ? extends Integer>> dVar2 = dVar;
            h.f.b.l.d(iVar, "");
            c cVar = this.this$0;
            if (dVar2 != null) {
                t = dVar2.f39404b;
            } else {
                t = null;
            }
            cVar.a((h.p<Integer, Integer>) t);
            return h.z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62408);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> dVar) {
            T t;
            com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> dVar2 = dVar;
            h.f.b.l.d(iVar, "");
            c cVar = this.this$0;
            if (dVar2 != null) {
                t = dVar2.f39404b;
            } else {
                t = null;
            }
            cVar.a((com.ss.android.ugc.aweme.editSticker.text.view.q) t);
            return h.z.f158842a;
        }
    }

    static final class u extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62409);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> dVar) {
            T t;
            com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> dVar2 = dVar;
            h.f.b.l.d(iVar, "");
            c cVar = this.this$0;
            if (dVar2 != null) {
                t = dVar2.f39404b;
            } else {
                t = null;
            }
            cVar.b(t);
            return h.z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.n<TextStickerData, Boolean>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62399);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.n<TextStickerData, Boolean> nVar) {
            T t;
            com.bytedance.jedi.arch.n<TextStickerData, Boolean> nVar2 = nVar;
            h.f.b.l.d(iVar, "");
            if (!(nVar2 == null || (t = nVar2.f39404b) == null)) {
                this.this$0.a((TextStickerData) t.getFirst(), ((Boolean) t.getSecond()).booleanValue());
            }
            return h.z.f158842a;
        }
    }

    static final class x extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.z, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62412);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            FTCStickerHintTextViewModel fTCStickerHintTextViewModel = this.this$0.f98142c;
            if (fTCStickerHintTextViewModel == null) {
                h.f.b.l.a("hintTextViewModel");
            }
            fTCStickerHintTextViewModel.a().postValue(true);
            return h.z.f158842a;
        }
    }

    public final void a(TextStickerData textStickerData, boolean z2) {
        MethodCollector.i(3859);
        this.H.setData(textStickerData);
        androidx.fragment.app.e eVar = this.F;
        SafeHandler safeHandler = this.n;
        if (safeHandler == null) {
            h.f.b.l.a("safeHandler");
        }
        com.ss.android.ugc.aweme.editSticker.text.view.q qVar = new com.ss.android.ugc.aweme.editSticker.text.view.q(eVar, safeHandler, textStickerData, true, new d(this), true);
        qVar.w = this.f98149j;
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f98141b;
        if (fTCEditTextStickerViewModel == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.f.b.l.d(qVar, "");
        fTCEditTextStickerViewModel.f98110a.add(0, qVar);
        qVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.p.addView(qVar);
        com.ss.android.ugc.aweme.editSticker.text.c.e eVar2 = this.f98145f;
        if (eVar2 != null) {
            eVar2.b(qVar);
        }
        this.f98144e = qVar;
        h.f.b.l.d(qVar, "");
        qVar.setOnEditClickListener(new z(this));
        qVar.a(this.z, this.A);
        this.H.a();
        if (!z2) {
            qVar.postDelayed(new b(this, qVar), 500);
        }
        if (textStickerData.getAutoSelect()) {
            qVar.post(new RunnableC2373c(qVar));
        }
        MethodCollector.o(3859);
    }

    public final void a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar, int i2) {
        MethodCollector.i(3861);
        if (i2 == 1) {
            qVar.a(0.3137255f, false);
            MethodCollector.o(3861);
        } else if (i2 != 3) {
            if (i2 == 4) {
                qVar.a(0.3137255f, true);
            }
            MethodCollector.o(3861);
        } else {
            this.p.removeView(qVar);
            FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f98141b;
            if (fTCEditTextStickerViewModel == null) {
                h.f.b.l.a("textStickerViewModel");
            }
            fTCEditTextStickerViewModel.a(qVar);
            this.f98144e = null;
            com.ss.android.ugc.aweme.editSticker.text.c.e eVar = this.f98145f;
            if (eVar != null) {
                eVar.a(qVar);
            }
            this.B = true;
            MethodCollector.o(3861);
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }

    public /* synthetic */ c(com.bytedance.o.f fVar, androidx.fragment.app.e eVar, com.bytedance.f.a.a.j jVar, FrameLayout frameLayout, com.ss.android.ugc.aweme.editSticker.text.view.i iVar, com.ss.android.ugc.aweme.editSticker.interact.e eVar2, LiveData liveData, s sVar, int i2) {
        this(fVar, eVar, jVar, frameLayout, iVar, eVar2, liveData, sVar, i2, new Rect());
    }

    private c(com.bytedance.o.f fVar, androidx.fragment.app.e eVar, com.bytedance.f.a.a.j jVar, FrameLayout frameLayout, com.ss.android.ugc.aweme.editSticker.text.view.i iVar, com.ss.android.ugc.aweme.editSticker.interact.e eVar2, LiveData<com.ss.android.ugc.asve.editor.g> liveData, s sVar, int i2, Rect rect) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(frameLayout, "");
        h.f.b.l.d(iVar, "");
        this.E = fVar;
        this.F = eVar;
        this.G = jVar;
        this.p = frameLayout;
        this.H = iVar;
        this.q = eVar2;
        this.r = liveData;
        this.I = sVar;
        this.J = i2;
        this.s = rect;
        this.t = null;
        this.v = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
        this.f98150k = com.ss.android.ugc.aweme.ftc.f.f98455a;
    }
}

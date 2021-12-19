package com.ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ac;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.t;
import com.bytedance.jedi.arch.v;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.ss.android.ugc.gamora.editor.sticker.livecd.EditLiveCDStickerViewModel;
import com.ss.android.ugc.gamora.editor.sticker.poll.EditPollStickerViewModel;
import com.ss.android.vesdk.VESize;
import h.a.n;
import h.a.z;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.k.i;
import h.m;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public abstract class a<T> extends j implements com.bytedance.jedi.arch.b, com.bytedance.o.a, com.ss.android.ugc.gamora.editor.sticker.b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f145662a = {new y(a.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.a<T> f145663b = d();

    /* renamed from: c  reason: collision with root package name */
    public EditInfoStickerViewModel f145664c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.f.a.a.j f145665d;

    /* renamed from: e  reason: collision with root package name */
    private final h f145666e = h.i.a(m.NONE, new C3870a(this));

    /* renamed from: f  reason: collision with root package name */
    private final h.h.d f145667f = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: g  reason: collision with root package name */
    private EditTextStickerViewModel f145668g;

    /* renamed from: h  reason: collision with root package name */
    private EditPollStickerViewModel f145669h;

    /* renamed from: i  reason: collision with root package name */
    private final h f145670i = h.i.a(m.NONE, new b(this));

    /* renamed from: j  reason: collision with root package name */
    private EditCommentStickerViewModel f145671j;

    /* renamed from: k  reason: collision with root package name */
    private EditLiveCDStickerViewModel f145672k;

    /* renamed from: l  reason: collision with root package name */
    private EditDonationStickerViewModel f145673l;
    private EditStickerViewModel t;
    private final h u = h.i.a((h.f.a.a) new f(this));
    private final com.bytedance.o.f v;

    static {
        Covode.recordClassIndex(95665);
    }

    private final com.bytedance.f.a.a.f O() {
        return (com.bytedance.f.a.a.f) this.u.getValue();
    }

    public abstract int C();

    public abstract void D();

    public final com.ss.android.ugc.aweme.shortvideo.preview.a a() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f145666e.getValue();
    }

    public final VideoPublishEditModel b() {
        return (VideoPublishEditModel) this.f145667f.a(this, f145662a[0]);
    }

    public abstract com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.a<T> d();

    @Override // com.bytedance.jedi.arch.h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class c implements com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f145678a;

        static {
            Covode.recordClassIndex(95668);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void a(View view) {
            l.d(view, "");
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void d() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void b() {
            a();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void e() {
            this.f145678a.a().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, true, true);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void f() {
            this.f145678a.a().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, false, true);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void a() {
            this.f145678a.a().d(false);
            this.f145678a.a().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, true, false);
            this.f145678a.D();
            this.f145678a.f145663b.s();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f145678a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void b(boolean z) {
            if (z) {
                this.f145678a.N();
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void a(boolean z) {
            this.f145678a.N();
            if (z) {
                this.f145678a.a().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, true, true);
            } else {
                this.f145678a.a().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, true, false);
            }
        }
    }

    @Override // com.bytedance.o.a
    public com.bytedance.o.f getDiContainer() {
        return this.v;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    public final boolean J() {
        return this.f145663b.b();
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

    /* renamed from: com.ss.android.ugc.gamora.editor.a$a  reason: collision with other inner class name */
    public static final class C3870a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(95666);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3870a(com.bytedance.o.a aVar) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.a.C3870a.invoke():com.bytedance.als.b");
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.duet.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(95667);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.duet.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.duet.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.duet.a> r1 = com.ss.android.ugc.gamora.editor.sticker.duet.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.a.b.invoke():com.bytedance.als.b");
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<com.bytedance.f.a.a.f> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(95672);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.f.a.a.f invoke() {
            return new com.bytedance.f.a.a.f(300, this.this$0.f145663b.r);
        }
    }

    public final int K() {
        return this.f145663b.f127194m.size();
    }

    public final String L() {
        String p = this.f145663b.p();
        l.b(p, "");
        return p;
    }

    public final List<InteractStickerStruct> H() {
        List<StickerItemModel> list;
        InfoStickerModel infoStickerModel = b().infoStickerModel;
        if (infoStickerModel == null || (list = infoStickerModel.stickers) == null || list.isEmpty()) {
            return z.INSTANCE;
        }
        return this.f145663b.a(list);
    }

    public final List<String> I() {
        List<StickerItemModel> list;
        InfoStickerModel infoStickerModel = b().infoStickerModel;
        if (infoStickerModel == null || (list = infoStickerModel.stickers) == null || list.isEmpty()) {
            return z.INSTANCE;
        }
        return this.f145663b.q();
    }

    public final void M() {
        a().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, true, false);
        D();
        this.f145663b.t();
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        com.ss.android.ugc.aweme.story.h.c.a.b bVar = this.f145663b.f127584c;
        if (bVar != null) {
            bVar.a();
        }
        com.bytedance.f.a.a.j jVar = this.f145665d;
        if (jVar == null) {
            l.a("gestureService");
        }
        jVar.b(O());
    }

    public void F() {
        a().C().observe(this, new d(this));
        EditStickerViewModel editStickerViewModel = this.t;
        if (editStickerViewModel == null) {
            l.a("editStickerViewModel");
        }
        selectNonNullSubscribe(editStickerViewModel, b.f145692a, new ah(), new e(this));
    }

    public final void G() {
        this.f145663b.a(a().C().getValue(), a());
        List<InteractStickerStruct> a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(b().getMainBusinessContext(), C(), com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT);
        if (!(a2 == null || a2.isEmpty())) {
            n.a((List) a2, (Comparator) g.f145691a);
            D();
            for (InteractStickerStruct interactStickerStruct : a2) {
                this.f145663b.a(interactStickerStruct, (Boolean) false);
            }
        }
    }

    public final void N() {
        EditInfoStickerViewModel editInfoStickerViewModel = this.f145664c;
        if (editInfoStickerViewModel == null) {
            l.a("editInfoStickerViewModel");
        }
        editInfoStickerViewModel.i();
        EditTextStickerViewModel editTextStickerViewModel = this.f145668g;
        if (editTextStickerViewModel == null) {
            l.a("editTextStickerViewModel");
        }
        editTextStickerViewModel.n();
        ((com.ss.android.ugc.gamora.editor.sticker.duet.a) this.f145670i.getValue()).b();
        EditCommentStickerViewModel editCommentStickerViewModel = this.f145671j;
        if (editCommentStickerViewModel == null) {
            l.a("editCommentStickerViewModel");
        }
        editCommentStickerViewModel.a();
        EditPollStickerViewModel editPollStickerViewModel = this.f145669h;
        if (editPollStickerViewModel == null) {
            l.a("editPollStickerViewModel");
        }
        editPollStickerViewModel.b();
        EditDonationStickerViewModel editDonationStickerViewModel = this.f145673l;
        if (editDonationStickerViewModel == null) {
            l.a("editDonationStickerViewModel");
        }
        editDonationStickerViewModel.b();
        EditLiveCDStickerViewModel editLiveCDStickerViewModel = this.f145672k;
        if (editLiveCDStickerViewModel == null) {
            l.a("editLiveCDStickerViewModel");
        }
        editLiveCDStickerViewModel.h();
    }

    public void E() {
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((androidx.fragment.app.e) activity).a(EditInfoStickerViewModel.class);
        l.b(a2, "");
        this.f145664c = (EditInfoStickerViewModel) a2;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = t.a((androidx.fragment.app.e) activity2).a(EditTextStickerViewModel.class);
        l.b(a3, "");
        this.f145668g = (EditTextStickerViewModel) a3;
        Activity activity3 = this.f42913m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a4 = t.a((androidx.fragment.app.e) activity3).a(EditCommentStickerViewModel.class);
        l.b(a4, "");
        this.f145671j = (EditCommentStickerViewModel) a4;
        Activity activity4 = this.f42913m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a5 = t.a((androidx.fragment.app.e) activity4).a(EditPollStickerViewModel.class);
        l.b(a5, "");
        this.f145669h = (EditPollStickerViewModel) a5;
        Activity activity5 = this.f42913m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a6 = t.a((androidx.fragment.app.e) activity5).a(EditDonationStickerViewModel.class);
        l.b(a6, "");
        this.f145673l = (EditDonationStickerViewModel) a6;
        Activity activity6 = this.f42913m;
        Objects.requireNonNull(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a7 = t.a((androidx.fragment.app.e) activity6).a(EditLiveCDStickerViewModel.class);
        l.b(a7, "");
        this.f145672k = (EditLiveCDStickerViewModel) a7;
        Activity activity7 = this.f42913m;
        Objects.requireNonNull(activity7, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a8 = t.a((androidx.fragment.app.e) activity7).a(EditStickerViewModel.class);
        l.b(a8, "");
        this.t = (EditStickerViewModel) a8;
    }

    public final void a(com.bytedance.f.a.a.j jVar) {
        l.d(jVar, "");
        this.f145665d = jVar;
    }

    @Override // com.bytedance.jedi.arch.b
    public <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f145681a;

        static {
            Covode.recordClassIndex(95669);
        }

        d(a aVar) {
            this.f145681a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.asve.editor.g gVar = (com.ss.android.ugc.asve.editor.g) obj;
            if (gVar != null) {
                this.f145681a.f145663b.a(gVar, this.f145681a.a());
            }
        }
    }

    public final void b(String str) {
        l.d(str, "");
        this.f145663b.f127582a = str;
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        E();
        F();
        this.f145663b.n = new c(this);
    }

    public a(com.bytedance.o.f fVar) {
        l.d(fVar, "");
        this.v = fVar;
    }

    public final void a(com.ss.android.ugc.aweme.editSticker.interact.e eVar) {
        l.d(eVar, "");
        this.f145663b.f127187f = eVar;
    }

    public final void a(VESize vESize) {
        l.d(vESize, "");
        this.f145663b.q = vESize;
    }

    public final void a(String str) {
        l.d(str, "");
        this.f145663b.a(str);
    }

    public final void a(boolean z) {
        this.f145663b.f127186e = z;
    }

    @Override // com.bytedance.jedi.arch.h
    public <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class g<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public static final g f145691a = new g();

        static {
            Covode.recordClassIndex(95673);
        }

        g() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) obj;
            InteractStickerStruct interactStickerStruct2 = (InteractStickerStruct) obj2;
            l.b(interactStickerStruct, "");
            int index = interactStickerStruct.getIndex();
            l.b(interactStickerStruct2, "");
            return index - interactStickerStruct2.getIndex();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, k, h.z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(95670);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, k kVar) {
            k kVar2 = kVar;
            l.d(bVar, "");
            l.d(kVar2, "");
            boolean booleanValue = kVar2.f39404b.booleanValue();
            this.this$0.f145663b.x = !booleanValue;
            if (booleanValue) {
                this.this$0.f145663b.a(new com.ss.android.ugc.aweme.editSticker.c.b(this) {
                    /* class com.ss.android.ugc.gamora.editor.a.e.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ e f145690a;

                    static {
                        Covode.recordClassIndex(95671);
                    }

                    @Override // com.ss.android.ugc.aweme.editSticker.c.b
                    public final boolean a() {
                        this.f145690a.this$0.f145663b.i();
                        return true;
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f145690a = r1;
                    }
                });
            } else {
                this.this$0.f145663b.a(com.ss.android.ugc.aweme.editSticker.c.a.f88100a);
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        FrameLayout frameLayout = (FrameLayout) viewGroup;
        l.d(frameLayout, "");
        this.f145663b.s = false;
        com.ss.android.ugc.asve.editor.g value = a().C().getValue();
        if (value != null) {
            this.f145663b.q = value.b();
            this.f145663b.a(this.f42913m, frameLayout);
            com.bytedance.f.a.a.j jVar = this.f145665d;
            if (jVar == null) {
                l.a("gestureService");
            }
            jVar.a(O());
        }
        return new View(frameLayout.getContext());
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    public final b.i<List<com.ss.android.ugc.aweme.editSticker.compile.b>> a(String str, int i2, int i3, int i4, int i5) {
        l.d(str, "");
        return this.f145663b.b(str, i2, i3, i4, i5);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
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

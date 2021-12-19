package com.ss.android.ugc.aweme.editSticker.text.als;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextWatcher;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.TextStruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class EditTextStickerViewModel extends LifecycleAwareViewModel<EditTextStickerViewState> implements com.ss.android.ugc.aweme.editSticker.interact.d, a {
    public static final a o = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f88315a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f88316b;

    /* renamed from: c  reason: collision with root package name */
    public TextStickerData f88317c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f88318d;

    /* renamed from: e  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.editSticker.text.view.q> f88319e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public boolean f88320f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f88321g;

    /* renamed from: l  reason: collision with root package name */
    public final com.bytedance.als.k<h.z> f88322l = new com.bytedance.als.k<>();

    /* renamed from: m  reason: collision with root package name */
    public final com.bytedance.als.k<h.p<Boolean, Boolean>> f88323m = new com.bytedance.als.k<>();
    public final com.bytedance.als.k<Boolean> n = new com.bytedance.als.k<>();
    private androidx.lifecycle.t<Boolean> p;
    private final h.h q = h.i.a((h.f.a.a) e.f88327a);
    private h.p<Integer, Integer> r;
    private final h.h s = h.i.a((h.f.a.a) i.f88333a);
    private final com.bytedance.als.l<Boolean> t = new com.bytedance.als.l<>(false);

    static {
        Covode.recordClassIndex(55535);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void f() {
        this.f88316b = true;
    }

    public final androidx.lifecycle.t<h.p<Float, Boolean>> u() {
        return (androidx.lifecycle.t) this.q.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55536);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static float a(float f2) {
            return new BigDecimal((double) f2).setScale(4, 1).floatValue();
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final com.bytedance.als.k<h.z> a() {
        return this.f88322l;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final com.bytedance.als.k<h.p<Boolean, Boolean>> b() {
        return this.f88323m;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final com.bytedance.als.k<Boolean> c() {
        return this.n;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final boolean e() {
        return this.f88315a;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final com.ss.android.ugc.aweme.editSticker.interact.d q() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final List<com.ss.android.ugc.aweme.editSticker.text.view.q> r() {
        return this.f88319e;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final com.bytedance.als.h<Boolean> s() {
        return this.t;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void a(boolean z2) {
        c(new m(z2));
        this.f88318d = z2;
        Iterator<T> it = this.f88319e.iterator();
        while (it.hasNext()) {
            it.next().x = this.f88318d;
        }
    }

    public final void a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
        h.f.b.l.d(qVar, "");
        this.f88319e.remove(qVar);
    }

    public final void a(TextStickerData textStickerData, String str) {
        h.f.b.l.d(textStickerData, "");
        c(new u(textStickerData, str));
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.d
    public final boolean a(RectF rectF) {
        h.f.b.l.d(rectF, "");
        for (com.ss.android.ugc.aweme.editSticker.text.view.q qVar : this.f88319e) {
            PointF[] anglePointList = qVar.getAnglePointList();
            if (!(anglePointList == null || anglePointList.length == 0)) {
                RectF a2 = com.ss.android.ugc.aweme.editSticker.f.b.a(anglePointList);
                h.f.b.l.b(a2, "");
                if (a2.top < rectF.top || a2.bottom > rectF.bottom) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void a(com.ss.android.ugc.aweme.editSticker.text.c.e eVar) {
        c(new ad(eVar));
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void a(h.f.a.m<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? super com.ss.android.ugc.aweme.editSticker.text.view.q, h.z> mVar) {
        c(new aa(mVar));
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void a(h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, h.z> bVar) {
        c(new ae(bVar));
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void a(com.ss.android.ugc.aweme.editSticker.text.c.d dVar) {
        c(new ac(dVar));
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void a(h.p<Integer, Integer> pVar) {
        if (this.r == null) {
            this.r = pVar;
        }
        c(new af(pVar));
    }

    static final class e extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<h.p<? extends Float, ? extends Boolean>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f88327a = new e();

        static {
            Covode.recordClassIndex(55552);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<h.p<? extends Float, ? extends Boolean>> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.editSticker.compile.h> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f88333a = new i();

        static {
            Covode.recordClassIndex(55556);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.editSticker.compile.h invoke() {
            return new com.ss.android.ugc.aweme.editSticker.compile.h();
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void g() {
        d(ah.f88324a);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void j() {
        c(v.f88337a);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void k() {
        c(ak.f88326a);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void m() {
        c(w.f88338a);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void t() {
        c(x.f88339a);
    }

    public final int w() {
        return this.f88319e.size();
    }

    public final boolean x() {
        return this.f88319e.isEmpty();
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void h() {
        d(new n());
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void l() {
        c(new ai());
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final boolean o() {
        if (!x()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final boolean i() {
        Boolean value;
        androidx.lifecycle.t<Boolean> tVar = this.p;
        if (tVar == null || (value = tVar.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }

    public final com.ss.android.ugc.aweme.editSticker.text.view.q y() {
        T t2;
        Iterator<T> it = this.f88319e.iterator();
        while (true) {
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (t2.f88710m) {
                break;
            }
        }
        return t2;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final boolean n() {
        c(p.f88334a);
        boolean z2 = false;
        for (com.ss.android.ugc.aweme.editSticker.text.view.q qVar : this.f88319e) {
            if (qVar.e()) {
                qVar.setShowHelpBox(false);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final boolean p() {
        Iterator<T> it = this.f88319e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            TextStickerData data = next.getData();
            if (data != null && data.getHasReadTextAudio()) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ com.bytedance.jedi.arch.af d() {
        return new EditTextStickerViewState(null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
    }

    public final int v() {
        if (this.f88319e.isEmpty()) {
            return 0;
        }
        int size = this.f88319e.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            List<TextStickerTextWrap> textWrapList = this.f88319e.get(i3).getTextWrapList();
            h.f.b.l.b(textWrapList, "");
            for (TextStickerTextWrap textStickerTextWrap : textWrapList) {
                if (textStickerTextWrap != null) {
                    i2 += textStickerTextWrap.safeStrPair().f88416b.size();
                }
            }
        }
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void a(androidx.lifecycle.t<Boolean> tVar) {
        h.f.b.l.d(tVar, "");
        this.p = tVar;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void a(int i2) {
        c(new al(i2));
    }

    public final void b(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
        h.f.b.l.d(qVar, "");
        this.f88319e.add(0, qVar);
    }

    public final void c(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
        c(new j(qVar));
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void d(boolean z2) {
        c(new q(z2));
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void e(boolean z2) {
        d(new k(z2));
    }

    public final void f(boolean z2) {
        this.t.b(Boolean.valueOf(z2));
    }

    static final class h<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditTextStickerViewModel f88329a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f88330b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.q f88331c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ViewGroup f88332d;

        static {
            Covode.recordClassIndex(55555);
        }

        h(EditTextStickerViewModel editTextStickerViewModel, List list, com.ss.android.ugc.aweme.editSticker.text.view.q qVar, ViewGroup viewGroup) {
            this.f88329a = editTextStickerViewModel;
            this.f88330b = list;
            this.f88331c = qVar;
            this.f88332d = viewGroup;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            h.f.b.l.d(iVar, "");
            if (iVar.d() != null) {
                return new TextStickerCompileResult(this.f88331c.b(), (com.ss.android.ugc.aweme.editSticker.compile.b) iVar.d());
            }
            return null;
        }
    }

    public final void a(float f2) {
        u().setValue(new h.p<>(Float.valueOf(f2), false));
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void b(h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, h.z> bVar) {
        c(new ab(bVar));
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void c(boolean z2) {
        this.f88320f = z2;
        for (com.ss.android.ugc.aweme.editSticker.text.view.q qVar : this.f88319e) {
            qVar.setEnableEdit(this.f88320f);
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void a(TextWatcher textWatcher) {
        h.f.b.l.d(textWatcher, "");
        d(new c(textWatcher));
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void b(boolean z2) {
        c(new z(z2));
        androidx.lifecycle.t<Boolean> tVar = this.p;
        if (tVar != null && (!h.f.b.l.a(tVar.getValue(), Boolean.valueOf(z2)))) {
            tVar.setValue(Boolean.valueOf(z2));
        }
    }

    static final class aa extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ h.f.a.m $listener;

        static {
            Covode.recordClassIndex(55537);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(h.f.a.m mVar) {
            super(1);
            this.$listener = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$listener), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, 3, null);
        }
    }

    static final class ab extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ h.f.a.b $listener;

        static {
            Covode.recordClassIndex(55538);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ab(h.f.a.b bVar) {
            super(1);
            this.$listener = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$listener), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049, 3, null);
        }
    }

    static final class ac extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.c.d $listener;

        static {
            Covode.recordClassIndex(55539);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ac(com.ss.android.ugc.aweme.editSticker.text.c.d dVar) {
            super(1);
            this.$listener = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$listener), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -513, 3, null);
        }
    }

    static final class ad extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.c.e $listener;

        static {
            Covode.recordClassIndex(55540);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ad(com.ss.android.ugc.aweme.editSticker.text.c.e eVar) {
            super(1);
            this.$listener = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$listener), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, 3, null);
        }
    }

    static final class ae extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ h.f.a.b $listener;

        static {
            Covode.recordClassIndex(55541);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ae(h.f.a.b bVar) {
            super(1);
            this.$listener = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$listener), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 3, null);
        }
    }

    static final class af extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ h.p $size;

        static {
            Covode.recordClassIndex(55542);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        af(h.p pVar) {
            super(1);
            this.$size = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$size), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8193, 3, null);
        }
    }

    static final class ag extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.d.e $mob;

        static {
            Covode.recordClassIndex(55543);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ag(com.ss.android.ugc.aweme.editSticker.d.e eVar) {
            super(1);
            this.$mob = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$mob), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4097, 3, null);
        }
    }

    static final class ah extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a  reason: collision with root package name */
        public static final ah f88324a = new ah();

        static {
            Covode.recordClassIndex(55544);
        }

        ah() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, new a.b(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 3, null);
        }
    }

    static final class ai extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.q $textStickerView = null;

        static {
            Covode.recordClassIndex(55545);
        }

        ai() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$textStickerView), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, 3, null);
        }
    }

    static final class ak extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a  reason: collision with root package name */
        public static final ak f88326a = new ak();

        static {
            Covode.recordClassIndex(55547);
        }

        ak() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.p(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -131073, 3, null);
        }
    }

    static final class al extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ int $duration;

        static {
            Covode.recordClassIndex(55548);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        al(int i2) {
            super(1);
            this.$duration = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.m(this.$duration), null, -1, 2, null);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ boolean $isFromOutside = true;
        final /* synthetic */ TextStickerData $stickerData;

        static {
            Covode.recordClassIndex(55549);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(TextStickerData textStickerData) {
            super(1);
            this.$stickerData = textStickerData;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, new com.bytedance.jedi.arch.n(new h.p(this.$stickerData, Boolean.valueOf(this.$isFromOutside))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -17, 3, null);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ TextWatcher $listener;

        static {
            Covode.recordClassIndex(55550);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(TextWatcher textWatcher) {
            super(1);
            this.$listener = textWatcher;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$listener), null, null, null, null, -536870913, 3, null);
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ String $content;

        static {
            Covode.recordClassIndex(55551);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.$content = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$content), null, null, null, -1073741825, 3, null);
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f88328a = new f();

        static {
            Covode.recordClassIndex(55553);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.p(), null, null, null, null, null, null, null, null, null, null, null, -4194305, 3, null);
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ boolean $boolean = true;

        static {
            Covode.recordClassIndex(55554);
        }

        public g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.k(this.$boolean), null, null, null, null, null, null, null, null, -33554433, 3, null);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.q $textStickerView;

        static {
            Covode.recordClassIndex(55557);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            super(1);
            this.$textStickerView = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$textStickerView), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32769, 3, null);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ boolean $enable;

        static {
            Covode.recordClassIndex(55558);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(boolean z) {
            super(1);
            this.$enable = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.k(this.$enable), null, null, null, null, null, -268435457, 3, null);
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ String $string;

        static {
            Covode.recordClassIndex(55559);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(1);
            this.$string = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$string), null, null, null, null, null, null, null, null, null, null, -8388609, 3, null);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(55560);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.k(this.$value), null, null, null, null, null, null, null, null, null, null, null, null, null, -1048577, 3, null);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ boolean $autoGoNext = true;

        static {
            Covode.recordClassIndex(55561);
        }

        n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.k(this.$autoGoNext), null, null, null, null, null, null, null, null, null, -16777217, 3, null);
        }
    }

    public static final class o extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.q $stickerView;

        static {
            Covode.recordClassIndex(55562);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            super(1);
            this.$stickerView = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$stickerView), null, null, null, null, null, null, null, null, null, null, null, null, -2097153, 3, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f88334a = new p();

        static {
            Covode.recordClassIndex(55563);
        }

        p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, new com.bytedance.jedi.arch.p(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, 3, null);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ boolean $mute;

        static {
            Covode.recordClassIndex(55564);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(boolean z) {
            super(1);
            this.$mute = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.k(this.$mute), null, null, null, null, null, null, -134217729, 3, null);
        }
    }

    public static final class r extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f88335a = new r();

        static {
            Covode.recordClassIndex(55565);
        }

        r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, new com.bytedance.jedi.arch.p(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, 3, null);
        }
    }

    public static final class s extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.q $view;

        static {
            Covode.recordClassIndex(55566);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public s(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            super(1);
            this.$view = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, new com.bytedance.jedi.arch.d(this.$view), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5, 3, null);
        }
    }

    public static final class t extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f88336a = new t();

        static {
            Covode.recordClassIndex(55567);
        }

        t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, new com.bytedance.jedi.arch.p(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, 3, null);
        }
    }

    static final class u extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ TextStickerData $data;
        final /* synthetic */ String $realText;

        static {
            Covode.recordClassIndex(55568);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(TextStickerData textStickerData, String str) {
            super(1);
            this.$data = textStickerData;
            this.$realText = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.d(new h.p(this.$data, this.$realText)), null, null, null, null, null, null, null, -67108865, 3, null);
        }
    }

    static final class v extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f88337a = new v();

        static {
            Covode.recordClassIndex(55569);
        }

        v() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, new com.bytedance.jedi.arch.p(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65, 3, null);
        }
    }

    static final class w extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f88338a = new w();

        static {
            Covode.recordClassIndex(55570);
        }

        w() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.p(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65537, 3, null);
        }
    }

    static final class x extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a  reason: collision with root package name */
        public static final x f88339a = new x();

        static {
            Covode.recordClassIndex(55571);
        }

        x() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.p(), -1, 1, null);
        }
    }

    public static final class y extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.q $content;

        static {
            Covode.recordClassIndex(55572);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public y(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            super(1);
            this.$content = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$content), null, null, Integer.MAX_VALUE, 3, null);
        }
    }

    static final class z extends h.f.b.m implements h.f.a.b<EditTextStickerViewState, EditTextStickerViewState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(55573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            h.f.b.l.d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, this.$value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -3, 3, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final void a(com.ss.android.ugc.aweme.editSticker.d.e eVar) {
        c(new ag(eVar));
    }

    public final void a(TextStickerData textStickerData) {
        h.f.b.l.d(textStickerData, "");
        d(new b(textStickerData));
    }

    static final class aj<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public static final aj f88325a = new aj();

        static {
            Covode.recordClassIndex(55546);
        }

        aj() {
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((com.ss.android.ugc.aweme.editSticker.text.view.q) obj).y - ((com.ss.android.ugc.aweme.editSticker.text.view.q) obj2).y;
        }
    }

    private final PointF a(PointF pointF, Context context) {
        int i2;
        PointF pointF2 = new PointF();
        h.p<Integer, Integer> pVar = this.r;
        int i3 = 0;
        if (pVar != null) {
            i3 = pVar.getFirst().intValue();
            i2 = pVar.getSecond().intValue();
        } else if (context != null) {
            i3 = dh.b(context);
            i2 = dh.a(context);
        } else {
            i2 = 0;
        }
        pointF2.set(a.a((pointF.x * 1.0f) / ((float) i3)), a.a((pointF.y * 1.0f) / ((float) i2)));
        return pointF2;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final b.i<List<TextStickerCompileResult>> a(com.ss.android.ugc.aweme.editSticker.compile.a aVar, ViewGroup viewGroup) {
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(viewGroup, "");
        n();
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.ugc.aweme.editSticker.text.view.q qVar : this.f88319e) {
            b.i<TContinuationResult> c2 = ((com.ss.android.ugc.aweme.editSticker.compile.c) this.s.getValue()).a(qVar, viewGroup, aVar.f88101a, aVar.f88102b, aVar.f88103c, aVar.f88104d, aVar.f88105e).c(new h(this, arrayList, qVar, viewGroup));
            h.f.b.l.b(c2, "");
            arrayList.add(c2);
        }
        b.i<List<TextStickerCompileResult>> a2 = b.i.a((Collection) arrayList);
        h.f.b.l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.als.a
    public final List<InteractStickerStruct> a(Context context, List<? extends StickerItemModel> list, com.google.gson.f fVar) {
        h.f.b.l.d(list, "");
        h.f.b.l.d(fVar, "");
        ArrayList arrayList = new ArrayList(w());
        List a2 = h.a.n.a((Iterable) this.f88319e, (Comparator) aj.f88325a);
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.ss.android.ugc.aweme.editSticker.text.view.q qVar = (com.ss.android.ugc.aweme.editSticker.text.view.q) a2.get(i2);
            List<TextStickerTextWrap> textWrapList = qVar.getTextWrapList();
            h.f.b.l.b(textWrapList, "");
            if (com.ss.android.ugc.aweme.editSticker.text.bean.t.g(textWrapList)) {
                InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
                interactStickerStruct.setType(5);
                LinkedList linkedList = new LinkedList();
                NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
                normalTrackTimeStamp.setRotation(a.a(qVar.getStickerRotate()));
                normalTrackTimeStamp.setScale(Float.valueOf(qVar.getStickerScale()));
                PointF a3 = a(new PointF(qVar.getCenterX(), qVar.getCenterY()), context);
                normalTrackTimeStamp.setX(a3.x);
                normalTrackTimeStamp.setY(a3.y);
                PointF a4 = a(new PointF((float) qVar.getContentViewWidth(), (float) qVar.getContentViewHeight()), context);
                normalTrackTimeStamp.setWidth(a4.x);
                normalTrackTimeStamp.setHeight(a4.y);
                normalTrackTimeStamp.setStartTime((float) qVar.a(-1));
                normalTrackTimeStamp.setEndTime((float) qVar.b(-1));
                linkedList.add(normalTrackTimeStamp);
                com.ss.android.ugc.aweme.editSticker.f.e.a(interactStickerStruct, linkedList);
                try {
                    interactStickerStruct.setTextStruct(com.ss.android.ugc.aweme.editSticker.d.b().b(new TextStruct(com.ss.android.ugc.aweme.editSticker.text.bean.t.f(textWrapList))));
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.editSticker.h d2 = com.ss.android.ugc.aweme.editSticker.d.d();
                    if (d2 != null) {
                        d2.a(e2);
                    }
                }
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    } else if (((StickerItemModel) list.get(i3)).viewHash == qVar.hashCode()) {
                        interactStickerStruct.setIndex(((StickerItemModel) list.get(i3)).layerWeight);
                        HashMap hashMap = new HashMap();
                        String str = ((StickerItemModel) list.get(i3)).stickerId;
                        h.f.b.l.b(str, "");
                        hashMap.put("text_sticker_id", str);
                        interactStickerStruct.setAttr(com.ss.android.ugc.aweme.editSticker.d.b().b(hashMap));
                        break;
                    } else {
                        i3++;
                    }
                }
                arrayList.add(interactStickerStruct);
            }
        }
        return arrayList;
    }
}

package com.ss.android.ugc.aweme.ftc.components.sticker.text;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class FTCEditTextStickerViewModel extends LifecycleAwareViewModel<FTCEditTextStickerViewState> implements com.ss.android.ugc.aweme.editSticker.interact.d, a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f98109g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.editSticker.text.view.q> f98110a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f98111b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f98112c;

    /* renamed from: d  reason: collision with root package name */
    final com.bytedance.als.k<z> f98113d = new com.bytedance.als.k<>();

    /* renamed from: e  reason: collision with root package name */
    final com.bytedance.als.k<h.p<Boolean, Boolean>> f98114e = new com.bytedance.als.k<>();

    /* renamed from: f  reason: collision with root package name */
    final com.bytedance.als.k<Boolean> f98115f = new com.bytedance.als.k<>();

    /* renamed from: l  reason: collision with root package name */
    private androidx.lifecycle.t<Boolean> f98116l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f98117m = h.i.a((h.f.a.a) c.f98118a);
    private h.p<Integer, Integer> n;
    private final h.h o = h.i.a((h.f.a.a) e.f98123a);

    static {
        Covode.recordClassIndex(62360);
    }

    public final androidx.lifecycle.t<h.p<Float, Boolean>> o() {
        return (androidx.lifecycle.t) this.f98117m.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(62361);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final com.bytedance.als.k<z> a() {
        return this.f98113d;
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final com.bytedance.als.k<h.p<Boolean, Boolean>> b() {
        return this.f98114e;
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final com.bytedance.als.k<Boolean> c() {
        return this.f98115f;
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final com.ss.android.ugc.aweme.editSticker.interact.d m() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final List<com.ss.android.ugc.aweme.editSticker.text.view.q> n() {
        return this.f98110a;
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final void a(boolean z) {
        c(new l(z));
        androidx.lifecycle.t<Boolean> tVar = this.f98116l;
        if (tVar != null && (!h.f.b.l.a(tVar.getValue(), Boolean.valueOf(z)))) {
            tVar.setValue(Boolean.valueOf(z));
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.d
    public final boolean a(RectF rectF) {
        h.f.b.l.d(rectF, "");
        for (com.ss.android.ugc.aweme.editSticker.text.view.q qVar : this.f98110a) {
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

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final void a(h.f.a.m<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? super com.ss.android.ugc.aweme.editSticker.text.view.q, z> mVar) {
        c(new m(mVar));
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final void a(h.p<Integer, Integer> pVar) {
        if (this.n == null) {
            this.n = pVar;
        }
        c(new q(pVar));
    }

    static final class c extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<h.p<? extends Float, ? extends Boolean>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f98118a = new c();

        static {
            Covode.recordClassIndex(62363);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<h.p<? extends Float, ? extends Boolean>> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.editSticker.compile.h> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f98123a = new e();

        static {
            Covode.recordClassIndex(62365);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.editSticker.compile.h invoke() {
            return new com.ss.android.ugc.aweme.editSticker.compile.h();
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final void e() {
        d(s.f98129a);
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final void g() {
        c(j.f98127a);
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final void h() {
        c(u.f98130a);
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final void j() {
        c(k.f98128a);
    }

    public final boolean q() {
        return this.f98110a.isEmpty();
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final void i() {
        c(new t());
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final boolean l() {
        if (!q()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new FTCEditTextStickerViewState(null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final boolean f() {
        Boolean value;
        androidx.lifecycle.t<Boolean> tVar = this.f98116l;
        if (tVar == null || (value = tVar.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final boolean k() {
        c(f.f98124a);
        boolean z = false;
        for (com.ss.android.ugc.aweme.editSticker.text.view.q qVar : this.f98110a) {
            if (qVar.e()) {
                qVar.setShowHelpBox(false);
                z = true;
            }
        }
        return z;
    }

    public final int p() {
        if (this.f98110a.isEmpty()) {
            return 0;
        }
        int size = this.f98110a.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            List<TextStickerTextWrap> textWrapList = this.f98110a.get(i3).getTextWrapList();
            h.f.b.l.b(textWrapList, "");
            for (TextStickerTextWrap textStickerTextWrap : textWrapList) {
                if (textStickerTextWrap != null) {
                    i2 += textStickerTextWrap.safeStrPair().f88416b.size();
                }
            }
        }
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final void a(androidx.lifecycle.t<Boolean> tVar) {
        h.f.b.l.d(tVar, "");
        this.f98116l = tVar;
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final void a(com.ss.android.ugc.aweme.editSticker.d.e eVar) {
        c(new r(eVar));
    }

    static final class d<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FTCEditTextStickerViewModel f98119a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f98120b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.q f98121c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ViewGroup f98122d;

        static {
            Covode.recordClassIndex(62364);
        }

        d(FTCEditTextStickerViewModel fTCEditTextStickerViewModel, List list, com.ss.android.ugc.aweme.editSticker.text.view.q qVar, ViewGroup viewGroup) {
            this.f98119a = fTCEditTextStickerViewModel;
            this.f98120b = list;
            this.f98121c = qVar;
            this.f98122d = viewGroup;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            h.f.b.l.d(iVar, "");
            if (iVar.d() != null) {
                return new TextStickerCompileResult(this.f98121c.b(), (com.ss.android.ugc.aweme.editSticker.compile.b) iVar.d());
            }
            return null;
        }
    }

    public final void a(float f2) {
        o().setValue(new h.p<>(Float.valueOf(f2), false));
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final void b(boolean z) {
        this.f98111b = z;
        for (com.ss.android.ugc.aweme.editSticker.text.view.q qVar : this.f98110a) {
            qVar.setEnableEdit(this.f98111b);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {
        final /* synthetic */ boolean $isFromOutside = true;
        final /* synthetic */ TextStickerData $stickerData;

        static {
            Covode.recordClassIndex(62362);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(TextStickerData textStickerData) {
            super(1);
            this.$stickerData = textStickerData;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            h.f.b.l.d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, new com.bytedance.jedi.arch.n(new h.p(this.$stickerData, Boolean.valueOf(this.$isFromOutside))), null, null, null, null, null, null, null, null, null, null, null, 65519, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f98124a = new f();

        static {
            Covode.recordClassIndex(62366);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            h.f.b.l.d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, new com.bytedance.jedi.arch.p(), null, null, null, null, null, null, null, null, null, null, null, null, 65527, null);
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f98125a = new g();

        static {
            Covode.recordClassIndex(62367);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            h.f.b.l.d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, new com.bytedance.jedi.arch.p(), null, null, null, null, null, null, null, null, null, null, null, null, 65527, null);
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.q $view;

        static {
            Covode.recordClassIndex(62368);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            super(1);
            this.$view = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            h.f.b.l.d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, new com.bytedance.jedi.arch.d(this.$view), null, null, null, null, null, null, null, null, null, null, null, null, null, 65531, null);
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f98126a = new i();

        static {
            Covode.recordClassIndex(62369);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            h.f.b.l.d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, new com.bytedance.jedi.arch.p(), null, null, null, null, null, null, null, null, null, null, null, null, 65527, null);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f98127a = new j();

        static {
            Covode.recordClassIndex(62370);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            h.f.b.l.d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, null, new com.bytedance.jedi.arch.p(), null, null, null, null, null, null, null, null, null, null, 65503, null);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f98128a = new k();

        static {
            Covode.recordClassIndex(62371);
        }

        k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            h.f.b.l.d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.p(), null, null, 57343, null);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(62372);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            h.f.b.l.d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, this.$value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65533, null);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {
        final /* synthetic */ h.f.a.m $listener;

        static {
            Covode.recordClassIndex(62373);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(h.f.a.m mVar) {
            super(1);
            this.$listener = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            h.f.b.l.d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$listener), null, null, null, null, null, null, null, null, 65407, null);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.c.d $listener;

        static {
            Covode.recordClassIndex(62374);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(com.ss.android.ugc.aweme.editSticker.text.c.d dVar) {
            super(1);
            this.$listener = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            h.f.b.l.d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$listener), null, null, null, null, null, null, null, 65279, null);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.c.e $listener;

        static {
            Covode.recordClassIndex(62375);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(com.ss.android.ugc.aweme.editSticker.text.c.e eVar) {
            super(1);
            this.$listener = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            h.f.b.l.d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, null, null, new com.bytedance.jedi.arch.d(this.$listener), null, null, null, null, null, null, null, null, null, 65471, null);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {
        final /* synthetic */ h.f.a.b $listener;

        static {
            Covode.recordClassIndex(62376);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(h.f.a.b bVar) {
            super(1);
            this.$listener = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            h.f.b.l.d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$listener), null, null, null, null, null, null, 65023, null);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {
        final /* synthetic */ h.p $size;

        static {
            Covode.recordClassIndex(62377);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(h.p pVar) {
            super(1);
            this.$size = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            h.f.b.l.d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$size), null, null, null, null, 63487, null);
        }
    }

    static final class r extends h.f.b.m implements h.f.a.b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.d.e $mob;

        static {
            Covode.recordClassIndex(62378);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(com.ss.android.ugc.aweme.editSticker.d.e eVar) {
            super(1);
            this.$mob = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            h.f.b.l.d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$mob), null, null, null, null, null, 64511, null);
        }
    }

    static final class s extends h.f.b.m implements h.f.a.b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f98129a = new s();

        static {
            Covode.recordClassIndex(62379);
        }

        s() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            h.f.b.l.d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, new a.b(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65534, null);
        }
    }

    static final class t extends h.f.b.m implements h.f.a.b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.q $textStickerView = null;

        static {
            Covode.recordClassIndex(62380);
        }

        t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            h.f.b.l.d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$textStickerView), null, null, null, 61439, null);
        }
    }

    static final class u extends h.f.b.m implements h.f.a.b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f98130a = new u();

        static {
            Covode.recordClassIndex(62381);
        }

        u() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            h.f.b.l.d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.p(), null, 49151, null);
        }
    }

    public final void a(TextStickerData textStickerData) {
        h.f.b.l.d(textStickerData, "");
        d(new b(textStickerData));
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final void a(com.ss.android.ugc.aweme.editSticker.text.c.d dVar) {
        c(new n(dVar));
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final void a(com.ss.android.ugc.aweme.editSticker.text.c.e eVar) {
        c(new o(eVar));
    }

    public final void a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
        h.f.b.l.d(qVar, "");
        this.f98110a.remove(qVar);
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final void a(h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, z> bVar) {
        c(new p(bVar));
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.a
    public final b.i<List<TextStickerCompileResult>> a(com.ss.android.ugc.aweme.editSticker.compile.a aVar, ViewGroup viewGroup) {
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(viewGroup, "");
        k();
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.ugc.aweme.editSticker.text.view.q qVar : this.f98110a) {
            b.i<TContinuationResult> c2 = ((com.ss.android.ugc.aweme.editSticker.compile.c) this.o.getValue()).a(qVar, viewGroup, aVar.f88101a, aVar.f88102b, aVar.f88103c, aVar.f88104d, aVar.f88105e).c(new d(this, arrayList, qVar, viewGroup));
            h.f.b.l.b(c2, "");
            arrayList.add(c2);
        }
        b.i<List<TextStickerCompileResult>> a2 = b.i.a((Collection) arrayList);
        h.f.b.l.b(a2, "");
        return a2;
    }
}

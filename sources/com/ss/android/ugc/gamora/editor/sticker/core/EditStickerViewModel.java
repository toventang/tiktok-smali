package com.ss.android.ugc.gamora.editor.sticker.core;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public final class EditStickerViewModel extends LifecycleAwareViewModel<EditStickerState> implements a {

    /* renamed from: a  reason: collision with root package name */
    public final h.h f146393a = h.i.a((h.f.a.a) d.f146401a);

    /* renamed from: b  reason: collision with root package name */
    public h.f.a.a<Rect> f146394b;

    /* renamed from: c  reason: collision with root package name */
    private c f146395c;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f146396d = h.i.a((h.f.a.a) v.f146412a);

    /* renamed from: e  reason: collision with root package name */
    private final h.h f146397e = h.i.a((h.f.a.a) u.f146411a);

    /* renamed from: f  reason: collision with root package name */
    private final h.h f146398f = h.i.a((h.f.a.a) g.f146403a);

    /* renamed from: g  reason: collision with root package name */
    private final h.h f146399g = h.i.a((h.f.a.a) f.f146402a);

    /* renamed from: l  reason: collision with root package name */
    private final h.h f146400l = h.i.a((h.f.a.a) t.f146410a);

    static {
        Covode.recordClassIndex(96253);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.core.a
    public final androidx.lifecycle.t<Boolean> g() {
        return (androidx.lifecycle.t) this.f146400l.getValue();
    }

    public final androidx.lifecycle.t<Boolean> l() {
        return (androidx.lifecycle.t) this.f146396d.getValue();
    }

    public final androidx.lifecycle.t<Boolean> m() {
        return (androidx.lifecycle.t) this.f146397e.getValue();
    }

    public final androidx.lifecycle.t<Boolean> n() {
        return (androidx.lifecycle.t) this.f146398f.getValue();
    }

    public final androidx.lifecycle.t<Boolean> o() {
        return (androidx.lifecycle.t) this.f146399g.getValue();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.core.a
    public final h.f.a.a<Rect> h() {
        return this.f146394b;
    }

    static final class d extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f146401a = new d();

        static {
            Covode.recordClassIndex(96258);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Boolean> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class t extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f146410a = new t();

        static {
            Covode.recordClassIndex(96274);
        }

        t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Boolean> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class u extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f146411a = new u();

        static {
            Covode.recordClassIndex(96275);
        }

        u() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Boolean> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class v extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f146412a = new v();

        static {
            Covode.recordClassIndex(96276);
        }

        v() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Boolean> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.core.a
    public final void a() {
        d(r.f146408a);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.core.a
    public final void b() {
        c(s.f146409a);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.core.a
    public final void c() {
        d(k.f146405a);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.core.a
    public final void e() {
        d(j.f146404a);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.core.a
    public final void j() {
        d(l.f146406a);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.core.a
    public final void k() {
        c(m.f146407a);
    }

    static final class f extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f146402a = new f();

        static {
            Covode.recordClassIndex(96260);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Boolean> invoke() {
            androidx.lifecycle.t tVar = new androidx.lifecycle.t();
            tVar.setValue(false);
            return tVar;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f146403a = new g();

        static {
            Covode.recordClassIndex(96261);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Boolean> invoke() {
            androidx.lifecycle.t tVar = new androidx.lifecycle.t();
            tVar.setValue(false);
            return tVar;
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.core.a
    public final boolean f() {
        c cVar = this.f146395c;
        if (cVar != null) {
            return cVar.N();
        }
        return false;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.core.a
    public final QaStruct i() {
        InteractStickerStruct h2;
        c cVar = this.f146395c;
        if (cVar == null || (h2 = cVar.U().h()) == null) {
            return null;
        }
        return h2.getQaStruct();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditStickerState(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    public final void b(int i2) {
        d(new e(i2));
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.core.a
    public final void a(int i2) {
        d(new aa(i2));
    }

    public static final class c extends h.f.b.m implements h.f.a.b<EditStickerState, EditStickerState> {
        final /* synthetic */ boolean $enable = true;

        static {
            Covode.recordClassIndex(96257);
        }

        public c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            h.f.b.l.d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.k(this.$enable), null, null, null, null, null, null, 2080767, null);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<EditStickerState, EditStickerState> {
        final /* synthetic */ int $keepShowingStickerType;

        static {
            Covode.recordClassIndex(96259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(int i2) {
            super(1);
            this.$keepShowingStickerType = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            h.f.b.l.d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.m(this.$keepShowingStickerType), null, null, null, null, null, null, null, null, null, null, null, null, null, 2097023, null);
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.b<EditStickerState, EditStickerState> {
        final /* synthetic */ boolean $isClipLoad = true;

        static {
            Covode.recordClassIndex(96262);
        }

        public h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            h.f.b.l.d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.k(this.$isClipLoad), null, null, null, null, null, null, null, 2088959, null);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<EditStickerState, EditStickerState> {
        final /* synthetic */ Effect $effect;
        final /* synthetic */ String $extras;

        static {
            Covode.recordClassIndex(96263);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(Effect effect, String str) {
            super(1);
            this.$effect = effect;
            this.$extras = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            h.f.b.l.d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.n(h.v.a(this.$effect, this.$extras)), null, null, null, null, null, null, null, null, null, null, 2096127, null);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<EditStickerState, EditStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f146404a = new j();

        static {
            Covode.recordClassIndex(96264);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            h.f.b.l.d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.p(), null, null, null, null, null, null, null, null, 2093055, null);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<EditStickerState, EditStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f146405a = new k();

        static {
            Covode.recordClassIndex(96265);
        }

        k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            h.f.b.l.d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.p(), null, null, null, null, null, null, null, null, null, 2095103, null);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<EditStickerState, EditStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f146406a = new l();

        static {
            Covode.recordClassIndex(96266);
        }

        l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            h.f.b.l.d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.p(), null, null, 1835007, null);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<EditStickerState, EditStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f146407a = new m();

        static {
            Covode.recordClassIndex(96267);
        }

        m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            h.f.b.l.d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.p(), 1048575, null);
        }
    }

    public static final class n extends h.f.b.m implements h.f.a.b<EditStickerState, EditStickerState> {
        final /* synthetic */ int $stickerType = 8;

        static {
            Covode.recordClassIndex(96268);
        }

        public n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            h.f.b.l.d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.m(this.$stickerType), null, null, null, null, null, null, null, null, null, null, null, null, 2096895, null);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<EditStickerState, EditStickerState> {
        final /* synthetic */ h.p $value;

        static {
            Covode.recordClassIndex(96269);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(h.p pVar) {
            super(1);
            this.$value = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            h.f.b.l.d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.n(this.$value), null, null, null, 1966079, null);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<EditStickerState, EditStickerState> {
        final /* synthetic */ boolean $visible;

        static {
            Covode.recordClassIndex(96270);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(boolean z) {
            super(1);
            this.$visible = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            h.f.b.l.d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.k(this.$visible), null, null, null, null, 2031615, null);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<EditStickerState, EditStickerState> {
        final /* synthetic */ Integer $value;

        static {
            Covode.recordClassIndex(96271);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(Integer num) {
            super(1);
            this.$value = num;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            h.f.b.l.d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, this.$value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097149, null);
        }
    }

    static final class r extends h.f.b.m implements h.f.a.b<EditStickerState, EditStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f146408a = new r();

        static {
            Covode.recordClassIndex(96272);
        }

        r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            h.f.b.l.d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, new a.b(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097150, null);
        }
    }

    static final class s extends h.f.b.m implements h.f.a.b<EditStickerState, EditStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f146409a = new s();

        static {
            Covode.recordClassIndex(96273);
        }

        s() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            h.f.b.l.d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.p(), null, null, null, null, null, null, null, null, null, null, null, 2096639, null);
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.b<EditStickerState, EditStickerState> {
        final /* synthetic */ long $duration = 300;
        final /* synthetic */ float $toY;

        static {
            Covode.recordClassIndex(96254);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(float f2) {
            super(1);
            this.$toY = f2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            h.f.b.l.d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, new com.bytedance.jedi.arch.n(new h.p(Float.valueOf(this.$toY), Long.valueOf(this.$duration))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097147, null);
        }
    }

    static final class aa extends h.f.b.m implements h.f.a.b<EditStickerState, EditStickerState> {
        final /* synthetic */ boolean $cancelPin = true;
        final /* synthetic */ int $duration;

        static {
            Covode.recordClassIndex(96255);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(int i2) {
            super(1);
            this.$duration = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            h.f.b.l.d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.n(h.v.a(Integer.valueOf(this.$duration), Boolean.valueOf(this.$cancelPin))), null, 1572863, null);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<EditStickerState, EditStickerState> {
        final /* synthetic */ boolean $enableText = true;
        final /* synthetic */ boolean $hideStickerView;
        final /* synthetic */ h.f.a.a $onDone;

        static {
            Covode.recordClassIndex(96256);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z, h.f.a.a aVar) {
            super(1);
            this.$hideStickerView = z;
            this.$onDone = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            h.f.b.l.d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.o(new h.u(Boolean.valueOf(this.$hideStickerView), Boolean.valueOf(this.$enableText), this.$onDone)), null, null, null, null, null, 2064383, null);
        }
    }

    public static final class w extends h.f.b.m implements h.f.a.b<EditStickerState, EditStickerState> {
        final /* synthetic */ float $scale;
        final /* synthetic */ float $x;
        final /* synthetic */ float $y;

        static {
            Covode.recordClassIndex(96277);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public w(float f2, float f3, float f4) {
            super(1);
            this.$scale = f2;
            this.$x = f3;
            this.$y = f4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            h.f.b.l.d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, new com.bytedance.jedi.arch.o(new h.u(Float.valueOf(this.$scale), Float.valueOf(this.$x), Float.valueOf(this.$y))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097087, null);
        }
    }

    public static final class x extends h.f.b.m implements h.f.a.b<EditStickerState, EditStickerState> {
        final /* synthetic */ float $scale;
        final /* synthetic */ float $x;
        final /* synthetic */ float $y;

        static {
            Covode.recordClassIndex(96278);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public x(float f2, float f3, float f4) {
            super(1);
            this.$scale = f2;
            this.$x = f3;
            this.$y = f4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            h.f.b.l.d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, new com.bytedance.jedi.arch.o(new h.u(Float.valueOf(this.$scale), Float.valueOf(this.$x), Float.valueOf(this.$y))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097119, null);
        }
    }

    public static final class y extends h.f.b.m implements h.f.a.b<EditStickerState, EditStickerState> {
        final /* synthetic */ float $scale;
        final /* synthetic */ float $x;
        final /* synthetic */ float $y;

        static {
            Covode.recordClassIndex(96279);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public y(float f2, float f3, float f4) {
            super(1);
            this.$scale = f2;
            this.$x = f3;
            this.$y = f4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            h.f.b.l.d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, new com.bytedance.jedi.arch.o(new h.u(Float.valueOf(this.$scale), Float.valueOf(this.$x), Float.valueOf(this.$y))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097135, null);
        }
    }

    static final class z extends h.f.b.m implements h.f.a.b<EditStickerState, EditStickerState> {
        final /* synthetic */ float $scale;
        final /* synthetic */ float $x;
        final /* synthetic */ float $y;

        static {
            Covode.recordClassIndex(96280);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(float f2, float f3, float f4) {
            super(1);
            this.$scale = f2;
            this.$x = f3;
            this.$y = f4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            h.f.b.l.d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, new com.bytedance.jedi.arch.o(new h.u(Float.valueOf(this.$scale), Float.valueOf(this.$x), Float.valueOf(this.$y))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097143, null);
        }
    }

    public final void a(c cVar) {
        h.f.b.l.d(cVar, "");
        this.f146395c = cVar;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.core.a
    public final void a(h.p<Integer, Integer> pVar) {
        h.f.b.l.d(pVar, "");
        d(new o(pVar));
    }

    public final void a(Integer num) {
        c(new q(num));
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.core.a
    public final void a(boolean z2) {
        d(new p(z2));
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.core.a
    public final void a(Effect effect, String str) {
        h.f.b.l.d(effect, "");
        d(new i(effect, str));
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.core.a
    public final void a(boolean z2, h.f.a.a<h.z> aVar) {
        h.f.b.l.d(aVar, "");
        d(new b(z2, aVar));
    }

    public final void a(float f2, float f3, float f4) {
        c(new z(f2, f3, f4));
    }
}

package com.ss.android.ugc.aweme.shortvideo.editcut;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
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
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.z;
import java.util.List;

public final class EditAdjustClipsBottomViewModel extends BaseJediViewModel<EditAdjustClipsBottomViewState> {

    /* renamed from: a  reason: collision with root package name */
    com.bytedance.jedi.arch.b f128067a;

    static {
        Covode.recordClassIndex(83928);
    }

    public static final class a implements com.bytedance.jedi.arch.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.i f128068a;

        static {
            Covode.recordClassIndex(83929);
        }

        @Override // com.bytedance.jedi.arch.h
        public final boolean getUniqueOnlyGlobal() {
            return true;
        }

        @Override // androidx.lifecycle.m
        public final androidx.lifecycle.i getLifecycle() {
            return this.f128068a;
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

        a(androidx.lifecycle.i iVar) {
            this.f128068a = iVar;
        }

        @Override // com.bytedance.jedi.arch.b
        public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
            h.f.b.l.d(vm1, "");
            return (S1) b.a.a(this, vm1);
        }

        @Override // com.bytedance.jedi.arch.h
        public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
            h.f.b.l.d(vm1, "");
            h.f.b.l.d(bVar, "");
            return (R) b.a.a(this, vm1, bVar);
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
        public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
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
        public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
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

    public final void b() {
        d(d.f128069a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return h();
    }

    public final void g() {
        d(h.f128070a);
    }

    private static EditAdjustClipsBottomViewState h() {
        return new EditAdjustClipsBottomViewState(0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public final EditAdjustClipsBottomViewState a() {
        EditAdjustClipsBottomViewState editAdjustClipsBottomViewState;
        com.bytedance.jedi.arch.b bVar = this.f128067a;
        if (bVar == null || (editAdjustClipsBottomViewState = (EditAdjustClipsBottomViewState) bVar.getState(this)) == null) {
            return h();
        }
        return editAdjustClipsBottomViewState;
    }

    public final void a(float f2) {
        c(new p(f2));
    }

    public final void b(float f2) {
        c(new o(f2));
    }

    static final class b extends h.f.b.m implements h.f.a.b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {
        final /* synthetic */ List $videos;

        static {
            Covode.recordClassIndex(83930);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(List list) {
            super(1);
            this.$videos = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            h.f.b.l.d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$videos), null, null, null, 61439, null);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {
        final /* synthetic */ int $index;
        final /* synthetic */ VideoSegment $video;

        static {
            Covode.recordClassIndex(83931);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(int i2, VideoSegment videoSegment) {
            super(1);
            this.$index = i2;
            this.$video = videoSegment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            h.f.b.l.d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, null, null, null, null, new com.bytedance.jedi.arch.n(h.v.a(Integer.valueOf(this.$index), this.$video)), null, null, null, null, null, null, 65023, null);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f128069a = new d();

        static {
            Covode.recordClassIndex(83932);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            h.f.b.l.d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.p(), null, null, 57343, null);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {
        final /* synthetic */ t $restoreUIConfig;

        static {
            Covode.recordClassIndex(83933);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(t tVar) {
            super(1);
            this.$restoreUIConfig = tVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            h.f.b.l.d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.d(this.$restoreUIConfig), null, null, null, null, 63487, null);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {
        final /* synthetic */ int $state;

        static {
            Covode.recordClassIndex(83934);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(int i2) {
            super(1);
            this.$state = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            h.f.b.l.d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, this.$state, null, null, null, null, null, null, null, null, null, null, null, null, 65527, null);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {
        final /* synthetic */ int $index;
        final /* synthetic */ VideoSegment $video;

        static {
            Covode.recordClassIndex(83935);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(int i2, VideoSegment videoSegment) {
            super(1);
            this.$index = i2;
            this.$video = videoSegment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            h.f.b.l.d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, null, null, null, null, null, new com.bytedance.jedi.arch.n(h.v.a(Integer.valueOf(this.$index), this.$video)), null, null, null, null, null, 64511, null);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f128070a = new h();

        static {
            Covode.recordClassIndex(83936);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            h.f.b.l.d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.p(), null, 49151, null);
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {
        final /* synthetic */ int $tabIndex;

        static {
            Covode.recordClassIndex(83937);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(int i2) {
            super(1);
            this.$tabIndex = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            h.f.b.l.d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, this.$tabIndex, 0, null, null, null, null, null, null, null, null, null, null, null, null, 65531, null);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f128071a = new j();

        static {
            Covode.recordClassIndex(83938);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            h.f.b.l.d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.p(), 32767, null);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {
        final /* synthetic */ int $index;
        final /* synthetic */ int $originIndex;

        static {
            Covode.recordClassIndex(83939);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(int i2, int i3) {
            super(1);
            this.$index = i2;
            this.$originIndex = i3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            h.f.b.l.d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, this.$index, this.$originIndex, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, 65532, null);
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {
        final /* synthetic */ boolean $onFocus;

        static {
            Covode.recordClassIndex(83940);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(boolean z) {
            super(1);
            this.$onFocus = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            h.f.b.l.d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, null, null, null, Boolean.valueOf(this.$onFocus), null, null, null, null, null, null, null, 65279, null);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {
        final /* synthetic */ boolean $musicSyncMode;

        static {
            Covode.recordClassIndex(83941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(boolean z) {
            super(1);
            this.$musicSyncMode = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            h.f.b.l.d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, Boolean.valueOf(this.$musicSyncMode), null, null, null, null, null, null, null, null, null, null, null, 65519, null);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {
        final /* synthetic */ int $currentState;

        static {
            Covode.recordClassIndex(83942);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(int i2) {
            super(1);
            this.$currentState = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            h.f.b.l.d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, null, null, Integer.valueOf(this.$currentState), null, null, null, null, null, null, null, null, 65407, null);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {
        final /* synthetic */ float $scale;

        static {
            Covode.recordClassIndex(83943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(float f2) {
            super(1);
            this.$scale = f2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            h.f.b.l.d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, Float.valueOf(this.$scale), null, null, null, null, null, null, null, null, null, null, 65503, null);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {
        final /* synthetic */ float $selectTime;

        static {
            Covode.recordClassIndex(83944);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(float f2) {
            super(1);
            this.$selectTime = f2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            h.f.b.l.d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, null, Float.valueOf(this.$selectTime), null, null, null, null, null, null, null, null, null, 65471, null);
        }
    }

    public final void a(int i2) {
        d(new f(i2));
    }

    public final void a(t tVar) {
        d(new e(tVar));
    }

    public final void a(boolean z) {
        d(new m(z));
    }
}

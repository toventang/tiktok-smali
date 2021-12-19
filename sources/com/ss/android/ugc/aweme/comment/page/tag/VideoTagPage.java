package com.ss.android.ugc.aweme.comment.page.tag;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.i;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.a.s;
import h.f.b.g;
import h.f.b.l;
import h.h;
import h.k.k;
import java.io.Serializable;
import java.util.Collection;

@com.bytedance.ies.powerpage.a.a
public final class VideoTagPage extends h implements q {

    /* renamed from: e  reason: collision with root package name */
    public static final a f72162e = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private final h f72163f = RouteArgExtension.INSTANCE.optionalArgNotNull(this, c.f72165a, "init_config", b.class);

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f72164g;

    static {
        Covode.recordClassIndex(44417);
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.f72164g == null) {
            this.f72164g = new SparseArray();
        }
        View view = (View) this.f72164g.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f72164g.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        SparseArray sparseArray = this.f72164g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final b c() {
        return (b) this.f72163f.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44418);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements com.bytedance.assem.arch.extensions.c, Serializable {
        private final Aweme aweme;
        private final String enterFrom;
        private final int permission;
        private final Collection<IMUser> tagged;

        static {
            Covode.recordClassIndex(44419);
        }

        public b() {
            this(null, null, 0, null, 15, null);
        }

        public final Aweme getAweme() {
            return this.aweme;
        }

        public final String getEnterFrom() {
            return this.enterFrom;
        }

        public final int getPermission() {
            return this.permission;
        }

        public final Collection<IMUser> getTagged() {
            return this.tagged;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Collection<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, Aweme aweme2, int i2, Collection<? extends IMUser> collection) {
            l.d(str, "");
            l.d(collection, "");
            this.enterFrom = str;
            this.aweme = aweme2;
            this.permission = i2;
            this.tagged = collection;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(String str, Aweme aweme2, int i2, Collection collection, int i3, g gVar) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? null : aweme2, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? z.INSTANCE : collection);
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<i> getReceiverHolder() {
        return this;
    }

    static final class d extends h.f.b.m implements h.f.a.b<BaseFragmentViewModel, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f72166a = new d();

        static {
            Covode.recordClassIndex(44421);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            l.d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(AnonymousClass1.f72167a);
            return h.z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<Boolean, b> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f72165a = new c();

        static {
            Covode.recordClassIndex(44420);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ b invoke(Boolean bool) {
            bool.booleanValue();
            return new b(null, null, 0, null, 15, null);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        androidx.fragment.app.e activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.setSoftInputMode(32);
        }
        a(d.f72166a);
    }

    static final class e extends h.f.b.m implements h.f.a.b<Assembler, h.z> {
        final /* synthetic */ VideoTagPage this$0;

        static {
            Covode.recordClassIndex(44423);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VideoTagPage videoTagPage) {
            super(1);
            this.this$0 = videoTagPage;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, h.z>) new h.f.a.b<com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, h.z>(this) {
                /* class com.ss.android.ugc.aweme.comment.page.tag.VideoTagPage.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(44424);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar) {
                    com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar2 = iVar;
                    l.d(iVar2, "");
                    iVar2.a(new b(this.this$0.this$0.c().getEnterFrom(), this.this$0.this$0.c().getAweme(), this.this$0.this$0.c().getPermission(), this.this$0.this$0.c().getTagged()));
                    return h.z.f158842a;
                }
            });
            assembler2.b(this.this$0, AnonymousClass2.f72168a);
            assembler2.b(this.this$0, AnonymousClass3.f72169a);
            assembler2.b(this.this$0, AnonymousClass4.f72170a);
            assembler2.b(this.this$0, AnonymousClass5.f72171a);
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        com.bytedance.assem.arch.extensions.d.a(this, new e(this));
        r.a("enter_tag_mention_page", new com.ss.android.ugc.aweme.app.f.d().a("previous_page", c().getEnterFrom()).a("function", "tag").f66730a);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.jg, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super i, ? super S, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super i, ? super A, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super i, ? super A, ? super B, h.z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super i, ? super Throwable, h.z> mVar, h.f.a.b<? super i, h.z> bVar, h.f.a.m<? super i, ? super T, h.z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super i, ? super A, ? super B, ? super C, h.z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(ahVar, "");
        l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}

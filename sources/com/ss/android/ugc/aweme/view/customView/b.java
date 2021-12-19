package com.ss.android.ugc.aweme.view.customView;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.t;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.common.ab;
import com.ss.android.ugc.aweme.common.y;
import com.ss.android.ugc.aweme.common.z;
import com.ss.android.ugc.aweme.model.r;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import h.f.a.s;
import h.f.b.l;
import h.h;
import h.i;
import h.k.k;

public abstract class b extends Fragment implements q {

    /* renamed from: a  reason: collision with root package name */
    final String[] f144185a = {"android.permission.CAMERA"};

    /* renamed from: b  reason: collision with root package name */
    private final Handler f144186b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    private final h f144187c = i.a((h.f.a.a) new a(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f144188d = i.a((h.f.a.a) new g(this));

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f144189e;

    static {
        Covode.recordClassIndex(94354);
    }

    public View a(int i2) {
        if (this.f144189e == null) {
            this.f144189e = new SparseArray();
        }
        View view = (View) this.f144189e.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f144189e.put(i2, findViewById);
        return findViewById;
    }

    public final ProfileNaviEditorViewModel a() {
        return (ProfileNaviEditorViewModel) this.f144187c.getValue();
    }

    public abstract int b();

    public abstract void c();

    public boolean d() {
        return true;
    }

    public abstract NaviGLSurfaceView e();

    @Override // com.bytedance.jedi.arch.h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    public void j() {
        SparseArray sparseArray = this.f144189e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        j();
    }

    @Override // com.bytedance.jedi.arch.v
    public m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    public final void h() {
        this.f144186b.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        a();
        MessageCenter.removeAllListener();
        MessageCenter.destroy();
    }

    static final class a extends h.f.b.m implements h.f.a.a<ProfileNaviEditorViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(94355);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ProfileNaviEditorViewModel invoke() {
            JediViewModel a2 = t.a(this.this$0.requireActivity()).a(ProfileNaviEditorViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<ProfileNaviSwitcherViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(94362);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ProfileNaviSwitcherViewModel invoke() {
            JediViewModel a2 = t.a(this.this$0.requireActivity()).a(ProfileNaviSwitcherViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    public final void i() {
        a naviManager;
        NaviGLSurfaceView e2 = e();
        if (!(e2 == null || (naviManager = e2.getNaviManager()) == null)) {
            naviManager.a("");
        }
        a().f144335a = false;
        a();
        z.a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        i();
        NaviGLSurfaceView e2 = e();
        if (e2 != null) {
            e2.onPause();
        }
        this.f144186b.removeCallbacksAndMessages(null);
    }

    public final void f() {
        a();
        if (r.f110811a != null) {
            String headStickerPath = ((ProfileNaviEditorState) a().a(this)).getHeadStickerPath();
            if (headStickerPath != null && headStickerPath.length() != 0) {
                a(headStickerPath);
            } else if (getContext() != null) {
                ProfileNaviEditorViewModel a2 = a();
                Context context = getContext();
                if (context == null) {
                    l.b();
                }
                l.b(context, "");
                a2.c(context);
            }
        }
    }

    public void g() {
        f.a.b.b unused = selectSubscribe(a(), c.f144193a, new ah(), new C3843b(this));
        f.a.b.b unused2 = selectSubscribe(a(), d.f144194a, new ah(), new c(this));
        f.a.b.b unused3 = selectSubscribe(a(), e.f144195a, new ah(), new d(this));
        f.a.b.b unused4 = selectSubscribe((ProfileNaviSwitcherViewModel) this.f144188d.getValue(), f.f144196a, new ah(), new e(this));
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f144191a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f144192b;

        static {
            Covode.recordClassIndex(94361);
        }

        f(b bVar, String str) {
            this.f144191a = bVar;
            this.f144192b = str;
        }

        public final void run() {
            if (this.f144191a.a().f144335a) {
                b bVar = this.f144191a;
                if (!(bVar.getContext() == null || bVar.getActivity() == null || !bVar.d())) {
                    bVar.a();
                    if (ab.f76387c) {
                        Context context = bVar.getContext();
                        if (context == null) {
                            l.b();
                        }
                        l.b(context, "");
                        for (String str : bVar.f144185a) {
                            if (androidx.core.app.a.a(context, str) != 0) {
                                return;
                            }
                        }
                        NaviGLSurfaceView e2 = bVar.e();
                        if (e2 != null) {
                            e2.setCamera(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            this.f144191a.a(this.f144192b);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        NaviGLSurfaceView e2;
        a naviManager;
        super.onResume();
        NaviGLSurfaceView e3 = e();
        if (e3 != null) {
            e3.onResume();
        }
        if (!(getContext() == null || (e2 = e()) == null || (naviManager = e2.getNaviManager()) == null)) {
            ProfileNaviEditorViewModel a2 = a();
            Context context = getContext();
            if (context == null) {
                l.b();
            }
            l.b(context, "");
            DownloadableModelSupportResourceFinder resourceFinder = a2.b(context).getResourceFinder();
            naviManager.a();
            naviManager.f144174c = resourceFinder;
        }
        f();
    }

    public final void a(String str) {
        a naviManager;
        NaviGLSurfaceView e2 = e();
        if (!(e2 == null || (naviManager = e2.getNaviManager()) == null)) {
            naviManager.a(str);
        }
        a(new f(this, str), 1000);
    }

    @Override // com.bytedance.jedi.arch.h
    public <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, String, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(94357);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, String str) {
            String str2 = str;
            l.d(iVar, "");
            if (str2 != null) {
                this.this$0.a(str2);
            }
            return h.z.f158842a;
        }
    }

    public final void a(Runnable runnable, long j2) {
        l.d(runnable, "");
        this.f144186b.removeCallbacksAndMessages(null);
        this.f144186b.postDelayed(runnable, j2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        g();
        c();
        Context context = getContext();
        if (context != null) {
            ProfileNaviEditorViewModel a2 = a();
            l.b(context, "");
            a2.a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.view.customView.b$b  reason: collision with other inner class name */
    public static final class C3843b extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, y, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(94356);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3843b(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, y yVar) {
            NaviGLSurfaceView e2;
            a naviManager;
            y yVar2 = yVar;
            l.d(iVar, "");
            if (!(yVar2 == null || (e2 = this.this$0.e()) == null || (naviManager = e2.getNaviManager()) == null)) {
                naviManager.a(yVar2.f76615a, yVar2.f76617c, yVar2.f76617c, yVar2.f76616b);
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(94358);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            NaviGLSurfaceView e2;
            boolean booleanValue = bool.booleanValue();
            l.d(iVar, "");
            if (booleanValue) {
                this.this$0.a();
                if (!ab.f76387c && (e2 = this.this$0.e()) != null) {
                    e2.setCamera(false);
                }
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(94359);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l.d(iVar, "");
            if (booleanValue) {
                this.this$0.i();
                this.this$0.a(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.view.customView.b.e.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ e f144190a;

                    static {
                        Covode.recordClassIndex(94360);
                    }

                    {
                        this.f144190a = r1;
                    }

                    public final void run() {
                        this.f144190a.this$0.f();
                    }
                }, 500);
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater.cloneInContext(new ContextThemeWrapper(getActivity(), 16974122)), b(), viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
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

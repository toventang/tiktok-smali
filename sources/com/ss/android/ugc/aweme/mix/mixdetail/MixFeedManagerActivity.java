package com.ss.android.ugc.aweme.mix.mixdetail;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.q;
import com.bytedance.assem.arch.extensions.r;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tiktok.proxy.d;
import com.bytedance.tiktok.proxy.f;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class MixFeedManagerActivity extends com.ss.android.ugc.aweme.mix.a implements h {

    /* renamed from: b  reason: collision with root package name */
    public static final c f109969b = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public g f109970a;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f109971c;

    /* renamed from: d  reason: collision with root package name */
    private String f109972d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f109973e = "";

    /* renamed from: f  reason: collision with root package name */
    private String f109974f = "";

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f109975g;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a, com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(70489);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a invoke(com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a aVar) {
            l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(70487);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.mix.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f109975g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.mix.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f109975g == null) {
            this.f109975g = new SparseArray();
        }
        View view = (View) this.f109975g.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f109975g.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final androidx.lifecycle.m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class c {
        static {
            Covode.recordClassIndex(70490);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.tiktok.proxy.f
    public final androidx.lifecycle.m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.h
    public final d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.h<d> getActualReceiverHolder() {
        return this;
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(70488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public MixFeedManagerActivity() {
        h.k.c a2 = ab.a(MixVideosManageViewModel.class);
        this.f109971c = new com.bytedance.assem.arch.viewModel.b(a2, new a(a2), u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, b.INSTANCE);
    }

    @Override // com.ss.android.ugc.aweme.mix.a
    public final Fragment a() {
        com.ss.android.ugc.aweme.mix.a.a.f(this.f109974f, "manage_video");
        String str = this.f109972d;
        l.d(str, "");
        Bundle bundle = new Bundle();
        bundle.putString("key_mix_id", str);
        g gVar = new g();
        gVar.setArguments(bundle);
        this.f109970a = gVar;
        return gVar;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.mix.a, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity", "onCreate", true);
        Intent intent = getIntent();
        if (intent != null) {
            String str = "";
            if (intent.hasExtra("key_mix_id")) {
                String a2 = a(intent, "key_mix_id");
                if (a2 == null) {
                    a2 = str;
                }
                this.f109972d = a2;
            }
            if (intent.hasExtra("key_mix_name")) {
                String a3 = a(intent, "key_mix_name");
                if (a3 == null) {
                    a3 = str;
                }
                this.f109973e = a3;
            }
            if (intent.hasExtra("enter_from")) {
                String a4 = a(intent, "enter_from");
                if (a4 != null) {
                    str = a4;
                }
                this.f109974f = str;
            }
        }
        ((MixVideosManageViewModel) this.f109971c.getValue()).a(this.f109972d, this.f109973e, this.f109974f);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j> void a(AssemViewModel<S> assemViewModel, k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super d, ? super S, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super d, ? super A, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super d, ? super A, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, k<q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super d, ? super A, ? super B, z> qVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, k<r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super d, ? super A, ? super B, ? super C, z> rVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super d, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(kVar5, "");
        l.d(sVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}

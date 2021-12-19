package com.ss.android.ugc.aweme.mix.videodetail;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.q;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.e;
import com.ss.android.ugc.aweme.mix.b.f;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.d;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.Serializable;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class MixVideoDetailActivity extends DetailActivity implements h, e, j {

    /* renamed from: j  reason: collision with root package name */
    public static final c f110273j = new c((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f110274k;

    /* renamed from: l  reason: collision with root package name */
    private SparseArray f110275l;

    public static final class b extends m implements h.f.a.b<d, d> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(70774);
        }

        public b() {
            super(1);
        }

        public final d invoke(d dVar) {
            l.c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(70772);
    }

    private MixVideosViewModel d() {
        return (MixVideosViewModel) this.f110274k.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f110275l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f110275l == null) {
            this.f110275l = new SparseArray();
        }
        View view = (View) this.f110275l.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f110275l.put(i2, findViewById);
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
    public final com.bytedance.tiktok.proxy.d getReceiverForHostVM() {
        return null;
    }

    @Override // org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.detail.ui.DetailActivity
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(153, new g(MixVideoDetailActivity.class, "manageVideoDoneClick", com.ss.android.ugc.aweme.mix.b.g.class, ThreadMode.MAIN, 0, false));
        subscriberEventTypes.put(154, new g(MixVideoDetailActivity.class, "onDeleteMix", f.class, ThreadMode.MAIN, 0, false));
        subscriberEventTypes.put(155, new g(MixVideoDetailActivity.class, "onReomveFeedFromMixDetailSuccess", com.ss.android.ugc.aweme.mix.b.h.class, ThreadMode.MAIN, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.detail.ui.DetailActivity
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.detail.ui.DetailActivity
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.detail.ui.DetailActivity
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.detail.ui.DetailActivity
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class c {
        static {
            Covode.recordClassIndex(70775);
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
    public final com.bytedance.tiktok.proxy.f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.h
    public final com.bytedance.tiktok.proxy.d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.h<com.bytedance.tiktok.proxy.d> getActualReceiverHolder() {
        return this;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.detail.ui.DetailActivity
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        try {
            super.onDestroy();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(70773);
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

    public MixVideoDetailActivity() {
        h.k.c a2 = ab.a(MixVideosViewModel.class);
        this.f110274k = new com.bytedance.assem.arch.viewModel.b(a2, new a(a2), u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, b.INSTANCE);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.detail.ui.DetailActivity
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

    @r(a = ThreadMode.MAIN)
    public final void manageVideoDoneClick(com.ss.android.ugc.aweme.mix.b.g gVar) {
        l.d(gVar, "");
        finish();
    }

    @r(a = ThreadMode.MAIN)
    public final void onDeleteMix(f fVar) {
        l.d(fVar, "");
        finish();
    }

    @r(a = ThreadMode.MAIN)
    public final void onReomveFeedFromMixDetailSuccess(com.ss.android.ugc.aweme.mix.b.h hVar) {
        l.d(hVar, "");
        finish();
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.detail.ui.ak, com.ss.android.ugc.aweme.detail.ui.DetailActivity, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.bo, 0);
        EventBus.a(EventBus.a(), this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity", "onCreate", false);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity
    public final com.ss.android.ugc.aweme.detail.ui.l a(com.ss.android.ugc.aweme.feed.param.b bVar) {
        Serializable serializable;
        long j2;
        String str;
        String str2;
        String str3;
        Intent intent = getIntent();
        String str4 = null;
        if (intent != null) {
            serializable = intent.getSerializableExtra("mix_video_list_params");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof com.ss.android.ugc.aweme.mix.e.a)) {
            serializable = null;
        }
        com.ss.android.ugc.aweme.mix.e.a aVar = (com.ss.android.ugc.aweme.mix.e.a) serializable;
        if (bVar != null) {
            if (aVar != null) {
                str = aVar.getMVideoFrom();
            } else {
                str = null;
            }
            bVar.setFrom(str);
            if (aVar != null) {
                str2 = aVar.getMSecUid();
            } else {
                str2 = null;
            }
            bVar.setSecUid(str2);
            if (aVar != null) {
                str3 = aVar.getMUsrId();
            } else {
                str3 = null;
            }
            bVar.setUid(str3);
            if (aVar != null) {
                str4 = aVar.getEnterGroupId();
            }
            bVar.setPlaylistEnterGroupId(str4);
        }
        MixVideosViewModel d2 = d();
        if (aVar != null) {
            j2 = aVar.getPageStartTime();
        } else {
            j2 = -1;
        }
        d2.x = j2;
        Bundle bundle = new Bundle();
        bundle.putSerializable("mix_video_list_params", aVar);
        if (aVar != null) {
            bundle.putSerializable("feed_param", bVar);
        }
        i iVar = new i();
        iVar.setArguments(bundle);
        return iVar;
    }

    @Override // com.ss.android.ugc.aweme.mix.api.e
    public final void a(Aweme aweme) {
        l.d(aweme, "");
        d().a(MixVideosViewModel.ad.f110095a);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, k<q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, z> qVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, k<com.bytedance.assem.arch.extensions.r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, z> rVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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

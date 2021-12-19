package com.ss.android.ugc.aweme.trending.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.app.d;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.ar;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.base.arch.i;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainState;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel;
import com.ss.android.ugc.aweme.utils.w;
import h.f.a.r;
import h.f.a.s;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.k.c;
import h.k.k;
import h.z;
import org.greenrobot.eventbus.j;

public final class TrendingDetailActivity extends DetailActivity implements ar<i>, q, j {

    /* renamed from: j  reason: collision with root package name */
    public i f141087j = new i();

    /* renamed from: k  reason: collision with root package name */
    private final lifecycleAwareLazy f141088k;

    /* renamed from: l  reason: collision with root package name */
    private SparseArray f141089l;

    public static final class a extends m implements h.f.a.m<TrendingMainState, Bundle, TrendingMainState> {
        public static final a INSTANCE = new a();

        static {
            Covode.recordClassIndex(92106);
        }

        public a() {
            super(2);
        }

        public final TrendingMainState invoke(TrendingMainState trendingMainState, Bundle bundle) {
            l.c(trendingMainState, "");
            return trendingMainState;
        }
    }

    static {
        Covode.recordClassIndex(92105);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f141089l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f141089l == null) {
            this.f141089l = new SparseArray();
        }
        View view = (View) this.f141089l.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f141089l.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.detail.ui.ak, com.ss.android.ugc.aweme.detail.ui.DetailActivity, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.detail.ui.DetailActivity
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.detail.ui.DetailActivity
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.detail.ui.DetailActivity
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.detail.ui.DetailActivity
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ i d() {
        return this.f141087j;
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.detail.ui.DetailActivity
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        w.a(hashCode());
    }

    public TrendingDetailActivity() {
        c a2 = ab.a(TrendingMainViewModel.class);
        this.f141088k = new lifecycleAwareLazy(this, new b(this, a2, a.INSTANCE, a2));
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

    public static final class b extends m implements h.f.a.a<TrendingMainViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ d $this_viewModel;
        final /* synthetic */ c $viewModelClass;
        final /* synthetic */ c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(92107);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar, c cVar, h.f.a.m mVar, c cVar2) {
            super(0);
            this.$this_viewModel = dVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel invoke() {
            /*
                r4 = this;
                androidx.appcompat.app.d r1 = r4.$this_viewModel
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.ar) r0
                androidx.lifecycle.ad$b r0 = r0.d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r4.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r3 = ""
                h.f.b.l.a(r1, r3)
                h.k.c r0 = r4.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_trending_ui_TrendingDetailActivity$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel> r0 = com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel.class
                com.bytedance.jedi.arch.y r0 = r1.a(r0)
                if (r0 == 0) goto L_0x0038
                h.f.b.l.a(r2, r3)
                r0.binding(r2)
            L_0x0038:
                com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity$b$1 r0 = new com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity$b$1
                r0.<init>(r4)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_trending_ui_TrendingDetailActivity$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity
    public final com.ss.android.ugc.aweme.detail.ui.l a(com.ss.android.ugc.aweme.feed.param.b bVar) {
        Bundle bundle;
        String str;
        Intent intent = getIntent();
        if (intent != null) {
            bundle = a(intent);
        } else {
            bundle = null;
        }
        TrendingMainViewModel trendingMainViewModel = (TrendingMainViewModel) this.f141088k.getValue();
        if (bVar == null || (str = bVar.getEnterMethodValue()) == null) {
            str = "";
        }
        l.d(str, "");
        trendingMainViewModel.f141164c = str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 71);
        com.ss.android.ugc.aweme.trending.d.a.f141070a = bVar;
        int hashCode = hashCode();
        w.f143191a = hashCode;
        w.a("video_play", "enter_from", com.ss.android.ugc.aweme.trending.d.a.f141071b, hashCode);
        w.a("video_play", "trending_entrance", com.ss.android.ugc.aweme.trending.d.a.f141072c, hashCode);
        w.a("video_play", "from_group_id", com.ss.android.ugc.aweme.trending.d.a.f141073d, hashCode);
        w.a("video_play", "trending_topic", com.ss.android.ugc.aweme.trending.d.a.f141074e, hashCode);
        w.a("video_play", "trending_topic_id", com.ss.android.ugc.aweme.trending.d.a.f141075f, hashCode);
        w.a("video_play", "trending_topic_source", com.ss.android.ugc.aweme.trending.d.a.f141076g, hashCode);
        w.a("video_play", "topic_rank", com.ss.android.ugc.aweme.trending.d.a.f141077h, hashCode);
        w.a("video_play", "topic_group_rank", com.ss.android.ugc.aweme.trending.d.a.f141078i, hashCode);
        w.a("video_play", "topic_group_num", com.ss.android.ugc.aweme.trending.d.a.f141079j, hashCode);
        w.a("play_time", "enter_from", com.ss.android.ugc.aweme.trending.d.a.f141071b, hashCode);
        w.a("play_time", "trending_entrance", com.ss.android.ugc.aweme.trending.d.a.f141072c, hashCode);
        w.a("play_time", "from_group_id", com.ss.android.ugc.aweme.trending.d.a.f141073d, hashCode);
        w.a("play_time", "trending_topic", com.ss.android.ugc.aweme.trending.d.a.f141074e, hashCode);
        w.a("play_time", "trending_topic_id", com.ss.android.ugc.aweme.trending.d.a.f141075f, hashCode);
        w.a("play_time", "trending_topic_source", com.ss.android.ugc.aweme.trending.d.a.f141076g, hashCode);
        w.a("play_time", "topic_rank", com.ss.android.ugc.aweme.trending.d.a.f141077h, hashCode);
        w.a("play_time", "topic_group_rank", com.ss.android.ugc.aweme.trending.d.a.f141078i, hashCode);
        w.a("play_time", "topic_group_num", com.ss.android.ugc.aweme.trending.d.a.f141079j, hashCode);
        w.a("video_play_finish", "enter_from", com.ss.android.ugc.aweme.trending.d.a.f141071b, hashCode);
        w.a("video_play_finish", "trending_entrance", com.ss.android.ugc.aweme.trending.d.a.f141072c, hashCode);
        w.a("video_play_finish", "from_group_id", com.ss.android.ugc.aweme.trending.d.a.f141073d, hashCode);
        w.a("video_play_finish", "trending_topic", com.ss.android.ugc.aweme.trending.d.a.f141074e, hashCode);
        w.a("video_play_finish", "trending_topic_id", com.ss.android.ugc.aweme.trending.d.a.f141075f, hashCode);
        w.a("video_play_finish", "trending_topic_source", com.ss.android.ugc.aweme.trending.d.a.f141076g, hashCode);
        w.a("video_play_finish", "topic_rank", com.ss.android.ugc.aweme.trending.d.a.f141077h, hashCode);
        w.a("video_play_finish", "topic_group_rank", com.ss.android.ugc.aweme.trending.d.a.f141078i, hashCode);
        w.a("video_play_finish", "topic_group_num", com.ss.android.ugc.aweme.trending.d.a.f141079j, hashCode);
        w.a("like", "enter_from", com.ss.android.ugc.aweme.trending.d.a.f141071b, hashCode);
        w.a("like", "trending_entrance", com.ss.android.ugc.aweme.trending.d.a.f141072c, hashCode);
        w.a("like", "from_group_id", com.ss.android.ugc.aweme.trending.d.a.f141073d, hashCode);
        w.a("like", "trending_topic", com.ss.android.ugc.aweme.trending.d.a.f141074e, hashCode);
        w.a("like", "trending_topic_id", com.ss.android.ugc.aweme.trending.d.a.f141075f, hashCode);
        w.a("like", "trending_topic_source", com.ss.android.ugc.aweme.trending.d.a.f141076g, hashCode);
        w.a("like", "topic_rank", com.ss.android.ugc.aweme.trending.d.a.f141077h, hashCode);
        w.a("like", "topic_group_rank", com.ss.android.ugc.aweme.trending.d.a.f141078i, hashCode);
        w.a("like", "topic_group_num", com.ss.android.ugc.aweme.trending.d.a.f141079j, hashCode);
        w.a("like_cancel", "enter_from", com.ss.android.ugc.aweme.trending.d.a.f141071b, hashCode);
        w.a("like_cancel", "trending_entrance", com.ss.android.ugc.aweme.trending.d.a.f141072c, hashCode);
        w.a("like_cancel", "from_group_id", com.ss.android.ugc.aweme.trending.d.a.f141073d, hashCode);
        w.a("like_cancel", "trending_topic", com.ss.android.ugc.aweme.trending.d.a.f141074e, hashCode);
        w.a("like_cancel", "trending_topic_id", com.ss.android.ugc.aweme.trending.d.a.f141075f, hashCode);
        w.a("like_cancel", "trending_topic_source", com.ss.android.ugc.aweme.trending.d.a.f141076g, hashCode);
        w.a("like_cancel", "topic_rank", com.ss.android.ugc.aweme.trending.d.a.f141077h, hashCode);
        w.a("like_cancel", "topic_group_rank", com.ss.android.ugc.aweme.trending.d.a.f141078i, hashCode);
        w.a("like_cancel", "topic_group_num", com.ss.android.ugc.aweme.trending.d.a.f141079j, hashCode);
        w.a("follow", "enter_from", com.ss.android.ugc.aweme.trending.d.a.f141071b, hashCode);
        w.a("follow", "trending_entrance", com.ss.android.ugc.aweme.trending.d.a.f141072c, hashCode);
        w.a("follow", "from_group_id", com.ss.android.ugc.aweme.trending.d.a.f141073d, hashCode);
        w.a("follow", "trending_topic", com.ss.android.ugc.aweme.trending.d.a.f141074e, hashCode);
        w.a("follow", "trending_topic_id", com.ss.android.ugc.aweme.trending.d.a.f141075f, hashCode);
        w.a("follow", "trending_topic_source", com.ss.android.ugc.aweme.trending.d.a.f141076g, hashCode);
        w.a("follow", "topic_rank", com.ss.android.ugc.aweme.trending.d.a.f141077h, hashCode);
        w.a("follow", "topic_group_rank", com.ss.android.ugc.aweme.trending.d.a.f141078i, hashCode);
        w.a("follow", "topic_group_num", com.ss.android.ugc.aweme.trending.d.a.f141079j, hashCode);
        w.a("click_comment_button", "enter_from", com.ss.android.ugc.aweme.trending.d.a.f141071b, hashCode);
        w.a("click_comment_button", "trending_entrance", com.ss.android.ugc.aweme.trending.d.a.f141072c, hashCode);
        w.a("click_comment_button", "from_group_id", com.ss.android.ugc.aweme.trending.d.a.f141073d, hashCode);
        w.a("click_comment_button", "trending_topic", com.ss.android.ugc.aweme.trending.d.a.f141074e, hashCode);
        w.a("click_comment_button", "trending_topic_id", com.ss.android.ugc.aweme.trending.d.a.f141075f, hashCode);
        w.a("click_comment_button", "trending_topic_source", com.ss.android.ugc.aweme.trending.d.a.f141076g, hashCode);
        w.a("click_comment_button", "topic_rank", com.ss.android.ugc.aweme.trending.d.a.f141077h, hashCode);
        w.a("click_comment_button", "topic_group_rank", com.ss.android.ugc.aweme.trending.d.a.f141078i, hashCode);
        w.a("click_comment_button", "topic_group_num", com.ss.android.ugc.aweme.trending.d.a.f141079j, hashCode);
        w.a("post_comment", "enter_from", com.ss.android.ugc.aweme.trending.d.a.f141071b, hashCode);
        w.a("post_comment", "trending_entrance", com.ss.android.ugc.aweme.trending.d.a.f141072c, hashCode);
        w.a("post_comment", "from_group_id", com.ss.android.ugc.aweme.trending.d.a.f141073d, hashCode);
        w.a("post_comment", "trending_topic", com.ss.android.ugc.aweme.trending.d.a.f141074e, hashCode);
        w.a("post_comment", "trending_topic_id", com.ss.android.ugc.aweme.trending.d.a.f141075f, hashCode);
        w.a("post_comment", "trending_topic_source", com.ss.android.ugc.aweme.trending.d.a.f141076g, hashCode);
        w.a("post_comment", "topic_rank", com.ss.android.ugc.aweme.trending.d.a.f141077h, hashCode);
        w.a("post_comment", "topic_group_rank", com.ss.android.ugc.aweme.trending.d.a.f141078i, hashCode);
        w.a("post_comment", "topic_group_num", com.ss.android.ugc.aweme.trending.d.a.f141079j, hashCode);
        w.a("click_more_button", "enter_from", com.ss.android.ugc.aweme.trending.d.a.f141071b, hashCode);
        w.a("click_more_button", "trending_entrance", com.ss.android.ugc.aweme.trending.d.a.f141072c, hashCode);
        w.a("click_more_button", "from_group_id", com.ss.android.ugc.aweme.trending.d.a.f141073d, hashCode);
        w.a("click_more_button", "trending_topic", com.ss.android.ugc.aweme.trending.d.a.f141074e, hashCode);
        w.a("click_more_button", "trending_topic_id", com.ss.android.ugc.aweme.trending.d.a.f141075f, hashCode);
        w.a("click_more_button", "trending_topic_source", com.ss.android.ugc.aweme.trending.d.a.f141076g, hashCode);
        w.a("click_more_button", "topic_rank", com.ss.android.ugc.aweme.trending.d.a.f141077h, hashCode);
        w.a("click_more_button", "topic_group_rank", com.ss.android.ugc.aweme.trending.d.a.f141078i, hashCode);
        w.a("click_more_button", "topic_group_num", com.ss.android.ugc.aweme.trending.d.a.f141079j, hashCode);
        w.a("share_video", "enter_from", com.ss.android.ugc.aweme.trending.d.a.f141071b, hashCode);
        w.a("share_video", "trending_entrance", com.ss.android.ugc.aweme.trending.d.a.f141072c, hashCode);
        w.a("share_video", "from_group_id", com.ss.android.ugc.aweme.trending.d.a.f141073d, hashCode);
        w.a("share_video", "trending_topic", com.ss.android.ugc.aweme.trending.d.a.f141074e, hashCode);
        w.a("share_video", "trending_topic_id", com.ss.android.ugc.aweme.trending.d.a.f141075f, hashCode);
        w.a("share_video", "trending_topic_source", com.ss.android.ugc.aweme.trending.d.a.f141076g, hashCode);
        w.a("share_video", "topic_rank", com.ss.android.ugc.aweme.trending.d.a.f141077h, hashCode);
        w.a("share_video", "topic_group_rank", com.ss.android.ugc.aweme.trending.d.a.f141078i, hashCode);
        w.a("share_video", "topic_group_num", com.ss.android.ugc.aweme.trending.d.a.f141079j, hashCode);
        l.d(bundle, "");
        bundle.putSerializable("feed_param", bVar);
        a aVar = new a();
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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

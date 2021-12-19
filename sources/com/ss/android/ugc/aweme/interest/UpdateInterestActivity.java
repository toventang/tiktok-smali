package com.ss.android.ugc.aweme.interest;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.dp;
import com.ss.android.ugc.aweme.journey.JourneyApi;
import com.ss.android.ugc.aweme.journey.h;
import com.ss.android.ugc.aweme.journey.o;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.journey.v;
import com.ss.android.ugc.aweme.journey.w;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import f.a.t;
import f.a.z;
import h.f.b.l;
import h.f.b.m;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;

public final class UpdateInterestActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public int f104746a = -1;

    /* renamed from: b  reason: collision with root package name */
    public final p f104747b = p.a.a();

    /* renamed from: c  reason: collision with root package name */
    public final Keva f104748c = Keva.getRepo("new_user_journey");

    /* renamed from: d  reason: collision with root package name */
    public long f104749d;

    /* renamed from: e  reason: collision with root package name */
    public long f104750e = System.currentTimeMillis();

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f104751f;

    static {
        Covode.recordClassIndex(67154);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f104751f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f104751f == null) {
            this.f104751f = new SparseArray();
        }
        View view = (View) this.f104751f.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f104751f.put(i2, findViewById);
        return findViewById;
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.interest.UpdateInterestActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UpdateInterestActivity f104756a;

        static {
            Covode.recordClassIndex(67159);
        }

        c(UpdateInterestActivity updateInterestActivity) {
            this.f104756a = updateInterestActivity;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            int i2;
            Integer num;
            ClickAgent.onClick(view);
            l.b(view, "");
            view.getContext();
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = a();
            }
            if (!j.f107229h) {
                new com.ss.android.ugc.aweme.tux.a.i.a(view.getContext()).a(R.string.de8).a();
                return;
            }
            RecyclerView recyclerView = (RecyclerView) this.f104756a._$_findCachedViewById(R.id.dr2);
            l.b(recyclerView, "");
            RecyclerView.a adapter = recyclerView.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.interestselector.InterestAdapter");
            com.ss.android.ugc.aweme.journey.step.interestselector.a aVar = (com.ss.android.ugc.aweme.journey.step.interestselector.a) adapter;
            h.p<List<w>, JSONArray> a2 = a.a(aVar, false);
            long a3 = this.f104756a.a();
            String jSONArray = a2.getSecond().toString();
            l.b(jSONArray, "");
            RecyclerView recyclerView2 = (RecyclerView) this.f104756a._$_findCachedViewById(R.id.dr2);
            l.b(recyclerView2, "");
            RecyclerView.i layoutManager = recyclerView2.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager");
            r.a("exit_interest_selection", a.a("customize_interests_page", "done", jSONArray, a3, aVar, (FlexboxLayoutManager) layoutManager).f66730a);
            if (this.f104756a.f104747b.c() != 0) {
                i2 = this.f104756a.f104747b.f();
            } else {
                i2 = this.f104756a.f104748c.getInt("update_interest_recommend_group_return_user", this.f104756a.f104748c.getInt("update_interest_recommend_group_new_user", -1));
            }
            JourneyApi journeyApi = h.f104859a;
            com.google.gson.g gVar = new com.google.gson.g();
            gVar.f54715e = false;
            com.google.gson.f b2 = gVar.b();
            if (i2 > 0) {
                num = Integer.valueOf(i2);
            } else {
                num = null;
            }
            journeyApi.uploadInterest(b2.b(new d(num, a2.getFirst(), (int) (a3 / 1000))), "interest_setting_page").b(f.a.h.a.b(f.a.k.a.f158006c)).a(AnonymousClass1.f104757a, AnonymousClass2.f104758a);
            this.f104756a.finish();
        }
    }

    public final long a() {
        return (System.currentTimeMillis() - this.f104750e) + this.f104749d;
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UpdateInterestActivity f104760a;

        static {
            Covode.recordClassIndex(67163);
        }

        e(UpdateInterestActivity updateInterestActivity) {
            this.f104760a = updateInterestActivity;
        }

        public final void run() {
            UpdateInterestActivity updateInterestActivity = this.f104760a;
            DmtStatusView dmtStatusView = (DmtStatusView) updateInterestActivity._$_findCachedViewById(R.id.e_c);
            l.b(dmtStatusView, "");
            updateInterestActivity.f104746a = dmtStatusView.getWidth();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.interest.UpdateInterestActivity", "onResume", true);
        super.onResume();
        this.f104750e = System.currentTimeMillis();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.interest.UpdateInterestActivity", "onResume", false);
    }

    public final void b() {
        t<o> a2;
        String b2 = dp.a.b();
        if (b2 != null) {
            a2 = h.f104859a.getJourney(Integer.valueOf(this.f104747b.e()), "new_user_journey", b2);
        } else {
            a2 = JourneyApi.a.a(h.f104859a, Integer.valueOf(this.f104747b.e()), "new_user_journey");
        }
        a2.b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new f(this));
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        com.ss.android.ugc.aweme.journey.step.interestselector.a aVar;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.dr2);
        l.b(recyclerView, "");
        FlexboxLayoutManager flexboxLayoutManager = null;
        if (recyclerView.getAdapter() != null) {
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.dr2);
            l.b(recyclerView2, "");
            RecyclerView.a adapter = recyclerView2.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.interestselector.InterestAdapter");
            aVar = (com.ss.android.ugc.aweme.journey.step.interestselector.a) adapter;
        } else {
            aVar = null;
        }
        RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.dr2);
        l.b(recyclerView3, "");
        if (recyclerView3.getLayoutManager() != null) {
            RecyclerView recyclerView4 = (RecyclerView) _$_findCachedViewById(R.id.dr2);
            l.b(recyclerView4, "");
            RecyclerView.i layoutManager = recyclerView4.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager");
            flexboxLayoutManager = (FlexboxLayoutManager) layoutManager;
        }
        r.a("exit_interest_selection", a.a("customize_interests_page", "skip", "", a(), aVar, flexboxLayoutManager).f66730a);
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        this.f104749d += System.currentTimeMillis() - this.f104750e;
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

    public static final class d implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UpdateInterestActivity f104759a;

        static {
            Covode.recordClassIndex(67162);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(UpdateInterestActivity updateInterestActivity) {
            this.f104759a = updateInterestActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            this.f104759a.onBackPressed();
        }
    }

    public static final class f implements z<o> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UpdateInterestActivity f104761a;

        static {
            Covode.recordClassIndex(67164);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(UpdateInterestActivity updateInterestActivity) {
            this.f104761a = updateInterestActivity;
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            ((DmtStatusView) this.f104761a._$_findCachedViewById(R.id.e_c)).h();
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
            ((DmtStatusView) this.f104761a._$_findCachedViewById(R.id.e_c)).f();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(o oVar) {
            List list;
            o oVar2 = oVar;
            l.d(oVar2, "");
            UpdateInterestActivity updateInterestActivity = this.f104761a;
            v vVar = oVar2.f104873a;
            if (vVar == null || (list = vVar.f105207a) == null) {
                list = new LinkedList();
            }
            l.d(list, "");
            DmtStatusView dmtStatusView = (DmtStatusView) updateInterestActivity._$_findCachedViewById(R.id.e_c);
            l.b(dmtStatusView, "");
            dmtStatusView.setVisibility(8);
            RecyclerView recyclerView = (RecyclerView) updateInterestActivity._$_findCachedViewById(R.id.dr2);
            l.b(recyclerView, "");
            recyclerView.setLayoutManager(new FlexboxLayoutManager(updateInterestActivity));
            RecyclerView recyclerView2 = (RecyclerView) updateInterestActivity._$_findCachedViewById(R.id.dr2);
            l.b(recyclerView2, "");
            recyclerView2.setVisibility(0);
            g gVar = new g(updateInterestActivity);
            RecyclerView recyclerView3 = (RecyclerView) updateInterestActivity._$_findCachedViewById(R.id.dr2);
            l.b(recyclerView3, "");
            recyclerView3.setAdapter(new c(list, gVar));
            r.a("show_interest_selection", a.a("customize_interests_page", false).f66730a);
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UpdateInterestActivity f104752a;

        static {
            Covode.recordClassIndex(67155);
        }

        a(UpdateInterestActivity updateInterestActivity) {
            this.f104752a = updateInterestActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f104752a.b();
        }
    }

    static final class b extends m implements h.f.a.b<BaseActivityViewModel, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f104753a = new b();

        static {
            Covode.recordClassIndex(67156);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f104754a);
            baseActivityViewModel2.config(AnonymousClass2.f104755a);
            return h.z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.b<Integer, h.z> {
        final /* synthetic */ UpdateInterestActivity this$0;

        static {
            Covode.recordClassIndex(67165);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(UpdateInterestActivity updateInterestActivity) {
            super(1);
            this.this$0 = updateInterestActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Integer num) {
            num.intValue();
            TuxTextView tuxTextView = (TuxTextView) this.this$0._$_findCachedViewById(R.id.ds0);
            l.b(tuxTextView, "");
            RecyclerView recyclerView = (RecyclerView) this.this$0._$_findCachedViewById(R.id.dr2);
            l.b(recyclerView, "");
            RecyclerView.a adapter = recyclerView.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.interestselector.InterestAdapter");
            com.ss.android.ugc.aweme.journey.step.interestselector.a aVar = (com.ss.android.ugc.aweme.journey.step.interestselector.a) adapter;
            boolean z = true;
            if (aVar.f105041b.size() == aVar.f105042c.size() && aVar.f105041b.containsAll(aVar.f105042c)) {
                z = false;
            }
            tuxTextView.setEnabled(z);
            return h.z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.interest.UpdateInterestActivity", "onCreate", true);
        activityConfiguration(b.f104753a);
        super.onCreate(bundle);
        setContentView(R.layout.abe);
        com.bytedance.ies.dmt.ui.widget.e eVar = new com.bytedance.ies.dmt.ui.widget.e(this);
        eVar.setStatus(com.ss.android.ugc.aweme.views.h.a(eVar.getContext(), new a(this)));
        DmtStatusView dmtStatusView = (DmtStatusView) _$_findCachedViewById(R.id.e_c);
        l.b(dmtStatusView, "");
        dmtStatusView.setBuilder(DmtStatusView.a.a(dmtStatusView.getContext()).c(eVar));
        dmtStatusView.setVisibility(0);
        com.bytedance.ies.dmt.ui.f.c.a(_$_findCachedViewById(R.id.ds0), 0.5f);
        ((TuxTextView) _$_findCachedViewById(R.id.ds0)).setOnClickListener(new c(this));
        ((ButtonTitleBar) _$_findCachedViewById(R.id.em8)).setOnTitleBarClickListener(new d(this));
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.ds0);
        l.b(tuxTextView, "");
        tuxTextView.setEnabled(false);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.dr2);
        l.b(recyclerView, "");
        recyclerView.setItemAnimator(null);
        ((DmtStatusView) _$_findCachedViewById(R.id.e_c)).post(new e(this));
        b();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.interest.UpdateInterestActivity", "onCreate", false);
    }
}

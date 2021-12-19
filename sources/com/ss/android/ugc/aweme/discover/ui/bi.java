package com.ss.android.ugc.aweme.discover.ui;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.tux.e.a;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.UgAllServiceImpl;
import com.ss.android.ugc.aweme.app.ai;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.discover.a.ak;
import com.ss.android.ugc.aweme.discover.helper.af;
import com.ss.android.ugc.aweme.discover.helper.ag;
import com.ss.android.ugc.aweme.discover.k.d;
import com.ss.android.ugc.aweme.discover.mob.q;
import com.ss.android.ugc.aweme.discover.model.ISearchHistoryManager;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchUserFeedback;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.model.tab.SearchTabJumpCenter;
import com.ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel;
import com.ss.android.ugc.aweme.discover.ui.Dialog.d;
import com.ss.android.ugc.aweme.discover.ui.a.b.a;
import com.ss.android.ugc.aweme.discover.ui.an;
import com.ss.android.ugc.aweme.discover.ui.b;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.search.k.an;
import com.ss.android.ugc.aweme.search.k.bk;
import com.ss.android.ugc.aweme.search.k.bl;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.keyword.SearchEditTextViewModel;
import com.ss.android.ugc.aweme.search.n.d;
import com.ss.android.ugc.aweme.search.survey.SurveyViewModel;
import com.ss.android.ugc.aweme.search.theme.c;
import com.ss.android.ugc.aweme.search.theme.dark.ThemeViewModel;
import com.ss.android.ugc.aweme.utils.gu;
import com.ss.android.ugc.aweme.utils.ix;
import com.zhiliaoapp.musically.R;
import h.a.am;
import h.f.b.z;
import h.v;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public class bi extends b implements ab {
    public static final int O = com.ss.android.ugc.aweme.base.utils.n.a(16.0d);
    public static final a P = new a((byte) 0);
    public SearchIntermediateViewModel A;
    public ImageView B;
    ImageView C;
    ViewGroup D;
    boolean E;
    ThemeViewModel F;
    public SurveyViewModel G;
    Integer H;
    Integer I;
    Integer J;
    boolean K;
    public boolean L;
    public boolean M;
    public String N = "";
    private ViewGroup Q;
    private ViewGroup R;
    private View S;
    private ViewGroup T;
    private View U;
    private int V = -1;
    private SearchEditTextViewModel W;
    private final h.h X = h.i.a((h.f.a.a) b.f82442a);
    private boolean Y = true;
    private SparseArray Z;
    ViewGroup y;
    ViewGroup z;

    /* access modifiers changed from: package-private */
    public final ArgbEvaluator d() {
        return (ArgbEvaluator) this.X.getValue();
    }

    @Override // org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.discover.ui.b
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(268, new org.greenrobot.eventbus.g(bi.class, "onSetOnPageChangeListener", com.ss.android.ugc.aweme.search.theme.a.e.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(269, new org.greenrobot.eventbus.g(bi.class, "onChangeBgColorEvent", com.ss.android.ugc.aweme.search.theme.a.b.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(270, new org.greenrobot.eventbus.g(bi.class, "onSearchCorrectEvent", com.ss.android.ugc.aweme.discover.e.k.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(271, new org.greenrobot.eventbus.g(bi.class, "onInnerSearchEvent", com.ss.android.ugc.aweme.discover.e.h.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(272, new org.greenrobot.eventbus.g(bi.class, "onShareSearchCompleteEvent", com.ss.android.ugc.aweme.im.service.model.j.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final int h() {
        return R.layout.ax4;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final int i() {
        return 2;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51310);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static bi a(com.ss.android.ugc.aweme.search.model.d dVar, com.ss.android.ugc.aweme.search.model.b bVar, Context context) {
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(context, "");
            Bundle bundle = new Bundle();
            bundle.putSerializable("searchParam", dVar);
            bundle.putSerializable("search_enter_param", bVar);
            bi biVar = new bi();
            biVar.setArguments(bundle);
            return biVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final boolean y() {
        return this.L;
    }

    static final class b extends h.f.b.m implements h.f.a.a<ArgbEvaluator> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f82442a = new b();

        static {
            Covode.recordClassIndex(51311);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ArgbEvaluator invoke() {
            return new ArgbEvaluator();
        }
    }

    static final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final n f82456a = new n();

        static {
            Covode.recordClassIndex(51323);
        }

        n() {
        }

        public final void run() {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.discover.e.n());
        }
    }

    private final int O() {
        if (this.E) {
            return 2131233624;
        }
        return 2131233623;
    }

    private final boolean S() {
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            h.f.b.l.b();
        }
        return bj.a(activity);
    }

    private final void T() {
        EditText editText = this.f82355b;
        if (editText != null) {
            editText.postDelayed(new p(this), 200);
        }
    }

    /* access modifiers changed from: package-private */
    public final int D() {
        if (this.E) {
            return 2131233628;
        }
        return 2131233627;
    }

    /* access modifiers changed from: package-private */
    public final int E() {
        if (this.E) {
            return R.attr.ad;
        }
        return R.attr.bj;
    }

    /* access modifiers changed from: package-private */
    public final int I() {
        if (this.E) {
            return R.color.a_;
        }
        return R.color.bx;
    }

    /* access modifiers changed from: package-private */
    public final int J() {
        if (this.E) {
            return R.color.ac;
        }
        return R.color.c5;
    }

    /* access modifiers changed from: package-private */
    public final int K() {
        if (this.E) {
            return R.drawable.bdv;
        }
        return R.drawable.bdi;
    }

    public final ISearchHistoryManager M() {
        ISearchHistoryManager inst = SearchHistoryManager.inst(r());
        h.f.b.l.b(inst, "");
        return inst;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void j() {
        if (this.t != null) {
            com.ss.android.ugc.aweme.search.model.d dVar = this.t;
            if (dVar == null) {
                h.f.b.l.b();
            }
            c(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final int l() {
        if (this.E) {
            return R.drawable.bdk;
        }
        return R.drawable.bdj;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.b, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.Z;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bi f82458a;

        static {
            Covode.recordClassIndex(51325);
        }

        p(bi biVar) {
            this.f82458a = biVar;
        }

        public final void run() {
            if (this.f82458a.ab_()) {
                EditText editText = this.f82458a.f82355b;
                if (editText != null) {
                    editText.requestFocus();
                }
                KeyboardUtils.b(this.f82458a.f82355b);
            }
        }
    }

    static {
        Covode.recordClassIndex(51309);
    }

    private final int N() {
        if (b() == null) {
            return 0;
        }
        ap b2 = b();
        if (b2 == null) {
            h.f.b.l.b();
        }
        if (b2.f82313c != null) {
            return b2.f82313c.getCurrentItem();
        }
        return 0;
    }

    private final void Q() {
        this.M = true;
        SearchIntermediateViewModel searchIntermediateViewModel = this.A;
        if (searchIntermediateViewModel != null) {
            searchIntermediateViewModel.enterSearchMiddlePageByBack = true;
        }
        t();
        this.f82355b.setText("");
        this.f82355b.requestFocus();
        this.f82355b.setSelection(0);
    }

    private final void R() {
        b(2);
        EditText editText = this.f82355b;
        h.f.b.l.b(editText, "");
        editText.setCursorVisible(false);
        a(true);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void c() {
        androidx.fragment.app.e requireActivity = requireActivity();
        h.f.b.l.b(requireActivity, "");
        if (bj.b(requireActivity) || p()) {
            super.c();
        } else {
            requireActivity.finish();
        }
        gu.a((Activity) requireActivity);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void n() {
        if (w() == 2) {
            this.L = true;
            new com.ss.android.ugc.aweme.discover.e.a("SearchResultFragment#handleBackPressed").a();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventBus a2 = EventBus.a();
        if (!a2.a(this)) {
            EventBus.a(a2, this);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventBus a2 = EventBus.a();
        if (a2.a(this)) {
            a2.b(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final String r() {
        String enterSearchFrom;
        com.ss.android.ugc.aweme.search.model.b bVar = SearchEnterViewModel.a.a(getActivity()).f82794a;
        if (bVar == null || (enterSearchFrom = bVar.getEnterSearchFrom()) == null) {
            return "";
        }
        return enterSearchFrom;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void s() {
        Window window;
        androidx.fragment.app.e activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(50);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final String z() {
        String b2 = com.ss.android.ugc.aweme.search.j.b(N());
        if (b2.length() <= 0 || b2 == null) {
            return com.ss.android.ugc.aweme.search.i.TOP.getTabName();
        }
        return b2;
    }

    private final boolean P() {
        androidx.fragment.app.e requireActivity = requireActivity();
        h.f.b.l.b(requireActivity, "");
        if (bj.b(requireActivity)) {
            androidx.fragment.app.e requireActivity2 = requireActivity();
            h.f.b.l.b(requireActivity2, "");
            if (!bj.c(requireActivity2)) {
                return true;
            }
        }
        if (h.f.b.l.a((Object) "1", SearchEnterViewModel.a.a(requireActivity()).b().obtainLogData("is_from_video"))) {
            return true;
        }
        return false;
    }

    private final void U() {
        if (this.t != null && !this.Y) {
            androidx.fragment.app.e requireActivity = requireActivity();
            h.f.b.l.b(requireActivity, "");
            if (gu.a(requireActivity)) {
                gu.b(getActivity());
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final String A() {
        String str;
        com.ss.android.ugc.aweme.search.i iVar = (com.ss.android.ugc.aweme.search.i) h.a.n.b((List) com.ss.android.ugc.aweme.search.j.f121153a, N());
        if (iVar == null || (str = iVar.getTabName()) == null) {
            str = "";
        }
        if (h.f.b.l.a((Object) str, (Object) com.ss.android.ugc.aweme.search.i.HASHTAG.getTabName())) {
            str = "challenge";
        }
        if (str.length() > 0) {
            return str;
        }
        return com.ss.android.ugc.aweme.search.i.TOP.getTabName();
    }

    /* access modifiers changed from: package-private */
    public final int L() {
        Boolean bool;
        com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> showSearchFilterDot;
        ViewGroup viewGroup = this.D;
        if (viewGroup == null || !viewGroup.isClickable()) {
            return 2131233574;
        }
        SearchIntermediateViewModel searchIntermediateViewModel = this.A;
        if (searchIntermediateViewModel == null || (showSearchFilterDot = searchIntermediateViewModel.getShowSearchFilterDot()) == null) {
            bool = null;
        } else {
            bool = showSearchFilterDot.getValue();
        }
        if (h.f.b.l.a((Object) bool, (Object) true)) {
            return 2131233576;
        }
        return O();
    }

    public final ap b() {
        try {
            Fragment a2 = getChildFragmentManager().a("Container");
            if (a2 == null || !(a2 instanceof ap) || a2.isDetached()) {
                return null;
            }
            return (ap) a2;
        } catch (Exception e2) {
            ALog.e("SearchResultFragment", e2);
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void k() {
        super.C();
        new com.ss.android.ugc.aweme.discover.e.a("SearchResultFragment#handleBackPressed").a();
        KeyboardUtils.c(this.f82355b);
        if (!a()) {
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            androidx.core.app.a.a((Activity) activity);
            if (!S()) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.discover.e.d(false));
            }
            com.ss.android.ugc.aweme.discover.adapter.b.g.a("");
            com.ss.android.ugc.aweme.search.o.a.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bi f82443a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.search.model.d f82444b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f82445c;

        static {
            Covode.recordClassIndex(51312);
        }

        c(bi biVar, com.ss.android.ugc.aweme.search.model.d dVar, z.e eVar) {
            this.f82443a = biVar;
            this.f82444b = dVar;
            this.f82445c = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            T t;
            boolean z;
            if (!TextUtils.isEmpty(this.f82444b.getKeyword())) {
                t = this.f82444b.getKeyword();
            } else {
                t = this.f82445c.element;
            }
            String searchFrom = this.f82444b.getSearchFrom();
            if (searchFrom == null || searchFrom.length() == 0) {
                z = false;
            } else {
                z = this.f82444b.getSearchFrom().equals("trending_topic");
            }
            if (!TextUtils.isEmpty(t) && !z) {
                this.f82443a.M().recordSearchHistory(new SearchHistory(t, 0));
            }
            return h.z.f158842a;
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bi f82447a;

        static {
            Covode.recordClassIndex(51314);
        }

        e(bi biVar) {
            this.f82447a = biVar;
        }

        public final void run() {
            if (this.f82447a.w() == 2) {
                new com.ss.android.ugc.aweme.discover.e.a("SearchResultFragment#handleBackPressed").a();
                com.ss.android.ugc.aweme.search.o.a.f121552c = true;
                this.f82447a.L = true;
                this.f82447a.c("click");
            }
            EditText editText = this.f82447a.f82355b;
            h.f.b.l.b(editText, "");
            editText.setCursorVisible(true);
            EditText editText2 = this.f82447a.f82355b;
            h.f.b.l.b(editText2, "");
            if (!TextUtils.isEmpty(editText2.getText().toString())) {
                this.f82447a.u();
            } else {
                this.f82447a.t();
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.discover.ui.b, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.ss.android.b.a.a.a.a(n.f82456a, 100);
        if (com.bytedance.ies.abmock.b.a().a(true, "search_filter_entrance_animated", 0) > 0 && !com.ss.android.ugc.aweme.bk.a.f68724a.f68725b.getBoolean("has_shown_filter_animated", false)) {
            long a2 = com.ss.android.ugc.aweme.bk.a.f68724a.a("first_shown_filter_animated_time");
            if (a2 != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - a2 > 604800000 || currentTimeMillis - com.ss.android.ugc.aweme.bk.a.f68724a.a("last_shown_filter_animated_time") <= 86400000) {
                    return;
                }
            }
            ImageView imageView = this.B;
            if (imageView != null) {
                imageView.postDelayed(new o(this), 1000);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064  */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t() {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.bi.t():void");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final boolean v() {
        boolean z2;
        Boolean bool;
        com.ss.android.ugc.aweme.search.model.b searchEnterParam;
        com.ss.android.ugc.aweme.search.n.a searchCommonModel;
        com.ss.android.ugc.aweme.search.model.b searchEnterParam2;
        JSONObject jSONObject = new JSONObject();
        com.ss.android.ugc.aweme.search.model.d dVar = this.t;
        if (dVar == null || (searchEnterParam2 = dVar.getSearchEnterParam()) == null) {
            z2 = true;
        } else {
            z2 = searchEnterParam2.getShouldShowSug();
        }
        jSONObject.put("should_show_sug", z2);
        com.ss.android.ugc.aweme.search.n.f b2 = d.a.b(getActivity());
        if (b2 == null || (searchCommonModel = b2.getSearchCommonModel()) == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(searchCommonModel.getShouldShowSug());
        }
        jSONObject.put("should_show_sug_x", bool);
        c.a.a("ref_search_result_fragment_enable_search_sug", jSONObject, am.c("should_show_sug"));
        com.ss.android.ugc.aweme.search.model.d dVar2 = this.t;
        if (dVar2 == null || (searchEnterParam = dVar2.getSearchEnterParam()) == null) {
            return true;
        }
        return searchEnterParam.getShouldShowSug();
    }

    static final class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bi f82457a;

        static {
            Covode.recordClassIndex(51324);
        }

        o(bi biVar) {
            this.f82457a = biVar;
        }

        public final void run() {
            if (this.f82457a.getActivity() != null) {
                androidx.fragment.app.e activity = this.f82457a.getActivity();
                if (activity == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(activity, "");
                if (!activity.isFinishing()) {
                    ImageView imageView = this.f82457a.B;
                    if (imageView == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.d(imageView, "");
                    z.e eVar = new z.e();
                    eVar.element = (T) ObjectAnimator.ofFloat(imageView, "translationY", -35.0f, 10.0f);
                    z.e eVar2 = new z.e();
                    eVar2.element = (T) ObjectAnimator.ofFloat(imageView, "translationY", 0.0f, -35.0f);
                    z.e eVar3 = new z.e();
                    eVar3.element = (T) ObjectAnimator.ofFloat(imageView, "translationY", 10.0f, 0.0f);
                    T t = eVar.element;
                    h.f.b.l.b(t, "");
                    t.setDuration(250);
                    T t2 = eVar2.element;
                    h.f.b.l.b(t2, "");
                    t2.setDuration(200);
                    T t3 = eVar3.element;
                    h.f.b.l.b(t3, "");
                    t3.setDuration(250);
                    z.a aVar = new z.a();
                    aVar.element = false;
                    Interpolator b2 = com.bytedance.tux.a.a.a.b();
                    T t4 = eVar.element;
                    h.f.b.l.b(t4, "");
                    t4.setInterpolator(b2);
                    T t5 = eVar2.element;
                    h.f.b.l.b(t5, "");
                    t5.setInterpolator(b2);
                    T t6 = eVar3.element;
                    h.f.b.l.b(t6, "");
                    t6.setInterpolator(b2);
                    eVar.element.addListener(new a.C1926a(eVar3));
                    eVar2.element.addListener(new a.b(eVar));
                    eVar3.element.addListener(new a.c(aVar, imageView, eVar2));
                    eVar2.element.start();
                    if (com.ss.android.ugc.aweme.bk.a.f68724a.a("first_shown_filter_animated_time") == 0) {
                        com.ss.android.ugc.aweme.bk.a.f68724a.a("first_shown_filter_animated_time", System.currentTimeMillis());
                    }
                    com.ss.android.ugc.aweme.bk.a.f68724a.a("last_shown_filter_animated_time", System.currentTimeMillis());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ab
    public final boolean a() {
        if (w() == 2) {
            new com.ss.android.ugc.aweme.discover.e.a("SearchResultFragment#handleBackPressed").a();
        }
        if (getActivity() == null || this.t == null) {
            return false;
        }
        x();
        int w = w();
        if (w == 2) {
            androidx.fragment.app.e requireActivity = requireActivity();
            h.f.b.l.b(requireActivity, "");
            if (gu.a(requireActivity) || !P()) {
                return false;
            }
            Q();
            if (!com.ss.android.ugc.aweme.discover.a.a.a.f80125a) {
                T();
            }
            return true;
        } else if (w != 3 || !(!TextUtils.isEmpty(this.f82355b.getText().toString().trim()))) {
            return false;
        } else {
            androidx.fragment.app.e requireActivity2 = requireActivity();
            h.f.b.l.b(requireActivity2, "");
            if (gu.a(requireActivity2)) {
                this.f82355b.setText(this.N);
                R();
                return true;
            } else if (!P()) {
                return false;
            } else {
                Q();
                T();
                return true;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void o() {
        View view;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        View view2;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        ImageView imageView;
        ImageView imageView2;
        ViewGroup viewGroup6;
        boolean z2;
        t<com.ss.android.ugc.aweme.search.theme.c> c2;
        t<com.ss.android.ugc.aweme.search.theme.c> d2;
        NextLiveData<EditText> a2;
        SearchIntermediateViewModel searchIntermediateViewModel;
        com.ss.android.ugc.aweme.arch.widgets.base.c<Word> firstGuessWord;
        com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> showSearchFilterDot;
        com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> enableSearchFilter;
        com.ss.android.ugc.aweme.arch.widgets.base.c<Integer> intermediateState;
        com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> dismissKeyboard;
        com.ss.android.ugc.aweme.search.model.b searchEnterParam;
        com.ss.android.ugc.aweme.search.n.a searchCommonModel;
        com.ss.android.ugc.aweme.search.model.b searchEnterParam2;
        super.o();
        View view3 = getView();
        Boolean bool = null;
        if (view3 != null) {
            view = view3.findViewById(16908335);
        } else {
            view = null;
        }
        this.U = view;
        View view4 = getView();
        if (view4 != null) {
            viewGroup = (ViewGroup) view4.findViewById(R.id.cio);
        } else {
            viewGroup = null;
        }
        this.Q = viewGroup;
        View view5 = getView();
        if (view5 != null) {
            viewGroup2 = (ViewGroup) view5.findViewById(R.id.dua);
        } else {
            viewGroup2 = null;
        }
        this.R = viewGroup2;
        View view6 = getView();
        if (view6 != null) {
            viewGroup3 = (ViewGroup) view6.findViewById(R.id.do8);
        } else {
            viewGroup3 = null;
        }
        this.z = viewGroup3;
        View view7 = getView();
        if (view7 != null) {
            view2 = view7.findViewById(R.id.qd);
        } else {
            view2 = null;
        }
        this.S = view2;
        View view8 = getView();
        if (view8 != null) {
            viewGroup4 = (ViewGroup) view8.findViewById(R.id.b5p);
        } else {
            viewGroup4 = null;
        }
        this.y = viewGroup4;
        View view9 = getView();
        if (view9 != null) {
            viewGroup5 = (ViewGroup) view9.findViewById(R.id.ep_);
        } else {
            viewGroup5 = null;
        }
        this.T = viewGroup5;
        View view10 = getView();
        if (view10 != null) {
            imageView = (ImageView) view10.findViewById(R.id.c0w);
        } else {
            imageView = null;
        }
        this.C = imageView;
        View view11 = getView();
        if (view11 != null) {
            imageView2 = (ImageView) view11.findViewById(R.id.c0y);
        } else {
            imageView2 = null;
        }
        this.B = imageView2;
        View view12 = getView();
        if (view12 != null) {
            viewGroup6 = (ViewGroup) view12.findViewById(R.id.dub);
        } else {
            viewGroup6 = null;
        }
        this.D = viewGroup6;
        if (viewGroup6 != null) {
            viewGroup6.setOnClickListener(new f(this));
        }
        com.bytedance.ies.dmt.ui.f.c.a(this.f82359j, 0.5f);
        JSONObject jSONObject = new JSONObject();
        com.ss.android.ugc.aweme.search.model.d dVar = this.t;
        boolean z3 = true;
        if (dVar == null || (searchEnterParam2 = dVar.getSearchEnterParam()) == null) {
            z2 = true;
        } else {
            z2 = searchEnterParam2.getShouldShowScanView();
        }
        jSONObject.put("should_show_scan_view", z2);
        com.ss.android.ugc.aweme.search.n.f b2 = d.a.b(getActivity());
        if (!(b2 == null || (searchCommonModel = b2.getSearchCommonModel()) == null)) {
            bool = Boolean.valueOf(searchCommonModel.getShouldShowScanView());
        }
        jSONObject.put("should_show_scan_view_x", bool);
        c.a.a("ref_search_result_fragment_enable_scan_view", jSONObject, am.c("should_show_scan_view"));
        com.ss.android.ugc.aweme.search.model.d dVar2 = this.t;
        if (!(dVar2 == null || (searchEnterParam = dVar2.getSearchEnterParam()) == null)) {
            z3 = searchEnterParam.getShouldShowScanView();
        }
        if (z3) {
            ImageView imageView3 = this.f82359j;
            h.f.b.l.b(imageView3, "");
            imageView3.setVisibility(0);
        } else {
            ViewGroup viewGroup7 = this.y;
            if (viewGroup7 != null) {
                ViewGroup.LayoutParams layoutParams = viewGroup7.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = (int) com.bytedance.common.utility.n.b(getContext(), 16.0f);
                }
                viewGroup7.setLayoutParams(layoutParams);
            }
            ImageView imageView4 = this.f82359j;
            h.f.b.l.b(imageView4, "");
            imageView4.setVisibility(8);
        }
        SearchIntermediateViewModel searchIntermediateViewModel2 = this.A;
        if (!(searchIntermediateViewModel2 == null || (dismissKeyboard = searchIntermediateViewModel2.getDismissKeyboard()) == null)) {
            dismissKeyboard.observe(this, new g(this));
        }
        if (ak.f80153a) {
            SearchIntermediateViewModel searchIntermediateViewModel3 = this.A;
            if (!(searchIntermediateViewModel3 == null || (intermediateState = searchIntermediateViewModel3.getIntermediateState()) == null)) {
                intermediateState.observe(this, new h(this));
            }
            SearchIntermediateViewModel searchIntermediateViewModel4 = this.A;
            if (!(searchIntermediateViewModel4 == null || (enableSearchFilter = searchIntermediateViewModel4.getEnableSearchFilter()) == null)) {
                enableSearchFilter.observe(this, new i(this));
            }
            SearchIntermediateViewModel searchIntermediateViewModel5 = this.A;
            if (!(searchIntermediateViewModel5 == null || (showSearchFilterDot = searchIntermediateViewModel5.getShowSearchFilterDot()) == null)) {
                showSearchFilterDot.observe(this, new j(this));
            }
        }
        if (!(((!com.ss.android.ugc.aweme.discover.a.k.a() || !S()) && !SearchEnterViewModel.a.a(getActivity()).a()) || (searchIntermediateViewModel = this.A) == null || (firstGuessWord = searchIntermediateViewModel.getFirstGuessWord()) == null)) {
            firstGuessWord.observe(this, new k(this));
        }
        SearchEditTextViewModel searchEditTextViewModel = this.W;
        if (!(searchEditTextViewModel == null || (a2 = searchEditTextViewModel.a()) == null)) {
            a2.setValue(this.f82355b);
        }
        ThemeViewModel themeViewModel = this.F;
        if (!(themeViewModel == null || (d2 = themeViewModel.d()) == null)) {
            d2.observe(this, new l(this));
        }
        ThemeViewModel themeViewModel2 = this.F;
        if (themeViewModel2 != null && (c2 = themeViewModel2.c()) != null) {
            c2.observe(this, new m(this));
        }
    }

    public static final class d implements DmtTabLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bi f82446a;

        static {
            Covode.recordClassIndex(51313);
        }

        @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.c
        public final void b(DmtTabLayout.f fVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(bi biVar) {
            this.f82446a = biVar;
        }

        @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.c
        public final void a(DmtTabLayout.f fVar) {
            h.f.b.l.d(fVar, "");
            EditText editText = this.f82446a.f82355b;
            h.f.b.l.b(editText, "");
            if (bi.a(editText.getHint().toString())) {
                EditText editText2 = this.f82446a.f82355b;
                h.f.b.l.b(editText2, "");
                editText2.setHint(com.ss.android.ugc.aweme.search.b.b.f120981a.a(fVar.f33752e));
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void b(View view) {
        if (this.f82355b != null) {
            this.f82355b.post(new e(this));
        }
    }

    static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bi f82449a;

        static {
            Covode.recordClassIndex(51316);
        }

        g(bi biVar) {
            this.f82449a = biVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (h.f.b.l.a(obj, (Object) true)) {
                KeyboardUtils.c(this.f82449a.f82355b);
                EditText editText = this.f82449a.f82355b;
                h.f.b.l.b(editText, "");
                editText.setCursorVisible(false);
            }
        }
    }

    static final class i<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bi f82451a;

        static {
            Covode.recordClassIndex(51318);
        }

        i(bi biVar) {
            this.f82451a = biVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (h.f.b.l.a(obj, (Object) true)) {
                this.f82451a.b(true);
            } else {
                this.f82451a.b(false);
            }
        }
    }

    @r
    public final void onInnerSearchEvent(com.ss.android.ugc.aweme.discover.e.h hVar) {
        h.f.b.l.d(hVar, "");
        SearchStateViewModel searchStateViewModel = this.n;
        if (searchStateViewModel != null) {
            searchStateViewModel.setIsRefreshingData(true);
        }
        c(hVar.f80961a);
    }

    static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bi f82450a;

        static {
            Covode.recordClassIndex(51317);
        }

        h(bi biVar) {
            this.f82450a = biVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                if (num.intValue() == 2) {
                    this.f82450a.c(false);
                } else if (num != null) {
                    if (num.intValue() == 0) {
                        this.f82450a.c(true);
                    } else if (num.intValue() == 1) {
                        this.f82450a.c(false);
                    }
                }
            }
        }
    }

    static final class j<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bi f82452a;

        static {
            Covode.recordClassIndex(51319);
        }

        j(bi biVar) {
            this.f82452a = biVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool;
            com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> enableSearchFilter;
            bi biVar = this.f82452a;
            SearchIntermediateViewModel searchIntermediateViewModel = biVar.A;
            if (searchIntermediateViewModel == null || (enableSearchFilter = searchIntermediateViewModel.getEnableSearchFilter()) == null || (bool = enableSearchFilter.getValue()) == null) {
                bool = true;
            }
            h.f.b.l.b(bool, "");
            biVar.b(bool.booleanValue());
        }
    }

    static final class k<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bi f82453a;

        static {
            Covode.recordClassIndex(51320);
        }

        k(bi biVar) {
            this.f82453a = biVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Word word = (Word) obj;
            if (!TextUtils.isEmpty(word.getWord())) {
                this.f82453a.a(new b.a(word.getWord(), word.getId(), word.getImplId()));
            }
        }
    }

    private final void f(com.ss.android.ugc.aweme.search.model.d dVar) {
        ap a2 = ap.a(dVar);
        a2.r = new d(this);
        getChildFragmentManager().a().b(R.id.b94, a2, "Container").c();
        com.ss.android.ugc.aweme.discover.j.l.b();
    }

    private final String g(com.ss.android.ugc.aweme.search.model.d dVar) {
        z.e eVar = new z.e();
        eVar.element = (T) dVar.getKeyword();
        if (!TextUtils.isEmpty(dVar.getRealSearchWord())) {
            eVar.element = (T) dVar.getRealSearchWord();
        }
        if (com.ss.android.ugc.aweme.search.s.c.a(eVar.element)) {
            return null;
        }
        b.i.b(new c(this, dVar, eVar), b.i.f4824a);
        return eVar.element;
    }

    private final void h(com.ss.android.ugc.aweme.search.model.d dVar) {
        String str;
        h.f.a.a<String> aVar;
        an anVar = (an) new an().p(dVar.getSearchFrom());
        SearchIntermediateViewModel searchIntermediateViewModel = this.A;
        if (searchIntermediateViewModel == null || (aVar = searchIntermediateViewModel.getIntermediateContainer) == null) {
            str = null;
        } else {
            str = aVar.invoke();
        }
        anVar.r(str).f();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void c(String str) {
        String str2;
        int N2 = N();
        if (N2 == com.ss.android.ugc.aweme.search.j.f121154b) {
            str2 = "general_search";
        } else if (N2 == com.ss.android.ugc.aweme.search.j.f121155c) {
            str2 = "search_user";
        } else if (N2 == com.ss.android.ugc.aweme.search.j.f121159g) {
            str2 = "search_tag";
        } else if (N2 == com.ss.android.ugc.aweme.search.j.f121157e) {
            str2 = "search_music";
        } else if (N2 == com.ss.android.ugc.aweme.search.j.f121156d) {
            str2 = "search_video";
        } else {
            return;
        }
        new com.ss.android.ugc.aweme.search.k.k().p(str).o(str2).f();
        com.ss.android.ugc.aweme.common.h.d.f76444a = System.currentTimeMillis();
    }

    @r
    public final void onSearchCorrectEvent(com.ss.android.ugc.aweme.discover.e.k kVar) {
        h.f.b.l.d(kVar, "");
        com.ss.android.ugc.aweme.search.model.d searchFrom = new com.ss.android.ugc.aweme.search.model.d().setKeyword(kVar.f80964a).setNeedCorrect(0).setSearchFrom("correct_word");
        h.f.b.l.b(searchFrom, "");
        c(searchFrom);
    }

    @r
    public final void onSetOnPageChangeListener(com.ss.android.ugc.aweme.search.theme.a.e eVar) {
        ap b2;
        h.f.b.l.d(eVar, "");
        if (this.f35364f && eVar.f121692b != null) {
            ap b3 = b();
            if (b3 != null) {
                ViewPager.e eVar2 = eVar.f121692b;
                b3.f82316j = null;
                if (b3.f82313c != null) {
                    b3.f82313c.removeOnPageChangeListener(eVar2);
                }
            }
            if (eVar.f121691a && (b2 = b()) != null) {
                b2.a(eVar.f121692b);
            }
        }
    }

    @r
    public final void onShareSearchCompleteEvent(com.ss.android.ugc.aweme.im.service.model.j jVar) {
        IIMService createIIMServicebyMonsterPlugin;
        h.f.b.l.d(jVar, "");
        if (ab_() && TextUtils.equals("search", jVar.f103916d) && (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) != null && getActivity() != null && this.Q != null) {
            createIIMServicebyMonsterPlugin.showIMSnackbar(getActivity(), this.Q, jVar);
        }
    }

    private boolean e(com.ss.android.ugc.aweme.search.model.d dVar) {
        int a2;
        SearchIntermediateViewModel searchIntermediateViewModel;
        h.f.b.l.d(dVar, "");
        if (!h.f.b.l.a((Object) dVar.getSearchFrom(), (Object) "recom_search") && !h.f.b.l.a((Object) dVar.getSearchFrom(), (Object) "trending_topic") && (a2 = com.bytedance.ies.abmock.b.a().a(true, "none_recom_locate_page", 0)) != 1) {
            if (a2 != 2) {
                return false;
            }
            if (h.f.b.l.a((Object) dVar.getSearchFrom(), (Object) "default_search_keyword") || ((searchIntermediateViewModel = this.A) != null && searchIntermediateViewModel.enterSearchMiddlePageByBack)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void a(View view) {
        h.f.b.l.d(view, "");
        super.a(view);
        this.f82354a = view.findViewById(R.id.b_u);
        this.f82357d = view.findViewById(R.id.dw1);
        this.f82358e = (TextView) view.findViewById(R.id.f6o);
        this.f82359j = (ImageView) view.findViewById(R.id.qc);
        this.f82360k = (FrameLayout) view.findViewById(R.id.b94);
        this.f82361l = (SearchIntermediateView) view.findViewById(R.id.dv4);
        this.f82361l.f82154g = R.id.dv4;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.b, com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView.c
    public final void b(com.ss.android.ugc.aweme.search.model.d dVar) {
        h.f.b.l.d(dVar, "");
        if (SearchStateViewModel.isSearchIntermediate(w()) && !TextUtils.isEmpty(dVar.getKeyword())) {
            d(dVar);
            c(dVar);
        }
    }

    public final void c(boolean z2) {
        if (z2) {
            ViewGroup viewGroup = this.D;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            TextView textView = this.f82358e;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.D;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        TextView textView2 = this.f82358e;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void d(com.ss.android.ugc.aweme.search.model.d dVar) {
        Integer num;
        NextLiveData<ai> nextLiveData;
        com.ss.android.ugc.aweme.arch.widgets.base.c<Integer> searchTabIndex;
        h.f.b.l.d(dVar, "");
        SearchIntermediateViewModel searchIntermediateViewModel = this.A;
        if (searchIntermediateViewModel == null || (searchTabIndex = searchIntermediateViewModel.getSearchTabIndex()) == null || (num = searchTabIndex.getValue()) == null) {
            num = -1;
        }
        h.f.b.l.b(num, "");
        if (!TextUtils.equals(com.ss.android.ugc.aweme.search.j.a(num.intValue()), "general") && e(dVar)) {
            com.ss.android.ugc.aweme.discover.mob.d.f81892k = 0;
            SearchTabViewModel searchTabViewModel = SearchTabJumpCenter.INSTANCE.getSearchTabViewModel();
            if (searchTabViewModel != null && (nextLiveData = searchTabViewModel.tabInfo) != null) {
                nextLiveData.setValue(new ai("general"));
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.discover.ui.b, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                h.f.b.l.b();
            }
            Serializable serializable = arguments.getSerializable("searchParam");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.model.SearchResultParam");
            this.t = (com.ss.android.ugc.aweme.search.model.d) serializable;
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            this.A = (SearchIntermediateViewModel) ae.a(activity, (ad.b) null).a(SearchIntermediateViewModel.class);
            this.W = (SearchEditTextViewModel) ae.a(activity, (ad.b) null).a(SearchEditTextViewModel.class);
            this.F = (ThemeViewModel) ae.a(activity, (ad.b) null).a(ThemeViewModel.class);
            this.G = (SurveyViewModel) ae.a(activity, (ad.b) null).a(SurveyViewModel.class);
        }
    }

    static final class m<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bi f82455a;

        static {
            Covode.recordClassIndex(51322);
        }

        m(bi biVar) {
            this.f82455a = biVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            t<Boolean> b2;
            com.ss.android.ugc.aweme.search.theme.c cVar = (com.ss.android.ugc.aweme.search.theme.c) obj;
            bi biVar = this.f82455a;
            h.f.b.l.b(cVar, "");
            biVar.E = h.f.b.l.a((Object) cVar.f121704a, (Object) "dark");
            int i2 = cVar.f121705b;
            androidx.fragment.app.e activity = biVar.getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            a.C1099a.a(activity).b(i2).b(!biVar.E).f44923a.d();
            ViewGroup viewGroup = biVar.z;
            if (viewGroup != null) {
                viewGroup.setBackgroundColor(i2);
            }
            biVar.f82359j.setImageResource(biVar.l());
            ImageView imageView = biVar.B;
            if (imageView != null) {
                imageView.setImageResource(biVar.L());
            }
            ImageView imageView2 = biVar.C;
            if (imageView2 != null) {
                imageView2.setImageResource(biVar.D());
            }
            biVar.f82356c.setTintColorRes(biVar.E());
            androidx.fragment.app.e activity2 = biVar.getActivity();
            if (activity2 == null) {
                h.f.b.l.b();
            }
            int c2 = androidx.core.content.b.c(activity2, biVar.I());
            androidx.fragment.app.e activity3 = biVar.getActivity();
            if (activity3 == null) {
                h.f.b.l.b();
            }
            int c3 = androidx.core.content.b.c(activity3, biVar.J());
            EditText editText = biVar.f82355b;
            if (editText != null) {
                editText.setTextColor(c2);
            }
            EditText editText2 = biVar.f82355b;
            if (editText2 != null) {
                editText2.setHintTextColor(c3);
            }
            ViewGroup viewGroup2 = biVar.y;
            if (viewGroup2 != null) {
                viewGroup2.setBackgroundResource(biVar.K());
            }
            ThemeViewModel themeViewModel = biVar.F;
            if (themeViewModel != null && (b2 = themeViewModel.b()) != null) {
                b2.postValue(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void a(b.a aVar) {
        String str;
        String str2;
        String str3;
        String str4;
        if (g() || p()) {
            SearchIntermediateViewModel searchIntermediateViewModel = this.A;
            if (searchIntermediateViewModel == null || !searchIntermediateViewModel.backFromSearchResult) {
                str = "search_bar_outer";
            } else {
                str = "search_bar_inner";
            }
            bk v = new bl().y(q()).d((Integer) 0).v(str);
            String str5 = "";
            if (aVar == null || (str2 = aVar.f82367a) == null) {
                str2 = str5;
            }
            bk w = v.w(str2);
            if (aVar == null || (str3 = aVar.f82368b) == null) {
                str3 = str5;
            }
            com.ss.android.ugc.aweme.search.k.c cVar = (com.ss.android.ugc.aweme.search.k.c) w.i(str3);
            if (!(aVar == null || (str4 = aVar.f82369c) == null)) {
                str5 = str4;
            }
            bk bkVar = (bk) cVar.d(str5).a((Integer) -1);
            Object obtainLogData = SearchEnterViewModel.a.a(getActivity()).b().obtainLogData("tab_name");
            if (obtainLogData != null) {
                bkVar.a(obtainLogData);
            }
            bkVar.f();
        }
        super.a(aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void b(String str) {
        String A2;
        com.ss.android.ugc.aweme.search.model.b bVar = SearchEnterViewModel.a.a(getActivity()).f82794a;
        if (bVar == null) {
            h.f.b.l.b();
        }
        if (this.M) {
            new com.ss.android.ugc.aweme.search.k.j().b(bVar.obtainLogData("is_from_video")).a(bVar.obtainLogData("tab_name")).p("cancel").o("return").f();
            this.M = false;
            return;
        }
        int w = w();
        if (w == 2) {
            A2 = A();
        } else if (w != 3) {
            A2 = r();
        } else if (this.L) {
            A2 = A();
        } else {
            A2 = r();
        }
        new com.ss.android.ugc.aweme.search.k.j().b(bVar.obtainLogData("is_from_video")).a(bVar.obtainLogData("tab_name")).p(str).o(A2).f();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void c(com.ss.android.ugc.aweme.search.model.d dVar) {
        h.f.b.l.d(dVar, "");
        this.t = dVar;
        String g2 = g(dVar);
        U();
        this.o = g2;
        if (TextUtils.isEmpty(this.o)) {
            this.f82355b.setText("");
            return;
        }
        String str = this.o;
        h.f.b.l.b(str, "");
        this.N = str;
        String keyword = dVar.getKeyword();
        b(2);
        this.f82355b.setText(keyword);
        dVar.setKeyword(this.o);
        if (b() != null) {
            ap b2 = b();
            if (b2 == null) {
                h.f.b.l.b();
            }
            b2.b(dVar);
            com.ss.android.ugc.aweme.search.model.d dVar2 = this.t;
            if (dVar2 != null && dVar2.isOpenNewSearchContainer()) {
                ap b3 = b();
                if (b3 == null) {
                    h.f.b.l.b();
                }
                b3.a(0);
            }
        } else {
            f(dVar);
        }
        R();
        TuxIconView tuxIconView = this.f82356c;
        h.f.b.l.b(tuxIconView, "");
        tuxIconView.setVisibility(0);
        KeyboardUtils.c(this.f82355b);
        UgAllServiceImpl.c().a("search", dVar.getKeyword());
        h(dVar);
        h.f.b.l.d("search_transfer_search", "");
        q.a();
        this.Y = false;
        com.ss.android.ugc.aweme.search.model.b bVar = SearchEnterViewModel.a.a(getActivity()).f82794a;
        if (bVar != null) {
            bVar.restEnterSearchPosition();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void d(String str) {
        SearchStateViewModel searchStateViewModel = this.n;
        boolean z2 = true;
        if (searchStateViewModel != null) {
            searchStateViewModel.setIsRefreshingData(true);
        }
        EditText editText = this.f82355b;
        h.f.b.l.b(editText, "");
        String obj = editText.getHint().toString();
        if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(obj) || a(obj)) {
            z2 = false;
        } else {
            ((com.ss.android.ugc.aweme.search.k.o) new com.ss.android.ugc.aweme.search.k.o().q("click").o("default_search_keyword")).r(str).s("general_word").f();
            str = obj;
        }
        a(str, z2);
    }

    @r
    public final void onChangeBgColorEvent(com.ss.android.ugc.aweme.search.theme.a.b bVar) {
        h.f.b.l.d(bVar, "");
        if (this.f35364f) {
            Window window = null;
            if (!bVar.f121669b) {
                ViewGroup viewGroup = this.T;
                if (viewGroup != null) {
                    viewGroup.setBackground(null);
                }
                View view = this.f82354a;
                if (view != null) {
                    view.setBackground(null);
                }
                ViewGroup viewGroup2 = this.R;
                if (viewGroup2 != null) {
                    viewGroup2.setBackground(null);
                }
                ViewGroup viewGroup3 = this.Q;
                if (viewGroup3 != null) {
                    viewGroup3.setBackground(bVar.f121668a);
                }
                androidx.fragment.app.e activity = getActivity();
                if (activity != null) {
                    window = activity.getWindow();
                }
                com.ss.android.ugc.aweme.discover.m.g.a(window, 0);
                return;
            }
            Context context = getContext();
            if (context != null) {
                if (this.V == -1) {
                    this.V = androidx.core.content.b.c(context, R.color.f159928l);
                }
                ViewGroup viewGroup4 = this.T;
                if (viewGroup4 != null) {
                    viewGroup4.setBackgroundColor(this.V);
                }
                View view2 = this.f82354a;
                if (view2 != null) {
                    view2.setBackgroundColor(this.V);
                }
                ViewGroup viewGroup5 = this.R;
                if (viewGroup5 != null) {
                    viewGroup5.setBackgroundColor(this.V);
                }
                ViewGroup viewGroup6 = this.Q;
                if (viewGroup6 != null) {
                    viewGroup6.setBackground(null);
                }
                androidx.fragment.app.e activity2 = getActivity();
                if (activity2 != null) {
                    window = activity2.getWindow();
                }
                com.ss.android.ugc.aweme.discover.m.g.a(window, this.V);
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bi f82448a;

        static {
            Covode.recordClassIndex(51315);
        }

        f(bi biVar) {
            this.f82448a = biVar;
        }

        public final void onClick(View view) {
            am amVar;
            com.ss.android.ugc.aweme.search.k.ad adVar;
            String str;
            String str2;
            String str3;
            NextLiveData<Boolean> nextLiveData;
            an e2;
            Boolean bool;
            com.ss.android.ugc.aweme.discover.ui.a.b.a.a aVar;
            List<? extends Object> list;
            int i2;
            String str4;
            int i3;
            String str5;
            String str6;
            String str7;
            com.ss.android.ugc.aweme.search.k.ad b2;
            com.ss.android.ugc.aweme.search.k.ad b3;
            String schema;
            boolean z;
            com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> enableSearchFilter;
            ClickAgent.onClick(view);
            ap b4 = this.f82448a.b();
            String str8 = null;
            if (b4 != null) {
                amVar = b4.d();
            } else {
                amVar = null;
            }
            int i4 = 0;
            if (!(amVar == null || (e2 = amVar.e()) == null)) {
                androidx.fragment.app.e activity = this.f82448a.getActivity();
                SearchIntermediateViewModel searchIntermediateViewModel = this.f82448a.A;
                com.ss.android.ugc.aweme.search.model.d dVar = this.f82448a.t;
                h.f.b.l.d(amVar, "");
                com.ss.android.ugc.aweme.discover.ui.a.b c2 = e2.c();
                if (searchIntermediateViewModel == null || (enableSearchFilter = searchIntermediateViewModel.getEnableSearchFilter()) == null) {
                    bool = null;
                } else {
                    bool = enableSearchFilter.getValue();
                }
                if (!h.f.b.l.a((Object) bool, (Object) false)) {
                    aVar = com.ss.android.ugc.aweme.discover.ui.a.b.a.b.f82221b.a(com.ss.android.ugc.aweme.search.j.a(amVar.B));
                } else {
                    aVar = null;
                }
                com.ss.android.ugc.aweme.bk.a.f68724a.f68725b.storeBoolean("has_shown_filter_animated", true);
                d.b bVar = e2.f82298e;
                if (bVar != null) {
                    bVar.f82122d = new an.d(e2, activity, aVar, c2);
                    if (c2 != null) {
                        z = c2.f82209k;
                    } else {
                        z = false;
                    }
                    bVar.f82120b = com.ss.android.ugc.aweme.discover.helper.c.a(activity, aVar, z);
                    bVar.f82128j = com.ss.android.ugc.aweme.discover.helper.c.a(aVar);
                } else {
                    bVar = null;
                }
                if (c2 != null) {
                    c2.a().f82192a = aVar;
                    com.ss.android.ugc.aweme.discover.ui.a.a.a.a a2 = c2.a();
                    d.a a3 = com.ss.android.ugc.aweme.discover.k.d.a(com.ss.android.ugc.aweme.search.j.a(amVar.B));
                    if (a3 == null || (schema = a3.getSchema()) == null || schema.length() == 0) {
                        list = null;
                    } else {
                        list = h.a.n.c(new SearchUserFeedback(schema));
                    }
                    a2.f82193b = list;
                    if (activity != null) {
                        i2 = activity.hashCode();
                    } else {
                        i2 = 0;
                    }
                    com.ss.android.ugc.aweme.search.k.q a4 = com.ss.android.ugc.aweme.search.k.am.a(i2);
                    if (a4 == null || (b3 = a4.b(amVar.B)) == null || (str4 = b3.f121172a) == null) {
                        str4 = "";
                    }
                    c.a.a("ref_search_bottom_dialog_show", str4);
                    h.p[] pVarArr = new h.p[4];
                    if (activity != null) {
                        i3 = activity.hashCode();
                    } else {
                        i3 = 0;
                    }
                    com.ss.android.ugc.aweme.search.k.q a5 = com.ss.android.ugc.aweme.search.k.am.a(i3);
                    if (a5 == null || (b2 = a5.b(amVar.B)) == null || (str5 = b2.f121172a) == null) {
                        str5 = "";
                    }
                    pVarArr[0] = v.a("search_id", str5);
                    pVarArr[1] = v.a("search_type", ag.a(com.ss.android.ugc.aweme.search.j.a(amVar.B)));
                    if (dVar == null || (str6 = dVar.getKeyword()) == null) {
                        str6 = "";
                    }
                    pVarArr[2] = v.a("search_keyword", str6);
                    if (amVar.B == com.ss.android.ugc.aweme.search.j.f121154b) {
                        str7 = "general_search";
                    } else {
                        str7 = "search_result";
                    }
                    pVarArr[3] = v.a("enter_from", str7);
                    c2.f82206d = h.a.ag.b(pVarArr);
                }
                com.ss.android.ugc.aweme.discover.ui.Dialog.d a6 = d.a.a(R.id.bcd, activity, c2, bVar);
                if (c2 != null) {
                    c2.f82204b = a6;
                }
            }
            SurveyViewModel surveyViewModel = this.f82448a.G;
            if (!(surveyViewModel == null || (nextLiveData = surveyViewModel.f121648c) == null)) {
                nextLiveData.postValue(true);
            }
            h.f.b.l.d("open_filter", "");
            com.ss.android.ugc.aweme.search.k.q a7 = com.ss.android.ugc.aweme.search.k.am.a();
            if (a7 != null) {
                adVar = a7.c();
            } else {
                adVar = null;
            }
            com.ss.android.ugc.aweme.search.k.f fVar = new com.ss.android.ugc.aweme.search.k.f();
            com.ss.android.ugc.aweme.search.k.q a8 = com.ss.android.ugc.aweme.search.k.am.a();
            if (a8 != null) {
                i4 = a8.a();
            }
            com.ss.android.ugc.aweme.search.k.c f2 = fVar.f(com.ss.android.ugc.aweme.search.j.a(i4));
            if (adVar != null) {
                str = adVar.f121173b;
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.search.k.c b5 = f2.b(str);
            if (adVar != null) {
                str2 = adVar.f121172a;
            } else {
                str2 = null;
            }
            com.ss.android.ugc.aweme.metrics.c a9 = ((com.ss.android.ugc.aweme.search.k.f) b5.a(str2)).r("by_all").a("button_type", "open_filter");
            com.ss.android.ugc.aweme.search.n.h b6 = d.a.b();
            if (b6 != null) {
                str3 = b6.getSearchKeyword();
            } else {
                str3 = null;
            }
            com.ss.android.ugc.aweme.metrics.c a10 = a9.a("search_keyword_x", str3);
            com.ss.android.ugc.aweme.search.n.h b7 = d.a.b();
            if (b7 != null) {
                str8 = b7.getSearchId();
            }
            a10.a("search_id_x", str8).f();
        }
    }

    static final class l<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bi f82454a;

        static {
            Covode.recordClassIndex(51321);
        }

        l(bi biVar) {
            this.f82454a = biVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            boolean z;
            com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> showSearchFilterDot;
            Float f2;
            ImageView imageView;
            com.ss.android.ugc.aweme.search.theme.c cVar = (com.ss.android.ugc.aweme.search.theme.c) obj;
            bi biVar = this.f82454a;
            h.f.b.l.b(cVar, "");
            c.a aVar = cVar.f121707d;
            if (aVar != null) {
                biVar.E = h.f.b.l.a((Object) cVar.f121704a, (Object) "dark");
                int i2 = aVar.f121709a;
                if (i2 == 1) {
                    ViewGroup viewGroup = biVar.z;
                    Boolean bool = null;
                    if (viewGroup != null) {
                        num = ix.a(viewGroup);
                    } else {
                        num = null;
                    }
                    biVar.H = num;
                    EditText editText = biVar.f82355b;
                    if (editText != null) {
                        num2 = Integer.valueOf(editText.getCurrentTextColor());
                    } else {
                        num2 = null;
                    }
                    biVar.I = num2;
                    EditText editText2 = biVar.f82355b;
                    if (editText2 != null) {
                        num3 = Integer.valueOf(editText2.getCurrentHintTextColor());
                    } else {
                        num3 = null;
                    }
                    biVar.J = num3;
                    ViewGroup viewGroup2 = biVar.D;
                    if (viewGroup2 == null || !viewGroup2.isClickable()) {
                        z = false;
                    } else {
                        SearchIntermediateViewModel searchIntermediateViewModel = biVar.A;
                        if (!(searchIntermediateViewModel == null || (showSearchFilterDot = searchIntermediateViewModel.getShowSearchFilterDot()) == null)) {
                            bool = showSearchFilterDot.getValue();
                        }
                        z = !h.f.b.l.a((Object) bool, (Object) true);
                    }
                    biVar.K = z;
                } else if (i2 == 2 && (f2 = aVar.f121710b) != null) {
                    float floatValue = f2.floatValue();
                    Integer num4 = biVar.H;
                    if (num4 != null) {
                        int intValue = num4.intValue();
                        Integer num5 = biVar.I;
                        if (num5 != null) {
                            int intValue2 = num5.intValue();
                            Integer num6 = biVar.J;
                            if (num6 != null) {
                                int intValue3 = num6.intValue();
                                Object evaluate = biVar.d().evaluate(floatValue, Integer.valueOf(intValue), Integer.valueOf(cVar.f121705b));
                                Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.Int");
                                int intValue4 = ((Integer) evaluate).intValue();
                                androidx.fragment.app.e activity = biVar.getActivity();
                                if (activity == null) {
                                    h.f.b.l.b();
                                }
                                h.f.b.l.b(activity, "");
                                a.C1099a.a(activity).b(intValue4).b(true ^ biVar.E).f44923a.d();
                                ViewGroup viewGroup3 = biVar.z;
                                if (viewGroup3 != null) {
                                    viewGroup3.setBackgroundColor(intValue4);
                                }
                                androidx.fragment.app.e activity2 = biVar.getActivity();
                                if (activity2 == null) {
                                    h.f.b.l.b();
                                }
                                int c2 = androidx.core.content.b.c(activity2, biVar.I());
                                androidx.fragment.app.e activity3 = biVar.getActivity();
                                if (activity3 == null) {
                                    h.f.b.l.b();
                                }
                                int c3 = androidx.core.content.b.c(activity3, biVar.J());
                                Object evaluate2 = biVar.d().evaluate(floatValue, Integer.valueOf(intValue2), Integer.valueOf(c2));
                                Objects.requireNonNull(evaluate2, "null cannot be cast to non-null type kotlin.Int");
                                int intValue5 = ((Integer) evaluate2).intValue();
                                Object evaluate3 = biVar.d().evaluate(floatValue, Integer.valueOf(intValue3), Integer.valueOf(c3));
                                Objects.requireNonNull(evaluate3, "null cannot be cast to non-null type kotlin.Int");
                                int intValue6 = ((Integer) evaluate3).intValue();
                                EditText editText3 = biVar.f82355b;
                                if (editText3 != null) {
                                    editText3.setTextColor(intValue5);
                                }
                                EditText editText4 = biVar.f82355b;
                                if (editText4 != null) {
                                    editText4.setHintTextColor(intValue6);
                                }
                                if (floatValue >= 0.0f && floatValue <= 0.49f) {
                                    float f3 = 1.0f - (floatValue * 2.0f);
                                    ImageView imageView2 = biVar.f82359j;
                                    if (imageView2 != null) {
                                        imageView2.setAlpha(f3);
                                    }
                                    ImageView imageView3 = biVar.C;
                                    if (imageView3 != null) {
                                        imageView3.setAlpha(f3);
                                    }
                                    TuxIconView tuxIconView = biVar.f82356c;
                                    if (tuxIconView != null) {
                                        tuxIconView.setAlpha(f3);
                                    }
                                    ViewGroup viewGroup4 = biVar.y;
                                    if (viewGroup4 != null) {
                                        viewGroup4.setAlpha(f3);
                                    }
                                    if (biVar.K && (imageView = biVar.B) != null) {
                                        imageView.setAlpha(f3);
                                    }
                                } else if (floatValue >= 0.5f && floatValue <= 1.0f) {
                                    float f4 = (floatValue * 2.0f) - 1.0f;
                                    ImageView imageView4 = biVar.f82359j;
                                    if (imageView4 != null) {
                                        imageView4.setImageResource(biVar.l());
                                    }
                                    ImageView imageView5 = biVar.f82359j;
                                    if (imageView5 != null) {
                                        imageView5.setAlpha(f4);
                                    }
                                    ImageView imageView6 = biVar.C;
                                    if (imageView6 != null) {
                                        imageView6.setImageResource(biVar.D());
                                    }
                                    ImageView imageView7 = biVar.C;
                                    if (imageView7 != null) {
                                        imageView7.setAlpha(f4);
                                    }
                                    biVar.f82356c.setTintColorRes(biVar.E());
                                    TuxIconView tuxIconView2 = biVar.f82356c;
                                    if (tuxIconView2 != null) {
                                        tuxIconView2.setAlpha(f4);
                                    }
                                    ViewGroup viewGroup5 = biVar.y;
                                    if (viewGroup5 != null) {
                                        viewGroup5.setBackgroundResource(biVar.K());
                                    }
                                    ViewGroup viewGroup6 = biVar.y;
                                    if (viewGroup6 != null) {
                                        viewGroup6.setAlpha(f4);
                                    }
                                    if (biVar.K) {
                                        ImageView imageView8 = biVar.B;
                                        if (imageView8 != null) {
                                            imageView8.setImageResource(biVar.L());
                                        }
                                        ImageView imageView9 = biVar.B;
                                        if (imageView9 != null) {
                                            imageView9.setAlpha(f4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void b(boolean z2) {
        d.a a2;
        String schema;
        com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> showSearchFilterDot;
        Boolean bool = null;
        if (z2) {
            ViewGroup viewGroup = this.D;
            if (viewGroup != null) {
                viewGroup.setClickable(true);
            }
            SearchIntermediateViewModel searchIntermediateViewModel = this.A;
            if (!(searchIntermediateViewModel == null || (showSearchFilterDot = searchIntermediateViewModel.getShowSearchFilterDot()) == null)) {
                bool = showSearchFilterDot.getValue();
            }
            if (h.f.b.l.a((Object) bool, (Object) true)) {
                ImageView imageView = this.B;
                if (imageView != null) {
                    imageView.setImageResource(2131233576);
                    return;
                }
                return;
            }
            ImageView imageView2 = this.B;
            if (imageView2 != null) {
                imageView2.setImageResource(O());
                return;
            }
            return;
        }
        ap b2 = b();
        if (b2 == null || (a2 = com.ss.android.ugc.aweme.discover.k.d.a(com.ss.android.ugc.aweme.search.j.a(b2.f82317k))) == null || (schema = a2.getSchema()) == null || schema.length() == 0) {
            ViewGroup viewGroup2 = this.D;
            if (viewGroup2 != null) {
                viewGroup2.setClickable(false);
            }
            ImageView imageView3 = this.B;
            if (imageView3 != null) {
                imageView3.setImageResource(2131233574);
            }
            d.a.a(getActivity());
            return;
        }
        ViewGroup viewGroup3 = this.D;
        if (viewGroup3 != null) {
            viewGroup3.setClickable(true);
        }
        ImageView imageView4 = this.B;
        if (imageView4 != null) {
            imageView4.setImageResource(O());
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.b, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            Fade fade = new Fade();
            af afVar = new af();
            afVar.addTarget(R.id.djs);
            transitionSet.addTransition(afVar);
            transitionSet.addTransition(fade);
            androidx.fragment.app.e activity = getActivity();
            if (!(activity == null || (window = activity.getWindow()) == null)) {
                window.setEnterTransition(transitionSet);
            }
            com.ss.android.ugc.aweme.framework.a.a.b("SearchResultFragment", "initWindowTransition");
        }
        Context context = view.getContext();
        h.f.b.l.b(context, "");
        h.f.b.l.d(context, "");
    }
}

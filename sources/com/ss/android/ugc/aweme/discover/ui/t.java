package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.ss.android.ugc.aweme.discover.helper.ai;
import com.ss.android.ugc.aweme.discover.lynx.container.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class t extends com.ss.android.ugc.aweme.base.f.a implements i, j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f82760c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public e f82761a;

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f82762b;

    /* renamed from: d  reason: collision with root package name */
    private String f82763d;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f82764e;

    static {
        Covode.recordClassIndex(51548);
    }

    private View a(int i2) {
        if (this.f82764e == null) {
            this.f82764e = new SparseArray();
        }
        View view = (View) this.f82764e.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f82764e.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(301, new g(t.class, "hideLoading", com.ss.android.ugc.aweme.discover.e.g.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51549);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f82764e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f82766a;

        static {
            Covode.recordClassIndex(51551);
        }

        c(t tVar) {
            this.f82766a = tVar;
        }

        public final void run() {
            e eVar = this.f82766a.f82761a;
            if (eVar == null) {
                l.a("dynamicViewsContainer");
            }
            RecyclerView.ViewHolder a2 = eVar.getRecyclerView().a(0, false);
            if (a2 != null && (a2 instanceof com.ss.android.ugc.aweme.discover.lynx.e.a)) {
                View view = a2.itemView;
                l.b(view, "");
                view.getLayoutParams().height = -1;
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f82765a;

        static {
            Covode.recordClassIndex(51550);
        }

        b(t tVar) {
            this.f82765a = tVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            androidx.fragment.app.e activity = this.f82765a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("keyword")) == null) {
            str = "";
        }
        this.f82763d = str;
    }

    @r(a = ThreadMode.MAIN)
    public final void hideLoading(com.ss.android.ugc.aweme.discover.e.g gVar) {
        l.d(gVar, "");
        if (l.a((Object) gVar.f80960a, (Object) "singer-detail")) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a(R.id.dk6);
            if (ab_() && swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
            ((DmtStatusView) a(R.id.e_c)).d();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        MethodCollector.i(3102);
        l.d(view, "");
        super.onViewCreated(view, bundle);
        com.bytedance.ies.dmt.ui.titlebar.a aVar = (com.bytedance.ies.dmt.ui.titlebar.a) a(R.id.elv);
        l.b(aVar, "");
        DmtTextView titleView = aVar.getTitleView();
        l.b(titleView, "");
        Context context = getContext();
        if (context == null) {
            l.b();
        }
        Object[] objArr = new Object[1];
        String str = this.f82763d;
        if (str == null) {
            l.a("musicAuthor");
        }
        objArr[0] = str;
        String string = context.getString(R.string.dc9, objArr);
        l.b(string, "");
        String a2 = com.a.a(string, Arrays.copyOf(new Object[0], 0));
        l.b(a2, "");
        titleView.setText(a2);
        NormalTitleBar normalTitleBar = (NormalTitleBar) a(R.id.elv);
        l.b(normalTitleBar, "");
        normalTitleBar.getStartBtn().setOnClickListener(new b(this));
        ((com.bytedance.ies.dmt.ui.titlebar.a) a(R.id.elv)).a(true);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a(R.id.dk6);
        l.b(swipeRefreshLayout, "");
        swipeRefreshLayout.setEnabled(false);
        ((DmtStatusView) a(R.id.e_c)).setBuilder(DmtStatusView.a.a(getContext()));
        NestedScrollingRecyclerView nestedScrollingRecyclerView = (NestedScrollingRecyclerView) a(R.id.djj);
        l.b(nestedScrollingRecyclerView, "");
        if (nestedScrollingRecyclerView.getChildCount() > 0) {
            SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) a(R.id.dk6);
            l.b(swipeRefreshLayout2, "");
            swipeRefreshLayout2.setRefreshing(true);
        } else {
            ((DmtStatusView) a(R.id.e_c)).f();
        }
        ViewGroup viewGroup = this.f82762b;
        if (viewGroup == null) {
            l.a("dynamicFragment");
        }
        viewGroup.setVisibility(0);
        Context context2 = getContext();
        if (context2 == null) {
            l.b();
        }
        l.b(context2, "");
        e eVar = new e(context2);
        this.f82761a = eVar;
        ViewParent parent = eVar.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) parent;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
        }
        ViewGroup viewGroup3 = this.f82762b;
        if (viewGroup3 == null) {
            l.a("dynamicFragment");
        }
        e eVar2 = this.f82761a;
        if (eVar2 == null) {
            l.a("dynamicViewsContainer");
        }
        viewGroup3.addView(eVar2, new ViewGroup.LayoutParams(-1, -1));
        e eVar3 = this.f82761a;
        if (eVar3 == null) {
            l.a("dynamicViewsContainer");
        }
        String str2 = this.f82763d;
        if (str2 == null) {
            l.a("musicAuthor");
        }
        eVar3.a(ai.a(str2));
        e eVar4 = this.f82761a;
        if (eVar4 == null) {
            l.a("dynamicViewsContainer");
        }
        RecyclerView recyclerView = eVar4.getRecyclerView();
        getContext();
        recyclerView.setLayoutManager(new DynamicMusicianMusicListFragment$loadDynamicViews$1(this));
        e eVar5 = this.f82761a;
        if (eVar5 == null) {
            l.a("dynamicViewsContainer");
        }
        eVar5.post(new c(this));
        MethodCollector.o(3102);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.av0, viewGroup, false);
        View findViewById = a2.findViewById(R.id.ard);
        l.b(findViewById, "");
        this.f82762b = (ViewGroup) findViewById;
        return a2;
    }
}

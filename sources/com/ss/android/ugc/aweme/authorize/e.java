package com.ss.android.ugc.aweme.authorize;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.sdk.a.b.b.a;
import com.bytedance.sdk.a.c.a.c;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.ss.android.ugc.aweme.openauthorize.h;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class e extends Fragment implements h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f67174b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public g f67175a;

    /* renamed from: c  reason: collision with root package name */
    private c.a f67176c;

    /* renamed from: d  reason: collision with root package name */
    private AuthCommonViewModel f67177d;

    /* renamed from: e  reason: collision with root package name */
    private AwemeAuthorizePlatformDepend f67178e;

    /* renamed from: f  reason: collision with root package name */
    private a.AbstractC1045a f67179f;

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f67180g;

    static {
        Covode.recordClassIndex(41381);
    }

    public final View a(int i2) {
        if (this.f67180g == null) {
            this.f67180g = new SparseArray();
        }
        View view = (View) this.f67180g.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f67180g.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41382);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f67180g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f67181a;

        static {
            Covode.recordClassIndex(41383);
        }

        b(e eVar) {
            this.f67181a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((DmtStatusView) this.f67181a.a(R.id.e_c)).h();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f67182a;

        static {
            Covode.recordClassIndex(41384);
        }

        c(e eVar) {
            this.f67182a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            e eVar = this.f67182a;
            if (eVar.getParentFragment() instanceof b) {
                Fragment parentFragment = eVar.getParentFragment();
                Objects.requireNonNull(parentFragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment");
                ((b) parentFragment).b();
            }
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f67183a;

        static {
            Covode.recordClassIndex(41385);
        }

        d(e eVar) {
            this.f67183a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            g gVar = this.f67183a.f67175a;
            if (gVar == null) {
                l.a("nameListAdapter");
            }
            l.b(list, "");
            l.d(list, "");
            gVar.f67200a.clear();
            gVar.f67200a.addAll(list);
            gVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f67176c = new c.a(getArguments());
        this.f67178e = new AwemeAuthorizePlatformDepend(this);
        Context context = getContext();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.f67178e;
        if (awemeAuthorizePlatformDepend == null) {
            l.a("depend");
        }
        this.f67179f = new com.bytedance.sdk.a.b.c.a.b(context, awemeAuthorizePlatformDepend);
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend2 = this.f67178e;
        if (awemeAuthorizePlatformDepend2 == null) {
            l.a("depend");
        }
        a.AbstractC1045a aVar = this.f67179f;
        if (aVar == null) {
            l.a("model");
        }
        c.a aVar2 = this.f67176c;
        if (aVar2 == null) {
            l.a("request");
        }
        com.ss.android.ugc.aweme.authorize.viewmodel.a aVar3 = new com.ss.android.ugc.aweme.authorize.viewmodel.a(awemeAuthorizePlatformDepend2, aVar, aVar2);
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            l.b();
        }
        ac a2 = ae.a(activity, aVar3).a(AuthCommonViewModel.class);
        l.b(a2, "");
        this.f67177d = (AuthCommonViewModel) a2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ((DmtStatusView) a(R.id.e_c)).setBuilder(DmtStatusView.a.a(getContext()).a().a(R.string.h2z, R.string.h2y, R.string.h35, new b(this)));
        this.f67175a = new g();
        RecyclerView recyclerView = (RecyclerView) a(R.id.cb6);
        l.b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.cb6);
        l.b(recyclerView2, "");
        g gVar = this.f67175a;
        if (gVar == null) {
            l.a("nameListAdapter");
        }
        recyclerView2.setAdapter(gVar);
        ((AutoRTLImageView) a(R.id.q_)).setOnClickListener(new c(this));
        AuthCommonViewModel authCommonViewModel = this.f67177d;
        if (authCommonViewModel == null) {
            l.a("viewModel");
        }
        authCommonViewModel.f67211c.observe(this, new d(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.i(9774);
        l.d(layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.a0x, (ViewGroup) null);
        MethodCollector.o(9774);
        return inflate;
    }
}

package com.ss.android.ugc.aweme.journey.step.interestselector;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.experiment.gz;
import com.ss.android.ugc.aweme.journey.JourneyApi;
import com.ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.ss.android.ugc.aweme.journey.ai;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.journey.r;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.journey.w;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import f.a.e.e.e.ay;
import f.a.e.e.e.bf;
import f.a.e.e.e.v;
import f.a.t;
import h.a.z;
import h.f.b.l;
import h.f.b.z;
import h.m;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;

public final class f extends com.ss.android.ugc.aweme.base.f.a {

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedHashSet<String> f105086c = new LinkedHashSet<>();

    /* renamed from: d  reason: collision with root package name */
    public static int f105087d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static LinearLayoutManager f105088e;

    /* renamed from: j  reason: collision with root package name */
    public static int f105089j;

    /* renamed from: k  reason: collision with root package name */
    public static Map<Integer, Integer> f105090k = new LinkedHashMap();

    /* renamed from: l  reason: collision with root package name */
    public static final a f105091l = new a((byte) 0);
    private SparseArray A;

    /* renamed from: a  reason: collision with root package name */
    public boolean f105092a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f105093b;

    /* renamed from: m  reason: collision with root package name */
    private boolean f105094m = true;
    private r n;
    private List<ai> o = z.INSTANCE;
    private long p = SystemClock.elapsedRealtime();
    private long q = SystemClock.elapsedRealtime();
    private long r;
    private TextView s;
    private TextView t;
    private TextView u;
    private TextView v;
    private TextView w;
    private RecyclerView y;
    private final h.h z = h.i.a(m.NONE, i.f105107a);

    private final String b() {
        return (String) this.z.getValue();
    }

    public final View a(int i2) {
        if (this.A == null) {
            this.A = new SparseArray();
        }
        View view = (View) this.A.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.A.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67386);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f105097a;

        static {
            Covode.recordClassIndex(67388);
        }

        c(f fVar) {
            this.f105097a = fVar;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
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
            this.f105097a.f105092a = true;
            com.ss.android.ugc.aweme.interest.e a2 = this.f105097a.a();
            JourneyApi.a.a(com.ss.android.ugc.aweme.journey.h.f104859a, a2.f104769a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(AnonymousClass1.f105098a, AnonymousClass2.f105099a);
            this.f105097a.a("done", a2.f104770b, a2.f104771c);
            if (p.a.a().c() == 2) {
                if (this.f105097a.getActivity() != null) {
                    androidx.fragment.app.e activity = this.f105097a.getActivity();
                    Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.NewUserJourneyActivity");
                    ((NewUserJourneyActivity) activity).e();
                }
                TextView textView = this.f105097a.f105093b;
                if (textView == null) {
                    l.a("finalNext");
                }
                textView.setText("");
                com.ss.android.ugc.aweme.base.utils.m.a(AnonymousClass3.f105100a, 1500);
                return;
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.journey.step.g.b(false));
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f105107a = new i();

        static {
            Covode.recordClassIndex(67397);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return p.a.a().g();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.A;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.p = elapsedRealtime;
        this.q = elapsedRealtime;
    }

    static {
        Covode.recordClassIndex(67385);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onStop() {
        this.r += SystemClock.elapsedRealtime() - this.p;
        if (!this.f105092a) {
            com.ss.android.ugc.aweme.interest.e a2 = a();
            a("background", a2.f104770b, a2.f104771c);
        }
        super.onStop();
    }

    public final com.ss.android.ugc.aweme.interest.e a() {
        RecyclerView recyclerView = this.y;
        if (recyclerView == null) {
            l.a("infoListView");
        }
        RecyclerView.a adapter = recyclerView.getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.interestselector.TopicInterestAdapter");
        h.p<List<w>, JSONArray> a2 = com.ss.android.ugc.aweme.interest.a.a((g) adapter);
        String b2 = p.a.a().b(a2.getFirst(), (int) (((SystemClock.elapsedRealtime() - this.p) + this.r) / 1000));
        String jSONArray = a2.getSecond().toString();
        l.b(jSONArray, "");
        return new com.ss.android.ugc.aweme.interest.e(b2, jSONArray, a2.getSecond().length());
    }

    public static final class h extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        public int f105105a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f105106b;

        static {
            Covode.recordClassIndex(67396);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(f fVar) {
            this.f105106b = fVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            int i3;
            l.d(recyclerView, "");
            super.a(recyclerView, i2);
            int i4 = f.f105089j;
            LinearLayoutManager linearLayoutManager = f.f105088e;
            if (linearLayoutManager == null) {
                l.a("outerLayoutManager");
            }
            f.f105089j = Math.max(i4, linearLayoutManager.m() - 1);
            Map<Integer, Integer> map = f.f105090k;
            Integer valueOf = Integer.valueOf(f.f105089j);
            Integer num = f.f105090k.get(Integer.valueOf(f.f105089j));
            if (num != null) {
                i3 = num.intValue();
            } else {
                i3 = 0;
            }
            map.put(valueOf, Integer.valueOf(Math.max(i3, 4)));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            this.f105105a += i3;
            if (this.f105106b.ab_()) {
                TextTitleBar textTitleBar = (TextTitleBar) this.f105106b.a(R.id.em8);
                l.b(textTitleBar, "");
                if (textTitleBar.getHeight() > 0) {
                    TextTitleBar textTitleBar2 = (TextTitleBar) this.f105106b.a(R.id.em8);
                    l.b(textTitleBar2, "");
                    TextTitleBar textTitleBar3 = (TextTitleBar) this.f105106b.a(R.id.em8);
                    l.b(textTitleBar3, "");
                    textTitleBar2.setAlpha((((float) this.f105105a) * 1.0f) / ((float) textTitleBar3.getHeight()));
                }
            }
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f105095a;

        /* renamed from: b  reason: collision with root package name */
        public final ITpcConsentService f105096b;

        static {
            Covode.recordClassIndex(67387);
        }

        public b(ITpcConsentService iTpcConsentService) {
            l.d(iTpcConsentService, "");
            this.f105096b = iTpcConsentService;
            this.f105095a = iTpcConsentService.a((com.ss.android.ugc.aweme.compliance.api.services.consent.a) null);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<Integer, h.z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(67393);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Integer num) {
            int intValue = num.intValue();
            if (intValue == 1) {
                this.this$0.a(true);
            } else if (intValue == 0) {
                this.this$0.a(false);
            }
            return h.z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.f$f  reason: collision with other inner class name */
    static final class C2684f<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final C2684f f105102a = new C2684f();

        static {
            Covode.recordClassIndex(67394);
        }

        C2684f() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
            l.d(iTpcConsentService, "");
            return t.b(new b(iTpcConsentService));
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f105101a;

        static {
            Covode.recordClassIndex(67392);
        }

        d(f fVar) {
            this.f105101a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f105101a.f105092a = true;
            com.ss.android.ugc.aweme.interest.e a2 = this.f105101a.a();
            this.f105101a.a("skip", a2.f104770b, a2.f104771c);
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.journey.step.g.b(true));
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f105103a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f105104b;

        static {
            Covode.recordClassIndex(67395);
        }

        g(f fVar, z.e eVar) {
            this.f105103a = fVar;
            this.f105104b = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            b bVar = (b) obj;
            if (bVar.f105095a && this.f105103a.getActivity() != null) {
                ITpcConsentService iTpcConsentService = bVar.f105096b;
                androidx.fragment.app.e activity = this.f105103a.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                iTpcConsentService.a(activity, "interest_selection");
            }
            T t = this.f105104b.element;
            if (t != null) {
                t.dispose();
            }
        }
    }

    public final void a(boolean z2) {
        String str;
        TextView textView = this.f105093b;
        if (textView == null) {
            l.a("finalNext");
        }
        textView.setEnabled(z2);
        if (z2) {
            TextView textView2 = this.f105093b;
            if (textView2 == null) {
                l.a("finalNext");
            }
            TextView textView3 = this.f105093b;
            if (textView3 == null) {
                l.a("finalNext");
            }
            textView2.setTextColor(androidx.core.content.b.c(textView3.getContext(), R.color.a9));
        } else {
            TextView textView4 = this.f105093b;
            if (textView4 == null) {
                l.a("finalNext");
            }
            TextView textView5 = this.f105093b;
            if (textView5 == null) {
                l.a("finalNext");
            }
            textView4.setTextColor(androidx.core.content.b.c(textView5.getContext(), R.color.bz));
        }
        r rVar = this.n;
        if (rVar != null) {
            str = rVar.f104908c;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView6 = this.f105093b;
            if (textView6 == null) {
                l.a("finalNext");
            }
            r rVar2 = this.n;
            if (rVar2 == null) {
                l.b();
            }
            textView6.setText(rVar2.f104908c);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        t a2;
        String str;
        String str2 = "";
        l.d(view, str2);
        super.onViewCreated(view, bundle);
        ComponentDependencies componentDependencies = (ComponentDependencies) ae.a(requireActivity(), (ad.b) null).a(ComponentDependencies.class);
        this.f105094m = componentDependencies.k();
        Context requireContext = requireContext();
        l.b(requireContext, str2);
        this.n = componentDependencies.a(requireContext);
        androidx.fragment.app.e requireActivity = requireActivity();
        l.b(requireActivity, str2);
        l.d(requireActivity, str2);
        List<ai> value = componentDependencies.f104913c.getValue();
        if (value == null) {
            value = h.a(requireActivity);
        }
        this.o = value;
        TuxTextView tuxTextView = (TuxTextView) a(R.id.ep8);
        l.b(tuxTextView, str2);
        this.s = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.w8);
        l.b(tuxTextView2, str2);
        this.t = tuxTextView2;
        TuxTextView tuxTextView3 = (TuxTextView) a(R.id.dni);
        l.b(tuxTextView3, str2);
        this.u = tuxTextView3;
        TuxTextView tuxTextView4 = (TuxTextView) a(R.id.a3q);
        l.b(tuxTextView4, str2);
        this.v = tuxTextView4;
        RecyclerView recyclerView = (RecyclerView) a(R.id.dr2);
        l.b(recyclerView, str2);
        this.y = recyclerView;
        if (recyclerView == null) {
            l.a("infoListView");
        }
        recyclerView.setItemAnimator(null);
        int size = this.o.size();
        for (int i2 = 0; i2 < size; i2++) {
            f105090k.put(Integer.valueOf(i2), -1);
        }
        TextView textView = this.u;
        if (textView == null) {
            l.a("rightNext");
        }
        this.f105093b = textView;
        TextView textView2 = this.t;
        if (textView2 == null) {
            l.a("bottomSkip");
        }
        this.w = textView2;
        if (gz.b()) {
            TextView textView3 = this.t;
            if (textView3 == null) {
                l.a("bottomSkip");
            }
            textView3.setVisibility(8);
            TextView textView4 = this.u;
            if (textView4 == null) {
                l.a("rightNext");
            }
            textView4.setVisibility(8);
            TextView textView5 = this.v;
            if (textView5 == null) {
                l.a("centerNext");
            }
            textView5.setVisibility(0);
            TextView textView6 = this.s;
            if (textView6 == null) {
                l.a("topSkip");
            }
            textView6.setVisibility(0);
            TextView textView7 = this.s;
            if (textView7 == null) {
                l.a("topSkip");
            }
            this.w = textView7;
            TextView textView8 = this.v;
            if (textView8 == null) {
                l.a("centerNext");
            }
            this.f105093b = textView8;
        }
        z.e eVar = new z.e();
        eVar.element = null;
        t d2 = ab.a(com.ss.android.ugc.aweme.compliance.api.a.r()).b(f.a.h.a.b(f.a.k.a.f158006c)).d();
        C2684f fVar = C2684f.f105102a;
        int i3 = f.a.h.f157961a;
        f.a.e.b.b.a((Object) fVar, "mapper is null");
        f.a.e.b.b.a(i3, "bufferSize");
        if (d2 instanceof f.a.e.c.g) {
            Object call = ((f.a.e.c.g) d2).call();
            if (call == null) {
                a2 = f.a.h.a.a(v.f157740a);
            } else {
                a2 = ay.a(call, fVar);
            }
        } else {
            a2 = f.a.h.a.a(new bf(d2, fVar, i3));
        }
        eVar.element = (T) a2.a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new g(this, eVar));
        Keva.getRepo("new_user_journey").storeLong("last_show_interest_select_time", System.currentTimeMillis());
        RecyclerView recyclerView2 = this.y;
        if (recyclerView2 == null) {
            l.a("infoListView");
        }
        RecyclerView recyclerView3 = this.y;
        if (recyclerView3 == null) {
            l.a("infoListView");
        }
        recyclerView3.getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        e eVar2 = new e(this);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        RecyclerView recyclerView4 = this.y;
        if (recyclerView4 == null) {
            l.a("infoListView");
        }
        recyclerView4.setLayoutManager(linearLayoutManager);
        f105088e = linearLayoutManager;
        RecyclerView recyclerView5 = this.y;
        if (recyclerView5 == null) {
            l.a("infoListView");
        }
        Resources system = Resources.getSystem();
        l.a((Object) system, str2);
        recyclerView5.a(new i(h.g.a.a(TypedValue.applyDimension(1, 38.0f, system.getDisplayMetrics()))));
        RecyclerView recyclerView6 = this.y;
        if (recyclerView6 == null) {
            l.a("infoListView");
        }
        recyclerView6.setItemViewCacheSize(this.o.size());
        g gVar = new g(this.o, eVar2, this.n, linearLayoutManager);
        RecyclerView recyclerView7 = this.y;
        if (recyclerView7 == null) {
            l.a("infoListView");
        }
        recyclerView7.setAdapter(gVar);
        com.ss.android.ugc.aweme.common.r.a("show_interest_selection", com.ss.android.ugc.aweme.interest.a.a("new_user_journey", this.f105094m).a("user_type", b()).a("page_show_cost", SystemClock.elapsedRealtime() - this.q).a("selection_type", "topic").f66730a);
        if (gz.a()) {
            com.bytedance.ies.dmt.ui.titlebar.a aVar = (com.bytedance.ies.dmt.ui.titlebar.a) a(R.id.em8);
            r rVar = this.n;
            if (!(rVar == null || (str = rVar.f104909d) == null)) {
                str2 = str;
            }
            aVar.setTitle(str2);
        }
        TextView textView9 = this.f105093b;
        if (textView9 == null) {
            l.a("finalNext");
        }
        textView9.setOnClickListener(new c(this));
        TextView textView10 = this.w;
        if (textView10 == null) {
            l.a("finalSkip");
        }
        textView10.setOnClickListener(new d(this));
        a(false);
        RecyclerView recyclerView8 = this.y;
        if (recyclerView8 == null) {
            l.a("infoListView");
        }
        recyclerView8.a(new h(this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.abi, viewGroup, false);
    }

    public final void a(String str, String str2, int i2) {
        g gVar;
        if (ab_()) {
            RecyclerView recyclerView = this.y;
            if (recyclerView == null) {
                l.a("infoListView");
            }
            if (recyclerView.getAdapter() != null) {
                RecyclerView recyclerView2 = this.y;
                if (recyclerView2 == null) {
                    l.a("infoListView");
                }
                RecyclerView.a adapter = recyclerView2.getAdapter();
                Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.interestselector.TopicInterestAdapter");
                gVar = (g) adapter;
                com.ss.android.ugc.aweme.common.r.a("exit_interest_selection", com.ss.android.ugc.aweme.interest.a.a("new_user_journey", str, str2, SystemClock.elapsedRealtime() - this.q, gVar).a("user_type", b()).a("select_interest_cnt", i2).a("icon_fully_loaded", f105087d).f66730a);
            }
        }
        gVar = null;
        com.ss.android.ugc.aweme.common.r.a("exit_interest_selection", com.ss.android.ugc.aweme.interest.a.a("new_user_journey", str, str2, SystemClock.elapsedRealtime() - this.q, gVar).a("user_type", b()).a("select_interest_cnt", i2).a("icon_fully_loaded", f105087d).f66730a);
    }
}

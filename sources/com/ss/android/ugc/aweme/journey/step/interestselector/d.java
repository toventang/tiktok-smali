package com.ss.android.ugc.aweme.journey.step.interestselector;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.journey.JourneyApi;
import com.ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.journey.r;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.journey.w;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import f.a.t;
import h.a.z;
import h.f.b.z;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;

public final class d extends com.ss.android.ugc.aweme.base.f.a {

    /* renamed from: j  reason: collision with root package name */
    public static int f105052j = 1;

    /* renamed from: k  reason: collision with root package name */
    public static final a f105053k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f105054a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f105055b;

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView f105056c;

    /* renamed from: d  reason: collision with root package name */
    public View f105057d;

    /* renamed from: e  reason: collision with root package name */
    public f.a.b.b f105058e;

    /* renamed from: l  reason: collision with root package name */
    private boolean f105059l = true;

    /* renamed from: m  reason: collision with root package name */
    private r f105060m;
    private List<w> n = z.INSTANCE;
    private long o = SystemClock.elapsedRealtime();
    private long p = SystemClock.elapsedRealtime();
    private long q;
    private final h.h r = h.i.a(h.m.NONE, n.f105082a);
    private SparseArray s;

    private final String e() {
        return (String) this.r.getValue();
    }

    public final View a(int i2) {
        if (this.s == null) {
            this.s = new SparseArray();
        }
        View view = (View) this.s.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.s.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67364);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f105069a;

        static {
            Covode.recordClassIndex(67368);
        }

        e(d dVar) {
            this.f105069a = dVar;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            MethodCollector.i(5512);
            ClickAgent.onClick(view);
            h.f.b.l.b(view, "");
            view.getContext();
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107229h = a();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                new com.ss.android.ugc.aweme.tux.a.i.a(view.getContext()).a(R.string.de8).a();
                MethodCollector.o(5512);
                return;
            }
            this.f105069a.f105054a = true;
            com.ss.android.ugc.aweme.interest.e d2 = this.f105069a.d();
            JourneyApi.a.a(com.ss.android.ugc.aweme.journey.h.f104859a, d2.f104769a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(AnonymousClass1.f105070a).a(AnonymousClass2.f105071a, AnonymousClass3.f105072a);
            this.f105069a.a("done", d2.f104770b, d2.f104771c);
            if (p.a.a().c() == 2) {
                if (this.f105069a.getActivity() != null) {
                    androidx.fragment.app.e activity = this.f105069a.getActivity();
                    if (activity != null) {
                        ((NewUserJourneyActivity) activity).e();
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.NewUserJourneyActivity");
                        MethodCollector.o(5512);
                        throw nullPointerException;
                    }
                }
                this.f105069a.c().setVisibility(0);
                this.f105069a.a().setText("");
                this.f105069a.c().startAnimation(AnimationUtils.loadAnimation(this.f105069a.a().getContext(), R.anim.c8));
                com.ss.android.ugc.aweme.base.utils.m.a(AnonymousClass4.f105073a, 1500);
                MethodCollector.o(5512);
                return;
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.journey.step.g.b(false));
            MethodCollector.o(5512);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f105082a = new n();

        static {
            Covode.recordClassIndex(67381);
        }

        n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return p.a.a().g();
        }
    }

    public final TextView a() {
        TextView textView = this.f105055b;
        if (textView == null) {
            h.f.b.l.a("doneView");
        }
        return textView;
    }

    public final RecyclerView b() {
        RecyclerView recyclerView = this.f105056c;
        if (recyclerView == null) {
            h.f.b.l.a("infoListView");
        }
        return recyclerView;
    }

    public final View c() {
        View view = this.f105057d;
        if (view == null) {
            h.f.b.l.a("loadingView");
        }
        return view;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.d$d  reason: collision with other inner class name */
    static final class RunnableC2683d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f105067a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f105068b;

        static {
            Covode.recordClassIndex(67367);
        }

        RunnableC2683d(d dVar, h.f.a.a aVar) {
            this.f105067a = dVar;
            this.f105068b = aVar;
        }

        public final void run() {
            if (this.f105067a.ab_() && this.f105067a.b().getAdapter() != null) {
                this.f105068b.invoke();
            }
        }
    }

    static {
        Covode.recordClassIndex(67363);
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onDestroyView() {
        View view = this.f105057d;
        if (view == null) {
            h.f.b.l.a("loadingView");
        }
        view.clearAnimation();
        super.onDestroyView();
        SparseArray sparseArray = this.s;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f105058e = t.a(t.b(com.ss.android.ugc.aweme.compliance.api.a.r()), com.bytedance.ies.ugc.appcontext.f.e(), i.f105075a).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new j(this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f105058e = t.b(com.ss.android.ugc.aweme.compliance.api.a.r()).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new k(this));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.o = elapsedRealtime;
        this.p = elapsedRealtime;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onStop() {
        this.q += SystemClock.elapsedRealtime() - this.o;
        if (!this.f105054a) {
            com.ss.android.ugc.aweme.interest.e d2 = d();
            a("background", d2.f104770b, d2.f104771c);
        }
        super.onStop();
    }

    public final com.ss.android.ugc.aweme.interest.e d() {
        RecyclerView recyclerView = this.f105056c;
        if (recyclerView == null) {
            h.f.b.l.a("infoListView");
        }
        RecyclerView.a adapter = recyclerView.getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.interestselector.InterestAdapter");
        h.p<List<w>, JSONArray> a2 = com.ss.android.ugc.aweme.interest.a.a((a) adapter, true);
        String a3 = p.a.a().a(a2.getFirst(), (int) (((SystemClock.elapsedRealtime() - this.o) + this.q) / 1000));
        String jSONArray = a2.getSecond().toString();
        h.f.b.l.b(jSONArray, "");
        return new com.ss.android.ugc.aweme.interest.e(a3, jSONArray, a2.getSecond().length());
    }

    static final class g extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ z.c $verticalScrollRange;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(67374);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(d dVar, z.c cVar) {
            super(0);
            this.this$0 = dVar;
            this.$verticalScrollRange = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            z.c cVar = this.$verticalScrollRange;
            RecyclerView b2 = this.this$0.b();
            RecyclerView.a adapter = this.this$0.b().getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.interestselector.InterestAdapter");
            a aVar = (a) adapter;
            RecyclerView.i layoutManager = this.this$0.b().getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager");
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) layoutManager;
            h.f.b.l.d(b2, "");
            h.f.b.l.d(aVar, "");
            h.f.b.l.d(flexboxLayoutManager, "");
            int D = flexboxLayoutManager.D();
            View g2 = flexboxLayoutManager.g(D);
            View g3 = flexboxLayoutManager.g(0);
            int i2 = -1;
            if (g2 != null && g3 != null && D > 0 && (b2.a(g3) instanceof com.ss.android.ugc.aweme.journey.e)) {
                i2 = (int) ((((((float) aVar.a()) * 1.0f) / ((float) D)) * ((float) (g2.getBottom() - g3.getBottom()))) + ((float) g3.getHeight()));
            }
            cVar.element = i2;
            if (this.$verticalScrollRange.element > this.this$0.b().getHeight()) {
                View a2 = this.this$0.a(R.id.dta);
                h.f.b.l.b(a2, "");
                ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
                TextTitleBar textTitleBar = (TextTitleBar) this.this$0.a(R.id.em8);
                h.f.b.l.b(textTitleBar, "");
                layoutParams.height = ((int) ((((float) this.this$0.b().getHeight()) * (((float) this.this$0.b().getHeight()) + 0.0f)) / ((float) this.$verticalScrollRange.element))) - textTitleBar.getHeight();
                View a3 = this.this$0.a(R.id.dta);
                h.f.b.l.b(a3, "");
                View a4 = this.this$0.a(R.id.dta);
                h.f.b.l.b(a4, "");
                a3.setLayoutParams(a4.getLayoutParams());
                View a5 = this.this$0.a(R.id.dta);
                h.f.b.l.b(a5, "");
                a5.setVisibility(0);
            }
            return h.z.f158842a;
        }
    }

    public static final class m extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        public int f105080a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f105081b;

        static {
            Covode.recordClassIndex(67380);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(d dVar) {
            this.f105081b = dVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            this.f105080a += i3;
            if (this.f105081b.ab_()) {
                TextTitleBar textTitleBar = (TextTitleBar) this.f105081b.a(R.id.em8);
                h.f.b.l.b(textTitleBar, "");
                if (textTitleBar.getHeight() > 0) {
                    TextTitleBar textTitleBar2 = (TextTitleBar) this.f105081b.a(R.id.em8);
                    h.f.b.l.b(textTitleBar2, "");
                    TextTitleBar textTitleBar3 = (TextTitleBar) this.f105081b.a(R.id.em8);
                    h.f.b.l.b(textTitleBar3, "");
                    textTitleBar2.setAlpha((((float) this.f105080a) * 1.0f) / ((float) textTitleBar3.getHeight()));
                }
            }
        }
    }

    static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f105077a;

        static {
            Covode.recordClassIndex(67378);
        }

        k(d dVar) {
            this.f105077a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ((ITpcConsentService) obj).i();
            f.a.b.b bVar = this.f105077a.f105058e;
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<Integer, h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(67375);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(d dVar) {
            super(1);
            this.this$0 = dVar;
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

    static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f105076a;

        static {
            Covode.recordClassIndex(67377);
        }

        j(d dVar) {
            this.f105076a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            b bVar = (b) obj;
            if (bVar.f105061a && com.bytedance.ies.ugc.appcontext.f.f34637l) {
                bVar.f105062b.h();
            }
            f.a.b.b bVar2 = this.f105076a.f105058e;
            if (bVar2 != null) {
                bVar2.dispose();
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f105074a;

        static {
            Covode.recordClassIndex(67373);
        }

        f(d dVar) {
            this.f105074a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f105074a.f105054a = true;
            com.ss.android.ugc.aweme.interest.e d2 = this.f105074a.d();
            this.f105074a.a("skip", d2.f104770b, d2.f104771c);
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.journey.step.g.b(true));
        }
    }

    static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f105078a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f105079b;

        static {
            Covode.recordClassIndex(67379);
        }

        l(d dVar, z.e eVar) {
            this.f105078a = dVar;
            this.f105079b = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
            if (iTpcConsentService.a((com.ss.android.ugc.aweme.compliance.api.services.consent.a) null) && this.f105078a.getActivity() != null) {
                androidx.fragment.app.e activity = this.f105078a.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                iTpcConsentService.a(activity, "interest_selection");
            }
            T t = this.f105079b.element;
            if (t != null) {
                t.dispose();
            }
        }
    }

    public final void a(boolean z) {
        String str;
        TextView textView = this.f105055b;
        if (textView == null) {
            h.f.b.l.a("doneView");
        }
        textView.setEnabled(z);
        if (z) {
            TextView textView2 = this.f105055b;
            if (textView2 == null) {
                h.f.b.l.a("doneView");
            }
            TextView textView3 = this.f105055b;
            if (textView3 == null) {
                h.f.b.l.a("doneView");
            }
            textView2.setTextColor(androidx.core.content.b.c(textView3.getContext(), R.color.a9));
        } else {
            TextView textView4 = this.f105055b;
            if (textView4 == null) {
                h.f.b.l.a("doneView");
            }
            TextView textView5 = this.f105055b;
            if (textView5 == null) {
                h.f.b.l.a("doneView");
            }
            textView4.setTextColor(androidx.core.content.b.c(textView5.getContext(), R.color.bz));
        }
        r rVar = this.f105060m;
        if (rVar != null) {
            str = rVar.f104908c;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView6 = this.f105055b;
            if (textView6 == null) {
                h.f.b.l.a("doneView");
            }
            r rVar2 = this.f105060m;
            if (rVar2 == null) {
                h.f.b.l.b();
            }
            textView6.setText(rVar2.f104908c);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f105061a;

        /* renamed from: b  reason: collision with root package name */
        public final ITpcConsentService f105062b;

        /* renamed from: c  reason: collision with root package name */
        public final WeakReference<Activity> f105063c;

        static {
            Covode.recordClassIndex(67365);
        }

        public b(ITpcConsentService iTpcConsentService, WeakReference<Activity> weakReference) {
            h.f.b.l.d(iTpcConsentService, "");
            h.f.b.l.d(weakReference, "");
            this.f105062b = iTpcConsentService;
            this.f105063c = weakReference;
            this.f105061a = iTpcConsentService.a((com.ss.android.ugc.aweme.compliance.api.services.consent.a) null);
        }
    }

    static final class i<T1, T2, R> implements f.a.d.c {

        /* renamed from: a  reason: collision with root package name */
        public static final i f105075a = new i();

        static {
            Covode.recordClassIndex(67376);
        }

        i() {
        }

        @Override // f.a.d.c
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
            h.f.b.l.d(iTpcConsentService, "");
            h.f.b.l.d(obj2, "");
            return new b(iTpcConsentService, new WeakReference(obj2));
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2 = "";
        h.f.b.l.d(view, str2);
        super.onViewCreated(view, bundle);
        ComponentDependencies componentDependencies = (ComponentDependencies) ae.a(requireActivity(), (ad.b) null).a(ComponentDependencies.class);
        this.f105059l = componentDependencies.k();
        Context requireContext = requireContext();
        h.f.b.l.b(requireContext, str2);
        this.f105060m = componentDependencies.a(requireContext);
        Context requireContext2 = requireContext();
        h.f.b.l.b(requireContext2, str2);
        h.f.b.l.d(requireContext2, str2);
        List<w> value = componentDependencies.f104912b.getValue();
        if (value == null) {
            value = b.a(requireContext2);
        }
        this.n = value;
        TuxTextView tuxTextView = (TuxTextView) a(R.id.aoh);
        h.f.b.l.b(tuxTextView, str2);
        this.f105055b = tuxTextView;
        RecyclerView recyclerView = (RecyclerView) a(R.id.dr2);
        h.f.b.l.b(recyclerView, str2);
        this.f105056c = recyclerView;
        ImageView imageView = (ImageView) a(R.id.ci1);
        h.f.b.l.b(imageView, str2);
        this.f105057d = imageView;
        RecyclerView recyclerView2 = this.f105056c;
        if (recyclerView2 == null) {
            h.f.b.l.a("infoListView");
        }
        recyclerView2.setItemAnimator(null);
        TextView textView = this.f105055b;
        if (textView == null) {
            h.f.b.l.a("doneView");
        }
        com.bytedance.ies.dmt.ui.f.c.a(textView, 0.75f);
        com.bytedance.ies.dmt.ui.f.c.a(a(R.id.e4z), 0.75f);
        z.e eVar = new z.e();
        eVar.element = null;
        eVar.element = (T) ab.a(com.ss.android.ugc.aweme.compliance.api.a.r()).b(f.a.h.a.b(f.a.k.a.f158006c)).d().a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new l(this, eVar));
        z.c cVar = new z.c();
        cVar.element = -1;
        z.c cVar2 = new z.c();
        cVar2.element = 0;
        Keva.getRepo("new_user_journey").storeLong("last_show_interest_select_time", System.currentTimeMillis());
        RecyclerView recyclerView3 = this.f105056c;
        if (recyclerView3 == null) {
            h.f.b.l.a("infoListView");
        }
        recyclerView3.a(new c(this, cVar2, cVar));
        g gVar = new g(this, cVar);
        RecyclerView recyclerView4 = this.f105056c;
        if (recyclerView4 == null) {
            h.f.b.l.a("infoListView");
        }
        recyclerView4.post(new RunnableC2683d(this, gVar));
        RecyclerView recyclerView5 = this.f105056c;
        if (recyclerView5 == null) {
            h.f.b.l.a("infoListView");
        }
        RecyclerView recyclerView6 = this.f105056c;
        if (recyclerView6 == null) {
            h.f.b.l.a("infoListView");
        }
        recyclerView5.setLayoutManager(new FlexboxLayoutManager(recyclerView6.getContext()));
        a aVar = new a(this.n, false, new h(this), this.f105060m);
        RecyclerView recyclerView7 = this.f105056c;
        if (recyclerView7 == null) {
            h.f.b.l.a("infoListView");
        }
        recyclerView7.setAdapter(aVar);
        com.ss.android.ugc.aweme.common.r.a("show_interest_selection", com.ss.android.ugc.aweme.interest.a.a("new_user_journey", this.f105059l).a("user_type", e()).a("page_show_cost", SystemClock.elapsedRealtime() - this.p).a("selection_type", "category").f66730a);
        com.bytedance.ies.dmt.ui.titlebar.a aVar2 = (com.bytedance.ies.dmt.ui.titlebar.a) a(R.id.em8);
        r rVar = this.f105060m;
        if (!(rVar == null || (str = rVar.f104909d) == null)) {
            str2 = str;
        }
        aVar2.setTitle(str2);
        TextView textView2 = this.f105055b;
        if (textView2 == null) {
            h.f.b.l.a("doneView");
        }
        textView2.setOnClickListener(new e(this));
        ((TuxTextView) a(R.id.e4z)).setOnClickListener(new f(this));
        a(false);
        RecyclerView recyclerView8 = this.f105056c;
        if (recyclerView8 == null) {
            h.f.b.l.a("infoListView");
        }
        recyclerView8.a(new m(this));
    }

    public static final class c extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f105064a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f105065b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.c f105066c;

        static {
            Covode.recordClassIndex(67366);
        }

        c(d dVar, z.c cVar, z.c cVar2) {
            this.f105064a = dVar;
            this.f105065b = cVar;
            this.f105066c = cVar2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            this.f105065b.element += i3;
            if (i3 != 0 && this.f105064a.ab_() && this.f105066c.element != -1) {
                int height = this.f105066c.element - this.f105064a.b().getHeight();
                int height2 = this.f105064a.b().getHeight();
                View a2 = this.f105064a.a(R.id.dta);
                h.f.b.l.b(a2, "");
                int height3 = height2 - a2.getHeight();
                View a3 = this.f105064a.a(R.id.dta);
                h.f.b.l.b(a3, "");
                float f2 = ((((float) this.f105065b.element) * 1.0f) / ((float) height)) * ((float) height3);
                TextTitleBar textTitleBar = (TextTitleBar) this.f105064a.a(R.id.em8);
                h.f.b.l.b(textTitleBar, "");
                a3.setY(f2 + ((float) textTitleBar.getHeight()));
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.abh, viewGroup, false);
    }

    public final void a(String str, String str2, int i2) {
        int i3;
        FlexboxLayoutManager flexboxLayoutManager;
        if (!com.ss.android.ugc.aweme.journey.a.b.a()) {
            i3 = -1;
        } else {
            i3 = f105052j;
        }
        a aVar = null;
        if (ab_()) {
            RecyclerView recyclerView = this.f105056c;
            if (recyclerView == null) {
                h.f.b.l.a("infoListView");
            }
            if (recyclerView.getAdapter() != null) {
                RecyclerView recyclerView2 = this.f105056c;
                if (recyclerView2 == null) {
                    h.f.b.l.a("infoListView");
                }
                RecyclerView.a adapter = recyclerView2.getAdapter();
                Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.interestselector.InterestAdapter");
                aVar = (a) adapter;
                RecyclerView recyclerView3 = this.f105056c;
                if (recyclerView3 == null) {
                    h.f.b.l.a("infoListView");
                }
                RecyclerView.i layoutManager = recyclerView3.getLayoutManager();
                Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager");
                flexboxLayoutManager = (FlexboxLayoutManager) layoutManager;
                com.ss.android.ugc.aweme.common.r.a("exit_interest_selection", com.ss.android.ugc.aweme.interest.a.a("new_user_journey", str, str2, SystemClock.elapsedRealtime() - this.p, aVar, flexboxLayoutManager).a("user_type", e()).a("select_interest_cnt", i2).a("icon_fully_loaded", i3).f66730a);
            }
        }
        flexboxLayoutManager = null;
        com.ss.android.ugc.aweme.common.r.a("exit_interest_selection", com.ss.android.ugc.aweme.interest.a.a("new_user_journey", str, str2, SystemClock.elapsedRealtime() - this.p, aVar, flexboxLayoutManager).a("user_type", e()).a("select_interest_cnt", i2).a("icon_fully_loaded", i3).f66730a);
    }
}

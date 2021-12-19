package com.ss.android.ugc.aweme.discover.ui.Dialog;

import android.animation.ArgbEvaluator;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.e.a;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.ae;
import com.ss.android.ugc.aweme.search.theme.dark.ThemeViewModel;
import com.ss.android.ugc.aweme.utils.hh;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Objects;

public final class d extends com.ss.android.ugc.aweme.base.f.a implements ae {
    public static final String r = "com.ss.android.ugc.aweme.discover.ui.SearchDialogFragment";
    public static final a s = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public SearchNestedLayout f82110a;

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f82111b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f82112c;

    /* renamed from: d  reason: collision with root package name */
    public ViewGroup f82113d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f82114e;

    /* renamed from: j  reason: collision with root package name */
    public AppCompatTextView f82115j;

    /* renamed from: k  reason: collision with root package name */
    public View f82116k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f82117l;

    /* renamed from: m  reason: collision with root package name */
    public NestedScrollingChildFrameLayout f82118m;
    public Fragment n;
    public b o;
    public boolean p;
    public h.f.a.b<? super Boolean, z> q = new f(this);
    private final h.h t = h.i.a((h.f.a.a) c.f82129a);
    private final h.h u = h.i.a((h.f.a.a) new C1921d(this));
    private final h.h v = h.i.a((h.f.a.a) new k(this));
    private SparseArray w;

    private final ArgbEvaluator d() {
        return (ArgbEvaluator) this.t.getValue();
    }

    private final int e() {
        return ((Number) this.u.getValue()).intValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51099);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(androidx.fragment.app.e eVar) {
            d dVar;
            if (eVar != null && !eVar.isFinishing() && (dVar = (d) eVar.getSupportFragmentManager().a(d.r)) != null) {
                dVar.b();
            }
        }

        public static d b(androidx.fragment.app.e eVar) {
            l.d(eVar, "");
            return (d) eVar.getSupportFragmentManager().a(d.r);
        }

        public static d a(int i2, androidx.fragment.app.e eVar, Fragment fragment, b bVar) {
            if (!(eVar == null || fragment == null || eVar.isFinishing())) {
                try {
                    androidx.fragment.app.i supportFragmentManager = eVar.getSupportFragmentManager();
                    d dVar = (d) supportFragmentManager.a(d.r);
                    if (dVar == null) {
                        d dVar2 = new d();
                        dVar2.o = bVar;
                        dVar2.n = fragment;
                        supportFragmentManager.a().a(i2, dVar2, d.r).c();
                        return dVar2;
                    }
                    dVar.o = bVar;
                    dVar.n = fragment;
                    dVar.c();
                    supportFragmentManager.a().c(dVar).b();
                    dVar.a();
                    return dVar;
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.framework.a.a.a("", e2);
                }
            }
            return null;
        }
    }

    static final class c extends m implements h.f.a.a<ArgbEvaluator> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f82129a = new c();

        static {
            Covode.recordClassIndex(51101);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ArgbEvaluator invoke() {
            return new ArgbEvaluator();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        g();
    }

    public final void b() {
        SearchNestedLayout searchNestedLayout = this.f82110a;
        if (searchNestedLayout != null) {
            searchNestedLayout.a(false, true);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.w;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.d$d  reason: collision with other inner class name */
    static final class C1921d extends m implements h.f.a.a<Integer> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(51102);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1921d(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            int i2;
            Resources resources;
            androidx.fragment.app.e activity = this.this$0.getActivity();
            if (activity == null || (resources = activity.getResources()) == null) {
                i2 = 0;
            } else {
                i2 = resources.getColor(R.color.bk);
            }
            return Integer.valueOf(i2);
        }
    }

    static final class k extends m implements h.f.a.a<Integer> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(51109);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            int i2;
            Resources resources;
            androidx.fragment.app.e activity = this.this$0.getActivity();
            if (activity == null || (resources = activity.getResources()) == null) {
                i2 = 0;
            } else {
                i2 = resources.getColor(R.color.c9);
            }
            return Integer.valueOf(i2);
        }
    }

    static {
        Covode.recordClassIndex(51098);
    }

    private void g() {
        View view = getView();
        if (view != null) {
            view.setFocusableInTouchMode(true);
        }
        View view2 = getView();
        if (view2 != null) {
            view2.requestFocus();
        }
        View view3 = getView();
        if (view3 != null) {
            view3.setOnKeyListener(new e(this));
        }
    }

    public final void a() {
        SearchNestedLayout searchNestedLayout = this.f82110a;
        if (searchNestedLayout != null) {
            searchNestedLayout.setMOnShowHeightChangeListener(this);
            SearchNestedLayout searchNestedLayout2 = this.f82110a;
            if (searchNestedLayout2 != null) {
                searchNestedLayout2.setOnDialogListener(new j(this));
            }
            SearchNestedLayout searchNestedLayout3 = this.f82110a;
            if (searchNestedLayout3 != null) {
                searchNestedLayout3.a(true, true);
            }
        }
        Fragment fragment = this.n;
        if (fragment != null) {
            fragment.onHiddenChanged(false);
        }
    }

    public final void c() {
        String str;
        String str2;
        AppCompatTextView appCompatTextView;
        String str3;
        TextView textView;
        String str4;
        int i2;
        Fragment fragment = this.n;
        if (fragment instanceof a) {
            NestedScrollingChildFrameLayout nestedScrollingChildFrameLayout = this.f82118m;
            if (nestedScrollingChildFrameLayout != null) {
                Objects.requireNonNull(fragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.Dialog.GetScrollingView");
                nestedScrollingChildFrameLayout.setGetScrollingView((a) fragment);
            }
            Objects.requireNonNull(this.n, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.Dialog.GetScrollingView");
            NestedScrollingChildFrameLayout nestedScrollingChildFrameLayout2 = this.f82118m;
            if (nestedScrollingChildFrameLayout2 != null) {
                nestedScrollingChildFrameLayout2.getiDispatchNestedPreFling();
            }
        }
        ViewGroup viewGroup = this.f82111b;
        int i3 = 0;
        String str5 = null;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                b bVar = this.o;
                if (bVar != null) {
                    i2 = bVar.f82120b;
                } else {
                    i2 = 0;
                }
                layoutParams.height = i2;
            } else {
                layoutParams = null;
            }
            viewGroup.setLayoutParams(layoutParams);
        }
        b bVar2 = this.o;
        if (bVar2 != null) {
            str = bVar2.f82121c;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str) && (textView = this.f82114e) != null) {
            b bVar3 = this.o;
            if (bVar3 != null) {
                str4 = bVar3.f82121c;
            } else {
                str4 = null;
            }
            textView.setText(str4);
        }
        i iVar = new i(this);
        TextView textView2 = this.f82114e;
        if (textView2 != null) {
            textView2.setOnClickListener(new g(this));
        }
        SearchNestedLayout searchNestedLayout = this.f82110a;
        if (searchNestedLayout != null) {
            searchNestedLayout.setOnCancelListener(iVar);
        }
        b bVar4 = this.o;
        if (bVar4 != null) {
            str2 = bVar4.f82123e;
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2) && (appCompatTextView = this.f82115j) != null) {
            b bVar5 = this.o;
            if (bVar5 != null) {
                str3 = bVar5.f82123e;
            } else {
                str3 = null;
            }
            appCompatTextView.setText(str3);
        }
        AppCompatTextView appCompatTextView2 = this.f82115j;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setOnClickListener(new h(this));
        }
        a(getActivity(), this.n);
        TextView textView3 = this.f82117l;
        if (textView3 != null) {
            b bVar6 = this.o;
            if (bVar6 != null) {
                str5 = bVar6.f82119a;
            }
            textView3.setText(str5);
        }
        ViewGroup viewGroup2 = this.f82113d;
        if (viewGroup2 != null) {
            b bVar7 = this.o;
            if (bVar7 != null && !bVar7.f82128j) {
                i3 = 8;
            }
            viewGroup2.setVisibility(i3);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public String f82119a = "";

        /* renamed from: b  reason: collision with root package name */
        public int f82120b;

        /* renamed from: c  reason: collision with root package name */
        public String f82121c = "";

        /* renamed from: d  reason: collision with root package name */
        public View.OnClickListener f82122d;

        /* renamed from: e  reason: collision with root package name */
        public String f82123e = "";

        /* renamed from: f  reason: collision with root package name */
        public int f82124f;

        /* renamed from: g  reason: collision with root package name */
        public int f82125g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f82126h = true;

        /* renamed from: i  reason: collision with root package name */
        public View.OnClickListener f82127i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f82128j = true;

        static {
            Covode.recordClassIndex(51100);
        }

        public final void a(String str) {
            l.d(str, "");
            this.f82119a = str;
        }

        public final void b(String str) {
            l.d(str, "");
            this.f82121c = str;
        }

        public final void c(String str) {
            l.d(str, "");
            this.f82123e = str;
        }
    }

    public static final class e implements View.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f82130a;

        static {
            Covode.recordClassIndex(51103);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(d dVar) {
            this.f82130a = dVar;
        }

        public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
            if (i2 != 4) {
                return false;
            }
            a.a(this.f82130a.getActivity());
            return true;
        }
    }

    public static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f82133a;

        static {
            Covode.recordClassIndex(51107);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(d dVar) {
            this.f82133a = dVar;
        }

        public final void onClick(View view) {
            b bVar;
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            Fragment fragment = this.f82133a.n;
            if (fragment != null) {
                fragment.onHiddenChanged(true);
            }
            if (!(this.f82133a.p || (bVar = this.f82133a.o) == null || (onClickListener = bVar.f82122d) == null)) {
                onClickListener.onClick(view);
            }
            this.f82133a.p = false;
        }
    }

    public static final class j implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f82134a;

        static {
            Covode.recordClassIndex(51108);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(d dVar) {
            this.f82134a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.discover.ui.Dialog.c
        public final void a(boolean z) {
            androidx.fragment.app.i iVar;
            if (!z) {
                androidx.fragment.app.e activity = this.f82134a.getActivity();
                Fragment fragment = null;
                if (activity != null) {
                    iVar = activity.getSupportFragmentManager();
                    if (iVar != null) {
                        fragment = iVar.a(d.r);
                    }
                } else {
                    iVar = null;
                }
                d dVar = (d) fragment;
                if (dVar != null && iVar != null) {
                    iVar.a().b(dVar).c();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!isHidden()) {
            g();
        }
    }

    static final class f extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(51104);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            int i2;
            boolean booleanValue = bool.booleanValue();
            View view = this.this$0.f82116k;
            if (view != null) {
                if (booleanValue) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                view.setVisibility(i2);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f82131a;

        static {
            Covode.recordClassIndex(51105);
        }

        g(d dVar) {
            this.f82131a = dVar;
        }

        public final void onClick(View view) {
            androidx.fragment.app.i supportFragmentManager;
            ClickAgent.onClick(view);
            androidx.fragment.app.e activity = this.f82131a.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && supportFragmentManager.a(d.r) != null) {
                this.f82131a.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f82132a;

        static {
            Covode.recordClassIndex(51106);
        }

        h(d dVar) {
            this.f82132a = dVar;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            b bVar = this.f82132a.o;
            if (!(bVar == null || (onClickListener = bVar.f82127i) == null)) {
                onClickListener.onClick(view);
            }
            this.f82132a.p = true;
            this.f82132a.b();
        }
    }

    public final void a(boolean z) {
        int i2;
        int i3;
        if (getContext() != null) {
            if (z) {
                AppCompatTextView appCompatTextView = this.f82115j;
                if (appCompatTextView != null) {
                    Resources resources = getResources();
                    b bVar = this.o;
                    if (bVar != null) {
                        i3 = bVar.f82124f;
                    } else {
                        i3 = R.color.bh;
                    }
                    appCompatTextView.setTextColor(resources.getColor(i3));
                }
                AppCompatTextView appCompatTextView2 = this.f82115j;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setClickable(true);
                    return;
                }
                return;
            }
            AppCompatTextView appCompatTextView3 = this.f82115j;
            if (appCompatTextView3 != null) {
                Resources resources2 = getResources();
                b bVar2 = this.o;
                if (bVar2 != null) {
                    i2 = bVar2.f82125g;
                } else {
                    i2 = R.color.bz;
                }
                appCompatTextView3.setTextColor(resources2.getColor(i2));
            }
            AppCompatTextView appCompatTextView4 = this.f82115j;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setClickable(false);
            }
        }
    }

    private static void a(androidx.fragment.app.e eVar, Fragment fragment) {
        if (fragment != null && eVar != null && !eVar.isFinishing()) {
            eVar.getSupportFragmentManager().a().b(R.id.ali, fragment, "contentFragment").c();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ae
    public final void a(float f2, float f3) {
        com.ss.android.ugc.aweme.search.theme.c value;
        Integer valueOf;
        float f4 = (f2 * 1.0f) / f3;
        if (f4 >= 0.0f) {
            Object evaluate = d().evaluate(f4, Integer.valueOf(((Number) this.v.getValue()).intValue()), Integer.valueOf(e()));
            Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) evaluate).intValue();
            androidx.fragment.app.e activity = getActivity();
            Integer num = null;
            if (!(activity == null || (value = ((ThemeViewModel) androidx.lifecycle.ae.a(activity, (ad.b) null).a(ThemeViewModel.class)).a().getValue()) == null || (valueOf = Integer.valueOf(value.f121705b)) == null)) {
                Object evaluate2 = d().evaluate(f4, valueOf, Integer.valueOf(e()));
                Objects.requireNonNull(evaluate2, "null cannot be cast to non-null type kotlin.Int");
                num = (Integer) evaluate2;
            }
            try {
                ViewGroup viewGroup = this.f82112c;
                if (viewGroup != null) {
                    viewGroup.setBackgroundColor(intValue);
                }
                if (num == null || getActivity() == null) {
                    hh.a(getActivity(), 8421504);
                    return;
                }
                androidx.fragment.app.e activity2 = getActivity();
                if (activity2 == null) {
                    l.b();
                }
                l.b(activity2, "");
                a.C1099a.a(activity2).b(num.intValue()).f44923a.d();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        this.f82112c = (FrameLayout) view.findViewById(R.id.ad7);
        this.f82110a = (SearchNestedLayout) view.findViewById(R.id.dqk);
        this.f82113d = (RelativeLayout) view.findViewById(R.id.emj);
        this.f82114e = (AppCompatTextView) view.findViewById(R.id.a7t);
        this.f82115j = (AppCompatTextView) view.findViewById(R.id.aco);
        this.f82111b = (LinearLayout) view.findViewById(R.id.alb);
        this.f82117l = (TuxTextView) view.findViewById(R.id.alr);
        NestedScrollingChildFrameLayout nestedScrollingChildFrameLayout = (NestedScrollingChildFrameLayout) view.findViewById(R.id.ali);
        this.f82118m = nestedScrollingChildFrameLayout;
        if (nestedScrollingChildFrameLayout != null) {
            nestedScrollingChildFrameLayout.setNestedScrollingParent(this.f82110a);
        }
        c();
        this.f82116k = view.findViewById(R.id.fip);
        b bVar = this.o;
        if (bVar != null) {
            z = bVar.f82126h;
        } else {
            z = true;
        }
        a(z);
        a();
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.av3, viewGroup, false);
    }
}

package com.ss.android.ugc.aweme.friends.widget.contact;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.searchbar.SearchBar;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.widget.contact.vm.SearchContactVM;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.z;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.bz;

public final class f extends com.bytedance.ies.foundation.fragment.a implements KeyboardUtils.a, c {

    /* renamed from: f */
    public static final a f97328f = new a((byte) 0);

    /* renamed from: e */
    public d f97329e;

    /* renamed from: g */
    private final h.h f97330g = h.i.a((h.f.a.a) new e(this));

    /* renamed from: h */
    private final Handler f97331h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    private SparseArray f97332i;

    static final class g implements View.OnClickListener {

        /* renamed from: a */
        public static final g f97338a = new g();

        static {
            Covode.recordClassIndex(61839);
        }

        g() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(61831);
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.f97332i == null) {
            this.f97332i = new SparseArray();
        }
        View view = (View) this.f97332i.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f97332i.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        SparseArray sparseArray = this.f97332i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final SearchContactVM d() {
        return (SearchContactVM) this.f97330g.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61832);
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.f$a$a */
        public static final class C2341a extends m implements h.f.a.b<f, z> {

            /* renamed from: a */
            public static final C2341a f97333a = new C2341a();

            static {
                Covode.recordClassIndex(61833);
            }

            C2341a() {
                super(1);
            }

            @Override // h.f.a.b
            public final /* synthetic */ z invoke(f fVar) {
                l.d(fVar, "");
                return z.f158842a;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static f a(h.f.a.b<? super f, z> bVar) {
            l.d(bVar, "");
            f fVar = new f();
            bVar.invoke(fVar);
            return fVar;
        }
    }

    public static final class i extends com.bytedance.ies.dmt.ui.searchbar.a {

        /* renamed from: a */
        final /* synthetic */ f f97340a;

        static {
            Covode.recordClassIndex(61841);
        }

        @Override // com.bytedance.ies.dmt.ui.searchbar.b, com.bytedance.ies.dmt.ui.searchbar.a
        public final void a() {
            this.f97340a.d().c();
        }

        i(f fVar) {
            this.f97340a = fVar;
        }

        @Override // com.bytedance.ies.dmt.ui.searchbar.b, com.bytedance.ies.dmt.ui.searchbar.a
        public final void a(String str) {
            if (str != null) {
                if (str.length() > 0 && (this.f97340a.f() == com.ss.android.ugc.aweme.friends.widget.contact.vm.b.ON_SHOW || this.f97340a.f() == com.ss.android.ugc.aweme.friends.widget.contact.vm.b.ON_SEARCH_END)) {
                    this.f97340a.d().f97369c.setValue(com.ss.android.ugc.aweme.friends.widget.contact.vm.b.ON_SEARCH_START);
                } else if (str.length() == 0 && this.f97340a.f() == com.ss.android.ugc.aweme.friends.widget.contact.vm.b.ON_SEARCH_START) {
                    this.f97340a.d().c();
                }
                SearchContactVM d2 = this.f97340a.d();
                l.d(str, "");
                bz unused = kotlinx.coroutines.i.a(d2.f97348b, null, null, new SearchContactVM.b(d2, str, null), 3);
            }
        }

        @Override // com.bytedance.ies.dmt.ui.searchbar.b, com.bytedance.ies.dmt.ui.searchbar.a
        public final void a(boolean z, String str) {
            if (z) {
                this.f97340a.d();
                r.a().execute(SearchContactVM.c.f97375a);
            }
        }
    }

    public final com.ss.android.ugc.aweme.friends.widget.contact.vm.b f() {
        return d().f97371e.getValue();
    }

    static final class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ f f97336a;

        static {
            Covode.recordClassIndex(61836);
        }

        d(f fVar) {
            this.f97336a = fVar;
        }

        public final void run() {
            View e2;
            if (this.f97336a.f() == com.ss.android.ugc.aweme.friends.widget.contact.vm.b.ON_SEARCH_START && (e2 = this.f97336a.e()) != null) {
                e2.requestFocus();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.a<SearchContactVM> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(61837);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.ac, java.lang.Object, com.ss.android.ugc.aweme.friends.widget.contact.vm.SearchContactVM] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.ss.android.ugc.aweme.friends.widget.contact.vm.SearchContactVM invoke() {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.friends.widget.contact.f r1 = r3.this$0
                java.lang.String r2 = ""
                h.f.b.l.d(r1, r2)
                r0 = 0
                androidx.lifecycle.ad r1 = androidx.lifecycle.ae.a(r1, r0)
                java.lang.Class<com.ss.android.ugc.aweme.friends.widget.contact.vm.SearchContactVM> r0 = com.ss.android.ugc.aweme.friends.widget.contact.vm.SearchContactVM.class
                androidx.lifecycle.ac r0 = r1.a(r0)
                h.f.b.l.b(r0, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.widget.contact.f.e.invoke():java.lang.Object");
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.widget.contact.c
    public final void a() {
        if (this.f33898a && f() != com.ss.android.ugc.aweme.friends.widget.contact.vm.b.ON_HIDE) {
            d().b();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.utils.KeyboardUtils.a
    public final void b() {
        if (f() == com.ss.android.ugc.aweme.friends.widget.contact.vm.b.ON_SHOW || f() == com.ss.android.ugc.aweme.friends.widget.contact.vm.b.ON_SEARCH_START) {
            this.f97331h.removeCallbacksAndMessages(null);
        }
    }

    public final View e() {
        ViewParent viewParent;
        View view = getView();
        View view2 = null;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof View) {
            view2 = viewParent;
        }
        return view2;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.base.utils.KeyboardUtils.a
    public final void c() {
        if (f() == com.ss.android.ugc.aweme.friends.widget.contact.vm.b.ON_SHOW || f() == com.ss.android.ugc.aweme.friends.widget.contact.vm.b.ON_SEARCH_START) {
            this.f97331h.removeCallbacksAndMessages(null);
            this.f97331h.postDelayed(new d(this), 300);
        }
    }

    public final void b(int i2) {
        View e2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        View e3 = e();
        if ((e3 == null || (layoutParams2 = e3.getLayoutParams()) == null || layoutParams2.height != i2) && (e2 = e()) != null) {
            View e4 = e();
            if (e4 == null || (layoutParams = e4.getLayoutParams()) == null) {
                layoutParams = null;
            } else {
                layoutParams.height = i2;
            }
            e2.setLayoutParams(layoutParams);
        }
    }

    static final class b<T> implements u {

        /* renamed from: a */
        final /* synthetic */ f f97334a;

        static {
            Covode.recordClassIndex(61834);
        }

        b(f fVar) {
            this.f97334a = fVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            p pVar = (p) obj;
            List<T> list = (List) pVar.component2();
            list.size();
            int i2 = g.f97344a[((com.ss.android.ugc.aweme.friends.widget.contact.vm.a) pVar.component1()).ordinal()];
            if (i2 == 1) {
                f fVar = this.f97334a;
                RecyclerView recyclerView = (RecyclerView) fVar.a(R.id.dtr);
                l.b(recyclerView, "");
                recyclerView.setVisibility(8);
                TuxTextView tuxTextView = (TuxTextView) fVar.a(R.id.dtq);
                l.b(tuxTextView, "");
                tuxTextView.setVisibility(0);
            } else if (i2 == 2) {
                f fVar2 = this.f97334a;
                TuxTextView tuxTextView2 = (TuxTextView) fVar2.a(R.id.dtq);
                l.b(tuxTextView2, "");
                tuxTextView2.setVisibility(8);
                RecyclerView recyclerView2 = (RecyclerView) fVar2.a(R.id.dtr);
                l.b(recyclerView2, "");
                recyclerView2.setVisibility(0);
                d dVar = this.f97334a.f97329e;
                if (dVar == null) {
                    l.a("inviteContactAdapter");
                }
                dVar.a(list);
            }
        }
    }

    static final class h<T> implements u {

        /* renamed from: a */
        final /* synthetic */ f f97339a;

        static {
            Covode.recordClassIndex(61840);
        }

        h(f fVar) {
            this.f97339a = fVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                ((TuxStatusView) this.f97339a.a(R.id.dtt)).a();
                TuxStatusView tuxStatusView = (TuxStatusView) this.f97339a.a(R.id.dtt);
                l.b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
                return;
            }
            ((TuxStatusView) this.f97339a.a(R.id.dtt)).a();
            TuxStatusView tuxStatusView2 = (TuxStatusView) this.f97339a.a(R.id.dtt);
            l.b(tuxStatusView2, "");
            tuxStatusView2.setVisibility(8);
        }
    }

    public static final class j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ f f97341a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f97342b;

        /* renamed from: c */
        final /* synthetic */ boolean f97343c;

        static {
            Covode.recordClassIndex(61842);
        }

        j(f fVar, WeakReference weakReference, boolean z) {
            this.f97341a = fVar;
            this.f97342b = weakReference;
            this.f97343c = z;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = (View) this.f97342b.get();
            if (view != null) {
                l.b(view, "");
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, 44.0f * floatValue, system.getDisplayMetrics()));
                view.setLayoutParams(layoutParams);
                view.setAlpha(floatValue);
                if (floatValue == 0.0f && this.f97343c) {
                    view.setVisibility(8);
                    View e2 = this.f97341a.e();
                    if (e2 != null) {
                        e2.setVisibility(8);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.widget.contact.c
    public final void a(List<? extends a> list) {
        l.d(list, "");
        if (this.f33898a && f() == com.ss.android.ugc.aweme.friends.widget.contact.vm.b.ON_HIDE) {
            d().a(list);
        }
    }

    static final class c<T> implements u {

        /* renamed from: a */
        final /* synthetic */ f f97335a;

        static {
            Covode.recordClassIndex(61835);
        }

        c(f fVar) {
            this.f97335a = fVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.friends.widget.contact.vm.b bVar = (com.ss.android.ugc.aweme.friends.widget.contact.vm.b) obj;
            if (bVar != null) {
                int i2 = g.f97345b[bVar.ordinal()];
                if (i2 == 1) {
                    this.f97335a.b(-2);
                    this.f97335a.a(false);
                    FrameLayout frameLayout = (FrameLayout) this.f97335a.a(R.id.dts);
                    l.b(frameLayout, "");
                    frameLayout.setVisibility(8);
                } else if (i2 == 2) {
                    this.f97335a.b(-2);
                    this.f97335a.a(true);
                    FrameLayout frameLayout2 = (FrameLayout) this.f97335a.a(R.id.dts);
                    l.b(frameLayout2, "");
                    frameLayout2.setVisibility(8);
                } else if (i2 == 3) {
                    this.f97335a.b(-1);
                    View e2 = this.f97335a.e();
                    if (e2 != null) {
                        e2.setVisibility(0);
                    }
                    FrameLayout frameLayout3 = (FrameLayout) this.f97335a.a(R.id.dts);
                    l.b(frameLayout3, "");
                    frameLayout3.setVisibility(0);
                } else if (i2 == 4) {
                    this.f97335a.b(-2);
                    View e3 = this.f97335a.e();
                    if (e3 != null) {
                        e3.setVisibility(0);
                    }
                    FrameLayout frameLayout4 = (FrameLayout) this.f97335a.a(R.id.dts);
                    l.b(frameLayout4, "");
                    frameLayout4.setVisibility(8);
                    ((SearchBar) this.f97335a.a(R.id.dto)).c();
                }
            }
        }
    }

    public final void a(boolean z) {
        float f2;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        if (!z) {
            View e2 = e();
            if (e2 != null) {
                e2.setVisibility(0);
            }
            SearchBar searchBar = (SearchBar) a(R.id.dto);
            l.b(searchBar, "");
            searchBar.setVisibility(0);
        }
        WeakReference weakReference = new WeakReference(a(R.id.dto));
        ValueAnimator ofFloat = ObjectAnimator.ofFloat(f2, 1.0f - f2);
        ofFloat.addUpdateListener(new j(this, weakReference, z));
        ofFloat.setDuration(150L).start();
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ((SearchBar) a(R.id.dto)).setSearchBarEventHandler(new i(this));
        RecyclerView recyclerView = (RecyclerView) a(R.id.dtr);
        l.b(recyclerView, "");
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        d dVar = new d(this, d());
        this.f97329e = dVar;
        dVar.f97323d = new h(this);
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.dtr);
        l.b(recyclerView2, "");
        d dVar2 = this.f97329e;
        if (dVar2 == null) {
            l.a("inviteContactAdapter");
        }
        recyclerView2.setAdapter(dVar2);
        RecyclerView recyclerView3 = (RecyclerView) a(R.id.dtr);
        l.b(recyclerView3, "");
        recyclerView3.setItemAnimator(null);
        View e2 = e();
        if (e2 != null) {
            e2.setOnKeyListener(new View$OnKeyListenerC2342f(this));
        }
        View e3 = e();
        if (e3 != null) {
            e3.setOnClickListener(g.f97338a);
        }
        KeyboardUtils.a(this, getView(), this);
        d().f97372f.observe(this, new b(this));
        d().f97371e.observe(this, new c(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a2w, viewGroup, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.f$f */
    static final class View$OnKeyListenerC2342f implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ f f97337a;

        static {
            Covode.recordClassIndex(61838);
        }

        View$OnKeyListenerC2342f(f fVar) {
            this.f97337a = fVar;
        }

        public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
            l.d(view, "");
            l.d(keyEvent, "");
            keyEvent.getAction();
            if (i2 != 4 || keyEvent.getAction() != 1 || this.f97337a.f() != com.ss.android.ugc.aweme.friends.widget.contact.vm.b.ON_SEARCH_START) {
                return false;
            }
            this.f97337a.d().c();
            return true;
        }
    }
}

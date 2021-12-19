package com.ss.android.ugc.aweme.journey.step.c;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cq;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Iterator;
import java.util.Objects;

public final class b extends com.ss.android.ugc.aweme.journey.step.a {

    /* renamed from: k  reason: collision with root package name */
    public static final a f104964k = new a((byte) 0);

    /* renamed from: l  reason: collision with root package name */
    private SparseArray f104965l;

    static {
        Covode.recordClassIndex(67291);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.a
    public final View a(int i2) {
        if (this.f104965l == null) {
            this.f104965l = new SparseArray();
        }
        View view = (View) this.f104965l.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f104965l.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.a
    public final void c() {
        SparseArray sparseArray = this.f104965l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.journey.step.a, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        c();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67292);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104967a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f104968b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f104969c;

        static {
            Covode.recordClassIndex(67294);
        }

        c(b bVar, a aVar, e eVar) {
            this.f104967a = bVar;
            this.f104968b = aVar;
            this.f104969c = eVar;
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
            this.f104967a.f104930j = true;
            if (!this.f104968b.f104956b.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator<T> it = this.f104968b.f104956b.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    sb.append(this.f104969c.f104974a.get(it.next().intValue()).f104861a);
                    if (i2 != this.f104968b.f104956b.size() - 1) {
                        sb.append(",");
                    }
                    i2++;
                }
                String sb2 = sb.toString();
                l.b(sb2, "");
                this.f104967a.a(false, sb2);
                cq.f78276a.a(sb2);
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.journey.step.g.b(false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.c.b$b  reason: collision with other inner class name */
    public static final class C2676b extends GridLayoutManager.c {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f104966e;

        static {
            Covode.recordClassIndex(67293);
        }

        C2676b(a aVar) {
            this.f104966e = aVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int a(int i2) {
            if (this.f104966e.getItemViewType(i2) == 0) {
                return 2;
            }
            return 1;
        }
    }

    static final class f extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(67297);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            bool.booleanValue();
            this.this$0.a(true, "");
            return z.f158842a;
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104970a;

        static {
            Covode.recordClassIndex(67295);
        }

        d(b bVar) {
            this.f104970a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f104970a.f104930j = true;
            this.f104970a.a(false, "cancel");
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.journey.step.g.b(true));
        }
    }

    static final class e extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(67296);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            if (intValue == 1) {
                this.this$0.a(true);
            } else if (intValue == 0) {
                this.this$0.a(false);
            }
            return z.f158842a;
        }
    }

    public final void a(boolean z, String str) {
        if (!z) {
            r.a("choose_content_language_popup", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "new_user_journey").a("language_type", str).a("stay_time", System.currentTimeMillis() - this.f104928d).f66730a);
        }
        r.a("popup_duration", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "new_user_journey").a("duration", System.currentTimeMillis() - this.f104928d).f66730a);
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.journey.step.a, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        this.f104929e = new f(this);
        e eVar = ((ComponentDependencies) ae.a(requireActivity(), (ad.b) null).a(ComponentDependencies.class)).f104916f;
        if (eVar == null) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.journey.step.g.b(true));
            return;
        }
        ViewGroup.LayoutParams layoutParams = b().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin -= (int) n.b(b().getContext(), 4.0f);
        marginLayoutParams.rightMargin = marginLayoutParams.leftMargin;
        a aVar = new a(eVar.f104974a, new e(this), eVar.f104975b);
        RecyclerView b2 = b();
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.a(new C2676b(aVar));
        b2.setLayoutManager(gridLayoutManager);
        b().setAdapter(aVar);
        com.bytedance.ies.dmt.ui.titlebar.a aVar2 = (com.bytedance.ies.dmt.ui.titlebar.a) a(R.id.em8);
        String str2 = aVar.f104858a;
        if (str2 == null) {
            str2 = "";
        }
        aVar2.setTitle(str2);
        a().setOnClickListener(new c(this, aVar, eVar));
        ((TuxTextView) a(R.id.e4z)).setOnClickListener(new d(this));
        cq.f78276a.g();
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "new_user_journey");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            str = "1";
        } else {
            str = "0";
        }
        r.a("show_content_language_popup", a2.a("is_login", str).a("page_show_cost", System.currentTimeMillis() - this.f104928d).f66730a);
    }
}

package com.ss.android.ugc.aweme.journey.step.b;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cq;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public final class b extends com.ss.android.ugc.aweme.journey.step.a {

    /* renamed from: k  reason: collision with root package name */
    private SparseArray f104951k;

    static {
        Covode.recordClassIndex(67279);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.a
    public final View a(int i2) {
        if (this.f104951k == null) {
            this.f104951k = new SparseArray();
        }
        View view = (View) this.f104951k.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f104951k.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.a
    public final void c() {
        SparseArray sparseArray = this.f104951k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.journey.step.a, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        c();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.journey.step.a
    public final void onStop() {
        this.f104929e = new d(this);
        super.onStop();
    }

    static final class c extends m implements h.f.a.b<com.ss.android.ugc.aweme.language.b, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(67282);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.language.b bVar) {
            boolean z;
            b bVar2 = this.this$0;
            if (bVar != null) {
                z = true;
            } else {
                z = false;
            }
            bVar2.a(z);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(67283);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
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

    /* renamed from: com.ss.android.ugc.aweme.journey.step.b.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC2674b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104953a;

        static {
            Covode.recordClassIndex(67281);
        }

        View$OnClickListenerC2674b(b bVar) {
            this.f104953a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f104953a.f104930j = true;
            this.f104953a.a(false, "cancel");
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.journey.step.g.b());
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104952a;

        static {
            Covode.recordClassIndex(67280);
        }

        a(b bVar) {
            this.f104952a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f104952a.f104930j = true;
            RecyclerView.a adapter = this.f104952a.b().getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.applanguage.ChooseAppLanguageAdapter");
            com.ss.android.ugc.aweme.language.b bVar = ((a) adapter).f104943b;
            if (bVar == null) {
                l.b();
            }
            b bVar2 = this.f104952a;
            String f2 = bVar.f();
            l.b(f2, "");
            bVar2.a(false, f2);
            ComponentDependencies componentDependencies = (ComponentDependencies) ae.a(this.f104952a.requireActivity(), (ad.b) null).a(ComponentDependencies.class);
            componentDependencies.a(bVar);
            componentDependencies.x().invoke();
        }
    }

    public final void a(boolean z, String str) {
        if (!z) {
            r.a("choose_language_popup", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "new_user_journey").a("language_type", str).a("duration", System.currentTimeMillis() - this.f104928d).f66730a);
        }
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "new_user_journey").a("duration", System.currentTimeMillis() - this.f104928d);
        Integer a3 = HybridABInfoService.b().a();
        if (a3 != null) {
            a2.a("is_ab_backend_resp_received", a3.intValue());
        }
        r.a("language_popup_duration", a2.f66730a);
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.journey.step.a, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView b2 = b();
        b().getContext();
        b2.setLayoutManager(new LinearLayoutManager());
        String[] strArr = {"ms-MY", "zh-Hant-TW", "en"};
        ArrayList arrayList = new ArrayList();
        Map<String, com.ss.android.ugc.aweme.language.b> j2 = SettingServiceImpl.v().j();
        int i2 = 0;
        do {
            com.ss.android.ugc.aweme.language.b bVar = j2.get(strArr[i2]);
            if (bVar == null) {
                l.b();
            }
            arrayList.add(bVar);
            i2++;
        } while (i2 < 3);
        c cVar = new c(this);
        String string = getString(R.string.der);
        l.b(string, "");
        a aVar = new a(arrayList, cVar, string);
        b().setAdapter(aVar);
        com.bytedance.ies.dmt.ui.titlebar.a aVar2 = (com.bytedance.ies.dmt.ui.titlebar.a) a(R.id.em8);
        String str2 = aVar.f104858a;
        if (str2 == null) {
            str2 = "";
        }
        aVar2.setTitle(str2);
        a().setOnClickListener(new a(this));
        ((TuxTextView) a(R.id.e4z)).setOnClickListener(new View$OnClickListenerC2674b(this));
        cq cqVar = cq.f78276a;
        Context context = b().getContext();
        l.b(context, "");
        cqVar.a(context, true);
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "new_user_journey");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            str = "1";
        } else {
            str = "0";
        }
        r.a("show_language_popup", a2.a("is_login", str).f66730a);
    }
}

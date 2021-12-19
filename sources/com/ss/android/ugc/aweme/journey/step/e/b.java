package com.ss.android.ugc.aweme.journey.step.e;

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
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.journey.ac;
import com.ss.android.ugc.aweme.journey.n;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.journey.step.interestselector.d;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;

public final class b extends com.ss.android.ugc.aweme.journey.step.a {

    /* renamed from: k  reason: collision with root package name */
    public final String f104992k = "done";

    /* renamed from: l  reason: collision with root package name */
    public final String f104993l = "male";

    /* renamed from: m  reason: collision with root package name */
    public final String f104994m = "female";
    public final String n = "non-binary";
    public final String o = "error_saving_gender";
    public f.a.b.b p;
    public String q;
    public int r = 1;
    private final String s = "show_gender_selection";
    private final String t = "exit_gender_selection";
    private final String u = "gender";
    private final String v = "exit_method";
    private final String w = "option_list";
    private final String y = "is_binary";
    private SparseArray z;

    static {
        Covode.recordClassIndex(67311);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.a
    public final View a(int i2) {
        if (this.z == null) {
            this.z = new SparseArray();
        }
        View view = (View) this.z.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.z.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.a
    public final void c() {
        SparseArray sparseArray = this.z;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.journey.step.a, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        c();
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104996a;

        static {
            Covode.recordClassIndex(67314);
        }

        c(b bVar) {
            this.f104996a = bVar;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            Integer num;
            String str;
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
            this.f104996a.f104930j = true;
            RecyclerView.a adapter = this.f104996a.b().getAdapter();
            if (!(adapter instanceof a)) {
                adapter = null;
            }
            a aVar = (a) adapter;
            if (!(aVar == null || (num = aVar.f104981b) == null)) {
                com.ss.android.ugc.aweme.journey.h.f104859a.uploadGender(num.intValue()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.journey.step.e.b.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f104997a;

                    static {
                        Covode.recordClassIndex(67315);
                    }

                    {
                        this.f104997a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        r.a(this.f104997a.f104996a.o, new com.ss.android.ugc.aweme.app.f.d().f66730a);
                    }
                }).a(AnonymousClass2.f104998a, AnonymousClass3.f104999a);
                if (num.intValue() == 1) {
                    str = this.f104996a.f104993l;
                } else if (num.intValue() == 2) {
                    str = this.f104996a.f104994m;
                } else {
                    str = this.f104996a.n;
                }
                b bVar = this.f104996a;
                bVar.a(bVar.f104992k, str);
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.journey.step.g.b(false));
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        f.a.b.b bVar = this.p;
        if (bVar != null) {
            bVar.dispose();
        }
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.journey.step.a
    public final void onStop() {
        this.f104929e = new h(this);
        super.onStop();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.p = t.a(t.b(com.ss.android.ugc.aweme.compliance.api.a.r()), com.bytedance.ies.ugc.appcontext.f.e(), e.f105001a).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new f(this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.journey.step.a
    public final void onResume() {
        super.onResume();
        this.p = t.b(com.ss.android.ugc.aweme.compliance.api.a.r()).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new g(this));
    }

    static final class a extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ n $genderSelectionData$inlined;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(67312);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n nVar, b bVar) {
            super(1);
            this.$genderSelectionData$inlined = nVar;
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            boolean z;
            b bVar = this.this$0;
            if (num != null) {
                z = true;
            } else {
                z = false;
            }
            bVar.a(z);
            return z.f158842a;
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f105003a;

        static {
            Covode.recordClassIndex(67321);
        }

        g(b bVar) {
            this.f105003a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ((ITpcConsentService) obj).i();
            f.a.b.b bVar = this.f105003a.p;
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }

    static final class h extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(67322);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            bool.booleanValue();
            this.this$0.a((b) "background", "");
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.e.b$b  reason: collision with other inner class name */
    static final class C2678b extends m implements h.f.a.b<ac, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2678b f104995a = new C2678b();

        static {
            Covode.recordClassIndex(67313);
        }

        C2678b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(ac acVar) {
            String valueOf;
            ac acVar2 = acVar;
            l.d(acVar2, "");
            Integer num = acVar2.f104816a;
            if (num == null || (valueOf = String.valueOf(num.intValue())) == null) {
                return "";
            }
            return valueOf;
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f105000a;

        static {
            Covode.recordClassIndex(67318);
        }

        d(b bVar) {
            this.f105000a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f105000a.f104930j = true;
            this.f105000a.a((b) "skip", "");
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.journey.step.g.b(true));
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f105002a;

        static {
            Covode.recordClassIndex(67320);
        }

        f(b bVar) {
            this.f105002a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            d.b bVar = (d.b) obj;
            if (bVar.f105061a && com.bytedance.ies.ugc.appcontext.f.f34637l) {
                bVar.f105062b.h();
            }
            f.a.b.b bVar2 = this.f105002a.p;
            if (bVar2 != null) {
                bVar2.dispose();
            }
        }
    }

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f105004a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f105005b;

        static {
            Covode.recordClassIndex(67323);
        }

        i(b bVar, z.e eVar) {
            this.f105004a = bVar;
            this.f105005b = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
            if (iTpcConsentService.a((com.ss.android.ugc.aweme.compliance.api.services.consent.a) null) && this.f105004a.getActivity() != null) {
                androidx.fragment.app.e activity = this.f105004a.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                iTpcConsentService.a(activity, "gender_selection");
            }
            T t = this.f105005b.element;
            if (t != null) {
                t.dispose();
            }
        }
    }

    static final class e<T1, T2, R> implements f.a.d.c {

        /* renamed from: a  reason: collision with root package name */
        public static final e f105001a = new e();

        static {
            Covode.recordClassIndex(67319);
        }

        e() {
        }

        @Override // f.a.d.c
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
            l.d(iTpcConsentService, "");
            l.d(obj2, "");
            return new d.b(iTpcConsentService, new WeakReference(obj2));
        }
    }

    public final void a(String str, String str2) {
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a(this.v, str).a("stay_time", System.currentTimeMillis() - this.f104928d);
        Integer a3 = HybridABInfoService.b().a();
        if (a3 != null) {
            a2.a("is_ab_backend_resp_received", a3.intValue());
        }
        if (!l.a((Object) str, (Object) "background")) {
            a2.a(this.u, str2);
        }
        r.a(this.t, a2.f66730a);
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.journey.step.a, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        com.ss.android.ugc.aweme.journey.a aVar;
        List<ac> list;
        int i2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView b2 = b();
        b().getContext();
        b2.setLayoutManager(new LinearLayoutManager());
        n nVar = ((ComponentDependencies) ae.a(requireActivity(), (ad.b) null).a(ComponentDependencies.class)).f104918h;
        if (!(nVar == null || (aVar = nVar.f104872d) == null || (list = aVar.f104802b) == null)) {
            this.q = h.a.n.a(list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C2678b.f104995a, 31);
            if (list.size() <= 2) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.r = i2;
            b().setAdapter(new a(list, nVar.f104869a, nVar.f104870b, new a(nVar, this)));
        }
        a().setOnClickListener(new c(this));
        ((TuxTextView) a(R.id.e4z)).setOnClickListener(new d(this));
        r.a(this.s, new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "new_user_journey").a(this.w, this.q).a(this.y, this.r).f66730a);
        z.e eVar = new z.e();
        eVar.element = null;
        eVar.element = (T) ab.a(com.ss.android.ugc.aweme.compliance.api.a.r()).b(f.a.h.a.b(f.a.k.a.f158006c)).d().a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new i(this, eVar));
    }
}

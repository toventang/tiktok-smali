package com.ss.android.ugc.aweme.setting.page.authmanager;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.dm;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.setting.viewmodel.AuthInfoState;
import com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class b extends com.ss.android.ugc.aweme.base.arch.b {

    /* renamed from: d  reason: collision with root package name */
    public static final C3165b f122402d = new C3165b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final h.h f122403b = h.i.a((h.f.a.a) new i(this));

    /* renamed from: c  reason: collision with root package name */
    public d f122404c;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f122405e;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f122406j = h.i.a((h.f.a.a) new h(this));

    /* renamed from: k  reason: collision with root package name */
    private SparseArray f122407k;

    static {
        Covode.recordClassIndex(80259);
    }

    @Override // com.ss.android.ugc.aweme.base.arch.b
    public final View a(int i2) {
        if (this.f122407k == null) {
            this.f122407k = new SparseArray();
        }
        View view = (View) this.f122407k.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f122407k.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.b
    public final void a() {
        SparseArray sparseArray = this.f122407k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final AuthListViewModel b() {
        return (AuthListViewModel) this.f122405e.getValue();
    }

    public final TuxStatusView c() {
        return (TuxStatusView) this.f122406j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.arch.b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.b$b  reason: collision with other inner class name */
    public static final class C3165b {
        static {
            Covode.recordClassIndex(80261);
        }

        private C3165b() {
        }

        public /* synthetic */ C3165b(byte b2) {
            this();
        }

        public static b a(d dVar) {
            l.d(dVar, "");
            return new b(dVar);
        }
    }

    public static final class d implements com.bytedance.jedi.arch.ext.list.c<com.ss.android.ugc.aweme.setting.model.c, com.bytedance.jedi.arch.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f122409a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f122410b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f122411c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<com.bytedance.jedi.arch.i, z> f122412d;

        /* renamed from: e  reason: collision with root package name */
        private final m<com.bytedance.jedi.arch.i, Throwable, z> f122413e;

        /* renamed from: f  reason: collision with root package name */
        private final m<com.bytedance.jedi.arch.i, List<? extends com.ss.android.ugc.aweme.setting.model.c>, z> f122414f;

        static {
            Covode.recordClassIndex(80263);
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<com.bytedance.jedi.arch.i, z> a() {
            return this.f122412d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final m<com.bytedance.jedi.arch.i, Throwable, z> b() {
            return this.f122413e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final m<com.bytedance.jedi.arch.i, List<? extends com.ss.android.ugc.aweme.setting.model.c>, z> c() {
            return this.f122414f;
        }

        public d(h.f.a.b bVar, m mVar, m mVar2) {
            this.f122409a = bVar;
            this.f122410b = mVar;
            this.f122411c = mVar2;
            this.f122412d = bVar;
            this.f122413e = mVar;
            this.f122414f = mVar2;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<TuxStatusView> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(80270);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxStatusView invoke() {
            return this.this$0.a(R.id.e_o);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<dm> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(80271);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ dm invoke() {
            PowerList powerList = (PowerList) this.this$0.a(R.id.cb8);
            l.b(powerList, "");
            return new dm(powerList);
        }
    }

    public final void e() {
        PowerList powerList = (PowerList) a(R.id.cb8);
        l.b(powerList, "");
        powerList.getState().a();
        b().f123060d.refresh();
    }

    public static final class a extends h.f.b.m implements h.f.a.a<AuthListViewModel> {
        final /* synthetic */ Fragment $this_parentFragmentViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(80260);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_parentFragmentViewModel = fragment;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r0 = r3.$this_parentFragmentViewModel
                androidx.fragment.app.Fragment r1 = r0.getParentFragment()
                if (r1 != 0) goto L_0x000b
                h.f.b.l.a()
            L_0x000b:
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r3.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r0 = ""
                h.f.b.l.a(r1, r0)
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_setting_page_authmanager_AuthAppInfoListFragment$$special$$inlined$parentFragmentViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.page.authmanager.b.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_setting_page_authmanager_AuthAppInfoListFragment$$special$$inlined$parentFragmentViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f122408a;

        static {
            Covode.recordClassIndex(80262);
        }

        c(b bVar) {
            this.f122408a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            androidx.fragment.app.e activity = this.f122408a.getActivity();
            if (activity != null) {
                activity.setResult(0);
                activity.onBackPressed();
            }
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(80264);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar) {
            l.d(iVar, "");
            this.this$0.c().setVisibility(0);
            this.this$0.c().a();
            return z.f158842a;
        }
    }

    public b(d dVar) {
        l.d(dVar, "");
        this.f122404c = dVar;
        h.k.c a2 = h.f.b.ab.a(AuthListViewModel.class);
        this.f122405e = h.i.a((h.f.a.a) new a(this, a2, a2));
    }

    static final class f extends h.f.b.m implements m<com.bytedance.jedi.arch.i, Throwable, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(80265);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            l.d(iVar, "");
            l.d(th, "");
            this.this$0.c().setVisibility(0);
            this.this$0.c().setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.setting.page.authmanager.b.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(80266);
                }

                {
                    this.this$0 = r2;
                }

                private static boolean a() {
                    try {
                        return f.a.f68431a.c();
                    } catch (Exception unused) {
                        return false;
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.this$0.getContext();
                    if (!j.f107229h || !j.b() || j.c()) {
                        j.f107229h = a();
                    }
                    if (j.f107229h) {
                        this.this$0.this$0.e();
                    }
                    return z.f158842a;
                }
            }));
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) a(R.id.cb8);
        l.b(recyclerView, "");
        recyclerView.setItemAnimator(null);
        e();
        ((AutoRTLImageView) a(R.id.qb)).setOnClickListener(new c(this));
        ListMiddleware.a(b().f123060d, this, null, false, new d(new e(this), new f(this), new g(this)), null, null, null, 1006);
    }

    static final class g extends h.f.b.m implements m<com.bytedance.jedi.arch.i, List<? extends com.ss.android.ugc.aweme.setting.model.c>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(80267);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends com.ss.android.ugc.aweme.setting.model.c> list) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            List<? extends com.ss.android.ugc.aweme.setting.model.c> list2 = list;
            l.d(iVar2, "");
            l.d(list2, "");
            TuxStatusView tuxStatusView = (TuxStatusView) this.this$0.a(R.id.e_o);
            l.b(tuxStatusView, "");
            tuxStatusView.setVisibility(8);
            iVar2.withState(this.this$0.b(), new h.f.a.b<AuthInfoState, Object>(this) {
                /* class com.ss.android.ugc.aweme.setting.page.authmanager.b.g.AnonymousClass1 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(80268);
                }

                {
                    this.this$0 = r2;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ Object invoke(AuthInfoState authInfoState) {
                    AuthInfoState authInfoState2 = authInfoState;
                    l.d(authInfoState2, "");
                    if (com.bytedance.common.utility.collection.b.a((Collection) authInfoState2.getListState().getList())) {
                        TuxStatusView tuxStatusView = (TuxStatusView) this.this$0.this$0.a(R.id.e_o);
                        l.b(tuxStatusView, "");
                        tuxStatusView.setVisibility(0);
                        TuxStatusView.c cVar = new TuxStatusView.c();
                        String string = this.this$0.this$0.getString(R.string.wj);
                        l.b(string, "");
                        TuxStatusView.c a2 = cVar.a(string);
                        String string2 = this.this$0.this$0.getString(R.string.wi);
                        l.b(string2, "");
                        ((TuxStatusView) this.this$0.this$0.a(R.id.e_o)).setStatus(a2.a((CharSequence) string2).a(com.bytedance.tux.c.c.a(AnonymousClass1.f122415a)));
                        TuxTextView tuxTextView = (TuxTextView) this.this$0.this$0.a(R.id.li);
                        l.b(tuxTextView, "");
                        tuxTextView.setVisibility(8);
                        return 0;
                    }
                    TuxTextView tuxTextView2 = (TuxTextView) this.this$0.this$0.a(R.id.li);
                    l.b(tuxTextView2, "");
                    tuxTextView2.setVisibility(0);
                    return z.f158842a;
                }
            });
            PowerList powerList = (PowerList) this.this$0.a(R.id.cb8);
            l.b(powerList, "");
            powerList.getState().a();
            ArrayList<c> arrayList = new ArrayList(n.a((Iterable) list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new c(it.next(), this.this$0.f122404c));
            }
            for (c cVar : arrayList) {
                ((dm) this.this$0.f122403b.getValue()).a(cVar);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.ayq, viewGroup, false);
    }
}

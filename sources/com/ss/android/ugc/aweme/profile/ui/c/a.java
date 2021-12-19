package com.ss.android.ugc.aweme.profile.ui.c;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.aa;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.f.x;
import com.ss.android.ugc.aweme.profile.widgets.j;
import com.ss.android.ugc.aweme.user.viewmodel.CheckMultiAccountViewModel;
import com.ss.android.ugc.aweme.user.viewmodel.MultiProfilesViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.lang.ref.WeakReference;
import java.util.List;

public final class a extends Fragment implements com.bytedance.tux.navigation.a, j.b {

    /* renamed from: c  reason: collision with root package name */
    public static final C2975a f117026c = new C2975a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f117027a;

    /* renamed from: b  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.user.c> f117028b;

    /* renamed from: d  reason: collision with root package name */
    private CheckMultiAccountViewModel f117029d;

    /* renamed from: e  reason: collision with root package name */
    private MultiProfilesViewModel f117030e;

    /* renamed from: f  reason: collision with root package name */
    private final h f117031f = i.a((h.f.a.a) new c(this));

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f117032g;

    static {
        Covode.recordClassIndex(75568);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.c.a$a  reason: collision with other inner class name */
    public static final class C2975a {
        static {
            Covode.recordClassIndex(75569);
        }

        private C2975a() {
        }

        public /* synthetic */ C2975a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(75570);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a((Boolean) null);
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f117032g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.e.a> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(75571);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.profile.e.a invoke() {
            String str;
            String str2;
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null || (str = arguments.getString("enter_from")) == null) {
                str = "";
            }
            l.b(str, "");
            Bundle arguments2 = this.this$0.getArguments();
            if (arguments2 == null || (str2 = arguments2.getString("enter_method")) == null) {
                str2 = "";
            }
            l.b(str2, "");
            return new com.ss.android.ugc.aweme.profile.e.a(str, str2);
        }
    }

    @Override // com.bytedance.tux.navigation.a
    public final TuxNavBar.a a() {
        TuxNavBar.a aVar = new TuxNavBar.a();
        g gVar = new g();
        String string = getString(R.string.d6r);
        l.b(string, "");
        return aVar.a(gVar.a(string)).b(new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark_small).a((h.f.a.a<z>) new b(this)));
    }

    public static final /* synthetic */ b a(a aVar) {
        b bVar = aVar.f117027a;
        if (bVar == null) {
            l.a("adapter");
        }
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e activity = getActivity();
        if (activity != null) {
            ac a2 = ae.a(activity, (ad.b) null).a(CheckMultiAccountViewModel.class);
            l.b(a2, "");
            this.f117029d = (CheckMultiAccountViewModel) a2;
            ac a3 = ae.a(activity, (ad.b) null).a(MultiProfilesViewModel.class);
            l.b(a3, "");
            this.f117030e = (MultiProfilesViewModel) a3;
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117033a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecyclerView f117034b;

        static {
            Covode.recordClassIndex(75572);
        }

        d(a aVar, RecyclerView recyclerView) {
            this.f117033a = aVar;
            this.f117034b = recyclerView;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List<com.ss.android.ugc.aweme.user.c> list = (List) obj;
            RecyclerView recyclerView = this.f117034b;
            this.f117033a.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            this.f117034b.setAdapter(a.a(this.f117033a));
            this.f117033a.f117028b = list;
            b a2 = a.a(this.f117033a);
            l.b(list, "");
            l.d(list, "");
            a2.f117035a.clear();
            a2.f117035a.addAll(list);
            a2.notifyDataSetChanged();
            r.a("account_list_unfold", new com.ss.android.ugc.aweme.app.f.d().a("detail_info", x.a(list)).a("account_cnt", list.size()).a("enter_method", "auto").a("enter_from", "login_page").f66730a);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // com.ss.android.ugc.aweme.profile.widgets.j.b
    public final void a(java.lang.Boolean r5) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.c.a.a(java.lang.Boolean):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        Context context = getContext();
        if (context == null) {
            l.b();
        }
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        e activity = getActivity();
        if (activity != null) {
            l.b(activity, "");
            this.f117027a = new b(new WeakReference(this), (com.ss.android.ugc.aweme.profile.e.a) this.f117031f.getValue(), activity);
            CheckMultiAccountViewModel checkMultiAccountViewModel = this.f117029d;
            if (checkMultiAccountViewModel == null) {
                l.a("checkMultiAccountViewModel");
            }
            LiveData a2 = aa.a(checkMultiAccountViewModel.f142430a, CheckMultiAccountViewModel.a.f142431a);
            l.b(a2, "");
            a2.observe(getViewLifecycleOwner(), new d(this, recyclerView));
        }
        return recyclerView;
    }
}

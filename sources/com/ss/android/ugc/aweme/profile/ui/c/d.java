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
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.f.x;
import com.ss.android.ugc.aweme.profile.widgets.k;
import com.ss.android.ugc.aweme.user.viewmodel.MultiProfilesViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.lang.ref.WeakReference;
import java.util.List;

public final class d extends Fragment implements com.bytedance.tux.navigation.a, k.b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f117049b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public c f117050a;

    /* renamed from: c  reason: collision with root package name */
    private MultiProfilesViewModel f117051c;

    /* renamed from: d  reason: collision with root package name */
    private final h f117052d = i.a((h.f.a.a) new c(this));

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f117053e;

    static {
        Covode.recordClassIndex(75577);
    }

    public final com.ss.android.ugc.aweme.profile.e.a b() {
        return (com.ss.android.ugc.aweme.profile.e.a) this.f117052d.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75578);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static d a(com.ss.android.ugc.aweme.profile.e.a aVar) {
            d dVar = new d();
            Bundle bundle = new Bundle();
            if (aVar != null) {
                bundle.putString("enter_from", aVar.f116064a);
                bundle.putString("enter_method", aVar.f116065b);
            }
            dVar.setArguments(bundle);
            return dVar;
        }

        public static void a(androidx.fragment.app.i iVar, com.ss.android.ugc.aweme.profile.e.a aVar, String str) {
            l.d(iVar, "");
            l.d(str, "");
            new a.C1112a().a(a(aVar)).a(1).a(true).b(false).f45299a.show(iVar, str);
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(75579);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
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
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.profile.ui.c.d r0 = r1.this$0
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                h.z r0 = h.z.f158842a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.c.d.b.invoke():java.lang.Object");
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
    @Override // com.ss.android.ugc.aweme.profile.widgets.k.b
    public final void c() {
        /*
            r1 = this;
            r0 = r1
            com.bytedance.tux.sheet.sheet.a.b.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.c.d.c():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f117053e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.e.a> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(75580);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar) {
            super(0);
            this.this$0 = dVar;
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
        String string = getString(R.string.apt);
        l.b(string, "");
        return aVar.a(gVar.a(string)).b(new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark_small).a((h.f.a.a<z>) new b(this)));
    }

    public static final /* synthetic */ c a(d dVar) {
        c cVar = dVar.f117050a;
        if (cVar == null) {
            l.a("adapter");
        }
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e activity = getActivity();
        if (activity != null) {
            ac a2 = ae.a(activity, (ad.b) null).a(MultiProfilesViewModel.class);
            l.b(a2, "");
            this.f117051c = (MultiProfilesViewModel) a2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.c.d$d  reason: collision with other inner class name */
    static final class C2976d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f117054a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecyclerView f117055b;

        static {
            Covode.recordClassIndex(75581);
        }

        C2976d(d dVar, RecyclerView recyclerView) {
            this.f117054a = dVar;
            this.f117055b = recyclerView;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            RecyclerView recyclerView = this.f117055b;
            this.f117054a.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            this.f117055b.setAdapter(d.a(this.f117054a));
            c a2 = d.a(this.f117054a);
            l.b(list, "");
            l.d(list, "");
            a2.f117040a.clear();
            a2.f117040a.addAll(list);
            a2.notifyDataSetChanged();
            r.a("account_list_unfold", new com.ss.android.ugc.aweme.app.f.d().a("detail_info", x.a(list)).a("account_cnt", list.size()).a("enter_method", this.f117054a.b().f116065b).a("enter_from", this.f117054a.b().f116064a).f66730a);
        }
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
            WeakReference weakReference = new WeakReference(this);
            com.ss.android.ugc.aweme.profile.e.a b2 = b();
            l.b(activity, "");
            this.f117050a = new c(weakReference, b2, activity);
            MultiProfilesViewModel multiProfilesViewModel = this.f117051c;
            if (multiProfilesViewModel == null) {
                l.a("profilesViewModel");
            }
            LiveData a2 = aa.a(multiProfilesViewModel.f142433b, new MultiProfilesViewModel.b(multiProfilesViewModel));
            l.b(a2, "");
            a2.observe(getViewLifecycleOwner(), new C2976d(this, recyclerView));
        }
        return recyclerView;
    }
}

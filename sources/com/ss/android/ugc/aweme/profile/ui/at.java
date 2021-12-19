package com.ss.android.ugc.aweme.profile.ui;

import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.profile.a.q;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class at extends Fragment implements com.bytedance.tux.navigation.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f116884b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Handler f116885a = new Handler();

    /* renamed from: c  reason: collision with root package name */
    private final h f116886c = i.a((h.f.a.a) new c(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f116887d = i.a((h.f.a.a) new e(this));

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f116888e;

    static {
        Covode.recordClassIndex(75486);
    }

    private View b() {
        if (this.f116888e == null) {
            this.f116888e = new SparseArray();
        }
        View view = (View) this.f116888e.get(R.id.djj);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(R.id.djj);
        this.f116888e.put(R.id.djj, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75487);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(androidx.fragment.app.i iVar, User user, List<LiveEventStruct> list) {
            l.d(iVar, "");
            l.d(user, "");
            l.d(user, "");
            at atVar = new at();
            Bundle bundle = new Bundle();
            bundle.putSerializable("live_event_user", user);
            Objects.requireNonNull(list, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("live_event_list", (Serializable) list);
            atVar.setArguments(bundle);
            new a.C1112a().a(atVar).a(1).a(true).b(false).f45299a.show(iVar, "LiveEventBottomSheetFragment");
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ at this$0;

        static {
            Covode.recordClassIndex(75488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(at atVar) {
            super(0);
            this.this$0 = atVar;
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
                com.ss.android.ugc.aweme.profile.ui.at r0 = r1.this$0
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                h.z r0 = h.z.f158842a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.at.b.invoke():java.lang.Object");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f116885a.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f116888e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class e extends m implements h.f.a.a<User> {
        final /* synthetic */ at this$0;

        static {
            Covode.recordClassIndex(75491);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(at atVar) {
            super(0);
            this.this$0 = atVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ User invoke() {
            Serializable serializable;
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("live_event_user");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof User)) {
                return null;
            }
            return serializable;
        }
    }

    static final class c extends m implements h.f.a.a<List<? extends LiveEventStruct>> {
        final /* synthetic */ at this$0;

        static {
            Covode.recordClassIndex(75489);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(at atVar) {
            super(0);
            this.this$0 = atVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends LiveEventStruct> invoke() {
            Serializable serializable;
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("live_event_list");
            } else {
                serializable = null;
            }
            List list = (List) serializable;
            if (list == null) {
                return h.a.z.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof LiveEventStruct) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Override // com.bytedance.tux.navigation.a
    public final TuxNavBar.a a() {
        TuxNavBar.a aVar = new TuxNavBar.a();
        g gVar = new g();
        String string = getString(R.string.bq0);
        l.b(string, "");
        TuxNavBar.a a2 = aVar.a(gVar.a(string));
        com.bytedance.tux.navigation.a.b a3 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark_small);
        a3.f45194b = true;
        return a2.b(a3.a((h.f.a.a<z>) new b(this)));
    }

    public static final class d implements q.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at f116889a;

        static {
            Covode.recordClassIndex(75490);
        }

        d(at atVar) {
            this.f116889a = atVar;
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
        @Override // com.ss.android.ugc.aweme.profile.a.q.b
        public final void a(com.ss.android.ugc.aweme.profile.model.LiveEventStruct r2) {
            /*
                r1 = this;
                java.lang.String r0 = ""
                h.f.b.l.d(r2, r0)
                com.ss.android.ugc.aweme.profile.ui.at r0 = r1.f116889a
                android.content.Context r0 = r0.getContext()
                com.ss.android.ugc.aweme.profile.f.w.a(r0, r2)
                com.ss.android.ugc.aweme.profile.ui.at r0 = r1.f116889a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.at.d.a(com.ss.android.ugc.aweme.profile.model.LiveEventStruct):void");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) b();
        l.b(recyclerView, "");
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        RecyclerView recyclerView2 = (RecyclerView) b();
        l.b(recyclerView2, "");
        q qVar = new q((List) this.f116886c.getValue());
        d dVar = new d(this);
        l.d(dVar, "");
        qVar.f115892a = dVar;
        recyclerView2.setAdapter(qVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.apd, viewGroup, false);
    }
}

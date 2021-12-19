package com.ss.android.ugc.aweme.friends.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.friends.a.b;
import com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel;
import com.ss.android.ugc.aweme.friends.ui.IndexView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import com.ss.android.ugc.aweme.search.service.SearchUserService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class e extends com.ss.android.ugc.aweme.base.f.a implements com.ss.android.ugc.aweme.friends.f.b {

    /* renamed from: k  reason: collision with root package name */
    public static final a f97230k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final AtFriendsViewModel f97231a = new AtFriendsViewModel();

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.friends.a.a f97232b = new com.ss.android.ugc.aweme.friends.a.a();

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.friends.a.b f97233c = new com.ss.android.ugc.aweme.friends.a.b();

    /* renamed from: d  reason: collision with root package name */
    public LinearLayoutManager f97234d;

    /* renamed from: e  reason: collision with root package name */
    public v f97235e;

    /* renamed from: j  reason: collision with root package name */
    final h.h f97236j = h.i.a((h.f.a.a) o.f97252a);

    /* renamed from: l  reason: collision with root package name */
    private final h.h f97237l = h.i.a((h.f.a.a) b.f97239a);

    /* renamed from: m  reason: collision with root package name */
    private final h.h f97238m = h.i.a((h.f.a.a) p.f97253a);
    private final h.h n = h.i.a((h.f.a.a) new c(this));
    private final h.h o = h.i.a((h.f.a.a) new n(this));
    private String p;
    private int q;
    private SparseArray r;

    static {
        Covode.recordClassIndex(61763);
    }

    private static String c(int i2) {
        return i2 == 1 ? "comments" : i2 == 0 ? "captions" : "";
    }

    public final View b(int i2) {
        if (this.r == null) {
            this.r = new SparseArray();
        }
        View view = (View) this.r.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.r.put(i2, findViewById);
        return findViewById;
    }

    public final HashSet<String> c() {
        return (HashSet) this.f97237l.getValue();
    }

    public final com.ss.android.ugc.aweme.friends.f.f d() {
        return (com.ss.android.ugc.aweme.friends.f.f) this.f97238m.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61764);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<HashSet<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f97239a = new b();

        static {
            Covode.recordClassIndex(61765);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashSet<String> invoke() {
            return new HashSet();
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<ISearchUserService> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f97252a = new o();

        static {
            Covode.recordClassIndex(61779);
        }

        o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ISearchUserService invoke() {
            return SearchUserService.b();
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.friends.f.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f97253a = new p();

        static {
            Covode.recordClassIndex(61780);
        }

        p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.friends.f.f invoke() {
            return new com.ss.android.ugc.aweme.friends.f.f();
        }
    }

    public static final class f implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97242a;

        static {
            Covode.recordClassIndex(61769);
        }

        @Override // com.ss.android.ugc.aweme.friends.a.b.a
        public final String a() {
            return this.f97242a.d().f96845a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(e eVar) {
            this.f97242a = eVar;
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.r;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.f.b
    public final void a() {
        if (ab_() && this.f97233c.getItemCount() == 0) {
            ((DmtStatusView) b(R.id.e_c)).f();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.ies.dmt.ui.widget.d> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(61766);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.dmt.ui.widget.d invoke() {
            return new d.a(this.this$0.getContext()).a(2131232888).b(R.string.vl).c(R.string.vm).f33648a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.e$e  reason: collision with other inner class name */
    static final class C2340e implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97241a;

        static {
            Covode.recordClassIndex(61768);
        }

        C2340e(e eVar) {
            this.f97241a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.common.a.h.a
        public final void l() {
            this.f97241a.c().size();
            this.f97241a.f97233c.ag_();
            this.f97241a.d().a(false, this.f97241a.e());
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<com.bytedance.ies.dmt.ui.widget.d> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(61778);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.dmt.ui.widget.d invoke() {
            return new d.a(this.this$0.getContext()).a(2131232887).b(R.string.h36).c(R.string.h37).f33648a;
        }
    }

    public final com.ss.android.ugc.aweme.search.model.g e() {
        String str;
        String str2 = this.f97233c.f96725g;
        int i2 = this.q;
        if (i2 == 1) {
            str = "comment_user";
        } else if (i2 == 0) {
            str = "at_user";
        } else {
            str = "";
        }
        return new com.ss.android.ugc.aweme.search.model.g(6, null, str2, str, 20, h.a.n.k(c()));
    }

    @Override // com.ss.android.ugc.aweme.friends.f.b
    public final void b() {
        if (ab_()) {
            if (this.f97233c.getItemCount() == 0) {
                ((DmtStatusView) b(R.id.e_c)).h();
            }
            com.ss.android.ugc.aweme.common.f.e.a(getActivity(), b(R.id.dtp));
        }
    }

    public static final class j extends com.ss.android.ugc.aweme.base.ui.o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97246a;

        static {
            Covode.recordClassIndex(61773);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(e eVar) {
            this.f97246a = eVar;
        }

        static final class a<TTaskResult, TContinuationResult> implements b.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f97247a;

            static {
                Covode.recordClassIndex(61774);
            }

            a(j jVar) {
                this.f97247a = jVar;
            }

            @Override // b.g
            public final /* synthetic */ Object then(b.i iVar) {
                h.f.b.l.b(iVar, "");
                if (iVar.b() || iVar.c()) {
                    ((DmtStatusView) this.f97247a.f97246a.b(R.id.e_c)).f();
                } else {
                    this.f97247a.f97246a.f97233c.f96720b = (List) iVar.d();
                    List list = (List) iVar.d();
                    if (list != null && (!list.isEmpty())) {
                        this.f97247a.f97246a.a((Integer) null);
                    }
                    List list2 = (List) iVar.d();
                    if (list2 != null) {
                        Integer.valueOf(list2.size());
                    }
                }
                this.f97247a.f97246a.c().clear();
                this.f97247a.f97246a.d().a(true, this.f97247a.f97246a.e());
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.base.ui.o
        public final void afterTextChanged(Editable editable) {
            boolean z;
            int i2;
            int i3;
            h.f.b.l.d(editable, "");
            if (editable.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            ImageButton imageButton = (ImageButton) this.f97246a.b(R.id.a71);
            h.f.b.l.b(imageButton, "");
            if (imageButton.getVisibility() != i2) {
                if (i2 == 8) {
                    e eVar = this.f97246a;
                    if (eVar.f97232b.getItemCount() == 0) {
                        i3 = 1;
                    } else {
                        i3 = -1;
                    }
                    eVar.a(i3);
                }
                ImageButton imageButton2 = (ImageButton) this.f97246a.b(R.id.a71);
                h.f.b.l.b(imageButton2, "");
                imageButton2.setVisibility(i2);
            }
            String obj = editable.toString();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            String obj2 = h.m.p.b((CharSequence) obj).toString();
            if (!h.f.b.l.a((Object) this.f97246a.f97233c.f96725g, (Object) obj2)) {
                com.ss.android.ugc.aweme.friends.a.b bVar = this.f97246a.f97233c;
                h.f.b.l.d(obj2, "");
                bVar.f96725g = obj2;
                if (obj2.length() > 0) {
                    if (!this.f97246a.d().i()) {
                        com.ss.android.ugc.aweme.friends.f.f d2 = this.f97246a.d();
                        e eVar2 = this.f97246a;
                        h.f.b.l.d(eVar2, "");
                        if (!(eVar2 instanceof com.ss.android.ugc.aweme.friends.f.b)) {
                            eVar2 = null;
                        }
                        d2.a_(eVar2);
                    }
                    if (this.f97246a.f97232b.getItemCount() == 0) {
                        ((DmtStatusView) this.f97246a.b(R.id.e_c)).f();
                    }
                    this.f97246a.c().size();
                    if (((ISearchUserService) this.f97246a.f97236j.getValue()).a()) {
                        AtFriendsViewModel atFriendsViewModel = this.f97246a.f97231a;
                        List<? extends IMUser> list = this.f97246a.f97232b.f96696b;
                        if (list == null) {
                            list = h.a.z.INSTANCE;
                        }
                        atFriendsViewModel.searchKeyWord(obj2, list).a(new a(this), b.i.f4826c, null);
                        return;
                    }
                    this.f97246a.c().clear();
                    this.f97246a.d().a(true, this.f97246a.e());
                }
            }
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97243a;

        static {
            Covode.recordClassIndex(61770);
        }

        g(e eVar) {
            this.f97243a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            androidx.fragment.app.e activity = this.f97243a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97244a;

        static {
            Covode.recordClassIndex(61771);
        }

        h(e eVar) {
            this.f97244a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            androidx.fragment.app.e activity = this.f97244a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public static final /* synthetic */ LinearLayoutManager a(e eVar) {
        LinearLayoutManager linearLayoutManager = eVar.f97234d;
        if (linearLayoutManager == null) {
            h.f.b.l.a("linearLayoutManager");
        }
        return linearLayoutManager;
    }

    /* access modifiers changed from: package-private */
    public static final class q implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97254a;

        static {
            Covode.recordClassIndex(61781);
        }

        q(e eVar) {
            this.f97254a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f97254a.d().a(true, this.f97254a.e());
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97248a;

        static {
            Covode.recordClassIndex(61775);
        }

        k(e eVar) {
            this.f97248a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((DmtEditText) this.f97248a.b(R.id.dtp)).setText("");
            ((DmtEditText) this.f97248a.b(R.id.dtp)).clearFocus();
            com.ss.android.ugc.aweme.common.f.e.a(this.f97248a.getActivity(), this.f97248a.b(R.id.dtp));
        }
    }

    static final class m implements IndexView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97251a;

        static {
            Covode.recordClassIndex(61777);
        }

        m(e eVar) {
            this.f97251a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.friends.ui.IndexView.a
        public final void a(int i2) {
            LinearLayoutManager a2 = e.a(this.f97251a);
            IndexView indexView = (IndexView) this.f97251a.b(R.id.bnu);
            int i3 = 0;
            int i4 = 0;
            while (i3 < indexView.f97084b.size() && i3 < i2) {
                i4 += indexView.f97084b.get(i3).intValue();
                i3++;
            }
            a2.a(i4, 0);
        }
    }

    static final class d<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97240a;

        static {
            Covode.recordClassIndex(61767);
        }

        d(e eVar) {
            this.f97240a = eVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            int i2;
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            h.f.b.l.b(iVar, "");
            if (!iVar.b() && !iVar.c()) {
                h.f.b.l.b(createIUserServicebyMonsterPlugin, "");
                if (createIUserServicebyMonsterPlugin.isLogin()) {
                    e eVar = this.f97240a;
                    v vVar = new v(this.f97240a.getContext(), ((AtFriendsViewModel.Companion.AllFriends) iVar.d()).indexLabels, ((AtFriendsViewModel.Companion.AllFriends) iVar.d()).indexLabelCount);
                    ((RecyclerView) this.f97240a.b(R.id.djj)).a(vVar);
                    eVar.f97235e = vVar;
                    IndexView indexView = (IndexView) this.f97240a.b(R.id.bnu);
                    List<String> list = ((AtFriendsViewModel.Companion.AllFriends) iVar.d()).indexLabels;
                    List<Integer> list2 = ((AtFriendsViewModel.Companion.AllFriends) iVar.d()).indexLabelCount;
                    indexView.f97083a.clear();
                    indexView.f97084b.clear();
                    indexView.f97083a.addAll(list);
                    indexView.f97084b.addAll(list2);
                    indexView.requestLayout();
                    com.ss.android.ugc.aweme.friends.a.a aVar = this.f97240a.f97232b;
                    AtFriendsViewModel.Companion.AllFriends allFriends = (AtFriendsViewModel.Companion.AllFriends) iVar.d();
                    aVar.f96698d = allFriends;
                    if (allFriends != null) {
                        aVar.f96696b = allFriends.filterFriends;
                        aVar.f96697c = allFriends.mobRecentUsers;
                    }
                    e eVar2 = this.f97240a;
                    if (eVar2.f97232b.getItemCount() == 0) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                    eVar2.a(i2);
                    this.f97240a.f97232b.notifyDataSetChanged();
                    return null;
                }
            }
            ((DmtStatusView) this.f97240a.b(R.id.e_c)).g();
            return null;
        }
    }

    public final void a(int i2) {
        if (ab_() && b(R.id.djj) != null) {
            RecyclerView recyclerView = (RecyclerView) b(R.id.djj);
            h.f.b.l.b(recyclerView, "");
            if (!h.f.b.l.a(recyclerView.getAdapter(), this.f97232b)) {
                v vVar = this.f97235e;
                if (vVar != null) {
                    ((RecyclerView) b(R.id.djj)).c(vVar);
                    ((RecyclerView) b(R.id.djj)).a(vVar);
                }
                RecyclerView recyclerView2 = (RecyclerView) b(R.id.djj);
                h.f.b.l.b(recyclerView2, "");
                recyclerView2.setAdapter(this.f97232b);
                IndexView indexView = (IndexView) b(R.id.bnu);
                h.f.b.l.b(indexView, "");
                indexView.setVisibility(0);
            }
            DmtStatusView.a a2 = DmtStatusView.a.a(getContext());
            MtEmptyView a3 = MtEmptyView.a(getContext());
            a3.setStatus(new d.a(getContext()).a(2131232659).b(R.string.vl).c(R.string.vm).f33648a);
            a2.b(a3);
            ((DmtStatusView) b(R.id.e_c)).setBuilder(a2);
            ((DmtStatusView) b(R.id.e_c)).setStatus(-1);
            ((DmtStatusView) b(R.id.e_c)).setStatus(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Integer num) {
        if (ab_() && b(R.id.djj) != null) {
            RecyclerView recyclerView = (RecyclerView) b(R.id.djj);
            h.f.b.l.b(recyclerView, "");
            int i2 = 1;
            if (!h.f.b.l.a(recyclerView.getAdapter(), this.f97233c)) {
                if (this.f97235e != null) {
                    RecyclerView recyclerView2 = (RecyclerView) b(R.id.djj);
                    v vVar = this.f97235e;
                    if (vVar == null) {
                        h.f.b.l.b();
                    }
                    recyclerView2.c(vVar);
                }
                RecyclerView recyclerView3 = (RecyclerView) b(R.id.djj);
                h.f.b.l.b(recyclerView3, "");
                recyclerView3.setAdapter(this.f97233c);
                IndexView indexView = (IndexView) b(R.id.bnu);
                h.f.b.l.b(indexView, "");
                indexView.setVisibility(4);
            }
            if (num != null) {
                i2 = num.intValue();
            } else {
                DmtStatusView dmtStatusView = (DmtStatusView) b(R.id.e_c);
                h.f.b.l.b(dmtStatusView, "");
                if (dmtStatusView.j()) {
                    i2 = 0;
                } else {
                    DmtStatusView dmtStatusView2 = (DmtStatusView) b(R.id.e_c);
                    h.f.b.l.b(dmtStatusView2, "");
                    if (!dmtStatusView2.k()) {
                        DmtStatusView dmtStatusView3 = (DmtStatusView) b(R.id.e_c);
                        h.f.b.l.b(dmtStatusView3, "");
                        if (dmtStatusView3.l()) {
                            i2 = 2;
                        } else {
                            i2 = -1;
                        }
                    }
                }
            }
            DmtStatusView.a a2 = DmtStatusView.a.a(getContext()).a(R.string.h2z, new q(this));
            MtEmptyView a3 = MtEmptyView.a(getContext());
            a3.setStatus(new d.a(getContext()).a(2131232660).b(R.string.h36).c(R.string.h37).f33648a);
            a2.b(a3);
            ((DmtStatusView) b(R.id.e_c)).setBuilder(a2);
            ((DmtStatusView) b(R.id.e_c)).setStatus(-1);
            ((DmtStatusView) b(R.id.e_c)).setStatus(i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a8, code lost:
        if (r2 == null) goto L_0x00aa;
     */
    @Override // com.ss.android.ugc.aweme.friends.f.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r5) {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.ui.e.a(boolean):void");
    }

    public static final class l extends com.ss.android.ugc.aweme.framework.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97249a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f97250b;

        static {
            Covode.recordClassIndex(61776);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n, com.ss.android.ugc.aweme.framework.b.a
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2);
            ((IndexView) this.f97249a.b(R.id.bnu)).setRecycleViewPos(e.a(this.f97249a).k());
            com.ss.android.ugc.aweme.common.f.e.a(this.f97249a.getActivity(), this.f97249a.b(R.id.dtp));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(e eVar, View view, Context context) {
            super(context);
            this.f97249a = eVar;
            this.f97250b = view;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n, com.ss.android.ugc.aweme.framework.b.a
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            if (((float) i3) > com.bytedance.common.utility.n.b(this.f97249a.getContext(), 10.0f)) {
                com.ss.android.ugc.aweme.common.f.e.a(this.f97249a.getActivity(), this.f97249a.b(R.id.dtp));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.f.b
    public final void a(com.ss.android.ugc.aweme.search.model.h hVar, String str) {
        ArrayList arrayList;
        T t;
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(str, "");
        int i2 = 1;
        if (!(!h.f.b.l.a((Object) str, (Object) this.f97233c.f96725g))) {
            if (this.q == 0) {
                r.b("search_video_at", ac.a(new com.ss.android.ugc.aweme.app.f.d().a("search_keyword", str).a("log_pb", ac.a.f91473a.a(d().f96845a)).f66730a));
            }
            if (ab_() && !TextUtils.isEmpty(this.f97233c.f96725g)) {
                com.ss.android.ugc.aweme.common.b bVar = d().f76396h;
                if (bVar == null || (t = bVar.mData) == null || !t.a()) {
                    this.f97233c.ah_();
                } else {
                    this.f97233c.ai_();
                }
                List<? extends com.ss.android.ugc.aweme.search.model.e> list = hVar.f121536a;
                Integer num = null;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (T t2 : list) {
                        AtFriendsViewModel atFriendsViewModel = this.f97231a;
                        String userId = t2.f121524g.getUserId();
                        if (userId == null) {
                            userId = "";
                        }
                        if (!atFriendsViewModel.latestSearchUsersContain(userId)) {
                            arrayList2.add(t2);
                        }
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                com.ss.android.ugc.aweme.friends.a.b bVar2 = this.f97233c;
                bVar2.f96722d = arrayList;
                bVar2.f96723e = hVar.f121537b;
                bVar2.f96724f = hVar.f121538c;
                List<? extends com.ss.android.ugc.aweme.search.model.e> list2 = hVar.f121536a;
                if (list2 != null) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        com.ss.android.ugc.aweme.search.model.i iVar = it.next().f121524g;
                        if (iVar.getMentionBlockType() == 1 && iVar.getUserId() != null) {
                            List<String> list3 = bVar2.f96729k;
                            String userId2 = iVar.getUserId();
                            if (userId2 == null) {
                                h.f.b.l.b();
                            }
                            list3.add(userId2);
                        }
                    }
                }
                if (this.f97233c.getItemCount() != 0) {
                    i2 = -1;
                }
                a(Integer.valueOf(i2));
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("search_position", c(this.q)).a("new_sug_session_id", com.ss.android.ugc.aweme.friends.f.f96835a).a("impr_id", hVar.f121538c).a("raw_query", str);
                List<? extends com.ss.android.ugc.aweme.search.model.e> list4 = this.f97233c.f96722d;
                if (list4 != null) {
                    num = Integer.valueOf(list4.size());
                }
                r.a("trending_show", a2.a("words_num", num).f66730a);
            }
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Resources resources;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        com.ss.android.ugc.aweme.base.utils.o.a(getActivity(), androidx.core.content.b.c(view.getContext(), R.color.nd));
        com.ss.android.ugc.aweme.friends.f.f96835a = String.valueOf(System.currentTimeMillis());
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.p = arguments.getString("video_id");
            this.q = arguments.getInt("source");
        }
        this.f97232b.f96699e = this.q;
        this.f97233c.f96726h = this.q;
        com.ss.android.ugc.aweme.friends.a.b bVar = this.f97233c;
        String c2 = c(this.q);
        h.f.b.l.d(c2, "");
        bVar.f96727i = c2;
        this.f97233c.f96728j = new f(this);
        TextTitleBar textTitleBar = (TextTitleBar) b(R.id.elv);
        h.f.b.l.b(textTitleBar, "");
        textTitleBar.setUseBackIcon(true);
        TextTitleBar textTitleBar2 = (TextTitleBar) b(R.id.elv);
        h.f.b.l.b(textTitleBar2, "");
        textTitleBar2.getBackBtn().setImageResource(2131232553);
        TextTitleBar textTitleBar3 = (TextTitleBar) b(R.id.elv);
        h.f.b.l.b(textTitleBar3, "");
        textTitleBar3.getBackBtn().setOnClickListener(new g(this));
        TextTitleBar textTitleBar4 = (TextTitleBar) b(R.id.elv);
        h.f.b.l.b(textTitleBar4, "");
        textTitleBar4.getStartText().setOnClickListener(new h(this));
        if (com.ss.android.ugc.aweme.comment.d.g.b()) {
            com.bytedance.ies.dmt.ui.titlebar.a aVar = (com.bytedance.ies.dmt.ui.titlebar.a) b(R.id.elv);
            Context context = getContext();
            if (context == null || (resources = context.getResources()) == null) {
                str = null;
            } else {
                str = resources.getString(R.string.vq);
            }
            aVar.setTitle(str);
        }
        ((DmtEditText) b(R.id.dtp)).setHint(R.string.dry);
        ((DmtEditText) b(R.id.dtp)).setOnKeyListener(new i(this));
        ((DmtEditText) b(R.id.dtp)).addTextChangedListener(new j(this));
        ((ImageButton) b(R.id.a71)).setOnClickListener(new k(this));
        getContext();
        this.f97234d = new WrapLinearLayoutManager();
        RecyclerView recyclerView = (RecyclerView) b(R.id.djj);
        h.f.b.l.b(recyclerView, "");
        LinearLayoutManager linearLayoutManager = this.f97234d;
        if (linearLayoutManager == null) {
            h.f.b.l.a("linearLayoutManager");
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        ((RecyclerView) b(R.id.djj)).setHasFixedSize(true);
        ((RecyclerView) b(R.id.djj)).a(new l(this, view, view.getContext()));
        ((IndexView) b(R.id.bnu)).setIndexLetterTv((TextView) b(R.id.bnt));
        ((IndexView) b(R.id.bnu)).setOnLetterTouchListener(new m(this));
        a(0);
        this.f97231a.loadAllFriends().a(new d(this), b.i.f4826c, null);
        this.f97233c.d(true);
        this.f97233c.a(new C2340e(this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a0q, viewGroup, false);
    }

    static final class i implements View.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97245a;

        static {
            Covode.recordClassIndex(61772);
        }

        i(e eVar) {
            this.f97245a = eVar;
        }

        public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
            if (i2 != 66) {
                return false;
            }
            com.ss.android.ugc.aweme.common.f.e.a(this.f97245a.getActivity(), this.f97245a.b(R.id.dtp));
            return true;
        }
    }
}

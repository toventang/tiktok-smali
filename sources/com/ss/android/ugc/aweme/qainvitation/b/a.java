package com.ss.android.ugc.aweme.qainvitation.b;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qainvitation.b.a.b;
import com.ss.android.ugc.aweme.qainvitation.b.a.c;
import com.ss.android.ugc.aweme.qainvitation.b.b;
import com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.utils.fe;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.views.MultiAvatarView;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class a extends ConstraintLayout implements com.ss.android.ugc.aweme.qainvitation.b.b.b {

    /* renamed from: l  reason: collision with root package name */
    public static final C3053a f118957l = new C3053a((byte) 0);
    private final Activity A;
    private final String B;
    private final String C;
    private final com.ss.android.ugc.aweme.qainvitation.e.e D;
    private final Long E;
    private final Long F;
    private final List<IMUser> G;
    private SparseArray H;

    /* renamed from: g  reason: collision with root package name */
    public final b f118958g;

    /* renamed from: h  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.qainvitation.b.a.a f118959h;

    /* renamed from: i  reason: collision with root package name */
    public final c f118960i;

    /* renamed from: j  reason: collision with root package name */
    public final b f118961j;

    /* renamed from: k  reason: collision with root package name */
    public final h.f.a.b<List<? extends IMUser>, z> f118962k;

    /* renamed from: m  reason: collision with root package name */
    private final IQAInvitationService f118963m;
    private final f.a.b.a n;
    private LinearLayoutManager o;
    private final h.h p;
    private final h.h q;
    private h.f.a.b<? super b.a.C3062a, z> r;
    private h.f.a.b<? super com.ss.android.ugc.aweme.qainvitation.e.a, z> s;
    private h.f.a.b<? super List<? extends IMUser>, z> t;
    private h.f.a.a<z> u;
    private h.f.a.b<? super List<? extends IMUser>, z> v;
    private final int w;
    private final TuxStatusView.c x;
    private final TuxStatusView.c y;
    private final TuxStatusView.c z;

    static {
        Covode.recordClassIndex(77283);
    }

    private final String getSourceFrom() {
        return "at_user";
    }

    public final View d(int i2) {
        if (this.H == null) {
            this.H = new SparseArray();
        }
        View view = (View) this.H.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.H.put(i2, findViewById);
        return findViewById;
    }

    public final HashSet<String> getFetchedUidSet() {
        return (HashSet) this.p.getValue();
    }

    public final com.ss.android.ugc.aweme.qainvitation.b.b.a getSummonFriendSearchPresenter() {
        return (com.ss.android.ugc.aweme.qainvitation.b.b.a) this.q.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$a  reason: collision with other inner class name */
    public static final class C3053a {
        static {
            Covode.recordClassIndex(77284);
        }

        private C3053a() {
        }

        public /* synthetic */ C3053a(byte b2) {
            this();
        }
    }

    public final Activity getActivity() {
        return this.A;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.qainvitation.b.b$a$a, h.z>, h.f.a.b<com.ss.android.ugc.aweme.qainvitation.b.b$a$a, h.z> */
    public final h.f.a.b<b.a.C3062a, z> getAllContactsObserver() {
        return this.r;
    }

    public final f.a.b.a getCompositeDisposable() {
        return this.n;
    }

    public final String getEnterFrom() {
        return this.C;
    }

    public final String getEnterMethod() {
        return this.B;
    }

    public final h.f.a.a<z> getHideKeyboardObserver() {
        return this.u;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.qainvitation.e.a, h.z>, h.f.a.b<com.ss.android.ugc.aweme.qainvitation.e.a, h.z> */
    public final h.f.a.b<com.ss.android.ugc.aweme.qainvitation.e.a, z> getInviteUsersObserver() {
        return this.s;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, h.z>, h.f.a.b<java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, h.z> */
    public final h.f.a.b<List<? extends IMUser>, z> getInviteeListObserver() {
        return this.t;
    }

    public final List<IMUser> getPreviousSelectedUsers() {
        return this.G;
    }

    public final IQAInvitationService getQaInviteService() {
        return this.f118963m;
    }

    public final Long getQuestionId() {
        return this.E;
    }

    public final Long getQuestionUserId() {
        return this.F;
    }

    public final com.ss.android.ugc.aweme.qainvitation.e.e getRequestType() {
        return this.D;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, h.z>, h.f.a.b<java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, h.z> */
    public final h.f.a.b<List<? extends IMUser>, z> getSearchObserver() {
        return this.v;
    }

    public final TuxStatusView.c getTuxStatusErrorView() {
        return this.x;
    }

    static final class c extends h.f.b.m implements h.f.a.a<HashSet<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f118987a = new c();

        static {
            Covode.recordClassIndex(77286);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashSet<String> invoke() {
            return new HashSet();
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.qainvitation.b.b.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f119020a = new q();

        static {
            Covode.recordClassIndex(77302);
        }

        q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.qainvitation.b.b.d invoke() {
            return new com.ss.android.ugc.aweme.qainvitation.b.b.d();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(77287);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            KeyboardUtils.c(this.this$0.d(R.id.dtp));
            return z.f158842a;
        }
    }

    private final void f() {
        RecyclerView recyclerView = (RecyclerView) d(R.id.djj);
        if (recyclerView != null) {
            recyclerView.setVisibility(4);
        }
        TuxStatusView tuxStatusView = (TuxStatusView) d(R.id.e_c);
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(0);
        }
    }

    private final void g() {
        RecyclerView recyclerView = (RecyclerView) d(R.id.djj);
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        TuxStatusView tuxStatusView = (TuxStatusView) d(R.id.e_c);
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(8);
        }
    }

    public final com.ss.android.ugc.aweme.search.model.g c() {
        return new com.ss.android.ugc.aweme.search.model.g(5, null, this.f118960i.f118992e, getSourceFrom(), 20, h.a.n.k(getFetchedUidSet()));
    }

    @Override // com.ss.android.ugc.aweme.qainvitation.b.b.b
    public final void e() {
        if (isAttachedToWindow()) {
            if (this.f118960i.getItemCount() == 0) {
                c(1);
            }
            com.ss.android.ugc.aweme.common.f.e.a(this.A, d(R.id.dtp));
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.D != com.ss.android.ugc.aweme.qainvitation.e.e.NEW_QUESTION) {
            this.f118958g.f119030i.clear();
        }
        this.n.dispose();
    }

    static final class l implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f119014a;

        static {
            Covode.recordClassIndex(77296);
        }

        l(a aVar) {
            this.f119014a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.common.a.h.a
        public final void l() {
            this.f119014a.getFetchedUidSet().size();
            this.f119014a.f118960i.ag_();
            this.f119014a.getSummonFriendSearchPresenter().a(false, this.f119014a.c());
        }
    }

    @Override // com.ss.android.ugc.aweme.qainvitation.b.b.b
    public final void d() {
        if (isAttachedToWindow() && this.f118960i.getItemCount() == 0) {
            c(0);
        }
    }

    public final void b() {
        Context context = getContext();
        h.f.b.l.b(context, "");
        if (!fe.a(context)) {
            b(2);
            return;
        }
        b(0);
        ArrayList arrayList = h.a.z.INSTANCE;
        List<IMUser> list = this.G;
        if (list != null && (!list.isEmpty())) {
            b bVar = this.f118958g;
            List<IMUser> g2 = h.a.n.g((Collection) this.G);
            h.f.b.l.d(g2, "");
            bVar.f119030i = g2;
            List<IMUser> list2 = this.G;
            ArrayList arrayList2 = new ArrayList();
            for (T t2 : list2) {
                if (t2.getIsUserNotInAllFriends()) {
                    arrayList2.add(t2);
                }
            }
            arrayList = arrayList2;
            a(true);
            this.f118961j.a(this.f118958g.f119030i);
            this.f118961j.notifyDataSetChanged();
        }
        b bVar2 = this.f118958g;
        h.f.b.l.d(arrayList, "");
        t a2 = t.a(new b.c(bVar2, arrayList)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        h.f.b.l.b(a2, "");
        this.n.a(a2.d(new g(this)));
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        long j2;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        h.f.b.l.b(parent, "");
        if (parent.getParent() != null) {
            ViewParent parent2 = getParent();
            h.f.b.l.b(parent2, "");
            ViewParent parent3 = parent2.getParent();
            Objects.requireNonNull(parent3, "null cannot be cast to non-null type android.view.ViewGroup");
            View findViewById = ((ViewGroup) parent3).findViewById(R.id.e2o);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            b bVar = this.f118958g;
            String str = this.B;
            String str2 = this.C;
            Long l2 = this.E;
            long j3 = 0;
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = 0;
            }
            Long l3 = this.F;
            if (l3 != null) {
                j3 = l3.longValue();
            }
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            bVar.f119025d = str;
            bVar.f119026e = str2;
            bVar.f119027f = j2;
            bVar.f119028g = j3;
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            ((TuxStatusView) d(R.id.e_c)).setTopMargin(TypedValue.applyDimension(1, 150.0f, system.getDisplayMetrics()));
            RecyclerView recyclerView = (RecyclerView) d(R.id.de8);
            recyclerView.getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            int i2 = 0;
            linearLayoutManager.b(0);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(this.f118961j);
            ((TuxButton) d(R.id.yt)).setOnClickListener(new j(this));
            com.ss.android.ugc.aweme.qainvitation.b.b.e.f119076a = String.valueOf(System.currentTimeMillis());
            ((DmtEditText) d(R.id.dtp)).setOnKeyListener(new m(this));
            ((DmtEditText) d(R.id.dtp)).setOnClickListener(new n(this));
            ((DmtEditText) d(R.id.dtp)).addTextChangedListener(new o(this));
            ((TuxIconView) d(R.id.a71)).setOnClickListener(new p(this));
            getContext();
            this.o = new LinearLayoutManager();
            RecyclerView recyclerView2 = (RecyclerView) d(R.id.djj);
            h.f.b.l.b(recyclerView2, "");
            LinearLayoutManager linearLayoutManager2 = this.o;
            if (linearLayoutManager2 == null) {
                h.f.b.l.a("linearLayoutManager");
            }
            recyclerView2.setLayoutManager(linearLayoutManager2);
            ((RecyclerView) d(R.id.djj)).setHasFixedSize(true);
            ((RecyclerView) d(R.id.djj)).a(new k(this, getContext()));
            this.f118960i.d(true);
            this.f118960i.a(new l(this));
            b();
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.C).a("enter_method", this.B);
            List<IMUser> list = this.G;
            if (list != null) {
                i2 = list.size();
            }
            com.ss.android.ugc.aweme.common.r.a("enter_qa_invite_panel", a2.a("selected_invitee_cnt", i2).f66730a);
        }
    }

    public static final class o extends com.ss.android.ugc.aweme.base.ui.o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f119017a;

        static {
            Covode.recordClassIndex(77299);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        o(a aVar) {
            this.f119017a = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$o$a  reason: collision with other inner class name */
        static final class C3061a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o f119018a;

            static {
                Covode.recordClassIndex(77300);
            }

            C3061a(o oVar) {
                this.f119018a = oVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                this.f119018a.f119017a.getSearchObserver().invoke(obj);
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
            TuxIconView tuxIconView = (TuxIconView) this.f119017a.d(R.id.a71);
            h.f.b.l.b(tuxIconView, "");
            if (tuxIconView.getVisibility() != i2) {
                if (i2 == 8) {
                    a aVar = this.f119017a;
                    if (aVar.f118959h.getItemCount() == 0) {
                        i3 = 1;
                    } else {
                        i3 = -1;
                    }
                    aVar.b(i3);
                }
                TuxIconView tuxIconView2 = (TuxIconView) this.f119017a.d(R.id.a71);
                h.f.b.l.b(tuxIconView2, "");
                tuxIconView2.setVisibility(i2);
            }
            String obj = editable.toString();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            String obj2 = h.m.p.b((CharSequence) obj).toString();
            if (!h.f.b.l.a((Object) this.f119017a.f118960i.f118992e, (Object) obj2)) {
                c cVar = this.f119017a.f118960i;
                h.f.b.l.d(obj2, "");
                cVar.f118992e = obj2;
                if (obj2.length() > 0) {
                    Context context = this.f119017a.getContext();
                    h.f.b.l.b(context, "");
                    if (!fe.a(context)) {
                        this.f119017a.c(2);
                        return;
                    }
                    if (!this.f119017a.getSummonFriendSearchPresenter().a()) {
                        this.f119017a.getSummonFriendSearchPresenter().a(this.f119017a);
                    }
                    if (this.f119017a.f118959h.getItemCount() == 0) {
                        this.f119017a.c(0);
                    }
                    this.f119017a.getFetchedUidSet().size();
                    List g2 = h.a.n.g((Collection) this.f119017a.f118959h.f118966c);
                    if (true ^ this.f119017a.f118958g.f119031j.f119035a.isEmpty()) {
                        g2.removeAll(this.f119017a.f118958g.f119031j.f119035a);
                    }
                    b bVar = this.f119017a.f118958g;
                    h.f.b.l.d(obj2, "");
                    h.f.b.l.d(g2, "");
                    t a2 = t.a(new b.d(bVar, obj2, g2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
                    h.f.b.l.b(a2, "");
                    this.f119017a.getCompositeDisposable().a(a2.d(new C3061a(this)));
                }
            }
        }
    }

    public final void setAllContactsObserver(h.f.a.b<? super b.a.C3062a, z> bVar) {
        h.f.b.l.d(bVar, "");
        this.r = bVar;
    }

    public final void setHideKeyboardObserver(h.f.a.a<z> aVar) {
        h.f.b.l.d(aVar, "");
        this.u = aVar;
    }

    public final void setInviteUsersObserver(h.f.a.b<? super com.ss.android.ugc.aweme.qainvitation.e.a, z> bVar) {
        h.f.b.l.d(bVar, "");
        this.s = bVar;
    }

    public final void setInviteeListObserver(h.f.a.b<? super List<? extends IMUser>, z> bVar) {
        h.f.b.l.d(bVar, "");
        this.t = bVar;
    }

    public final void setSearchObserver(h.f.a.b<? super List<? extends IMUser>, z> bVar) {
        h.f.b.l.d(bVar, "");
        this.v = bVar;
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f119011a;

        static {
            Covode.recordClassIndex(77293);
        }

        j(a aVar) {
            this.f119011a = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$j$a  reason: collision with other inner class name */
        static final class C3060a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f119012a;

            static {
                Covode.recordClassIndex(77294);
            }

            C3060a(j jVar) {
                this.f119012a = jVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                this.f119012a.f119011a.getInviteUsersObserver().invoke(obj);
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
        public final void onClick(android.view.View r5) {
            /*
            // Method dump skipped, instructions count: 121
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qainvitation.b.a.j.onClick(android.view.View):void");
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<List<? extends IMUser>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(77289);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends IMUser> list) {
            this.this$0.setUpInvitedCellView(list);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f119008a;

        static {
            Covode.recordClassIndex(77290);
        }

        g(a aVar) {
            this.f119008a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f119008a.getAllContactsObserver().invoke(obj);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<List<? extends IMUser>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(77291);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends IMUser> list) {
            List<? extends IMUser> list2 = list;
            if (list2 != null) {
                this.this$0.f118960i.f118988a = list2;
                this.this$0.c(-1);
                this.this$0.f118960i.notifyDataSetChanged();
                list2.size();
            } else {
                this.this$0.c(0);
            }
            this.this$0.getFetchedUidSet().clear();
            this.this$0.getSummonFriendSearchPresenter().a(true, this.this$0.c());
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f119009a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f119010b;

        static {
            Covode.recordClassIndex(77292);
        }

        i(a aVar, List list) {
            this.f119009a = aVar;
            this.f119010b = list;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f119009a.getQaInviteService().a(this.f119009a.getActivity(), this.f119009a.getEnterMethod(), this.f119009a.getEnterFrom(), this.f119009a.getQuestionId(), this.f119009a.getQuestionUserId(), this.f119010b, true);
        }
    }

    static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f119016a;

        static {
            Covode.recordClassIndex(77298);
        }

        n(a aVar) {
            this.f119016a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.common.r.a("search_qa_invitee", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f119016a.getEnterFrom()).a("enter_method", this.f119016a.getEnterMethod()).f66730a);
        }
    }

    static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f119019a;

        static {
            Covode.recordClassIndex(77301);
        }

        p(a aVar) {
            this.f119019a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((DmtEditText) this.f119019a.d(R.id.dtp)).setText("");
            ((DmtEditText) this.f119019a.d(R.id.dtp)).clearFocus();
            com.ss.android.ugc.aweme.common.f.e.a(this.f119019a.getActivity(), this.f119019a.d(R.id.dtp));
        }
    }

    static final class r extends h.f.b.m implements h.f.a.b<TuxButton, z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(77303);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(a aVar, Context context) {
            super(1);
            this.this$0 = aVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            h.f.b.l.d(tuxButton2, "");
            tuxButton2.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_tab_arrow_counter_clockwise));
            tuxButton2.setText(this.$context.getString(R.string.h35));
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.qainvitation.b.a.r.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ r f119021a;

                static {
                    Covode.recordClassIndex(77304);
                }

                {
                    this.f119021a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f119021a.this$0.b();
                }
            });
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qainvitation.e.a, z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(77288);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, Context context) {
            super(1);
            this.this$0 = aVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
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
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.qainvitation.e.a r6) {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.qainvitation.e.a r6 = (com.ss.android.ugc.aweme.qainvitation.e.a) r6
                r1 = 3000(0xbb8, double:1.482E-320)
                if (r6 == 0) goto L_0x004e
                int r0 = r6.status_code
                if (r0 != 0) goto L_0x004e
                com.bytedance.tux.g.b r3 = new com.bytedance.tux.g.b
                com.ss.android.ugc.aweme.qainvitation.b.a r0 = r5.this$0
                android.app.Activity r0 = r0.getActivity()
                r3.<init>(r0)
                r0 = 2131828648(0x7f111fa8, float:1.9290243E38)
                com.bytedance.tux.g.b r3 = r3.e(r0)
                r0 = 2131755528(0x7f100208, float:1.9141938E38)
                com.bytedance.tux.g.b r4 = r3.b(r0)
                android.content.Context r3 = r5.$context
                r0 = 2131099727(0x7f06004f, float:1.7811815E38)
                int r0 = androidx.core.content.b.c(r3, r0)
                com.bytedance.tux.g.b r0 = r4.c(r0)
                com.bytedance.tux.g.b r0 = r0.a(r1)
                r0.b()
                com.ss.android.ugc.aweme.qainvitation.b.a r0 = r5.this$0
                h.f.a.b<java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, h.z> r1 = r0.f118962k
                if (r1 == 0) goto L_0x0046
                com.ss.android.ugc.aweme.qainvitation.b.a r0 = r5.this$0
                com.ss.android.ugc.aweme.qainvitation.b.b r0 = r0.f118958g
                java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r0 = r0.f119030i
                r1.invoke(r0)
            L_0x0046:
                com.ss.android.ugc.aweme.qainvitation.b.a r0 = r5.this$0
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
            L_0x004b:
                h.z r0 = h.z.f158842a
                return r0
            L_0x004e:
                com.bytedance.tux.g.b r3 = new com.bytedance.tux.g.b
                com.ss.android.ugc.aweme.qainvitation.b.a r0 = r5.this$0
                r3.<init>(r0)
                r0 = 2131829904(0x7f112490, float:1.929279E38)
                com.bytedance.tux.g.b r0 = r3.e(r0)
                com.bytedance.tux.g.b r0 = r0.a(r1)
                r0.b()
                goto L_0x004b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qainvitation.b.a.e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public final void a(boolean z2) {
        if (d(R.id.w2) != null) {
            View d2 = d(R.id.w2);
            h.f.b.l.b(d2, "");
            ViewGroup.LayoutParams layoutParams = d2.getLayoutParams();
            if (z2) {
                Resources system = Resources.getSystem();
                h.f.b.l.a((Object) system, "");
                layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, 162.0f, system.getDisplayMetrics()));
            } else {
                Resources system2 = Resources.getSystem();
                h.f.b.l.a((Object) system2, "");
                layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, 1.0f, system2.getDisplayMetrics()));
            }
            View d3 = d(R.id.w2);
            h.f.b.l.b(d3, "");
            d3.setLayoutParams(layoutParams);
        }
    }

    public final void b(int i2) {
        RecyclerView recyclerView = (RecyclerView) d(R.id.djj);
        h.f.b.l.b(recyclerView, "");
        if (!h.f.b.l.a(recyclerView.getAdapter(), this.f118959h)) {
            RecyclerView recyclerView2 = (RecyclerView) d(R.id.djj);
            h.f.b.l.b(recyclerView2, "");
            recyclerView2.setAdapter(this.f118959h);
        }
        if (i2 == 0) {
            TuxStatusView tuxStatusView = (TuxStatusView) d(R.id.e_c);
            if (tuxStatusView != null) {
                tuxStatusView.a();
            }
            f();
        } else if (i2 == 1) {
            TuxStatusView tuxStatusView2 = (TuxStatusView) d(R.id.e_c);
            if (tuxStatusView2 != null) {
                tuxStatusView2.setStatus(this.y);
            }
            f();
        } else if (i2 != 2) {
            g();
        } else {
            TuxStatusView tuxStatusView3 = (TuxStatusView) d(R.id.e_c);
            if (tuxStatusView3 != null) {
                tuxStatusView3.setStatus(this.x);
            }
            f();
        }
    }

    public final void c(int i2) {
        RecyclerView recyclerView = (RecyclerView) d(R.id.djj);
        h.f.b.l.b(recyclerView, "");
        if (!h.f.b.l.a(recyclerView.getAdapter(), this.f118960i)) {
            RecyclerView recyclerView2 = (RecyclerView) d(R.id.djj);
            h.f.b.l.b(recyclerView2, "");
            recyclerView2.setAdapter(this.f118960i);
        }
        if (i2 == 0) {
            TuxStatusView tuxStatusView = (TuxStatusView) d(R.id.e_c);
            if (tuxStatusView != null) {
                tuxStatusView.a();
            }
            f();
        } else if (i2 == 1) {
            TuxStatusView tuxStatusView2 = (TuxStatusView) d(R.id.e_c);
            if (tuxStatusView2 != null) {
                tuxStatusView2.setStatus(this.z);
            }
            f();
        } else if (i2 != 2) {
            g();
        } else {
            TuxStatusView tuxStatusView3 = (TuxStatusView) d(R.id.e_c);
            if (tuxStatusView3 != null) {
                tuxStatusView3.setStatus(this.x);
            }
            f();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<b.a.C3062a, z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(77285);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, Context context) {
            super(1);
            this.this$0 = aVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(b.a.C3062a aVar) {
            RecyclerView.a aVar2;
            b.a.C3062a aVar3 = aVar;
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            if (aVar3 != null) {
                h.f.b.l.b(createIUserServicebyMonsterPlugin, "");
                if (createIUserServicebyMonsterPlugin.isLogin()) {
                    com.ss.android.ugc.aweme.qainvitation.b.a.a aVar4 = this.this$0.f118959h;
                    aVar4.f118964a = aVar3;
                    aVar4.f118966c = aVar3.f119040f;
                    RecyclerView recyclerView = (RecyclerView) this.this$0.d(R.id.djj);
                    RecyclerView.a aVar5 = null;
                    if (recyclerView != null) {
                        aVar2 = recyclerView.getAdapter();
                    } else {
                        aVar2 = null;
                    }
                    if (aVar2 instanceof com.ss.android.ugc.aweme.qainvitation.b.a.a) {
                        if (this.this$0.f118959h.getItemCount() == 0) {
                            this.this$0.b(1);
                        } else {
                            this.this$0.b(-1);
                        }
                    }
                    this.this$0.f118959h.notifyDataSetChanged();
                    if (!this.this$0.f118958g.f119030i.isEmpty()) {
                        this.this$0.a(true);
                        String str = this.$context.getString(R.string.f4c) + " (" + this.this$0.f118958g.f119030i.size() + ')';
                        TuxButton tuxButton = (TuxButton) this.this$0.d(R.id.yt);
                        if (tuxButton != null) {
                            tuxButton.setText(str);
                        }
                    } else {
                        this.this$0.a(false);
                    }
                    RecyclerView recyclerView2 = (RecyclerView) this.this$0.d(R.id.djj);
                    if (recyclerView2 != null) {
                        aVar5 = recyclerView2.getAdapter();
                    }
                    if (aVar5 instanceof c) {
                        this.this$0.f118960i.notifyDataSetChanged();
                    }
                    this.this$0.f118961j.a(this.this$0.f118958g.f119030i);
                    this.this$0.f118961j.notifyDataSetChanged();
                    this.this$0.getInviteeListObserver().invoke(aVar3.f119039e);
                    return z.f158842a;
                }
            }
            this.this$0.b(1);
            return z.f158842a;
        }
    }

    public final void setUpInvitedCellView(List<? extends IMUser> list) {
        if (list != null) {
            View d2 = d(R.id.brk);
            if (d2 == null || d2.getVisibility() != 0) {
                List<User> b2 = com.ss.android.ugc.aweme.qainvitation.g.a.b(list);
                if (!b2.isEmpty()) {
                    MultiAvatarView multiAvatarView = (MultiAvatarView) d(R.id.cow);
                    if (multiAvatarView != null) {
                        Resources system = Resources.getSystem();
                        h.f.b.l.a((Object) system, "");
                        int a2 = h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
                        Resources system2 = Resources.getSystem();
                        h.f.b.l.a((Object) system2, "");
                        multiAvatarView.a(a2, h.g.a.a(TypedValue.applyDimension(1, 18.0f, system2.getDisplayMetrics())));
                    }
                    MultiAvatarView multiAvatarView2 = (MultiAvatarView) d(R.id.cow);
                    if (multiAvatarView2 != null) {
                        multiAvatarView2.a(b2, 0);
                    }
                    if (!list.isEmpty()) {
                        View d3 = d(R.id.brk);
                        if (d3 != null) {
                            d3.setVisibility(0);
                        }
                        View d4 = d(R.id.brk);
                        if (d4 != null) {
                            d4.setOnClickListener(new i(this, b2));
                        }
                        String valueOf = String.valueOf(list.size());
                        if (gb.a(getContext())) {
                            TuxTextView tuxTextView = (TuxTextView) d(R.id.brg);
                            h.f.b.l.b(tuxTextView, "");
                            tuxTextView.setText(getContext().getString(R.string.f4j, String.valueOf(this.w), valueOf));
                            return;
                        }
                        TuxTextView tuxTextView2 = (TuxTextView) d(R.id.brg);
                        h.f.b.l.b(tuxTextView2, "");
                        tuxTextView2.setText(getContext().getString(R.string.f4j, valueOf, String.valueOf(this.w)));
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.qainvitation.b.b.b
    public final void b(boolean z2) {
        ArrayList arrayList;
        Collection<? extends String> collection;
        String userId;
        if (z2) {
            if (getFetchedUidSet().isEmpty()) {
                ((RecyclerView) d(R.id.djj)).b(0);
            }
            this.f118960i.notifyDataSetChanged();
            c cVar = this.f118960i;
            List<? extends IMUser> list = cVar.f118988a;
            ArrayList arrayList2 = null;
            if (list != null) {
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String uid = it.next().getUid();
                    if (uid != null) {
                        arrayList3.add(uid);
                    }
                }
                arrayList2 = arrayList3;
            }
            List<? extends com.ss.android.ugc.aweme.search.model.e> list2 = cVar.f118989b;
            if (list2 != null) {
                ArrayList arrayList4 = new ArrayList();
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    com.ss.android.ugc.aweme.search.model.i iVar = it2.next().f121524g;
                    if (!(iVar == null || (userId = iVar.getUserId()) == null)) {
                        arrayList4.add(userId);
                    }
                }
                arrayList = arrayList4;
            } else {
                arrayList = h.a.z.INSTANCE;
            }
            if (arrayList2 != null) {
                collection = h.a.n.d((Collection) arrayList2, arrayList);
            } else {
                collection = h.a.z.INSTANCE;
            }
            getFetchedUidSet().addAll(collection);
        }
    }

    public static final class k extends com.ss.android.ugc.aweme.framework.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f119013a;

        static {
            Covode.recordClassIndex(77295);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar, Context context) {
            super(context);
            this.f119013a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n, com.ss.android.ugc.aweme.framework.b.a
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2);
            com.ss.android.ugc.aweme.common.f.e.a(this.f119013a.getActivity(), this.f119013a.d(R.id.dtp));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n, com.ss.android.ugc.aweme.framework.b.a
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            if (((float) i3) > com.bytedance.common.utility.n.b(this.f119013a.getContext(), 10.0f)) {
                com.ss.android.ugc.aweme.common.f.e.a(this.f119013a.getActivity(), this.f119013a.d(R.id.dtp));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.qainvitation.b.b.b
    public final void a(com.ss.android.ugc.aweme.search.model.h hVar, String str) {
        ArrayList arrayList;
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(str, "");
        int i2 = 1;
        if (!(!h.f.b.l.a((Object) str, (Object) this.f118960i.f118992e)) && isAttachedToWindow() && !TextUtils.isEmpty(this.f118960i.f118992e)) {
            if (getSummonFriendSearchPresenter().d()) {
                this.f118960i.ai_();
            } else {
                this.f118960i.ah_();
            }
            List<? extends com.ss.android.ugc.aweme.search.model.e> list = hVar.f121536a;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (T t2 : list) {
                    b bVar = this.f118958g;
                    String userId = t2.f121524g.getUserId();
                    if (userId == null) {
                        userId = "";
                    }
                    if (!bVar.a(userId)) {
                        arrayList2.add(t2);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            c cVar = this.f118960i;
            cVar.f118989b = arrayList;
            cVar.f118990c = hVar.f121537b;
            cVar.f118991d = hVar.f121538c;
            if (this.f118960i.getItemCount() != 0) {
                i2 = -1;
            }
            c(i2);
        }
    }

    static final class m implements View.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f119015a;

        static {
            Covode.recordClassIndex(77297);
        }

        m(a aVar) {
            this.f119015a = aVar;
        }

        public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
            if (i2 != 66) {
                return false;
            }
            com.ss.android.ugc.aweme.common.f.e.a(this.f119015a.getActivity(), this.f119015a.d(R.id.dtp));
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: h.f.a.b<? super java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Activity activity, String str, String str2, com.ss.android.ugc.aweme.qainvitation.e.e eVar, Long l2, Long l3, List<? extends IMUser> list, h.f.a.b<? super List<? extends IMUser>, z> bVar, Context context) {
        super(context, null, 0);
        h.f.b.l.d(activity, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(context, "");
        MethodCollector.i(5757);
        this.A = activity;
        this.B = str;
        this.C = str2;
        this.D = eVar;
        this.E = l2;
        this.F = l3;
        this.G = list;
        this.f118962k = bVar;
        IQAInvitationService b2 = QAInvitationService.b();
        h.f.b.l.b(b2, "");
        this.f118963m = b2;
        f.a.b.a aVar = new f.a.b.a();
        this.n = aVar;
        this.p = h.i.a((h.f.a.a) c.f118987a);
        this.q = h.i.a((h.f.a.a) q.f119020a);
        LayoutInflater.from(context).inflate(R.layout.aro, this);
        this.r = new b(this, context);
        this.s = new e(this, context);
        this.t = new f(this);
        this.u = new d(this);
        this.v = new h(this);
        b bVar2 = new b(aVar, this.r, this.u);
        this.f118958g = bVar2;
        this.w = bVar2.b();
        this.f118959h = new com.ss.android.ugc.aweme.qainvitation.b.a.a(bVar2);
        this.f118960i = new c(bVar2);
        this.f118961j = new com.ss.android.ugc.aweme.qainvitation.b.a.b(bVar2);
        TuxStatusView.c a2 = com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c());
        a2.f45362j = new r(this, context);
        this.x = a2;
        TuxStatusView.c b3 = com.ss.android.ugc.aweme.tux.a.g.a.b(new TuxStatusView.c());
        String string = context.getString(R.string.f4r);
        h.f.b.l.b(string, "");
        TuxStatusView.c a3 = b3.a(string);
        String string2 = context.getString(R.string.f4q);
        h.f.b.l.b(string2, "");
        this.y = a3.a((CharSequence) string2);
        TuxStatusView.c cVar = new TuxStatusView.c();
        String string3 = context.getString(R.string.chu);
        h.f.b.l.b(string3, "");
        cVar.a((CharSequence) string3);
        this.z = cVar;
        MethodCollector.o(5757);
    }

    public /* synthetic */ a(Activity activity, String str, String str2, com.ss.android.ugc.aweme.qainvitation.e.e eVar, Long l2, Long l3, List list, h.f.a.b bVar, Context context, byte b2) {
        this(activity, str, str2, eVar, l2, l3, list, bVar, context);
    }
}

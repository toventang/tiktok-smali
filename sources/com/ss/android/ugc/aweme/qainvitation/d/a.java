package com.ss.android.ugc.aweme.qainvitation.d;

import android.content.Context;
import android.util.SparseArray;
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
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qainvitation.d.c;
import com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;
import java.util.Objects;

public final class a extends ConstraintLayout {

    /* renamed from: i  reason: collision with root package name */
    public static final C3071a f119095i = new C3071a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    public final c f119096g;

    /* renamed from: h  reason: collision with root package name */
    final b f119097h;

    /* renamed from: j  reason: collision with root package name */
    private final f.a.b.a f119098j;

    /* renamed from: k  reason: collision with root package name */
    private final IQAInvitationService f119099k;

    /* renamed from: l  reason: collision with root package name */
    private h.f.a.b<? super List<? extends IMUser>, z> f119100l;

    /* renamed from: m  reason: collision with root package name */
    private final TuxStatusView.c f119101m;
    private String n;
    private String o;
    private long p;
    private long q;
    private List<? extends User> r;
    private SparseArray s;

    static {
        Covode.recordClassIndex(77348);
    }

    public final View c(int i2) {
        if (this.s == null) {
            this.s = new SparseArray();
        }
        View view = (View) this.s.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.s.put(i2, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.d.a$a  reason: collision with other inner class name */
    public static final class C3071a {
        static {
            Covode.recordClassIndex(77350);
        }

        private C3071a() {
        }

        public /* synthetic */ C3071a(byte b2) {
            this();
        }
    }

    public final b getAdapter() {
        return this.f119097h;
    }

    public final f.a.b.a getCompositeDisposable() {
        return this.f119098j;
    }

    public final String getEnterFrom() {
        return this.o;
    }

    public final String getEnterMethod() {
        return this.n;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, h.z>, h.f.a.b<java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, h.z> */
    public final h.f.a.b<List<? extends IMUser>, z> getInvitedUsersObserver() {
        return this.f119100l;
    }

    public final IQAInvitationService getQaInviteService() {
        return this.f119099k;
    }

    public final long getQuestionId() {
        return this.p;
    }

    public final long getQuestionUserId() {
        return this.q;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, java.util.List<com.ss.android.ugc.aweme.profile.model.User> */
    public final List<User> getUsers() {
        return this.r;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        l.b(parent, "");
        if (parent.getParent() != null) {
            ViewParent parent2 = getParent();
            l.b(parent2, "");
            ViewParent parent3 = parent2.getParent();
            Objects.requireNonNull(parent3, "null cannot be cast to non-null type android.view.ViewGroup");
            View findViewById = ((ViewGroup) parent3).findViewById(R.id.e2o);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public final void setQuestionId(long j2) {
        this.p = j2;
    }

    public final void setQuestionUserId(long j2) {
        this.q = j2;
    }

    public final void setEnterFrom(String str) {
        l.d(str, "");
        this.o = str;
    }

    public final void setEnterMethod(String str) {
        l.d(str, "");
        this.n = str;
    }

    public final void setInvitedUsersObserver(h.f.a.b<? super List<? extends IMUser>, z> bVar) {
        l.d(bVar, "");
        this.f119100l = bVar;
    }

    public final void setUsers(List<? extends User> list) {
        l.d(list, "");
        this.r = list;
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f119103a;

        static {
            Covode.recordClassIndex(77351);
        }

        b(a aVar) {
            this.f119103a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            h.f.a.b<List<? extends IMUser>, z> invitedUsersObserver = this.f119103a.getInvitedUsersObserver();
            l.b(obj, "");
            invitedUsersObserver.invoke(obj);
        }
    }

    static final class d extends m implements h.f.a.b<TuxButton, z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(77353);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, Context context) {
            super(1);
            this.this$0 = aVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            l.d(tuxButton2, "");
            tuxButton2.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_tab_arrow_counter_clockwise));
            tuxButton2.setText(this.$context.getString(R.string.h35));
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.qainvitation.d.a.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f119104a;

                static {
                    Covode.recordClassIndex(77354);
                }

                {
                    this.f119104a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f119104a.this$0.a(true);
                }
            });
            return z.f158842a;
        }
    }

    public final void a(boolean z) {
        if (z) {
            b(0);
        }
        t a2 = t.a(new c.b(this.f119096g)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        l.b(a2, "");
        this.f119098j.a(a2.d(new b(this)));
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        TuxStatusView tuxStatusView;
        if (i2 == 0) {
            TuxStatusView tuxStatusView2 = (TuxStatusView) c(R.id.e_c);
            if (tuxStatusView2 != null) {
                tuxStatusView2.a();
            }
        } else if (i2 == 2 && (tuxStatusView = (TuxStatusView) c(R.id.e_c)) != null) {
            tuxStatusView.setStatus(this.f119101m);
        }
        RecyclerView recyclerView = (RecyclerView) c(R.id.djj);
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        TuxStatusView tuxStatusView3 = (TuxStatusView) c(R.id.e_c);
        if (tuxStatusView3 != null) {
            tuxStatusView3.setVisibility(0);
        }
    }

    static final class c extends m implements h.f.a.b<List<? extends IMUser>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(77352);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends IMUser> list) {
            List<? extends IMUser> list2 = list;
            l.d(list2, "");
            a aVar = this.this$0;
            if (aVar.getContext() != null) {
                RecyclerView recyclerView = (RecyclerView) aVar.c(R.id.djj);
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                TuxStatusView tuxStatusView = (TuxStatusView) aVar.c(R.id.e_c);
                if (tuxStatusView != null) {
                    tuxStatusView.setVisibility(8);
                }
                if (list2.isEmpty()) {
                    aVar.b(2);
                } else {
                    aVar.f119097h.ai_();
                    aVar.f119097h.a(list2);
                    aVar.f119097h.notifyDataSetChanged();
                }
            }
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(String str, String str2, long j2, long j3, List<? extends User> list, Context context) {
        super(context, null, 0);
        l.d(str, "");
        l.d(str2, "");
        l.d(list, "");
        l.d(context, "");
        MethodCollector.i(5737);
        this.n = str;
        this.o = str2;
        this.p = j2;
        this.q = j3;
        this.r = list;
        f.a.b.a aVar = new f.a.b.a();
        this.f119098j = aVar;
        c cVar = new c(aVar);
        this.f119096g = cVar;
        IQAInvitationService b2 = QAInvitationService.b();
        l.b(b2, "");
        this.f119099k = b2;
        b bVar = new b(h.a.z.INSTANCE);
        this.f119097h = bVar;
        this.f119100l = new c(this);
        TuxStatusView.c cVar2 = new TuxStatusView.c();
        String string = context.getString(R.string.g21);
        l.b(string, "");
        cVar2.a((CharSequence) string);
        cVar2.f45362j = new d(this, context);
        this.f119101m = cVar2;
        View inflate = LayoutInflater.from(context).inflate(R.layout.aru, this);
        l.b(inflate, "");
        List<IMUser> a2 = b2.a(this.r);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.djj);
        l.b(recyclerView, "");
        recyclerView.setLayoutManager(linearLayoutManager);
        ((RecyclerView) inflate.findViewById(R.id.djj)).setHasFixedSize(true);
        RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.djj);
        l.b(recyclerView2, "");
        recyclerView2.setAdapter(bVar);
        bVar.a(a2);
        bVar.notifyDataSetChanged();
        r.a("enter_qa_invited_you_users_panel", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.o).a("enter_method", this.n).a("question_id", this.p).a("question_user_id", this.q).a("invitee_count", a2.size()).f66730a);
        String str3 = this.n;
        String str4 = this.o;
        long j4 = this.p;
        long j5 = this.q;
        l.d(str3, "");
        l.d(str4, "");
        l.d(a2, "");
        cVar.f119127a = str3;
        cVar.f119128b = str4;
        cVar.f119129c = j4;
        cVar.f119130d = j5;
        cVar.f119131e = a2;
        a(true);
        bVar.a(new h.a(this) {
            /* class com.ss.android.ugc.aweme.qainvitation.d.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f119102a;

            static {
                Covode.recordClassIndex(77349);
            }

            {
                this.f119102a = r1;
            }

            @Override // com.ss.android.ugc.aweme.common.a.h.a
            public final void l() {
                if (this.f119102a.f119096g.f119132f) {
                    this.f119102a.getAdapter().ag_();
                    this.f119102a.a(false);
                }
            }
        });
        MethodCollector.o(5737);
    }

    public /* synthetic */ a(String str, String str2, long j2, long j3, List list, Context context, byte b2) {
        this(str, str2, j2, j3, list, context);
    }
}

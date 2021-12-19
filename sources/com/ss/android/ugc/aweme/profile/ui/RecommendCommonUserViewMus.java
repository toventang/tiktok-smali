package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ab;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.ui.common.d.e;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.d.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.a.d;
import com.ss.android.ugc.aweme.friends.model.RecommendContact;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.ae;
import com.ss.android.ugc.aweme.profile.experiment.k;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.cv;
import com.ss.android.ugc.aweme.profile.ui.cw;
import com.ss.android.ugc.aweme.profile.ui.widget.i;
import com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM;
import com.ss.android.ugc.aweme.utils.fo;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class RecommendCommonUserViewMus extends RelativeLayout {

    /* renamed from: j  reason: collision with root package name */
    public static final int f116797j = 0;

    /* renamed from: k  reason: collision with root package name */
    public static final int f116798k = 1;

    /* renamed from: l  reason: collision with root package name */
    public static final int f116799l = 2;

    /* renamed from: m  reason: collision with root package name */
    public static final int f116800m = 3;
    public static final a n = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public View f116801a;

    /* renamed from: b  reason: collision with root package name */
    public TuxTextView f116802b;

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView f116803c;

    /* renamed from: d  reason: collision with root package name */
    public View f116804d;

    /* renamed from: e  reason: collision with root package name */
    public i f116805e;

    /* renamed from: f  reason: collision with root package name */
    public String f116806f;

    /* renamed from: g  reason: collision with root package name */
    public String f116807g;

    /* renamed from: h  reason: collision with root package name */
    public b f116808h;

    /* renamed from: i  reason: collision with root package name */
    public UserProfileRecommendUserVM f116809i;
    private LinearLayout o;
    private TuxIconView p;
    private List<? extends User> q;
    private int r;

    public interface b {
        static {
            Covode.recordClassIndex(75448);
        }

        void a();
    }

    public RecommendCommonUserViewMus(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75447);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final UserProfileRecommendUserVM getViewModel() {
        return this.f116809i;
    }

    public final Map<String, Integer> getPosInApiListMap() {
        return getAdapter().f117435h;
    }

    public final List<User> getData() {
        return getAdapter().e();
    }

    public final float getViewHeightFromInnerAdapter() {
        return getAdapter().n();
    }

    static {
        Covode.recordClassIndex(75437);
    }

    public final void a() {
        new com.bytedance.tux.g.b(this).e(R.string.gj4).b();
    }

    public final i getAdapter() {
        if (this.f116805e == null) {
            Context context = getContext();
            l.b(context, "");
            this.f116805e = new i(context);
        }
        return this.f116805e;
    }

    public final void setViewModel(UserProfileRecommendUserVM userProfileRecommendUserVM) {
        this.f116809i = userProfileRecommendUserVM;
    }

    public final void setSeeAllListener(b bVar) {
        l.d(bVar, "");
        this.f116808h = bVar;
    }

    public final void setOnItemOperationListener(i.b bVar) {
        l.d(bVar, "");
        i adapter = getAdapter();
        l.d(bVar, "");
        adapter.f117428a = bVar;
    }

    public final void setOnViewAttachedToWindowListener(c<cw> cVar) {
        l.d(cVar, "");
        i adapter = getAdapter();
        l.d(cVar, "");
        adapter.f117429b = cVar;
    }

    public final void setPageType(int i2) {
        this.r = i2;
        getAdapter().f117434g = i2;
        getAdapter().d(false);
        this.f116802b.setText(R.string.ey_);
    }

    private /* synthetic */ RecommendCommonUserViewMus(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RecommendCommonUserViewMus(final Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(8965);
        this.f116809i = null;
        View a2 = com.a.b.a.a(context, R.layout.aqp, this, true);
        l.b(a2, "");
        this.f116801a = a2;
        View findViewById = a2.findViewById(R.id.djs);
        l.b(findViewById, "");
        this.f116803c = (RecyclerView) findViewById;
        View findViewById2 = this.f116801a.findViewById(R.id.dp5);
        l.b(findViewById2, "");
        this.o = (LinearLayout) findViewById2;
        this.f116805e = new i(context);
        this.f116803c.setAdapter(getAdapter());
        View findViewById3 = this.f116801a.findViewById(R.id.fjg);
        l.b(findViewById3, "");
        this.f116804d = findViewById3;
        View findViewById4 = this.f116801a.findViewById(R.id.f5k);
        l.b(findViewById4, "");
        this.f116802b = (TuxTextView) findViewById4;
        View findViewById5 = this.f116801a.findViewById(R.id.bls);
        l.b(findViewById5, "");
        this.p = (TuxIconView) findViewById5;
        RecyclerView.f itemAnimator = this.f116803c.getItemAnimator();
        if (itemAnimator != null) {
            ((ab) itemAnimator).f3953m = false;
            i iVar = this.f116805e;
            AnonymousClass1 r0 = new cw.c(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ RecommendCommonUserViewMus f116810a;

                static {
                    Covode.recordClassIndex(75438);
                }

                /* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus$1$a */
                static final class a implements Runnable {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f116811a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ float f116812b;

                    static {
                        Covode.recordClassIndex(75439);
                    }

                    a(AnonymousClass1 r1, float f2) {
                        this.f116811a = r1;
                        this.f116812b = f2;
                    }

                    public final void run() {
                        RecyclerView recyclerView = this.f116811a.f116810a.f116803c;
                        float f2 = this.f116812b;
                        Resources system = Resources.getSystem();
                        l.a((Object) system, "");
                        recyclerView.a(h.g.a.a(TypedValue.applyDimension(1, f2, system.getDisplayMetrics())), 0);
                    }
                }

                @Override // com.ss.android.ugc.aweme.profile.ui.cw.c
                public final void a() {
                    float f2;
                    if (com.ss.android.ugc.aweme.profile.experiment.i.a()) {
                        f2 = 164.0f;
                    } else {
                        f2 = 134.0f;
                    }
                    this.f116810a.f116803c.b(50, 0);
                    new Handler().postDelayed(new a(this, f2), 600);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f116810a = r1;
                }
            };
            l.d(r0, "");
            iVar.f117430c = r0;
            this.f116803c.setItemAnimator(new androidx.recyclerview.widget.i() {
                /* class com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(75440);
                }

                @Override // androidx.recyclerview.widget.i, androidx.recyclerview.widget.ab
                public final boolean a(RecyclerView.ViewHolder viewHolder) {
                    this.f3832k = 250;
                    return super.a(viewHolder);
                }
            });
            this.f116805e.f117431d = new cv.a(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ RecommendCommonUserViewMus f116813a;

                static {
                    Covode.recordClassIndex(75441);
                }

                /* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus$3$a */
                static final class a implements Runnable {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass3 f116814a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ int f116815b;

                    static {
                        Covode.recordClassIndex(75442);
                    }

                    a(AnonymousClass3 r1, int i2) {
                        this.f116814a = r1;
                        this.f116815b = i2;
                    }

                    public final void run() {
                        RecyclerView.f itemAnimator = this.f116814a.f116813a.f116803c.getItemAnimator();
                        if (itemAnimator != null) {
                            l.b(itemAnimator, "");
                            itemAnimator.f3832k = 0;
                        }
                        this.f116814a.f116813a.f116803c.b(this.f116815b);
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f116813a = r1;
                }

                @Override // com.ss.android.ugc.aweme.profile.ui.cv.a
                public final void a(int i2) {
                    this.f116813a.f116801a.post(new a(this, i2));
                }
            };
            RecyclerView recyclerView = this.f116803c;
            recyclerView.setPadding((int) n.b(recyclerView.getContext(), 16.0f), 0, 0, 0);
            this.f116803c.setClipToPadding(false);
            this.f116803c.b(new d(0, (int) n.b(context, 4.0f), 0));
            this.f116803c.setLayoutManager(new WrapLinearLayoutManager(0));
            new fo(this.f116803c, new fo.a(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus.AnonymousClass4 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ RecommendCommonUserViewMus f116816a;

                static {
                    Covode.recordClassIndex(75443);
                }

                /* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus$4$a */
                static final class a implements Runnable {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ User f116817a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass4 f116818b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ fo f116819c;

                    static {
                        Covode.recordClassIndex(75444);
                    }

                    a(User user, AnonymousClass4 r2, fo foVar) {
                        this.f116817a = user;
                        this.f116818b = r2;
                        this.f116819c = foVar;
                    }

                    public final void run() {
                        u a2 = new u().a("others_homepage");
                        a2.f109596a = u.c.CARD;
                        a2.f109597b = u.a.SHOW;
                        a2.a(this.f116817a).p("top").s(this.f116818b.f116816a.f116806f).t(this.f116818b.f116816a.f116807g).f();
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f116816a = r1;
                }

                @Override // com.ss.android.ugc.aweme.utils.fo.a
                public final void a(int i2, fo foVar) {
                    l.d(foVar, "");
                    User user = (User) this.f116816a.getAdapter().e().get(i2);
                    if (user != null && !(user instanceof RecommendContact)) {
                        String uid = user.getUid();
                        l.b(uid, "");
                        foVar.a(uid, new a(user, this, foVar));
                    }
                }
            });
            if (com.ss.android.ugc.aweme.recommend.users.b.f120122a.f()) {
                this.o.setVisibility(0);
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                if (g2.isLogin()) {
                    this.p.setVisibility(0);
                } else {
                    this.p.setVisibility(8);
                }
            } else {
                this.o.setVisibility(8);
                this.p.setVisibility(8);
            }
            this.o.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus.AnonymousClass5 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ RecommendCommonUserViewMus f116820a;

                static {
                    Covode.recordClassIndex(75445);
                }

                {
                    this.f116820a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    b bVar = this.f116820a.f116808h;
                    if (bVar != null) {
                        bVar.a();
                    }
                    r.a("click_see_all", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "others_homepage").f66730a);
                }
            });
            this.p.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(75446);
                }

                public final void onClick(View view) {
                    Activity a2;
                    ClickAgent.onClick(view);
                    Context context = context;
                    if (!(context == null || (a2 = e.a(context)) == null)) {
                        ae.f115954a.a(a2, "others_homepage", "others_homepage");
                    }
                    r.a("click_suggested_account_information", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "others_homepage").f66730a);
                }
            });
            MethodCollector.o(8965);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        MethodCollector.o(8965);
        throw nullPointerException;
    }

    public final void a(List<? extends User> list, String str, String str2, boolean z) {
        if (list == null || list.isEmpty()) {
            if (z) {
                a();
            }
            if (!k.b()) {
                return;
            }
        }
        this.f116806f = str;
        this.f116807g = str2;
        if (list == null || list.isEmpty()) {
            list = h.a.n.d(new RecommendContact(null, 1, null));
        }
        this.q = list;
        i adapter = getAdapter();
        List<? extends User> list2 = this.q;
        if (list2 == null) {
            l.a("mUsers");
        }
        adapter.b_(list2);
        getAdapter().f117432e = str;
        getAdapter().f117433f = str2;
        getAdapter().d(false);
    }
}

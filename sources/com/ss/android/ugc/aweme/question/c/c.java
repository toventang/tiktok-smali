package com.ss.android.ugc.aweme.question.c;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.google.c.h.a.k;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.comment.ui.CommentTranslationStatusView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.question.model.QuestionDetailParam;
import com.ss.android.ugc.aweme.service.EOYServiceImpl;
import com.ss.android.ugc.aweme.service.IEOYService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.views.MultiAvatarView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Collection;
import java.util.List;

public final class c extends FrameLayout implements u<com.ss.android.ugc.aweme.question.g.b> {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.question.api.a f119933a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.question.c f119934b;

    /* renamed from: c  reason: collision with root package name */
    public SmartImageView f119935c;

    /* renamed from: d  reason: collision with root package name */
    public LinearLayout f119936d;

    /* renamed from: e  reason: collision with root package name */
    public TuxTextView f119937e;

    /* renamed from: f  reason: collision with root package name */
    public TuxTextView f119938f;

    /* renamed from: g  reason: collision with root package name */
    public TuxTextView f119939g;

    /* renamed from: h  reason: collision with root package name */
    public TuxTextView f119940h;

    /* renamed from: i  reason: collision with root package name */
    public CommentTranslationStatusView f119941i;

    /* renamed from: j  reason: collision with root package name */
    public TuxTextView f119942j;

    /* renamed from: k  reason: collision with root package name */
    public a f119943k;

    /* renamed from: l  reason: collision with root package name */
    public b f119944l;

    /* renamed from: m  reason: collision with root package name */
    public FrameLayout f119945m;
    public SmartImageView n;
    public ConstraintLayout o;
    public ConstraintLayout p;
    boolean q;
    String r;
    public com.ss.android.ugc.aweme.question.g.c s;
    public final com.ss.android.ugc.aweme.question.h.a.c t;
    private View u;
    private View v;
    private SparseArray w;

    static {
        Covode.recordClassIndex(77917);
    }

    public final View c() {
        if (this.w == null) {
            this.w = new SparseArray();
        }
        View view = (View) this.w.get(R.id.bf9);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.bf9);
        this.w.put(R.id.bf9, findViewById);
        return findViewById;
    }

    public final int getButtonResId() {
        return R.layout.ark;
    }

    public final int getLayoutResId() {
        return R.layout.arm;
    }

    public final int getMultiAvatarViewResId() {
        return R.layout.arl;
    }

    public final com.ss.android.ugc.aweme.question.h.a.c getMHeaderParam() {
        return this.t;
    }

    public final QuestionDetailParam getDetailParam() {
        return this.t.f119994f;
    }

    public final int getAvatarContainerHeight() {
        SmartImageView smartImageView = this.f119935c;
        if (smartImageView == null) {
            l.a("mAvatar");
        }
        return smartImageView.getHeight();
    }

    public final void b() {
        com.ss.android.ugc.aweme.question.c cVar = this.f119934b;
        if (cVar == null) {
            l.a("mQuestion");
        }
        com.ss.android.ugc.aweme.question.g.c cVar2 = this.s;
        if (cVar2 != null) {
            cVar2.a(cVar);
        }
    }

    public final void a() {
        int i2;
        com.ss.android.ugc.aweme.question.c cVar = this.f119934b;
        if (cVar == null) {
            l.a("mQuestion");
        }
        String content = cVar.getContent();
        if (content != null) {
            TuxTextView tuxTextView = this.f119939g;
            if (tuxTextView == null) {
                l.a("mContent");
            }
            tuxTextView.setText(new h.m.l("(?m)^[ \t]*\r?\n").replace(content, ""));
            TuxTextView tuxTextView2 = this.f119939g;
            if (tuxTextView2 == null) {
                l.a("mContent");
            }
            if (gb.a()) {
                i2 = 4;
            } else {
                i2 = 3;
            }
            tuxTextView2.setTextDirection(i2);
            IEOYService b2 = EOYServiceImpl.b();
            TuxTextView tuxTextView3 = this.f119939g;
            if (tuxTextView3 == null) {
                l.a("mContent");
            }
            b2.a(tuxTextView3);
        }
    }

    public static final class a implements k<com.ss.android.ugc.aweme.translation.a.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f119946a;

        static {
            Covode.recordClassIndex(77918);
        }

        @Override // com.google.c.h.a.k
        public final void onFailure(Throwable th) {
            l.d(th, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a(c cVar) {
            this.f119946a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.c.h.a.k
        public final /* synthetic */ void onSuccess(com.ss.android.ugc.aweme.translation.a.a aVar) {
            List<com.ss.android.ugc.aweme.translation.a.c> list;
            com.ss.android.ugc.aweme.translation.a.c cVar;
            com.ss.android.ugc.aweme.translation.a.a aVar2 = aVar;
            if (aVar2 != null) {
                list = aVar2.f141008a;
            } else {
                list = null;
            }
            if (!com.bytedance.common.utility.collection.b.a((Collection) list) && list != null && (cVar = list.get(0)) != null) {
                c cVar2 = this.f119946a;
                CommentService e2 = CommentServiceImpl.e();
                String str = cVar.f141015a;
                l.b(str, "");
                String b2 = e2.b(str);
                com.ss.android.ugc.aweme.question.c cVar3 = cVar2.f119934b;
                if (cVar3 == null) {
                    l.a("mQuestion");
                }
                if (!l.a((Object) cVar3.getContent(), (Object) b2)) {
                    cVar2.r = b2;
                    TuxTextView tuxTextView = cVar2.f119940h;
                    if (tuxTextView == null) {
                        l.a("mTranslationButton");
                    }
                    Context context = cVar2.getContext();
                    l.b(context, "");
                    tuxTextView.setText(context.getResources().getString(R.string.fjz));
                    TuxTextView tuxTextView2 = cVar2.f119940h;
                    if (tuxTextView2 == null) {
                        l.a("mTranslationButton");
                    }
                    tuxTextView2.setVisibility(0);
                    TuxTextView tuxTextView3 = cVar2.f119940h;
                    if (tuxTextView3 == null) {
                        l.a("mTranslationButton");
                    }
                    tuxTextView3.setOnClickListener(new View$OnClickListenerC3093c(cVar2));
                    com.ss.android.ugc.aweme.question.f.a.c("qa_detail", cVar2.getDetailParam().getId());
                    return;
                }
                TuxTextView tuxTextView4 = cVar2.f119940h;
                if (tuxTextView4 == null) {
                    l.a("mTranslationButton");
                }
                tuxTextView4.setVisibility(8);
            }
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.question.c a(c cVar) {
        com.ss.android.ugc.aweme.question.c cVar2 = cVar.f119934b;
        if (cVar2 == null) {
            l.a("mQuestion");
        }
        return cVar2;
    }

    public static final /* synthetic */ TuxTextView b(c cVar) {
        TuxTextView tuxTextView = cVar.f119940h;
        if (tuxTextView == null) {
            l.a("mTranslationButton");
        }
        return tuxTextView;
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f119947a;

        static {
            Covode.recordClassIndex(77919);
        }

        public b(c cVar) {
            this.f119947a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Boolean isTranslated = c.a(this.f119947a).isTranslated();
            if (isTranslated != null) {
                boolean booleanValue = isTranslated.booleanValue();
                c.b(this.f119947a).setVisibility(8);
                if (booleanValue) {
                    this.f119947a.b();
                    TuxTextView b2 = c.b(this.f119947a);
                    Context context = this.f119947a.getContext();
                    l.b(context, "");
                    b2.setText(context.getResources().getString(R.string.fjz));
                    return;
                }
                c cVar = this.f119947a;
                com.ss.android.ugc.aweme.question.c cVar2 = cVar.f119934b;
                if (cVar2 == null) {
                    l.a("mQuestion");
                }
                com.ss.android.ugc.aweme.question.g.a aVar = new com.ss.android.ugc.aweme.question.g.a();
                aVar.f119971b = SettingServiceImpl.v().h();
                aVar.a(cVar2.getContent());
                com.ss.android.ugc.aweme.question.g.c cVar3 = cVar.s;
                if (cVar3 != null) {
                    CommentTranslationStatusView commentTranslationStatusView = cVar.f119941i;
                    if (commentTranslationStatusView == null) {
                        l.a("mTranslateStatusView");
                    }
                    cVar3.a(cVar2, aVar, commentTranslationStatusView);
                }
                TuxTextView b3 = c.b(this.f119947a);
                Context context2 = this.f119947a.getContext();
                l.b(context2, "");
                b3.setText(context2.getResources().getString(R.string.fjy));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.c.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC3093c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f119948a;

        static {
            Covode.recordClassIndex(77920);
        }

        View$OnClickListenerC3093c(c cVar) {
            this.f119948a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            c cVar = this.f119948a;
            if (cVar.r != null) {
                if (cVar.q) {
                    TuxTextView tuxTextView = cVar.f119940h;
                    if (tuxTextView == null) {
                        l.a("mTranslationButton");
                    }
                    Context context = cVar.getContext();
                    l.b(context, "");
                    tuxTextView.setText(context.getResources().getString(R.string.fjz));
                    TuxTextView tuxTextView2 = cVar.f119939g;
                    if (tuxTextView2 == null) {
                        l.a("mContent");
                    }
                    com.ss.android.ugc.aweme.question.c cVar2 = cVar.f119934b;
                    if (cVar2 == null) {
                        l.a("mQuestion");
                    }
                    tuxTextView2.setText(cVar2.getContent());
                    cVar.q = false;
                    com.ss.android.ugc.aweme.question.f.a.b("qa_detail", cVar.getDetailParam().getId());
                    com.ss.android.ugc.aweme.question.f.a.c("qa_detail", cVar.getDetailParam().getId());
                } else {
                    TuxTextView tuxTextView3 = cVar.f119940h;
                    if (tuxTextView3 == null) {
                        l.a("mTranslationButton");
                    }
                    Context context2 = cVar.getContext();
                    l.b(context2, "");
                    tuxTextView3.setText(context2.getResources().getString(R.string.fjy));
                    TuxTextView tuxTextView4 = cVar.f119939g;
                    if (tuxTextView4 == null) {
                        l.a("mContent");
                    }
                    tuxTextView4.setText(cVar.r);
                    cVar.q = true;
                    com.ss.android.ugc.aweme.question.f.a.d("qa_detail", cVar.getDetailParam().getId());
                    com.ss.android.ugc.aweme.question.f.a.a("qa_detail", cVar.getDetailParam().getId());
                }
                IEOYService b2 = EOYServiceImpl.b();
                TuxTextView tuxTextView5 = cVar.f119939g;
                if (tuxTextView5 == null) {
                    l.a("mContent");
                }
                b2.a(tuxTextView5);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f119949a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f119950b;

        static {
            Covode.recordClassIndex(77921);
        }

        d(c cVar, String str) {
            this.f119949a = cVar;
            this.f119950b = str;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                String str4 = null;
                if (g2 != null) {
                    str = g2.getCurUserId();
                } else {
                    str = null;
                }
                User creator = c.a(this.f119949a).getCreator();
                if (creator != null) {
                    str2 = creator.getUid();
                } else {
                    str2 = null;
                }
                if (l.a((Object) str, (Object) str2)) {
                    String str5 = this.f119950b;
                    com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                    dVar.a("enter_from", "qa_detail");
                    if (str5 != null) {
                        dVar.a("question_id", str5);
                    }
                    r.a("enter_personal_homepage", dVar.f66730a);
                } else {
                    String str6 = this.f119950b;
                    com.ss.android.ugc.aweme.app.f.d dVar2 = new com.ss.android.ugc.aweme.app.f.d();
                    dVar2.a("enter_from", "qa_detail");
                    if (str6 != null) {
                        dVar2.a("enter_method", str6);
                    }
                    r.a("enter_personal_detail", dVar2.f66730a);
                }
                SmartRoute buildRoute = SmartRouter.buildRoute(com.bytedance.ies.ugc.appcontext.d.a(), "aweme://user/profile/");
                User creator2 = c.a(this.f119949a).getCreator();
                if (creator2 != null) {
                    str3 = creator2.getUid();
                } else {
                    str3 = null;
                }
                SmartRoute withParam = buildRoute.withParam("uid", str3);
                User creator3 = c.a(this.f119949a).getCreator();
                if (creator3 != null) {
                    str4 = creator3.getSecUid();
                }
                withParam.withParam("sec_user_id", str4).withParam("enter_from", "qa_detail").open();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.question.g.b bVar) {
        com.ss.android.ugc.aweme.question.g.b bVar2 = bVar;
        if (bVar2 != null && bVar2.f119976a != null) {
            if (bVar2.f119977b) {
                com.ss.android.ugc.aweme.question.c cVar = bVar2.f119976a;
                if (l.a((Object) cVar.isTranslated(), (Object) true)) {
                    com.ss.android.ugc.aweme.question.f.a.d("qa_detail", getDetailParam().getId());
                    com.ss.android.ugc.aweme.question.f.a.a("qa_detail", getDetailParam().getId());
                } else {
                    com.ss.android.ugc.aweme.question.f.a.b("qa_detail", getDetailParam().getId());
                    com.ss.android.ugc.aweme.question.f.a.c("qa_detail", getDetailParam().getId());
                }
                CommentTranslationStatusView commentTranslationStatusView = this.f119941i;
                if (commentTranslationStatusView == null) {
                    l.a("mTranslateStatusView");
                }
                commentTranslationStatusView.setLoading(false);
                TuxTextView tuxTextView = this.f119940h;
                if (tuxTextView == null) {
                    l.a("mTranslationButton");
                }
                tuxTextView.setVisibility(0);
                com.ss.android.ugc.aweme.question.c cVar2 = this.f119934b;
                if (cVar2 == null) {
                    l.a("mQuestion");
                }
                cVar2.setTranslated(cVar.isTranslated());
                com.ss.android.ugc.aweme.question.c cVar3 = this.f119934b;
                if (cVar3 == null) {
                    l.a("mQuestion");
                }
                cVar3.setContent(cVar.getContent());
                a();
                return;
            }
            CommentTranslationStatusView commentTranslationStatusView2 = this.f119941i;
            if (commentTranslationStatusView2 == null) {
                l.a("mTranslateStatusView");
            }
            commentTranslationStatusView2.setLoading(false);
            Context context = getContext();
            if (context != null) {
                com.ss.android.ugc.aweme.app.api.b.a.a(context, (Throwable) bVar2.f119978c, (int) R.string.g4j);
            }
        }
    }

    public final void a(View view, String str) {
        view.setOnClickListener(new d(this, str));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context, com.ss.android.ugc.aweme.question.h.a.c cVar) {
        super(context, null);
        l.d(context, "");
        MethodCollector.i(10911);
        if (cVar == null) {
            l.b();
        }
        this.t = cVar;
        com.a.a(LayoutInflater.from(context), getLayoutResId(), this, true);
        View findViewById = findViewById(R.id.or);
        l.b(findViewById, "");
        this.f119935c = (SmartImageView) findViewById;
        View findViewById2 = findViewById(R.id.pc);
        l.b(findViewById2, "");
        this.f119945m = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(R.id.pb);
        l.b(findViewById3, "");
        this.n = (SmartImageView) findViewById3;
        View findViewById4 = findViewById(R.id.title);
        l.b(findViewById4, "");
        this.f119936d = (LinearLayout) findViewById4;
        View findViewById5 = findViewById(R.id.emt);
        l.b(findViewById5, "");
        this.f119937e = (TuxTextView) findViewById5;
        View findViewById6 = findViewById(R.id.emu);
        l.b(findViewById6, "");
        this.f119938f = (TuxTextView) findViewById6;
        View findViewById7 = findViewById(R.id.em6);
        l.b(findViewById7, "");
        this.v = findViewById7;
        View findViewById8 = findViewById(R.id.adh);
        l.b(findViewById8, "");
        this.f119939g = (TuxTextView) findViewById8;
        View findViewById9 = findViewById(R.id.fke);
        l.b(findViewById9, "");
        this.f119942j = (TuxTextView) findViewById9;
        View findViewById10 = findViewById(R.id.eqh);
        l.b(findViewById10, "");
        this.f119940h = (TuxTextView) findViewById10;
        View findViewById11 = findViewById(R.id.eqo);
        l.b(findViewById11, "");
        this.f119941i = (CommentTranslationStatusView) findViewById11;
        View findViewById12 = findViewById(R.id.bf8);
        l.b(findViewById12, "");
        this.o = (ConstraintLayout) findViewById12;
        View findViewById13 = findViewById(R.id.bez);
        l.b(findViewById13, "");
        this.p = (ConstraintLayout) findViewById13;
        View findViewById14 = findViewById(R.id.a0z);
        l.b(findViewById14, "");
        ViewStub viewStub = (ViewStub) findViewById14;
        viewStub.setLayoutResource(getButtonResId());
        View inflate = viewStub.inflate();
        View findViewById15 = inflate.findViewById(R.id.a8e);
        l.b(findViewById15, "");
        View findViewById16 = inflate.findViewById(R.id.bvi);
        l.b(findViewById16, "");
        this.f119943k = new a(findViewById15, (CheckableImageView) findViewById16, (TextView) inflate.findViewById(R.id.ex4), getDetailParam());
        l.b(inflate, "");
        this.u = inflate;
        View findViewById17 = findViewById(R.id.coy);
        l.b(findViewById17, "");
        ViewStub viewStub2 = (ViewStub) findViewById17;
        viewStub2.setLayoutResource(getMultiAvatarViewResId());
        View inflate2 = viewStub2.inflate();
        View findViewById18 = inflate2.findViewById(R.id.dfx);
        l.b(findViewById18, "");
        View findViewById19 = inflate2.findViewById(R.id.dfv);
        l.b(findViewById19, "");
        MultiAvatarView multiAvatarView = (MultiAvatarView) findViewById19;
        Context context2 = getContext();
        if (context2 != null) {
            this.f119944l = new b((Activity) context2, findViewById18, multiAvatarView, getDetailParam());
            MethodCollector.o(10911);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        MethodCollector.o(10911);
        throw nullPointerException;
    }

    public /* synthetic */ c(Context context, com.ss.android.ugc.aweme.question.h.a.c cVar, byte b2) {
        this(context, cVar);
    }
}

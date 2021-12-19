package com.ss.android.ugc.aweme.favorites.j;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.a.a;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.comment.ui.CommentTranslationStatusView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import com.ss.android.ugc.aweme.favorites.i.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.EOYServiceImpl;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.sticker.question.QuestionFavoriteServiceImpl;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Objects;

public final class i extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener, u<com.ss.android.ugc.aweme.question.g.b>, a.AbstractC2193a {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.question.c f90700a;

    /* renamed from: b  reason: collision with root package name */
    public String f90701b;

    /* renamed from: c  reason: collision with root package name */
    public Activity f90702c;

    /* renamed from: d  reason: collision with root package name */
    public Fragment f90703d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.favorites.a.d f90704e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.bj.b f90705f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.question.g.c f90706g;

    /* renamed from: h  reason: collision with root package name */
    public TuxButton f90707h;

    /* renamed from: i  reason: collision with root package name */
    public ConstraintLayout f90708i;

    /* renamed from: j  reason: collision with root package name */
    public SmartCircleImageView f90709j;

    /* renamed from: k  reason: collision with root package name */
    public TuxTextView f90710k;

    /* renamed from: l  reason: collision with root package name */
    public TuxTextView f90711l;

    /* renamed from: m  reason: collision with root package name */
    public TuxTextView f90712m;
    public CommentTranslationStatusView n;
    private com.bytedance.tux.sheet.a.a o;

    static final class g implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f90724a;

        static {
            Covode.recordClassIndex(56975);
        }

        g(i iVar) {
            this.f90724a = iVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
        }
    }

    static {
        Covode.recordClassIndex(56968);
    }

    public final void a() {
        com.bytedance.tux.sheet.a.a aVar = this.o;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    public static final class a implements com.ss.android.ugc.aweme.bj.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f90713a;

        static {
            Covode.recordClassIndex(56969);
        }

        @Override // com.ss.android.ugc.aweme.bj.b
        public final void b() {
            com.ss.android.ugc.aweme.question.g.c cVar;
            i iVar = this.f90713a;
            com.ss.android.ugc.aweme.question.c cVar2 = iVar.f90700a;
            if (cVar2 != null && (cVar = iVar.f90706g) != null) {
                cVar.a(cVar2);
            }
        }

        @Override // com.ss.android.ugc.aweme.bj.b
        public final void d() {
            com.ss.android.ugc.aweme.question.c cVar = this.f90713a.f90700a;
            if (cVar != null) {
                this.f90713a.a(cVar, 1);
            }
        }

        @Override // com.ss.android.ugc.aweme.bj.b
        public final void e() {
            com.ss.android.ugc.aweme.question.c cVar = this.f90713a.f90700a;
            if (cVar != null) {
                this.f90713a.a(cVar, 0);
            }
        }

        @Override // com.ss.android.ugc.aweme.bj.b
        public final void a() {
            i iVar = this.f90713a;
            com.ss.android.ugc.aweme.question.c cVar = iVar.f90700a;
            if (cVar != null) {
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "collection_question");
                Object id = cVar.getId();
                if (id == null) {
                    id = "";
                }
                r.a("translate_question", a2.a("question_id", id).f66730a);
                com.ss.android.ugc.aweme.question.g.a aVar = new com.ss.android.ugc.aweme.question.g.a();
                aVar.f119971b = SettingServiceImpl.v().h();
                aVar.a(cVar.getContent());
                com.ss.android.ugc.aweme.question.g.c cVar2 = iVar.f90706g;
                if (cVar2 != null) {
                    cVar2.a(cVar, aVar, iVar.n);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.bj.b
        public final void c() {
            long j2;
            long j3;
            long j4;
            UrlModel urlModel;
            String aid;
            String uid;
            com.ss.android.ugc.aweme.question.c cVar = this.f90713a.f90700a;
            if (cVar != null && cVar.getCreator() != null) {
                Activity activity = this.f90713a.f90702c;
                Objects.requireNonNull(activity, "null cannot be cast to non-null type android.content.Context");
                Long id = cVar.getId();
                if (id != null) {
                    j2 = id.longValue();
                } else {
                    j2 = 0;
                }
                User creator = cVar.getCreator();
                if (creator == null || (uid = creator.getUid()) == null) {
                    j3 = 0;
                } else {
                    j3 = Long.parseLong(uid);
                }
                Aweme video = cVar.getVideo();
                if (video == null || (aid = video.getAid()) == null) {
                    j4 = 0;
                } else {
                    j4 = Long.parseLong(aid);
                }
                User creator2 = cVar.getCreator();
                String str = null;
                if (creator2 != null) {
                    urlModel = creator2.getAvatarThumb();
                } else {
                    urlModel = null;
                }
                String e2 = in.e(cVar.getCreator());
                String str2 = this.f90713a.f90701b;
                if (str2 == null) {
                    str2 = "";
                }
                User creator3 = cVar.getCreator();
                if (creator3 != null) {
                    str = creator3.getSecUid();
                }
                com.ss.android.ugc.aweme.comment.util.u.a(activity, new QaStruct(j2, j3, j4, urlModel, e2, str2, str, z.INSTANCE, null, 256, null), "collection_question", "click_favorite", "answer");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a(i iVar) {
            this.f90713a = iVar;
        }
    }

    private static boolean d() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private final boolean b() {
        if (this.f90702c == null) {
            return true;
        }
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = d();
        }
        if (j.f107229h) {
            return false;
        }
        Activity activity = this.f90702c;
        if (activity != null) {
            new com.bytedance.tux.g.b(activity).a(activity.getString(R.string.de8)).b();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.favorites.i.a.AbstractC2193a
    public final void c() {
        com.ss.android.ugc.aweme.question.c cVar = this.f90700a;
        if (cVar != null) {
            r.a(com.ss.android.ugc.aweme.favorites.i.a.a(1), com.ss.android.ugc.aweme.favorites.i.a.b("question", "collection_question").a("question_id", String.valueOf(cVar.getId())).f66730a);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f90714a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.bj.b f90715b;

        static {
            Covode.recordClassIndex(56970);
        }

        b(i iVar, com.ss.android.ugc.aweme.bj.b bVar) {
            this.f90714a = iVar;
            this.f90715b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f90714a.a();
            this.f90715b.a();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f90716a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.bj.b f90717b;

        static {
            Covode.recordClassIndex(56971);
        }

        c(i iVar, com.ss.android.ugc.aweme.bj.b bVar) {
            this.f90716a = iVar;
            this.f90717b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f90716a.a();
            this.f90717b.b();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f90718a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.bj.b f90719b;

        static {
            Covode.recordClassIndex(56972);
        }

        d(i iVar, com.ss.android.ugc.aweme.bj.b bVar) {
            this.f90718a = iVar;
            this.f90719b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f90718a.a();
            this.f90719b.c();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f90720a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.bj.b f90721b;

        static {
            Covode.recordClassIndex(56973);
        }

        e(i iVar, com.ss.android.ugc.aweme.bj.b bVar) {
            this.f90720a = iVar;
            this.f90721b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f90720a.a();
            this.f90721b.d();
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f90722a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.bj.b f90723b;

        static {
            Covode.recordClassIndex(56974);
        }

        f(i iVar, com.ss.android.ugc.aweme.bj.b bVar) {
            this.f90722a = iVar;
            this.f90723b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f90722a.a();
            this.f90723b.e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.j.i$i  reason: collision with other inner class name */
    public static final class View$OnClickListenerC2195i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f90728a;

        static {
            Covode.recordClassIndex(56977);
        }

        public View$OnClickListenerC2195i(i iVar) {
            this.f90728a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.bj.b bVar = this.f90728a.f90705f;
            if (bVar != null) {
                bVar.c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f90725a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.question.c f90726b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f90727c;

        static {
            Covode.recordClassIndex(56976);
        }

        h(i iVar, com.ss.android.ugc.aweme.question.c cVar, int i2) {
            this.f90725a = iVar;
            this.f90726b = cVar;
            this.f90727c = i2;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            l.d(iVar, "");
            if (!iVar.c() && !iVar.b()) {
                com.ss.android.ugc.aweme.favorites.a.d dVar = this.f90725a.f90704e;
                if (dVar != null) {
                    com.ss.android.ugc.aweme.question.c cVar = this.f90726b;
                    l.d(cVar, "");
                    dVar.e().remove(cVar);
                    dVar.notifyDataSetChanged();
                    if (dVar.e().isEmpty()) {
                        Fragment fragment = dVar.f90428a;
                        Objects.requireNonNull(fragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.favorites.ui.QuestionCollectListFragment");
                        ((com.ss.android.ugc.aweme.favorites.ui.a) fragment).f();
                    }
                }
                if (this.f90727c == 1) {
                    this.f90726b.setCollectStatus(1);
                } else {
                    this.f90726b.setCollectStatus(0);
                }
                QuestionFavoriteServiceImpl.a().a(String.valueOf(this.f90726b.getId()), this.f90727c);
            }
            return h.z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.dzu);
        l.b(findViewById, "");
        this.f90707h = (TuxButton) findViewById;
        View findViewById2 = view.findViewById(R.id.dzo);
        l.b(findViewById2, "");
        this.f90708i = (ConstraintLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.dzn);
        l.b(findViewById3, "");
        this.f90709j = (SmartCircleImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.dzw);
        l.b(findViewById4, "");
        this.f90710k = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.dzv);
        l.b(findViewById5, "");
        this.f90711l = (TuxTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.dzx);
        l.b(findViewById6, "");
        this.f90712m = (TuxTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.eqo);
        l.b(findViewById7, "");
        this.n = (CommentTranslationStatusView) findViewById7;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.question.g.b bVar) {
        Activity activity;
        com.ss.android.ugc.aweme.question.g.b bVar2 = bVar;
        if (bVar2 != null && bVar2.f119976a != null && (activity = this.f90702c) != null && !activity.isFinishing()) {
            if (bVar2.f119977b) {
                com.ss.android.ugc.aweme.question.c cVar = bVar2.f119976a;
                this.n.setLoading(false);
                com.ss.android.ugc.aweme.question.c cVar2 = this.f90700a;
                if (cVar2 != null) {
                    cVar2.setTranslated(cVar.isTranslated());
                }
                this.f90711l.setText(cVar.getContent());
                EOYServiceImpl.b().a(this.f90711l);
                return;
            }
            this.n.setLoading(false);
            Activity activity2 = this.f90702c;
            if (activity2 != null) {
                com.ss.android.ugc.aweme.app.api.b.a.a((Context) activity2, (Throwable) bVar2.f119978c, (int) R.string.g4j);
            }
        }
    }

    public final void onClick(View view) {
        String str;
        ClickAgent.onClick(view);
        SmartRoute buildRoute = SmartRouter.buildRoute(this.f90702c, "//qna/detail/");
        com.ss.android.ugc.aweme.question.c cVar = this.f90700a;
        Long l2 = null;
        if (cVar != null) {
            l2 = cVar.getId();
        }
        SmartRoute withParam = buildRoute.withParam("id", String.valueOf(l2)).withParam("enter_from", "collection_question").withParam("enter_method", "click_favorite");
        com.ss.android.ugc.aweme.question.c cVar2 = this.f90700a;
        if (cVar2 == null || cVar2.getVideo() == null) {
            str = "textual";
        } else {
            str = "video";
        }
        withParam.withParam("question_type", str).open();
    }

    public final boolean onLongClick(View view) {
        com.ss.android.ugc.aweme.question.c cVar;
        boolean z;
        String str;
        String content;
        String content2;
        String str2;
        a.C1109a a2;
        Resources resources;
        Resources resources2;
        Resources resources3;
        Resources resources4;
        Resources resources5;
        User creator;
        if (!(view == null || this.f90702c == null || this.f90705f == null || (cVar = this.f90700a) == null)) {
            androidx.fragment.app.i iVar = null;
            if (cVar.getCreator() != null) {
                com.ss.android.ugc.aweme.question.c cVar2 = this.f90700a;
                String uid = (cVar2 == null || (creator = cVar2.getCreator()) == null) ? null : creator.getUid();
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                z = TextUtils.equals(uid, g2.getCurUserId());
            } else {
                z = false;
            }
            ArrayList<String> arrayList = new ArrayList();
            Activity activity = this.f90702c;
            if (activity != null) {
                String string = activity.getString(R.string.ci);
                l.b(string, "");
                arrayList.add(string);
                String string2 = activity.getString(R.string.bsi);
                l.b(string2, "");
                arrayList.add(string2);
                if (!z) {
                    com.ss.android.ugc.aweme.question.c cVar3 = this.f90700a;
                    if (l.a((Object) (cVar3 != null ? cVar3.isTranslated() : null), (Object) true)) {
                        String string3 = activity.getString(R.string.am7);
                        l.b(string3, "");
                        arrayList.add(string3);
                    } else {
                        String string4 = activity.getString(R.string.amo);
                        l.b(string4, "");
                        arrayList.add(string4);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str3 : arrayList) {
                com.ss.android.ugc.aweme.bj.b bVar = this.f90705f;
                if (!(bVar == null || this.f90700a == null)) {
                    Activity activity2 = this.f90702c;
                    if (TextUtils.equals(str3, (activity2 == null || (resources5 = activity2.getResources()) == null) ? null : resources5.getString(R.string.amo))) {
                        a2 = ((a.d) new a.d().a(str3)).c(R.raw.icon_globe).a(new b(this, bVar));
                    } else {
                        Activity activity3 = this.f90702c;
                        if (TextUtils.equals(str3, (activity3 == null || (resources4 = activity3.getResources()) == null) ? null : resources4.getString(R.string.am7))) {
                            a2 = ((a.d) new a.d().a(str3)).c(R.raw.icon_globe).a(new c(this, bVar));
                        } else {
                            Activity activity4 = this.f90702c;
                            if (TextUtils.equals(str3, (activity4 == null || (resources3 = activity4.getResources()) == null) ? null : resources3.getString(R.string.ci))) {
                                a2 = ((a.d) new a.d().a(str3)).c(R.raw.icon_video).a(new d(this, bVar));
                            } else {
                                Activity activity5 = this.f90702c;
                                if (!TextUtils.equals(str3, (activity5 == null || (resources2 = activity5.getResources()) == null) ? null : resources2.getString(R.string.bsf))) {
                                    Activity activity6 = this.f90702c;
                                    if (!TextUtils.equals(str3, (activity6 == null || (resources = activity6.getResources()) == null) ? null : resources.getString(R.string.bsg))) {
                                        Fragment fragment = this.f90703d;
                                        if (fragment == null) {
                                            l.b();
                                        }
                                        if (TextUtils.equals(str3, fragment.getString(R.string.bsi))) {
                                            a2 = ((a.d) new a.d().a(str3)).c(R.raw.icon_bookmark_fill).a(new f(this, bVar));
                                        }
                                    }
                                }
                                a2 = ((a.d) new a.d().a(str3)).c(R.raw.icon_bookmark).a(new e(this, bVar));
                            }
                        }
                    }
                    if (a2 != null) {
                        arrayList2.add(a2);
                    }
                }
            }
            com.ss.android.ugc.aweme.question.c cVar4 = this.f90700a;
            if ((cVar4 != null ? cVar4.getCreator() : null) != null) {
                com.ss.android.ugc.aweme.question.c cVar5 = this.f90700a;
                if (!(cVar5 == null || (content2 = cVar5.getContent()) == null || content2.length() <= 0)) {
                    a.C0730a aVar = new a.C0730a();
                    com.ss.android.ugc.aweme.question.c cVar6 = this.f90700a;
                    String a3 = in.a(cVar6 != null ? cVar6.getCreator() : null, false);
                    l.b(a3, "");
                    a.C0730a b2 = aVar.b(a3);
                    if (gb.a()) {
                        str2 = " :";
                    } else {
                        str2 = ": ";
                    }
                    str = b2.b(str2).a(new h.m.l("(?m)^[ \t]*\r?\n").replace(content2, "")).f33382a.toString();
                    l.b(str, "");
                }
                str = "";
            } else {
                com.ss.android.ugc.aweme.question.c cVar7 = this.f90700a;
                if (!(cVar7 == null || (content = cVar7.getContent()) == null || content.length() <= 0)) {
                    str = new a.C0730a().a(new h.m.l("(?m)^[ \t]*\r?\n").replace(content, "")).f33382a.toString();
                    l.b(str, "");
                }
                str = "";
            }
            this.o = new a.b().a(str).a().a(arrayList2).a(new g(this)).b("").b();
            if (!arrayList2.isEmpty()) {
                com.bytedance.tux.sheet.a.a aVar2 = this.o;
                if (aVar2 != null) {
                    Fragment fragment2 = this.f90703d;
                    if (fragment2 != null) {
                        iVar = fragment2.getFragmentManager();
                    }
                    aVar2.show(iVar, "QuestionCollectViewHolder");
                }
                return true;
            }
        }
        return false;
    }

    public final void a(com.ss.android.ugc.aweme.question.c cVar, int i2) {
        Long id;
        b.i<BaseResponse> collectQuestion;
        if (!b() && (id = cVar.getId()) != null && (collectQuestion = UserFavoritesApi.f90439a.collectQuestion(id.longValue(), i2)) != null) {
            collectQuestion.a(new h(this, cVar, i2), b.i.f4826c, null);
        }
    }
}

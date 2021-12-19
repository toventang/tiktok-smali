package com.ss.android.ugc.aweme.shortvideo.sticker.question;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.d.f;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.tooltip.a.a.d;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.comment.util.u;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.question.api.QuestionApi;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.sticker.i;
import com.ss.android.ugc.aweme.sticker.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.UUID;
import java.util.concurrent.Callable;

public final class a extends com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a {

    /* renamed from: a  reason: collision with root package name */
    public final Long f130682a;

    /* renamed from: l  reason: collision with root package name */
    public final Long f130683l;

    /* renamed from: m  reason: collision with root package name */
    private final long f130684m;
    private final h n;
    private final b o;

    static {
        Covode.recordClassIndex(85680);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void f() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public final void h() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public final View a() {
        return (FrameLayout) this.n.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e
    public final int b() {
        InteractStickerStruct interactStickerStruct = this.f130433f;
        if (interactStickerStruct != null) {
            return interactStickerStruct.getType();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final View e() {
        MethodCollector.i(2537);
        View view = new View(this.f130436i);
        MethodCollector.o(2537);
        return view;
    }

    static final class d extends m implements h.f.a.a<FrameLayout> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(85684);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FrameLayout invoke() {
            MethodCollector.i(2721);
            FrameLayout frameLayout = new FrameLayout(this.$context);
            frameLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            MethodCollector.o(2721);
            return frameLayout;
        }
    }

    public final boolean c() {
        if (!AVExternalServiceImpl.a().configService().avsettingsConfig().enableQaSticker() || !o()) {
            return false;
        }
        return true;
    }

    private final boolean o() {
        QaStruct qaStruct;
        Long valueOf;
        InteractStickerStruct interactStickerStruct = this.f130433f;
        if (interactStickerStruct == null || (qaStruct = interactStickerStruct.getQaStruct()) == null || (valueOf = Long.valueOf(qaStruct.getQuestionId())) == null || valueOf.longValue() == 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void d() {
        i iVar;
        j jVar = this.f130438k;
        if (jVar != null && (iVar = jVar.r) != null) {
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", iVar.f134901a).a("group_id", iVar.f134903c).a("author_id", iVar.f134902b).a("question_id", this.f130683l);
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            r.a("sticker_click", a2.a("user_id", g2.getCurUserId()).a("sticker_type", "question").a("question_user_id", this.f130682a).a("options_show", "both_for_q").f66730a);
        }
    }

    public final void g() {
        String str;
        String str2;
        String str3;
        j jVar = this.f130438k;
        if (jVar != null) {
            SmartRoute buildRoute = SmartRouter.buildRoute(this.f130436i, "aweme://qna/detail/");
            Long l2 = this.f130683l;
            String str4 = null;
            if (l2 != null) {
                str = String.valueOf(l2.longValue());
            } else {
                str = null;
            }
            SmartRoute withParam = buildRoute.withParam("id", str);
            i iVar = jVar.r;
            if (iVar != null) {
                str2 = iVar.f134901a;
            } else {
                str2 = null;
            }
            SmartRoute withParam2 = withParam.withParam("extra_question_from", str2).withParam("aweme_id", jVar.f134923d);
            Long l3 = this.f130683l;
            if (l3 != null) {
                str3 = String.valueOf(l3.longValue());
            } else {
                str3 = null;
            }
            SmartRoute withParam3 = withParam2.withParam("qid", str3);
            i iVar2 = jVar.r;
            if (iVar2 != null) {
                str4 = iVar2.f134901a;
            }
            withParam3.withParam("enter_from", str4).withParam("process_id", UUID.randomUUID().toString()).withParam("enter_method", "click_sticker").withParam("question_type", "video").open();
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f130689a;

        static {
            Covode.recordClassIndex(85683);
        }

        c(a aVar) {
            this.f130689a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            long j2;
            String str;
            String str2;
            QaStruct qaStruct;
            i iVar;
            i iVar2;
            i iVar3;
            Long l2 = this.f130689a.f130683l;
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = 0;
            }
            if (QuestionApi.b(j2).status_code == 0) {
                this.f130689a.a("answer_with_video");
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_method", "question_sticker");
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                com.ss.android.ugc.aweme.app.f.d a3 = a2.a("reply_user_id", g2.getCurUserId());
                j jVar = this.f130689a.f130438k;
                String str3 = null;
                if (jVar == null || (iVar3 = jVar.r) == null) {
                    str = null;
                } else {
                    str = iVar3.f134902b;
                }
                com.ss.android.ugc.aweme.app.f.d a4 = a3.a("author_id", str).a("question_user_id", this.f130689a.f130682a).a("question_id", this.f130689a.f130683l);
                j jVar2 = this.f130689a.f130438k;
                if (jVar2 == null || (iVar2 = jVar2.r) == null) {
                    str2 = null;
                } else {
                    str2 = iVar2.f134903c;
                }
                r.a("reply_question_via_video", a4.a("group_id", str2).f66730a);
                Context context = this.f130689a.f130436i;
                InteractStickerStruct interactStickerStruct = this.f130689a.f130433f;
                if (interactStickerStruct != null) {
                    qaStruct = interactStickerStruct.getQaStruct();
                } else {
                    qaStruct = null;
                }
                j jVar3 = this.f130689a.f130438k;
                if (!(jVar3 == null || (iVar = jVar3.r) == null)) {
                    str3 = iVar.f134901a;
                }
                u.a(context, qaStruct, str3, "click_sticker", "answer");
            } else {
                new com.bytedance.tux.g.b(this.f130689a.f130437j).e(R.string.f6n).b();
            }
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.question.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC3410a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f130685a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.tux.tooltip.a.a.d f130686b;

        static {
            Covode.recordClassIndex(85681);
        }

        View$OnClickListenerC3410a(a aVar, com.bytedance.tux.tooltip.a.a.d dVar) {
            this.f130685a = aVar;
            this.f130686b = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130685a.n();
            this.f130685a.a("view_more_answers");
            this.f130685a.g();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f130687a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.tux.tooltip.a.a.d f130688b;

        static {
            Covode.recordClassIndex(85682);
        }

        b(a aVar, com.bytedance.tux.tooltip.a.a.d dVar) {
            this.f130687a = aVar;
            this.f130688b = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130687a.n();
            b.i.b(new c(this.f130687a), b.i.f4824a);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void a(j jVar) {
        l.d(jVar, "");
        super.a(jVar);
        this.o.a(jVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final int a(com.bytedance.tux.tooltip.a.a.d dVar) {
        int i2;
        l.d(dVar, "");
        if (!c()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(dVar.f45488b).a(R.string.f6n).a();
            return 0;
        }
        d.b bVar = new d.b();
        String string = dVar.f45488b.getString(R.string.f3l);
        l.b(string, "");
        bVar.a(string);
        if (TextUtils.equals(com.ss.android.ugc.aweme.i18n.language.a.b(), f.f30878a)) {
            i2 = 2131232512;
        } else {
            i2 = 2131232511;
        }
        bVar.f45495a = i2;
        bVar.f45500f = new View$OnClickListenerC3410a(this, dVar);
        d.b bVar2 = new d.b();
        String string2 = dVar.f45488b.getString(R.string.ci);
        l.b(string2, "");
        bVar2.a(string2);
        TextUtils.equals(com.ss.android.ugc.aweme.i18n.language.a.b(), f.f30878a);
        bVar2.f45495a = 2131232506;
        bVar2.f45500f = new b(this, dVar);
        dVar.a(bVar);
        dVar.a(bVar2);
        return 2;
    }

    public final void a(String str) {
        i iVar;
        j jVar = this.f130438k;
        if (jVar != null && (iVar = jVar.r) != null) {
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", iVar.f134901a).a("group_id", iVar.f134903c).a("author_id", iVar.f134902b).a("question_id", this.f130683l);
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            r.a("click_question_bubble", a2.a("user_id", g2.getCurUserId()).a("question_user_id", this.f130682a).a("target", str).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3) {
        return this.o.a(j2, i2, f2, f3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(int i2, Context context, View view, InteractStickerStruct interactStickerStruct, j jVar) {
        super(i2, context, view, interactStickerStruct, jVar);
        Long l2;
        QaStruct qaStruct;
        QaStruct qaStruct2;
        l.d(context, "");
        l.d(view, "");
        l.d(interactStickerStruct, "");
        InteractStickerStruct interactStickerStruct2 = this.f130433f;
        Long l3 = null;
        if (interactStickerStruct2 == null || (qaStruct2 = interactStickerStruct2.getQaStruct()) == null) {
            l2 = null;
        } else {
            l2 = Long.valueOf(qaStruct2.getUserId());
        }
        this.f130682a = l2;
        InteractStickerStruct interactStickerStruct3 = this.f130433f;
        if (!(interactStickerStruct3 == null || (qaStruct = interactStickerStruct3.getQaStruct()) == null)) {
            l3 = Long.valueOf(qaStruct.getQuestionId());
        }
        this.f130683l = l3;
        this.f130684m = 300;
        this.n = h.i.a((h.f.a.a) new d(context));
        this.o = new b(context, this, interactStickerStruct, jVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b bVar) {
        l.d(bVar, "");
        d();
        return this.o.a(j2, i2, f2, f3, bVar);
    }
}

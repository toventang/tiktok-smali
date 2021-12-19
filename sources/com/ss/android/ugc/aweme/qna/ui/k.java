package com.ss.android.ugc.aweme.qna.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DoubleColorBallAnimationView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.vm.i;
import com.ss.android.ugc.aweme.service.EOYServiceImpl;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.views.MultiAvatarView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class k extends g {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.qna.model.h f119590a;

    /* renamed from: b  reason: collision with root package name */
    public final i f119591b;

    /* renamed from: d  reason: collision with root package name */
    public final Context f119592d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.qna.g.e f119593e;

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final d f119601a = new d();

        static {
            Covode.recordClassIndex(77702);
        }

        d() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(77698);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f119594a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.h f119595b;

        static {
            Covode.recordClassIndex(77699);
        }

        a(k kVar, com.ss.android.ugc.aweme.qna.model.h hVar) {
            this.f119594a = kVar;
            this.f119595b = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f119594a.f119591b.b();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f119598a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f119599b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.h f119600c;

        static {
            Covode.recordClassIndex(77701);
        }

        c(List list, k kVar, com.ss.android.ugc.aweme.qna.model.h hVar) {
            this.f119598a = list;
            this.f119599b = kVar;
            this.f119600c = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f119599b.f119591b.a(this.f119600c.f119508a);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f119596a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.h f119597b;

        static {
            Covode.recordClassIndex(77700);
        }

        b(k kVar, com.ss.android.ugc.aweme.qna.model.h hVar) {
            this.f119596a = kVar;
            this.f119597b = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f119596a.f119591b.a(this.f119597b.f119509b, this.f119597b.f119511d);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f119602a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.h f119603b;

        static {
            Covode.recordClassIndex(77703);
        }

        e(k kVar, com.ss.android.ugc.aweme.qna.model.h hVar) {
            this.f119602a = kVar;
            this.f119603b = hVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            String str2 = this.f119603b.f119497h;
            if (str2 != null) {
                if (this.f119603b.n) {
                    str = "click_invitation";
                } else {
                    str = "click_recommendation";
                }
                this.f119602a.f119591b.a(str2, str);
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f119604a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.h f119605b;

        static {
            Covode.recordClassIndex(77704);
        }

        f(k kVar, com.ss.android.ugc.aweme.qna.model.h hVar) {
            this.f119604a = kVar;
            this.f119605b = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            String str = this.f119605b.f119497h;
            if (str != null) {
                this.f119604a.f119591b.a(str, this.f119605b.n, this.f119605b.o);
            }
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f119606a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.h f119607b;

        static {
            Covode.recordClassIndex(77705);
        }

        g(k kVar, com.ss.android.ugc.aweme.qna.model.h hVar) {
            this.f119606a = kVar;
            this.f119607b = hVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            Boolean bool = this.f119607b.f119515k;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                String str2 = this.f119607b.f119497h;
                if (str2 != null) {
                    if (!booleanValue) {
                        boolean z = this.f119607b.n;
                        l.d(str2, "");
                        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "qa_personal_profile");
                        if (z) {
                            str = "click_invitation";
                        } else {
                            str = "click_recommendation";
                        }
                        r.a("favorite_qa", a2.a("enter_method", str).a("question_id", str2).f66730a);
                    }
                    this.f119606a.f119591b.a(str2, booleanValue ? 1 : 0);
                }
            }
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f119608a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.h f119609b;

        static {
            Covode.recordClassIndex(77706);
        }

        h(k kVar, com.ss.android.ugc.aweme.qna.model.h hVar) {
            this.f119608a = kVar;
            this.f119609b = hVar;
        }

        public final void onClick(View view) {
            Integer num;
            ClickAgent.onClick(view);
            String str = this.f119609b.f119497h;
            if (str != null) {
                List<String> list = this.f119609b.o;
                if (list != null) {
                    num = Integer.valueOf(list.size());
                } else {
                    num = null;
                }
                l.d(str, "");
                r.a("delete_qa_invitation", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "qa_personal_profile").a("question_id", str).a("inviter_cnt", num).f66730a);
                this.f119608a.f119591b.a(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.qna.ui.g
    public final void a(com.ss.android.ugc.aweme.qna.model.f fVar) {
        int i2;
        MultiAvatarView multiAvatarView;
        String str;
        Integer num;
        l.d(fVar, "");
        com.ss.android.ugc.aweme.qna.model.h hVar = (com.ss.android.ugc.aweme.qna.model.h) fVar;
        this.f119590a = hVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f119574c.findViewById(R.id.deu);
        if (constraintLayout != null) {
            if (hVar.f119516l) {
                TuxTextView tuxTextView = (TuxTextView) this.f119574c.findViewById(R.id.dea);
                if (tuxTextView != null) {
                    com.ss.android.ugc.aweme.qna.g.e eVar = this.f119593e;
                    if (eVar == null || (num = eVar.f119471b) == null) {
                        str = this.f119592d.getString(R.string.f4x);
                        l.b(str, "");
                    } else {
                        str = this.f119592d.getString(R.string.f4y, String.valueOf(num.intValue()));
                        l.b(str, "");
                    }
                    tuxTextView.setText(str);
                }
                constraintLayout.setVisibility(0);
                constraintLayout.setOnClickListener(new a(this, hVar));
            } else {
                constraintLayout.setVisibility(8);
                constraintLayout.setOnClickListener(d.f119601a);
            }
        }
        DoubleColorBallAnimationView doubleColorBallAnimationView = (DoubleColorBallAnimationView) this.f119574c.findViewById(R.id.aq4);
        if (doubleColorBallAnimationView != null) {
            if (hVar.f119517m) {
                doubleColorBallAnimationView.setVisibility(0);
            } else {
                doubleColorBallAnimationView.setVisibility(8);
            }
        }
        ((TuxButton) this.f119574c.findViewById(R.id.ku)).setOnClickListener(new f(this, hVar));
        TuxButton tuxButton = (TuxButton) this.f119574c.findViewById(R.id.kw);
        tuxButton.setOnClickListener(new g(this, hVar));
        if (hVar.f119515k == null || !hVar.f119515k.booleanValue()) {
            l.b(tuxButton, "");
            tuxButton.setText(this.f119592d.getString(R.string.f60));
            tuxButton.a(Integer.valueOf((int) R.raw.icon_bookmark));
        } else {
            l.b(tuxButton, "");
            tuxButton.setText(this.f119592d.getString(R.string.f5y));
            tuxButton.a(Integer.valueOf((int) R.raw.icon_bookmark_fill));
        }
        if (hVar.f119509b == null) {
            View findViewById = this.f119574c.findViewById(R.id.fhq);
            l.b(findViewById, "");
            ((SmartImageView) findViewById).setVisibility(8);
        } else {
            SmartImageView smartImageView = (SmartImageView) this.f119574c.findViewById(R.id.fhq);
            if (smartImageView != null) {
                smartImageView.setVisibility(0);
                com.ss.android.ugc.aweme.qna.b.a.a(smartImageView, hVar.f119509b.f119526c);
                smartImageView.setOnClickListener(new b(this, hVar));
            }
        }
        if (hVar.n) {
            View findViewById2 = this.f119574c.findViewById(R.id.dex);
            l.b(findViewById2, "");
            ((TuxIconView) findViewById2).setVisibility(0);
            ((TuxIconView) this.f119574c.findViewById(R.id.dex)).setOnClickListener(new h(this, hVar));
        } else {
            View findViewById3 = this.f119574c.findViewById(R.id.dex);
            l.b(findViewById3, "");
            ((TuxIconView) findViewById3).setVisibility(8);
        }
        List<User> list = hVar.f119513f;
        if (!(list == null || (multiAvatarView = (MultiAvatarView) this.f119574c.findViewById(R.id.pf)) == null)) {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            int a2 = h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            multiAvatarView.a(a2, h.g.a.a(TypedValue.applyDimension(1, 13.5f, system2.getDisplayMetrics())));
            multiAvatarView.a(list, 0);
            multiAvatarView.setOnClickListener(new c(list, this, hVar));
        }
        String str2 = hVar.f119510c;
        if (str2 != null) {
            View findViewById4 = this.f119574c.findViewById(R.id.po);
            l.b(findViewById4, "");
            ((TuxTextView) findViewById4).setText(str2);
        }
        String str3 = hVar.f119511d;
        if (str3 != null) {
            TuxTextView tuxTextView2 = (TuxTextView) this.f119574c.findViewById(R.id.dga);
            l.b(tuxTextView2, "");
            tuxTextView2.setText(new h.m.l("(?m)^[ \t]*\r?\n").replace(str3, ""));
            int i3 = 3;
            if (gb.a()) {
                i2 = 4;
            } else {
                i2 = 3;
            }
            tuxTextView2.setTextDirection(i2);
            if (gb.a()) {
                i3 = 5;
            }
            tuxTextView2.setGravity(i3);
            EOYServiceImpl.b().a((TextView) this.f119574c.findViewById(R.id.dga));
        }
        ((LinearLayout) this.f119574c.findViewById(R.id.eep)).setOnClickListener(new e(this, hVar));
        String str4 = hVar.f119512e;
        if (str4 != null) {
            View findViewById5 = this.f119574c.findViewById(R.id.dgc);
            l.b(findViewById5, "");
            ((TuxTextView) findViewById5).setText(str4);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(i iVar, View view, Context context, com.ss.android.ugc.aweme.qna.g.e eVar) {
        super(view);
        l.d(iVar, "");
        l.d(view, "");
        l.d(context, "");
        this.f119591b = iVar;
        this.f119592d = context;
        this.f119593e = eVar;
    }
}

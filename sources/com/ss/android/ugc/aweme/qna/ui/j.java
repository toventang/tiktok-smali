package com.ss.android.ugc.aweme.qna.ui;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.comment.ui.CommentTranslationStatusView;
import com.ss.android.ugc.aweme.qna.model.f;
import com.ss.android.ugc.aweme.qna.model.g;
import com.ss.android.ugc.aweme.qna.model.k;
import com.ss.android.ugc.aweme.qna.vm.i;
import com.ss.android.ugc.aweme.service.EOYServiceImpl;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class j extends g {

    /* renamed from: a  reason: collision with root package name */
    public final i f119576a;

    /* renamed from: b  reason: collision with root package name */
    private g f119577b;

    static {
        Covode.recordClassIndex(77694);
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f119583a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ConstraintLayout f119584b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f119585c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f119586d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.j f119587e;

        static {
            Covode.recordClassIndex(77696);
        }

        b(String str, ConstraintLayout constraintLayout, j jVar, f fVar, com.ss.android.ugc.aweme.qna.model.j jVar2) {
            this.f119583a = str;
            this.f119584b = constraintLayout;
            this.f119585c = jVar;
            this.f119586d = fVar;
            this.f119587e = jVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f119585c.f119576a.a(this.f119583a, "click_question");
        }
    }

    static final class a implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f119578a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ConstraintLayout f119579b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f119580c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f119581d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.j f119582e;

        static {
            Covode.recordClassIndex(77695);
        }

        a(String str, ConstraintLayout constraintLayout, j jVar, f fVar, com.ss.android.ugc.aweme.qna.model.j jVar2) {
            this.f119578a = str;
            this.f119579b = constraintLayout;
            this.f119580c = jVar;
            this.f119581d = fVar;
            this.f119582e = jVar2;
        }

        public final boolean onLongClick(View view) {
            this.f119580c.f119576a.a(new com.ss.android.ugc.aweme.qna.vm.b(this.f119578a, this.f119582e.f119520a, "TODO", ((g) this.f119581d).f119506l, this.f119582e.f119523d));
            return true;
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f119588a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f119589b;

        static {
            Covode.recordClassIndex(77697);
        }

        c(j jVar, g gVar) {
            this.f119588a = jVar;
            this.f119589b = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f119588a.f119576a.a(this.f119589b.f119499b, this.f119589b.f119501d);
        }
    }

    @Override // com.ss.android.ugc.aweme.qna.ui.g
    public final void a(f fVar) {
        String str;
        int i2;
        String str2;
        String str3;
        l.d(fVar, "");
        super.a(fVar);
        g gVar = (g) fVar;
        com.ss.android.ugc.aweme.qna.model.j jVar = gVar.f119505k;
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) this.f119574c.findViewById(R.id.dg3);
        String str4 = null;
        if (smartAvatarImageView != null) {
            g gVar2 = this.f119577b;
            if (gVar2 != null) {
                str3 = gVar2.f119503f;
            } else {
                str3 = null;
            }
            if (!l.a((Object) str3, (Object) gVar.f119503f)) {
                com.ss.android.ugc.aweme.qna.b.a.a(smartAvatarImageView, gVar.f119503f);
            }
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f119574c.findViewById(R.id.dg5);
        if (!(constraintLayout == null || (str2 = fVar.f119497h) == null)) {
            constraintLayout.setOnLongClickListener(new a(str2, constraintLayout, this, fVar, jVar));
            constraintLayout.setOnClickListener(new b(str2, constraintLayout, this, fVar, jVar));
        }
        TuxTextView tuxTextView = (TuxTextView) this.f119574c.findViewById(R.id.dg4);
        if (tuxTextView != null) {
            tuxTextView.setText(gVar.f119500c);
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.f119574c.findViewById(R.id.dg8);
        if (tuxTextView2 != null) {
            tuxTextView2.setText(gVar.f119507m);
        }
        TuxTextView tuxTextView3 = (TuxTextView) this.f119574c.findViewById(R.id.dg6);
        if (tuxTextView3 != null) {
            String str5 = gVar.f119501d;
            if (str5 != null) {
                str4 = new h.m.l("(?m)^[ \t]*\r?\n").replace(str5, "");
            }
            tuxTextView3.setText(str4);
            int i3 = 3;
            if (gb.a()) {
                i2 = 4;
            } else {
                i2 = 3;
            }
            tuxTextView3.setTextDirection(i2);
            if (gb.a()) {
                i3 = 5;
            }
            tuxTextView3.setGravity(i3);
            EOYServiceImpl.b().a(tuxTextView3);
        }
        CommentTranslationStatusView commentTranslationStatusView = (CommentTranslationStatusView) this.f119574c.findViewById(R.id.eqo);
        if (commentTranslationStatusView != null) {
            if (jVar.f119521b) {
                commentTranslationStatusView.setVisibility(0);
                commentTranslationStatusView.setLoading(true);
                commentTranslationStatusView.setLoadingText(R.string.amp);
            } else {
                commentTranslationStatusView.setVisibility(8);
            }
        }
        TuxTextView tuxTextView4 = (TuxTextView) this.f119574c.findViewById(R.id.dg7);
        if (tuxTextView4 != null) {
            tuxTextView4.setText(gVar.f119502e);
        }
        SmartImageView smartImageView = (SmartImageView) this.f119574c.findViewById(R.id.dg9);
        if (smartImageView != null) {
            k kVar = gVar.f119499b;
            if (kVar == null || (str = kVar.f119526c) == null) {
                smartImageView.setVisibility(8);
            } else {
                com.ss.android.ugc.aweme.qna.b.a.a(smartImageView, str);
                smartImageView.setOnClickListener(new c(this, gVar));
                smartImageView.setVisibility(0);
            }
        }
        this.f119577b = gVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(i iVar, View view) {
        super(view);
        l.d(iVar, "");
        l.d(view, "");
        this.f119576a = iVar;
    }
}

package com.ss.android.ugc.aweme.qna.ui;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.comment.ui.CommentTranslationStatusView;
import com.ss.android.ugc.aweme.qna.model.j;
import com.ss.android.ugc.aweme.qna.model.k;
import com.ss.android.ugc.aweme.qna.vm.i;
import com.ss.android.ugc.aweme.service.EOYServiceImpl;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class f extends g {

    /* renamed from: a  reason: collision with root package name */
    public final i f119538a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f119539b;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.qna.model.c f119540d;

    static {
        Covode.recordClassIndex(77682);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f119541a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ConstraintLayout f119542b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f119543c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.f f119544d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.c f119545e;

        static {
            Covode.recordClassIndex(77683);
        }

        a(String str, ConstraintLayout constraintLayout, f fVar, com.ss.android.ugc.aweme.qna.model.f fVar2, com.ss.android.ugc.aweme.qna.model.c cVar) {
            this.f119541a = str;
            this.f119542b = constraintLayout;
            this.f119543c = fVar;
            this.f119544d = fVar2;
            this.f119545e = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f119543c.f119538a.a(this.f119541a, "click_answer");
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f119551a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.c f119552b;

        static {
            Covode.recordClassIndex(77685);
        }

        c(f fVar, com.ss.android.ugc.aweme.qna.model.c cVar) {
            this.f119551a = fVar;
            this.f119552b = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f119551a.f119538a.a(this.f119552b.f119481a);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f119553a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.c f119554b;

        static {
            Covode.recordClassIndex(77686);
        }

        d(f fVar, com.ss.android.ugc.aweme.qna.model.c cVar) {
            this.f119553a = fVar;
            this.f119554b = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f119553a.f119538a.a(this.f119554b.f119481a);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.e f119555a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f119556b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.c f119557c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.f f119558d;

        static {
            Covode.recordClassIndex(77687);
        }

        e(com.ss.android.ugc.aweme.qna.model.e eVar, f fVar, com.ss.android.ugc.aweme.qna.model.c cVar, com.ss.android.ugc.aweme.qna.model.f fVar2) {
            this.f119555a = eVar;
            this.f119556b = fVar;
            this.f119557c = cVar;
            this.f119558d = fVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f119556b.f119538a.a(this.f119555a.f119493d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.f$f  reason: collision with other inner class name */
    static final class View$OnClickListenerC3088f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.e f119559a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f119560b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.c f119561c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.f f119562d;

        static {
            Covode.recordClassIndex(77688);
        }

        View$OnClickListenerC3088f(com.ss.android.ugc.aweme.qna.model.e eVar, f fVar, com.ss.android.ugc.aweme.qna.model.c cVar, com.ss.android.ugc.aweme.qna.model.f fVar2) {
            this.f119559a = eVar;
            this.f119560b = fVar;
            this.f119561c = cVar;
            this.f119562d = fVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f119560b.f119538a.a(this.f119559a.f119493d);
        }
    }

    static final class b implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f119546a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ConstraintLayout f119547b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f119548c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.f f119549d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.c f119550e;

        static {
            Covode.recordClassIndex(77684);
        }

        b(String str, ConstraintLayout constraintLayout, f fVar, com.ss.android.ugc.aweme.qna.model.f fVar2, com.ss.android.ugc.aweme.qna.model.c cVar) {
            this.f119546a = str;
            this.f119547b = constraintLayout;
            this.f119548c = fVar;
            this.f119549d = fVar2;
            this.f119550e = cVar;
        }

        public final boolean onLongClick(View view) {
            this.f119548c.f119538a.a(new com.ss.android.ugc.aweme.qna.vm.b(this.f119546a, this.f119550e.f119486f.f119520a, "TODO", this.f119550e.f119486f.f119523d));
            return true;
        }
    }

    static final class h implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f119568a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f119569b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.e f119570c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f119571d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.c f119572e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.f f119573f;

        static {
            Covode.recordClassIndex(77690);
        }

        h(String str, View view, com.ss.android.ugc.aweme.qna.model.e eVar, f fVar, com.ss.android.ugc.aweme.qna.model.c cVar, com.ss.android.ugc.aweme.qna.model.f fVar2) {
            this.f119568a = str;
            this.f119569b = view;
            this.f119570c = eVar;
            this.f119571d = fVar;
            this.f119572e = cVar;
            this.f119573f = fVar2;
        }

        public final boolean onLongClick(View view) {
            this.f119571d.f119538a.a(new com.ss.android.ugc.aweme.qna.vm.b(this.f119568a, this.f119572e.f119486f.f119520a, "TODO", this.f119572e.f119486f.f119523d));
            return true;
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f119563a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.e f119564b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f119565c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.c f119566d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.model.f f119567e;

        static {
            Covode.recordClassIndex(77689);
        }

        g(View view, com.ss.android.ugc.aweme.qna.model.e eVar, f fVar, com.ss.android.ugc.aweme.qna.model.c cVar, com.ss.android.ugc.aweme.qna.model.f fVar2) {
            this.f119563a = view;
            this.f119564b = eVar;
            this.f119565c = fVar;
            this.f119566d = cVar;
            this.f119567e = fVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            List<k> list = this.f119564b.f119494e;
            if (list != null && (!list.isEmpty())) {
                this.f119565c.f119538a.a(list.get(0), this.f119566d.f119483c);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.qna.ui.g
    public final void a(com.ss.android.ugc.aweme.qna.model.f fVar) {
        String str;
        com.ss.android.ugc.aweme.qna.model.e eVar;
        String str2;
        int i2;
        String str3;
        String str4;
        l.d(fVar, "");
        super.a(fVar);
        com.ss.android.ugc.aweme.qna.model.c cVar = (com.ss.android.ugc.aweme.qna.model.c) fVar;
        j jVar = cVar.f119486f;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f119574c.findViewById(R.id.l0);
        if (!(constraintLayout == null || (str4 = fVar.f119497h) == null)) {
            constraintLayout.setOnClickListener(new a(str4, constraintLayout, this, fVar, cVar));
            constraintLayout.setOnLongClickListener(new b(str4, constraintLayout, this, fVar, cVar));
        }
        SmartImageView smartImageView = (SmartImageView) this.f119574c.findViewById(R.id.ky);
        String str5 = null;
        if (smartImageView != null) {
            com.ss.android.ugc.aweme.qna.model.c cVar2 = this.f119540d;
            if (cVar2 != null) {
                str3 = cVar2.f119484d;
            } else {
                str3 = null;
            }
            if (!l.a((Object) str3, (Object) cVar.f119484d)) {
                com.ss.android.ugc.aweme.qna.b.a.a(smartImageView, cVar.f119484d);
                smartImageView.setOnClickListener(new c(this, cVar));
            }
        }
        TuxTextView tuxTextView = (TuxTextView) this.f119574c.findViewById(R.id.kz);
        if (tuxTextView != null) {
            tuxTextView.setText(cVar.f119482b);
            tuxTextView.setOnClickListener(new d(this, cVar));
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.f119574c.findViewById(R.id.l1);
        if (tuxTextView2 != null) {
            String str6 = cVar.f119483c;
            if (str6 != null) {
                str2 = new h.m.l("(?m)^[ \t]*\r?\n").replace(str6, "");
            } else {
                str2 = null;
            }
            tuxTextView2.setText(str2);
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
            EOYServiceImpl.b().a(tuxTextView2);
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
        com.ss.android.ugc.aweme.qna.model.e eVar2 = cVar.f119485e;
        if (eVar2 != null) {
            SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) this.f119574c.findViewById(R.id.l3);
            if (smartAvatarImageView != null) {
                com.ss.android.ugc.aweme.qna.model.c cVar3 = this.f119540d;
                if (!(cVar3 == null || (eVar = cVar3.f119485e) == null)) {
                    str5 = eVar.f119490a;
                }
                if (!l.a((Object) str5, (Object) eVar2.f119490a)) {
                    com.ss.android.ugc.aweme.qna.b.a.a(smartAvatarImageView, eVar2.f119490a);
                    smartAvatarImageView.setOnClickListener(new e(eVar2, this, cVar, fVar));
                }
            }
            TuxTextView tuxTextView3 = (TuxTextView) this.f119574c.findViewById(R.id.l5);
            if (tuxTextView3 != null) {
                tuxTextView3.setText(eVar2.f119491b);
                tuxTextView3.setOnClickListener(new View$OnClickListenerC3088f(eVar2, this, cVar, fVar));
            }
            TuxTextView tuxTextView4 = (TuxTextView) this.f119574c.findViewById(R.id.l4);
            if (tuxTextView4 != null) {
                tuxTextView4.setText(eVar2.f119492c);
            }
            RecyclerView recyclerView = (RecyclerView) this.f119574c.findViewById(R.id.l6);
            if (recyclerView != null) {
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                linearLayoutManager.b(0);
                recyclerView.setLayoutManager(linearLayoutManager);
                c cVar4 = new c(this.f119538a, cVar.f119483c);
                recyclerView.setAdapter(cVar4);
                List<k> list = eVar2.f119494e;
                if (list != null) {
                    cVar4.a(list);
                }
            }
            View findViewById = this.f119574c.findViewById(R.id.ee8);
            if (!(findViewById == null || (str = fVar.f119497h) == null)) {
                findViewById.setOnClickListener(new g(findViewById, eVar2, this, cVar, fVar));
                findViewById.setOnLongClickListener(new h(str, findViewById, eVar2, this, cVar, fVar));
            }
        }
        this.f119540d = cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(i iVar, View view, Context context) {
        super(view);
        l.d(iVar, "");
        l.d(view, "");
        l.d(context, "");
        this.f119538a = iVar;
        this.f119539b = context;
    }
}

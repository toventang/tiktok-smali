package com.ss.android.ugc.aweme.inbox.widget.multi.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity;
import com.ss.android.ugc.aweme.notification.utils.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class d extends f<com.ss.android.ugc.aweme.inbox.widget.multi.d> implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f104427a;

    /* renamed from: b  reason: collision with root package name */
    private final h f104428b;

    /* renamed from: c  reason: collision with root package name */
    private final h f104429c;

    /* renamed from: d  reason: collision with root package name */
    private final h f104430d;

    static {
        Covode.recordClassIndex(66871);
    }

    static final class a extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66872);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.exo);
        }
    }

    static final class b extends m implements h.f.a.a<RelativeLayout> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66873);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RelativeLayout invoke() {
            return this.$itemView.findViewById(R.id.cxx);
        }
    }

    static final class c extends m implements h.f.a.a<TuxIconView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66874);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxIconView invoke() {
            return this.$itemView.findViewById(R.id.dn7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.d$d  reason: collision with other inner class name */
    static final class C2658d extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66875);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2658d(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.f9l);
        }
    }

    private static boolean f() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.a.f
    public final void bJ_() {
        r.a("show_follow_request", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "notification_page").a("message_number", ((com.ss.android.ugc.aweme.inbox.widget.multi.d) c()).f104453a).f66730a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.inbox.widget.multi.k] */
    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.a.f
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.inbox.widget.multi.d dVar) {
        com.ss.android.ugc.aweme.inbox.widget.multi.d dVar2 = dVar;
        l.d(dVar2, "");
        TuxTextView tuxTextView = (TuxTextView) this.f104429c.getValue();
        l.b(tuxTextView, "");
        tuxTextView.setText(com.ss.android.ugc.aweme.i18n.b.a((long) dVar2.f104453a));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.a.f
    public final void b(com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        boolean z;
        l.d(bVar, "");
        super.b(bVar);
        if (bVar.f104373a != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View view = this.itemView;
            l.b(view, "");
            View view2 = this.itemView;
            l.b(view2, "");
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.height = bVar.f104373a;
            view.setLayoutParams(layoutParams);
        }
        if (bVar.f104377e != -1) {
            ((TuxTextView) this.f104430d.getValue()).setTuxFont(bVar.f104377e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view) {
        super(view);
        l.d(view, "");
        h a2 = i.a((h.f.a.a) new b(view));
        this.f104427a = a2;
        h a3 = i.a((h.f.a.a) new c(view));
        this.f104428b = a3;
        this.f104429c = i.a((h.f.a.a) new a(view));
        this.f104430d = i.a((h.f.a.a) new C2658d(view));
        g.a((RelativeLayout) a2.getValue());
        view.setOnClickListener(this);
        if (com.ss.android.ugc.aweme.inbox.b.c.b()) {
            ((TuxIconView) a3.getValue()).setTintColorRes(R.attr.bc);
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        com.bytedance.ies.ugc.appcontext.d.a();
        if (!j.f107226e || !j.b() || j.c()) {
            j.f107226e = f();
        }
        if (!j.f107226e) {
            new com.bytedance.tux.g.b(e()).e(R.string.de8).b();
            return;
        }
        MusFollowRequestDetailActivity.a.a(e(), Integer.valueOf(((com.ss.android.ugc.aweme.inbox.widget.multi.d) c()).f104453a));
        r.a("enter_follow_request", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "notification_page").f66730a);
    }
}

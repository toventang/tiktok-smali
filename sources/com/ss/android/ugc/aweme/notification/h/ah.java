package com.ss.android.ugc.aweme.notification.h;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity;
import com.ss.android.ugc.aweme.notification.bean.d;
import com.ss.android.ugc.aweme.notification.utils.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class ah extends p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static final a f113515a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f113516b;

    /* renamed from: c  reason: collision with root package name */
    private final h f113517c;

    /* renamed from: d  reason: collision with root package name */
    private d f113518d;

    /* renamed from: e  reason: collision with root package name */
    private final Fragment f113519e;

    static {
        Covode.recordClassIndex(72984);
    }

    private final RelativeLayout c() {
        return (RelativeLayout) this.f113516b.getValue();
    }

    private final TuxTextView h() {
        return (TuxTextView) this.f113517c.getValue();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final boolean e() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72985);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(72986);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.exo);
        }
    }

    static final class c extends m implements h.f.a.a<RelativeLayout> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(72987);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RelativeLayout invoke() {
            return this.$itemView.findViewById(R.id.cxx);
        }
    }

    private static boolean i() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final void bY_() {
        int i2;
        super.bY_();
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "notification_page");
        d dVar = this.f113518d;
        if (dVar != null) {
            i2 = dVar.f113238a;
        } else {
            i2 = 0;
        }
        r.a("show_follow_request", a2.a("message_number", i2).f66730a);
    }

    public final void a(d dVar) {
        l.d(dVar, "");
        this.f113518d = dVar;
        TuxTextView h2 = h();
        l.b(h2, "");
        h2.setText(com.ss.android.ugc.aweme.i18n.b.a((long) dVar.f113238a));
        if (com.ss.android.ugc.aweme.inbox.a.a.d()) {
            h().setCompoundDrawables(null, null, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void onClick(View view) {
        int i2;
        ClickAgent.onClick(view);
        com.bytedance.ies.ugc.appcontext.d.a();
        if (!j.f107226e || !j.b() || j.c()) {
            j.f107226e = i();
        }
        if (!j.f107226e) {
            View view2 = this.itemView;
            l.b(view2, "");
            new com.bytedance.tux.g.b(view2).e(R.string.de8).b();
            return;
        }
        Fragment fragment = this.f113519e;
        d dVar = this.f113518d;
        if (dVar != null) {
            i2 = dVar.f113238a;
        } else {
            i2 = 0;
        }
        MusFollowRequestDetailActivity.a.a(fragment, Integer.valueOf(i2));
        r.a("enter_follow_request", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "notification_page").f66730a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ah(View view, Fragment fragment) {
        super(view);
        l.d(view, "");
        l.d(fragment, "");
        this.f113519e = fragment;
        this.f113516b = i.a((h.f.a.a) new c(view));
        this.f113517c = i.a((h.f.a.a) new b(view));
        g.a(c());
        c().setOnClickListener(this);
    }
}

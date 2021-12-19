package com.ss.android.ugc.aweme.inbox.widget.multi.a;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.badge.TuxAlertBadge;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import java.util.List;
import java.util.Objects;

public final class a extends f<com.ss.android.ugc.aweme.inbox.widget.multi.b> {

    /* renamed from: a  reason: collision with root package name */
    public final String f104414a = "1";

    /* renamed from: b  reason: collision with root package name */
    public final String f104415b = "0";

    /* renamed from: c  reason: collision with root package name */
    public String f104416c;

    /* renamed from: d  reason: collision with root package name */
    public String f104417d;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f104418k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f104419l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f104420m;
    private final h.h n;
    private final h.h o;
    private final h.h p;
    private final h.h q;
    private final h.h r;
    private final h.h s;
    private final Runnable t;

    static {
        Covode.recordClassIndex(66856);
    }

    private final TuxIconView f() {
        return (TuxIconView) this.f104418k.getValue();
    }

    private final LinearLayoutCompat g() {
        return (LinearLayoutCompat) this.f104420m.getValue();
    }

    private final AvatarImageView h() {
        return (AvatarImageView) this.n.getValue();
    }

    private final TuxTextView i() {
        return (TuxTextView) this.o.getValue();
    }

    private final TuxAlertBadge j() {
        return (TuxAlertBadge) this.p.getValue();
    }

    private final TuxTextView k() {
        return (TuxTextView) this.q.getValue();
    }

    private final TuxIconView l() {
        return (TuxIconView) this.r.getValue();
    }

    private final int m() {
        return ((Number) this.s.getValue()).intValue();
    }

    public final TuxTextView a() {
        return (TuxTextView) this.f104419l.getValue();
    }

    static final class b extends m implements h.f.a.a<LinearLayoutCompat> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66859);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayoutCompat invoke() {
            return this.$itemView.findViewById(R.id.cbb);
        }
    }

    static final class c extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66860);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.cba);
        }
    }

    static final class d extends m implements h.f.a.a<TuxIconView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66861);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxIconView invoke() {
            return this.$itemView.findViewById(R.id.bts);
        }
    }

    static final class e extends m implements h.f.a.a<TuxIconView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66862);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxIconView invoke() {
            return this.$itemView.findViewById(R.id.q3);
        }
    }

    static final class f extends m implements h.f.a.a<AvatarImageView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66863);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AvatarImageView invoke() {
            return this.$itemView.findViewById(R.id.c1a);
        }
    }

    static final class g extends m implements h.f.a.a<TuxAlertBadge> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66864);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxAlertBadge invoke() {
            return this.$itemView.findViewById(R.id.cbc);
        }
    }

    static final class h extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66865);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.cbd);
        }
    }

    static final class i extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66866);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.q4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.a$a  reason: collision with other inner class name */
    static final class C2657a extends m implements h.f.a.a<Integer> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66858);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2657a(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(androidx.core.content.b.c(this.$itemView.getContext(), R.color.b6));
        }
    }

    static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f104422a;

        static {
            Covode.recordClassIndex(66867);
        }

        j(a aVar) {
            this.f104422a = aVar;
        }

        public final void run() {
            List<String> list;
            String str;
            com.ss.android.ugc.aweme.inbox.widget.multi.b bVar = (com.ss.android.ugc.aweme.inbox.widget.multi.b) this.f104422a.c();
            if (bVar != null && bVar.f104443b != null && (list = ((com.ss.android.ugc.aweme.inbox.widget.multi.b) this.f104422a.c()).f104443b) != null && !list.isEmpty()) {
                int size = ((com.ss.android.ugc.aweme.inbox.widget.multi.b) this.f104422a.c()).f104443b.size();
                if (size % 2 == 0) {
                    h.j.e a2 = h.j.h.a((h.j.e) h.j.h.a(0, size), 2);
                    int i2 = a2.f158747a;
                    int i3 = a2.f158748b;
                    int i4 = a2.f158749c;
                    if (i4 >= 0) {
                        if (i2 > i3) {
                            return;
                        }
                    } else if (i2 < i3) {
                        return;
                    }
                    while (true) {
                        String str2 = ((com.ss.android.ugc.aweme.inbox.widget.multi.b) this.f104422a.c()).f104443b.get(i2);
                        TuxTextView a3 = this.f104422a.a();
                        l.b(a3, "");
                        float measureText = a3.getPaint().measureText(str2);
                        TuxTextView a4 = this.f104422a.a();
                        l.b(a4, "");
                        if (measureText <= ((float) a4.getWidth())) {
                            TuxTextView a5 = this.f104422a.a();
                            l.b(a5, "");
                            a5.setText(str2);
                            a aVar = this.f104422a;
                            aVar.f104416c = ((com.ss.android.ugc.aweme.inbox.widget.multi.b) aVar.c()).f104443b.get(i2 + 1);
                            a aVar2 = this.f104422a;
                            if (i2 == 0) {
                                str = aVar2.f104415b;
                            } else {
                                str = aVar2.f104414a;
                            }
                            aVar2.f104417d = str;
                            if (this.f104422a.d() != null) {
                                MultiViewModel.a((com.ss.android.ugc.aweme.inbox.widget.multi.b) this.f104422a.c(), this.f104422a.f104416c, this.f104422a.f104417d);
                                return;
                            }
                            return;
                        } else if (i2 != i3) {
                            i2 += i4;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    private final void a(boolean z) {
        if (z) {
            AvatarImageView h2 = h();
            l.b(h2, "");
            com.facebook.drawee.f.a aVar = (com.facebook.drawee.f.a) h2.getHierarchy();
            l.b(aVar, "");
            com.facebook.drawee.f.e eVar = aVar.f47454a;
            if (eVar != null) {
                int m2 = m();
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                eVar.a(m2, TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics()));
                return;
            }
            return;
        }
        AvatarImageView h3 = h();
        l.b(h3, "");
        com.facebook.drawee.f.a aVar2 = (com.facebook.drawee.f.a) h3.getHierarchy();
        l.b(aVar2, "");
        com.facebook.drawee.f.e eVar2 = aVar2.f47454a;
        if (eVar2 != null) {
            eVar2.c(0.0f);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        l.d(view, "");
        this.f104418k = h.i.a((h.f.a.a) new e(view));
        this.f104419l = h.i.a((h.f.a.a) new i(view));
        this.f104420m = h.i.a((h.f.a.a) new b(view));
        this.n = h.i.a((h.f.a.a) new f(view));
        this.o = h.i.a((h.f.a.a) new c(view));
        this.p = h.i.a((h.f.a.a) new g(view));
        this.q = h.i.a((h.f.a.a) new h(view));
        this.r = h.i.a((h.f.a.a) new d(view));
        this.f104416c = "";
        this.f104417d = "0";
        this.s = h.i.a((h.f.a.a) new C2657a(view));
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.inbox.widget.multi.a.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f104421a;

            static {
                Covode.recordClassIndex(66857);
            }

            {
                this.f104421a = r1;
            }

            public final void onClick(View view) {
                String str;
                ClickAgent.onClick(view);
                if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                    this.f104421a.d();
                    com.ss.android.ugc.aweme.inbox.widget.multi.b bVar = (com.ss.android.ugc.aweme.inbox.widget.multi.b) this.f104421a.c();
                    String str2 = this.f104421a.f104416c;
                    String str3 = this.f104421a.f104417d;
                    l.d(bVar, "");
                    l.d(str2, "");
                    l.d(str3, "");
                    MultiViewModel.a("click", bVar, str2, str3);
                    com.ss.android.ugc.aweme.inbox.d.e.a();
                    if (((com.ss.android.ugc.aweme.inbox.widget.multi.b) this.f104421a.c()).f104442a == com.ss.android.ugc.aweme.inbox.widget.multi.e.FOLLOWER) {
                        str = "aweme://user/inbox/follower";
                    } else {
                        str = "aweme://user/notification";
                    }
                    SmartRouter.buildRoute(this.f104421a.e().requireActivity(), str).open();
                }
            }
        });
        this.t = new j(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.a.f
    public final void b(com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        boolean z;
        com.ss.android.ugc.aweme.inbox.widget.b bVar2;
        l.d(bVar, "");
        super.b(bVar);
        if (bVar.f104374b != -1) {
            z = true;
        } else {
            z = false;
        }
        com.ss.android.ugc.aweme.inbox.widget.b bVar3 = null;
        if (z) {
            TuxIconView f2 = f();
            l.b(f2, "");
            TuxIconView f3 = f();
            l.b(f3, "");
            ViewGroup.LayoutParams layoutParams = f3.getLayoutParams();
            layoutParams.width = bVar.f104374b;
            layoutParams.height = bVar.f104374b;
            f2.setLayoutParams(layoutParams);
        }
        if (bVar.f104377e != -1) {
            a().setTuxFont(bVar.f104377e);
        }
        if (bVar.f104378f != -1) {
            a().a((float) bVar.f104378f);
        }
        if (bVar.f104379g != -1) {
            i().setTuxFont(bVar.f104379g);
        }
        if (bVar.f104381i != -1) {
            i().setTextColor(bVar.f104381i);
        }
        if (bVar.f104382j != -1) {
            bVar2 = bVar;
        } else {
            bVar2 = null;
        }
        if (bVar2 != null) {
            LinearLayoutCompat g2 = g();
            l.b(g2, "");
            if (g2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                LinearLayoutCompat g3 = g();
                l.b(g3, "");
                LinearLayoutCompat g4 = g();
                l.b(g4, "");
                ViewGroup.LayoutParams layoutParams2 = g4.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.topMargin = bVar2.f104382j;
                g3.setLayoutParams(marginLayoutParams);
            }
        }
        if (bVar.f104385m != -1) {
            bVar3 = bVar;
        }
        TuxAlertBadge j2 = j();
        l.b(j2, "");
        if ((j2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && bVar3 != null) {
            TuxAlertBadge j3 = j();
            l.b(j3, "");
            TuxAlertBadge j4 = j();
            l.b(j4, "");
            ViewGroup.LayoutParams layoutParams3 = j4.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams2.setMarginStart(bVar3.f104385m);
            j3.setLayoutParams(marginLayoutParams2);
        }
        if (bVar.f104383k != -1) {
            k().setTuxFont(bVar.f104383k);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.inbox.widget.multi.k] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0195  */
    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.a.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.inbox.widget.multi.b r11) {
        /*
        // Method dump skipped, instructions count: 416
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.a.a.a(com.ss.android.ugc.aweme.inbox.widget.multi.k):void");
    }
}

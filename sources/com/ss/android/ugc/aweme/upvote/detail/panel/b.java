package com.ss.android.ugc.aweme.upvote.detail.panel;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class b extends a {

    /* renamed from: j  reason: collision with root package name */
    public static final a f142171j = new a((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    private final h f142172k = i.a((h.f.a.a) new g(this));

    /* renamed from: l  reason: collision with root package name */
    private final h f142173l = i.a((h.f.a.a) new C3794b(this));

    static {
        Covode.recordClassIndex(92928);
    }

    private final TuxButton A() {
        return (TuxButton) this.f142172k.getValue();
    }

    public final FrameLayout y() {
        return (FrameLayout) this.f142173l.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(92929);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void z() {
        a(w(), new c(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.b$b  reason: collision with other inner class name */
    static final class C3794b extends m implements h.f.a.a<FrameLayout> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(92930);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3794b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FrameLayout invoke() {
            MethodCollector.i(8925);
            FrameLayout frameLayout = new FrameLayout(this.this$0.s().getContext());
            MethodCollector.o(8925);
            return frameLayout;
        }
    }

    static final class g extends m implements h.f.a.a<TuxButton> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(92935);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxButton invoke() {
            Context context = this.this$0.s().getContext();
            l.b(context, "");
            return new TuxButton(context, null, 0, 6);
        }
    }

    private final void B() {
        MethodCollector.i(6908);
        y().addView(A());
        View s = s();
        while (true) {
            View view = null;
            if (s != null && s.getId() != R.id.af4) {
                if (s.getId() == R.id.akq && Build.VERSION.SDK_INT >= 21) {
                    s.setElevation(0.0f);
                }
                ViewParent parent = s.getParent();
                if (parent instanceof View) {
                    view = parent;
                }
                s = view;
            }
        }
        if (!(s instanceof CoordinatorLayout)) {
            s = null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) s;
        if (coordinatorLayout != null) {
            coordinatorLayout.addView(y());
            MethodCollector.o(6908);
            return;
        }
        MethodCollector.o(6908);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<l, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(92931);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(l lVar) {
            l lVar2 = lVar;
            l.d(lVar2, "");
            FrameLayout y = this.this$0.y();
            int i2 = 8;
            if (lVar2.f142201c >= 0.0f && !lVar2.f142200b) {
                i2 = 0;
            }
            y.setVisibility(i2);
            return z.f158842a;
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f142174a;

        static {
            Covode.recordClassIndex(92934);
        }

        f(b bVar) {
            this.f142174a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
            r7 = r2.f142223c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
            if (r7 != null) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            r7 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            if (r2 == null) goto L_0x0032;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
            r0 = r2.f142225e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
            if (r0 != null) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
            com.ss.android.ugc.aweme.upvote.publish.c.a(r1, new com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam(r4, "recommend_panel", r6, r7, r8));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            r8 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
            if (r2 != null) goto L_0x0020;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
            if (r6 == null) goto L_0x0024;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            r6 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
            if (r2 == null) goto L_0x002b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r10) {
            /*
                r9 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r10)
                com.ss.android.ugc.aweme.upvote.detail.panel.b r0 = r9.f142174a
                com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModel r0 = r0.v()
                com.ss.android.ugc.aweme.upvote.event.b r2 = r0.f142050d
                com.ss.android.ugc.aweme.upvote.detail.panel.b r0 = r9.f142174a
                com.ss.android.ugc.aweme.upvote.detail.panel.f r0 = r0.u()
                java.lang.String r1 = r0.f142183a
                com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam r3 = new com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam
                java.lang.String r8 = ""
                if (r2 == 0) goto L_0x001d
                java.lang.String r4 = r2.f142221a
                if (r4 != 0) goto L_0x0020
            L_0x001d:
                r4 = r8
                if (r2 == 0) goto L_0x0024
            L_0x0020:
                java.lang.String r6 = r2.f142222b
                if (r6 != 0) goto L_0x0027
            L_0x0024:
                r6 = r8
                if (r2 == 0) goto L_0x002b
            L_0x0027:
                java.lang.String r7 = r2.f142223c
                if (r7 != 0) goto L_0x002e
            L_0x002b:
                r7 = r8
                if (r2 == 0) goto L_0x0032
            L_0x002e:
                java.lang.String r0 = r2.f142225e
                if (r0 != 0) goto L_0x003b
            L_0x0032:
                java.lang.String r5 = "recommend_panel"
                r3.<init>(r4, r5, r6, r7, r8)
                com.ss.android.ugc.aweme.upvote.publish.c.a(r1, r3)
                return
            L_0x003b:
                r8 = r0
                goto L_0x0032
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.panel.b.f.onClick(android.view.View):void");
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        TuxButton A = A();
        A.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        A.setButtonVariant(0);
        A.setButtonSize(3);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        Integer valueOf = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        Integer valueOf2 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics())));
        Resources system3 = Resources.getSystem();
        l.a((Object) system3, "");
        Integer valueOf3 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 12.0f, system3.getDisplayMetrics())));
        Resources system4 = Resources.getSystem();
        l.a((Object) system4, "");
        com.bytedance.tux.h.i.b(A, valueOf, valueOf3, valueOf2, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 12.0f, system4.getDisplayMetrics()))), false, 16);
        A.setText(A.getContext().getString(((Number) com.ss.android.ugc.aweme.upvote.b.b.a(Integer.valueOf((int) R.string.f8l), Integer.valueOf((int) R.string.fd0))).intValue()));
        A.a(Integer.valueOf(((Number) com.ss.android.ugc.aweme.upvote.b.b.a(Integer.valueOf((int) R.raw.icon_raising_star), Integer.valueOf((int) R.raw.icon_repost))).intValue()));
        FrameLayout y = y();
        CoordinatorLayout.e eVar = new CoordinatorLayout.e(-1, -2);
        eVar.f2102c = 80;
        y.setLayoutParams(eVar);
        y.setId(R.id.fch);
        Context context = y.getContext();
        l.b(context, "");
        Integer a2 = com.bytedance.tux.h.d.a(context, R.attr.f159902m);
        if (a2 != null) {
            y.setBackgroundColor(a2.intValue());
        }
        B();
        f.a.a(this, w(), c.f142175a, (k) null, new d(this), 6);
        f.a.a(this, w(), d.f142176a, (k) null, new e(this), 6);
        A().setOnClickListener(new f(this));
    }

    static final class d extends m implements h.f.a.m<p, Boolean, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(92932);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, Boolean bool) {
            bool.booleanValue();
            l.d(pVar, "");
            this.this$0.z();
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.m<p, Float, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(92933);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, Float f2) {
            f2.floatValue();
            l.d(pVar, "");
            this.this$0.z();
            return z.f158842a;
        }
    }
}

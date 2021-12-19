package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features;

import android.content.res.Resources;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.f.w;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.at;
import com.ss.android.ugc.aweme.profile.ui.v2.y;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.ss.android.ugc.aweme.utils.aa;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class a extends i {
    public static final C2985a p = new C2985a((byte) 0);
    public String o = "";
    private long q;

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final c f117619a = new c();

        static {
            Covode.recordClassIndex(76061);
        }

        c() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(76058);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.a$a  reason: collision with other inner class name */
    public static final class C2985a {
        static {
            Covode.recordClassIndex(76059);
        }

        private C2985a() {
        }

        public /* synthetic */ C2985a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i
    public final com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a B() {
        return com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a.LiveEvent;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i
    public final View A() {
        return a(R.string.bqi, R.raw.icon_calendar_star, c.f117619a);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i, com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.core.a
    public final void f() {
        super.f();
        com.bytedance.assem.arch.service.d.a(this, ab.a(j.class), b.f117621a, new d(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), c.f117622a, e.f117620a);
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), d.f117623a, new f(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.c.class), e.f117624a, new g(this));
    }

    static final class e extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f117620a = new e();

        static {
            Covode.recordClassIndex(76063);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            if (aVar2 != null) {
                aVar2.f25631b.booleanValue();
            }
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76064);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            this.this$0.a((List<LiveEventStruct>) null);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76062);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            List<LiveEventStruct> list;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null || t.isBlock)) {
                T t2 = aVar2.f25631b;
                if (t2 != null) {
                    list = t2.getLiveEventStructList();
                } else {
                    list = null;
                }
                this.this$0.a(list);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117615a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f117616b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ LiveEventStruct f117617c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ User f117618d;

        static {
            Covode.recordClassIndex(76060);
        }

        b(a aVar, List list, LiveEventStruct liveEventStruct, User user) {
            this.f117615a = aVar;
            this.f117616b = list;
            this.f117617c = liveEventStruct;
            this.f117618d = user;
        }

        public final void onClick(View view) {
            androidx.fragment.app.e b2;
            androidx.fragment.app.i supportFragmentManager;
            User user;
            LiveEventStruct liveEventStruct;
            ClickAgent.onClick(view);
            boolean z = true;
            if (this.f117616b.size() == 1) {
                w.a(this.f117615a.ar_(), this.f117617c);
            } else if (!(!(!this.f117616b.isEmpty()) || (b2 = com.bytedance.assem.arch.extensions.b.b(this.f117615a)) == null || (supportFragmentManager = b2.getSupportFragmentManager()) == null)) {
                at.a.a(supportFragmentManager, this.f117618d, this.f117616b);
            }
            com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this.f117615a, ab.a(j.class));
            if (iVar != null && (user = iVar.f117705a) != null) {
                List<LiveEventStruct> liveEventStructList = user.getLiveEventStructList();
                if (liveEventStructList == null || (liveEventStruct = liveEventStructList.get(0)) == null || !liveEventStruct.isPaidEvent()) {
                    z = false;
                }
                y.a(this.f117615a.o, "click", this.f117616b.size(), y.a(user), z);
            }
        }
    }

    static final class g extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76065);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
            if (r1 != null) goto L_0x003b;
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.bytedance.assem.arch.extensions.a<? extends java.lang.Integer> r6) {
            /*
                r5 = this;
                com.bytedance.assem.arch.extensions.a r6 = (com.bytedance.assem.arch.extensions.a) r6
                if (r6 == 0) goto L_0x0050
                T r0 = r6.f25631b
                java.lang.Number r0 = (java.lang.Number) r0
                int r1 = r0.intValue()
                com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a r0 = com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a.LiveEvent
                int r0 = r0.getId()
                if (r1 != r0) goto L_0x0050
                com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.a r2 = r5.this$0
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.common.j> r0 = com.ss.android.ugc.aweme.profile.widgets.common.j.class
                h.k.c r0 = h.f.b.ab.a(r0)
                com.bytedance.assem.arch.service.a r0 = com.bytedance.assem.arch.service.d.f(r2, r0)
                com.ss.android.ugc.aweme.profile.widgets.common.i r0 = (com.ss.android.ugc.aweme.profile.widgets.common.i) r0
                if (r0 == 0) goto L_0x0050
                com.ss.android.ugc.aweme.profile.model.User r1 = r0.f117705a
                r4 = 0
                if (r1 == 0) goto L_0x0050
                java.util.List r0 = r1.getLiveEventStructList()
                if (r0 == 0) goto L_0x0053
                java.lang.Object r0 = r0.get(r4)
                com.ss.android.ugc.aweme.profile.model.LiveEventStruct r0 = (com.ss.android.ugc.aweme.profile.model.LiveEventStruct) r0
                if (r0 == 0) goto L_0x0053
                boolean r3 = r0.isPaidEvent()
            L_0x003b:
                java.lang.String r2 = r2.o
                java.util.List r0 = r1.getLiveEventStructList()
                if (r0 == 0) goto L_0x0047
                int r4 = r0.size()
            L_0x0047:
                java.lang.String r1 = com.ss.android.ugc.aweme.profile.ui.v2.y.a(r1)
                java.lang.String r0 = "show"
                com.ss.android.ugc.aweme.profile.ui.v2.y.a(r2, r0, r4, r1, r3)
            L_0x0050:
                h.z r0 = h.z.f158842a
                return r0
            L_0x0053:
                r3 = 0
                if (r1 == 0) goto L_0x0050
                goto L_0x003b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.a.g.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public final void a(List<LiveEventStruct> list) {
        User user;
        boolean z;
        String str;
        LiveEventStruct liveEventStruct;
        com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this, ab.a(j.class));
        LiveEventStruct liveEventStruct2 = null;
        if (iVar != null) {
            user = iVar.f117705a;
        } else {
            user = null;
        }
        if (list == null || list.isEmpty() || in.d()) {
            z = false;
        } else {
            z = true;
        }
        if (list != null) {
            liveEventStruct2 = list.get(0);
        }
        if (list == null || (liveEventStruct = list.get(0)) == null || (str = liveEventStruct.getId()) == null) {
            str = "";
        }
        this.o = str;
        if (user == null || !z || liveEventStruct2 == null || com.bytedance.x.c.c.a(str)) {
            z();
            return;
        }
        a(new b(this, list, liveEventStruct2, user));
        Resources resources = w().getResources();
        Object[] objArr = new Object[1];
        String e2 = aa.a.e(liveEventStruct2.getStartTime());
        if (gb.a(w())) {
            e2 = "‏".concat(String.valueOf(e2));
        }
        objArr[0] = e2;
        String string = resources.getString(R.string.bqi, objArr);
        l.b(string, "");
        b(string);
        if (System.currentTimeMillis() - this.q > 500 && x()) {
            this.q = System.currentTimeMillis();
        }
        y();
    }
}

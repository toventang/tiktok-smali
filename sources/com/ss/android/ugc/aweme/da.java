package com.ss.android.ugc.aweme;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.journey.q;
import com.ss.android.ugc.aweme.journey.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class da extends p {

    /* renamed from: k  reason: collision with root package name */
    private final h f79351k = i.a((h.f.a.a) new b(this));

    /* renamed from: l  reason: collision with root package name */
    private final h f79352l = i.a((h.f.a.a) a.f79354a);

    /* renamed from: m  reason: collision with root package name */
    private Boolean f79353m;
    private final h n = i.a((h.f.a.a) c.f79355a);

    static {
        Covode.recordClassIndex(49261);
    }

    @Override // com.ss.android.ugc.aweme.journey.p
    public final boolean S_() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.journey.p
    public final int c() {
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.journey.p
    public final String g() {
        return "resurrected";
    }

    @Override // com.ss.android.ugc.aweme.journey.p
    public final int e() {
        return ((Number) this.f79352l.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.journey.p
    public final int f() {
        return ((Number) this.n.getValue()).intValue();
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f79354a = new a();

        static {
            Covode.recordClassIndex(49262);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            int b2 = q.b();
            Keva.getRepo("new_user_journey").storeInt("update_interest_ab_params_return_user", b2);
            return Integer.valueOf(b2);
        }
    }

    static final class c extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f79355a = new c();

        static {
            Covode.recordClassIndex(49264);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            int i2;
            int a2 = com.bytedance.ies.abmock.b.a().a("return_user_journey", ClientExpManager.return_user_journey());
            if (a2 == com.ss.android.ugc.aweme.buildconfigdiff.c.f68819b) {
                i2 = 100;
            } else if (a2 == com.ss.android.ugc.aweme.buildconfigdiff.c.f68820c) {
                i2 = 101;
            } else {
                i2 = 0;
            }
            Keva.getRepo("new_user_journey").storeInt("update_interest_recommend_group_return_user", i2);
            return Integer.valueOf(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.p
    public final int d() {
        if (!((Boolean) this.f79351k.getValue()).booleanValue() || l.a((Object) this.f79353m, (Object) false)) {
            return 0;
        }
        if (this.f79353m == null) {
            return 1;
        }
        if (com.bytedance.ies.abmock.b.a().a("return_user_journey", ClientExpManager.return_user_journey()) == com.ss.android.ugc.aweme.buildconfigdiff.c.f68818a) {
            return 0;
        }
        return 2;
    }

    static final class b extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ da this$0;

        static {
            Covode.recordClassIndex(49263);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(da daVar) {
            super(0);
            this.this$0 = daVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
            if (r4 == -1) goto L_0x000a;
         */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Boolean invoke() {
            /*
                r9 = this;
                long r4 = com.ss.android.ugc.aweme.cr.f78304c
                r6 = -1
                r2 = 0
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 > 0) goto L_0x005d
            L_0x000a:
                com.ss.android.ugc.aweme.base.ui.anchor.a r0 = com.ss.android.ugc.aweme.base.ui.anchor.a.f68349a
                long r4 = r0.b()
            L_0x0010:
                r8 = 0
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 > 0) goto L_0x001a
            L_0x0015:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
                return r0
            L_0x001a:
                long r6 = java.lang.System.currentTimeMillis()
                long r6 = r6 - r4
                r4 = 2592000000(0x9a7ec800, double:1.280618154E-314)
                int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r0 >= 0) goto L_0x0029
                goto L_0x0015
            L_0x0029:
                com.ss.android.ugc.aweme.da r0 = r9.this$0
                h.h r0 = r0.f104888e
                java.lang.Object r0 = r0.getValue()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L_0x003a
                goto L_0x0015
            L_0x003a:
                boolean r0 = com.ss.android.ugc.aweme.utils.in.e()
                if (r0 == 0) goto L_0x0041
                goto L_0x0015
            L_0x0041:
                java.lang.String r0 = "new_user_journey"
                com.bytedance.keva.Keva r1 = com.bytedance.keva.Keva.getRepo(r0)
                java.lang.String r0 = "last_show_interest_select_time"
                long r0 = r1.getLong(r0, r2)
                long r3 = java.lang.System.currentTimeMillis()
                long r3 = r3 - r0
                long r1 = com.ss.android.ugc.aweme.ce.a()
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 > 0) goto L_0x005b
                goto L_0x0015
            L_0x005b:
                r8 = 1
                goto L_0x0015
            L_0x005d:
                long r4 = com.ss.android.ugc.aweme.cr.f78304c
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 != 0) goto L_0x0010
                goto L_0x000a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.da.b.invoke():java.lang.Object");
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.p
    public final void a(boolean z) {
        if (this.f79353m == null) {
            this.f79353m = Boolean.valueOf(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.p
    public final r a(Context context, Boolean bool) {
        int i2;
        l.d(context, "");
        String string = context.getString(R.string.co1);
        String string2 = context.getString(R.string.dg5);
        if (l.a((Object) bool, (Object) true)) {
            i2 = R.string.cny;
        } else {
            i2 = R.string.dg3;
        }
        return new r(string, string2, context.getString(i2), context.getString(R.string.dfy));
    }
}

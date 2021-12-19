package com.ss.android.ugc.aweme;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.experiment.gz;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.journey.r;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.i;
import h.m;

public final class cl extends p {

    /* renamed from: k  reason: collision with root package name */
    private final h f71182k = i.a((h.f.a.a) new b(this));

    /* renamed from: l  reason: collision with root package name */
    private final h f71183l = i.a((h.f.a.a) new a(this));

    /* renamed from: m  reason: collision with root package name */
    private final h f71184m = i.a(m.NONE, new c(this));

    static {
        Covode.recordClassIndex(43810);
    }

    public final int a() {
        return ((Number) this.f71183l.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.journey.p
    public final int c() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.journey.p
    public final String g() {
        return "new";
    }

    @Override // com.ss.android.ugc.aweme.journey.p
    public final int e() {
        return a();
    }

    static final class b extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ cl this$0;

        static {
            Covode.recordClassIndex(43812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(cl clVar) {
            super(0);
            this.this$0 = clVar;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            int i2;
            boolean z;
            if (cl.b()) {
                i2 = 1;
            } else if (!s.a().booleanValue() || Keva.getRepo("new_user_journey").contains("new_user_journey_show")) {
                i2 = -1;
            } else {
                i2 = this.this$0.a();
            }
            boolean z2 = false;
            if (i2 > 0) {
                z = true;
                d.a();
                if (!j.f107226e || !j.b() || j.c()) {
                    j.f107226e = a();
                }
                if (!j.f107226e) {
                    Keva.getRepo("new_user_journey").storeBoolean("new_user_journey_show", true);
                }
                z2 = z;
            } else {
                z = false;
                z2 = z;
            }
            return Boolean.valueOf(z2);
        }
    }

    public static boolean b() {
        return com.bytedance.ies.abmock.b.a().a(true, "lanuch_new_user_journey_next_time", false);
    }

    @Override // com.ss.android.ugc.aweme.journey.p
    public final int f() {
        return ((Number) this.f71184m.getValue()).intValue();
    }

    static final class c extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ cl this$0;

        static {
            Covode.recordClassIndex(43813);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(cl clVar) {
            super(0);
            this.this$0 = clVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            int a2 = this.this$0.a();
            Keva.getRepo("new_user_journey").storeInt("update_interest_recommend_group_new_user", a2);
            return Integer.valueOf(a2);
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.p
    public final int d() {
        if (((Boolean) this.f71182k.getValue()).booleanValue()) {
            return 2;
        }
        return 0;
    }

    static final class a extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ cl this$0;

        static {
            Covode.recordClassIndex(43811);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(cl clVar) {
            super(0);
            this.this$0 = clVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Integer invoke() {
            /*
            // Method dump skipped, instructions count: 142
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.cl.a.invoke():java.lang.Object");
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.p
    public final r a(Context context, Boolean bool) {
        int i2;
        int i3;
        l.d(context, "");
        if (gz.b()) {
            i2 = R.string.gk8;
        } else {
            i2 = R.string.dg5;
        }
        String string = context.getString(R.string.dfy);
        String string2 = context.getString(i2);
        if (l.a((Object) bool, (Object) true)) {
            i3 = R.string.cny;
        } else {
            i3 = R.string.dg3;
        }
        return new r(string, string2, context.getString(i3));
    }
}

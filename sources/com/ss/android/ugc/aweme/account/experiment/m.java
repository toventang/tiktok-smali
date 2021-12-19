package com.ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.s;
import h.a.am;
import h.f.b.l;
import h.h;
import h.i;
import java.util.Set;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    static final Keva f63014a;

    /* renamed from: b  reason: collision with root package name */
    public static final m f63015b = new m();

    /* renamed from: c  reason: collision with root package name */
    private static final h f63016c = i.a((h.f.a.a) b.f63020a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f63017d = i.a((h.f.a.a) c.f63021a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f63018e = i.a((h.f.a.a) a.f63019a);

    public static long a() {
        return ((Number) f63016c.getValue()).longValue();
    }

    public static int b() {
        return ((Number) f63018e.getValue()).intValue();
    }

    private m() {
    }

    static final class a extends h.f.b.m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f63019a = new a();

        static {
            Covode.recordClassIndex(38815);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(com.bytedance.ies.abmock.b.a().a("sea_nonpersonalized_popup", ClientExpManager.sea_nonpersonalized_popup()));
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f63020a = new b();

        static {
            Covode.recordClassIndex(38816);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            long currentTimeMillis;
            if (m.f63014a.contains("install_time")) {
                currentTimeMillis = m.f63014a.getLong("install_time", System.currentTimeMillis());
            } else {
                currentTimeMillis = System.currentTimeMillis();
                m.f63014a.storeLong("install_time", currentTimeMillis);
            }
            return Long.valueOf(currentTimeMillis);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f63021a = new c();

        static {
            Covode.recordClassIndex(38817);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            if (m.f63014a.contains("is_new_user")) {
                return Boolean.valueOf(m.f63014a.getBoolean("is_new_user", false));
            }
            Boolean a2 = s.a();
            Keva keva = m.f63014a;
            l.b(a2, "");
            keva.storeBoolean("is_new_user", a2.booleanValue());
            return a2;
        }
    }

    static {
        Covode.recordClassIndex(38814);
        Keva repo = Keva.getRepo("sea_nonpersonalized_repo");
        l.b(repo, "");
        f63014a = repo;
    }

    public static boolean c() {
        if (!((Boolean) f63017d.getValue()).booleanValue()) {
            return false;
        }
        Set a2 = am.a((Object[]) new String[]{"MM", "LA", "KH"});
        IAccountService a3 = AccountService.a();
        l.b(a3, "");
        if (!a2.contains(a3.b())) {
            return false;
        }
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            return false;
        }
        return true;
    }
}

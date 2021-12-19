package com.ss.android.ugc.aweme.relation;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.experiment.ds;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import f.a.d.f;
import h.f.b.l;
import h.p;
import java.util.concurrent.TimeUnit;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Keva f120336a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f120337b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f120338c;

    /* renamed from: d  reason: collision with root package name */
    private static Boolean f120339d;

    private b() {
    }

    public static final int b() {
        return f120336a.getInt("key_display_strategy", 0);
    }

    public static final boolean e() {
        if (b() == 4) {
            return true;
        }
        return false;
    }

    public static String i() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        return g2.getCurUserId();
    }

    static {
        Covode.recordClassIndex(78289);
        Keva repo = Keva.getRepo("repo_new_version_journey");
        l.b(repo, "");
        f120336a = repo;
    }

    public static void a() {
        Keva keva = f120336a;
        keva.storeBoolean("key_new_version", false);
        keva.storeBoolean("key_cache_ready_" + i(), true);
    }

    public static final boolean f() {
        return f120336a.getBoolean("key_rec_friends_has_shown_" + i(), false);
    }

    public static final boolean h() {
        return l.a((Object) f120336a.getString("key_check_status", "value_check_start"), (Object) "value_check_hasdata");
    }

    public static final boolean d() {
        if (f120339d == null) {
            boolean z = true;
            if (com.ss.android.ugc.aweme.friends.service.a.f97047a.d().c() || a(1) || !ds.a() || !com.ss.android.ugc.aweme.relation.b.b.a()) {
                z = false;
            }
            f120339d = Boolean.valueOf(z);
        }
        Boolean bool = f120339d;
        if (bool == null) {
            l.b();
        }
        return bool.booleanValue();
    }

    public static final boolean g() {
        long e2 = UgCommonServiceImpl.j().e();
        if (e2 == 0) {
            e2 = f120336a.getLong("key_first_launch_time", 0);
        }
        if (e2 == 0 || System.currentTimeMillis() - e2 < TimeUnit.DAYS.toMillis(f120336a.getLong("key_rec_friends_frequency", 30))) {
            return true;
        }
        return false;
    }

    public static final boolean c() {
        boolean z;
        if (f120338c == null) {
            boolean z2 = false;
            if (!d.d()) {
                if (!com.ss.android.ugc.aweme.friends.service.a.f97047a.g().b() && !a(2) && ds.a() && com.ss.android.ugc.aweme.relation.b.b.a()) {
                    z2 = true;
                }
                z = Boolean.valueOf(z2);
            } else {
                z = false;
            }
            f120338c = z;
        }
        Boolean bool = f120338c;
        if (bool == null) {
            l.b();
        }
        return bool.booleanValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.b$b  reason: collision with other inner class name */
    public static final class C3108b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final C3108b f120344a = new C3108b();

        static {
            Covode.recordClassIndex(78291);
        }

        C3108b() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            b.f120336a.storeString("key_check_status", "value_check_fail");
        }
    }

    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f120340a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f120341b;

        static {
            Covode.recordClassIndex(78290);
        }

        public a(boolean z, boolean z2) {
            this.f120340a = z;
            this.f120341b = z2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (((CheckMatchedFriendsResponse) obj).getHasData()) {
                if (!this.f120340a && !this.f120341b) {
                    b.a();
                }
                b.f120336a.storeString("key_check_status", "value_check_hasdata");
                return;
            }
            b.f120336a.storeBoolean("key_new_version", false);
            b.f120336a.storeString("key_check_status", "value_check_empty");
        }
    }

    private static boolean a(int i2) {
        com.ss.android.ugc.aweme.friends.service.b q = com.ss.android.ugc.aweme.friends.service.a.f97047a.q();
        if (q != null) {
            p<Boolean, Long> a2 = q.a(i2);
            if (!a2.getFirst().booleanValue() || System.currentTimeMillis() >= a2.getSecond().longValue() + 2592000000L) {
                return false;
            }
            return true;
        }
        return false;
    }
}

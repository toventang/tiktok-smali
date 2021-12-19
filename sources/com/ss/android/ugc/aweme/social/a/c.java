package com.ss.android.ugc.aweme.social.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f133647a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f133648b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f133649c = new c();

    /* renamed from: d  reason: collision with root package name */
    private static final b f133650d = b.f133635c;

    /* renamed from: e  reason: collision with root package name */
    private static String f133651e = "";

    /* renamed from: f  reason: collision with root package name */
    private static final h f133652f = i.a((h.f.a.a) a.f133653a);

    private static boolean f() {
        return ((Boolean) f133652f.getValue()).booleanValue();
    }

    private c() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f133653a = new a();

        static {
            Covode.recordClassIndex(87429);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (IMService.createIIMServicebyMonsterPlugin(false).getFriendsCount() <= 5) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public static Keva a() {
        Keva repo = Keva.getRepo("f_recommend_prefix_" + e());
        l.b(repo, "");
        return repo;
    }

    private static String e() {
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        String curUserId = g2.getCurUserId();
        if (curUserId == null) {
            return "";
        }
        return curUserId;
    }

    private static boolean g() {
        if (f() || com.ss.android.ugc.aweme.social.widget.card.i.f133800a.a().b()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(87428);
        a a2 = b.a();
        l.b(a2, "");
        f133647a = a2;
    }

    public static void d() {
        if (b.b() || b.d()) {
            a().storeInt("following_exp_ff_c", 0);
            a().storeLong("following_h_ff_t", -1);
        }
    }

    public final boolean b() {
        b.a();
        if (!b.e()) {
            return false;
        }
        if (!l.a((Object) f133651e, (Object) e())) {
            f133651e = e();
            boolean h2 = h();
            f133648b = h2;
            if (h2) {
                f133648b = g();
            }
        }
        return f133648b;
    }

    public final boolean c() {
        if (b.c()) {
            if (h() && !b()) {
                return true;
            }
            return false;
        } else if (!b.d() || !b()) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean h() {
        Integer num;
        long j2 = a().getLong("following_h_t_k", -1);
        if (j2 != -1) {
            Integer num2 = f133647a.f133632d;
            if (num2 == null) {
                return true;
            }
            if (a(System.currentTimeMillis(), j2) < ((long) num2.intValue())) {
                return false;
            }
            a().storeLong("following_h_t_k", -1);
            return true;
        }
        long j3 = a().getLong("following_h_ff_t", -1);
        if (j3 == -1 || (num = f133647a.f133631c) == null) {
            return true;
        }
        if (a(System.currentTimeMillis(), j3) < ((long) num.intValue())) {
            return false;
        }
        a().storeLong("following_h_ff_t", -1);
        a().storeInt("following_exp_ff_c", 0);
        return true;
    }

    private static long a(long j2, long j3) {
        return Math.abs((j2 - j3) / 86400000);
    }
}

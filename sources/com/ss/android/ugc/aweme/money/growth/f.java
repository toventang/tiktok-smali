package com.ss.android.ugc.aweme.money.growth;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import h.f.b.l;

public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final a f110864c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f110865a;

    /* renamed from: b  reason: collision with root package name */
    public long f110866b;

    /* renamed from: d  reason: collision with root package name */
    private final Keva f110867d;

    static {
        Covode.recordClassIndex(71132);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71133);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static String b() {
        IAccountUserService e2 = AccountService.a().e();
        l.b(e2, "");
        return e2.getCurUserId();
    }

    public f() {
        Keva repo = Keva.getRepo("money_growth_read_task");
        l.b(repo, "");
        this.f110867d = repo;
        this.f110865a = repo.getLong(a("today_timestamp"), 0);
        this.f110866b = repo.getLong(a("progress_time"), 0);
        a();
    }

    public final void a() {
        long j2 = this.f110867d.getLong(a("today_timestamp"), 0);
        this.f110865a = j2;
        this.f110867d.storeLong(a("today_timestamp"), j2);
        long j3 = this.f110867d.getLong(a("progress_time"), 0);
        this.f110866b = j3;
        this.f110867d.storeLong(a("progress_time"), j3);
    }

    private static String a(String str) {
        return str + "_" + b();
    }
}

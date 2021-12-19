package com.ss.android.ugc.aweme.discover.hitrank;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.discover.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.RetrofitService;
import h.f.b.l;
import java.util.List;
import java.util.concurrent.Callable;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static RankApi f81204a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f81205b = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(50473);
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f81206a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f81207b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f81208c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f81209d;

        static {
            Covode.recordClassIndex(50474);
        }

        a(String str, int i2, List list, String str2) {
            this.f81206a = str;
            this.f81207b = i2;
            this.f81208c = list;
            this.f81209d = str2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            RankApi rankApi = d.f81204a;
            if (rankApi == null) {
                l.b();
            }
            return rankApi.finishHitRankTask(this.f81206a, 1, this.f81207b, this.f81208c, this.f81209d).get();
        }
    }

    public static void a(User user, int i2) {
        if (b.f80832a.a(user, i2)) {
            if (user == null) {
                l.b();
            }
            a(user.getUid(), user.getSecUid(), i2, null);
        }
    }

    public final void a(Aweme aweme, int i2) {
        if (b.f80832a.a(aweme, i2)) {
            if (aweme == null) {
                l.b();
            }
            a(aweme.getAuthor(), i2);
        }
    }

    public static void a(String str, String str2, int i2, List<String> list) {
        com.ss.android.ugc.aweme.account.b.a();
        IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
        l.b(e2, "");
        if (e2.isLogin()) {
            if (f81204a == null) {
                f81204a = (RankApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.c.b.f59141e).create(RankApi.class);
            }
            i.b(new a(str, i2, list, str2), i.f4824a);
        }
    }
}

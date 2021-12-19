package com.ss.android.ugc.aweme.inbox;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.concurrent.Callable;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    static final h f104303a = i.a((h.f.a.a) b.f104307a);

    /* renamed from: b  reason: collision with root package name */
    public static final k f104304b = new k();

    /* renamed from: c  reason: collision with root package name */
    private static final h f104305c = i.a((h.f.a.a) a.f104306a);

    public static boolean a() {
        return ((Boolean) f104305c.getValue()).booleanValue();
    }

    private k() {
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final c f104308a = new c();

        static {
            Covode.recordClassIndex(66788);
        }

        c() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return Boolean.valueOf(k.a());
        }
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f104306a = new a();

        static {
            Covode.recordClassIndex(66786);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!((Boolean) k.f104303a.getValue()).booleanValue());
        }
    }

    static {
        Covode.recordClassIndex(66785);
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f104307a = new b();

        static {
            Covode.recordClassIndex(66787);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            Keva b2 = k.b();
            boolean z = false;
            int i2 = b2.getInt("expand_limit_times", 0);
            if (i2 < t.a().f104287b.f104246c) {
                if (System.currentTimeMillis() - b2.getLong("expand_limit_start", 0) >= ((long) t.a().f104287b.f104245b) * 86400000) {
                    if (b2.getInt("expand_times", 0) >= t.a().f104287b.f104244a) {
                        b2.storeLong("expand_limit_start", System.currentTimeMillis());
                        b2.storeInt("expand_times", 0);
                        b2.storeInt("expand_limit_times", i2 + 1);
                    }
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
    }

    public static Keva b() {
        String str;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        if (curUser == null || (str = curUser.getUid()) == null) {
            str = "";
        }
        Keva repo = Keva.getRepo(("inbox_collapse_" + com.ss.android.ugc.aweme.inbox.b.c.a() + "_") + str);
        l.b(repo, "");
        return repo;
    }
}

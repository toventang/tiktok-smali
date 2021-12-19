package com.ss.android.ugc.aweme.discover.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f80972a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f80973b = i.a((h.f.a.a) C1890a.f80974a);

    private static int c() {
        return ((Number) f80973b.getValue()).intValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.f.a$a  reason: collision with other inner class name */
    static final class C1890a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1890a f80974a = new C1890a();

        static {
            Covode.recordClassIndex(50340);
        }

        C1890a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "discover_add_find_friend_style", 0));
        }
    }

    static {
        Covode.recordClassIndex(50339);
    }

    public final boolean b() {
        if (!a() || c() != 2) {
            return false;
        }
        return true;
    }

    public static boolean a() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (!g2.isLogin() || in.e() || FriendsServiceImpl.s().p()) {
            return false;
        }
        if (c() == 1 || c() == 2) {
            return true;
        }
        return false;
    }
}

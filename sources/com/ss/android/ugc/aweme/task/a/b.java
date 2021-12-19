package com.ss.android.ugc.aweme.task.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.s;
import com.ss.android.ugc.aweme.utils.bo;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import java.util.Calendar;
import java.util.List;

public final class b implements r {

    /* renamed from: a  reason: collision with root package name */
    public static final a f138548a = new a((byte) 0);

    static {
        Covode.recordClassIndex(90637);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return s.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "request_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90638);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final aa b() {
        return aa.SPARSE;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    private static boolean d() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean c2 = c();
        j.f107226e = c2;
        return c2;
    }

    /* renamed from: com.ss.android.ugc.aweme.task.a.b$b  reason: collision with other inner class name */
    static final class C3652b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final C3652b f138549a = new C3652b();

        static {
            Covode.recordClassIndex(90639);
        }

        C3652b() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List friends;
            FriendList friendList = (FriendList) obj;
            if (friendList != null && (friends = friendList.getFriends()) != null) {
                Integer.valueOf(friends.size());
            }
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f138550a;

        static {
            Covode.recordClassIndex(90640);
        }

        c(String str) {
            this.f138550a = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            if (!(th2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                th = null;
            } else {
                th = th2;
            }
            com.ss.android.ugc.aweme.base.api.a.a aVar = (com.ss.android.ugc.aweme.base.api.a.a) th;
            if (aVar != null && aVar.getErrorCode() == 3002047) {
                com.ss.android.ugc.aweme.friends.service.a.f97047a.g().b(this.f138550a);
            }
            if (th2 != null) {
                th2.getMessage();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final void a(Context context, boolean z) {
        long j2;
        String str;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        String curUserId = g2.getCurUserId();
        l.b(curUserId, "");
        l.d(curUserId, "");
        long c2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.g().c(curUserId);
        long h2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.h();
        boolean b2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.g().b();
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g3, "");
        int i2 = 1;
        if (g3.isLogin() && b2 && h2 > 0) {
            d.a();
            if (d() && (c2 == -1 || c2 + h2 <= System.currentTimeMillis())) {
                com.ss.android.ugc.aweme.friends.service.a.f97047a.g().a(curUserId, System.currentTimeMillis());
                com.ss.android.ugc.aweme.friends.service.a.f97047a.a(curUserId, 20).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.h.a.b(f.a.k.a.f158006c)).a(C3652b.f138549a, new c(curUserId));
            }
        }
        boolean b3 = com.ss.android.ugc.aweme.friends.service.a.f97047a.d().b();
        boolean a2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.d().a();
        l.d(curUserId, "");
        boolean z2 = a.a().getBoolean("click_contact_open_setting".concat(String.valueOf(curUserId)), false);
        IAccountUserService g4 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g4, "");
        if (g4.isLogin() && z && b3 && !a2 && z2) {
            com.ss.android.ugc.aweme.friends.service.a.f97047a.a("cold_start");
        }
        l.d(curUserId, "");
        a.a().erase("click_contact_open_setting".concat(String.valueOf(curUserId)));
        l.d(curUserId, "");
        if (TextUtils.isEmpty(curUserId)) {
            j2 = -1;
        } else {
            j2 = a.a().getLong("last_cold_boot_time".concat(String.valueOf(curUserId)), -1);
        }
        if (z) {
            IAccountUserService g5 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g5, "");
            if (g5.isLogin() && !in.d()) {
                d.a();
                if (d() && (j2 == -1 || !bo.a(j2))) {
                    if (com.ss.android.ugc.aweme.friends.service.a.f97047a.g().a(curUserId).length() <= 0) {
                        i2 = 0;
                    }
                    long d2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.g().d(curUserId);
                    String str2 = "on";
                    if (com.ss.android.ugc.aweme.friends.service.a.f97047a.g().a()) {
                        str = str2;
                    } else {
                        str = "off";
                    }
                    boolean b4 = com.ss.android.ugc.aweme.friends.service.a.f97047a.d().b();
                    if (!com.ss.android.ugc.aweme.friends.service.a.f97047a.d().a()) {
                        str2 = "off";
                    }
                    com.ss.android.ugc.aweme.common.r.a("authorize_status_update", new com.ss.android.ugc.aweme.app.f.d().a("user_id", curUserId).a("has_fb_token", i2).a("token_expire_time", d2).a("facebook_switch", str).a("has_contact_permission", b4 ? 1 : 0).a("contact_switch", str2).f66730a);
                    if (!z) {
                        return;
                    }
                }
            }
            Calendar instance = Calendar.getInstance();
            l.b(instance, "");
            long timeInMillis = instance.getTimeInMillis();
            l.d(curUserId, "");
            if (!TextUtils.isEmpty(curUserId)) {
                a.a().storeLong("last_cold_boot_time".concat(String.valueOf(curUserId)), timeInMillis);
            }
        }
    }
}

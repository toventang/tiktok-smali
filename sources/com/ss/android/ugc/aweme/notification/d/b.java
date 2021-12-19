package com.ss.android.ugc.aweme.notification.d;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.dr;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.s;
import com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.e;
import h.f.b.l;
import java.util.List;

public final class b implements r {

    /* renamed from: a  reason: collision with root package name */
    public static final a f113327a = new a((byte) 0);

    static {
        Covode.recordClassIndex(72869);
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
            Covode.recordClassIndex(72870);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final aa b() {
        return aa.NORMAL;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public static void c() {
        String e2 = e.f142364k.e();
        if (!TextUtils.isEmpty(e2) && !l.a((Object) "0", (Object) e2)) {
            Keva repo = Keva.getRepo("cold_boot_repo");
            long j2 = 0;
            if (repo != null) {
                j2 = repo.getLong(e2, 0);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (a.a(j2, currentTimeMillis)) {
                Keva.getRepo("cold_boot_repo").storeLong(e2, currentTimeMillis);
                MusNotificationApiManager.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final void a(Context context, boolean z) {
        dr.a(new C2896b(this));
        c();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.d.b$b  reason: collision with other inner class name */
    static final class C2896b implements IAccountUserService.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f113328a;

        static {
            Covode.recordClassIndex(72871);
        }

        C2896b(b bVar) {
            this.f113328a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.IAccountUserService.a
        public final void a(int i2, User user, User user2) {
            b.c();
        }
    }
}

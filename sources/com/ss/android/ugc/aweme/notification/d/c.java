package com.ss.android.ugc.aweme.notification.d;

import android.content.Context;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.s;
import com.ss.android.ugc.aweme.notification.e.a;
import com.ss.android.ugc.aweme.notification.e.d;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.List;

public final class c implements r {

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f113329a = "";

    /* renamed from: b  reason: collision with root package name */
    public static final a f113330b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final a.g f113331c;

    /* renamed from: d  reason: collision with root package name */
    private final String f113332d;

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
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
            Covode.recordClassIndex(72873);
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.d.c$a$a  reason: collision with other inner class name */
        public static final class C2897a extends m implements h.f.a.a<z> {

            /* renamed from: a  reason: collision with root package name */
            public static final C2897a f113333a = new C2897a();

            static {
                Covode.recordClassIndex(72874);
            }

            C2897a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                a.g gVar;
                if (com.ss.android.ugc.aweme.notice.api.ab.a.b()) {
                    if (com.ss.android.ugc.aweme.notification.e.a.a().f113377d) {
                        gVar = a.g.BOOT;
                    } else if (com.ss.android.ugc.aweme.notification.e.a.a().f113378e) {
                        gVar = a.g.BOOT_LAZY;
                    }
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g2, "");
                    String curUserId = g2.getCurUserId();
                    l.b(curUserId, "");
                    Long g3 = p.g(curUserId);
                    if (g3 != null && g3.longValue() > 0 && c.f113329a.length() == 0) {
                        c.f113329a = curUserId;
                        f.e().a(new c(gVar, curUserId)).a();
                    }
                }
                return z.f158842a;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final aa b() {
        if (this.f113331c == a.g.BOOT_LAZY) {
            return aa.IDLE;
        }
        return aa.NORMAL;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(72872);
    }

    static final class b<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final b f113334a = new b();

        static {
            Covode.recordClassIndex(72875);
        }

        b() {
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            return com.ss.android.ugc.aweme.notification.e.a.c();
        }
    }

    public c(a.g gVar, String str) {
        l.d(gVar, "");
        l.d(str, "");
        this.f113331c = gVar;
        this.f113332d = str;
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final void a(Context context, boolean z) {
        StringBuilder append = new StringBuilder("request ").append(this.f113331c).append(", ").append(this.f113332d).append(", ");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        com.ss.android.ugc.aweme.common.f.a("PreloadNoticeTask", append.append(g2.getCurUserId()).toString());
        String str = this.f113332d;
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g3, "");
        if (!(!l.a((Object) str, (Object) g3.getCurUserId()))) {
            if (this.f113331c == a.g.BOOT) {
                d.a(a.h.f113387a);
            } else if (this.f113331c == a.g.BOOT_LAZY) {
                long j2 = com.ss.android.ugc.aweme.notification.e.a.a().f113380g;
                if (j2 <= 0) {
                    com.ss.android.ugc.aweme.notification.e.a.c();
                } else {
                    i.a(j2).a(b.f113334a);
                }
            }
        }
    }
}

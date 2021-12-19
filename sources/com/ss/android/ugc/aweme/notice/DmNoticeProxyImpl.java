package com.ss.android.ugc.aweme.notice;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class DmNoticeProxyImpl implements DmNoticeProxy {

    /* renamed from: b  reason: collision with root package name */
    public static final a f112631b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f112632a = "";

    /* renamed from: d  reason: collision with root package name */
    private final h f112633d = i.a((h.f.a.a) c.f112639a);

    /* renamed from: e  reason: collision with root package name */
    private final h f112634e = i.a((h.f.a.a) f.f112642a);

    /* renamed from: f  reason: collision with root package name */
    private final h f112635f = i.a((h.f.a.a) b.f112638a);

    /* renamed from: g  reason: collision with root package name */
    private boolean f112636g;

    /* renamed from: h  reason: collision with root package name */
    private final h f112637h = i.a((h.f.a.a) d.f112640a);

    static {
        Covode.recordClassIndex(72381);
    }

    private final Map<String, TuxAlertBadgeLayout> f() {
        return (Map) this.f112633d.getValue();
    }

    private final b g() {
        return (b) this.f112634e.getValue();
    }

    private final b h() {
        return (b) this.f112635f.getValue();
    }

    public final a a() {
        return (a) this.f112637h.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72382);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f112638a = new b();

        static {
            Covode.recordClassIndex(72383);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b((byte) 0);
        }
    }

    static final class c extends m implements h.f.a.a<Map<String, TuxAlertBadgeLayout>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f112639a = new c();

        static {
            Covode.recordClassIndex(72384);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<String, TuxAlertBadgeLayout> invoke() {
            return new LinkedHashMap();
        }
    }

    static final class d extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f112640a = new d();

        static {
            Covode.recordClassIndex(72385);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a((byte) 0);
        }
    }

    static final class f extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f112642a = new f();

        static {
            Covode.recordClassIndex(72387);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b((byte) 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    public final int d() {
        return g().f112777b;
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DmNoticeProxyImpl f112641a;

        static {
            Covode.recordClassIndex(72386);
        }

        e(DmNoticeProxyImpl dmNoticeProxyImpl) {
            this.f112641a = dmNoticeProxyImpl;
        }

        public final void run() {
            this.f112641a.a().f112643a = true;
            DmNoticeProxyImpl dmNoticeProxyImpl = this.f112641a;
            dmNoticeProxyImpl.b(dmNoticeProxyImpl.f112632a);
        }
    }

    private final void i() {
        Iterator<T> it = f().values().iterator();
        while (it.hasNext()) {
            it.next().setVisibility(8);
        }
    }

    private final void k() {
        this.f112636g = false;
        Iterator<T> it = f().values().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private static boolean l() {
        return com.ss.android.ugc.aweme.notice.api.b.c(101, 11);
    }

    public static DmNoticeProxy e() {
        MethodCollector.i(1606);
        Object a2 = com.ss.android.ugc.b.a(DmNoticeProxy.class, false);
        if (a2 != null) {
            DmNoticeProxy dmNoticeProxy = (DmNoticeProxy) a2;
            MethodCollector.o(1606);
            return dmNoticeProxy;
        }
        if (com.ss.android.ugc.b.cV == null) {
            synchronized (DmNoticeProxy.class) {
                try {
                    if (com.ss.android.ugc.b.cV == null) {
                        com.ss.android.ugc.b.cV = new DmNoticeProxyImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1606);
                    throw th;
                }
            }
        }
        DmNoticeProxyImpl dmNoticeProxyImpl = (DmNoticeProxyImpl) com.ss.android.ugc.b.cV;
        MethodCollector.o(1606);
        return dmNoticeProxyImpl;
    }

    private final void j() {
        this.f112636g = true;
        for (T t : f().values()) {
            t.setVariant(0);
            t.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    public final boolean b() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (!g2.isLogin() || in.d() || com.ss.android.ugc.aweme.notice.api.b.b().isChatFunOfflineUnder16() || !IMService.createIIMServicebyMonsterPlugin(false).isIMAvailable()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    public final String c() {
        if (g().f112776a) {
            return "dot";
        }
        if (g().f112777b > 0) {
            return "number";
        }
        return "";
    }

    private final void m() {
        if (this.f112632a.length() != 0) {
            if (h().f112776a != g().f112776a || h().f112777b != g().f112777b) {
                h().f112776a = g().f112776a;
                h().f112777b = g().f112777b;
                a(this.f112632a, c(), h().f112777b);
            }
        }
    }

    private final String c(String str) {
        if (str.length() == 0) {
            return str;
        }
        if (f().isEmpty()) {
            return "";
        }
        return "notification_page";
    }

    private final void a(int i2) {
        this.f112636g = false;
        for (T t : f().values()) {
            t.setVariant(1);
            t.setMaxCount(2);
            t.a();
            t.setCount(i2);
        }
        if (a().f112644b) {
            a().f112644b = false;
            new Handler(Looper.getMainLooper()).postDelayed(new e(this), 3000);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    public final void b(String str) {
        l.d(str, "");
        if (!f().isEmpty()) {
            this.f112632a = c(str);
            if (b()) {
                i();
                return;
            }
            int a2 = com.ss.android.ugc.aweme.notice.api.b.a(99);
            if (a2 > 0) {
                if (a().f112643a) {
                    j();
                } else {
                    a(a2);
                }
            } else if (com.ss.android.ugc.aweme.notice.api.b.c(101, 11)) {
                j();
            } else {
                k();
            }
            com.ss.android.ugc.aweme.framework.a.a.b("UnreadCount", "DmNotice needShowDot " + l());
            com.ss.android.ugc.aweme.framework.a.a.b("UnreadCount", "DmNotice unread count ".concat(String.valueOf(a2)));
            a(this.f112636g, a2);
            m();
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    public final void a(String str) {
        l.d(str, "");
        f().remove(str);
    }

    private final void a(boolean z, int i2) {
        if (z || i2 < 0) {
            i2 = 0;
        }
        if (z != g().f112776a || i2 != g().f112777b) {
            g().f112776a = z;
            g().f112777b = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    public final void a(TuxAlertBadgeLayout tuxAlertBadgeLayout, String str) {
        l.d(tuxAlertBadgeLayout, "");
        l.d(str, "");
        if (com.ss.android.ugc.aweme.inbox.a.a.c()) {
            tuxAlertBadgeLayout.b();
            return;
        }
        f().put(str, tuxAlertBadgeLayout);
        b(str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    public final void a(com.ss.android.ugc.aweme.notice.api.bean.m mVar, String str) {
        l.d(mVar, "");
        l.d(str, "");
        int i2 = mVar.f112697a;
        if (i2 == 11 || i2 == 99 || i2 == 101) {
            com.ss.android.ugc.aweme.framework.a.a.a("UnReadCountMonitor MusNewNotification receive IM " + mVar.f112697a + ": " + mVar.f112698b);
            com.ss.android.ugc.aweme.notice.api.b.a(mVar.f112697a, mVar.f112698b);
            b(str);
        }
    }

    private static void a(String str, String str2, int i2) {
        r.a("chat_notice_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("notice_type", str2).a("num", i2).f66730a);
    }
}

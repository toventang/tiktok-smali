package com.ss.android.ugc.aweme.legoImp.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import com.ss.android.legoapi.b;
import com.ss.android.legoapi.freso.a;
import com.ss.android.legoimpl.BusinessToolsTask;
import com.ss.android.ugc.aweme.InitFoundationTask;
import com.ss.android.ugc.aweme.app.InitAllServiceImpl;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.InitAdServiceTask;
import com.ss.android.ugc.aweme.legoImp.task.uitask.UIInitTask;
import com.ss.android.ugc.aweme.legoImpl.task.InitFireBase;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    private static w f107945a;

    /* renamed from: b  reason: collision with root package name */
    private static w f107946b;

    /* renamed from: c  reason: collision with root package name */
    private static w f107947c;

    /* renamed from: d  reason: collision with root package name */
    private static w f107948d;

    /* renamed from: e  reason: collision with root package name */
    private static w f107949e;

    /* renamed from: f  reason: collision with root package name */
    private static w f107950f;

    /* renamed from: g  reason: collision with root package name */
    private static w f107951g;

    /* renamed from: h  reason: collision with root package name */
    private static w f107952h;

    /* renamed from: i  reason: collision with root package name */
    private static w f107953i;

    /* renamed from: j  reason: collision with root package name */
    private static w f107954j;

    /* renamed from: k  reason: collision with root package name */
    private static w f107955k;

    /* renamed from: l  reason: collision with root package name */
    private static w f107956l;

    /* renamed from: m  reason: collision with root package name */
    private static w f107957m;
    private static w n;
    private static w o;
    private static w p;
    private static w q;
    private static w r;
    private static w s;
    private static w t;

    static {
        Covode.recordClassIndex(69185);
    }

    public static w a() {
        if (n == null) {
            n = new PlayerKitInitTask();
        }
        return n;
    }

    public static w b() {
        if (f107948d == null) {
            f107948d = new InitModules();
        }
        return f107948d;
    }

    public static w c() {
        if (f107946b == null) {
            f107946b = a.f59613a.a();
        }
        return f107946b;
    }

    public static w d() {
        if (f107945a == null) {
            f107945a = com.ss.android.legoapi.abtest.a.f59609a.b();
        }
        return f107945a;
    }

    public static w e() {
        if (f107951g == null) {
            f107951g = new InitPushTask();
        }
        return f107951g;
    }

    public static w f() {
        if (f107947c == null) {
            f107947c = new InitFireBase();
        }
        return f107947c;
    }

    public static w i() {
        if (f107952h == null) {
            f107952h = new PowerPageTask();
        }
        return f107952h;
    }

    public static w k() {
        if (f107954j == null) {
            f107954j = new InitFoundationTask();
        }
        return f107954j;
    }

    public static w l() {
        if (f107955k == null) {
            f107955k = new UIInitTask();
        }
        return f107955k;
    }

    public static w m() {
        if (f107956l == null) {
            f107956l = new InitAVModule();
        }
        return f107956l;
    }

    public static w n() {
        if (f107957m == null) {
            f107957m = b.f59611a.a();
        }
        return f107957m;
    }

    public static w o() {
        if (o == null) {
            o = new InitAdServiceTask();
        }
        return o;
    }

    public static w p() {
        if (p == null) {
            p = new InitAppsFlyer();
        }
        return p;
    }

    public static w q() {
        if (q == null) {
            q = com.ss.android.legoapi.abtest.a.f59609a.a();
        }
        return q;
    }

    public static w r() {
        if (r == null) {
            r = new AssemInitTask();
        }
        return r;
    }

    public static w s() {
        if (s == null) {
            s = new SplitCompatInstall();
        }
        return s;
    }

    public static w t() {
        if (t == null) {
            t = new ColdBootPreloadPlayerSoTask();
        }
        return t;
    }

    public static w g() {
        if (f107949e == null) {
            f107949e = new BusinessToolsTask(g.a());
        }
        return f107949e;
    }

    public static w h() {
        if (f107950f == null) {
            f107950f = (w) com.ss.android.di.push.a.a().getCancelNotiTask();
        }
        return f107950f;
    }

    public static w j() {
        if (f107953i == null) {
            f107953i = InitAllServiceImpl.q().j();
        }
        return f107953i;
    }
}

package com.ss.android.ugc.aweme.comment.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.keva.Keva;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.framework.a.a;
import h.a.ag;
import h.f.b.l;
import h.v;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f72756a = b.a().a(true, "comment_keyboard_workaround", false);

    /* renamed from: b  reason: collision with root package name */
    static final long f72757b = TimeUnit.DAYS.toMillis(3);

    /* renamed from: c  reason: collision with root package name */
    static final Keva f72758c;

    /* renamed from: d  reason: collision with root package name */
    static long f72759d;

    /* renamed from: e  reason: collision with root package name */
    static int f72760e;

    /* renamed from: f  reason: collision with root package name */
    public static final j f72761f = new j();

    private j() {
    }

    public static final boolean b() {
        boolean z = !f72756a;
        if (!z) {
            a(true);
        }
        return z;
    }

    static {
        Covode.recordClassIndex(44827);
        Keva repo = Keva.getRepo(UGCMonitor.EVENT_COMMENT);
        l.b(repo, "");
        f72758c = repo;
    }

    public static final boolean a() {
        Keva keva = f72758c;
        boolean z = true;
        boolean z2 = keva.getBoolean("keyboard_can_dismiss", true);
        if (keva.getLong("keyboard_can_dismiss_expire_time", 0) < System.currentTimeMillis()) {
            keva.storeBoolean("keyboard_can_dismiss", true);
        } else {
            z = z2;
            if (!z) {
                a(false);
            }
        }
        return z;
    }

    private static void a(boolean z) {
        String str;
        if (z) {
            str = "by_network";
        } else {
            str = "by_local";
        }
        try {
            HashMap c2 = ag.c(v.a("wont_dismiss_type", str));
            a.a(2, "comment_keyboard_wont_dismiss", str);
            com.bytedance.apm.b.a("comment_keyboard_wont_dismiss", new JSONObject(ag.c(c2)));
        } catch (Throwable unused) {
        }
    }
}

package com.ss.android.ugc.aweme.shortvideo.ui;

import android.app.Application;
import com.bytedance.common.utility.d.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.cs.h.c;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.setting.i.n;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.utils.d;
import h.f.b.l;
import java.io.File;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static boolean f131247a = n.a();

    /* renamed from: b  reason: collision with root package name */
    static final Keva f131248b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f131249c = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(85977);
        Keva repo = Keva.getRepo("av_effect_storage");
        l.b(repo, "");
        f131248b = repo;
    }

    static void a() {
        long j2;
        long j3;
        c c2 = g.a().g().c();
        Application application = i.f115645a;
        l.b(application, "");
        File filesDir = application.getFilesDir();
        l.b(filesDir, "");
        File a2 = c2.a(filesDir, "effect");
        c c3 = g.a().g().c();
        String str = dj.p;
        l.b(str, "");
        File g2 = c3.g(str);
        File g3 = g.a().g().c().g(com.ss.android.ugc.aweme.port.in.l.f115658a.d().a().b());
        long j4 = 0;
        if (a2.exists()) {
            j2 = b.c(a2.getAbsolutePath());
        } else {
            j2 = 0;
        }
        if (g2.exists()) {
            j3 = b.c(g2.getAbsolutePath());
        } else {
            j3 = 0;
        }
        if (g3.exists()) {
            j4 = b.c(g3.getAbsolutePath());
        }
        d.a("tool_performance_effect_storage_space", new com.ss.android.ugc.tools.f.b().a("effect_size", j2).a("filter_size", j3).a("mv_size", j4).a("storage_size", j2 + j3 + j4).f149193a);
    }
}

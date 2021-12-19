package com.ss.android.ugc.aweme.legoImp.service;

import android.content.Context;
import android.os.Build;
import android.os.FileObserver;
import com.bytedance.covode.number.Covode;
import com.bytedance.g.c;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.co.b;
import com.ss.android.ugc.aweme.experiment.g;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.p;
import com.ss.android.ugc.aweme.lego.u;
import com.ss.android.ugc.aweme.lego.v;
import java.io.IOException;
import java.util.List;

public class AOTOptimizeService implements u {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f107692b;

    /* renamed from: a  reason: collision with root package name */
    public a f107693a;

    static {
        Covode.recordClassIndex(68895);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return v.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "service_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.u
    public final ae b() {
        if (!c() || !c.f29648d || g.f90124c.getValue().intValue() != g.f90123b) {
            return ae.BOOT_FINISH;
        }
        return ae.APP_BACKGROUND;
    }

    static boolean c() {
        if ((!s.a().booleanValue() || !g.a()) && Build.VERSION.SDK_INT >= 24 && d() && !f107692b) {
            return true;
        }
        return false;
    }

    private static boolean d() {
        Context a2 = d.a();
        if (!b.b().a(a2, "aot_release_build_version").equals(com.ss.android.newmedia.a.a.a(a2).a("release_build", "default_version"))) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.lego.n, com.ss.android.ugc.aweme.lego.u
    public final void a(Context context) {
        b(context);
    }

    @Override // com.ss.android.ugc.aweme.lego.u
    public final void b(Context context) {
        if (c()) {
            com.ss.android.ugc.aweme.framework.a.a.a("startWatchingForOptimize");
            if (this.f107693a == null) {
                this.f107693a = new a(context, com.a.a("%s/%s/%s", new Object[]{"/data/misc/profiles/cur/0", context.getPackageName(), "primary.prof"}));
            }
            this.f107693a.startWatching();
        }
    }

    static void c(Context context) {
        try {
            Context a2 = d.a();
            b.b().a(a2, "aot_release_build_version", com.ss.android.newmedia.a.a.a(a2).a("release_build", "default_version"));
            f107692b = true;
            Process exec = Runtime.getRuntime().exec("cmd package compile -m everything-profile -f " + context.getPackageName());
            try {
                exec.waitFor();
                exec.exitValue();
            } catch (InterruptedException unused) {
                System.err.println("execCommand InterruptedException");
            }
        } catch (IOException unused2) {
            System.err.println("execOptCommand IOException");
        }
    }

    class a extends FileObserver {

        /* renamed from: a  reason: collision with root package name */
        Context f107694a;

        static {
            Covode.recordClassIndex(68896);
        }

        public final void onEvent(int i2, String str) {
            int intValue;
            if (i2 == 2 && !AOTOptimizeService.f107692b) {
                if (AOTOptimizeService.this.f107693a != null) {
                    AOTOptimizeService.this.f107693a.stopWatching();
                    AOTOptimizeService.this.f107693a = null;
                }
                AOTOptimizeService aOTOptimizeService = AOTOptimizeService.this;
                Context context = this.f107694a;
                if (!AOTOptimizeService.c()) {
                    return;
                }
                if (s.a().booleanValue() || !c.f29648d || g.f90124c.getValue().intValue() == g.f90123b || (intValue = g.f90124c.getValue().intValue()) == 0) {
                    AOTOptimizeService.c(context);
                    return;
                }
                AOTOptimizeService.f107692b = true;
                p.f107614a.postDelayed(new a(aOTOptimizeService, context), (long) intValue);
            }
        }

        a(Context context, String str) {
            super(str);
            this.f107694a = context;
        }
    }
}

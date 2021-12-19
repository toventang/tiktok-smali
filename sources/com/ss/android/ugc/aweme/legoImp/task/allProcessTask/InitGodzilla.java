package com.ss.android.ugc.aweme.legoImp.task.allProcessTask;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.keva.Keva;
import com.bytedance.platform.godzilla.a;
import com.bytedance.platform.godzilla.a.g;
import com.bytedance.platform.godzilla.c.d;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.utils.df;
import com.ss.android.ugc.aweme.utils.er;
import com.ss.android.ugc.aweme.utils.fm;
import com.ss.android.ugc.aweme.utils.gx;
import com.ss.android.ugc.aweme.utils.h;
import h.f.b.l;
import h.m.p;
import java.util.List;

public final class InitGodzilla implements w {
    static {
        Covode.recordClassIndex(69195);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a implements com.bytedance.platform.godzilla.b.a.a.b.a {
        static {
            Covode.recordClassIndex(69196);
        }

        a() {
        }

        @Override // com.bytedance.platform.godzilla.b.a.a.b.a
        public final boolean a(Object obj, Throwable th) {
            StackTraceElement[] stackTrace;
            String message;
            Thread currentThread = Thread.currentThread();
            if (!(obj == null || th == null || currentThread == null || (stackTrace = currentThread.getStackTrace()) == null || stackTrace.length == 0)) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (stackTraceElement != null && l.a((Object) "android.app.ActivityThread", (Object) stackTraceElement.getClassName()) && (message = th.getMessage()) != null && p.a((CharSequence) message, (CharSequence) "android.os.DeadSystemException", false) && (l.a((Object) "handleCreateService", (Object) stackTraceElement.getMethodName()) || l.a((Object) "handleStopService", (Object) stackTraceElement.getMethodName()) || l.a((Object) "handleBindService", (Object) stackTraceElement.getMethodName()) || l.a((Object) "handleUnbindService", (Object) stackTraceElement.getMethodName()) || l.a((Object) "handleServiceArgs", (Object) stackTraceElement.getMethodName()))) {
                        b.a(th, "binderlog");
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        if (com.ss.android.ugc.aweme.s.a.i()) {
            return ae.BACKGROUND;
        }
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (com.ss.android.ugc.aweme.s.a.i()) {
            a.C1028a aVar = new a.C1028a(g.a());
            aVar.f41942a = g.a.NONE;
            aVar.a(new com.bytedance.platform.godzilla.b.c.a());
            aVar.a(new com.bytedance.platform.godzilla.b.c.b());
            aVar.a(new com.ss.android.ugc.aweme.utils.ab());
            aVar.a(new com.ss.android.ugc.aweme.utils.g());
            aVar.a(new fm());
            aVar.a(new gx());
            aVar.a(new h());
            aVar.a(new er());
            aVar.a(new com.bytedance.platform.godzilla.sysopt.b());
            aVar.a(new com.bytedance.platform.godzilla.b.b());
            if (Keva.getRepo("ab_repo_cold_boot").getBoolean("thread_stack_opt", true) && (Build.VERSION.SDK_INT < 23 || !Process.is64Bit())) {
                aVar.a(new com.bytedance.platform.godzilla.sysopt.a());
            }
            com.bytedance.platform.godzilla.a.a(aVar.a()).a(d.IMMEDIATE);
            df.f142819a = true;
        } else if (com.ss.android.ugc.aweme.lego.b.b()) {
            Application a2 = com.bytedance.ies.ugc.appcontext.g.a();
            com.bytedance.platform.godzilla.b.b bVar = new com.bytedance.platform.godzilla.b.b();
            bVar.a(a2);
            bVar.a();
        } else {
            df.a(com.bytedance.ies.ugc.appcontext.g.a());
        }
        com.bytedance.platform.godzilla.b.a.b.a.a(new a());
    }
}

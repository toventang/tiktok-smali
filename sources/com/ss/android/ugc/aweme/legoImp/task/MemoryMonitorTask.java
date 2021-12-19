package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ammt.mmt.impl.GraphicMMTPlugin;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.hyper.Hyper;
import com.ss.android.ugc.aweme.bp.a;
import com.ss.android.ugc.aweme.bp.b;
import com.ss.android.ugc.aweme.bp.c;
import com.ss.android.ugc.aweme.bp.g;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.m;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class MemoryMonitorTask implements w {

    /* renamed from: a  reason: collision with root package name */
    a f107834a = a.LOCALTEST_MODE;

    static {
        Covode.recordClassIndex(69057);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
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
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        if (!m.b()) {
            return true;
        }
        return false;
    }

    enum a {
        ONLINE_MODE,
        LOCALTEST_MODE;

        static {
            Covode.recordClassIndex(69058);
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        Context a2;
        Context a3;
        if (TextUtils.equals(d.s, "local_test")) {
            this.f107834a = a.LOCALTEST_MODE;
        } else {
            this.f107834a = a.ONLINE_MODE;
        }
        if (this.f107834a == a.ONLINE_MODE) {
            if (!g.a()) {
                if (com.ss.android.ugc.aweme.bp.a.a()) {
                    a.C1553a aVar = null;
                    try {
                        aVar = (a.C1553a) SettingsManager.a().a("gmt_settings", a.C1553a.class, a.b.f68744a);
                    } catch (Throwable unused) {
                    }
                    if (aVar != null && aVar.f68740a) {
                        int i2 = aVar.f68741b;
                        int i3 = aVar.f68742c;
                        int i4 = aVar.f68743d;
                        GraphicMMTPlugin c2 = GraphicMMTPlugin.c();
                        c2.a(i2);
                        c2.a(com.bytedance.ammt.mmt.a.b(context), "graphic");
                        c2.a((long) i3, (long) i4);
                        c2.a();
                        c2.a(context);
                        Npth.registerCrashCallback(b.f68745a, CrashType.JAVA);
                        Npth.registerCrashCallback(c.f68746a, CrashType.NATIVE);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (this.f107834a == a.LOCALTEST_MODE) {
            if (g.a() && (a3 = d.a()) != null) {
                File file = new File(com.ss.android.h.a.b().getAbsolutePath() + File.separator + "NativeMMT.ini");
                SharedPreferences a4 = com.ss.android.ugc.aweme.bf.d.a(a3, "LeakDetectorSp", 0);
                if ((a4.getBoolean("open_leak_detector_on_local_test", false) && a4.getBoolean("native_memory_monitor_status", true)) || file.exists()) {
                    g.a(context);
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 23 && (a2 = d.a()) != null && new File(com.ss.android.h.a.b().getAbsolutePath() + File.separator + "VEhookLibNames.ini").exists() && a2.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                try {
                    String[] a5 = com.ss.android.ugc.aweme.bp.d.a();
                    String str = com.ss.android.h.a.b().getAbsolutePath() + File.separator + "VEhookTempFiles";
                    File file2 = new File(str);
                    if (!file2.exists() || !file2.isDirectory()) {
                        file2.mkdir();
                    }
                    Hyper.init(a5, str);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } else if (com.ss.android.ugc.aweme.bp.a.a() && new File(com.ss.android.h.a.b().getAbsolutePath() + File.separator + com.ss.android.ugc.aweme.bp.a.f68738a).exists()) {
                com.bytedance.ammt.mmt.a.a(context);
                int b2 = com.ss.android.ugc.aweme.bp.a.b();
                GraphicMMTPlugin c3 = GraphicMMTPlugin.c();
                c3.a(com.bytedance.ammt.mmt.a.b(context), "graphic");
                c3.a(b2);
                c3.a(419430400, 1048576);
                c3.a();
                c3.a(context);
            }
        }
    }
}

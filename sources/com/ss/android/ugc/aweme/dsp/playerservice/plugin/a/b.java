package com.ss.android.ugc.aweme.dsp.playerservice.plugin.a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.f;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.dsp.experiment.MusicDspConfig;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.bo;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.dsp.playerservice.b.b f83579a;

    /* renamed from: b  reason: collision with root package name */
    static final MusicDspConfig f83580b = com.ss.android.ugc.aweme.dsp.experiment.b.a();

    /* renamed from: c  reason: collision with root package name */
    static final AtomicInteger f83581c = new AtomicInteger(0);

    /* renamed from: d  reason: collision with root package name */
    static final Handler f83582d = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    static final RunnableC1984b f83583e = new RunnableC1984b();

    /* renamed from: f  reason: collision with root package name */
    static final a f83584f = new a();

    /* renamed from: g  reason: collision with root package name */
    public static final b f83585g = new b();

    /* renamed from: h  reason: collision with root package name */
    private static f f83586h = new f();

    public static final class a implements ActivityStack.b {
        static {
            Covode.recordClassIndex(52164);
        }

        @Override // com.ss.android.ugc.aweme.utils.ActivityStack.b
        public final void a() {
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.utils.ActivityStack.b
        public final void b() {
            b.a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b$b  reason: collision with other inner class name */
    public static final class RunnableC1984b implements Runnable {
        static {
            Covode.recordClassIndex(52165);
        }

        RunnableC1984b() {
        }

        public final void run() {
            if (!b.a(b.f83579a.f83372c)) {
                b.f83579a = new com.ss.android.ugc.aweme.dsp.playerservice.b.b();
                b.d();
                c.a(new a(true));
            }
            b.f83582d.postDelayed(this, b.e());
        }
    }

    private b() {
    }

    public static void c() {
        f83579a.f83374e = true;
        d();
    }

    public static void a() {
        Handler handler = f83582d;
        RunnableC1984b bVar = f83583e;
        handler.removeCallbacks(bVar);
        if (a(f83579a.f83372c)) {
            handler.postDelayed(bVar, e());
        } else {
            bVar.run();
        }
    }

    public static boolean b() {
        if (f83579a.f83370a.size() >= f83580b.getCopyrightRestrictions().getMaxMusics()) {
            return true;
        }
        return false;
    }

    public static void d() {
        Keva.getRepo("music_dsp_expired_repo").storeString(f(), f83586h.b(f83579a, com.ss.android.ugc.aweme.dsp.playerservice.b.b.class));
    }

    public static long e() {
        bo.a a2 = bo.a();
        l.b(a2, "");
        return a2.f142683a - System.currentTimeMillis();
    }

    private static String f() {
        String deviceId = DeviceRegisterManager.getDeviceId();
        if (deviceId == null || deviceId.length() == 0) {
            deviceId = "0";
        }
        String a2 = com.a.a("music_dsp_expired_playable_%s", Arrays.copyOf(new Object[]{deviceId}, 1));
        l.b(a2, "");
        return a2;
    }

    static {
        Covode.recordClassIndex(52163);
        f83579a = new com.ss.android.ugc.aweme.dsp.playerservice.b.b();
        com.ss.android.ugc.aweme.dsp.playerservice.b.b bVar = (com.ss.android.ugc.aweme.dsp.playerservice.b.b) f83586h.a(Keva.getRepo("music_dsp_expired_repo").getString(f(), ""), com.ss.android.ugc.aweme.dsp.playerservice.b.b.class);
        if (bVar == null) {
            bVar = new com.ss.android.ugc.aweme.dsp.playerservice.b.b();
        }
        if (!a(bVar.f83372c)) {
            bVar = new com.ss.android.ugc.aweme.dsp.playerservice.b.b();
        }
        f83579a = bVar;
    }

    public static boolean a(String str) {
        l.d(str, "");
        return f83579a.f83370a.contains(str);
    }

    public static boolean b(String str) {
        l.d(str, "");
        return l.a((Object) f83579a.f83373d, (Object) str);
    }

    public static boolean a(long j2) {
        bo.a b2 = bo.b();
        l.b(b2, "");
        if (j2 < b2.f142683a || j2 > b2.f142684b) {
            return false;
        }
        return true;
    }
}

package com.ss.android.ugc.aweme.simkit.impl.a;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;
import com.ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.ss.android.ugc.aweme.simkit.api.d;
import com.ss.android.ugc.aweme.simkit.c;
import h.f.b.l;
import h.m.p;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final String f133498a = "SuperResolutionStrategy";

    /* renamed from: b  reason: collision with root package name */
    private long f133499b;

    /* renamed from: c  reason: collision with root package name */
    private double f133500c = 0.2d;

    /* renamed from: d  reason: collision with root package name */
    private int f133501d;

    /* renamed from: e  reason: collision with root package name */
    private int f133502e;

    static {
        Covode.recordClassIndex(87327);
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.d
    public final void a() {
        ICommonConfig commonConfig;
        try {
            c a2 = com.ss.android.ugc.aweme.simkit.d.a();
            l.a((Object) a2, "");
            ISimKitConfig b2 = a2.b();
            if (!(b2 == null || (commonConfig = b2.getCommonConfig()) == null)) {
                commonConfig.getSuperResolutionStrategyConfig();
            }
            if (System.currentTimeMillis() - this.f133499b >= 300000) {
                Intent b3 = b(com.ss.android.ugc.playerkit.simapicommon.a.f148866a, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (b3 != null) {
                    double intExtra = (double) b3.getIntExtra("level", -1);
                    double intExtra2 = (double) b3.getIntExtra("scale", -1);
                    Double.isNaN(intExtra);
                    Double.isNaN(intExtra2);
                    Double valueOf = Double.valueOf(intExtra / intExtra2);
                    if (valueOf != null) {
                        this.f133500c = valueOf.doubleValue();
                    }
                }
                this.f133499b = System.currentTimeMillis();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.d
    public final void b() {
        ICommonConfig commonConfig;
        com.ss.android.ugc.aweme.simkit.model.b.a aVar = null;
        try {
            c a2 = com.ss.android.ugc.aweme.simkit.d.a();
            l.a((Object) a2, "");
            ISimKitConfig b2 = a2.b();
            if (b2 != null && (commonConfig = b2.getCommonConfig()) != null) {
                aVar = commonConfig.getSuperResolutionStrategyConfig();
                if (aVar != null && aVar.f133585c != 10) {
                    this.f133501d--;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static Intent a(Application application, IntentFilter intentFilter) {
        try {
            return application.registerReceiver(null, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(null, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    private static Intent b(Application application, IntentFilter intentFilter) {
        SecurityException securityException;
        com.ss.android.ugc.aweme.lancet.receiver.a.a(g.a());
        try {
            return a(application, intentFilter);
        } catch (Exception unused) {
            try {
                return ReceiverRegisterLancetHelper.registerReceiver(null, intentFilter);
            } catch (SecurityException e2) {
                securityException = e2;
                b.a(securityException, "Register Receiver Exception");
                return null;
            } catch (IllegalArgumentException e3) {
                String message = e3.getMessage();
                securityException = e3;
                if (message != null) {
                    boolean contains = e3.getMessage().contains("regist too many Broadcast Receivers");
                    securityException = e3;
                    if (contains) {
                        throw e3;
                    }
                }
                b.a(securityException, "Register Receiver Exception");
                return null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.d
    public final int a(String str, boolean z, long j2, int i2, String str2, float f2) {
        ICommonConfig commonConfig;
        if (z) {
            return 4;
        }
        if (TextUtils.isEmpty(str2)) {
            return 2;
        }
        if (str2 == null) {
            l.a();
        }
        if (!p.a((CharSequence) str2, (CharSequence) "540", false) && !p.a((CharSequence) str2, (CharSequence) "720", false)) {
            return 2;
        }
        c a2 = com.ss.android.ugc.aweme.simkit.d.a();
        l.a((Object) a2, "");
        ISimKitConfig b2 = a2.b();
        l.a((Object) b2, "");
        int PlayerAbSuperResolutionVideoDurationExp = b2.getSimPlayerExperiment().PlayerAbSuperResolutionVideoDurationExp();
        if (PlayerAbSuperResolutionVideoDurationExp > 0 && j2 > ((long) (PlayerAbSuperResolutionVideoDurationExp * 1000))) {
            return 12;
        }
        com.ss.android.ugc.aweme.simkit.model.b.a aVar = null;
        try {
            c a3 = com.ss.android.ugc.aweme.simkit.d.a();
            l.a((Object) a3, "");
            ISimKitConfig b3 = a3.b();
            if (!(b3 == null || (commonConfig = b3.getCommonConfig()) == null)) {
                aVar = commonConfig.getSuperResolutionStrategyConfig();
            }
        } catch (Throwable unused) {
        }
        if (aVar == null) {
            return 1;
        }
        TextUtils.isEmpty(str);
        double d2 = (double) aVar.f133584b;
        Double.isNaN(d2);
        int i3 = aVar.f133585c;
        if (this.f133500c < d2 / 100.0d) {
            return 6;
        }
        if (i3 == 10) {
            return 100;
        }
        int i4 = this.f133501d;
        if (i4 + 1 <= i3) {
            this.f133501d = i4 + 1;
            this.f133502e = 0;
            return 100;
        }
        if (i4 + 1 > i3) {
            int i5 = this.f133502e;
            if (i5 + 1 <= 10 - i3) {
                this.f133502e = i5 + 1;
                this.f133501d = i3;
                return 8;
            }
        }
        if (i4 + 1 <= i3 || this.f133502e + 1 <= 10 - i3) {
            return 11;
        }
        this.f133502e = 0;
        this.f133501d = 0;
        this.f133501d = 1;
        return 100;
    }
}

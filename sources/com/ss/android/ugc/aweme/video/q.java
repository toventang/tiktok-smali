package com.ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.ss.android.ugc.aweme.simkit.d;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static ISimKitConfig f143775a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f143776b;

    static {
        Covode.recordClassIndex(94062);
    }

    public static void a() {
        if (f143776b) {
            d.a().b().getPlayerGlobalConfig().setForceHttps(true);
            return;
        }
        ISimKitConfig iSimKitConfig = f143775a;
        if (iSimKitConfig != null) {
            iSimKitConfig.getPlayerGlobalConfig().setForceHttps(true);
        }
    }

    public static void b() {
        if (f143776b) {
            d.a().b().getPlayerGlobalConfig().setForceHttps(false);
            return;
        }
        ISimKitConfig iSimKitConfig = f143775a;
        if (iSimKitConfig != null) {
            iSimKitConfig.getPlayerGlobalConfig().setForceHttps(false);
        }
    }
}

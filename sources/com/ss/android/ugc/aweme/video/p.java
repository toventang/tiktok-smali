package com.ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.util.d;
import com.ss.android.ugc.aweme.video.config.a;
import com.ss.android.ugc.playerkit.exp.b;
import com.ss.android.ugc.playerkit.model.m;
import com.ss.android.ugc.playerkit.simapicommon.a.h;
import com.ss.android.ugc.playerkit.simapicommon.a.i;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f143499a;

    /* renamed from: b  reason: collision with root package name */
    private static int f143500b;

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f143501c;

    static {
        Covode.recordClassIndex(93893);
    }

    public static boolean a() {
        if (!b.q()) {
            return b();
        }
        Boolean bool = f143501c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean b2 = b();
        f143501c = Boolean.valueOf(b2);
        return b2;
    }

    private static boolean b() {
        boolean z;
        boolean z2;
        if (a.C3820a.f143369a.a().getPlayerType() == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean enableForceUseH264CheckPolicy = a.C3820a.f143369a.a().enableForceUseH264CheckPolicy();
        boolean enableByteVc1FailCheckCountPolicy = a.C3820a.f143369a.a().enableByteVc1FailCheckCountPolicy();
        if (!a.C3820a.f143369a.a().enableForceUseH264Global()) {
            if (z && enableForceUseH264CheckPolicy) {
                if (f143499a == null) {
                    if (d.f115449a == null) {
                        if (d.a.a(new d.a.C2948a(), new d.a.C2949d("video/hevc")) != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        d.f115449a = Boolean.valueOf(z2);
                    }
                    Boolean valueOf = Boolean.valueOf(d.f115449a.booleanValue());
                    f143499a = valueOf;
                    if (!valueOf.booleanValue()) {
                        com.ss.android.ugc.playerkit.simapicommon.a.b().ensureNotReachHere(new Exception(), "hevc not supported.");
                    }
                }
                if (!f143499a.booleanValue() || (enableByteVc1FailCheckCountPolicy && f143500b > 3)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static i a(h hVar, m.e eVar) {
        return a.C3820a.f143369a.a().getVideoPlayAddr(hVar, eVar);
    }
}

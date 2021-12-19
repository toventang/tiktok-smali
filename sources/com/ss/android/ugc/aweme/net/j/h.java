package com.ss.android.ugc.aweme.net.j;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final g f112427a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static final h f112428b = new h();

    /* renamed from: c  reason: collision with root package name */
    private static g f112429c;

    private h() {
    }

    static {
        Covode.recordClassIndex(72252);
    }

    public static g a() {
        try {
            if (f112429c == null) {
                f112429c = (g) SettingsManager.a().a("payload_control_settings", g.class, f112427a);
            }
            g gVar = f112429c;
            if (gVar == null) {
                return f112427a;
            }
            return gVar;
        } catch (Throwable unused) {
            g gVar2 = f112429c;
            if (gVar2 == null) {
                return f112427a;
            }
            return gVar2;
        }
    }
}

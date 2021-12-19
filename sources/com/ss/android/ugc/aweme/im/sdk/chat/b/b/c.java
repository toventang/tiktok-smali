package com.ss.android.ugc.aweme.im.sdk.chat.b.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f100123a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final a f100124b = new a();

    private c() {
    }

    static {
        Covode.recordClassIndex(63821);
    }

    public static a a() {
        try {
            a aVar = (a) SettingsManager.a().a("im_preload_setting_config", a.class);
            if (aVar == null) {
                return f100124b;
            }
            return aVar;
        } catch (Throwable unused) {
            return f100124b;
        }
    }
}

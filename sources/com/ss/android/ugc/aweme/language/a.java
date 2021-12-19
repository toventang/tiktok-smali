package com.ss.android.ugc.aweme.language;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f107276a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f107277b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f107278c;

    private a() {
    }

    static {
        Covode.recordClassIndex(68631);
    }

    public static boolean a() {
        if (!f107277b) {
            try {
                f107278c = SettingServiceImpl.v().b(d.a());
                f107277b = true;
            } catch (Throwable unused) {
            }
        }
        return f107278c;
    }
}

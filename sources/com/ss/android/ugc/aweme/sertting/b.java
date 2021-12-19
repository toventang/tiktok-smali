package com.ss.android.ugc.aweme.sertting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static a[] f121826a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f121827b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(79341);
    }

    public static final a[] a() {
        try {
            a[] aVarArr = (a[]) SettingsManager.a().a("linker_platform_config", a[].class, f121826a);
            if (aVarArr == null) {
                return f121826a;
            }
            return aVarArr;
        } catch (Throwable unused) {
            return f121826a;
        }
    }
}

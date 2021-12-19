package com.bytedance.common.wschannel.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.f;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final b f27212a = new b();

    static {
        Covode.recordClassIndex(16041);
    }

    public static boolean a() {
        if (!f.c()) {
            return false;
        }
        try {
            if (Integer.parseInt(f27212a.a("ro.miui.ui.version.name").substring(1)) >= 12) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }
}

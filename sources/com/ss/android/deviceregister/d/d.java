package com.ss.android.deviceregister.d;

import android.os.Build;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.net.a.a;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final CharSequence f59466a = "amigo";

    /* renamed from: b  reason: collision with root package name */
    private static final CharSequence f59467b = "sony";

    /* renamed from: c  reason: collision with root package name */
    private static final CharSequence f59468c = "funtouch";

    static {
        Covode.recordClassIndex(36717);
    }

    public static boolean a() {
        String a2 = a.a().a("ro.vivo.os.build.display.id");
        if (m.a(a2) || !a2.toLowerCase().contains(f59468c)) {
            return false;
        }
        return true;
    }

    public static boolean b() {
        String str = Build.MANUFACTURER;
        if (!m.a(str)) {
            return str.toLowerCase().contains("oppo");
        }
        return false;
    }
}

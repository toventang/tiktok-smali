package com.ss.android.ugc.aweme.sharer.a;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f124520a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(81774);
    }

    public static boolean a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        try {
            if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}

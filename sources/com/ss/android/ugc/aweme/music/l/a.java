package com.ss.android.ugc.aweme.music.l;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f111558a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(71653);
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo("com.moonvideo.android.resso", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }
}

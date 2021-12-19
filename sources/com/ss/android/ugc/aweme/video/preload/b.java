package com.ss.android.ugc.aweme.video.preload;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import h.f.b.l;
import java.io.File;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f143635a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final String f143636b = "FeedCacheLoader";

    private b() {
    }

    static {
        Covode.recordClassIndex(93980);
    }

    private static String a() {
        File a2 = a(d.a());
        l.b(a2, "");
        String absolutePath = a2.getAbsolutePath();
        l.b(absolutePath, "");
        return absolutePath;
    }

    private static File a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107194b != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107194b = cacheDir;
        return cacheDir;
    }

    public static final boolean b(String str) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            return true;
        }
        return false;
    }

    public static final String a(String str) {
        if (d.a() != null && !TextUtils.isEmpty(str)) {
            String a2 = a();
            if (!TextUtils.isEmpty(a2)) {
                return a2 + File.separator + "feedCache" + File.separator + str;
            }
        }
        return null;
    }
}

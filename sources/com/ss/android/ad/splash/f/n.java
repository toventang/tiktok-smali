package com.ss.android.ad.splash.f;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static ThreadLocal<SimpleDateFormat> f58984a = new ThreadLocal<SimpleDateFormat>() {
        /* class com.ss.android.ad.splash.f.n.AnonymousClass1 */

        static {
            Covode.recordClassIndex(36489);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        }
    };

    static {
        Covode.recordClassIndex(36488);
    }

    public static String a(long j2) {
        SimpleDateFormat simpleDateFormat = f58984a.get();
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(Long.valueOf(j2));
        }
        return String.valueOf(j2);
    }

    public static String a(String str) {
        if (!l.a(str)) {
            try {
                return new String(Base64.decode(str, 0), "utf-8");
            } catch (Throwable unused) {
                g.a("error decoding video url");
            }
        }
        return "";
    }
}

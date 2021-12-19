package com.ss.ttm.player;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import java.util.List;

public class u {

    /* renamed from: a  reason: collision with root package name */
    public static final String f152113a = u.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public static String f152114b = null;

    /* renamed from: c  reason: collision with root package name */
    private static g f152115c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private static boolean f152116d = false;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f152117e = false;

    /* renamed from: f  reason: collision with root package name */
    private static int f152118f = 0;

    static class a implements g {
        static {
            Covode.recordClassIndex(101375);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        @Override // com.ss.ttm.player.g
        public final boolean a(List<String> list) {
            for (String str : list) {
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    Librarian.a(str);
                    m.a(uptimeMillis, str);
                } catch (Throwable th) {
                    u.f152114b = th.getMessage();
                    return false;
                }
            }
            return true;
        }
    }

    static {
        Covode.recordClassIndex(101374);
    }
}

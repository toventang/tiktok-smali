package com.ss.android.ugc.aweme.application;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f66946a = new m();

    /* renamed from: b  reason: collision with root package name */
    private static final String f66947b = "LauncherResPreload";

    private m() {
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66948a = new a();

        static {
            Covode.recordClassIndex(41262);
        }

        a() {
        }

        public final void run() {
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.a("godzilla-sysopt");
                com.ss.android.ugc.aweme.lancet.m.a(uptimeMillis, "godzilla-sysopt");
            } catch (Throwable unused) {
            }
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f66949a = new b();

        static {
            Covode.recordClassIndex(41263);
        }

        b() {
        }

        public final void run() {
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.a("fileprotect");
                com.ss.android.ugc.aweme.lancet.m.a(uptimeMillis, "fileprotect");
            } catch (Throwable unused) {
            }
        }
    }

    static {
        Covode.recordClassIndex(41261);
    }
}

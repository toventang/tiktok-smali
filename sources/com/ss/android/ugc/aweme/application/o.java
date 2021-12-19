package com.ss.android.ugc.aweme.application;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import h.a.n;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    static final List<String> f66956a = n.c("keva", "godzilla-sysopt", "sscronet", "ttffmpeg", "bytertc", "npth", "ttquic", "bytevc1enc", "bytehook", "storagehandlerlib", "fileprotect", "monitorcollector-lib", "stackmanager", "ttcrypto", "vcn", "avmdl", "wcdb", "vctfo", "vcnverify", "avmdlttnet", "metasec_ov", "tensorflowlite_jni", "jato", "tracer");

    /* renamed from: b  reason: collision with root package name */
    public static ConcurrentHashMap<String, Boolean> f66957b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static final o f66958c = new o();

    private o() {
    }

    public static ConcurrentHashMap<String, Boolean> a() {
        return f66957b;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66959a = new a();

        static {
            Covode.recordClassIndex(41267);
        }

        a() {
        }

        public final void run() {
            for (T t : o.f66956a) {
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    Librarian.a(t);
                    m.a(uptimeMillis, t);
                    o.f66957b.put(t, true);
                } catch (Throwable th) {
                    th.getStackTrace();
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(41266);
    }
}
